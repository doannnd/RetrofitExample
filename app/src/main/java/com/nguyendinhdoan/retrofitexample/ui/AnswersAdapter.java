package com.nguyendinhdoan.retrofitexample.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nguyendinhdoan.retrofitexample.data.model.Item;

import java.util.List;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;
    private PostItemListener mItemListener;

    public AnswersAdapter(Context mContext,List<Item> mItems, PostItemListener mItemListener) {
        this.mItems = mItems;
        this.mContext = mContext;
        this.mItemListener = mItemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View postView = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        return new ViewHolder(postView, mItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Item item = mItems.get(i);
        TextView textView = viewHolder.titleTv;
        textView.setText(item.getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView titleTv;
        private PostItemListener mItemListener;

        public ViewHolder(@NonNull View itemView, PostItemListener postItemListener) {
            super(itemView);
            titleTv = itemView.findViewById(android.R.id.text1);

            this.mItemListener = postItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Item item = getItem(getAdapterPosition());
            this.mItemListener.onPostClick(item.getAnswerId());

            notifyDataSetChanged();
        }
    }

    public void updateAnswers(List<Item> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    private Item getItem(int adapterPosition) {
        return mItems.get(adapterPosition);
    }

    public interface PostItemListener {
        void onPostClick(long id);
    }
}
