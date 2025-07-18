package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ali implements bii {
    public static final ali a = new ali(1);
    private final /* synthetic */ int b;

    public ali(int i) {
        this.b = i;
    }

    @Override // defpackage.bii
    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            obj2.getClass();
            String str = (String) obj2;
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            obj4.getClass();
            long jN = ccf.N(iIntValue, ((Integer) obj4).intValue());
            long j = chb.a;
            obj5.getClass();
            List list2 = (List) obj5;
            Object obj6 = list2.get(0);
            Object obj7 = list2.get(1);
            Object objA = obj6 != null ? alj.a.a(obj6) : null;
            bii biiVar = aig.a;
            obj7.getClass();
            return new aid(str, jN, new bhi((alj) objA, (nou) biiVar.a(obj7)));
        }
        obj.getClass();
        List list3 = (List) obj;
        Object obj8 = list3.get(0);
        obj8.getClass();
        int iIntValue2 = ((Integer) obj8).intValue();
        Object obj9 = list3.get(1);
        obj9.getClass();
        Object obj10 = list3.get(2);
        obj10.getClass();
        String str2 = (String) obj10;
        Object obj11 = list3.get(3);
        obj11.getClass();
        int iIntValue3 = ((Integer) obj11).intValue();
        Object obj12 = list3.get(4);
        obj12.getClass();
        long jN2 = ccf.N(iIntValue3, ((Integer) obj12).intValue());
        long j2 = chb.a;
        Object obj13 = list3.get(5);
        obj13.getClass();
        int iIntValue4 = ((Integer) obj13).intValue();
        Object obj14 = list3.get(6);
        obj14.getClass();
        long jN3 = ccf.N(iIntValue4, ((Integer) obj14).intValue());
        Object obj15 = list3.get(7);
        obj15.getClass();
        return new alj(iIntValue2, (String) obj9, str2, jN2, jN3, ((Long) obj15).longValue(), false, 64);
    }

    @Override // defpackage.bii
    public final /* synthetic */ Object b(bia biaVar, Object obj) {
        if (this.b != 0) {
            aid aidVar = (aid) obj;
            String string = aidVar.c().toString();
            Integer numValueOf = Integer.valueOf(chb.e(aidVar.a()));
            Integer numValueOf2 = Integer.valueOf(chb.a(aidVar.a()));
            bhi bhiVar = aidVar.e;
            alj aljVarI = bhiVar.i();
            return yfm.s(string, numValueOf, numValueOf2, yfm.s(aljVarI != null ? alj.a.b(biaVar, aljVarI) : null, aig.a.b(biaVar, bhiVar.a)));
        }
        alj aljVar = (alj) obj;
        Integer numValueOf3 = Integer.valueOf(aljVar.b);
        String str = aljVar.c;
        String str2 = aljVar.d;
        long j = aljVar.e;
        Integer numValueOf4 = Integer.valueOf(chb.e(j));
        Integer numValueOf5 = Integer.valueOf(chb.a(j));
        long j2 = aljVar.f;
        return yfm.s(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf(chb.e(j2)), Integer.valueOf(chb.a(j2)), Long.valueOf(aljVar.g));
    }
}
