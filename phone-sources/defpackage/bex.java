package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bex extends bfp {
    public static final bex a = new bex();

    private bex() {
        super(1, 0, 2);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        bac bacVar;
        int iA;
        int i;
        int i2;
        int iA2 = bfsVar.a(0);
        if (bdjVar.m != 0) {
            bau.i("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            bau.i("Parameter offset is out of bounds");
        }
        if (iA2 == 0) {
            return;
        }
        int i3 = bdjVar.o;
        int i4 = bdjVar.q;
        int i5 = bdjVar.p;
        int iA3 = i3;
        while (iA2 > 0) {
            iA3 += bdi.a(bdjVar.b, bdjVar.g(iA3));
            if (iA3 > i5) {
                bau.i("Parameter offset is out of bounds");
            }
            iA2--;
        }
        int iA4 = bdi.a(bdjVar.b, bdjVar.g(iA3));
        int iC = bdjVar.c(bdjVar.b, bdjVar.g(bdjVar.o));
        int iC2 = bdjVar.c(bdjVar.b, bdjVar.g(iA3));
        int i6 = iA3 + iA4;
        int iC3 = bdjVar.c(bdjVar.b, bdjVar.g(i6));
        int i7 = iC3 - iC2;
        bdjVar.C(i7, Math.max(bdjVar.o - 1, 0));
        bdjVar.B(iA4);
        int[] iArr = bdjVar.b;
        int iG = bdjVar.g(i6) * 5;
        yfm.bh(iArr, iArr, bdjVar.g(i3) * 5, iG, (iA4 * 5) + iG);
        if (i7 > 0) {
            Object[] objArr = bdjVar.c;
            int iD = bdjVar.d(iC2 + i7);
            System.arraycopy(objArr, iD, objArr, iC, bdjVar.d(iC3 + i7) - iD);
        }
        int i8 = iC2 + i7;
        int i9 = i8 - iC;
        int i10 = bdjVar.j;
        int i11 = bdjVar.k;
        int length = bdjVar.c.length;
        int i12 = bdjVar.l;
        int i13 = i3 + iA4;
        int i14 = i3;
        while (i14 < i13) {
            int iG2 = bdjVar.g(i14);
            int i15 = i9;
            int iC4 = bdjVar.c(iArr, iG2) - i15;
            if (i12 < iG2) {
                i = iG2;
                i2 = 0;
            } else {
                i = iG2;
                i2 = i10;
            }
            int[] iArr2 = iArr;
            iArr2[(i * 5) + 4] = bdj.T(bdj.T(iC4, i2, i11, length), bdjVar.j, bdjVar.k, bdjVar.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + iA4;
        int iF = bdjVar.f();
        int iB = bdi.b(bdjVar.d, i6, iF);
        ArrayList arrayList = new ArrayList();
        while (iB < bdjVar.d.size() && (iA = bdjVar.a((bacVar = (bac) bdjVar.d.get(iB)))) >= i6 && iA < i16) {
            arrayList.add(bacVar);
        }
        int i17 = i3 - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            bac bacVar2 = (bac) arrayList.get(i18);
            int iA5 = bdjVar.a(bacVar2) + i17;
            if (iA5 >= bdjVar.f) {
                bacVar2.a = -(iF - iA5);
            } else {
                bacVar2.a = iA5;
            }
            bdjVar.d.add(bdi.b(bdjVar.d, iA5, iF), bacVar2);
        }
        if (bdjVar.S(i6, iA4)) {
            bau.i("Unexpectedly removed anchors");
        }
        bdjVar.z(i4, bdjVar.p, i3);
        if (i7 > 0) {
            bdjVar.G(i8, i7, i6 - 1);
        }
    }
}
