package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class szi extends Drawable.ConstantState {
    public szq a;
    tae b;
    sst c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    public Rect j;
    float k;
    public float l;
    float m;
    int n;
    float o;
    float p;
    float q;
    int r;
    public int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public szi(szi sziVar) {
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
        this.a = sziVar.a;
        this.b = sziVar.b;
        this.c = sziVar.c;
        this.m = sziVar.m;
        this.d = sziVar.d;
        this.e = sziVar.e;
        this.f = sziVar.f;
        this.i = sziVar.i;
        this.h = sziVar.h;
        this.n = sziVar.n;
        this.k = sziVar.k;
        this.t = sziVar.t;
        this.r = sziVar.r;
        boolean z = sziVar.v;
        this.v = false;
        this.l = sziVar.l;
        this.o = sziVar.o;
        this.p = sziVar.p;
        float f = sziVar.q;
        this.q = 0.0f;
        this.s = sziVar.s;
        int i = sziVar.u;
        this.u = 0;
        ColorStateList colorStateList = sziVar.g;
        this.g = null;
        this.w = sziVar.w;
        Rect rect = sziVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        szk szkVar = new szk(this);
        szkVar.w = true;
        szkVar.x = true;
        return szkVar;
    }

    public szi(szq szqVar) {
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
        this.a = szqVar;
        this.c = null;
    }
}
