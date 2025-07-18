package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
class asq extends asm {
    public asq(InputStream inputStream) {
        super(inputStream, ByteOrder.BIG_ENDIAN);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) throws IOException {
        long j2 = this.b;
        if (j2 > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    public asq(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }
}
