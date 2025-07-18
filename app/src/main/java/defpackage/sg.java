package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sg implements nc {
    final Toolbar a;
    CharSequence b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private kw m;
    private int n;
    private final Drawable o;

    public sg(Toolbar toolbar) {
        this.n = 0;
        this.a = toolbar;
        this.b = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.j = this.b != null;
        this.i = toolbar.getNavigationIcon();
        rv rvVarF = rv.f(toolbar.getContext(), null, hs.a, R.attr.actionBarStyle, 0);
        Drawable drawableB = rvVarF.b(15);
        this.o = drawableB;
        CharSequence text = rvVarF.b.getText(27);
        if (!TextUtils.isEmpty(text)) {
            n(text);
        }
        CharSequence text2 = rvVarF.b.getText(25);
        if (!TextUtils.isEmpty(text2)) {
            this.k = text2;
            if ((this.e & 8) != 0) {
                toolbar.m(text2);
            }
        }
        Drawable drawableB2 = rvVarF.b(20);
        if (drawableB2 != null) {
            this.h = drawableB2;
            F();
        }
        Drawable drawableB3 = rvVarF.b(17);
        if (drawableB3 != null) {
            this.g = drawableB3;
            F();
        }
        if (this.i == null && drawableB != null) {
            this.i = drawableB;
            E();
        }
        i(rvVarF.b.getInt(10, 0));
        int resourceId = rvVarF.b.getResourceId(9, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
            View view = this.f;
            if (view != null && (this.e & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f = viewInflate;
            if (viewInflate != null && (this.e & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            i(this.e | 16);
        }
        int layoutDimension = rvVarF.b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int dimensionPixelOffset = rvVarF.b.getDimensionPixelOffset(7, -1);
        int dimensionPixelOffset2 = rvVarF.b.getDimensionPixelOffset(3, -1);
        if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
            int iMax = Math.max(dimensionPixelOffset, 0);
            int iMax2 = Math.max(dimensionPixelOffset2, 0);
            toolbar.f();
            toolbar.l.a(iMax, iMax2);
        }
        int resourceId2 = rvVarF.b.getResourceId(28, 0);
        if (resourceId2 != 0) {
            Context context = toolbar.getContext();
            toolbar.i = resourceId2;
            TextView textView = toolbar.b;
            if (textView != null) {
                textView.setTextAppearance(context, resourceId2);
            }
        }
        int resourceId3 = rvVarF.b.getResourceId(26, 0);
        if (resourceId3 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.j = resourceId3;
            TextView textView2 = toolbar.c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, resourceId3);
            }
        }
        int resourceId4 = rvVarF.b.getResourceId(22, 0);
        if (resourceId4 != 0) {
            toolbar.setPopupTheme(resourceId4);
        }
        rvVarF.b.recycle();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i = this.n;
                this.l = i != 0 ? toolbar.getContext().getString(i) : null;
                D();
            }
        }
        this.l = toolbar.getNavigationContentDescription();
        se seVar = new se(this);
        toolbar.h();
        toolbar.d.setOnClickListener(seVar);
    }

    private final void C(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.o(charSequence);
            if (this.j) {
                ahj.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void D() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.n);
            } else {
                this.a.k(this.l);
            }
        }
    }

    private final void E() {
        if ((this.e & 4) == 0) {
            this.a.l(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.l(drawable);
    }

    private final void F() {
        Drawable drawable;
        int i = this.e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.i(drawable);
    }

    @Override // defpackage.nc
    public final void A() {
        this.a.requestLayout();
    }

    @Override // defpackage.nc
    public final void B() {
        this.h = null;
        F();
    }

    @Override // defpackage.nc
    public final int a() {
        return this.e;
    }

    @Override // defpackage.nc
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.nc
    public final ahw c(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        ahw ahwVarD = ahj.d(this.a);
        ahwVarD.b(f);
        ahwVarD.c(j);
        ahwVarD.d(new sf(this, i));
        return ahwVarD;
    }

    @Override // defpackage.nc
    public final CharSequence d() {
        return this.a.getTitle();
    }

    @Override // defpackage.nc
    public final void e() {
        this.a.d();
    }

    @Override // defpackage.nc
    public final void f() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.i();
        }
    }

    @Override // defpackage.nc
    public final void g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.nc
    public final void h() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.nc
    public final void i(int i) {
        View view;
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    D();
                }
                E();
            }
            if ((i2 & 3) != 0) {
                F();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    Toolbar toolbar = this.a;
                    toolbar.o(this.b);
                    toolbar.m(this.k);
                } else {
                    Toolbar toolbar2 = this.a;
                    toolbar2.o(null);
                    toolbar2.m(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.nc
    public final void j(int i) {
        Drawable drawableC;
        if (i != 0) {
            drawableC = ra.e().c(this.a.getContext(), i);
        } else {
            drawableC = null;
        }
        this.g = drawableC;
        F();
    }

    @Override // defpackage.nc
    public final void k(int i) {
        Drawable drawableC;
        if (i != 0) {
            drawableC = ra.e().c(this.a.getContext(), i);
        } else {
            drawableC = null;
        }
        this.h = drawableC;
        F();
    }

    @Override // defpackage.nc
    public final void l(Menu menu, jv jvVar) {
        if (this.m == null) {
            this.m = new kw(this.a.getContext());
        }
        kw kwVar = this.m;
        kwVar.e = jvVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.g();
        jj jjVar = toolbar.a.a;
        if (jjVar == menu) {
            return;
        }
        if (jjVar != null) {
            jjVar.k(toolbar.p);
            jjVar.k(toolbar.q);
        }
        if (toolbar.q == null) {
            toolbar.q = new sb(toolbar);
        }
        kwVar.i = true;
        if (menu != null) {
            jj jjVar2 = (jj) menu;
            jjVar2.f(kwVar, toolbar.g);
            jjVar2.f(toolbar.q, toolbar.g);
        } else {
            kwVar.c(toolbar.g, null);
            toolbar.q.c(toolbar.g, null);
            kwVar.l();
            toolbar.q.l();
        }
        toolbar.a.setPopupTheme(toolbar.h);
        toolbar.a.j(kwVar);
        toolbar.p = kwVar;
        toolbar.s();
    }

    @Override // defpackage.nc
    public final void m() {
        this.d = true;
    }

    @Override // defpackage.nc
    public final void n(CharSequence charSequence) {
        this.j = true;
        C(charSequence);
    }

    @Override // defpackage.nc
    public final void o(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.nc
    public final void p(Window.Callback callback) {
        this.c = callback;
    }

    @Override // defpackage.nc
    public final void q(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        C(charSequence);
    }

    @Override // defpackage.nc
    public final boolean r() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.nc
    public final boolean s() {
        return this.a.t();
    }

    @Override // defpackage.nc
    public final boolean t() {
        kw kwVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (kwVar = actionMenuView.c) == null || !kwVar.n()) ? false : true;
    }

    @Override // defpackage.nc
    public final boolean u() {
        kw kwVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (kwVar = actionMenuView.c) == null) {
            return false;
        }
        return kwVar.l != null || kwVar.o();
    }

    @Override // defpackage.nc
    public final boolean v() {
        return this.a.u();
    }

    @Override // defpackage.nc
    public final boolean w() {
        return this.a.v();
    }

    @Override // defpackage.nc
    public final void x() {
    }

    @Override // defpackage.nc
    public final void y() {
    }

    @Override // defpackage.nc
    public final void z() {
    }
}
