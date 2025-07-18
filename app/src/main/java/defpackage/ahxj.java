package defpackage;

import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxj extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ahxk a;

    public ahxj(ahxk ahxkVar) {
        this.a = ahxkVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ahxk ahxkVar = this.a;
        if (ahxkVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(ahxkVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ahxk ahxkVar = this.a;
        if (ahxkVar.c) {
            throw new IOException("closed");
        }
        ahwx ahwxVar = ahxkVar.b;
        if (ahwxVar.b == 0 && ahxkVar.a.a(ahwxVar, 8192L) == -1) {
            return -1;
        }
        return ahwxVar.c() & 255;
    }

    public final String toString() {
        ahxk ahxkVar = this.a;
        Objects.toString(ahxkVar);
        return ahxkVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        ahxk ahxkVar = this.a;
        if (ahxkVar.c) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            ahwx ahwxVar = ahxkVar.b;
            if (ahwxVar.b == 0 && ahxkVar.a.a(ahwxVar, 8192L) == -1) {
                return j;
            }
            long j2 = ahwxVar.b;
            j += j2;
            ahwxVar.y(outputStream, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        ahxk ahxkVar = this.a;
        if (!ahxkVar.c) {
            ahwt.a(bArr.length, i, i2);
            ahwx ahwxVar = ahxkVar.b;
            if (ahwxVar.b == 0 && ahxkVar.a.a(ahwxVar, 8192L) == -1) {
                return -1;
            }
            return ahwxVar.d(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
