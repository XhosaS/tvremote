package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcs implements xcm {
    public static final xcm a = xcn.a(Collections.EMPTY_SET);
    private final List b;
    private final List c;

    public xcs(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set b() {
        List list = this.c;
        List list2 = this.b;
        int size = list2.size();
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((xcq) list.get(i)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(wae.u(size));
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objB = ((xcq) list2.get(i2)).b();
            objB.getClass();
            hashSet.add(objB);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
