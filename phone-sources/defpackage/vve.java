package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vve<K, V> extends LinkedHashMap<K, V> {
    public static final vve a;
    public boolean b;

    static {
        vve vveVar = new vve();
        a = vveVar;
        vveVar.c();
    }

    private vve() {
        this.b = true;
    }

    private static int d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof vug) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = vuo.a;
        int length = bArr.length;
        int iM = a.M(length, bArr, 0, length);
        if (iM == 0) {
            return 1;
        }
        return iM;
    }

    public final vve a() {
        return isEmpty() ? new vve() : new vve(this);
    }

    public final void b() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey()) || !a.N(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iD = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        b();
        Charset charset = vuo.a;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (K k : map.keySet()) {
            Charset charset = vuo.a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }

    private vve(Map map) {
        super(map);
        this.b = true;
    }
}
