package defpackage;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohh {
    static ohf a(int i, int i2, int[] iArr, boolean z) {
        int i3;
        int iD;
        int i4 = i + i2;
        int i5 = i4 - 1;
        if (!z) {
            i4 = i5;
        }
        if (z && i == 0) {
            iD = 0;
            i3 = 0;
        } else {
            i3 = i;
            iD = d(iArr, i);
        }
        if (i2 > 0) {
            i2 += d(iArr, i4) - iD;
        }
        return new ohf(i3 + iD, i2);
    }

    static int[] b(ndo ndoVar, List list, Set set) {
        if (ndoVar.h() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        PriorityQueue priorityQueue = new PriorityQueue(1, Comparator$CC.comparingInt(new ToIntFunction() { // from class: ohe
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((ndn) obj).h();
            }
        }));
        for (int i = 0; i < ndoVar.h(); i++) {
            ndn ndnVarM = ndoVar.m(i);
            if (!set.contains(Integer.valueOf(i)) || !ndnVarM.j()) {
                if (ndnVarM.g() == 0) {
                    priorityQueue.add(ndnVarM);
                } else {
                    arrayList.add(ndnVarM);
                }
            }
        }
        if (priorityQueue.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.add(new ohg((ndn) arrayList.get(i2), r5.h(), r5.g()));
            }
            return null;
        }
        int size2 = priorityQueue.size();
        int[] iArrCopyOf = new int[size2];
        int i3 = 0;
        while (!priorityQueue.isEmpty()) {
            ndn ndnVar = (ndn) priorityQueue.poll();
            if (ndnVar != null) {
                iArrCopyOf[i3] = ndnVar.h();
                list.add(new ohg(ndnVar, ndnVar.h() + i3, 1L));
                i3++;
            }
        }
        if (i3 < size2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ndn ndnVar2 = (ndn) arrayList.get(i4);
            ohf ohfVarA = a(ndnVar2.h(), ndnVar2.g(), iArrCopyOf, false);
            list.add(new ohg(ndnVar2, ohfVarA.a, ohfVarA.b));
        }
        return iArrCopyOf;
    }

    static String c(String str, int[] iArr) {
        if (str == null || (length = iArr.length) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        while (true) {
            int length2 = length2 - 1;
            if (length2 < 0) {
                return sb.toString();
            }
            int i = iArr[length2];
            if (i >= 0 && i <= length) {
                sb.insert(i, (char) 160);
            }
        }
    }

    private static int d(int[] iArr, int i) {
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            while (iBinarySearch < iArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
        }
        return iBinarySearch >= 0 ? iBinarySearch + 1 : (-iBinarySearch) - 1;
    }
}
