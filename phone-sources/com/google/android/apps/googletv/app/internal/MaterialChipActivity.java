package com.google.android.apps.googletv.app.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.text.Editable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.videos.R;
import defpackage.gea;
import defpackage.ize;
import defpackage.izk;
import defpackage.pku;
import defpackage.srg;
import defpackage.ssr;
import defpackage.tko;
import defpackage.yks;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialChipActivity extends AppCompatActivity {
    private Chip a;
    private Chip b;
    private Chip c;
    private Chip d;
    private ChipGroup e;
    private MaterialButton f;
    private MaterialButton g;
    private EditText h;

    /* renamed from: $r8$lambda$67tx00dtRvsw0DkV4S-GsRBeWB0, reason: not valid java name */
    public static /* synthetic */ void m98$r8$lambda$67tx00dtRvsw0DkV4SGsRBeWB0(MaterialChipActivity materialChipActivity, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Toast.makeText(materialChipActivity, "Checked Filter Chip: " + z, 0).show();
    }

    public static /* synthetic */ void $r8$lambda$QPJdfMYVJqrGHq_cd2Xtl2o5jyM(MaterialChipActivity materialChipActivity, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Toast.makeText(materialChipActivity, "Checked Choice Chip: " + z, 0).show();
    }

    /* renamed from: $r8$lambda$Z-GQ7XM9v2Q2uouSpG8_POLUFZk, reason: not valid java name */
    public static /* synthetic */ void m99$r8$lambda$ZGQ7XM9v2Q2uouSpG8_POLUFZk(MaterialChipActivity materialChipActivity, View view) {
        ChipGroup chipGroup = materialChipActivity.e;
        ChipGroup chipGroup2 = null;
        if (chipGroup == null) {
            yks.c("chipGroup");
            chipGroup = null;
        }
        ChipGroup chipGroup3 = materialChipActivity.e;
        if (chipGroup3 == null) {
            yks.c("chipGroup");
        } else {
            chipGroup2 = chipGroup3;
        }
        chipGroup.c(!chipGroup2.e());
        view.setActivated(!view.isActivated());
    }

    public static /* synthetic */ void $r8$lambda$aeWAH18jIQsgi4ahINsAH2fbyCg(MaterialChipActivity materialChipActivity, View view) {
        ChipGroup chipGroup = materialChipActivity.e;
        ChipGroup chipGroup2 = null;
        if (chipGroup == null) {
            yks.c("chipGroup");
            chipGroup = null;
        }
        ChipGroup chipGroup3 = materialChipActivity.e;
        if (chipGroup3 == null) {
            yks.c("chipGroup");
        } else {
            chipGroup2 = chipGroup3;
        }
        chipGroup.b(!chipGroup2.a.d);
        view.setActivated(!view.isActivated());
    }

    /* renamed from: $r8$lambda$gYoT6nknft-yobuncnwKSN00N_k, reason: not valid java name */
    public static /* synthetic */ void m100$r8$lambda$gYoT6nknftyobuncnwKSN00N_k(MaterialChipActivity materialChipActivity, ChipGroup chipGroup, int i) {
        chipGroup.getClass();
        Toast.makeText(materialChipActivity, "Checked Chip in ChipGroup: ".concat(i == R.id.choice1 ? "Chip 1" : i == R.id.choice2 ? "Chip 2" : i == R.id.choice3 ? "Chip 3" : i == R.id.choice4 ? "Chip 4" : i == R.id.choice5 ? "Chip 5" : i == R.id.choice6 ? "Chip 6" : ""), 0).show();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super.onCreate(bundle);
        int i = 1;
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_chip);
        this.a = (Chip) findViewById(R.id.actionChip);
        this.b = (Chip) findViewById(R.id.inputChip);
        this.c = (Chip) findViewById(R.id.choiceChip);
        this.d = (Chip) findViewById(R.id.filterChip);
        this.e = (ChipGroup) findViewById(R.id.chipGroup);
        this.f = (MaterialButton) findViewById(R.id.toggleSingleSelectionButton);
        this.g = (MaterialButton) findViewById(R.id.toggleSelectionRequiredButton);
        this.h = (EditText) findViewById(R.id.editText);
        Chip chip = this.a;
        EditText editText = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (chip == null) {
            yks.c("actionChip");
            chip = null;
        }
        chip.setOnClickListener(new izk(this, 0));
        Chip chip2 = this.b;
        if (chip2 == null) {
            yks.c("inputChip");
            chip2 = null;
        }
        chip2.f = new izk(this, 2);
        chip2.h();
        Chip chip3 = this.c;
        if (chip3 == null) {
            yks.c("choiceChip");
            chip3 = null;
        }
        chip3.g = new gea(this, 3, b3 == true ? 1 : 0);
        Chip chip4 = this.d;
        if (chip4 == null) {
            yks.c("filterChip");
            chip4 = null;
        }
        chip4.g = new gea(this, 4, b2 == true ? 1 : 0);
        MaterialButton materialButton = this.f;
        if (materialButton == null) {
            yks.c("toggleSingleSelectionButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new ize(this, 20));
        MaterialButton materialButton2 = this.g;
        if (materialButton2 == null) {
            yks.c("toggleSelectionRequiredButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new izk(this, i));
        ChipGroup chipGroup = this.e;
        if (chipGroup == null) {
            yks.c("chipGroup");
            chipGroup = null;
        }
        chipGroup.a.c(R.id.choice1);
        ChipGroup chipGroup2 = this.e;
        if (chipGroup2 == null) {
            yks.c("chipGroup");
            chipGroup2 = null;
        }
        chipGroup2.a();
        ChipGroup chipGroup3 = this.e;
        if (chipGroup3 == null) {
            yks.c("chipGroup");
            chipGroup3 = null;
        }
        chipGroup3.a.g(chipGroup3);
        ChipGroup chipGroup4 = this.e;
        if (chipGroup4 == null) {
            yks.c("chipGroup");
            chipGroup4 = null;
        }
        chipGroup4.b = new tko((View) chipGroup4, (Object) new pku(this, b == true ? 1 : 0));
        int[] iArr = srg.a;
        AttributeSet attributeSetE = ssr.e(this, R.xml.chip, "chip");
        int styleAttribute = attributeSetE.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = R.style.Widget_MaterialComponents_Chip_Entry;
        }
        srg srgVarE = srg.e(this, attributeSetE, R.attr.chipStandaloneStyle, styleAttribute);
        srgVarE.setBounds(0, 0, srgVarE.getIntrinsicWidth(), srgVarE.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(srgVarE);
        EditText editText2 = this.h;
        if (editText2 == null) {
            yks.c("editText");
        } else {
            editText = editText2;
        }
        Editable text = editText.getText();
        text.getClass();
        text.setSpan(imageSpan, 0, text.length(), 33);
    }
}
