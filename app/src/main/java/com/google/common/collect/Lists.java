package com.google.common.collect;

import defpackage.yqi;
import defpackage.yqs;
import defpackage.ywl;
import defpackage.yyk;
import defpackage.zar;
import defpackage.zat;
import defpackage.zau;
import defpackage.zav;
import defpackage.zax;
import defpackage.zaz;
import defpackage.zbb;
import defpackage.ztm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Lists {
    private Lists() {
    }

    public static ArrayList a(int i) {
        ywl.b(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List b(List list) {
        return list instanceof yyk ? ((yyk) list).a() : list instanceof zax ? ((zax) list).a : list instanceof RandomAccess ? new zav(list) : new zax(list);
    }

    public static List c(List list, yqi yqiVar) {
        return list instanceof RandomAccess ? new zaz(list, yqiVar) : new zbb(list, yqiVar);
    }

    public static boolean d(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!yqs.a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !yqs.a(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static List e(List list) {
        list.getClass();
        return list instanceof RandomAccess ? new zau(list) : new zat(list);
    }

    public static ArrayList newArrayList() {
        return new ArrayList();
    }

    public static ArrayList newArrayList(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : newArrayList(iterable.iterator());
    }

    public static ArrayList newArrayList(Iterator it) {
        ArrayList arrayList = new ArrayList();
        zar.j(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList newArrayList(Object... objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList(ztm.d(objArr.length + 5 + (r0 / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
