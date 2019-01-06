package com.example.muhammad.daftarmenaratelekomunikasikotatarakan;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Activity context;

    public CustomInfoWindowAdapter (Activity context) { this.context = context; }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {


        View v = context.getLayoutInflater().inflate(R.layout.custom_info_window, null);

        TextView title = (TextView) v.findViewById(R.id.txt_title);
        TextView name = (TextView) v.findViewById(R.id.txt_snippet);

        title.setText(marker.getTitle());
        name.setText(marker.getSnippet());

        return v;
    }
}
