package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfv extends cfq {
    private long a = 0;
    private long b = 0;
    private int c = 0;

    private static long h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long i(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long j(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.cfq
    protected final cfs d() {
        long j = this.a;
        long j2 = this.c;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.b;
        long j5 = j3 + j4;
        this.a = j5;
        long j6 = j4 + j5;
        this.b = j6;
        long jH = h(j5);
        this.a = jH;
        long jH2 = h(j6);
        long j7 = jH + jH2;
        this.a = j7;
        this.b = jH2 + j7;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array();
        int i = cfs.b;
        return new cfr(bArrArray);
    }

    @Override // defpackage.cfq
    protected final void e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jI = i(j) ^ this.a;
        this.a = jI;
        long jRotateLeft = Long.rotateLeft(jI, 27);
        long j3 = this.b;
        this.a = ((jRotateLeft + j3) * 5) + 1390208809;
        long j4 = j(j2) ^ j3;
        this.b = j4;
        this.b = ((Long.rotateLeft(j4, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cfq
    protected final void f(ByteBuffer byteBuffer) {
        long jI;
        long jI2;
        long jI3;
        long jI4;
        long jI5;
        long jI6;
        long jI7;
        this.c += byteBuffer.remaining();
        long jI8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                jI = 0;
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 2:
                jI2 = 0;
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 3:
                jI3 = 0;
                jI2 = jI3 ^ (ces.i(byteBuffer.get(2)) << 16);
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 4:
                jI4 = 0;
                jI3 = jI4 ^ (ces.i(byteBuffer.get(3)) << 24);
                jI2 = jI3 ^ (ces.i(byteBuffer.get(2)) << 16);
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 5:
                jI5 = 0;
                jI4 = jI5 ^ (ces.i(byteBuffer.get(4)) << 32);
                jI3 = jI4 ^ (ces.i(byteBuffer.get(3)) << 24);
                jI2 = jI3 ^ (ces.i(byteBuffer.get(2)) << 16);
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 6:
                jI6 = 0;
                jI5 = (ces.i(byteBuffer.get(5)) << 40) ^ jI6;
                jI4 = jI5 ^ (ces.i(byteBuffer.get(4)) << 32);
                jI3 = jI4 ^ (ces.i(byteBuffer.get(3)) << 24);
                jI2 = jI3 ^ (ces.i(byteBuffer.get(2)) << 16);
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 7:
                jI6 = ces.i(byteBuffer.get(6)) << 48;
                jI5 = (ces.i(byteBuffer.get(5)) << 40) ^ jI6;
                jI4 = jI5 ^ (ces.i(byteBuffer.get(4)) << 32);
                jI3 = jI4 ^ (ces.i(byteBuffer.get(3)) << 24);
                jI2 = jI3 ^ (ces.i(byteBuffer.get(2)) << 16);
                jI = jI2 ^ (ces.i(byteBuffer.get(1)) << 8);
                jI7 = jI ^ ces.i(byteBuffer.get(0));
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 8:
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 9:
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 10:
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 11:
                jI8 ^= ces.i(byteBuffer.get(10)) << 16;
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 12:
                jI8 ^= ces.i(byteBuffer.get(11)) << 24;
                jI8 ^= ces.i(byteBuffer.get(10)) << 16;
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 13:
                jI8 ^= ces.i(byteBuffer.get(12)) << 32;
                jI8 ^= ces.i(byteBuffer.get(11)) << 24;
                jI8 ^= ces.i(byteBuffer.get(10)) << 16;
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 14:
                jI8 ^= ces.i(byteBuffer.get(13)) << 40;
                jI8 ^= ces.i(byteBuffer.get(12)) << 32;
                jI8 ^= ces.i(byteBuffer.get(11)) << 24;
                jI8 ^= ces.i(byteBuffer.get(10)) << 16;
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            case 15:
                jI8 = ces.i(byteBuffer.get(14)) << 48;
                jI8 ^= ces.i(byteBuffer.get(13)) << 40;
                jI8 ^= ces.i(byteBuffer.get(12)) << 32;
                jI8 ^= ces.i(byteBuffer.get(11)) << 24;
                jI8 ^= ces.i(byteBuffer.get(10)) << 16;
                jI8 ^= ces.i(byteBuffer.get(9)) << 8;
                jI8 ^= ces.i(byteBuffer.get(8));
                jI7 = byteBuffer.getLong();
                this.a = i(jI7) ^ this.a;
                this.b ^= j(jI8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
