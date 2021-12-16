package info.atiar.galaryapp.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import info.atiar.galaryapp.R
import info.atiar.galaryapp.model.PhotoModel

class AlphabetAdapter(var context: Context, var arrayList: ArrayList<PhotoModel>) :
        RecyclerView.Adapter<AlphabetAdapter.ItemHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
            val viewHolder = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_grid_view_items, parent, false)
            return ItemHolder(viewHolder)
        }

        override fun getItemCount(): Int {
            return arrayList.size
        }

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {

            val charItem: PhotoModel = arrayList.get(position)

            holder.icons.setImageResource(charItem.icons!!)
            holder.titles.text = charItem.alpha

            holder.titles.setOnClickListener {
                Toast.makeText(context, charItem.alpha, Toast.LENGTH_LONG).show()
            }

        }

        class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
            var titles = itemView.findViewById<TextView>(R.id.title_text_view)

        }

}