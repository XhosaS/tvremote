package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzi extends tyu {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    private final void f(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = tzj.g(this.a, tzj.h((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.tyu
    public final void a(char c) {
        f(2, c);
    }

    @Override // defpackage.tyu, defpackage.tza
    public final void c(byte[] bArr, int i) {
        int i2 = 0;
        sij.w(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            f(4, tzj.f(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            f(1, bArr[i2] & 255);
            i2++;
        }
    }

    @Override // defpackage.tza
    public final tyy m() {
        a.ab(!this.e);
        this.e = true;
        int iH = this.a ^ tzj.h((int) this.b);
        this.a = iH;
        return tzj.i(iH, this.d);
    }
}
