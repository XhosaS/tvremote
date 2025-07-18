package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yej implements yeb {
    public int a;
    private final zgl b;
    private final zgk c;
    private final yee d;
    private boolean e;

    public yej(zgl zglVar) {
        this.b = zglVar;
        zgk zgkVar = new zgk();
        this.c = zgkVar;
        this.d = new yee(zgkVar);
        this.a = 16384;
    }

    @Override // defpackage.yeb
    public final synchronized void a() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = yek.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", yek.b.g()));
        }
        zgl zglVar = this.b;
        byte[] bArrO = yek.b.o();
        if (((zhg) zglVar).c) {
            throw new IllegalStateException("closed");
        }
        ((zhg) zglVar).b.T(bArrO);
        ((zhg) zglVar).c();
        zglVar.flush();
    }

    @Override // defpackage.yeb
    public final synchronized void b(boolean z, int i, zgk zgkVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.eW(zgkVar, i2);
        }
    }

    @Override // defpackage.yeb
    public final synchronized void c() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.yeb
    public final synchronized void d(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        zgl zglVar = this.b;
        zglVar.O(i);
        zglVar.O(i2);
        zglVar.flush();
    }

    @Override // defpackage.yeb
    public final synchronized void e(int i, yea yeaVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = yeaVar.s;
        if (i2 == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        zgl zglVar = this.b;
        zglVar.O(i2);
        zglVar.flush();
    }

    @Override // defpackage.yeb
    public final synchronized void f(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw yek.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        zgl zglVar = this.b;
        zglVar.O((int) j);
        zglVar.flush();
    }

    @Override // defpackage.yeb
    public final synchronized void g(yea yeaVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = yeaVar.s;
        if (i == -1) {
            throw yek.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        zgl zglVar = this.b;
        zglVar.O(0);
        zglVar.O(i);
        zglVar.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // defpackage.yeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(boolean r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yej.h(boolean, int, java.util.List):void");
    }

    @Override // defpackage.yeb
    public final synchronized void i(nue nueVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((nueVar.a & 32) != 0) {
            i = ((int[]) nueVar.b)[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.yeb
    public final synchronized void j(nue nueVar) {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        k(0, Integer.bitCount(nueVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (nueVar.f(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                zgl zglVar = this.b;
                zglVar.P(i2);
                zglVar.O(nueVar.d(i));
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    final void k(int i, int i2, byte b, byte b2) {
        Logger logger = yek.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", yeh.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw yek.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw yek.d("reserved bit set: %s", Integer.valueOf(i));
        }
        zgl zglVar = this.b;
        zglVar.W((i2 >>> 16) & 255);
        zglVar.W((i2 >>> 8) & 255);
        zglVar.W(i2 & 255);
        zglVar.W(b);
        zglVar.W(b2);
        zglVar.O(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }
}
