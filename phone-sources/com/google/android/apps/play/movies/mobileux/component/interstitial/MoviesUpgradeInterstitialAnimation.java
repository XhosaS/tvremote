package com.google.android.apps.play.movies.mobileux.component.interstitial;

import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MoviesUpgradeInterstitialAnimation extends ConstraintLayout {
    static {
        Math.toRadians(137.5077667236328d);
    }

    public MoviesUpgradeInterstitialAnimation(Context context) {
        super(context);
        new ArrayList();
        new Random();
    }

    public MoviesUpgradeInterstitialAnimation(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        new ArrayList();
        new Random();
        Resources resources = getResources();
        Resources.getSystem().getDisplayMetrics();
        resources.getInteger(R.integer.interstitial_num_tiers);
        getResources().getDimension(R.dimen.interstitial_item_translation_increment);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.interstitial_item_rotation_increment, typedValue, true);
        typedValue.getFloat();
        resources.getValue(R.dimen.interstitial_item_scale_increment, typedValue, true);
        typedValue.getFloat();
        resources.getValue(R.dimen.interstitial_item_scale_base, typedValue, true);
        typedValue.getFloat();
        resources.getInteger(R.integer.interstitial_anim_time_increment);
        resources.getInteger(R.integer.interstitial_anim_time_base);
        resources.getInteger(R.integer.interstitial_anim_delay_increment);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public MoviesUpgradeInterstitialAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ArrayList();
        new Random();
    }
}
