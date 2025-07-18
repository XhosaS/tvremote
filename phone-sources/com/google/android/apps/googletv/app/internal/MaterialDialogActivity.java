package com.google.android.apps.googletv.app.internal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.gcu;
import defpackage.izk;
import defpackage.izm;
import defpackage.ssn;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialDialogActivity extends AppCompatActivity {
    private MaterialButton a;
    private MaterialButton b;
    private MaterialButton c;
    private MaterialButton d;
    private MaterialButton e;

    public static /* synthetic */ void $r8$lambda$21PYdayWrtzZBVKthgbS6YZMZnI(MaterialDialogActivity materialDialogActivity, View view) {
        ssn ssnVar = new ssn(materialDialogActivity);
        ssnVar.p("This is some title");
        ssnVar.e(" This is some text");
        byte[] bArr = null;
        ssnVar.m("Confirm", new gcu(materialDialogActivity, 5, bArr));
        ssnVar.h("Dismiss", new gcu(materialDialogActivity, 6, bArr));
        ssnVar.j(new gcu(materialDialogActivity, 7, bArr));
        ssnVar.a(R.drawable.ic_android_guy_24dp);
        ssnVar.show();
    }

    public static /* synthetic */ void $r8$lambda$HMetXAVEHI55f2_nkX_6aAZ1a2U(MaterialDialogActivity materialDialogActivity, View view) {
        ssn ssnVar = new ssn(materialDialogActivity);
        ssnVar.p("Discard snapsterpiece?");
        ssnVar.e("This destroy everything.");
        byte[] bArr = null;
        ssnVar.m("Discard", new gcu(materialDialogActivity, 10, bArr));
        ssnVar.h("Cancel", new gcu(materialDialogActivity, 11, bArr));
        ssnVar.show();
    }

    public static /* synthetic */ void $r8$lambda$T1FrpEB0JnNp48ZbRlFmy7bdMNI(MaterialDialogActivity materialDialogActivity, View view) {
        String[] strArr = {"Emilia", "Ralphtalia", "Rem", "Kurisu"};
        ssn ssnVar = new ssn(materialDialogActivity);
        ssnVar.p("Best Girl");
        ssnVar.n(strArr, new izm(materialDialogActivity, strArr, 0));
        byte[] bArr = null;
        ssnVar.m("Ok", new gcu(materialDialogActivity, 3, bArr));
        ssnVar.h("Cancel", new gcu(materialDialogActivity, 4, bArr));
        ssnVar.show();
    }

    /* renamed from: $r8$lambda$v8ADS7-aSaK8CUPMyZVv2uWj5oQ, reason: not valid java name */
    public static /* synthetic */ void m107$r8$lambda$v8ADS7aSaK8CUPMyZVv2uWj5oQ(final MaterialDialogActivity materialDialogActivity, View view) {
        final String[] strArr = {"Shrek", "Shrek 2", "Shrek 3", "Shrek 4"};
        ssn ssnVar = new ssn(materialDialogActivity);
        ssnVar.p("Select favorite Movies");
        ssnVar.f(strArr, new boolean[]{true, false, false, false}, new DialogInterface.OnMultiChoiceClickListener() { // from class: izl
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                Toast.makeText(this.a, "Chose ".concat(String.valueOf(strArr[i])), 0).show();
            }
        });
        byte[] bArr = null;
        ssnVar.m("Ok", new gcu(materialDialogActivity, 8, bArr));
        ssnVar.h("Cancel", new gcu(materialDialogActivity, 9, bArr));
        ssnVar.show();
    }

    public static /* synthetic */ void $r8$lambda$xkHUDsOwE5iIiOU3IIUeEpi0Osg(MaterialDialogActivity materialDialogActivity, View view) {
        String[] strArr = {"shrek@gmail.com", "emilia@gmail.com", "Add account"};
        ssn ssnVar = new ssn(materialDialogActivity);
        ssnVar.p("Set meme account");
        ssnVar.c(strArr, new izm(materialDialogActivity, strArr, 1));
        ssnVar.show();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_dialog);
        this.a = (MaterialButton) findViewById(R.id.alertDialogButton);
        this.b = (MaterialButton) findViewById(R.id.simpleDialogButton);
        this.c = (MaterialButton) findViewById(R.id.singleChoiceConfirmationDialogButton);
        this.d = (MaterialButton) findViewById(R.id.multiChoiceConfirmationDialogButton);
        this.e = (MaterialButton) findViewById(R.id.allDialogButton);
        MaterialButton materialButton = this.a;
        MaterialButton materialButton2 = null;
        if (materialButton == null) {
            yks.c("alertDialogButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new izk(this, 5));
        MaterialButton materialButton3 = this.b;
        if (materialButton3 == null) {
            yks.c("simpleDialogButton");
            materialButton3 = null;
        }
        materialButton3.setOnClickListener(new izk(this, 3));
        MaterialButton materialButton4 = this.c;
        if (materialButton4 == null) {
            yks.c("singleChoiceConfirmationDialogButton");
            materialButton4 = null;
        }
        materialButton4.setOnClickListener(new izk(this, 6));
        MaterialButton materialButton5 = this.d;
        if (materialButton5 == null) {
            yks.c("multiChoiceConfirmationDialogButton");
            materialButton5 = null;
        }
        materialButton5.setOnClickListener(new izk(this, 7));
        MaterialButton materialButton6 = this.e;
        if (materialButton6 == null) {
            yks.c("allDialogButton");
        } else {
            materialButton2 = materialButton6;
        }
        materialButton2.setOnClickListener(new izk(this, 4));
    }
}
