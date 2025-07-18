package com.google.android.apps.googletv.app.internal;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.fsq;
import defpackage.ize;
import defpackage.izf;
import defpackage.izj;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BottomSheetMaterialActivity extends AppCompatActivity {
    private BottomSheetBehavior a;
    private final int b;
    private MaterialButton c;
    private MaterialButton d;
    private MaterialButton e;
    private FrameLayout f;
    private TextView g;
    private boolean h;

    /* renamed from: $r8$lambda$h-mMfPw4nO8fAySZDrciruoPOuE, reason: not valid java name */
    public static /* synthetic */ void m87$r8$lambda$hmMfPw4nO8fAySZDrciruoPOuE(BottomSheetMaterialActivity bottomSheetMaterialActivity, View view) {
        BottomSheetBehavior bottomSheetBehavior = bottomSheetMaterialActivity.a;
        if (bottomSheetBehavior == null) {
            yks.c("standardBottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.P(4);
    }

    public static /* synthetic */ void $r8$lambda$kPrXsuR2RNOebCe0vF2k7Kw_iOc(BottomSheetMaterialActivity bottomSheetMaterialActivity, View view) {
        boolean z = bottomSheetMaterialActivity.h;
        izj izjVar = new izj();
        Bundle bundle = new Bundle();
        bundle.putBoolean("dismiss_with_animation", z);
        izjVar.setArguments(bundle);
        izjVar.show(bottomSheetMaterialActivity.getSupportFragmentManager(), "MaterialBottomSheet");
    }

    public static /* synthetic */ void $r8$lambda$zDjriseCZR46LiGv3HPcNFfTFfI(BottomSheetMaterialActivity bottomSheetMaterialActivity, View view) {
        bottomSheetMaterialActivity.h = !bottomSheetMaterialActivity.h;
        view.setActivated(!view.isActivated());
    }

    public BottomSheetMaterialActivity() {
        Color.parseColor("#00FFFFFF");
        Color.parseColor("#FFFFFFFF");
        this.b = Color.parseColor("#FF000000");
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_bottom_sheet);
        this.c = (MaterialButton) findViewById(R.id.standardBottomSheetButton);
        this.d = (MaterialButton) findViewById(R.id.materialBottomSheetButton);
        this.e = (MaterialButton) findViewById(R.id.toggleMaterialDismissAnimationButton);
        this.f = (FrameLayout) findViewById(R.id.standardBottomSheet);
        this.g = (TextView) findViewById(R.id.textView);
        findViewById(R.id.slideView);
        MaterialButton materialButton = this.c;
        TextView textView = null;
        if (materialButton == null) {
            yks.c("standardBottomSheetButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new fsq(this, 20));
        MaterialButton materialButton2 = this.d;
        if (materialButton2 == null) {
            yks.c("materialBottomSheetButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new ize(this, i));
        MaterialButton materialButton3 = this.e;
        if (materialButton3 == null) {
            yks.c("toggleMaterialDismissAnimationButton");
            materialButton3 = null;
        }
        materialButton3.setOnClickListener(new ize(this, 0));
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            yks.c("standardBottomSheet");
            frameLayout = null;
        }
        this.a = BottomSheetBehavior.G(frameLayout);
        izf izfVar = new izf(this);
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null) {
            yks.c("standardBottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.H(izfVar);
        BottomSheetBehavior bottomSheetBehavior2 = this.a;
        if (bottomSheetBehavior2 == null) {
            yks.c("standardBottomSheetBehavior");
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.b = -1;
        TextView textView2 = this.g;
        if (textView2 == null) {
            yks.c("textView");
        } else {
            textView = textView2;
        }
        textView.setTextColor(this.b);
    }
}
