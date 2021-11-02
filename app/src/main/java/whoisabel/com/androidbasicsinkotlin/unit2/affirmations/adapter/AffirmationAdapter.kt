package whoisabel.com.androidbasicsinkotlin.unit2.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.unit2.affirmations.model.Affirmation

class AffirmationAdapter(private val context: Context, private val data: List<Affirmation>) :
    RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_affirmation, parent, false)
        return AffirmationViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class AffirmationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_item_title)
        val imageView: ImageView = view.findViewById(R.id.iv_item_image)

    }

}