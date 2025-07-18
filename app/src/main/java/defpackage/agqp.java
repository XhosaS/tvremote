package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agqp extends agqm {
    public static final int j(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static final int k(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static final Object l(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        agqj.r(objArr, arrayList);
        return arrayList;
    }

    public static final List n(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return agrd.a;
        }
        if (length != 1) {
            return agqj.o(objArr);
        }
        List listSingletonList = Collections.singletonList(objArr[0]);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static final List o(Object[] objArr) {
        return new ArrayList(new agqh(objArr, false));
    }

    public static final Set p(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return agrf.a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(agrj.b(length));
            agqj.s(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(objArr[0]);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q(java.lang.Object[] r4, java.lang.Object r5) {
        /*
            r0 = 0
            if (r5 != 0) goto Lf
            int r5 = r4.length
            r1 = r0
        L5:
            if (r1 >= r5) goto L23
            r2 = r4[r1]
            if (r2 != 0) goto Lc
            goto L1c
        Lc:
            int r1 = r1 + 1
            goto L5
        Lf:
            int r1 = r4.length
            r2 = r0
        L11:
            if (r2 >= r1) goto L23
            r3 = r4[r2]
            boolean r3 = defpackage.agvy.c(r5, r3)
            if (r3 == 0) goto L20
            r1 = r2
        L1c:
            if (r1 < 0) goto L23
            r4 = 1
            return r4
        L20:
            int r2 = r2 + 1
            goto L11
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqp.q(java.lang.Object[], java.lang.Object):boolean");
    }

    public static final void r(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static final void s(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }
}
