package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uzl {
    public final MaterialButton a;
    public vbw b;
    public vck c;
    public aqo d;
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
    public boolean q;
    public int s;
    private Drawable t;
    private LayerDrawable u;
    private uzg v;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public uzl(MaterialButton materialButton, vbw vbwVar) {
        this.a = materialButton;
        this.b = vbwVar;
    }

    public final vbq a(boolean z) {
        LayerDrawable layerDrawable = this.u;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (vbq) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        MaterialButton materialButton = this.a;
        materialButton.f(this.l);
        materialButton.g(this.k);
    }

    public final void c(vbw vbwVar) {
        this.b = vbwVar;
        this.c = null;
        f();
    }

    public final void d(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.g;
        int i4 = this.h;
        this.h = i2;
        this.g = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        vbq vbqVar = new vbq(this.b);
        vck vckVar = this.c;
        if (vckVar != null) {
            vbqVar.n(vckVar);
        }
        aqo aqoVar = this.d;
        if (aqoVar != null) {
            vbqVar.j(aqoVar);
        }
        uzg uzgVar = this.v;
        if (uzgVar != null) {
            vbqVar.i = uzgVar;
        }
        MaterialButton materialButton = this.a;
        vbqVar.i(materialButton.getContext());
        vbqVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            vbqVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        vbqVar.p(f);
        vbqVar.o(colorStateList);
        vbq vbqVar2 = new vbq(this.b);
        vck vckVar2 = this.c;
        if (vckVar2 != null) {
            vbqVar2.n(vckVar2);
        }
        aqo aqoVar2 = this.d;
        if (aqoVar2 != null) {
            vbqVar2.j(aqoVar2);
        }
        vbqVar2.setTintList(ColorStateList.valueOf(0));
        vbqVar2.r(this.j);
        vbq vbqVar3 = new vbq(this.b);
        this.t = vbqVar3;
        vck vckVar3 = this.c;
        if (vckVar3 != null) {
            vbqVar3.n(vckVar3);
        }
        aqo aqoVar3 = this.d;
        if (aqoVar3 != null) {
            ((vbq) this.t).j(aqoVar3);
        }
        ((vbq) this.t).setTintList(ColorStateList.valueOf(-1));
        RippleDrawable rippleDrawable = new RippleDrawable(vbb.a(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{vbqVar2, vbqVar}), this.e, this.g, this.f, this.h), this.t);
        this.u = rippleDrawable;
        materialButton.d(rippleDrawable);
        vbq vbqVarA = a(false);
        if (vbqVarA != null) {
            vbqVarA.k(this.s);
            vbqVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        vbq vbqVarA = a(false);
        if (vbqVarA != null) {
            vck vckVar = this.c;
            if (vckVar != null) {
                vbqVarA.n(vckVar);
            } else {
                vbqVarA.e(this.b);
            }
            aqo aqoVar = this.d;
            if (aqoVar != null) {
                vbqVarA.j(aqoVar);
            }
        }
        vbq vbqVarA2 = a(true);
        if (vbqVarA2 != null) {
            vck vckVar2 = this.c;
            if (vckVar2 != null) {
                vbqVarA2.n(vckVar2);
            } else {
                vbqVarA2.e(this.b);
            }
            aqo aqoVar2 = this.d;
            if (aqoVar2 != null) {
                vbqVarA2.j(aqoVar2);
            }
        }
        LayerDrawable layerDrawable = this.u;
        vch vchVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            vchVar = this.u.getNumberOfLayers() > 2 ? (vch) this.u.getDrawable(2) : (vch) this.u.getDrawable(1);
        }
        if (vchVar != null) {
            vchVar.e(this.b);
            if (vchVar instanceof vbq) {
                vbq vbqVar = (vbq) vchVar;
                vck vckVar3 = this.c;
                if (vckVar3 != null) {
                    vbqVar.n(vckVar3);
                }
                aqo aqoVar3 = this.d;
                if (aqoVar3 != null) {
                    vbqVar.j(aqoVar3);
                }
            }
        }
    }

    public final void g() {
        vbq vbqVarA = a(false);
        vbq vbqVarA2 = a(true);
        if (vbqVarA != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            vbqVarA.p(f);
            vbqVarA.o(colorStateList);
            if (vbqVarA2 != null) {
                vbqVarA2.r(this.j);
            }
        }
    }

    public final void h(uzg uzgVar) {
        this.v = uzgVar;
        vbq vbqVarA = a(false);
        if (vbqVarA != null) {
            vbqVarA.i = uzgVar;
        }
    }
}
