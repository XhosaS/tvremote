package com.google.common.collect;

import defpackage.yyd;
import defpackage.yzq;
import defpackage.zar;
import defpackage.zbk;
import defpackage.zbp;
import defpackage.zcp;
import defpackage.zcw;
import defpackage.zda;
import defpackage.zdc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Sets {
    private Sets() {
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yzq b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return iterable.isEmpty() ? zcp.b : yyd.a(EnumSet.copyOf((Collection) iterable));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zcp.b;
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        zar.j(enumSetOf, it);
        return yyd.a(enumSetOf);
    }

    public static zdc c(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new zda(set, set2);
    }

    public static zdc d(Set set, Set set2) {
        set2.getClass();
        return new zcw(set, set2);
    }

    public static HashSet e(int i) {
        return new HashSet(zbk.a(i));
    }

    public static Set f() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static boolean g(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zbp) {
            collection = ((zbp) collection).i();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return h(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean h(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static HashSet newHashSet() {
        return new HashSet();
    }

    public static HashSet newHashSet(Iterable iterable) {
        return iterable instanceof Collection ? new HashSet((Collection) iterable) : newHashSet(iterable.iterator());
    }

    public static HashSet newHashSet(Iterator it) {
        HashSet hashSet = new HashSet();
        zar.j(hashSet, it);
        return hashSet;
    }

    public static HashSet newHashSet(Object... objArr) {
        HashSet hashSetE = e(objArr.length);
        Collections.addAll(hashSetE, objArr);
        return hashSetE;
    }
}
