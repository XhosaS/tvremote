package com.google.android.apps.googletv.app.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.MaterialSelectionActivity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.videos.R;
import defpackage.gea;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialSelectionActivity extends AppCompatActivity {
    private MaterialRadioButton a;
    private MaterialCheckBox b;
    private SwitchMaterial c;
    private RadioGroup d;

    /* renamed from: $r8$lambda$0KVWvheURmIdwQv76FrfPguRI-0, reason: not valid java name */
    public static /* synthetic */ void m108$r8$lambda$0KVWvheURmIdwQv76FrfPguRI0(MaterialSelectionActivity materialSelectionActivity, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Toast.makeText(materialSelectionActivity, "Checked Switch: " + z, 0).show();
    }

    public static /* synthetic */ void $r8$lambda$HSFQa_RrV_AIyYv_fFSBX4XpdrM(MaterialSelectionActivity materialSelectionActivity, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Toast.makeText(materialSelectionActivity, "Checked Checkbox: " + z, 0).show();
    }

    /* renamed from: $r8$lambda$LenvE20Hh4oei5dxiKsF-omqqYE, reason: not valid java name */
    public static /* synthetic */ void m109$r8$lambda$LenvE20Hh4oei5dxiKsFomqqYE(MaterialSelectionActivity materialSelectionActivity, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Toast.makeText(materialSelectionActivity, "Checked Radio Button: " + z, 0).show();
    }

    public static /* synthetic */ void $r8$lambda$sbxVQvR23wRDgrJaYCZbURzLzaM(MaterialSelectionActivity materialSelectionActivity, RadioGroup radioGroup, int i) {
        radioGroup.getClass();
        Toast.makeText(materialSelectionActivity, "Checked Radio Button in RadioGroup: ".concat(i == R.id.option1 ? "Radio Button 1" : i == R.id.option2 ? "Radio Button 2" : i == R.id.option3 ? "Radio Button 3" : ""), 0).show();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_selection);
        this.a = (MaterialRadioButton) findViewById(R.id.radioButton);
        this.b = (MaterialCheckBox) findViewById(R.id.checkbox);
        this.c = (SwitchMaterial) findViewById(R.id.switchMaterial);
        this.d = (RadioGroup) findViewById(R.id.radioGroup);
        MaterialRadioButton materialRadioButton = this.a;
        RadioGroup radioGroup = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (materialRadioButton == null) {
            yks.c("radioButton");
            materialRadioButton = null;
        }
        materialRadioButton.setChecked(false);
        MaterialCheckBox materialCheckBox = this.b;
        if (materialCheckBox == null) {
            yks.c("checkbox");
            materialCheckBox = null;
        }
        materialCheckBox.a(1);
        SwitchMaterial switchMaterial = this.c;
        if (switchMaterial == null) {
            yks.c("switchMaterial");
            switchMaterial = null;
        }
        switchMaterial.setChecked(true);
        MaterialRadioButton materialRadioButton2 = this.a;
        if (materialRadioButton2 == null) {
            yks.c("radioButton");
            materialRadioButton2 = null;
        }
        materialRadioButton2.setOnCheckedChangeListener(new gea(this, 5, b3 == true ? 1 : 0));
        MaterialCheckBox materialCheckBox2 = this.b;
        if (materialCheckBox2 == null) {
            yks.c("checkbox");
            materialCheckBox2 = null;
        }
        materialCheckBox2.d = new gea(this, 6, b2 == true ? 1 : 0);
        SwitchMaterial switchMaterial2 = this.c;
        if (switchMaterial2 == null) {
            yks.c("switchMaterial");
            switchMaterial2 = null;
        }
        switchMaterial2.setOnCheckedChangeListener(new gea(this, 7, b == true ? 1 : 0));
        RadioGroup radioGroup2 = this.d;
        if (radioGroup2 == null) {
            yks.c("radioGroup");
            radioGroup2 = null;
        }
        radioGroup2.check(R.id.option1);
        RadioGroup radioGroup3 = this.d;
        if (radioGroup3 == null) {
            yks.c("radioGroup");
            radioGroup3 = null;
        }
        radioGroup3.getCheckedRadioButtonId();
        RadioGroup radioGroup4 = this.d;
        if (radioGroup4 == null) {
            yks.c("radioGroup");
        } else {
            radioGroup = radioGroup4;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: izn
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup5, int i) {
                MaterialSelectionActivity.$r8$lambda$sbxVQvR23wRDgrJaYCZbURzLzaM(this.a, radioGroup5, i);
            }
        });
    }
}
