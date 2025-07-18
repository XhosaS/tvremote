package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdc implements Cloneable {
    public final zch a;
    public final zcj b;
    public final zdg c;
    public final zca d;
    public final zdb e;
    public final AtomicBoolean f;
    public zcy g;
    public zde h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile boolean l;
    public volatile zde m;
    public bmd n;
    public volatile bmd o;
    private Object p;

    public zdc(zch zchVar, zcj zcjVar) {
        this.a = zchVar;
        this.b = zcjVar;
        this.c = (zdg) zchVar.r.b;
        Object obj = zchVar.p.a;
        byte[] bArr = zcr.a;
        this.d = (zca) obj;
        zdb zdbVar = new zdb(this);
        zdbVar.k(0L, TimeUnit.MILLISECONDS);
        this.e = zdbVar;
        this.f = new AtomicBoolean();
        this.k = true;
    }

    private final IOException j(IOException iOException) throws IOException {
        IOException iOException2;
        Socket socketC;
        byte[] bArr = zcr.a;
        zde zdeVar = this.h;
        if (zdeVar != null) {
            synchronized (zdeVar) {
                socketC = c();
            }
            if (this.h == null) {
                if (socketC != null) {
                    zcr.p(socketC);
                }
            } else if (socketC != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.e.f()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final IOException a(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.k) {
                this.k = false;
                if (!this.i) {
                    if (!this.j) {
                        z = true;
                    }
                }
            }
        }
        return z ? j(iOException) : iOException;
    }

    public final String b() {
        return this.b.a.e();
    }

    public final Socket c() {
        zde zdeVar = this.h;
        zdeVar.getClass();
        byte[] bArr = zcr.a;
        List list = zdeVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (yks.e(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.h = null;
        if (list.isEmpty()) {
            zdeVar.m = System.nanoTime();
            zdg zdgVar = this.c;
            if (zdeVar.i) {
                zdeVar.j();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) zdgVar.d;
                concurrentLinkedQueue.remove(zdeVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    ((zcu) zdgVar.b).a();
                }
                return zdeVar.a();
            }
            ((zcu) zdgVar.b).e((zcs) zdgVar.c);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new zdc(this.a, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zcl d() throws java.lang.Throwable {
        /*
            r8 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zch r0 = r8.a
            java.util.List r1 = r0.d
            defpackage.yfm.I(r2, r1)
            zdr r1 = new zdr
            r1.<init>()
            r2.add(r1)
            zdj r1 = new zdj
            zbw r3 = r0.f
            r1.<init>(r3)
            r2.add(r1)
            zdk r1 = new zdk
            r6 = 1
            r1.<init>(r6)
            r2.add(r1)
            zcw r1 = defpackage.zcw.a
            r2.add(r1)
            java.util.List r0 = r0.e
            defpackage.yfm.I(r2, r0)
            zdk r0 = new zdk
            r7 = 0
            r0.<init>(r7)
            r2.add(r0)
            zdp r0 = new zdp
            zcj r5 = r8.b
            r3 = 0
            r4 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = 0
            zcl r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            boolean r3 = r1.l     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            if (r3 != 0) goto L51
            r8.a(r2)
            return r0
        L51:
            byte[] r3 = defpackage.zcr.a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            defpackage.a.af(r0)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
            throw r0     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L61
        L5e:
            r0 = move-exception
            r6 = r7
            goto L6b
        L61:
            r0 = move-exception
            java.io.IOException r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            r0.getClass()     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
        L6b:
            if (r6 != 0) goto L70
            r8.a(r2)
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdc.d():zcl");
    }

    public final void e(zde zdeVar) {
        byte[] bArr = zcr.a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = zdeVar;
        zdeVar.l.add(new zda(this, this.p));
    }

    public final void f() {
        this.p = zfo.b.g();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, zdn] */
    public final void g() {
        if (this.l) {
            return;
        }
        this.l = true;
        bmd bmdVar = this.o;
        if (bmdVar != null) {
            bmdVar.b.d();
        }
        zde zdeVar = this.m;
        if (zdeVar != null) {
            zdeVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zdn] */
    public final void h(boolean z) {
        bmd bmdVar;
        synchronized (this) {
            if (!this.k) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (bmdVar = this.o) != null) {
            bmdVar.b.d();
            ((zdc) bmdVar.c).i(bmdVar, true, true, null);
        }
        this.n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException i(defpackage.bmd r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            bmd r0 = r2.o
            boolean r3 = defpackage.yks.e(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = r3
        L1c:
            if (r4 == 0) goto L20
            r2.i = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.j = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r0 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = r0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.o = r4
            zde r4 = r2.h
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r3 = r2.j(r6)
            return r3
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdc.i(bmd, boolean, boolean, java.io.IOException):java.io.IOException");
    }
}
