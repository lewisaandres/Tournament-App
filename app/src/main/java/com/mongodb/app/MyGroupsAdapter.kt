package com.mongodb.app
import android.annotation.SuppressLint
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import io.realm.RealmResults
import org.bson.types.ObjectId

internal class MyGroupsAdapter(data: RealmResults<Group>) : RealmRecyclerViewAdapter<Group, MyGroupsAdapter.GroupViewHolder?>(data, true) {

    internal inner class GroupViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var id: ObjectId? = null
        var gname: TextView = view.findViewById(R.id.group_name)
        var members: TextView = view.findViewById(R.id.memberNames)
        var glogo: ImageView = view.findViewById(R.id.groupLogo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val groupView = LayoutInflater.from(parent.context).inflate(R.layout.group_row, parent, false)
        return GroupViewHolder(groupView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val group: Group = getItem(position) ?: return
        holder.id = group._id  // changed id to _id
        holder.gname.text = group.name
        holder.members.text = group.member1 + "\n" + group.member2 + "\n" + group.member3 + "\n" + group.member4
        holder.glogo.setImageResource(R.drawable.logo)

    }
}
