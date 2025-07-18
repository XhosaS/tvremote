package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kus {
    public ksy a;
    public Uri b;
    public float c;
    public String d;
    public lcc e;
    public tst f;
    public String g;
    public String h;
    public String i;
    public tst j;
    public byte k;

    public kus() {
        throw null;
    }

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null accessibilityText");
        }
        this.i = str;
    }

    public final void b(lcc lccVar) {
        if (lccVar == null) {
            throw new NullPointerException("Null color");
        }
        this.e = lccVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null ctaText");
        }
        this.g = str;
    }

    public final void d() {
        this.c = 1.3333334f;
        this.k = (byte) 1;
    }

    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.b = uri;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null subTitle");
        }
        this.h = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.d = str;
    }

    public kus(byte[] bArr) {
        trk trkVar = trk.a;
        this.f = trkVar;
        this.j = trkVar;
    }
}
