# Simple Web Server

Bu proje, **Java** kullanılarak geliştirilen basit bir HTTP web sunucusudur. Sunucu, **1989** numaralı portu dinleyerek gelen HTTP isteklerine HTML içeriği ile yanıt verir.

## 🚀 Çalıştırma Adımları

### 1. **Projeyi Derleme**
Aşağıdaki komut ile Java dosyasını derleyin:
```sh
javac SimpleWebServer.java
```

### 2. **Sunucuyu Başlatma**
Derleme tamamlandıktan sonra aşağıdaki komutu kullanarak sunucuyu başlatın:
```sh
java SimpleWebServer
```
Bu komut, sunucunun **1989** portunu dinlemesini sağlar.

### 3. **Web Tarayıcısından Erişim**
Sunucu çalıştıktan sonra tarayıcınızı açarak aşağıdaki adresi ziyaret edin:
```
http://localhost:1989
```
Sayfada aşağıdaki bilgiler görüntülenecektir:
- **Ad:** Azo İsmail
- **Öğrenci Numarası:** 5230505081
- **Hakkımda:** Kırklareli Üniversitesi'nde Yazılım Mühendisliği 2. sınıf öğrencisi.

## 📌 Özellikler
- **Basit HTTP Sunucusu:** Gelen istekleri kabul eder ve HTML yanıt döndürür.
- **Statik HTML Sayfası:** Tarayıcıdan açılabilir bir sayfa içerir.
- **TCP Bağlantısı Kullanımı:** `ServerSocket` ile bağlantı kurar.

## 🛠 Gereksinimler
- **Java 8+** yüklü olmalıdır.
- **Komut satırı (CMD, Terminal, PowerShell)** üzerinden çalıştırılabilir.

## 📄 Lisans
Bu proje **MIT** lisansı altındadır.

