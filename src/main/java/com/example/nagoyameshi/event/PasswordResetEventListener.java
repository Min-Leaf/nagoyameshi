package com.example.nagoyameshi.event;

import java.util.UUID;

import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.example.nagoyameshi.entity.User;
import com.example.nagoyameshi.service.VerificationTokenService;

// パスワード再設定の追加
@Component
public class PasswordResetEventListener {
	private final VerificationTokenService verificationTokenService;
	private final JavaMailSender javaMailSender;
	
	public PasswordResetEventListener(VerificationTokenService verificationTokenService, JavaMailSender mailSender) {
		this.verificationTokenService = verificationTokenService;
		this.javaMailSender = mailSender;
	}
		
	@EventListener
	private void onPasswordResetEvent(PasswordResetEvent passwordResetEvent) {
	    User user = passwordResetEvent.getUser();
	    String token = UUID.randomUUID().toString();

	    // トークンを作成または更新
	    verificationTokenService.createOrUpdateVerificationToken(user, token);

	    // メール送信処理
	    String recipientAddress = user.getEmail();
	    String subject = "パスワードリセット";
	    String confirmationUrl = passwordResetEvent.getRequestUrl() + "/verify?token=" + token;
	    String message = "以下のリンクをクリックして新しいパスワードを入力してください。";

	    SimpleMailMessage mailMessage = new SimpleMailMessage();
	    mailMessage.setTo(recipientAddress);
	    mailMessage.setSubject(subject);
	    mailMessage.setText(message + "\n" + confirmationUrl);
	    javaMailSender.send(mailMessage);
	}
	
}