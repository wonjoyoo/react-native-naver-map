package main.java.com.github.quadflask.react.navermap;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;

import com.github.quadflask.react.navermap.RNNaverMapFeature;
import com.github.quadflask.react.navermap.ReactUtil;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.overlay.CircleOverlay;

import java.util.List;

public class RNNaverMapCircleOverlay extends RNNaverMapFeature<CircleOverlay> {
    public RNNaverMapCircleOverlay(Context context) {
        super(context);

        feature = new CircleOverlay();
        feature.setColor(ColorUtils.setAlphaComponent(Color.RED, 31));
    }

    public void setCenter(LatLng center) {
        feature.setCenter(center);
    }

    public void setRadius(double radius) {
        feature.setRadius(radius);
    }
}