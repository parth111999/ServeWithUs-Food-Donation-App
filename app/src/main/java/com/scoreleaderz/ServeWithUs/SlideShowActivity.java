package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SlideShowActivity extends AppCompatActivity {

    private ImageView i1,i21,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);

        b1=(Button)findViewById(R.id.close);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb=new AlertDialog.Builder(SlideShowActivity.this);
                adb.setMessage("Do you want to close ? ").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alert=adb.create();
                alert.setTitle("Alert !");
                alert.show();

            }
        });

        i1=(ImageView)findViewById(R.id.i1);
        i21=(ImageView)findViewById(R.id.i2);
        i3=(ImageView)findViewById(R.id.i3);
        i4=(ImageView)findViewById(R.id.i4);
        i5=(ImageView)findViewById(R.id.i5);
        i6=(ImageView)findViewById(R.id.i6);
        i7=(ImageView)findViewById(R.id.i7);
        i8=(ImageView)findViewById(R.id.i8);
        i9=(ImageView)findViewById(R.id.i9);
        i10=(ImageView)findViewById(R.id.i10);
        i11=(ImageView)findViewById(R.id.i11);
        i12=(ImageView)findViewById(R.id.i12);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image(view);
            }
        });

    }

    public void image(View view) {
        if (view.getId() == R.id.i1) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.VISIBLE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i2) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i3) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.VISIBLE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i4) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.VISIBLE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i5) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.VISIBLE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i6) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.VISIBLE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i7) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.VISIBLE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i8) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.VISIBLE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i9) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.VISIBLE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i10) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.VISIBLE);
            i12.setVisibility(View.GONE);
        } else if (view.getId() == R.id.i11) {
            i1.setVisibility(View.GONE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.VISIBLE);
        } else if (view.getId() == R.id.i12) {
            i1.setVisibility(View.VISIBLE);
            i21.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.GONE);
            i6.setVisibility(View.GONE);
            i7.setVisibility(View.GONE);
            i8.setVisibility(View.GONE);
            i9.setVisibility(View.GONE);
            i10.setVisibility(View.GONE);
            i11.setVisibility(View.GONE);
            i12.setVisibility(View.GONE);
        }

    }
}