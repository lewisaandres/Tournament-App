package com.mongodb.app
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import org.bson.types.ObjectId

internal class MyRatingsAdapter(data: OrderedRealmCollection<Rating>) : RealmRecyclerViewAdapter<Rating, MyRatingsAdapter.RatingViewHolder?>(data, true) {

    internal inner class RatingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var id: ObjectId? = null
        var name: TextView = view.findViewById(R.id.ratingDescription)
        var stars: RatingBar = view.findViewById(R.id.ratingBar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatingViewHolder {
        val ratingView = LayoutInflater.from(parent.context).inflate(R.layout.rating_item, parent, false)


        return RatingViewHolder(ratingView)
    }

    override fun onBindViewHolder(holder: RatingViewHolder, position: Int) {
        val organizerRating: Rating = getItem(position) ?: return
        holder.id = organizerRating._id  // changed id to _id
        holder.name.text = organizerRating.description
        holder.stars.rating = organizerRating.rating

    }
}
