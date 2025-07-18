package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkh {
    public final bjx a;
    public final bjx b;
    final bjx c;
    final bjx d;
    final bjz e;
    final bjz f;
    final bjz g;
    final bjz h;
    final xo i;
    final xo j;
    final xo k;
    final xo l;

    public bkh() {
        this.i = new bkf();
        this.j = new bkf();
        this.k = new bkf();
        this.l = new bkf();
        this.a = new bju(0.0f);
        this.b = new bju(0.0f);
        this.c = new bju(0.0f);
        this.d = new bju(0.0f);
        this.e = new bjz();
        this.f = new bjz();
        this.g = new bjz();
        this.h = new bjz();
    }

    public static bjx a(TypedArray typedArray, int i, bjx bjxVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new bju(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new bke(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bjxVar;
    }

    public static bkg b(Context context, int i, int i2, bjx bjxVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(bkd.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            bjx bjxVarA = a(typedArrayObtainStyledAttributes, 5, bjxVar);
            bjx bjxVarA2 = a(typedArrayObtainStyledAttributes, 8, bjxVarA);
            bjx bjxVarA3 = a(typedArrayObtainStyledAttributes, 9, bjxVarA);
            bjx bjxVarA4 = a(typedArrayObtainStyledAttributes, 7, bjxVarA);
            bjx bjxVarA5 = a(typedArrayObtainStyledAttributes, 6, bjxVarA);
            bkg bkgVar = new bkg();
            bkgVar.d(bjz.k(i4));
            bkgVar.a = bjxVarA2;
            bkgVar.e(bjz.k(i5));
            bkgVar.b = bjxVarA3;
            bkgVar.c(bjz.k(i6));
            bkgVar.c = bjxVarA4;
            bkgVar.b(bjz.k(i7));
            bkgVar.d = bjxVarA5;
            return bkgVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static bkg c(Context context, AttributeSet attributeSet, int i, int i2) {
        bju bjuVar = new bju(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkd.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, bjuVar);
    }

    public final boolean d() {
        return (this.j instanceof bkf) && (this.i instanceof bkf) && (this.k instanceof bkf) && (this.l instanceof bkf);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.h.getClass().equals(bjz.class) && this.f.getClass().equals(bjz.class) && this.e.getClass().equals(bjz.class) && this.g.getClass().equals(bjz.class);
        float fA = this.a.a(rectF);
        return z && ((this.b.a(rectF) > fA ? 1 : (this.b.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0 && (this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final String toString() {
        bjx bjxVar = this.d;
        bjx bjxVar2 = this.c;
        bjx bjxVar3 = this.b;
        return "[" + String.valueOf(this.a) + ", " + String.valueOf(bjxVar3) + ", " + String.valueOf(bjxVar2) + ", " + String.valueOf(bjxVar) + "]";
    }

    public bkh(bkg bkgVar) {
        this.i = bkgVar.i;
        this.j = bkgVar.j;
        this.k = bkgVar.k;
        this.l = bkgVar.l;
        this.a = bkgVar.a;
        this.b = bkgVar.b;
        this.c = bkgVar.c;
        this.d = bkgVar.d;
        this.e = bkgVar.e;
        this.f = bkgVar.f;
        this.g = bkgVar.g;
        this.h = bkgVar.h;
    }
}
