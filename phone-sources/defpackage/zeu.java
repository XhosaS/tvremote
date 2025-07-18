package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeu implements Closeable {
    public static final zlj t;
    public final zeh a;
    public final Map b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final zcv g;
    public final zcu h;
    public final zcu i;
    public final zcu j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final zfc q;
    public final zem r;
    public final Set s;
    public final zlj u;
    public zlj v;
    private long w;
    private long x;
    private long y;
    private final Socket z;

    static {
        zlj zljVar = new zlj();
        zljVar.h(7, 65535);
        zljVar.h(5, 16384);
        t = zljVar;
    }

    public zeu(zef zefVar) {
        this.a = zefVar.f;
        String str = zefVar.c;
        zgm zgmVar = null;
        if (str == null) {
            yks.c("connectionName");
            str = null;
        }
        this.c = str;
        this.e = 3;
        zcv zcvVar = zefVar.a;
        this.g = zcvVar;
        this.h = zcvVar.a();
        this.i = zcvVar.a();
        this.j = zcvVar.a();
        zlj zljVar = new zlj();
        zljVar.h(7, 16777216);
        this.u = zljVar;
        this.v = t;
        this.p = r0.e();
        Socket socket = zefVar.b;
        if (socket == null) {
            yks.c("socket");
            socket = null;
        }
        this.z = socket;
        zgl zglVar = zefVar.e;
        if (zglVar == null) {
            yks.c("sink");
            zglVar = null;
        }
        this.q = new zfc(zglVar);
        zgm zgmVar2 = zefVar.d;
        if (zgmVar2 == null) {
            yks.c("source");
        } else {
            zgmVar = zgmVar2;
        }
        this.r = new zem(this, new zex(zgmVar));
        this.s = new LinkedHashSet();
    }

    public static final boolean j(int i) {
        return (i & 1) == 0;
    }

    public final synchronized zfb a(int i) {
        return (zfb) this.b.get(Integer.valueOf(i));
    }

    public final synchronized zfb b(int i) {
        zfb zfbVar;
        zfbVar = (zfb) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return zfbVar;
    }

    public final void c(IOException iOException) throws IOException {
        k(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        k(1, 9, null);
    }

    public final void d() {
        this.q.c();
    }

    public final synchronized void e(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.e() / 2) {
            h(0, j3);
            this.x += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = (int) java.lang.Math.min(r13, r6 - r4);
        r4 = r9.q;
        r2 = java.lang.Math.min(r2, r4.a);
        r7 = r2;
        r9.y += r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r10, boolean r11, defpackage.zgk r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L61
        L7:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L60
            monitor-enter(r9)
        Lc:
            long r4 = r9.y     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            long r6 = r9.p     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r9.b     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r2 == 0) goto L24
            r9.wait()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto Lc
        L24:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            throw r10     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L4f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L4f
            zfc r4 = r9.q     // Catch: java.lang.Throwable -> L4f
            int r5 = r4.a     // Catch: java.lang.Throwable -> L4f
            int r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L4f
            long r5 = r9.y     // Catch: java.lang.Throwable -> L4f
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L4f
            long r5 = r5 + r7
            r9.y = r5     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r9)
            long r13 = r13 - r7
            if (r11 == 0) goto L4a
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = r3
        L4b:
            r4.b(r5, r10, r12, r2)
            goto L7
        L4f:
            r10 = move-exception
            goto L5e
        L51:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r10.interrupt()     // Catch: java.lang.Throwable -> L4f
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4f
            r10.<init>()     // Catch: java.lang.Throwable -> L4f
            throw r10     // Catch: java.lang.Throwable -> L4f
        L5e:
            monitor-exit(r9)
            throw r10
        L60:
            return
        L61:
            zfc r13 = r9.q
            r13.b(r11, r10, r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeu.f(int, boolean, zgk, long):void");
    }

    public final void g(boolean z, int i, int i2) throws IOException {
        try {
            this.q.e(z, i, i2);
        } catch (IOException e) {
            c(e);
        }
    }

    public final void h(int i, long j) {
        this.h.e(new zet(this.c + "[" + i + "] windowUpdate", this, i, j));
    }

    public final synchronized boolean i(long j) {
        if (this.f) {
            return false;
        }
        if (this.m < this.l) {
            if (j >= this.o) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i, int i2, IOException iOException) throws IOException {
        int i3;
        Object[] array;
        byte[] bArr = zcr.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            Map map = this.b;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new zfb[0]);
                map.clear();
            }
        }
        zfb[] zfbVarArr = (zfb[]) array;
        if (zfbVarArr != null) {
            for (zfb zfbVar : zfbVarArr) {
                try {
                    zfbVar.j(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.q.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.h.b();
        this.i.b();
        this.j.b();
    }

    public final void l(int i) {
        synchronized (this.q) {
            yld yldVar = new yld();
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                yldVar.a = this.d;
                zfc zfcVar = this.q;
                int i2 = yldVar.a;
                byte[] bArr = zcr.a;
                zfcVar.i(i2, i);
            }
        }
    }

    public final void m(int i, int i2) {
        this.q.h(i, i2);
    }

    public final void n(int i, int i2) {
        this.h.e(new zes(this.c + "[" + i + "] writeSynReset", this, i, i2));
    }
}
