package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebz {
    public CharSequence a;
    public Layout.Alignment b;
    public Layout.Alignment c;
    public int d;
    public float e;
    public int f;
    public float g;
    public float h;
    public int i;
    public float j;
    public int k;
    private Bitmap l;
    private float m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private int r;

    public ebz() {
        this.a = null;
        this.l = null;
        this.b = null;
        this.c = null;
        this.m = -3.4028235E38f;
        this.n = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.p = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.q = false;
        this.r = -16777216;
        this.i = Integer.MIN_VALUE;
    }

    public final eca a() {
        return new eca(this.a, this.b, this.c, this.l, this.m, this.n, this.d, this.e, this.f, this.o, this.p, this.g, this.h, this.q, this.r, this.i, this.j, this.k);
    }

    public final void b() {
        this.q = false;
    }

    public final void c(Bitmap bitmap) {
        this.l = bitmap;
        this.a = null;
    }

    public final void d(float f, int i) {
        this.m = f;
        this.n = i;
    }

    public final void e(CharSequence charSequence) {
        this.a = charSequence;
        this.l = null;
    }

    public final void f(float f, int i) {
        this.p = f;
        this.o = i;
    }

    public final void g(int i) {
        this.r = i;
        this.q = true;
    }

    public ebz(eca ecaVar) {
        this.a = ecaVar.u;
        this.l = ecaVar.x;
        this.b = ecaVar.v;
        this.c = ecaVar.w;
        this.m = ecaVar.y;
        this.n = ecaVar.z;
        this.d = ecaVar.A;
        this.e = ecaVar.B;
        this.f = ecaVar.C;
        this.o = ecaVar.H;
        this.p = ecaVar.I;
        this.g = ecaVar.D;
        this.h = ecaVar.E;
        this.q = ecaVar.F;
        this.r = ecaVar.G;
        this.i = ecaVar.J;
        this.j = ecaVar.K;
        this.k = ecaVar.L;
    }
}
