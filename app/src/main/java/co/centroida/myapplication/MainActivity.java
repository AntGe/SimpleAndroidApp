package co.centroida.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BooksAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.books_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        mAdapter = new BooksAdapter();
        recyclerView.setAdapter(mAdapter);

        RetrofitServices services = new RetrofitServices();
        services.getBooks(new RetrofitServices.OnBooksReceivedListeer() {
            @Override
            public void onBooksReceived(List<Book> books) {
                mAdapter.setBooksList(books);
            }
        });
    }
}
