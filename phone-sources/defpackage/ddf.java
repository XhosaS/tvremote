package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddf {
    public final cxe a;
    private final Map b;

    public ddf() {
        throw null;
    }

    public final ddf a() {
        return new ddf(yfm.m(c()), true);
    }

    public final Object b(dde ddeVar) {
        ddeVar.getClass();
        Object obj = this.b.get(ddeVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public final Map c() {
        yfw yfwVar;
        Set<Map.Entry> setEntrySet = this.b.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf.getClass();
                yfwVar = new yfw(key, bArrCopyOf);
            } else {
                yfwVar = new yfw(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(yfwVar.a, yfwVar.b);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void d() {
        if (((AtomicBoolean) this.a.a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void e(dde ddeVar, Object obj) {
        ddeVar.getClass();
        d();
        if (obj == null) {
            g(ddeVar);
            return;
        }
        if (obj instanceof Set) {
            Map map = this.b;
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(yfm.aq((Set) obj));
            setUnmodifiableSet.getClass();
            map.put(ddeVar, setUnmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            this.b.put(ddeVar, obj);
            return;
        }
        Map map2 = this.b;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        map2.put(ddeVar, bArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ddf)) {
            return false;
        }
        Map map = ((ddf) obj).b;
        Map map2 = this.b;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object obj2 = map2.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        return false;
                    }
                } else if (!yks.e(value, obj2)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ddf f() {
        return new ddf(yfm.m(c()), false);
    }

    public final void g(dde ddeVar) {
        d();
        this.b.remove(ddeVar);
    }

    public final int hashCode() {
        Iterator it = this.b.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return yfm.ax(this.b.entrySet(), ",\n", "{\n", "\n}", new cjp(7), 24);
    }

    public ddf(Map map, boolean z) {
        this.b = map;
        this.a = new cxe(z);
    }

    public /* synthetic */ ddf(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
