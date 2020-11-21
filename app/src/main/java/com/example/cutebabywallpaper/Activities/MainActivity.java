package com.example.cutebabywallpaper.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.cutebabywallpaper.Adapters.UserClass;
import com.example.cutebabywallpaper.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NetworkInfo info;
    private NavigationView navigationView;
    private UserClass userClass;
    private CardView cardView1,cardView12,cardView2,cardView22,cardView3,cardView32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawerLayout);
        cardView1 = findViewById(R.id.cardView1);
        cardView12 = findViewById(R.id.cardView12);
        cardView2 = findViewById(R.id.cardView2);
        cardView22 = findViewById(R.id.cardView22);
        cardView3 = findViewById(R.id.cardView3);
        cardView32 = findViewById(R.id.cardView32);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {
            Toast.makeText(MainActivity.this, "Loading..", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();
        }

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "cute_baby");
                startActivity(intent);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "cute_baby_girl");
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "cutest_baby");
                startActivity(intent);
            }
        });
        cardView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "photography");
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "kids");
                startActivity(intent);
            }
        });
        cardView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CategoryImageActivity.class);
                intent.putExtra("EXTRA_NAME", "cute_stylish_boy");
                startActivity(intent);
            }
        });
        navigationView.setCheckedItem(R.id.wallpaper);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.wallpaper) {

                } else if (id == R.id.favorites) {
                    //getdata();
                } else if (id == R.id.Settings) {
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.rate_us) {

                } else if (id == R.id.more_app) {

                }
                //Shere
                else if (id == R.id.shere) {
                    Intent myintent = new Intent(Intent.ACTION_SEND);
                    myintent.setType("text/plan");

                    String shereBoday = "Your Boday Here";

                    String shereSub = "\"http://play.google.com/store/apps/details?id=" + getPackageName();
                    myintent.putExtra(Intent.EXTRA_SUBJECT, shereBoday);
                    myintent.putExtra(Intent.EXTRA_TEXT, shereSub);
                    startActivity(Intent.createChooser(myintent, "shere Using"));
                }
                //Exit
                else if (id == R.id.exit) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Are you sure you want to Exit?");
                    builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog d = builder.create();
                    d.show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            //startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        }
        if (id == R.id.action_exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog d = builder.create();
            d.show();
        }
        if (id == R.id.action_search) {
            finish();
            startActivity(getIntent());
            if (info != null) {
                //getdata();
            } else {
                Toast.makeText(this, "Internet Not Connected!", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}