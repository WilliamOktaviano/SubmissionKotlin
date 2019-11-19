package pemrogramanmobile.submissionkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListObjekWisataAdapter(private val listObjekWisata: ArrayList<TempatWisata>) :
    RecyclerView.Adapter<ListObjekWisataAdapter.ListViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_objekwisata, parent, false)
        return ListViewHolder(view)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun getItemCount() = listObjekWisata.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tempatWisata: TempatWisata = listObjekWisata[position]
        Glide.with(holder.itemView.context)
            .load(tempatWisata.detailphoto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = tempatWisata.objekwisata_name
        holder.tvFrom.text = tempatWisata.lokasi

        holder.btnDetail.setOnClickListener {
            onItemClickCallback?.onItemClicked(listObjekWisata[holder.adapterPosition])
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: TempatWisata)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)
    }
}