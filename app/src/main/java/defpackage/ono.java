package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ono implements ont {
    public final otg a;

    public ono(otg otgVar) {
        this.a = otgVar;
    }

    public static void e(Map map, acgd acgdVar, int i) {
        if (!map.containsKey(acgdVar)) {
            map.put(acgdVar, 0L);
        }
        map.put(acgdVar, Long.valueOf(((Long) map.get(acgdVar)).longValue() + i));
    }

    @Override // defpackage.ont
    public final void a(Set set, Map map) {
        List<acgi> list;
        char c;
        char c2;
        char c3;
        int iA;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            acgd acgdVar = (acgd) it.next();
            if (map.containsKey(acgdVar)) {
                list = (List) map.get(acgdVar);
            } else {
                int i = yyk.e;
                list = zcg.b;
            }
            if (list.isEmpty()) {
                c = 2;
                c2 = 1;
                c3 = 0;
            } else {
                otg otgVar = this.a;
                String strName = acgdVar.name();
                for (acgi acgiVar : list) {
                    oth othVar = (oth) otgVar;
                    ((uqq) othVar.a.E.eV()).b(othVar.a(acgiVar), othVar.b, othVar.c, strName);
                }
                c = 2;
                c2 = 1;
                c3 = 0;
                String strName2 = acgdVar.name();
                double size = list.size();
                oth othVar2 = (oth) otgVar;
                otf otfVar = othVar2.a;
                String str = othVar2.b;
                String str2 = othVar2.c;
                ((uqq) otfVar.F.eV()).b(size * 100.0d, str, str2, strName2);
                int i2 = 0;
                for (acgi acgiVar2 : list) {
                    int i3 = acgiVar2.memoizedSerializedSize;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        int iA2 = i3 & Integer.MAX_VALUE;
                        if (iA2 == Integer.MAX_VALUE) {
                            iA2 = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                            if (iA2 < 0) {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            }
                            acgiVar2.memoizedSerializedSize = (Integer.MIN_VALUE & acgiVar2.memoizedSerializedSize) | iA2;
                        }
                        iA = iA2;
                    }
                    i2 += iA;
                }
                ((uqq) otfVar.W.eV()).b(i2, str, str2, acgdVar.name());
            }
            otg otgVar2 = this.a;
            String strName3 = acgdVar.name();
            oth othVar3 = (oth) otgVar2;
            uqo uqoVar = (uqo) othVar3.a.L.eV();
            String str3 = othVar3.b;
            String str4 = othVar3.c;
            Object[] objArr = new Object[3];
            objArr[c3] = str3;
            objArr[c2] = str4;
            objArr[c] = strName3;
            uqoVar.a(100L, objArr);
        }
    }

    @Override // defpackage.ont
    public final void b(acgd acgdVar, String str) {
        otg otgVar = this.a;
        oth othVar = (oth) otgVar;
        ((uqo) othVar.a.ai.eV()).a(100L, othVar.b, othVar.c, acgdVar.name(), str);
    }

    @Override // defpackage.ont
    public final void c(Set set, Map map) {
        List<acgi> list;
        int iA;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            acgd acgdVar = (acgd) it.next();
            if (map.containsKey(acgdVar)) {
                list = (List) map.get(acgdVar);
            } else {
                int i = yyk.e;
                list = zcg.b;
            }
            if (!list.isEmpty()) {
                otg otgVar = this.a;
                String strName = acgdVar.name();
                double size = list.size();
                oth othVar = (oth) otgVar;
                otf otfVar = othVar.a;
                uqq uqqVar = (uqq) otfVar.J.eV();
                String str = othVar.b;
                String str2 = othVar.c;
                uqqVar.b(size * 100.0d, str, str2, strName);
                int i2 = 0;
                for (acgi acgiVar : list) {
                    int i3 = acgiVar.memoizedSerializedSize;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        int iA2 = i3 & Integer.MAX_VALUE;
                        if (iA2 == Integer.MAX_VALUE) {
                            iA2 = abza.a.a(acgiVar.getClass()).a(acgiVar);
                            if (iA2 < 0) {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            }
                            acgiVar.memoizedSerializedSize = (acgiVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                        }
                        iA = iA2;
                    }
                    i2 += iA;
                }
                ((uqq) otfVar.X.eV()).b(i2, str, str2, acgdVar.name());
            }
        }
    }

    @Override // defpackage.ont
    public final void d(String str, String str2) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.A.eV()).a(100L, othVar.b, othVar.c, str, str2);
    }

    @Override // defpackage.ont
    public final void f(boolean z) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.C.eV()).a(100L, othVar.b, othVar.c, "internal", Boolean.valueOf(z));
    }
}
