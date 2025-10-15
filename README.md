Proje Adı: SimpleWebServer
Dil: Java
Port: 1989

🚀 Proje Açıklaması

Bu proje, Java kullanılarak geliştirilmiş basit bir web sunucusudur. Tarayıcı üzerinden localhost:1989 adresine bağlanıldığında, kullanıcıya HTML formatında kişisel bir bilgi sayfası gösterilir.

⚙️ Çalışma Mantığı

ServerSocket nesnesi 1989 portunda dinlemeye başlar.

Tarayıcıdan gelen bağlantı isteği kabul edilir.

İstek satırları BufferedReader ile okunur.

Sunucu, PrintWriter aracılığıyla istemciye bir HTTP cevabı (200 OK) gönderir.

HTML içeriğinde öğrenci bilgileri ve kısa tanıtım metni bulunur.

🧠 Kullanılan Nesneler

ServerSocket: Sunucu bağlantılarını dinler.

Socket: İstemci ile veri alışverişini sağlar.

PrintWriter: Sunucudan istemciye veri (HTTP cevabı) gönderir.

BufferedReader: İstemciden gelen isteği okur.

🌐 Çalıştırma

Kodu derleyin:

javac SimpleWebServer.java


Sunucuyu başlatın:

java SimpleWebServer


Tarayıcıya şu adresi yazın:

http://localhost:1989

👤 Yazar

Azo İsmail – 5230505081
Kırklareli Üniversitesi, Yazılım Mühendisliği
