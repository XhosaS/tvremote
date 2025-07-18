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
public class le {
    public rt a;
    private final View b;
    private rt e;
    private rt f;
    private int d = -1;
    private final ll c = ll.d();

    public le(View view) {
        this.b = view;
    }

    public final ColorStateList a() {
        rt rtVar = this.a;
        if (rtVar != null) {
            return rtVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode b() {
        rt rtVar = this.a;
        if (rtVar != null) {
            return rtVar.b;
        }
        return null;
    }

    public final void c() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new rt();
                }
                rt rtVar = this.f;
                rtVar.a = null;
                rtVar.d = false;
                rtVar.b = null;
                rtVar.c = false;
                int[] iArr = ahj.a;
                ColorStateList colorStateListC = ahc.c(view);
                if (colorStateListC != null) {
                    rtVar.d = true;
                    rtVar.a = colorStateListC;
                }
                PorterDuff.Mode modeD = ahc.d(view);
                if (modeD != null) {
                    rtVar.c = true;
                    rtVar.b = modeD;
                }
                if (rtVar.d || rtVar.c) {
                    ra.h(background, rtVar, view.getDrawableState());
                    return;
                }
            }
            rt rtVar2 = this.a;
            if (rtVar2 != null) {
                ra.h(background, rtVar2, view.getDrawableState());
                return;
            }
            rt rtVar3 = this.e;
            if (rtVar3 != null) {
                ra.h(background, rtVar3, view.getDrawableState());
            }
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = hs.z;
        rv rvVarF = rv.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = rvVarF.b;
        ahj.m(view, view.getContext(), iArr, attributeSet, typedArray, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.d = typedArray.getResourceId(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    f(colorStateListA);
                }
            }
            if (typedArray.hasValue(1)) {
                ahc.h(view, rvVarF.a(1));
            }
            if (typedArray.hasValue(2)) {
                ahc.i(view, np.a(typedArray.getInt(2, -1), null));
            }
        } finally {
            rvVarF.b.recycle();
        }
    }

    public final void e(int i) {
        this.d = i;
        ll llVar = this.c;
        f(llVar != null ? llVar.a(this.b.getContext(), i) : null);
        c();
    }

    final void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new rt();
            }
            rt rtVar = this.e;
            rtVar.a = colorStateList;
            rtVar.d = true;
        } else {
            this.e = null;
        }
        c();
    }

    public final void g() {
        this.d = -1;
        f(null);
        c();
    }
}
