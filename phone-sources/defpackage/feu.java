package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class feu implements feq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public feu(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    @Override // defpackage.feq
    public final int a() {
        return 1752331379;
    }

    public final int b() {
        int i = this.a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        edb.e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    public final long c() {
        return edt.B(this.d, 1000000 * this.b, this.c);
    }
}
