package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdq implements agdi {
    public int a;
    private final ahwy b;
    private final ahwx c;
    private final agdl d;
    private boolean e;

    public agdq(ahwy ahwyVar) {
        this.b = ahwyVar;
        ahwx ahwxVar = new ahwx();
        this.c = ahwxVar;
        this.d = new agdl(ahwxVar);
        this.a = 16384;
    }

    @Override // defpackage.agdi
    public final synchronized void a(agdu agduVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((agduVar.a & 32) != 0) {
            i = agduVar.b[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = agdr.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", agdr.b.c()));
        }
        ahwy ahwyVar = this.b;
        byte[] bArrI = agdr.b.i();
        if (((ahxi) ahwyVar).c) {
            throw new IllegalStateException("closed");
        }
        ((ahxi) ahwyVar).b.s(bArrI, 0, bArrI.length);
        ((ahxi) ahwyVar).b();
        ahwyVar.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void c(boolean z, int i, ahwx ahwxVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.fF(ahwxVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.agdi
    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        ahwy ahwyVar = this.b;
        ahwyVar.x(i);
        ahwyVar.x(i2);
        ahwyVar.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void f(int i, agdg agdgVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = agdgVar.s;
        if (i2 == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        ahwy ahwyVar = this.b;
        ahwyVar.x(i2);
        ahwyVar.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void g(agdu agduVar) {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        k(0, Integer.bitCount(agduVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (agduVar.b(i2)) {
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
                ahwy ahwyVar = this.b;
                if (((ahxi) ahwyVar).c) {
                    throw new IllegalStateException("closed");
                }
                ahwx ahwxVar = ((ahxi) ahwyVar).b;
                ahxl ahxlVarM = ahwxVar.m(2);
                byte[] bArr = ahxlVarM.a;
                int i4 = ahxlVarM.c;
                bArr[i4] = (byte) ((i2 >>> 8) & 255);
                bArr[i4 + 1] = (byte) (i2 & 255);
                ahxlVarM.c = i4 + 2;
                ahwxVar.b += 2;
                ((ahxi) ahwyVar).b();
                ahwyVar.x(agduVar.b[i]);
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw agdr.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        ahwy ahwyVar = this.b;
        ahwyVar.x((int) j);
        ahwyVar.flush();
    }

    @Override // defpackage.agdi
    public final synchronized void i(agdg agdgVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = agdgVar.s;
        if (i == -1) {
            throw agdr.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        ahwy ahwyVar = this.b;
        ahwyVar.x(0);
        ahwyVar.x(i);
        ahwyVar.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // defpackage.agdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(boolean r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdq.j(boolean, int, java.util.List):void");
    }

    final void k(int i, int i2, byte b, byte b2) {
        Logger logger = agdr.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", agdo.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw agdr.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw agdr.d("reserved bit set: %s", Integer.valueOf(i));
        }
        ahwy ahwyVar = this.b;
        ahwyVar.v((i2 >>> 16) & 255);
        ahwyVar.v((i2 >>> 8) & 255);
        ahwyVar.v(i2 & 255);
        ahwyVar.v(b);
        ahwyVar.v(b2);
        ahwyVar.x(i & Integer.MAX_VALUE);
    }
}
