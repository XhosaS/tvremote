package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nae {
    public String a;
    public ieg b;
    public ieg c;
    public ieg d;
    public ieg e;
    public ieg f;
    public ieg g;
    public ieg h;
    public Uri i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public short r;

    public final void a(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null contentRating");
        }
        this.d = iegVar;
    }

    public final void b(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null contentRatingId");
        }
        this.e = iegVar;
    }

    public final void c(boolean z) {
        this.o = z;
        this.r = (short) (this.r | 64);
    }

    public final void d(boolean z) {
        this.k = z;
        this.r = (short) (this.r | 4);
    }

    public final void e(boolean z) {
        this.q = z;
        this.r = (short) (this.r | 256);
    }

    public final void f(float f) {
        this.j = f;
        this.r = (short) (this.r | 2);
    }

    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.i = uri;
    }

    public final void h(boolean z) {
        this.l = z;
        this.r = (short) (this.r | 8);
    }

    public final void i(boolean z) {
        this.m = z;
        this.r = (short) (this.r | 16);
    }

    public final void j(boolean z) {
        this.p = z;
        this.r = (short) (this.r | 128);
    }

    public final void k() {
        this.r = (short) (this.r | 1);
    }

    public final void l(boolean z) {
        this.n = z;
        this.r = (short) (this.r | 32);
    }

    public final void m(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null starRating");
        }
        this.h = iegVar;
    }

    public final void n(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null subtitle");
        }
        this.b = iegVar;
    }

    public final void o(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null subtitleContentDescription");
        }
        this.c = iegVar;
    }

    public final void p(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null tomatoRating");
        }
        this.f = iegVar;
    }

    public final void q(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.g = iegVar;
    }
}
