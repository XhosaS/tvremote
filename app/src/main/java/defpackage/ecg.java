package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecg {
    public static final /* synthetic */ int a = 0;
    private static final List b = new ArrayList();

    public static ecf a(ecr ecrVar, ecq ecqVar, ecq ecqVar2, List list, eco ecoVar, String str, String str2, String str3, String str4, boolean z) {
        List list2;
        int i;
        ecf ecfVar;
        Map map;
        List list3;
        List list4;
        int i2;
        int i3;
        List list5;
        boolean z2 = z;
        boolean z3 = ecqVar2 == null;
        boolean z4 = ecqVar == null;
        if (z4 && z3) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (z3) {
            int i4 = ecqVar.i;
            list.add(ecqVar);
            ecf ecfVarC = ecf.c(ecqVar.i, ecqVar2, z2);
            for (int i5 = 0; i5 < i4; i5++) {
                ecfVarC.f(ecd.c(0, null));
            }
            return ecfVarC;
        }
        List list6 = list;
        String strC = c(ecqVar, str2);
        String strC2 = c(ecqVar2, str3);
        if (!z4 && !ecqVar2.m(ecqVar, ecqVar2)) {
            ecf ecfVarC2 = ecf.c(ecqVar.i, ecqVar2, z2);
            ecqVar2.i = ecfVarC2.d;
            ecoVar.a(str, ecqVar, ecqVar2, strC, strC2, false, str4);
            return ecfVarC2;
        }
        ecoVar.a(str, ecqVar, ecqVar2, strC, strC2, true, str4);
        if (ecqVar2.l()) {
            boolean z5 = ebc.a;
            ecf ecfVarC3 = ecf.c(z4 ? 0 : ecqVar.i, ecqVar2, z2);
            ecqVar2.p(ecqVar2.c, ecfVarC3, ecqVar != null ? ecqVar : null, ecqVar2);
            ecqVar2.i = ecfVarC3.d;
            return ecfVarC3;
        }
        ecf ecfVarC4 = ecf.c(0, ecqVar2, z2);
        Map mapD = ecq.d(ecqVar);
        Map mapD2 = ecq.d(ecqVar2);
        List arrayList = (ecqVar == null || (list5 = ecqVar.j) == null) ? b : new ArrayList(list5);
        List list7 = ecqVar2.j;
        if (list7 == null) {
            list7 = b;
        }
        int i6 = 0;
        int i7 = -1;
        int iB = -1;
        while (i6 < list7.size()) {
            String str5 = ((ecq) list7.get(i6)).k;
            if (mapD.containsKey(str5)) {
                afg afgVar = (afg) mapD.get(str5);
                ecq ecqVar3 = (ecq) afgVar.a;
                int iIntValue = ((Integer) afgVar.b).intValue();
                if (i7 > iIntValue) {
                    list4 = list7;
                    i2 = i6;
                    for (int i8 = 0; i8 < ecqVar3.i; i8++) {
                        ecfVarC4.f(ecd.a(b(arrayList, str5), iB, null));
                    }
                    arrayList.remove(iIntValue);
                    arrayList.add(i7, ecqVar3);
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        ecq ecqVar4 = (ecq) arrayList.get(i9);
                        afg afgVar2 = (afg) mapD.get(ecqVar4.k);
                        if (((Integer) afgVar2.b).intValue() != i9) {
                            i3 = size;
                            mapD.put(ecqVar4.k, new afg((ecq) afgVar2.a, Integer.valueOf(i9)));
                        } else {
                            i3 = size;
                        }
                        i9++;
                        size = i3;
                    }
                } else {
                    list4 = list7;
                    i2 = i6;
                    if (iIntValue > i7) {
                        iB = (b(arrayList, str5) + ((ecq) arrayList.get(iIntValue)).i) - 1;
                        i7 = iIntValue;
                    }
                }
            } else {
                list4 = list7;
                i2 = i6;
            }
            i6 = i2 + 1;
            list7 = list4;
        }
        List list8 = list7;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str6 = ((ecq) arrayList.get(i10)).k;
            ecq ecqVar5 = (ecq) arrayList.get(i10);
            if (mapD2.get(str6) == null) {
                List list9 = list6;
                list3 = arrayList;
                map = mapD2;
                sparseArray.put(i10, a(ecrVar, ecqVar5, null, list9, ecoVar, str, strC, strC2, str4, z2));
            } else {
                map = mapD2;
                list3 = arrayList;
            }
            i10++;
            mapD2 = map;
            z2 = z;
            arrayList = list3;
            list6 = list;
        }
        List list10 = arrayList;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list8.size()) {
            List list11 = list8;
            ecq ecqVar6 = (ecq) list11.get(i12);
            afg afgVar3 = (afg) mapD.get(ecqVar6.k);
            int iIntValue2 = afgVar3 != null ? ((Integer) afgVar3.b).intValue() : -1;
            if (iIntValue2 < 0) {
                list2 = list11;
                i = i12;
                ecfVar = ecfVarC4;
                int i13 = i11;
                sparseArray.put(i13, ecf.d((ecf) sparseArray.get(i11), a(ecrVar, null, ecqVar6, list, ecoVar, str, strC, strC2, str4, z)));
                i11 = i13;
            } else {
                list2 = list11;
                i = i12;
                ecfVar = ecfVarC4;
                int i14 = iIntValue2;
                sparseArray.put(i14, ecf.d((ecf) sparseArray.get(iIntValue2), a(ecrVar, (ecq) list10.get(iIntValue2), ecqVar6, list, ecoVar, str, strC, strC2, str4, z)));
                i11 = i14;
            }
            i12 = i + 1;
            ecfVarC4 = ecfVar;
            list8 = list2;
        }
        int size2 = sparseArray.size();
        for (int i15 = 0; i15 < size2; i15++) {
            ecfVarC4 = ecf.d(ecfVarC4, (ecf) sparseArray.valueAt(i15));
        }
        ecqVar2.i = ecfVarC4.d;
        return ecfVarC4;
    }

    private static int b(List list, String str) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ecq ecqVar = (ecq) it.next();
            if (ecqVar.k.equals(str)) {
                break;
            }
            i += ecqVar.i;
        }
        return i;
    }

    private static String c(ecq ecqVar, String str) {
        if (ecqVar != null && ecqVar.a == null) {
            return ecqVar.getClass().getSimpleName();
        }
        if (ecqVar == null) {
            return "";
        }
        return str + "->" + ecqVar.getClass().getSimpleName();
    }
}
