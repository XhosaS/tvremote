package com.google.android.apps.googletv.app.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.BottomAppBarMaterialActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;
import defpackage.fsq;
import defpackage.izc;
import defpackage.sim;
import defpackage.sns;
import defpackage.spf;
import defpackage.sph;
import defpackage.yft;
import defpackage.yga;
import defpackage.ykn;
import defpackage.yks;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BottomAppBarMaterialActivity extends AppCompatActivity {
    private final yft a = new yga(new izc(this, 0));
    private MaterialButton b;
    private MaterialButton c;
    private MaterialButton d;
    private BottomAppBar e;
    private MaterialButton f;
    private MaterialButton g;
    private MaterialButton h;
    private MaterialButton i;
    private MaterialButton j;

    /* renamed from: $r8$lambda$17-w4A2dbR4b-aLflsQa3bMCgbY, reason: not valid java name */
    public static /* synthetic */ void m84$r8$lambda$17w4A2dbR4baLflsQa3bMCgbY(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.c() + bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.u(fI);
    }

    /* renamed from: $r8$lambda$6-c4lZaGBN0pPlMA6wT35PUxFKU, reason: not valid java name */
    public static /* synthetic */ void m85$r8$lambda$6c4lZaGBN0pPlMA6wT35PUxFKU(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.d() - bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.v(fI);
    }

    public static /* synthetic */ void $r8$lambda$DKN106NCzMi2XgcBx6WXqR4GhT4(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        int i = bottomAppBar.e == 0 ? 1 : 0;
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.e = i;
    }

    public static /* synthetic */ void $r8$lambda$EJpYQ4nH1LzyLeMna9TcOFWfwzE(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.d() + bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.v(fI);
    }

    public static /* synthetic */ boolean $r8$lambda$LpmGbtocYMCqNWDypwj3NGV6NlU(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.item1) {
            Toast.makeText(bottomAppBarMaterialActivity, "Clicked menu item 1", 0).show();
            return true;
        }
        if (itemId == R.id.item2) {
            Toast.makeText(bottomAppBarMaterialActivity, "Clicked menu item 2", 0).show();
            return true;
        }
        if (itemId != R.id.item3) {
            return false;
        }
        Toast.makeText(bottomAppBarMaterialActivity, "Clicked menu item 3", 0).show();
        return true;
    }

    public static /* synthetic */ void $r8$lambda$Vh3WA1cSn5D8uZ1kip2YTRB6JOI(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        int i = bottomAppBar.d == 0 ? 1 : 0;
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.m = true;
        bottomAppBar2.p(i, bottomAppBar2.n);
        if (bottomAppBar2.d != i && bottomAppBar2.isLaidOut()) {
            Animator animator = bottomAppBar2.b;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (bottomAppBar2.e == 1) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bottomAppBar2.l(), "translationX", bottomAppBar2.f(i));
                objectAnimatorOfFloat.setDuration(bottomAppBar2.h());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                FloatingActionButton floatingActionButtonL = bottomAppBar2.l();
                if (floatingActionButtonL != null && !floatingActionButtonL.c().n()) {
                    bottomAppBar2.o();
                    floatingActionButtonL.f(new sph(bottomAppBar2, i));
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(sim.k(bottomAppBar2.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.a));
            bottomAppBar2.b = animatorSet;
            bottomAppBar2.b.addListener(new spf(bottomAppBar2));
            bottomAppBar2.b.start();
        }
        bottomAppBar2.d = i;
    }

    /* renamed from: $r8$lambda$kjdKOn1edctAFAJ-jX7mz-umRrM, reason: not valid java name */
    public static /* synthetic */ void m86$r8$lambda$kjdKOn1edctAFAJjX7mzumRrM(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.b() - bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.s(fI);
    }

    public static /* synthetic */ void $r8$lambda$nNiImgrxbHl40KB_xChKXBdI0mQ(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.b() + bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.s(fI);
    }

    public static /* synthetic */ void $r8$lambda$yNWAydPCEFp7IkQ6ChiWt3VUMZc(BottomAppBarMaterialActivity bottomAppBarMaterialActivity, View view) {
        BottomAppBar bottomAppBar = bottomAppBarMaterialActivity.e;
        BottomAppBar bottomAppBar2 = null;
        if (bottomAppBar == null) {
            yks.c("bottomAppBar");
            bottomAppBar = null;
        }
        float fI = ykn.i(bottomAppBar.c() - bottomAppBarMaterialActivity.a(), 0.0f, bottomAppBarMaterialActivity.a() * 16.0f);
        BottomAppBar bottomAppBar3 = bottomAppBarMaterialActivity.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar2 = bottomAppBar3;
        }
        bottomAppBar2.u(fI);
    }

    private final float a() {
        return ((Number) this.a.a()).floatValue();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppCompatDelegate.getDefaultNightMode() == 1) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.material_bottom_app_bar);
        this.b = (MaterialButton) findViewById(R.id.fabAlignmentModeButton);
        this.c = (MaterialButton) findViewById(R.id.fabAnimationModeButton);
        this.d = (MaterialButton) findViewById(R.id.increaseFabCradleMarginButton);
        this.e = (BottomAppBar) findViewById(R.id.bottomAppBar);
        this.f = (MaterialButton) findViewById(R.id.decreaseFabCradleMarginButton);
        this.g = (MaterialButton) findViewById(R.id.increaseFabCradleCornerRadiusButton);
        this.h = (MaterialButton) findViewById(R.id.decreaseFabCradleCornerRadiusButton);
        this.i = (MaterialButton) findViewById(R.id.increaseFabCradleVerticalOffsetButton);
        this.j = (MaterialButton) findViewById(R.id.decreaseFabCradleVerticalOffsetButton);
        MaterialButton materialButton = this.b;
        BottomAppBar bottomAppBar = null;
        if (materialButton == null) {
            yks.c("fabAlignmentModeButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new fsq(this, 12));
        MaterialButton materialButton2 = this.c;
        if (materialButton2 == null) {
            yks.c("fabAnimationModeButton");
            materialButton2 = null;
        }
        materialButton2.setOnClickListener(new fsq(this, 13));
        MaterialButton materialButton3 = this.d;
        if (materialButton3 == null) {
            yks.c("increaseFabCradleMarginButton");
            materialButton3 = null;
        }
        materialButton3.setOnClickListener(new fsq(this, 14));
        MaterialButton materialButton4 = this.f;
        if (materialButton4 == null) {
            yks.c("decreaseFabCradleMarginButton");
            materialButton4 = null;
        }
        materialButton4.setOnClickListener(new fsq(this, 15));
        MaterialButton materialButton5 = this.g;
        if (materialButton5 == null) {
            yks.c("increaseFabCradleCornerRadiusButton");
            materialButton5 = null;
        }
        materialButton5.setOnClickListener(new fsq(this, 16));
        MaterialButton materialButton6 = this.h;
        if (materialButton6 == null) {
            yks.c("decreaseFabCradleCornerRadiusButton");
            materialButton6 = null;
        }
        materialButton6.setOnClickListener(new fsq(this, 17));
        MaterialButton materialButton7 = this.i;
        if (materialButton7 == null) {
            yks.c("increaseFabCradleVerticalOffsetButton");
            materialButton7 = null;
        }
        materialButton7.setOnClickListener(new fsq(this, 18));
        MaterialButton materialButton8 = this.j;
        if (materialButton8 == null) {
            yks.c("decreaseFabCradleVerticalOffsetButton");
            materialButton8 = null;
        }
        materialButton8.setOnClickListener(new fsq(this, 19));
        BottomAppBar bottomAppBar2 = this.e;
        if (bottomAppBar2 == null) {
            yks.c("bottomAppBar");
            bottomAppBar2 = null;
        }
        bottomAppBar2.q(R.menu.menu_bottom_app_bar);
        BottomAppBar bottomAppBar3 = this.e;
        if (bottomAppBar3 == null) {
            yks.c("bottomAppBar");
            bottomAppBar3 = null;
        }
        bottomAppBar3.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: izd
            @Override // android.support.v7.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return BottomAppBarMaterialActivity.$r8$lambda$LpmGbtocYMCqNWDypwj3NGV6NlU(this.a, menuItem);
            }
        });
        BottomAppBar bottomAppBar4 = this.e;
        if (bottomAppBar4 == null) {
            yks.c("bottomAppBar");
        } else {
            bottomAppBar = bottomAppBar4;
        }
        bottomAppBar.setNavigationOnClickListener(new fsq(this, 11));
    }
}
