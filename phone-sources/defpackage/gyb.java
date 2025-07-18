package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyb implements Closeable, Flushable {
    private static final ynj i = new ynj("[a-z0-9_-]{1,120}");
    public final zhe a;
    public zgl b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final gya h;
    private final long j;
    private final zhe k;
    private final zhe l;
    private final zhe m;
    private final LinkedHashMap n;
    private final yow o;
    private long p;
    private int q;

    public gyb(zgr zgrVar, zhe zheVar, yot yotVar, long j) {
        this.a = zheVar;
        this.j = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.k = zheVar.g("journal");
        this.l = zheVar.g("journal.tmp");
        this.m = zheVar.g("journal.bkp");
        this.n = new LinkedHashMap(0, 0.75f, true);
        this.o = yoz.l(wcq.W(new yqy(null), yotVar.g(1)));
        this.h = new gya(zgrVar);
    }

    private final zgl i() {
        return new zhg(new gyc(this.h.b.j(this.k), new gxb(this, 3)));
    }

    private final void j() {
        if (this.e) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void k() {
        ykr.q(this.o, null, 0, new qf(this, (yih) null, 14), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: EOFException -> 0x0137, all -> 0x0185, TryCatch #3 {EOFException -> 0x0137, blocks: (B:15:0x004e, B:19:0x0061, B:21:0x0067, B:23:0x0070, B:25:0x0078, B:57:0x011f, B:28:0x0087, B:30:0x008f, B:31:0x0097, B:34:0x009e, B:36:0x00a6, B:39:0x00c4, B:41:0x00cb, B:45:0x00ed, B:46:0x00fd, B:43:0x00dc, B:44:0x00ec, B:50:0x0103, B:52:0x010b, B:55:0x0117, B:58:0x0123, B:59:0x012c, B:26:0x007f, B:60:0x012d, B:61:0x0136), top: B:86:0x004e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff A[PHI: r5
  0x00ff: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v9 int) binds: [B:32:0x009a, B:33:0x009c, B:47:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyb.l():void");
    }

    private static final void m(String str) {
        if (!i.c(str)) {
            throw new IllegalArgumentException(a.cg(str, "keys must match regex [a-z0-9_-]{1,120}: \"", "\""));
        }
    }

    public final synchronized gxx a(String str) {
        j();
        m(str);
        d();
        LinkedHashMap linkedHashMap = this.n;
        gxy gxyVar = (gxy) linkedHashMap.get(str);
        if ((gxyVar != null ? gxyVar.g : null) == null && (gxyVar == null || gxyVar.h == 0)) {
            if (!this.f && !this.g) {
                zgl zglVar = this.b;
                zglVar.getClass();
                zglVar.Z("DIRTY");
                zglVar.W(32);
                zglVar.Z(str);
                zglVar.W(10);
                zglVar.flush();
                if (!this.c) {
                    if (gxyVar == null) {
                        gxyVar = new gxy(this, str);
                        linkedHashMap.put(str, gxyVar);
                    }
                    gxx gxxVar = new gxx(this, gxyVar);
                    gxyVar.g = gxxVar;
                    return gxxVar;
                }
            }
            k();
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x007e, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0015, B:23:0x0054, B:25:0x0077, B:8:0x001b, B:10:0x001f, B:13:0x0024, B:15:0x002f, B:17:0x003d, B:20:0x0044), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.gxz b(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.j()     // Catch: java.lang.Throwable -> L7e
            m(r9)     // Catch: java.lang.Throwable -> L7e
            r8.d()     // Catch: java.lang.Throwable -> L7e
            java.util.LinkedHashMap r0 = r8.n     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L7e
            gxy r0 = (defpackage.gxy) r0     // Catch: java.lang.Throwable -> L7e
            r1 = 0
            if (r0 == 0) goto L7c
            boolean r2 = r0.e     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L1b
        L19:
            r3 = r1
            goto L51
        L1b:
            gxx r2 = r0.g     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L19
            boolean r2 = r0.f     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L24
            goto L19
        L24:
            java.util.ArrayList r2 = r0.c     // Catch: java.lang.Throwable -> L7e
            gyb r3 = r0.i     // Catch: java.lang.Throwable -> L7e
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L7e
            r5 = 0
        L2d:
            if (r5 >= r4) goto L44
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L7e
            zhe r6 = (defpackage.zhe) r6     // Catch: java.lang.Throwable -> L7e
            gya r7 = r3.h     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r7.i(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L41
            r3.h(r0)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L7e
            goto L19
        L41:
            int r5 = r5 + 1
            goto L2d
        L44:
            int r2 = r0.h     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 + 1
            r0.h = r2     // Catch: java.lang.Throwable -> L7e
            gyb r2 = r0.i     // Catch: java.lang.Throwable -> L7e
            gxz r3 = new gxz     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L7e
        L51:
            if (r3 != 0) goto L54
            goto L7c
        L54:
            int r0 = r8.q     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + 1
            r8.q = r0     // Catch: java.lang.Throwable -> L7e
            zgl r0 = r8.b     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "READ"
            r0.Z(r1)     // Catch: java.lang.Throwable -> L7e
            r1 = 32
            r0.W(r1)     // Catch: java.lang.Throwable -> L7e
            r0.Z(r9)     // Catch: java.lang.Throwable -> L7e
            r9 = 10
            r0.W(r9)     // Catch: java.lang.Throwable -> L7e
            boolean r9 = r8.g()     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L7a
            r8.k()     // Catch: java.lang.Throwable -> L7e
        L7a:
            monitor-exit(r8)
            return r3
        L7c:
            monitor-exit(r8)
            return r1
        L7e:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyb.b(java.lang.String):gxz");
    }

    public final synchronized void c(gxx gxxVar, boolean z) {
        gxy gxyVar = gxxVar.a;
        if (!yks.e(gxyVar.g, gxxVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = 0;
        if (!z || gxyVar.f) {
            while (i2 < 2) {
                gya gyaVar = this.h;
                Object obj = gxyVar.d.get(i2);
                obj.getClass();
                gyaVar.h((zhe) obj);
                i2++;
            }
        } else {
            for (int i3 = 0; i3 < 2; i3++) {
                if (gxxVar.b[i3]) {
                    gya gyaVar2 = this.h;
                    Object obj2 = gxyVar.d.get(i3);
                    obj2.getClass();
                    if (!gyaVar2.i((zhe) obj2)) {
                        gxxVar.b();
                        return;
                    }
                }
            }
            while (i2 < 2) {
                Object obj3 = gxyVar.d.get(i2);
                obj3.getClass();
                ArrayList arrayList = gxyVar.c;
                zhe zheVar = (zhe) obj3;
                Object obj4 = arrayList.get(i2);
                obj4.getClass();
                gya gyaVar3 = this.h;
                zhe zheVar2 = (zhe) obj4;
                if (gyaVar3.i(zheVar)) {
                    gyaVar3.g(zheVar, zheVar2);
                } else {
                    Object obj5 = arrayList.get(i2);
                    obj5.getClass();
                    hjs.x(gyaVar3, (zhe) obj5);
                }
                long[] jArr = gxyVar.b;
                long j = jArr[i2];
                Long l = gyaVar3.d(zheVar2).d;
                long jLongValue = l != null ? l.longValue() : 0L;
                jArr[i2] = jLongValue;
                this.p = (this.p - j) + jLongValue;
                i2++;
            }
        }
        gxyVar.g = null;
        if (gxyVar.f) {
            h(gxyVar);
            return;
        }
        this.q++;
        zgl zglVar = this.b;
        zglVar.getClass();
        if (z || gxyVar.e) {
            gxyVar.b();
            zglVar.Z("CLEAN");
            zglVar.W(32);
            zglVar.Z(gxyVar.a);
            gxyVar.a(zglVar);
            zglVar.W(10);
        } else {
            LinkedHashMap linkedHashMap = this.n;
            String str = gxyVar.a;
            linkedHashMap.remove(str);
            zglVar.Z("REMOVE");
            zglVar.W(32);
            zglVar.Z(str);
            zglVar.W(10);
        }
        zglVar.flush();
        if (this.p > this.j || g()) {
            k();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d && !this.e) {
            Collection collectionValues = this.n.values();
            collectionValues.getClass();
            for (gxy gxyVar : (gxy[]) collectionValues.toArray(new gxy[0])) {
                gxyVar.getClass();
                gxx gxxVar = gxyVar.g;
                if (gxxVar != null) {
                    gxy gxyVar2 = gxxVar.a;
                    if (yks.e(gxyVar2.g, gxxVar)) {
                        gxyVar2.c();
                    }
                }
            }
            e();
            yoz.n(this.o, null);
            zgl zglVar = this.b;
            zglVar.getClass();
            zglVar.close();
            this.b = null;
            this.e = true;
            return;
        }
        this.e = true;
    }

    public final synchronized void d() {
        if (this.d) {
            return;
        }
        gya gyaVar = this.h;
        gyaVar.h(this.l);
        zhe zheVar = this.m;
        if (gyaVar.i(zheVar)) {
            zhe zheVar2 = this.k;
            if (gyaVar.i(zheVar2)) {
                gyaVar.h(zheVar);
            } else {
                gyaVar.g(zheVar, zheVar2);
            }
        }
        if (gyaVar.i(this.k)) {
            try {
                try {
                    l();
                    Iterator it = this.n.values().iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        gxy gxyVar = (gxy) next;
                        if (gxyVar.g == null) {
                            for (int i2 = 0; i2 < 2; i2++) {
                                j += gxyVar.b[i2];
                            }
                        } else {
                            gxyVar.g = null;
                            for (int i3 = 0; i3 < 2; i3++) {
                                Object obj = gxyVar.c.get(i3);
                                obj.getClass();
                                gyaVar.h((zhe) obj);
                                Object obj2 = gxyVar.d.get(i3);
                                obj2.getClass();
                                gyaVar.h((zhe) obj2);
                            }
                            it.remove();
                        }
                    }
                    this.p = j;
                    this.d = true;
                    return;
                } catch (IOException unused) {
                    close();
                    hjs.y(this.h, this.a);
                    this.e = false;
                }
            } catch (Throwable th) {
                this.e = false;
                throw th;
            }
        }
        f();
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        h(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r4 = this;
        L0:
            long r0 = r4.p
            long r2 = r4.j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.n
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            gxy r1 = (defpackage.gxy) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.h(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyb.e():void");
    }

    public final synchronized void f() {
        zgl zglVar = this.b;
        if (zglVar != null) {
            zglVar.close();
        }
        zhg zhgVar = new zhg(this.h.a(this.l));
        try {
            zhgVar.Z("libcore.io.DiskLruCache");
            zhgVar.W(10);
            zhgVar.Z("1");
            zhgVar.W(10);
            zhgVar.Y(1L);
            zhgVar.W(10);
            zhgVar.Y(2L);
            zhgVar.W(10);
            zhgVar.W(10);
            for (Object obj : this.n.values()) {
                obj.getClass();
                gxy gxyVar = (gxy) obj;
                if (gxyVar.g != null) {
                    zhgVar.Z("DIRTY");
                    zhgVar.W(32);
                    zhgVar.Z(gxyVar.a);
                    zhgVar.W(10);
                } else {
                    zhgVar.Z("CLEAN");
                    zhgVar.W(32);
                    zhgVar.Z(gxyVar.a);
                    gxyVar.a(zhgVar);
                    zhgVar.W(10);
                }
            }
            try {
                zhgVar.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                zhgVar.close();
            } catch (Throwable th3) {
                ybn.h(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        gya gyaVar = this.h;
        zhe zheVar = this.k;
        if (gyaVar.i(zheVar)) {
            zhe zheVar2 = this.m;
            gyaVar.g(zheVar, zheVar2);
            gyaVar.g(this.l, zheVar);
            gyaVar.h(zheVar2);
        } else {
            gyaVar.g(this.l, zheVar);
        }
        this.b = i();
        this.q = 0;
        this.c = false;
        this.g = false;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.d) {
            j();
            e();
            zgl zglVar = this.b;
            zglVar.getClass();
            zglVar.flush();
        }
    }

    public final boolean g() {
        return this.q >= 2000;
    }

    public final void h(gxy gxyVar) {
        zgl zglVar;
        if (gxyVar.h > 0 && (zglVar = this.b) != null) {
            zglVar.Z("DIRTY");
            zglVar.W(32);
            zglVar.Z(gxyVar.a);
            zglVar.W(10);
            zglVar.flush();
        }
        if (gxyVar.h > 0 || gxyVar.g != null) {
            gxyVar.c();
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            gya gyaVar = this.h;
            Object obj = gxyVar.c.get(i2);
            obj.getClass();
            gyaVar.h((zhe) obj);
            long j = this.p;
            long[] jArr = gxyVar.b;
            this.p = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.q++;
        zgl zglVar2 = this.b;
        if (zglVar2 != null) {
            zglVar2.Z("REMOVE");
            zglVar2.W(32);
            zglVar2.Z(gxyVar.a);
            zglVar2.W(10);
        }
        this.n.remove(gxyVar.a);
        if (g()) {
            k();
        }
    }
}
