package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jp<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final kv lock;
    private final kw<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public jp(int i) {
        this.maxSize = i;
        if (i <= 0) {
            kv.a("maxSize <= 0");
        }
        this.map = new kw<>(0);
        this.lock = new kv();
    }

    private final int safeSizeOf(K k, V v) {
        int iSizeOf = sizeOf(k, v);
        if (iSizeOf < 0) {
            kv.b("Negative size: " + k + '=' + v);
        }
        return iSizeOf;
    }

    protected V create(K k) {
        k.getClass();
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    protected void entryRemoved(boolean z, K k, V v, V v2) {
        k.getClass();
        v.getClass();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final V get(K k) {
        V v;
        k.getClass();
        synchronized (this.lock) {
            V v2 = (V) ((LinkedHashMap) this.map.a).get(k);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(k);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v = (V) this.map.a(k, vCreate);
                if (v != null) {
                    this.map.a(k, v);
                } else {
                    this.size += safeSizeOf(k, vCreate);
                }
            }
            if (v != null) {
                entryRemoved(false, k, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K k, V v) {
        V v2;
        k.getClass();
        v.getClass();
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            v2 = (V) this.map.a(k, v);
            if (v2 != null) {
                this.size -= safeSizeOf(k, v2);
            }
        }
        if (v2 != null) {
            entryRemoved(false, k, v2, v);
        }
        trimToSize(this.maxSize);
        return v2;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K k) {
        V v;
        k.getClass();
        synchronized (this.lock) {
            v = (V) this.map.b(k);
            if (v != null) {
                this.size -= safeSizeOf(k, v);
            }
        }
        if (v != null) {
            entryRemoved(false, k, v, null);
        }
        return v;
    }

    public void resize(int i) {
        if (i <= 0) {
            kv.a("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    protected int sizeOf(K k, V v) {
        k.getClass();
        v.getClass();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.c().size());
            for (Map.Entry entry : this.map.c()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            kv r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L59
            if (r1 < 0) goto L13
            kw<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L18
            int r1 = r5.size     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L18
        L13:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.kv.b(r1)     // Catch: java.lang.Throwable -> L59
        L18:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L59
            if (r1 <= r6) goto L57
            kw<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L25
            goto L57
        L25:
            kw<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L59
            java.util.Set r1 = r1.c()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = defpackage.yfm.T(r1)     // Catch: java.lang.Throwable -> L59
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L59
            if (r1 != 0) goto L35
            monitor-exit(r0)
            return
        L35:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L59
            kw<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L59
            r3.b(r2)     // Catch: java.lang.Throwable -> L59
            int r3 = r5.size     // Catch: java.lang.Throwable -> L59
            int r4 = r5.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L59
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L59
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L59
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L57:
            monitor-exit(r0)
            return
        L59:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp.trimToSize(int):void");
    }
}
