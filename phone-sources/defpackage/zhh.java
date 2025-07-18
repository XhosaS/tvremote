package defpackage;

import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhh extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ zhi a;

    public zhh(zhi zhiVar) {
        this.a = zhiVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        zhi zhiVar = this.a;
        if (zhiVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(zhiVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zhi zhiVar = this.a;
        if (zhiVar.c) {
            throw new IOException("closed");
        }
        zgk zgkVar = zhiVar.b;
        if (zgkVar.b == 0 && zhiVar.a.a(zgkVar, 8192L) == -1) {
            return -1;
        }
        return zgkVar.d() & 255;
    }

    public final String toString() {
        zhi zhiVar = this.a;
        Objects.toString(zhiVar);
        return zhiVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        zhi zhiVar = this.a;
        if (zhiVar.c) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            zgk zgkVar = zhiVar.b;
            if (zgkVar.b == 0 && zhiVar.a.a(zgkVar, 8192L) == -1) {
                return j;
            }
            long j2 = zgkVar.b;
            j += j2;
            zgkVar.Q(outputStream, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        zhi zhiVar = this.a;
        if (!zhiVar.c) {
            wcq.aG(bArr.length, i, i2);
            zgk zgkVar = zhiVar.b;
            if (zgkVar.b == 0 && zhiVar.a.a(zgkVar, 8192L) == -1) {
                return -1;
            }
            return zgkVar.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
