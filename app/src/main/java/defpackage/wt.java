package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wt {
    private final int a;
    private final xc b;
    private final xb c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public wt(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new xc(0);
        this.c = new xb();
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.a;
        }
        return i;
    }

    public final int c() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    protected Object d(Object obj) {
        return null;
    }

    public final Object e(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.h++;
                return obj2;
            }
            this.i++;
            Object objD = d(obj);
            if (objD == null) {
                return null;
            }
            synchronized (this.c) {
                this.f++;
                LinkedHashMap linkedHashMap = this.b.a;
                objPut = linkedHashMap.put(obj, objD);
                if (objPut != null) {
                    linkedHashMap.put(obj, objPut);
                } else {
                    this.d++;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            i(this.a);
            return objD;
        }
    }

    public final Object f(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.e++;
            this.d++;
            objPut = this.b.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        i(this.a);
        return objPut;
    }

    public final Object g(Object obj) {
        Object objA;
        obj.getClass();
        synchronized (this.c) {
            objA = this.b.a(obj);
            if (objA != null) {
                this.d--;
            }
        }
        return objA;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.c) {
            xc xcVar = this.b;
            linkedHashMap = new LinkedHashMap(xcVar.b().size());
            for (Map.Entry entry : xcVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r6) {
        /*
            r5 = this;
        L0:
            xb r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L7c
            if (r1 < 0) goto L74
            xc r1 = r5.b     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r2 = r1.a     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L15
            int r3 = r5.d     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L74
        L15:
            int r3 = r5.d     // Catch: java.lang.Throwable -> L7c
            if (r3 <= r6) goto L72
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L20
            goto L72
        L20:
            java.util.Set r2 = r1.b()     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L7c
            r4 = 0
            if (r3 == 0) goto L38
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L32
            goto L47
        L32:
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L7c
            goto L47
        L38:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L43
            goto L47
        L43:
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L7c
        L47:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L4d
            monitor-exit(r0)
            return
        L4d:
            java.lang.Object r2 = r4.getKey()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r3 = r4.getValue()     // Catch: java.lang.Throwable -> L7c
            r1.a(r2)     // Catch: java.lang.Throwable -> L7c
            int r1 = r5.d     // Catch: java.lang.Throwable -> L7c
            r2.getClass()     // Catch: java.lang.Throwable -> L7c
            r3.getClass()     // Catch: java.lang.Throwable -> L7c
            int r1 = r1 + (-1)
            r5.d = r1     // Catch: java.lang.Throwable -> L7c
            int r1 = r5.g     // Catch: java.lang.Throwable -> L7c
            int r1 = r1 + 1
            r5.g = r1     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            r2.getClass()
            r3.getClass()
            goto L0
        L72:
            monitor-exit(r0)
            return
        L74:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.i(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            int i = this.h;
            int i2 = this.i + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
