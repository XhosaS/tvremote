package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbi<T> implements Comparator {
    private final /* synthetic */ int a;

    public qbi(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iJ;
        int iJ2;
        switch (this.a) {
            case 0:
                return wcq.Y(Long.valueOf(((vlq) obj).i), Long.valueOf(((vlq) obj2).i));
            case 1:
                return wcq.Y(Long.valueOf(((vlq) obj).i), Long.valueOf(((vlq) obj2).i));
            case 2:
                vld vldVar = ((qis) obj).l;
                qis qisVar = (qis) obj2;
                tvn tvnVar = qcd.a;
                int iAL = a.aL(vldVar.l);
                if (iAL == 0) {
                    iAL = 1;
                }
                int iAL2 = a.aL(qisVar.l.l);
                return qcd.i(iAL) - qcd.i(iAL2 != 0 ? iAL2 : 1);
            case 3:
                vji vjiVar = (vji) obj;
                if (vjiVar.A()) {
                    iJ = vjiVar.j();
                } else {
                    int iJ3 = vjiVar.M;
                    if (iJ3 == 0) {
                        iJ3 = vjiVar.j();
                        vjiVar.M = iJ3;
                    }
                    iJ = iJ3;
                }
                Integer numValueOf = Integer.valueOf(iJ);
                vji vjiVar2 = (vji) obj2;
                if (vjiVar2.A()) {
                    iJ2 = vjiVar2.j();
                } else {
                    int iJ4 = vjiVar2.M;
                    if (iJ4 == 0) {
                        iJ4 = vjiVar2.j();
                        vjiVar2.M = iJ4;
                    }
                    iJ2 = iJ4;
                }
                return wcq.Y(numValueOf, Integer.valueOf(iJ2));
            case 4:
                Object obj3 = ((cb) obj).a;
                throw null;
            case 5:
                return (int) (((rus) obj).c - ((rus) obj2).c);
            case 6:
                return ((Double) obj).compareTo((Double) obj2);
            case 7:
                tya tyaVarA = tya.a(obj);
                tya tyaVarA2 = tya.a(obj2);
                if (tyaVarA != tyaVarA2) {
                    return tyaVarA.compareTo(tyaVarA2);
                }
                int iOrdinal = tyaVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 8:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    return str2 == null ? 0 : -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            default:
                return wcq.Y(((zhx) obj).a, ((zhx) obj2).a);
        }
    }
}
