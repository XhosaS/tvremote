package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxi implements ahwy {
    public final ahxo a;
    public final ahwx b = new ahwx();
    public boolean c;

    public ahxi(ahxo ahxoVar) {
        this.a = ahxoVar;
    }

    @Override // defpackage.ahwy
    public final void B(String str) {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.A(str);
        b();
    }

    public final void b() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ahwx ahwxVar = this.b;
        long jF = ahwxVar.f();
        if (jF > 0) {
            this.a.fF(ahwxVar, jF);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ahxo
    public final void close() throws Throwable {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            ahwx ahwxVar = this.b;
            long j = ahwxVar.b;
            th = null;
            if (j > 0) {
                this.a.fF(ahwxVar, j);
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

    @Override // defpackage.ahxo
    public final void fF(ahwx ahwxVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.fF(ahwxVar, j);
        b();
    }

    @Override // defpackage.ahwy, defpackage.ahxo, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ahwx ahwxVar = this.b;
        long j = ahwxVar.b;
        if (j > 0) {
            this.a.fF(ahwxVar, j);
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

    @Override // defpackage.ahwy
    public final void v(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.u(i);
        b();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // defpackage.ahwy
    public final void x(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.w(i);
        b();
    }
}
