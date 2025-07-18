package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zle extends zlh {
    private int a;
    private int b;
    private boolean e;
    private boolean f;

    public zle(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.e = false;
        this.f = true;
        this.a = inputStream.read();
        int i2 = inputStream.read();
        this.b = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        c();
    }

    private final boolean c() {
        if (!this.e && this.f && this.a == 0 && this.b == 0) {
            this.e = true;
            b();
        }
        return this.e;
    }

    public final void a(boolean z) {
        this.f = z;
        c();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (c()) {
            return -1;
        }
        int i = this.c.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.a;
        this.a = this.b;
        this.b = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        InputStream inputStream = this.c;
        int i3 = inputStream.read(bArr, i + 2, i2 - 2);
        if (i3 >= 0) {
            bArr[i] = (byte) this.a;
            bArr[i + 1] = (byte) this.b;
            this.a = inputStream.read();
            int i4 = inputStream.read();
            this.b = i4;
            if (i4 >= 0) {
                return i3 + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
