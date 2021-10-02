package com.example.kriptonx;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScanDataFragment extends Fragment {

    RecyclerView recyclerView;
    ScanAdapter scanAdapter;
    List<ScanModel> scanModelList;

    Button search_img;
    EditText search_box;

    public ScanDataFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.fragment_scan_data,container,false);

        recyclerView=root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        search_img=root.findViewById(R.id.scan_button);
        scanModelList=new ArrayList<>();
        scanAdapter=new ScanAdapter(getActivity(),scanModelList);
        recyclerView.setAdapter(scanAdapter);

        search_box=root.findViewById(R.id.search_box);

        search_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url ="https://images-api.nasa.gov/search?q="+search_box.getText().toString();

// Request a string response from the provided URL.
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {

                                // get json object

                                //get the property called "collection" which is an object

                                //get the property called items which is an array

                                // get json object

                                // get the json property called data which is an array

                                // get each item in data object to scan model


                                // get the json property called links which is an array

                                // get href in links object to scan model
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                });

// Add the request to the RequestQueue.
                MySingleton.getInstance(getContext()).addToRequestQueue(request);

            }
        });

        return root;
    }
}