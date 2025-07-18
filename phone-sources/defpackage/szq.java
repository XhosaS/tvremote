package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szq {
    public static final sze a = new szn(0.5f);
    public final sze b;
    public final sze c;
    public final sze d;
    public final sze e;
    public final szg f;
    final szg g;
    final szg h;
    final szg i;
    public final sin j;
    public final sin k;
    public final sin l;
    public final sin m;

    public szq() {
        this.j = new szo();
        this.k = new szo();
        this.l = new szo();
        this.m = new szo();
        this.b = new szb(0.0f);
        this.c = new szb(0.0f);
        this.d = new szb(0.0f);
        this.e = new szb(0.0f);
        this.f = new szg();
        this.g = new szg();
        this.h = new szg();
        this.i = new szg();
    }

    public static sze a(TypedArray typedArray, int i, sze szeVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new szb(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new szn(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return szeVar;
    }

    public static szp b(Context context, int i, int i2) {
        return h(context, i, i2, new szb(0.0f));
    }

    public static szp c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new szb(0.0f));
    }

    public static szp d(Context context, AttributeSet attributeSet, int i, int i2, sze szeVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, szm.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return h(context, resourceId, resourceId2, szeVar);
    }

    private static szp h(Context context, int i, int i2, sze szeVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(szm.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            sze szeVarA = a(typedArrayObtainStyledAttributes, 5, szeVar);
            sze szeVarA2 = a(typedArrayObtainStyledAttributes, 8, szeVarA);
            sze szeVarA3 = a(typedArrayObtainStyledAttributes, 9, szeVarA);
            sze szeVarA4 = a(typedArrayObtainStyledAttributes, 7, szeVarA);
            sze szeVarA5 = a(typedArrayObtainStyledAttributes, 6, szeVarA);
            szp szpVar = new szp();
            szpVar.k(szg.s(i4));
            szpVar.a = szeVarA2;
            szpVar.l(szg.s(i5));
            szpVar.b = szeVarA3;
            szpVar.j(szg.s(i6));
            szpVar.c = szeVarA4;
            szpVar.i(szg.s(i7));
            szpVar.d = szeVarA5;
            return szpVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final szq e(float f) {
        szp szpVar = new szp(this);
        szpVar.e(f);
        return new szq(szpVar);
    }

    public final boolean f() {
        return (this.k instanceof szo) && (this.j instanceof szo) && (this.l instanceof szo) && (this.m instanceof szo);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.i.getClass().equals(szg.class) && this.g.getClass().equals(szg.class) && this.f.getClass().equals(szg.class) && this.h.getClass().equals(szg.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final String toString() {
        sze szeVar = this.e;
        sze szeVar2 = this.d;
        sze szeVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(szeVar3) + ", " + String.valueOf(szeVar2) + ", " + String.valueOf(szeVar) + "]";
    }

    public szq(szp szpVar) {
        this.j = szpVar.i;
        this.k = szpVar.j;
        this.l = szpVar.k;
        this.m = szpVar.l;
        this.b = szpVar.a;
        this.c = szpVar.b;
        this.d = szpVar.c;
        this.e = szpVar.d;
        this.f = szpVar.e;
        this.g = szpVar.f;
        this.h = szpVar.g;
        this.i = szpVar.h;
    }
}
