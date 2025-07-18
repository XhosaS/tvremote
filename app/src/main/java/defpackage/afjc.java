package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjc implements afje {
    final int a;
    final afje[] b;
    private final int c;

    private afjc(int i, afje[] afjeVarArr, int i2) {
        this.a = i;
        this.b = afjeVarArr;
        this.c = i2;
    }

    static afje c(afje afjeVar, int i, afje afjeVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = (i2 >>> i3) & 31;
        int i6 = 1 << i4;
        int i7 = 1 << i5;
        if (i6 == i7) {
            afje afjeVarC = c(afjeVar, i, afjeVar2, i2, i3 + 5);
            return new afjc(i6, new afje[]{afjeVarC}, ((afjc) afjeVarC).c);
        }
        afje afjeVar3 = i4 > i5 ? afjeVar : afjeVar2;
        if (i4 > i5) {
            afjeVar = afjeVar2;
        }
        return new afjc(i6 | i7, new afje[]{afjeVar, afjeVar3}, afjeVar.a() + afjeVar3.a());
    }

    @Override // defpackage.afje
    public final int a() {
        return this.c;
    }

    @Override // defpackage.afje
    public final afje b(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int i4 = 1 << ((i >>> i2) & 31);
        int iBitCount = Integer.bitCount((i4 - 1) & i3);
        if ((i3 & i4) != 0) {
            afje[] afjeVarArr = this.b;
            afje[] afjeVarArr2 = (afje[]) Arrays.copyOf(afjeVarArr, afjeVarArr.length);
            afje afjeVarB = afjeVarArr[iBitCount].b(obj, obj2, i, i2 + 5);
            afjeVarArr2[iBitCount] = afjeVarB;
            return new afjc(i3, afjeVarArr2, (this.c + afjeVarB.a()) - afjeVarArr[iBitCount].a());
        }
        int i5 = i3 | i4;
        afje[] afjeVarArr3 = this.b;
        int length = afjeVarArr3.length;
        afje[] afjeVarArr4 = new afje[length + 1];
        System.arraycopy(afjeVarArr3, 0, afjeVarArr4, 0, iBitCount);
        afjeVarArr4[iBitCount] = new afjd(obj, obj2);
        System.arraycopy(afjeVarArr3, iBitCount, afjeVarArr4, iBitCount + 1, length - iBitCount);
        return new afjc(i5, afjeVarArr4, this.c + 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (afje afjeVar : this.b) {
            sb.append(afjeVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
