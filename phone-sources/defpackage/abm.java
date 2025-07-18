package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abm {
    public final int a;
    public final abk[] b;
    public final int c;
    public final int d;
    private final List e;
    private final int f;
    private final bhi g;

    public abm(int i, abk[] abkVarArr, bhi bhiVar, List list, int i2) {
        this.a = i;
        this.b = abkVarArr;
        this.g = bhiVar;
        this.e = list;
        this.f = i2;
        int iMax = 0;
        for (abk abkVar : abkVarArr) {
            iMax = Math.max(iMax, abkVar.f);
        }
        this.c = iMax;
        this.d = ykn.j(iMax + this.f, 0);
    }

    public final abk[] a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            abk[] abkVarArr = this.b;
            if (i4 >= abkVarArr.length) {
                return abkVarArr;
            }
            abk abkVar = abkVarArr[i4];
            long j = ((aat) this.e.get(i5)).a;
            abkVar.k(i, ((int[]) this.g.b)[i6], i2, i3, this.a, i6);
            i6++;
            i4++;
            i5++;
        }
    }
}
