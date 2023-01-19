package com.ziac.buildingnewindustry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class RegistrationActivity extends AppCompatActivity {

    AutoCompleteTextView  SpinnerCountry,SpinnerCity,SpinnerState;
    private  ArrayAdapter<CharSequence> cityAdapter,stateAdapter,countryAdapter;


    AutoCompleteTextView atv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        SpinnerCity = findViewById(R.id.city);
        SpinnerState = findViewById(R.id.state);
        SpinnerCountry = findViewById(R.id.country);

        cityAdapter = ArrayAdapter.createFromResource(this,R.array.array_city,R.layout.spinner_layout);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerCity.setAdapter(cityAdapter);

        stateAdapter = ArrayAdapter.createFromResource(this,R.array.array_state,R.layout.spinner_layout);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerState.setAdapter(stateAdapter);


        countryAdapter = ArrayAdapter.createFromResource(this,R.array.array_country,R.layout.spinner_layout);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerCountry.setAdapter(countryAdapter);







//       stateAdapter = ArrayAdapter.createFromResource(this,R.array.array_indian_states,R.layout.spinner_layout);
//
//
//        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        Statespinner.setAdapter(stateAdapter);
//
//        Statespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//
//                SelectedState = Statespinner.getSelectedItem().toString();
//                int parentID= parent.getId();
//                if (parentID ==R.id.state){
//
//                    switch(SelectedState){
//                        case"Select your State ":districtAdapter= ArrayAdapter.createFromResource(parent.getContext(),
//                                R.array.array_default_districts,R.layout.spinner_layout);
//
//                        break;
//                        default:  break;
//                    }
////                    districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////                    Districtspinner.setAdapter(districtAdapter);
//
//                    Districtspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            SelectedDistrict = Districtspinner.getSelectedItem().toString();
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> parent) {
//
//                        }
//                    });
//
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//
//
//
//


//        SpinnerCountry = findViewById(R.id.country);
//        SpinnerCity = findViewById(R.id.city);
//        SpinnerState = findViewById(R.id.state);
//
//        ArrayAdapter<String> countryadapter=new ArrayAdapter<String>(RegistrationActivity.this, android.R.layout.simple_spinner_item,country);
//        countryadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        SpinnerCountry.setAdapter(countryadapter);
//
//        ArrayAdapter<String> Cityadapter=new ArrayAdapter<String>(RegistrationActivity.this, android.R.layout.simple_spinner_item,city);
//        Cityadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        SpinnerCity.setAdapter(Cityadapter);
//
//        ArrayAdapter<String> Stateadapter=new ArrayAdapter<String>(RegistrationActivity.this, android.R.layout.simple_spinner_item,state);
//        Stateadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        SpinnerState.setAdapter(Stateadapter);



    }
}