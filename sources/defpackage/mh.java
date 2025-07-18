package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mh {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final mo g;
    private final asv h;

    public mh() {
        this(6);
    }

    public static int c(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    private static final void e(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object a(Object obj) {
        synchronized (this.g) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r7.getClass()
            mo r0 = r5.g
            monitor-enter(r0)
            int r1 = r5.c     // Catch: java.lang.Throwable -> Lb5
            int r1 = r1 + 1
            r5.c = r1     // Catch: java.lang.Throwable -> Lb5
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb5
            e(r6, r7)     // Catch: java.lang.Throwable -> Lb5
            int r1 = r1 + 1
            r5.b = r1     // Catch: java.lang.Throwable -> Lb5
            asv r1 = r5.h     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lb5
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r7 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L2a
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb5
            e(r6, r7)     // Catch: java.lang.Throwable -> Lb5
            int r1 = r1 + (-1)
            r5.b = r1     // Catch: java.lang.Throwable -> Lb5
        L2a:
            monitor-exit(r0)
            if (r7 == 0) goto L30
            d(r6, r7)
        L30:
            int r6 = r5.a
        L32:
            mo r0 = r5.g
            monitor-enter(r0)
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb2
            if (r1 < 0) goto L45
            asv r1 = r5.h     // Catch: java.lang.Throwable -> Lb2
            boolean r1 = r1.V()     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L4a
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L4a
        L45:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.mo.v(r1)     // Catch: java.lang.Throwable -> Lb2
        L4a:
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb2
            if (r1 <= r6) goto Lb0
            asv r1 = r5.h     // Catch: java.lang.Throwable -> Lb2
            boolean r2 = r1.V()     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L57
            goto Lb0
        L57:
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lb2
            r2 = r1
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> Lb2
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Lb2
            r2.getClass()     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> Lb2
            r4 = 0
            if (r3 == 0) goto L77
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto L71
            goto L86
        L71:
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> Lb2
            goto L86
        L77:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r3 != 0) goto L82
            goto L86
        L82:
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lb2
        L86:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lb2
            if (r4 != 0) goto L8c
            monitor-exit(r0)
            return r7
        L8c:
            java.lang.Object r2 = r4.getKey()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r4.getValue()     // Catch: java.lang.Throwable -> Lb2
            r2.getClass()     // Catch: java.lang.Throwable -> Lb2
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> Lb2
            r1.remove(r2)     // Catch: java.lang.Throwable -> Lb2
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lb2
            e(r2, r3)     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 + (-1)
            r5.b = r1     // Catch: java.lang.Throwable -> Lb2
            int r1 = r5.d     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 + 1
            r5.d = r1     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)
            d(r2, r3)
            goto L32
        Lb0:
            monitor-exit(r0)
            return r7
        Lb2:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        Lb5:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.g) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public mh(int i) {
        this.a = i;
        this.h = new asv(0, (byte[]) null);
        this.g = new mo((byte[]) null);
    }
}
