package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zbz extends zby {
    transient long[] g;
    private transient int h;
    private transient int i;

    public zbz() {
        super(3);
    }

    private final int q(int i) {
        return (int) (this.g[i] >>> 32);
    }

    private final void r(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            long[] jArr = this.g;
            jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            long[] jArr2 = this.g;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (i << 32);
        }
    }

    @Override // defpackage.zby
    public final int a() {
        int i = this.h;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.zby
    public final int e(int i) {
        int i2 = (int) this.g[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // defpackage.zby
    public final void k(int i, Object obj, int i2, int i3) {
        super.k(i, obj, i2, i3);
        r(this.i, i);
        r(i, -2);
    }

    @Override // defpackage.zby
    public final void l(int i) {
        int i2 = this.c - 1;
        r(q(i), (int) this.g[i]);
        if (i < i2) {
            r(q(i2), i);
            r(i, (int) this.g[i2]);
        }
        super.l(i);
    }

    @Override // defpackage.zby
    public final void m(int i) {
        super.m(i);
        long[] jArr = this.g;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.g = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    @Override // defpackage.zby
    public final void o(int i) {
        super.o(i);
        this.h = -2;
        this.i = -2;
        long[] jArr = new long[i];
        this.g = jArr;
        Arrays.fill(jArr, -1L);
    }

    public zbz(zby zbyVar) {
        o(zbyVar.c);
        int iA = zbyVar.a();
        while (iA != -1) {
            p(zbyVar.i(iA), zbyVar.c(iA));
            iA = zbyVar.e(iA);
        }
    }
}
