package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfc implements Closeable {
    private static final Logger b = Logger.getLogger(zee.class.getName());
    public int a;
    private final zgl c;
    private final zgk d;
    private boolean e;
    private final zec f;

    public zfc(zgl zglVar) {
        zglVar.getClass();
        this.c = zglVar;
        zgk zgkVar = new zgk();
        this.d = zgkVar;
        this.a = 16384;
        this.f = new zec(zgkVar);
    }

    public final synchronized void a() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(zcr.j(">> CONNECTION ".concat(zee.a.g()), new Object[0]));
        }
        zgl zglVar = this.c;
        zgn zgnVar = zee.a;
        zgnVar.getClass();
        if (((zhg) zglVar).c) {
            throw new IllegalStateException("closed");
        }
        ((zhg) zglVar).b.J(zgnVar);
        ((zhg) zglVar).c();
        zglVar.flush();
    }

    public final synchronized void b(boolean z, int i, zgk zgkVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            zgl zglVar = this.c;
            zgkVar.getClass();
            zglVar.eW(zgkVar, i2);
        }
    }

    public final synchronized void c() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.c.close();
    }

    public final void d(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            zgn zgnVar = zee.a;
            logger.fine(zee.b(false, i, i2, i3, i4));
        }
        int i5 = this.a;
        if (i2 > i5) {
            throw new IllegalArgumentException(a.ce(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(a.cf(i, "reserved bit set: "));
        }
        zgl zglVar = this.c;
        byte[] bArr = zcr.a;
        zglVar.W((i2 >>> 16) & 255);
        zglVar.W((i2 >>> 8) & 255);
        zglVar.W(i2 & 255);
        zglVar.W(i3);
        zglVar.W(i4);
        zglVar.O(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z ? 1 : 0);
        zgl zglVar = this.c;
        zglVar.O(i);
        zglVar.O(i2);
        zglVar.flush();
    }

    public final synchronized void f(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.cs(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
        }
        d(i, 4, 8, 0);
        zgl zglVar = this.c;
        zglVar.O((int) j);
        zglVar.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfc.g(int, java.util.List):void");
    }

    public final synchronized void h(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(i, 4, 3, 0);
        zgl zglVar = this.c;
        zglVar.O(i2 - 1);
        zglVar.flush();
    }

    public final synchronized void i(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(0, 8, 7, 0);
        zgl zglVar = this.c;
        zglVar.O(i);
        zglVar.O(i2 - 1);
        zglVar.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = r3.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(defpackage.zlj r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L5a
            int r0 = r3.a     // Catch: java.lang.Throwable -> L62
            int r1 = r4.a     // Catch: java.lang.Throwable -> L62
            r1 = r1 & 32
            if (r1 == 0) goto L17
            java.lang.Object r0 = r4.b     // Catch: java.lang.Throwable -> L62
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L62
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L62
        L17:
            r3.a = r0     // Catch: java.lang.Throwable -> L62
            int r0 = r4.d()     // Catch: java.lang.Throwable -> L62
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4e
            zec r0 = r3.f     // Catch: java.lang.Throwable -> L62
            int r4 = r4.d()     // Catch: java.lang.Throwable -> L62
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L62
            int r1 = r0.d     // Catch: java.lang.Throwable -> L62
            if (r1 != r4) goto L32
            goto L4e
        L32:
            if (r4 >= r1) goto L3c
            int r1 = r0.b     // Catch: java.lang.Throwable -> L62
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L62
            r0.b = r1     // Catch: java.lang.Throwable -> L62
        L3c:
            r0.c = r2     // Catch: java.lang.Throwable -> L62
            r0.d = r4     // Catch: java.lang.Throwable -> L62
            int r1 = r0.h     // Catch: java.lang.Throwable -> L62
            if (r4 >= r1) goto L4e
            if (r4 != 0) goto L4a
            r0.a()     // Catch: java.lang.Throwable -> L62
            goto L4e
        L4a:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L62
        L4e:
            r4 = 4
            r0 = 0
            r3.d(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L62
            zgl r4 = r3.c     // Catch: java.lang.Throwable -> L62
            r4.flush()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r3)
            return
        L5a:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r4     // Catch: java.lang.Throwable -> L62
        L62:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfc.j(zlj):void");
    }

    public final synchronized void k(zlj zljVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = 0;
        d(0, Integer.bitCount(zljVar.a) * 6, 4, 0);
        while (i < 10) {
            if (zljVar.g(i)) {
                int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                zgl zglVar = this.c;
                zglVar.P(i2);
                zglVar.O(zljVar.c(i));
            }
            i++;
        }
        this.c.flush();
    }
}
