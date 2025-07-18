package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaec extends InputStream implements InputStreamRetargetInterface {
    boolean a = false;
    InputStream b = null;
    final InputStream c;
    final List d;
    final byte[] e;

    public aaec(List list, InputStream inputStream, byte[] bArr) {
        this.d = list;
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.c.mark(Integer.MAX_VALUE);
        this.e = (byte[]) bArr.clone();
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        if (!this.a) {
            this.a = true;
            for (zzy zzyVar : this.d) {
                try {
                    InputStream inputStream2 = this.c;
                    InputStream inputStreamA = zzyVar.a(inputStream2, this.e);
                    int i3 = inputStreamA.read(bArr, i, i2);
                    if (i3 != 0) {
                        this.b = inputStreamA;
                        inputStream2.mark(0);
                        return i3;
                    }
                    throw new IOException("Could not read bytes from the ciphertext stream");
                } catch (IOException unused) {
                    this.c.reset();
                } catch (GeneralSecurityException unused2) {
                    this.c.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
