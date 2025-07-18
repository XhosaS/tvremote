package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emg {
    public final dze a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ebr i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public emg(dze dzeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, ebr ebrVar, boolean z, boolean z2, boolean z3) {
        this.a = dzeVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = ebrVar;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public final long a(long j) {
        return edt.A(j, this.e);
    }

    public final elt b() {
        boolean z = this.c == 1;
        boolean z2 = this.l;
        return new elt(this.g, this.e, this.f, z2, z, this.h);
    }
}
