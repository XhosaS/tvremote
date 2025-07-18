package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdv {
    public final wdw a(vzv vzvVar, rgo rgoVar, rml rmlVar) {
        if (rmlVar.d) {
            String str = vzvVar.d;
            str.getClass();
            if (str.length() != 0) {
                String str2 = vzvVar.d;
                if ((Integer.MIN_VALUE & rgoVar.b.memoizedSerializedSize) == 0) {
                    rgoVar.y();
                }
                rgs rgsVar = (rgs) rgoVar.b;
                rgs rgsVar2 = rgs.a;
                str2.getClass();
                rgsVar.b |= 1;
                rgsVar.c = str2;
            }
        } else {
            String str3 = vzvVar.d;
            if ((Integer.MIN_VALUE & rgoVar.b.memoizedSerializedSize) == 0) {
                rgoVar.y();
            }
            rgs rgsVar3 = (rgs) rgoVar.b;
            rgs rgsVar4 = rgs.a;
            str3.getClass();
            rgsVar3.b |= 1;
            rgsVar3.c = str3;
        }
        String str4 = vzvVar.c;
        str4.getClass();
        abvo abvoVar = (vzvVar.b & 4) != 0 ? vzvVar.e : null;
        long j = vzvVar.i;
        abxd abxdVarV = rgoVar.v();
        abxdVarV.getClass();
        return new wdw(str4, abvoVar, j, (rgs) abxdVarV);
    }
}
