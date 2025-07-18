package com.google.android.apps.googletv.app.internal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import com.google.android.apps.googletv.app.internal.MaterialActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.ize;
import defpackage.sqg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialActivity extends AppCompatActivity {
    public static /* synthetic */ void $r8$lambda$WuOVGYBLLDGhiavqOmtCqdPt50A(MaterialActivity materialActivity, View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode() == 1 ? 2 : 1);
        materialActivity.recreate();
    }

    /* renamed from: $r8$lambda$roog_JqN60Ny-zBZQKVFOeEALYI, reason: not valid java name */
    public static /* synthetic */ void m93$r8$lambda$roog_JqN60NyzBZQKVFOeEALYI(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            ((sqg) dialogInterface).a().P(3);
        }
    }

    /* renamed from: $r8$lambda$yBOJ-WaA2CNbrcXtIrzCMfX2nic, reason: not valid java name */
    public static /* synthetic */ void m95$r8$lambda$yBOJWaA2CNbrcXtIrzCMfX2nic(MaterialActivity materialActivity, View view) {
        sqg sqgVar = new sqg(materialActivity);
        sqgVar.setContentView(R.layout.legend_bottom_sheet);
        sqgVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: izh
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MaterialActivity.m93$r8$lambda$roog_JqN60NyzBZQKVFOeEALYI(dialogInterface);
            }
        });
        sqgVar.show();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_layout);
        ((MaterialButton) findViewById(R.id.themingPlaygroundButton)).setOnClickListener(new ize(this, 7));
        ((MaterialButton) findViewById(R.id.bottomAppBarPlaygroundButton)).setOnClickListener(new ize(this, 10));
        ((MaterialButton) findViewById(R.id.bottomNavigationPlaygroundButton)).setOnClickListener(new ize(this, 11));
        ((MaterialButton) findViewById(R.id.bottomSheetPlaygroundButton)).setOnClickListener(new ize(this, 12));
        ((MaterialButton) findViewById(R.id.buttonPlaygroundButton)).setOnClickListener(new ize(this, 13));
        ((MaterialButton) findViewById(R.id.chipPlaygroundButton)).setOnClickListener(new ize(this, 14));
        ((MaterialButton) findViewById(R.id.cardPlaygroundButton)).setOnClickListener(new ize(this, 15));
        ((MaterialButton) findViewById(R.id.dialogPlaygroundButton)).setOnClickListener(new ize(this, 4));
        ((MaterialButton) findViewById(R.id.selectionControlPlaygroundButton)).setOnClickListener(new ize(this, 5));
        ((MaterialButton) findViewById(R.id.snackbarPlaygroundButton)).setOnClickListener(new ize(this, 6));
        ((MaterialButton) findViewById(R.id.showColorLegendButton)).setOnClickListener(new ize(this, 8));
        ((MaterialButton) findViewById(R.id.switchThemeButton)).setOnClickListener(new ize(this, 9));
    }
}
