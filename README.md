# nagoyameshi

## 1. 使用技術

- **言語・フレームワークなど**
  - Java 21
  - Spring Boot 3.4.1
  - Thymeleaf
  - Spring Data JPA
  - Spring Security
  - Spring Boot Starter Mail

- **データベース**
  - MAMP

- **その他ライブラリ**
  - Lombok
  - Stripe Java

- **ビルド・実行環境**
  - Maven
  - Spring Boot Maven Plugin


## 2. 実装機能

- **ユーザー管理機能**
  - ユーザー登録・ログイン・ログアウト
  - パスワードリセット（メール認証）
  - 管理者・一般ユーザーなどロールごとのアクセス制御
  - 集計（総会員数、無料会員数、有料会員数、店舗数、総予約数、月間売上数）

- **非会員（ユーザー）向け機能**
  - 店舗の検索・一覧・詳細の閲覧
  - 新規会員登録
  - 会社概要、利用規約の閲覧

- **無料会員（ユーザー）向け機能**
  - レビューの表示
  - 有料会員プランの登録

- **有料会員（ユーザー）向け機能（月額300円）**
  - 店舗の予約（検索、日付指定、予約確認）の取り消し／変更
  - 予約決済機能（Stripe を利用）
  - お気に入り追加／削除
  - レビューの新規投稿／編集／更新／削除
  - 有料会員プランの解約

- **店舗管理機能（CRUD）**
  - 店舗の新規登録／編集／更新／削除
  - 画像や詳細情報の管理
  - 管理者向け店舗一覧・ページネーション・絞り込み検索

- **検索／フィルタ機能**
  - キーワード検索（店舗名や住所など）
  - 並べ替え（料金や登録日など）
  - ページネーション

- **メール通知機能**
  - Mailtrap-Email
  - 新規会員登録時の確認メール送信
  - パスワードリセット用メール送信

- **管理者向け機能**
  - 会員一覧・詳細
  - 店舗一覧・詳細／新規登録／編集／更新／削除
  - カテゴリ一覧・詳細／新規登録／編集／更新／削除
  - 会社概要、利用規約・詳細／編集／更新

- **セキュリティ機能**
  - Spring Security を用いた認証・認可
  - ロール別のアクセス制限
  - フォーム入力時のバリデーション


## 3. Webアプリ
- **URL**
  - https://springboot-tabelog-094ad39eb139.herokuapp.com/
  - 管理者用のメールアドレス：hanako.samurai@example.com
  - 無料会員用のメールアドレス：taro.samurai@example.com
  - 有料会員用のメールアドレス：jiro.samurai@example.com
  - 共通のパスワード：password

- **要件定義書**
  - https://docs.google.com/document/d/10GpxSOC7TrZSMqXxjmzvBCPtuTRFLs8_pJMANpr74s0/edit?usp=drive_link

- **アプリのレビュー評価**
  - https://docs.google.com/spreadsheets/d/1G4vR_0WXvkTdI9ssfmdN-iBmYYcsVZ6OUD5cat7KZN8/edit?usp=drive_link
