package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzg extends tyv {
    private long b = 0;
    private long c = 0;
    private int d = 0;

    private static long j(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long k(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long l(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.tyv
    protected final tyy f() {
        long j = this.b;
        long j2 = this.d;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.c;
        long j5 = j3 + j4;
        this.b = j5;
        long j6 = j4 + j5;
        this.c = j6;
        long j7 = j(j5);
        this.b = j7;
        long j8 = j(j6);
        long j9 = j7 + j8;
        this.b = j9;
        this.c = j8 + j9;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int i = tyy.b;
        return new tyw(bArrArray);
    }

    @Override // defpackage.tyv
    protected final void h(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jK = k(j) ^ this.b;
        this.b = jK;
        long jRotateLeft = Long.rotateLeft(jK, 27);
        long j3 = this.c;
        this.b = ((jRotateLeft + j3) * 5) + 1390208809;
        long jL = l(j2) ^ j3;
        this.c = jL;
        this.c = ((Long.rotateLeft(jL, 31) + this.b) * 5) + 944331445;
        this.d += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.tyv
    protected final void i(ByteBuffer byteBuffer) {
        long jF;
        long jF2;
        long jF3;
        long jF4;
        long jF5;
        long jF6;
        long jF7;
        this.d += byteBuffer.remaining();
        long jF8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                jF = 0;
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 2:
                jF2 = 0;
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 3:
                jF3 = 0;
                jF2 = jF3 ^ (txu.f(byteBuffer.get(2)) << 16);
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 4:
                jF4 = 0;
                jF3 = jF4 ^ (txu.f(byteBuffer.get(3)) << 24);
                jF2 = jF3 ^ (txu.f(byteBuffer.get(2)) << 16);
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 5:
                jF5 = 0;
                jF4 = jF5 ^ (txu.f(byteBuffer.get(4)) << 32);
                jF3 = jF4 ^ (txu.f(byteBuffer.get(3)) << 24);
                jF2 = jF3 ^ (txu.f(byteBuffer.get(2)) << 16);
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 6:
                jF6 = 0;
                jF5 = (txu.f(byteBuffer.get(5)) << 40) ^ jF6;
                jF4 = jF5 ^ (txu.f(byteBuffer.get(4)) << 32);
                jF3 = jF4 ^ (txu.f(byteBuffer.get(3)) << 24);
                jF2 = jF3 ^ (txu.f(byteBuffer.get(2)) << 16);
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 7:
                jF6 = txu.f(byteBuffer.get(6)) << 48;
                jF5 = (txu.f(byteBuffer.get(5)) << 40) ^ jF6;
                jF4 = jF5 ^ (txu.f(byteBuffer.get(4)) << 32);
                jF3 = jF4 ^ (txu.f(byteBuffer.get(3)) << 24);
                jF2 = jF3 ^ (txu.f(byteBuffer.get(2)) << 16);
                jF = jF2 ^ (txu.f(byteBuffer.get(1)) << 8);
                jF7 = jF ^ txu.f(byteBuffer.get(0));
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 8:
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 9:
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 10:
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 11:
                jF8 ^= txu.f(byteBuffer.get(10)) << 16;
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 12:
                jF8 ^= txu.f(byteBuffer.get(11)) << 24;
                jF8 ^= txu.f(byteBuffer.get(10)) << 16;
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 13:
                jF8 ^= txu.f(byteBuffer.get(12)) << 32;
                jF8 ^= txu.f(byteBuffer.get(11)) << 24;
                jF8 ^= txu.f(byteBuffer.get(10)) << 16;
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 14:
                jF8 ^= txu.f(byteBuffer.get(13)) << 40;
                jF8 ^= txu.f(byteBuffer.get(12)) << 32;
                jF8 ^= txu.f(byteBuffer.get(11)) << 24;
                jF8 ^= txu.f(byteBuffer.get(10)) << 16;
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            case 15:
                jF8 = txu.f(byteBuffer.get(14)) << 48;
                jF8 ^= txu.f(byteBuffer.get(13)) << 40;
                jF8 ^= txu.f(byteBuffer.get(12)) << 32;
                jF8 ^= txu.f(byteBuffer.get(11)) << 24;
                jF8 ^= txu.f(byteBuffer.get(10)) << 16;
                jF8 ^= txu.f(byteBuffer.get(9)) << 8;
                jF8 ^= txu.f(byteBuffer.get(8));
                jF7 = byteBuffer.getLong();
                this.b = k(jF7) ^ this.b;
                this.c ^= l(jF8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
