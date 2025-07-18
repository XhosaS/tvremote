package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bka extends Drawable.ConstantState {
    public bkh a;
    bku b;
    biv c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    Rect j;
    float k;
    public float l;
    float m;
    int n;
    float o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public bka(bka bkaVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = bkaVar.a;
        this.b = bkaVar.b;
        this.c = bkaVar.c;
        this.m = bkaVar.m;
        this.d = bkaVar.d;
        this.e = bkaVar.e;
        this.f = bkaVar.f;
        this.i = bkaVar.i;
        this.h = bkaVar.h;
        this.n = bkaVar.n;
        this.k = bkaVar.k;
        this.t = bkaVar.t;
        int i = bkaVar.r;
        this.r = 0;
        boolean z = bkaVar.v;
        this.v = false;
        this.l = bkaVar.l;
        this.o = bkaVar.o;
        this.p = bkaVar.p;
        float f = bkaVar.q;
        this.q = 0.0f;
        this.s = bkaVar.s;
        int i2 = bkaVar.u;
        this.u = 0;
        ColorStateList colorStateList = bkaVar.g;
        this.g = null;
        this.w = bkaVar.w;
        Rect rect = bkaVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bkc bkcVar = new bkc(this);
        bkcVar.e = true;
        bkcVar.f = true;
        return bkcVar;
    }

    public bka(bkh bkhVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = bkhVar;
        this.c = null;
    }
}
