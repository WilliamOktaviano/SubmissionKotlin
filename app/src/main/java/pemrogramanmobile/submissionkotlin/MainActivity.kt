package pemrogramanmobile.submissionkotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<TempatWisata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_objekwisata.setHasFixedSize(true)
        list.addAll(TempatWisataDetail.getListData())
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(about: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, about)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> startActivity(Intent(this, AboutMe::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rv_objekwisata.layoutManager = LinearLayoutManager(this)
        val listObjekWisataAdapter = ListObjekWisataAdapter(list)
        rv_objekwisata.adapter = listObjekWisataAdapter

        listObjekWisataAdapter.setOnItemClickCallback(object :
            ListObjekWisataAdapter.OnItemClickCallback {
            override fun onItemClicked(data: TempatWisata) {
                showDetailTempatWisata(data)
            }
        })
    }

    private fun showDetailTempatWisata(tempatwisata: TempatWisata) {
        val i = Intent(this, DetailActivity::class.java)
        i.putExtra("TempatWisata", tempatwisata)
        startActivity(i)
    }
}
