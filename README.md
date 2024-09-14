## LoginMate

### Türkçe

LoginMate, basit bir kullanıcı kayıt ve giriş sistemi oluşturmak isteyen Java geliştiricileri için örnek bir JavaFX projesidir. 
**Özellikler:**

* Kullanıcı Kaydı: Yeni kullanıcıların veritabanına kayıt olmasını sağlar.
* Kullanıcı Girişi: Kayıtlı kullanıcıların giriş yapmasını sağlar.
* Şifreleme: Kullanıcı şifreleri, güvenlik açısından BCrypt kütüphanesi kullanılarak hash edilir.
* Veritabanı Bağlantısı: MySQL veritabanıyla etkileşim kurar.

**Kullanım:**

1. Proje dosyalarını indirin.
2. Proje dizininde `DatabaseManager.java` dosyasındaki veritabanı bağlantı bilgilerini kendi MySQL veritabanınızın bilgilerine göre ayarlayın.
3. Projenizi çalıştırmak için IDE'nizdeki "Run" komutunu kullanın.
4. Giriş ekranında "Sign Up" butonuna tıklayarak yeni bir kullanıcı hesabı oluşturabilir veya "Login" butonuna tıklayarak mevcut bir kullanıcı hesabı ile giriş yapabilirsiniz.

**Not:**

* Proje, temel bir örnek proje olarak tasarlanmıştır. Gerçek dünya uygulamalarında daha gelişmiş güvenlik önlemleri ve özelliklere ihtiyaç duyulabilir.
* Projede kullanılan MySQL veritabanı bilgileri örnek olarak verilmiştir. Kendi veritabanınızın bilgilerini kullanmanız gerekir.


### English

## LoginMate

### English

LoginMate is a sample JavaFX project for Java developers who want to build a simple user registration and login system. 

**Features:**

* User Registration: Allows new users to register in the database.
* User Login: Allows registered users to log in.
* Encryption: User passwords are hashed using the BCrypt library for security purposes.
* Database Connection: Interacts with a MySQL database.

**Usage:**

1. Download the project files.
2. Set the database connection information in the `DatabaseManager.java` file within the project directory to match your own MySQL database.
3. Use the "Run" command in your IDE to run the project.
4. On the login screen, you can click the "Sign Up" button to create a new user account or click the "Login" button to log in with an existing user account.

**Note:**

* The project is designed as a basic example project. Real-world applications may require more advanced security measures and features.
* The MySQL database information used in the project is provided as an example. You need to use your own database information.
