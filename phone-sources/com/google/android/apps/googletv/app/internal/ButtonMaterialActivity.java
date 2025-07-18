package com.google.android.apps.googletv.app.internal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.ButtonMaterialActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.videos.R;
import defpackage.ize;
import defpackage.sqt;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ButtonMaterialActivity extends AppCompatActivity {
    private MaterialButton a;
    private MaterialButtonToggleGroup b;
    private MaterialButtonToggleGroup c;
    private MaterialButton d;

    public static /* synthetic */ void $r8$lambda$4HPXg7sOfI4jLOiiKfdeuqbHfSw(ButtonMaterialActivity buttonMaterialActivity, View view) {
        MaterialButtonToggleGroup materialButtonToggleGroup = buttonMaterialActivity.b;
        MaterialButtonToggleGroup materialButtonToggleGroup2 = null;
        if (materialButtonToggleGroup == null) {
            yks.c("toggleGroupHorizontal");
            materialButtonToggleGroup = null;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup3 = buttonMaterialActivity.b;
        if (materialButtonToggleGroup3 == null) {
            yks.c("toggleGroupHorizontal");
            materialButtonToggleGroup3 = null;
        }
        materialButtonToggleGroup.l(!materialButtonToggleGroup3.f);
        MaterialButtonToggleGroup materialButtonToggleGroup4 = buttonMaterialActivity.c;
        if (materialButtonToggleGroup4 == null) {
            yks.c("toggleGroupVertical");
            materialButtonToggleGroup4 = null;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup5 = buttonMaterialActivity.c;
        if (materialButtonToggleGroup5 == null) {
            yks.c("toggleGroupVertical");
        } else {
            materialButtonToggleGroup2 = materialButtonToggleGroup5;
        }
        materialButtonToggleGroup4.l(!materialButtonToggleGroup2.f);
        view.setActivated(!view.isActivated());
    }

    public static /* synthetic */ void $r8$lambda$umq6UL4giFRIYSlz4IW7e5u69ic(ButtonMaterialActivity buttonMaterialActivity, View view) {
        MaterialButtonToggleGroup materialButtonToggleGroup = buttonMaterialActivity.b;
        MaterialButtonToggleGroup materialButtonToggleGroup2 = null;
        if (materialButtonToggleGroup == null) {
            yks.c("toggleGroupHorizontal");
            materialButtonToggleGroup = null;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup3 = buttonMaterialActivity.b;
        if (materialButtonToggleGroup3 == null) {
            yks.c("toggleGroupHorizontal");
            materialButtonToggleGroup3 = null;
        }
        materialButtonToggleGroup.g = !materialButtonToggleGroup3.g;
        MaterialButtonToggleGroup materialButtonToggleGroup4 = buttonMaterialActivity.c;
        if (materialButtonToggleGroup4 == null) {
            yks.c("toggleGroupVertical");
            materialButtonToggleGroup4 = null;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup5 = buttonMaterialActivity.c;
        if (materialButtonToggleGroup5 == null) {
            yks.c("toggleGroupVertical");
        } else {
            materialButtonToggleGroup2 = materialButtonToggleGroup5;
        }
        materialButtonToggleGroup4.g = !materialButtonToggleGroup2.g;
        view.setActivated(!view.isActivated());
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 1;
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_button);
        this.a = (MaterialButton) findViewById(R.id.toggleSingleSelectionButton);
        this.b = (MaterialButtonToggleGroup) findViewById(R.id.toggleGroupHorizontal);
        this.c = (MaterialButtonToggleGroup) findViewById(R.id.toggleGroupVertical);
        this.d = (MaterialButton) findViewById(R.id.toggleSelectionRequiredButton);
        MaterialButton materialButton = this.a;
        MaterialButtonToggleGroup materialButtonToggleGroup = null;
        if (materialButton == null) {
            yks.c("toggleSingleSelectionButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new ize(this, 2));
        MaterialButton materialButton2 = this.d;
        if (materialButton2 == null) {
            yks.c("toggleSelectionRequiredButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new ize(this, 3));
        MaterialButtonToggleGroup materialButtonToggleGroup2 = this.b;
        if (materialButtonToggleGroup2 == null) {
            yks.c("toggleGroupHorizontal");
            materialButtonToggleGroup2 = null;
        }
        materialButtonToggleGroup2.j(new sqt(this) { // from class: izg
            public final /* synthetic */ ButtonMaterialActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.sqt
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup3, int i2, boolean z) {
                if (i != 0) {
                    Toast.makeText(this.a, (z ? "Checked " : "Unchecked ").concat(i2 == R.id.toggleButton1Horizontal ? "Button 1 (Horizontal)" : i2 == R.id.toggleButton2Horizontal ? "Button 2 (Horizontal)" : i2 == R.id.toggleButton3Horizontal ? "Button 3 (Horizontal)" : ""), 0).show();
                } else {
                    Toast.makeText(this.a, (z ? "Checked " : "Unchecked ").concat(i2 == R.id.toggleButton1Vertical ? "Button 1 (Vertical)" : i2 == R.id.toggleButton2Vertical ? "Button 2 (Vertical)" : i2 == R.id.toggleButton3Vertical ? "Button 3 (Vertical)" : ""), 0).show();
                }
            }
        });
        MaterialButtonToggleGroup materialButtonToggleGroup3 = this.c;
        if (materialButtonToggleGroup3 == null) {
            yks.c("toggleGroupVertical");
        } else {
            materialButtonToggleGroup = materialButtonToggleGroup3;
        }
        final int i2 = 0;
        materialButtonToggleGroup.j(new sqt(this) { // from class: izg
            public final /* synthetic */ ButtonMaterialActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.sqt
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup32, int i22, boolean z) {
                if (i2 != 0) {
                    Toast.makeText(this.a, (z ? "Checked " : "Unchecked ").concat(i22 == R.id.toggleButton1Horizontal ? "Button 1 (Horizontal)" : i22 == R.id.toggleButton2Horizontal ? "Button 2 (Horizontal)" : i22 == R.id.toggleButton3Horizontal ? "Button 3 (Horizontal)" : ""), 0).show();
                } else {
                    Toast.makeText(this.a, (z ? "Checked " : "Unchecked ").concat(i22 == R.id.toggleButton1Vertical ? "Button 1 (Vertical)" : i22 == R.id.toggleButton2Vertical ? "Button 2 (Vertical)" : i22 == R.id.toggleButton3Vertical ? "Button 3 (Vertical)" : ""), 0).show();
                }
            }
        });
    }
}
