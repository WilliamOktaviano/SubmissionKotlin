package pemrogramanmobile.submissionkotlin

import java.util.*

class TempatWisataDetail {
    companion object {
        private var data = arrayOf(
            arrayOf(
                "Wisata Alam Danau Quarry",
                "Wisata alam satu ini merupakan wisata alam yang berada di wilayah Bogor tepatnya pada kawasan Tegalega, kampung sawah kabupaten Bogor. Pada kawasan danau Anda akan disuguhi pemandangan yang indah dan asri ditambah dengan kejernian serta ketenangan air yang membuat hati dan perasaan ikut relaxs ketika menikmatinya. Yang membuat tempat ini lebih menarik lagi, di sekitar danau banyak sekali spot-spot yang bisa digunakan untuk berfoto bersama sahabat ataupun keluarga dengan latar belakang danau dan tebing yang indah. Tiket masuk ke tempat ini pun cukup terjangkau, Anda cukup membayar 2.000 rupiah saja sebagai tiket masuknya.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/danau-quarrty-bogor.jpg"
            ),
            arrayOf(
                "Wisata Pulau Tidung",
                "Bagi Anda yang tinggal di wilayah Jakarta dan ingin liburan ke pulau yang asri, Anda tidak perlu jauh-jauh untuk terbang ke provinsi lain karena di provinsi DKI jakarta sendiri ada tempatnya yaitu pulau Tidung. Pulau Tidung merupakan pulau yang berada di kawasan kepulauan seribu. Selain merupakan pulau yang eksotis, di pulau ini Anda bisa menikmati sensasi permainan air yang memacu adrenalin, seperti cano, banana boat, water spot, hingga jetsky. Biaya untuk menuju pulau ini tergolong cukup murah, yaitu Anda cukup membayar 20.000 rupiah saja untuk transportasi kapal. Jika Anda ingin menginap Anda cukup menyiapkan uang sekitar 250 ribu rupiah hingga 400 ribu rupiah untuk satu penginapan yang bisa diisi 4 hingga 6 orang.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/wisata-pulau-tidung.jpg"
            ),
            arrayOf(
                "Air Terjun Leuwi Hajo",
                "Ari terjun Leuwi Hajo terletak di wilayah Sentul, kabupaten Bogor. Debit air yang ada di air terjun ini tergolong tidak terlalu deras, namun mempunyai keindahan tersendiri di dalamnya. yang membuat tempat wisata alam ini unik yaitu, tempat ini kental dengan mitos yang dipercayai masyarakat sekitar, dimana mitos tersebut adalah air terjun ini dipercaya sebagai tempat bersemayamnya Nyi Blorong yang sangat melegenda. Walau kental dengan nuansa mitos, tempat ini malah dikunjungi banyak orang. Tiket masuk ke air terjun ini berkisar 15.000 rupiah saja perorangnya.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/air-terjun-leuwi-hejo-bogor.jpg"
            ),
            arrayOf(
                "Wisata Alam Angke Kapuk",
                "Tempat wisata ini berada di wilayah Jakarta Utara, tepatnya pada kawasan pantai Indah Kapuk. Di tempat ini Anda bisa menikmati nuansa hutan bakau yang teduh dan menarik. Tempat ini sangat cocok bagi Anda yang ingin bersantai atupun butuh ketenangan dari hiruk pikuknya ibukota. Selain mempunyai keindahan, wisata alam Angke Kapuk mempunyai spot foto yang banyak. Biaya masuk ke tempat ini sebenar 25.000 rupiah perorangnya. Belum termasuk fasilitas lainnya.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/taman-wisata-alam-angke-kapuk.jpg"
            ),
            arrayOf(
                "Kebun Raya Bogor",
                "Berwisata dan belajar merupakan hal yang penting sebaiknya Anda dapatkan ketika membawa anak Anda untuk menikmati liburannya. Salah satu tempat yang bisa memberikan nilai edukasi alam yaitu berkunjung ke Kebun Raya Bogor. Tempat wisata alam satu ini memberikan Anda pelajaran tentang berbagai macam jenis fauna yang ada di Indonesia. Selain itu di Kebun Raya Bogor juga terdapat museum, yaitu museum Zoologi. Tiket masuk wisatawan lokal di Kebun Raya Bogor ini sebesar 15.000 rupiah dan 25.000 rupiah untuk wisatawan asing.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/kebun-raya-bogor.jpg"
            ),
            arrayOf(
                "Taman wisata Wiladatika",
                "Taman wisata Wiladatika merupakan taman bunga yang berada di kawasan Cibubur, kabupaten Depok. Selain mempunyai berbagai jenis bunga, ditempat ini juga terdapat berbagai pohon tua yang rindang dan nuansa yang sejuk, membuat kehangatan bersama keluarga menjadi lebih nikmat. Di taman ini juga terdapat berbagai fasilitas penunjang untuk keluarga, seperti kereta api mini untuk anak, flying fox, gazebo dan lain-lain. Tiket masuk ke taman bunga Wiladatika yaitu 4.000 rupiah.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/taman-wisata-wiladatika.jpg"
            ),
            arrayOf(
                "Taman Safari Indonesia",
                "Taman safari Indonesia merupakan salah satu wisata alam yang sudah terkenal, terlatak di kawasan Cisarua Bogor . Disini Anda bisa milihat berbagai jenis flora dan fauna, mulai yang berasal dari Indonesia ataupun flora fauna yang berasal dari luar Indonesia. Selain bisa melihat flora dan fauna, tempat ini juga mempunyai pemandangan alam yang sangat Indah, dan mempunyai hawa yang sejuk. Tiket masuk ke tempat ini yaitu 150.00 perorang dewasa dan 140.000 rupiah untuk anak-anak. Uniknya lagi, jika Anda tidak sempat untuk datang di siang hari, Anda juga bisa menikmati dan masuk ke Taman Safari Indonesia pada malam hari, dengan harga tiket yang sama.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/taman-safari-indonesia-1.jpg"
            ),
            arrayOf(
                "Bendungan Pintu Air Sepuluh",
                "Bagi Anda yang ingin menikmati desiran suara aliran sungai, bendungan ini tempatnya. Tempat ini berada pada kawasan Karawaci Tangerang. Ketika Anda datang kesini Anda bisa mendapatkan ketenangan hati dan pikiran. Tidak hanya itu, tempat ini menyuguhkan pemandangan sungai yang indah serta mempunyai nilai historis yang tinggi, karena dibuat pada tahun 1927 pada masa penjajahan Belanda.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/bendung-pintu-air-10.jpg"
            ),
            arrayOf(
                "Wisata Rumah Pohon Bekasi",
                "Bukan hanya sebagai kota dengan banyak pabrik, Bekasi juga mempunyai banyak wisata dengan nuansa alam yang menarik, salah satunya rumah pohon Bekasi. Suasana yang ada di kawasan wisata ini cukup sejuk dengan pemandangan hijau dari pohon-pohon besar yang ada di sekitarnya. Selain ada rumah pohon, disini juga kamu bisa berfoto dengan spot yang lucu dan menarik. Terdapat juga wahana permainan flying fox ataupun wall climbing. Untuk harga tiket masuknya disediakan harga tiket paketan sebesar 70.000 rupiah perorang dengan fasilitas permainan flying fox, climbing wall, jembatan gantung, kolam tangkap serta snack, dan minuman.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/wisata-rumah-pohon-bekasi.jpg"
            ),
            arrayOf(
                "Kampung 99 Pepohonan Depok",
                "Kampung 99 pepohonan Depok merupakan salah satu tempat wisata alam yang wajib dikunjungi jika datang ke Depok. Wisata alam ini dibuat dengan konsep rekreasi keluarga dengan menyatukannya dengan alam. Disini Anda bisa menemukan beberapa satwa yang dilepas seperti rusa, sapi, kambing etawa, dan berbagai jenis burung. Agar bisa mendapatkan rekreasi dan manfaat dengan maximal disarankan Anda untuk ikut program natural outbond ketika berkunjung terutama bagi Anda yang membawa putra dan putrinya kesini. Disini nantinya anak-anak bisa diajarkan tentang bagaimana menjaga alam yang baik, serta pengenalan dengan kegiatan pertanian dan perternakan. untuk harga tiket masuk ke tempat ini gratis, namun untuk setiap aktivitas dikenakan biaya sebesar 25.00 rupiah perorang dan apabila kamu memilih 5 paket kegiatan kamu cukup membayar 125.000 plus mendapatkan makan siang.",
                "https://www.gotravelly.com/blog/wp-content/uploads/2018/04/kampung-99-pepohonan-depok.jpg"
            )
        )

        fun getListData(): ArrayList<TempatWisata> {
            val list = ArrayList<TempatWisata>()
            for (aData in data) {
                val TempatWisata = TempatWisata()
                TempatWisata.objekwisata_name = aData[0]
                TempatWisata.lokasi = aData[1]
                TempatWisata.detailphoto = aData[2]
                list.add(TempatWisata)
            }
            return list
        }
    }
}