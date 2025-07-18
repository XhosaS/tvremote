package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enm implements ewx {
    public iom a;
    private final dze b;
    private long[] c;
    private boolean d;
    private boolean e;
    private int f;
    private final fse h = new fse();
    private long g = -9223372036854775807L;

    public enm(iom iomVar, dze dzeVar, boolean z) {
        this.b = dzeVar;
        this.a = iomVar;
        this.c = (long[]) iomVar.d;
        f(iomVar, z);
    }

    @Override // defpackage.ewx
    public final int a(long j) {
        int iMax = Math.max(this.f, edt.ax(this.c, j, true));
        int i = iMax - this.f;
        this.f = iMax;
        return i;
    }

    public final void c(long j) {
        int iAx = edt.ax(this.c, j, true);
        this.f = iAx;
        if (!this.d || iAx != this.c.length) {
            j = -9223372036854775807L;
        }
        this.g = j;
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        return true;
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) throws IOException {
        int i2 = this.f;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            ehkVar.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.e) {
            higVar.a = this.b;
            this.e = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrO = this.h.o(((ffu[]) this.a.c)[i2]);
            ehkVar.a(bArrO.length);
            ehkVar.c.put(bArrO);
        }
        ehkVar.e = this.c[i2];
        ehkVar.setFlags(1);
        return -4;
    }

    public final void f(iom iomVar, boolean z) {
        int i = this.f;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.a = iomVar;
        long[] jArr = (long[]) iomVar.d;
        this.c = jArr;
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            c(j2);
        } else if (j != -9223372036854775807L) {
            this.f = edt.ax(jArr, j, false);
        }
    }

    @Override // defpackage.ewx
    public final void b() {
    }
}
