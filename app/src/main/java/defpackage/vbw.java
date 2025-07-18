package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbw {
    final vbj a;
    final vbj b;
    final vbj c;
    final vbj d;
    public final vbi e;
    public final vbi f;
    final vbi g;
    final vbi h;
    final vbl i;
    final vbl j;
    final vbl k;
    final vbl l;

    public vbw() {
        this.a = new vbu();
        this.b = new vbu();
        this.c = new vbu();
        this.d = new vbu();
        this.e = new vbf(0.0f);
        this.f = new vbf(0.0f);
        this.g = new vbf(0.0f);
        this.h = new vbf(0.0f);
        this.i = new vbl();
        this.j = new vbl();
        this.k = new vbl();
        this.l = new vbl();
    }

    public static vbi a(TypedArray typedArray, int i, vbi vbiVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new vbf(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new vbt(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return vbiVar;
    }

    public static vbv b(Context context, int i, int i2, vbi vbiVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(vbs.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            vbi vbiVarA = a(typedArrayObtainStyledAttributes, 5, vbiVar);
            vbi vbiVarA2 = a(typedArrayObtainStyledAttributes, 8, vbiVarA);
            vbi vbiVarA3 = a(typedArrayObtainStyledAttributes, 9, vbiVarA);
            vbi vbiVarA4 = a(typedArrayObtainStyledAttributes, 7, vbiVarA);
            vbi vbiVarA5 = a(typedArrayObtainStyledAttributes, 6, vbiVarA);
            vbv vbvVar = new vbv();
            vbj vbjVarA = vbr.a(i4);
            vbvVar.a = vbjVarA;
            vbv.a(vbjVarA);
            vbvVar.e = vbiVarA2;
            vbj vbjVarA2 = vbr.a(i5);
            vbvVar.b = vbjVarA2;
            vbv.a(vbjVarA2);
            vbvVar.f = vbiVarA3;
            vbj vbjVarA3 = vbr.a(i6);
            vbvVar.c = vbjVarA3;
            vbv.a(vbjVarA3);
            vbvVar.g = vbiVarA4;
            vbj vbjVarA4 = vbr.a(i7);
            vbvVar.d = vbjVarA4;
            vbv.a(vbjVarA4);
            vbvVar.h = vbiVarA5;
            return vbvVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static vbv f(Context context, AttributeSet attributeSet, int i, int i2) {
        vbf vbfVar = new vbf(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vbs.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, vbfVar);
    }

    public final vbw c(float f) {
        vbv vbvVar = new vbv(this);
        vbvVar.b(f);
        return new vbw(vbvVar);
    }

    public final boolean d() {
        return (this.b instanceof vbu) && (this.a instanceof vbu) && (this.c instanceof vbu) && (this.d instanceof vbu);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(vbl.class) && this.j.getClass().equals(vbl.class) && this.i.getClass().equals(vbl.class) && this.k.getClass().equals(vbl.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final String toString() {
        vbi vbiVar = this.h;
        vbi vbiVar2 = this.g;
        vbi vbiVar3 = this.f;
        return "[" + String.valueOf(this.e) + ", " + String.valueOf(vbiVar3) + ", " + String.valueOf(vbiVar2) + ", " + String.valueOf(vbiVar) + "]";
    }

    public vbw(vbv vbvVar) {
        this.a = vbvVar.a;
        this.b = vbvVar.b;
        this.c = vbvVar.c;
        this.d = vbvVar.d;
        this.e = vbvVar.e;
        this.f = vbvVar.f;
        this.g = vbvVar.g;
        this.h = vbvVar.h;
        this.i = vbvVar.i;
        this.j = vbvVar.j;
        this.k = vbvVar.k;
        this.l = vbvVar.l;
    }
}
