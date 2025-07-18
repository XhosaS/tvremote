package com.google.android.apps.googletv.app.internal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.izk;
import defpackage.tbb;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialSnackbarActivity extends AppCompatActivity {
    private MaterialButton a;
    private MaterialButton b;

    public static /* synthetic */ void $r8$lambda$Zcoqi4peWlDzeg9iZ7yzFCfzxYA(MaterialSnackbarActivity materialSnackbarActivity, View view) {
        view.getClass();
        tbb.n(view, "This is a snackbar", -1).h();
    }

    public static /* synthetic */ void $r8$lambda$u3Qp3BAt4Vgp5u6PHYuSS6Gn66o(MaterialSnackbarActivity materialSnackbarActivity, View view) {
        view.getClass();
        tbb tbbVarN = tbb.n(view, "This is a snackbar", -1);
        tbbVarN.p("Click Me", new izk(materialSnackbarActivity, 8));
        tbbVarN.h();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_snackbar);
        this.a = (MaterialButton) findViewById(R.id.showSnackbar);
        this.b = (MaterialButton) findViewById(R.id.showSnackbarAction);
        MaterialButton materialButton = this.a;
        MaterialButton materialButton2 = null;
        if (materialButton == null) {
            yks.c("showSnackbarButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new izk(this, 9));
        MaterialButton materialButton3 = this.b;
        if (materialButton3 == null) {
            yks.c("showSnackbarActionButton");
        } else {
            materialButton2 = materialButton3;
        }
        materialButton2.setOnClickListener(new izk(this, 10));
    }
}
