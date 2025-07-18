package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yws extends AbstractSet {
    final /* synthetic */ ywx a;

    public yws(ywx ywxVar) {
        this.a = ywxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        if (mapG != null) {
            return mapG.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = ywxVar.d(entry.getKey());
            if (iD != -1) {
                Object[] objArr = ywxVar.e;
                objArr.getClass();
                if (yqs.a(objArr[iD], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        if (mapG != null) {
            return mapG.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (ywxVar.k()) {
            return false;
        }
        int iC = ywxVar.c();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = ywxVar.b;
        obj2.getClass();
        int[] iArr = ywxVar.c;
        iArr.getClass();
        Object[] objArr = ywxVar.d;
        objArr.getClass();
        Object[] objArr2 = ywxVar.e;
        objArr2.getClass();
        int iB = yxa.b(key, value, iC, obj2, iArr, objArr, objArr2);
        if (iB == -1) {
            return false;
        }
        ywxVar.j(iB, iC);
        ywxVar.g--;
        ywxVar.h();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
