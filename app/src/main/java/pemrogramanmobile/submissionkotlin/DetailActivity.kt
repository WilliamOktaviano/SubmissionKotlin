package pemrogramanmobile.submissionkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var imgObjekWisata: ImageView = findViewById(R.id.img_objek_wisata)
        var tvNamaObjek: TextView = findViewById(R.id.tv_objek_wisata)
        var tvDetailObjek: TextView = findViewById(R.id.tv_objek_wisata_detail)

        supportActionBar?.title = "Wisata Jabodetabek"

        val i: Intent = intent
        var tempatWisata: TempatWisata = i.getParcelableExtra("TempatWisata")

        Glide.with(this).load(tempatWisata.detailphoto).into(imgObjekWisata)
        tvNamaObjek.text = tempatWisata.objekwisata_name
        tvDetailObjek.text = tempatWisata.lokasi
    }
}