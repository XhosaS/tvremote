package com.google.android.apps.googletv.app.internal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import defpackage.tgy;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialCardActivity extends AppCompatActivity {
    private MaterialCardView a;

    public static /* synthetic */ boolean $r8$lambda$JVjd7E3BKlFxPTUORD2IsYXWUQo(MaterialCardActivity materialCardActivity, View view) {
        MaterialCardView materialCardView = materialCardActivity.a;
        MaterialCardView materialCardView2 = null;
        if (materialCardView == null) {
            yks.c("card");
            materialCardView = null;
        }
        MaterialCardView materialCardView3 = materialCardActivity.a;
        if (materialCardView3 == null) {
            yks.c("card");
        } else {
            materialCardView2 = materialCardView3;
        }
        materialCardView.setChecked(!materialCardView2.h);
        return true;
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
        setContentView(R.layout.material_card);
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.cardOutlined);
        this.a = materialCardView;
        if (materialCardView == null) {
            yks.c("card");
            materialCardView = null;
        }
        materialCardView.setOnLongClickListener(new tgy(this, i));
    }
}
