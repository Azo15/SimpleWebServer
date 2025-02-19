# Ek Ders Ücreti Hesaplayıcı

Bu proje, akademik personelin ek ders ücretlerini hesaplamasını sağlayan basit bir PHP tabanlı web uygulamasıdır. Kullanıcıdan alınan ders saati ve unvan bilgilerine göre ek ders ücreti hesaplanır ve ekranda gösterilir.

## Özellikler
- Kullanıcıdan unvan, teorik ve uygulama ders saatlerini alır.
- Hesaplamada kullanılan aylık katsayı sabit olarak belirlenmiştir.
- Unvana bağlı olarak farklı katsayılar uygulanır.
- Maksimum ders saatleri teorik için 20, uygulama için 10 saat olarak sınırlandırılmıştır.
- Hesaplanan ek ders ücreti kullanıcıya gösterilir.

## Kullanılan Teknolojiler
- **HTML** - Sayfanın temel yapısını oluşturur.
- **CSS** - Sayfanın stilini belirler.
- **PHP** - Form verilerini işler ve ek ders ücretini hesaplar.

## Kurulum
1. Bu projeyi yerel makinenize veya bir sunucuya kopyalayın.
2. PHP'nin çalıştığından emin olun.
3. `index.php` dosyasını bir tarayıcıda açarak kullanmaya başlayabilirsiniz.

## Kullanım
1. Kullanıcı formu doldurur:
   - Ünvan seçilir.
   - Teorik ve uygulama ders saatleri girilir.
2. **Hesapla** butonuna basılır.
3. PHP tarafından hesaplanan ek ders ücreti ekranda gösterilir.

## Hesaplama Yöntemi
Ek ders ücreti aşağıdaki formüle göre hesaplanmaktadır:

```
Ek Ders Ücreti = (Teorik Ders Saati + Uygulama Ders Saati) × Ünvan Katsayısı × Aylık Katsayı
```

- **Aylık Katsayı**: 0.05592
- **Ünvan Katsayıları**:
  - Prof. Dr.: 300
  - Doç. Dr.: 250
  - Dr. Öğr. Üyesi: 200
  - Öğretim Görevlisi: 150
  - Araştırma Görevlisi: 100

## Örnek Kullanım
Eğer bir "Doç. Dr." 15 saat teorik ve 5 saat uygulama dersi verdiyse hesaplama şu şekilde olur:

```
(15 + 5) × 250 × 0.05592 = 279.60 TL
```

## Lisans
Bu proje açık kaynaklıdır ve kişisel veya eğitim amaçlı kullanım için serbesttir.

