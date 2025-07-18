package com.google.android.apps.googletv.app.internal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.MaterialBottomNavigationActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.ize;
import defpackage.pku;
import defpackage.soo;
import defpackage.sop;
import defpackage.soq;
import defpackage.spr;
import defpackage.svx;
import defpackage.swh;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaterialBottomNavigationActivity extends AppCompatActivity {
    private MaterialButton a;
    private BottomNavigationView b;
    private MaterialButton c;
    private MaterialButton d;
    private MaterialButton e;
    private boolean f;

    public static /* synthetic */ void $r8$lambda$WPL_T4mRI3w1cUEX4MEs5sEudTM(MaterialBottomNavigationActivity materialBottomNavigationActivity, View view) {
        BottomNavigationView bottomNavigationView = materialBottomNavigationActivity.b;
        if (bottomNavigationView == null) {
            yks.c("bottomNavigation");
            bottomNavigationView = null;
        }
        soo sooVarF = bottomNavigationView.f(R.id.item1);
        Integer numValueOf = sooVarF != null ? Integer.valueOf(sooVarF.b.a()) : null;
        int i = (numValueOf == null || numValueOf.intValue() != 8388661) ? (numValueOf != null && numValueOf.intValue() == 8388659) ? 8388691 : (numValueOf != null && numValueOf.intValue() == 8388691) ? 8388693 : 8388661 : 8388659;
        BottomNavigationView bottomNavigationView2 = materialBottomNavigationActivity.b;
        if (bottomNavigationView2 == null) {
            yks.c("bottomNavigation");
            bottomNavigationView2 = null;
        }
        svx svxVar = bottomNavigationView2.a;
        svxVar.getClass();
        int size = svxVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = svxVar.getItem(i2);
            BottomNavigationView bottomNavigationView3 = materialBottomNavigationActivity.b;
            if (bottomNavigationView3 == null) {
                yks.c("bottomNavigation");
                bottomNavigationView3 = null;
            }
            soo sooVarF2 = bottomNavigationView3.f(item.getItemId());
            if (sooVarF2 != null) {
                if (i == 8388691 || i == 8388693) {
                    Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
                }
                soq soqVar = sooVarF2.b;
                if (soqVar.a() != i) {
                    sop sopVar = soqVar.a;
                    Integer numValueOf2 = Integer.valueOf(i);
                    sopVar.s = numValueOf2;
                    soqVar.b.s = numValueOf2;
                    sooVarF2.f();
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$_3cJRy2Xa0ymlIKPd1o1e0qjWP0(MaterialBottomNavigationActivity materialBottomNavigationActivity, View view) {
        view.setActivated(!view.isActivated());
        if (materialBottomNavigationActivity.f) {
            BottomNavigationView bottomNavigationView = materialBottomNavigationActivity.b;
            if (bottomNavigationView == null) {
                yks.c("bottomNavigation");
                bottomNavigationView = null;
            }
            svx svxVar = bottomNavigationView.a;
            svxVar.getClass();
            int size = svxVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = svxVar.getItem(i);
                BottomNavigationView bottomNavigationView2 = materialBottomNavigationActivity.b;
                if (bottomNavigationView2 == null) {
                    yks.c("bottomNavigation");
                    bottomNavigationView2 = null;
                }
                bottomNavigationView2.i(item.getItemId());
            }
            materialBottomNavigationActivity.f = false;
            return;
        }
        BottomNavigationView bottomNavigationView3 = materialBottomNavigationActivity.b;
        if (bottomNavigationView3 == null) {
            yks.c("bottomNavigation");
            bottomNavigationView3 = null;
        }
        svx svxVar2 = bottomNavigationView3.a;
        svxVar2.getClass();
        int size2 = svxVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            MenuItem item2 = svxVar2.getItem(i2);
            BottomNavigationView bottomNavigationView4 = materialBottomNavigationActivity.b;
            if (bottomNavigationView4 == null) {
                yks.c("bottomNavigation");
                bottomNavigationView4 = null;
            }
            soo sooVarG = bottomNavigationView4.g(item2.getItemId());
            if (i2 > 0) {
                float fPow = (float) Math.pow(10.0d, i2 + i2);
                soq soqVar = sooVarG.b;
                int iMax = Math.max(0, (int) fPow);
                if (soqVar.h() != iMax) {
                    soqVar.a.k = iMax;
                    soqVar.b.k = iMax;
                    if (!sooVarG.l()) {
                        sooVarG.e();
                    }
                }
            }
        }
        materialBottomNavigationActivity.f = true;
    }

    /* renamed from: $r8$lambda$g27T_Nbd1DVhKUoDAy5MAMvV-yQ, reason: not valid java name */
    public static /* synthetic */ boolean m96$r8$lambda$g27T_Nbd1DVhKUoDAy5MAMvVyQ(MaterialBottomNavigationActivity materialBottomNavigationActivity, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.item1) {
            Toast.makeText(materialBottomNavigationActivity, "Selected navigation item 1", 0).show();
            return true;
        }
        if (itemId == R.id.item2) {
            Toast.makeText(materialBottomNavigationActivity, "Selected navigation item 2", 0).show();
            return true;
        }
        if (itemId != R.id.item3) {
            return false;
        }
        Toast.makeText(materialBottomNavigationActivity, "Selected navigation item 3", 0).show();
        return true;
    }

    public static /* synthetic */ void $r8$lambda$proAF9B92IzjdvOoM1l_lo_vImg(MaterialBottomNavigationActivity materialBottomNavigationActivity, View view) {
        BottomNavigationView bottomNavigationView = materialBottomNavigationActivity.b;
        BottomNavigationView bottomNavigationView2 = null;
        if (bottomNavigationView == null) {
            yks.c("bottomNavigation");
            bottomNavigationView = null;
        }
        boolean z = !((spr) bottomNavigationView.b).a;
        BottomNavigationView bottomNavigationView3 = materialBottomNavigationActivity.b;
        if (bottomNavigationView3 == null) {
            yks.c("bottomNavigation");
        } else {
            bottomNavigationView2 = bottomNavigationView3;
        }
        bottomNavigationView2.c(z);
    }

    public static /* synthetic */ void $r8$lambda$sGL7XigF3ybZwlw5jwwLvh4JphA(MaterialBottomNavigationActivity materialBottomNavigationActivity, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.item1) {
            Toast.makeText(materialBottomNavigationActivity, "Reselected navigation item 1", 0).show();
        } else if (itemId == R.id.item2) {
            Toast.makeText(materialBottomNavigationActivity, "Reselected navigation item 2", 0).show();
        } else if (itemId == R.id.item3) {
            Toast.makeText(materialBottomNavigationActivity, "Reselected navigation item 3", 0).show();
        }
    }

    /* renamed from: $r8$lambda$yHr5-245u-HRv2wq2B672OxwGzI, reason: not valid java name */
    public static /* synthetic */ void m97$r8$lambda$yHr5245uHRv2wq2B672OxwGzI(MaterialBottomNavigationActivity materialBottomNavigationActivity, View view) {
        int i = 1;
        view.setActivated(!view.isActivated());
        BottomNavigationView bottomNavigationView = materialBottomNavigationActivity.b;
        BottomNavigationView bottomNavigationView2 = null;
        if (bottomNavigationView == null) {
            yks.c("bottomNavigation");
            bottomNavigationView = null;
        }
        int i2 = bottomNavigationView.b.c;
        if (i2 == -1) {
            i = 0;
        } else if (i2 != 0) {
            i = i2 != 1 ? -1 : 2;
        }
        BottomNavigationView bottomNavigationView3 = materialBottomNavigationActivity.b;
        if (bottomNavigationView3 == null) {
            yks.c("bottomNavigation");
        } else {
            bottomNavigationView2 = bottomNavigationView3;
        }
        bottomNavigationView2.n(i);
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_bottom_navigation);
        this.a = (MaterialButton) findViewById(R.id.labelVisibilityModeButton);
        this.b = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        this.c = (MaterialButton) findViewById(R.id.horizontalTranslationEnabledButton);
        this.d = (MaterialButton) findViewById(R.id.badgingEnabledButton);
        this.e = (MaterialButton) findViewById(R.id.badgeGravityButton);
        MaterialButton materialButton = this.a;
        BottomNavigationView bottomNavigationView = null;
        byte b = 0;
        if (materialButton == null) {
            yks.c("labelVisibilityModeButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new ize(this, 16));
        MaterialButton materialButton2 = this.c;
        if (materialButton2 == null) {
            yks.c("horizontalTranslationEnabledButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new ize(this, 17));
        MaterialButton materialButton3 = this.d;
        if (materialButton3 == null) {
            yks.c("badgingEnabledButton");
            materialButton3 = null;
        }
        materialButton3.setOnClickListener(new ize(this, 18));
        MaterialButton materialButton4 = this.e;
        if (materialButton4 == null) {
            yks.c("badgeGravityButton");
            materialButton4 = null;
        }
        materialButton4.setOnClickListener(new ize(this, 19));
        BottomNavigationView bottomNavigationView2 = this.b;
        if (bottomNavigationView2 == null) {
            yks.c("bottomNavigation");
            bottomNavigationView2 = null;
        }
        bottomNavigationView2.h(R.menu.alt_bottom_navigation);
        BottomNavigationView bottomNavigationView3 = this.b;
        if (bottomNavigationView3 == null) {
            yks.c("bottomNavigation");
            bottomNavigationView3 = null;
        }
        bottomNavigationView3.d = new swh() { // from class: izi
            @Override // defpackage.swh
            public final boolean dT(MenuItem menuItem) {
                return MaterialBottomNavigationActivity.m96$r8$lambda$g27T_Nbd1DVhKUoDAy5MAMvVyQ(this.a, menuItem);
            }
        };
        BottomNavigationView bottomNavigationView4 = this.b;
        if (bottomNavigationView4 == null) {
            yks.c("bottomNavigation");
            bottomNavigationView4 = null;
        }
        bottomNavigationView4.e = new pku(this, b == true ? 1 : 0);
        BottomNavigationView bottomNavigationView5 = this.b;
        if (bottomNavigationView5 == null) {
            yks.c("bottomNavigation");
        } else {
            bottomNavigationView = bottomNavigationView5;
        }
        bottomNavigationView.n(0);
    }
}
