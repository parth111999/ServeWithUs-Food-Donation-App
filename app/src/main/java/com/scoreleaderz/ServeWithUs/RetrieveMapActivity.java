package com.scoreleaderz.ServeWithUs;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.scoreleaderz.ServeWithUs.databinding.ActivityRetrieveMapBinding;

import java.util.ArrayList;

public class RetrieveMapActivity extends FragmentActivity implements OnMapReadyCallback {

    String TAG = "RetrieveMapActivity";
    private GoogleMap mMap;
    private ActivityRetrieveMapBinding binding;

    private String CurrentUser;
    private DatabaseReference databaseReference;
  

    DonationListAdapter donationListAdapter;
    ArrayList<DonationList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRetrieveMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        CurrentUser = FirebaseAuth.getInstance().getCurrentUser().getUid();

//        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Donations");
        databaseReference = FirebaseDatabase.getInstance().getReference("Donations");


        ValueEventListener listener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){

                    String latitude = (String) dataSnapshot.child("latitude").getValue();
                    String longitude = (String) dataSnapshot.child("longitude").getValue();

                    Double d1 = Double.valueOf(latitude);
                    Double d2 = Double.valueOf(longitude);

//                    Log.d(TAG,"new"+latitude + longitude);
//
                    LatLng location = new LatLng(d1,d2);



                   mMap.addMarker(new MarkerOptions().position(location).title("Marker in Current Location"));
                   mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,14F));

                }

//                Toast.makeText(RetrieveMapActivity.this,"Click Maker to get Location",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}