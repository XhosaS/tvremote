package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djn implements djm {
    private final InputStream a;

    public djn(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.djm
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.djm
    public final int b(byte[] bArr, int i) throws djl {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new djl();
        }
        return i2;
    }

    @Override // defpackage.djm
    public final long c(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.a;
            long jSkip = inputStream.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.djm
    public final short d() throws IOException {
        int i = this.a.read();
        if (i != -1) {
            return (short) i;
        }
        throw new djl();
    }
}
