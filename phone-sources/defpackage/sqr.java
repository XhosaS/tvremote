package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqr {
    public final MaterialButton a;
    public szq b;
    public tae c;
    public dhe d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public boolean r;
    public int t;
    private Drawable u;
    private LayerDrawable v;
    private zft w;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean s = true;

    public sqr(MaterialButton materialButton, szq szqVar) {
        this.a = materialButton;
        this.b = szqVar;
    }

    private final szk j(boolean z) {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (szk) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final szk k() {
        return j(true);
    }

    private final void l() {
        szk szkVarA = a();
        if (szkVarA != null) {
            tae taeVar = this.c;
            if (taeVar != null) {
                szkVarA.R(taeVar);
            } else {
                szkVarA.p(this.b);
            }
            dhe dheVar = this.d;
            if (dheVar != null) {
                szkVarA.L(dheVar);
            }
        }
        szk szkVarK = k();
        if (szkVarK != null) {
            tae taeVar2 = this.c;
            if (taeVar2 != null) {
                szkVarK.R(taeVar2);
            } else {
                szkVarK.p(this.b);
            }
            dhe dheVar2 = this.d;
            if (dheVar2 != null) {
                szkVarK.L(dheVar2);
            }
        }
        LayerDrawable layerDrawable = this.v;
        tab tabVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            tabVar = this.v.getNumberOfLayers() > 2 ? (tab) this.v.getDrawable(2) : (tab) this.v.getDrawable(1);
        }
        if (tabVar != null) {
            tabVar.p(this.b);
            if (tabVar instanceof szk) {
                szk szkVar = (szk) tabVar;
                tae taeVar3 = this.c;
                if (taeVar3 != null) {
                    szkVar.R(taeVar3);
                }
                dhe dheVar3 = this.d;
                if (dheVar3 != null) {
                    szkVar.L(dheVar3);
                }
            }
        }
    }

    public final szk a() {
        return j(false);
    }

    public final void b() {
        this.p = true;
        MaterialButton materialButton = this.a;
        materialButton.setSupportBackgroundTintList(this.l);
        materialButton.setSupportBackgroundTintMode(this.k);
    }

    public final void c(dhe dheVar) {
        this.d = dheVar;
        if (this.c != null) {
            l();
        }
    }

    public final void d(szq szqVar) {
        this.b = szqVar;
        this.c = null;
        l();
    }

    public final void e(tae taeVar) {
        this.c = taeVar;
        l();
    }

    public final void f(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.g;
        int i4 = this.h;
        this.h = i2;
        this.g = i;
        if (!this.p) {
            g();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void g() {
        szk szkVar = new szk(this.b);
        tae taeVar = this.c;
        if (taeVar != null) {
            szkVar.R(taeVar);
        }
        dhe dheVar = this.d;
        if (dheVar != null) {
            szkVar.L(dheVar);
        }
        zft zftVar = this.w;
        if (zftVar != null) {
            szkVar.C = zftVar;
        }
        MaterialButton materialButton = this.a;
        szkVar.J(materialButton.getContext());
        szkVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            szkVar.setTintMode(mode);
        }
        szkVar.T(this.j, this.m);
        szk szkVar2 = new szk(this.b);
        tae taeVar2 = this.c;
        if (taeVar2 != null) {
            szkVar2.R(taeVar2);
        }
        dhe dheVar2 = this.d;
        if (dheVar2 != null) {
            szkVar2.L(dheVar2);
        }
        szkVar2.setTint(0);
        szkVar2.S(this.j, this.o ? sip.c(materialButton, R.attr.colorSurface) : 0);
        szk szkVar3 = new szk(this.b);
        this.u = szkVar3;
        tae taeVar3 = this.c;
        if (taeVar3 != null) {
            szkVar3.R(taeVar3);
        }
        dhe dheVar3 = this.d;
        if (dheVar3 != null) {
            ((szk) this.u).L(dheVar3);
        }
        this.u.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(syj.b(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{szkVar2, szkVar}), this.e, this.g, this.f, this.h), this.u);
        this.v = rippleDrawable;
        materialButton.o(rippleDrawable);
        szk szkVarA = a();
        if (szkVarA != null) {
            szkVarA.M(this.t);
            szkVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void h() {
        szk szkVarA = a();
        szk szkVarK = k();
        if (szkVarA != null) {
            szkVarA.T(this.j, this.m);
            if (szkVarK != null) {
                szkVarK.S(this.j, this.o ? sip.c(this.a, R.attr.colorSurface) : 0);
            }
        }
    }

    public final void i(zft zftVar) {
        this.w = zftVar;
        szk szkVarA = a();
        if (szkVarA != null) {
            szkVarA.C = zftVar;
        }
    }
}
