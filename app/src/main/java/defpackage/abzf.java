package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abzf {
    public static final void a(abvo abvoVar, ArrayDeque arrayDeque) {
        if (!abvoVar.h()) {
            if (!(abvoVar instanceof abzi)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(abvoVar.getClass()))));
            }
            abzi abziVar = (abzi) abvoVar;
            int i = abzi.h;
            a(abziVar.e, arrayDeque);
            a(abziVar.f, arrayDeque);
            return;
        }
        int iB = b(abvoVar.d());
        int iC = abzi.c(iB + 1);
        if (arrayDeque.isEmpty() || ((abvo) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(abvoVar);
            return;
        }
        int iC2 = abzi.c(iB);
        abvo abziVar2 = (abvo) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((abvo) arrayDeque.peek()).d() < iC2) {
            abziVar2 = new abzi((abvo) arrayDeque.pop(), abziVar2);
        }
        abzi abziVar3 = new abzi(abziVar2, abvoVar);
        while (!arrayDeque.isEmpty()) {
            if (((abvo) arrayDeque.peek()).d() >= abzi.c(b(abziVar3.d) + 1)) {
                break;
            } else {
                abziVar3 = new abzi((abvo) arrayDeque.pop(), abziVar3);
            }
        }
        arrayDeque.push(abziVar3);
    }

    private static final int b(int i) {
        int iBinarySearch = Arrays.binarySearch(abzi.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
