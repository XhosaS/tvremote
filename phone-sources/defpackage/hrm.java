package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrm implements hrl {
    private final /* synthetic */ int a;
    private final Object b;

    public hrm(InputStream inputStream, int i) {
        this.a = i;
        this.b = inputStream;
    }

    @Override // defpackage.hrl
    public final int a() throws IOException {
        int iD;
        short sD;
        if (this.a != 0) {
            iD = d() << 8;
            sD = d();
        } else {
            iD = d() << 8;
            sD = d();
        }
        return iD | sD;
    }

    @Override // defpackage.hrl
    public final int b(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        if (this.a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.b;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }
        int i3 = 0;
        while (i2 < i) {
            i3 = ((InputStream) this.b).read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new hrk();
        }
        return i2;
    }

    @Override // defpackage.hrl
    public final long c(long j) throws IOException {
        if (this.a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.b;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = (InputStream) this.b;
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

    @Override // defpackage.hrl
    public final short d() throws IOException {
        if (this.a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.b;
            if (byteBuffer.remaining() > 0) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new hrk();
        }
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new hrk();
    }

    public hrm(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
