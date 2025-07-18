package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayq implements coa {
    private final long a;
    private final clx b;
    private final int c;
    private final yjz d;
    private final ayw e;
    private final ayw f;
    private final ayw g;
    private final ayw h;
    private final ayx i;
    private final ayx j;
    private final ayx k;
    private final ayx l;
    private final ayx m;

    public ayq(long j, clx clxVar, int i, yjz yjzVar) {
        this.a = j;
        this.b = clxVar;
        this.c = i;
        this.d = yjzVar;
        int iCu = clxVar.cu(cmb.a(j));
        bkc bkcVar = bkb.j;
        this.e = new axs(bkcVar, bkcVar, iCu);
        bkc bkcVar2 = bkb.l;
        this.f = new axs(bkcVar2, bkcVar2, iCu);
        this.g = new azl(bjz.c);
        this.h = new azl(bjz.d);
        int iCu2 = clxVar.cu(cmb.b(j));
        bkh bkhVar = bkb.m;
        bkh bkhVar2 = bkb.o;
        this.i = new axt(bkhVar, bkhVar2, iCu2);
        this.j = new axt(bkhVar2, bkhVar, iCu2);
        this.k = new axt(bkb.n, bkhVar, iCu2);
        this.l = new azm(bkhVar, i);
        this.m = new azm(bkhVar2, i);
    }

    @Override // defpackage.coa
    public final long a(cmg cmgVar, long j, cmi cmiVar, long j2) {
        cmg cmgVar2;
        long j3;
        char c;
        int iA;
        int iA2;
        int i;
        char c2 = 3;
        ayw[] aywVarArr = new ayw[3];
        aywVarArr[0] = this.e;
        aywVarArr[1] = this.f;
        int i2 = (int) (j >> 32);
        aywVarArr[2] = cmf.a(cmgVar.c()) < i2 / 2 ? this.g : this.h;
        List listS = yfm.s(aywVarArr);
        int size = listS.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                cmgVar2 = cmgVar;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            ayw aywVar = (ayw) listS.get(i3);
            int i4 = (int) (j2 >> 32);
            int i5 = size;
            c = c2;
            j3 = j;
            int i6 = i3;
            cmgVar2 = cmgVar;
            iA = aywVar.a(cmgVar2, j3, i4, cmiVar);
            if (i6 == yfm.q(listS) || (iA >= 0 && i4 + iA <= i2)) {
                break;
            }
            i3 = i6 + 1;
            size = i5;
            c2 = c;
        }
        ayx[] ayxVarArr = new ayx[4];
        ayxVarArr[0] = this.i;
        ayxVarArr[1] = this.j;
        ayxVarArr[2] = this.k;
        int i7 = (int) (j3 & 4294967295L);
        ayxVarArr[c] = cmf.b(cmgVar2.c()) < i7 / 2 ? this.l : this.m;
        List listS2 = yfm.s(ayxVarArr);
        int size2 = listS2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                iA2 = 0;
                break;
            }
            int i9 = i7;
            int i10 = (int) (j2 & 4294967295L);
            iA2 = ((ayx) listS2.get(i8)).a(cmgVar2, j3, i10);
            if (i8 == yfm.q(listS2) || (iA2 >= (i = this.c) && i10 + iA2 <= i9 - i)) {
                break;
            }
            i8++;
            i7 = i9;
        }
        long j4 = (iA << 32) | (iA2 & 4294967295L);
        this.d.a(cmgVar2, clw.z(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayq)) {
            return false;
        }
        ayq ayqVar = (ayq) obj;
        return a.s(this.a, ayqVar.a) && yks.e(this.b, ayqVar.b) && this.c == ayqVar.c && yks.e(this.d, ayqVar.d);
    }

    public final int hashCode() {
        return (((((a.k(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) cmb.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
