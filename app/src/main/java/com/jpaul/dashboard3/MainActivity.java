package com.jpaul.dashboard3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jpaul.model.Category;
import com.jpaul.ui.CategoryAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Category> categories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadCategory();
        createView();
    }

    public void createView(){
        recyclerView = findViewById(R.id.mainRecycleView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this,this.categories,getLayoutInflater());
        recyclerView.setAdapter(categoryAdapter);
    }

    public void loadCategory(){
        categories.add(new Category("Products","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("POS","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Expense","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Sale History","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Inventory","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Customers","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Suppliers","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Setting","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
        categories.add(new Category("Category","List products","https://cdn2.iconfinder.com/data/icons/online-shopping-11/100/13-128.png"));
    }
}