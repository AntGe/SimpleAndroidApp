package co.centroida.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/*
* Created by Antonio on 6/15/2017
* Copyright (c) 2017 Centroida. All rights reserved.
*/
public class BooksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Book> mBooks;

    public BooksAdapter() {
        mBooks = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_book_layout, parent, false);
        return new BooksAdapter.BookViewHolder(view);

    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((BookViewHolder)holder).bindBookViewHolder(mBooks.get(position));
    }
    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public void setBooksList(List<Book> books){
        this.mBooks = books;
        notifyDataSetChanged();
    }

    private class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView bookCover;
        TextView bookTitle;

        public BookViewHolder(View view) {
            super(view);
            itemView.setOnClickListener(this);
            bookCover = (ImageView) view.findViewById(R.id.row_book_image);
            bookTitle = (TextView) view.findViewById(R.id.row_book_title);
        }

        protected void bindBookViewHolder(Book book){
            bookTitle.setText(book.getName());
            Picasso.with(itemView.getContext()).load(book.getPictureURL()).into(bookCover);
        }


        @Override
        public void onClick(View v) {

        }
    }

}
