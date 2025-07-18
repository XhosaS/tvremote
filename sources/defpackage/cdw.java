package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdw extends cdy {
    public final int[] a;
    public final int b;
    private final cdh c;
    private final cdh d;

    public cdw(cdh cdhVar, cdh cdhVar2) {
        int iH;
        this.c = cdhVar;
        this.d = cdhVar2;
        int iB = cdhVar2.b();
        int i = 0;
        ces.j(iB <= 28, "metadata size too large");
        int[] iArr = new int[iB];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            cck cckVarE = e(i);
            long j2 = cckVarE.d | j;
            if (j2 != j || (iH = h(cckVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = cckVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(cck cckVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (cckVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.cdy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cdy
    public final Object b(cck cckVar) {
        ces.j(!cckVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(cckVar, iArr, this.b);
        if (iH >= 0) {
            return cckVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.cdy
    public final Set c() {
        return new cdu(this);
    }

    @Override // defpackage.cdy
    public final void d(cdo cdoVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            cck cckVarE = e(i2 & 31);
            if (cckVarE.b) {
                cdoVar.b(cckVarE, new cdv(this, cckVarE, i2), obj);
            } else {
                cdoVar.a(cckVarE, cckVarE.c(f(i2)), obj);
            }
        }
    }

    public final cck e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
