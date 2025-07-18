package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjv extends zjj {
    private long b = 0;
    private long c = 0;
    private int d = 0;

    private static long k(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long l(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long m(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.zjj
    protected final zjm c() {
        long j = this.b;
        long j2 = this.d;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.c;
        long j5 = j3 + j4;
        this.b = j5;
        long j6 = j4 + j5;
        this.c = j6;
        long jK = k(j5);
        this.b = jK;
        long jK2 = k(j6);
        long j7 = jK + jK2;
        this.b = j7;
        this.c = jK2 + j7;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int i = zjm.b;
        return new zjk(bArrArray);
    }

    @Override // defpackage.zjj
    protected final void i(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jL = l(j) ^ this.b;
        this.b = jL;
        long jRotateLeft = Long.rotateLeft(jL, 27);
        long j3 = this.c;
        this.b = ((jRotateLeft + j3) * 5) + 1390208809;
        long jM = m(j2) ^ j3;
        this.c = jM;
        this.c = ((Long.rotateLeft(jM, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.zjj
    protected final void j(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.d += byteBuffer.remaining();
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 2:
                j2 = 0;
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 3:
                j3 = 0;
                j2 = j3 ^ ((byteBuffer.get(2) & 255) << 16);
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 4:
                j4 = 0;
                j3 = j4 ^ ((byteBuffer.get(3) & 255) << 24);
                j2 = j3 ^ ((byteBuffer.get(2) & 255) << 16);
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 5:
                j5 = 0;
                j4 = j5 ^ ((byteBuffer.get(4) & 255) << 32);
                j3 = j4 ^ ((byteBuffer.get(3) & 255) << 24);
                j2 = j3 ^ ((byteBuffer.get(2) & 255) << 16);
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 6:
                j6 = 0;
                j5 = ((byteBuffer.get(5) & 255) << 40) ^ j6;
                j4 = j5 ^ ((byteBuffer.get(4) & 255) << 32);
                j3 = j4 ^ ((byteBuffer.get(3) & 255) << 24);
                j2 = j3 ^ ((byteBuffer.get(2) & 255) << 16);
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 7:
                j6 = (byteBuffer.get(6) & 255) << 48;
                j5 = ((byteBuffer.get(5) & 255) << 40) ^ j6;
                j4 = j5 ^ ((byteBuffer.get(4) & 255) << 32);
                j3 = j4 ^ ((byteBuffer.get(3) & 255) << 24);
                j2 = j3 ^ ((byteBuffer.get(2) & 255) << 16);
                j = j2 ^ ((byteBuffer.get(1) & 255) << 8);
                j7 = j ^ (byteBuffer.get(0) & 255);
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 8:
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 9:
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 10:
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 11:
                j8 ^= (byteBuffer.get(10) & 255) << 16;
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                j8 ^= (byteBuffer.get(11) & 255) << 24;
                j8 ^= (byteBuffer.get(10) & 255) << 16;
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                j8 ^= (byteBuffer.get(12) & 255) << 32;
                j8 ^= (byteBuffer.get(11) & 255) << 24;
                j8 ^= (byteBuffer.get(10) & 255) << 16;
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                j8 ^= (byteBuffer.get(13) & 255) << 40;
                j8 ^= (byteBuffer.get(12) & 255) << 32;
                j8 ^= (byteBuffer.get(11) & 255) << 24;
                j8 ^= (byteBuffer.get(10) & 255) << 16;
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            case 15:
                j8 = (byteBuffer.get(14) & 255) << 48;
                j8 ^= (byteBuffer.get(13) & 255) << 40;
                j8 ^= (byteBuffer.get(12) & 255) << 32;
                j8 ^= (byteBuffer.get(11) & 255) << 24;
                j8 ^= (byteBuffer.get(10) & 255) << 16;
                j8 ^= (byteBuffer.get(9) & 255) << 8;
                j8 ^= byteBuffer.get(8) & 255;
                j7 = byteBuffer.getLong();
                this.b = l(j7) ^ this.b;
                this.c ^= m(j8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
