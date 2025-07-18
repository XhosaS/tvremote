package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhg implements zgl {
    public final zhm a;
    public final zgk b = new zgk();
    public boolean c;

    public zhg(zhm zhmVar) {
        this.a = zhmVar;
    }

    @Override // defpackage.zgl
    public final void O(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.N(i);
        c();
    }

    @Override // defpackage.zgl
    public final void P(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgk zgkVar = this.b;
        zhj zhjVarW = zgkVar.w(2);
        byte[] bArr = zhjVarW.a;
        int i2 = zhjVarW.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        zhjVarW.c = i2 + 2;
        zgkVar.b += 2;
        c();
    }

    @Override // defpackage.zgl
    public final void W(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.M(i);
        c();
    }

    @Override // defpackage.zgl
    public final void Y(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.X(j);
        c();
    }

    @Override // defpackage.zgl
    public final void Z(String str) {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.V(str);
        c();
    }

    @Override // defpackage.zhm
    public final zhq b() {
        return this.a.b();
    }

    public final void c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgk zgkVar = this.b;
        long jH = zgkVar.h();
        if (jH > 0) {
            this.a.eW(zgkVar, jH);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.zhm
    public final void close() throws Throwable {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            zgk zgkVar = this.b;
            long j = zgkVar.b;
            th = null;
            if (j > 0) {
                this.a.eW(zgkVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.eW(zgkVar, j);
        c();
    }

    @Override // defpackage.zgl, defpackage.zhm, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgk zgkVar = this.b;
        long j = zgkVar.b;
        if (j > 0) {
            this.a.eW(zgkVar, j);
        }
        this.a.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
