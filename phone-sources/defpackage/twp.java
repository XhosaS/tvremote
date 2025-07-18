package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twp extends twr {
    public final int[] a;
    public final int b;
    private final twa c;
    private final twa d;

    public twp(twa twaVar, twa twaVar2) {
        int iH;
        this.c = twaVar;
        this.d = twaVar2;
        int iB = twaVar2.b();
        int i = 0;
        a.aD(iB <= 28, "metadata size too large");
        int[] iArr = new int[iB];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            tuy tuyVarE = e(i);
            long j2 = tuyVarE.d | j;
            if (j2 != j || (iH = h(tuyVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = tuyVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(tuy tuyVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (tuyVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.twr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.twr
    public final Object b(tuy tuyVar) {
        a.aD(!tuyVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(tuyVar, iArr, this.b);
        if (iH >= 0) {
            return tuyVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.twr
    public final Set c() {
        return new twn(this);
    }

    @Override // defpackage.twr
    public final void d(twh twhVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            tuy tuyVarE = e(i2 & 31);
            if (tuyVarE.b) {
                twhVar.b(tuyVarE, new two(this, tuyVarE, i2), obj);
            } else {
                twhVar.a(tuyVarE, tuyVarE.c(f(i2)), obj);
            }
        }
    }

    public final tuy e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
