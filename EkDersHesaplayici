<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ek Ders Ücreti Hesaplayıcı</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
        }
        .container {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #007bff;
            color: white;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h3>EK DERS ÜCRETİ HESAPLAYICI</h3>
    <form method="POST">
        <label for="unvan">Ünvan</label>
        <select name="unvan" id="unvan">
            <option value="Prof. Dr.">Prof. Dr.</option>
            <option value="Doç. Dr.">Doç. Dr.</option>
            <option value="Dr. Öğr. Üyesi">Dr. Öğr. Üyesi</option>
            <option value="Öğretim Görevlisi">Öğretim Görevlisi</option>
            <option value="Araştırma Görevlisi">Araştırma Görevlisi</option>
        </select>

        <label for="teorik">Teorik:</label>
        <input type="number" name="teorik" id="teorik" placeholder="Teorik Ders Saati Giriniz" required>

        <label for="uygulama">Uygulama:</label>
        <input type="number" name="uygulama" id="uygulama" placeholder="Uygulama Ders Saati Giriniz" required>

        <label for="aylik_katsayi">Aylık Katsayı:</label>
        <input type="text" name="aylik_katsayi" id="aylik_katsayi" value="0.05592" readonly>

        <label for="ek_ucret">Alacağınız Ek Ücret:</label>
        <input type="text" id="ek_ucret" name="ek_ucret" readonly>

        <button type="submit">Hesapla</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $unvan = $_POST["unvan"];
        $teorik = floatval($_POST["teorik"]);
        $uygulama = floatval($_POST["uygulama"]);
        $aylik_katsayi = 0.05592;

        // Ünvan katsayıları
        $unvan_katsayilari = [
            "Prof. Dr." => 300,
            "Doç. Dr." => 250,
            "Dr. Öğr. Üyesi" => 200,
            "Öğretim Görevlisi" => 150,
            "Araştırma Görevlisi" => 100
        ];

        // Katsayıyı al
        $unvan_katsayi = isset($unvan_katsayilari[$unvan]) ? $unvan_katsayilari[$unvan] : 0;

        // Şartlara uygun saatleri belirle
        $teorik = min($teorik, 20);
        $uygulama = min($uygulama, 10);

        // Ek ders ücretini hesapla
        $ek_ucret = ($teorik + $uygulama) * $unvan_katsayi * $aylik_katsayi;

        // Sonucu input alanına yazdır
        echo '<script>document.getElementById("ek_ucret").value = "' . number_format($ek_ucret, 2, ',', '.') . ' TL";</script>';
    }
    ?>
</div>

</body>
</html>
