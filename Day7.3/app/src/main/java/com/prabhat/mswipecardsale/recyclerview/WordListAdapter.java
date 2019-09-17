package com.prabhat.mswipecardsale.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {

        private final LinkedList<String> mWordList;
        private LayoutInflater inflater;


        public WordListAdapter(Context context,LinkedList<String> mWord){
            inflater=LayoutInflater.from(context);
            this.mWordList=mWord;
        }
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View mViewItem=inflater.inflate(R.layout.wordlist_item,viewGroup,false);
        return new WordViewHolder(mViewItem,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder wordViewHolder, int i) {
            String mCurrent=mWordList.get(i);
            wordViewHolder.wordItemViews.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }


    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordItemViews;
        final WordListAdapter mAdapter;


        public WordViewHolder(@NonNull View itemView,WordListAdapter adapter) {
            super(itemView);
            wordItemViews=itemView.findViewById(R.id.word);
            this.mAdapter=adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.

            int mPosition=getLayoutPosition();

            // Use that to access the affected item in mWordList.

            String element=mWordList.get(mPosition);

            // Change the word in the mWordList.

            mWordList.set(mPosition ,"CLicked !"+element);

            // Notify the adapter, that the data has changed so it can
// update the RecyclerView to display the data.

            mAdapter.notifyDataSetChanged();
        }
    }
}
