package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cx {
    int a;
    bv b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    dvd h;
    dvd i;

    public cx() {
    }

    public cx(int i, bv bvVar) {
        this.a = i;
        this.b = bvVar;
        this.c = false;
        dvd dvdVar = dvd.e;
        this.h = dvdVar;
        this.i = dvdVar;
    }

    public cx(int i, bv bvVar, byte[] bArr) {
        this.a = i;
        this.b = bvVar;
        this.c = true;
        dvd dvdVar = dvd.e;
        this.h = dvdVar;
        this.i = dvdVar;
    }

    public cx(bv bvVar, dvd dvdVar) {
        this.a = 10;
        this.b = bvVar;
        this.c = false;
        this.h = bvVar.mMaxState;
        this.i = dvdVar;
    }
}
