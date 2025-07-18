package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbo extends Drawable.ConstantState {
    public vbw a;
    vck b;
    uzy c;
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

    public vbo(vbo vboVar) {
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
        this.a = vboVar.a;
        this.b = vboVar.b;
        this.c = vboVar.c;
        this.m = vboVar.m;
        this.d = vboVar.d;
        this.e = vboVar.e;
        this.f = vboVar.f;
        this.i = vboVar.i;
        this.h = vboVar.h;
        this.n = vboVar.n;
        this.k = vboVar.k;
        this.t = vboVar.t;
        int i = vboVar.r;
        this.r = 0;
        boolean z = vboVar.v;
        this.v = false;
        this.l = vboVar.l;
        this.o = vboVar.o;
        this.p = vboVar.p;
        float f = vboVar.q;
        this.q = 0.0f;
        this.s = vboVar.s;
        int i2 = vboVar.u;
        this.u = 0;
        ColorStateList colorStateList = vboVar.g;
        this.g = null;
        this.w = vboVar.w;
        Rect rect = vboVar.j;
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
        vbq vbqVar = new vbq(this);
        vbqVar.e = true;
        vbqVar.f = true;
        return vbqVar;
    }

    public vbo(vbw vbwVar) {
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
        this.a = vbwVar;
        this.c = null;
    }
}
