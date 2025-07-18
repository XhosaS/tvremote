package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wet implements agux {
    final /* synthetic */ agvd a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ wev d;
    final /* synthetic */ aagy e;

    public wet(agvd agvdVar, String str, int i, wev wevVar, aagy aagyVar) {
        this.a = agvdVar;
        this.b = str;
        this.c = i;
        this.d = wevVar;
        this.e = aagyVar;
    }

    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        String[] strArr;
        abvo abvoVar;
        aagy aagyVar = this.e;
        Set set = this.d.e;
        byte[] bArrB = (byte[]) obj;
        Integer numValueOf = Integer.valueOf(this.c);
        if (aagyVar != null) {
            abxs abxsVar = aagyVar.i;
            abxsVar.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet(agrj.b(((zcp) set).f + Integer.valueOf(abxsVar.size()).intValue()));
            linkedHashSet.addAll(set);
            agqq.k(linkedHashSet, abxsVar);
            strArr = (String[]) agqq.s(linkedHashSet).toArray(new String[0]);
        } else {
            strArr = (String[]) set.toArray(new String[0]);
        }
        if (bArrB == null) {
            bArrB = null;
            if (aagyVar != null && (abvoVar = aagyVar.j) != null) {
                bArrB = abvoVar.B();
            }
        }
        return this.a.a(this.b, numValueOf, strArr, bArrB);
    }
}
