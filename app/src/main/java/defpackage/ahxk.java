package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxk implements ahwz {
    public final ahxq a;
    public final ahwx b = new ahwx();
    public boolean c;

    public ahxk(ahxq ahxqVar) {
        this.a = ahxqVar;
    }

    @Override // defpackage.ahxq
    public final long a(ahwx ahwxVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.l(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ahwx ahwxVar2 = this.b;
        if (ahwxVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.a(ahwxVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return ahwxVar2.a(ahwxVar, Math.min(j, ahwxVar2.b));
    }

    @Override // defpackage.ahwz
    public final byte c() throws EOFException {
        n(1L);
        return this.b.c();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ahxq
    public final void close() throws EOFException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        ahwx ahwxVar = this.b;
        ahwxVar.o(ahwxVar.b);
    }

    @Override // defpackage.ahwz
    public final int e() throws EOFException {
        n(4L);
        return this.b.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.ahwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(defpackage.ahxb r20) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxk.g(ahxb):long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.ahwz
    public final ahxb j(long j) throws EOFException {
        n(j);
        return this.b.j(j);
    }

    @Override // defpackage.ahwz
    public final void n(long j) throws EOFException {
        if (!p(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ahwz
    public final void o(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            ahwx ahwxVar = this.b;
            if (ahwxVar.b == 0 && this.a.a(ahwxVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, ahwxVar.b);
            ahwxVar.o(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.ahwz
    public final boolean p(long j) {
        ahwx ahwxVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.l(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            ahwxVar = this.b;
            if (ahwxVar.b >= j) {
                return true;
            }
        } while (this.a.a(ahwxVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ahwx ahwxVar = this.b;
        if (ahwxVar.b == 0 && this.a.a(ahwxVar, 8192L) == -1) {
            return -1;
        }
        return ahwxVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }
}
