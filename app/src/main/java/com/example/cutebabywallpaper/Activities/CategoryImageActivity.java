package com.example.cutebabywallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import com.example.cutebabywallpaper.Adapters.GridAdapter;
import com.example.cutebabywallpaper.Adapters.UserClass;
import com.example.cutebabywallpaper.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryImageActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserClass userClass;
    private List<UserClass> cute_babyList;
    private List<UserClass> cute_baby_girlList;
    private List<UserClass> cutest_babyList;
    private List<UserClass> photographyList;
    private List<UserClass> kidsList;
    private List<UserClass> cute_stylish_boyList;
    private NetworkInfo info;
    private GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_image);
        recyclerView = findViewById(R.id.recyclerView);

        cute_babyList = new ArrayList<>();
        cute_baby_girlList = new ArrayList<>();
        cutest_babyList = new ArrayList<>();
        photographyList = new ArrayList<>();
        kidsList = new ArrayList<>();
        cute_stylish_boyList = new ArrayList<>();


        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {
            Toast.makeText(CategoryImageActivity.this, "Loading..", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();
        }

        //cute_babyList add data
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2015/05/20/14/23/cooking-775503_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2014/09/23/06/04/brothers-457237_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2016/04/14/08/40/newborn-1328454_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2016/11/19/14/28/people-1839564_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2014/07/11/22/05/baby-390555_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2017/11/23/07/47/babe-2972221_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2012/03/01/01/42/baby-20339_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2015/05/18/16/21/baby-772439_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2015/09/09/20/23/baby-933097_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2016/05/31/11/26/baby-1426651_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2017/11/10/08/08/childhood-2935722_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2017/11/06/15/49/baby-2923997_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2015/05/04/10/44/baby-752188_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2016/08/29/17/57/twins-1628843_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2016/11/19/14/28/baby-1839565_960_720.jpg"));
        cute_babyList.add(new UserClass("cute_baby","https://cdn.pixabay.com/photo/2014/04/02/08/42/baby-303068_960_720.jpg"));


        //cute_baby_girlList add data
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/789786/pexels-photo-789786.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/3845495/pexels-photo-3845495.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/3662930/pexels-photo-3662930.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/36029/aroni-arsa-children-little.jpg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/459976/pexels-photo-459976.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/265987/pexels-photo-265987.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/421879/pexels-photo-421879.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/459957/pexels-photo-459957.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/4205490/pexels-photo-4205490.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/159767/baby-cute-moe-brilliant-159767.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/1166473/pexels-photo-1166473.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/36039/baby-twins-brother-and-sister-one-hundred-days.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/2869318/pexels-photo-2869318.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/1704016/pexels-photo-1704016.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_baby_girlList.add(new UserClass("cute_baby_girl","https://images.pexels.com/photos/4095841/pexels-photo-4095841.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        //cutest_babyList add data
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/50692/brothers-family-siblings-boys-50692.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/1973270/pexels-photo-1973270.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/590471/pexels-photo-590471.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/3933250/pexels-photo-3933250.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/34763/baby-sleeping-baby-baby-girl.jpg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/266004/pexels-photo-266004.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/1442005/pexels-photo-1442005.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/161709/newborn-baby-feet-basket-161709.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/3663037/pexels-photo-3663037.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/3995919/pexels-photo-3995919.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/713959/pexels-photo-713959.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cutest_babyList.add(new UserClass("cutest_baby","https://images.pexels.com/photos/2797865/pexels-photo-2797865.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        //photographyList add data
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/598917/pexels-photo-598917.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/3369508/pexels-photo-3369508.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/2249601/pexels-photo-2249601.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/556669/pexels-photo-556669.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/556666/pexels-photo-556666.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/306763/pexels-photo-306763.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/462030/pexels-photo-462030.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/258189/pexels-photo-258189.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/561463/pexels-photo-561463.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/982673/pexels-photo-982673.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/290538/pexels-photo-290538.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        photographyList.add(new UserClass("photography","https://images.pexels.com/photos/36489/water-splash-photography-lemon.jpg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        //kidsList add data
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/1212805/pexels-photo-1212805.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/1001914/pexels-photo-1001914.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/3661388/pexels-photo-3661388.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/3662845/pexels-photo-3662845.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/3771640/pexels-photo-3771640.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/1190208/pexels-photo-1190208.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/786220/pexels-photo-786220.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/1815257/pexels-photo-1815257.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/4055337/pexels-photo-4055337.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/5088191/pexels-photo-5088191.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/3401403/pexels-photo-3401403.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/1720186/pexels-photo-1720186.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/4019759/pexels-photo-4019759.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/3874366/pexels-photo-3874366.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        kidsList.add(new UserClass("kids","https://images.pexels.com/photos/4172988/pexels-photo-4172988.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        //cute_stylish_boyList add data
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1619697/pexels-photo-1619697.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1619730/pexels-photo-1619730.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1073083/pexels-photo-1073083.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/35537/child-children-girl-happy.jpg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1619815/pexels-photo-1619815.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1619705/pexels-photo-1619705.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1697849/pexels-photo-1697849.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/1374507/pexels-photo-1374507.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/838879/pexels-photo-838879.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/3619972/pexels-photo-3619972.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/35666/cooking-baby-only-kitchen.jpg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/4048011/pexels-photo-4048011.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/4047786/pexels-photo-4047786.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        cute_stylish_boyList.add(new UserClass("cute_stylish_boy","https://images.pexels.com/photos/3771511/pexels-photo-3771511.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));


        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        gridAdapter = new GridAdapter(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("EXTRA_NAME");

            if (value.equals("cute_baby")){
                getCuteBaby();
            }
            if (value.equals("cute_baby_girl")){
                getCuteBabyGirl();
            }
            if (value.equals("cutest_baby")){
                getCutestBabay();
            }
            if (value.equals("photography")){
                getdPhotography();
            }
            if (value.equals("kids")){
                getKids();
            }
            if (value.equals("cute_stylish_boy")){
                getCuteStyleBoy();
            }

        }
    }

    private void getCuteBaby() {
        gridAdapter.setListImage(cute_babyList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCuteBabyGirl() {
        gridAdapter.setListImage(cute_baby_girlList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCutestBabay() {
        gridAdapter.setListImage(cutest_babyList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getdPhotography() {
        gridAdapter.setListImage(photographyList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getKids() {
        gridAdapter.setListImage(kidsList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCuteStyleBoy() {
        gridAdapter.setListImage(cute_stylish_boyList);
        recyclerView.setAdapter(gridAdapter);
    }
}
