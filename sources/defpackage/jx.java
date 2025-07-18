package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jx {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    public boolean e;
    public fa f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private final Drawable o;

    public jx(Toolbar toolbar) {
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.p;
        this.l = toolbar.q;
        this.k = this.c != null;
        this.j = toolbar.e();
        aps apsVarR = aps.r(toolbar.getContext(), null, cu.a, R.attr.actionBarStyle, 0);
        Drawable drawableI = apsVarR.i(15);
        this.o = drawableI;
        CharSequence charSequenceK = apsVarR.k(27);
        if (!TextUtils.isEmpty(charSequenceK)) {
            d(charSequenceK);
        }
        CharSequence charSequenceK2 = apsVarR.k(25);
        if (!TextUtils.isEmpty(charSequenceK2)) {
            this.l = charSequenceK2;
            if ((this.b & 8) != 0) {
                toolbar.r(charSequenceK2);
            }
        }
        Drawable drawableI2 = apsVarR.i(20);
        if (drawableI2 != null) {
            c(drawableI2);
        }
        Drawable drawableI3 = apsVarR.i(17);
        if (drawableI3 != null) {
            this.h = drawableI3;
            k();
        }
        if (this.j == null && drawableI != null) {
            this.j = drawableI;
            j();
        }
        b(apsVarR.d(10, 0));
        int iG = apsVarR.g(9, 0);
        if (iG != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iG, (ViewGroup) toolbar, false);
            View view = this.g;
            if (view != null && (this.b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.g = viewInflate;
            if (viewInflate != null && (this.b & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            b(this.b | 16);
        }
        int iF = apsVarR.f(13, 0);
        if (iF > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = iF;
            toolbar.setLayoutParams(layoutParams);
        }
        int iB = apsVarR.b(7, -1);
        int iB2 = apsVarR.b(3, -1);
        if (iB >= 0 || iB2 >= 0) {
            int iMax = Math.max(iB, 0);
            int iMax2 = Math.max(iB2, 0);
            toolbar.k();
            toolbar.o.a(iMax, iMax2);
        }
        int iG2 = apsVarR.g(28, 0);
        if (iG2 != 0) {
            Context context = toolbar.getContext();
            toolbar.l = iG2;
            TextView textView = toolbar.b;
            if (textView != null) {
                textView.setTextAppearance(context, iG2);
            }
        }
        int iG3 = apsVarR.g(26, 0);
        if (iG3 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.m = iG3;
            TextView textView2 = toolbar.c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, iG3);
            }
        }
        int iG4 = apsVarR.g(22, 0);
        if (iG4 != 0) {
            toolbar.q(iG4);
        }
        apsVarR.m();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i = this.n;
                this.m = i != 0 ? a().getString(i) : null;
                i();
            }
        }
        this.m = toolbar.h();
        jv jvVar = new jv(this);
        toolbar.m();
        toolbar.d.setOnClickListener(jvVar);
    }

    private final void h(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.s(charSequence);
            if (this.k) {
                qv.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void i() {
        if ((this.b & 4) != 0) {
            if (!TextUtils.isEmpty(this.m)) {
                this.a.o(this.m);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.o(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void j() {
        if ((this.b & 4) == 0) {
            this.a.p(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.p(drawable);
    }

    private final void k() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    i();
                }
                j();
            }
            if ((i2 & 3) != 0) {
                k();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    Toolbar toolbar = this.a;
                    toolbar.s(this.c);
                    toolbar.r(this.l);
                } else {
                    Toolbar toolbar2 = this.a;
                    toolbar2.s(null);
                    toolbar2.r(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public final void c(Drawable drawable) {
        this.i = drawable;
        k();
    }

    public final void d(CharSequence charSequence) {
        this.k = true;
        h(charSequence);
    }

    public final void e(int i) {
        this.a.setVisibility(i);
    }

    public final void f(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        h(charSequence);
    }

    public final asv g(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        asv asvVarS = qv.s(this.a);
        asvVarS.P(f);
        asvVarS.Q(j);
        asvVarS.R(new jw(this, i));
        return asvVarS;
    }
}
