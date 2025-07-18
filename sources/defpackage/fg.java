package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fg {
    public jo a;
    private final View b;
    private jo e;
    private jo f;
    private int d = -1;
    private final fm c = fm.d();

    public fg(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new jo();
                }
                jo joVar = this.f;
                joVar.a = null;
                joVar.d = false;
                joVar.b = null;
                joVar.c = false;
                int[] iArr = qv.a;
                ColorStateList colorStateListB = qm.b(view);
                if (colorStateListB != null) {
                    joVar.d = true;
                    joVar.a = colorStateListB;
                }
                PorterDuff.Mode modeC = qm.c(view);
                if (modeC != null) {
                    joVar.c = true;
                    joVar.b = modeC;
                }
                if (joVar.d || joVar.c) {
                    jd.g(background, joVar, view.getDrawableState());
                    return;
                }
            }
            jo joVar2 = this.a;
            if (joVar2 != null) {
                jd.g(background, joVar2, view.getDrawableState());
                return;
            }
            jo joVar3 = this.e;
            if (joVar3 != null) {
                jd.g(background, joVar3, view.getDrawableState());
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = cu.y;
        aps apsVarR = aps.r(context, attributeSet, iArr, i, 0);
        qv.k(view, view.getContext(), iArr, attributeSet, (TypedArray) apsVarR.a, i, 0);
        try {
            if (apsVarR.o(0)) {
                this.d = apsVarR.g(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (apsVarR.o(1)) {
                qm.f(view, apsVarR.h(1));
            }
            if (apsVarR.o(2)) {
                int iD = apsVarR.d(2, -1);
                int i2 = hb.a;
                qm.g(view, ii.V(iD, null));
            }
        } finally {
            apsVarR.m();
        }
    }

    final void c(int i) {
        this.d = i;
        fm fmVar = this.c;
        d(fmVar != null ? fmVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new jo();
            }
            jo joVar = this.e;
            joVar.a = colorStateList;
            joVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
