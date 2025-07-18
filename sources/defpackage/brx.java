package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brx extends bsc {
    final /* synthetic */ bry a;
    private int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brx(bry bryVar, bqr bqrVar) {
        super(bryVar.b);
        this.a = bryVar;
        l(bqrVar);
    }

    @Override // defpackage.bsc
    public final int a(int i) {
        return ((i * (r0.g - 6)) * 2000) / this.a.f;
    }

    @Override // defpackage.bsc
    public final int b() {
        return 0;
    }

    @Override // defpackage.bsc
    public final short c() {
        return this.a.e;
    }

    @Override // defpackage.bsc
    public final void d(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        if (this.k == 0 && bArr.length >= 6) {
            short s = byteBufferOrder.getShort();
            byteBufferOrder.get();
            int i = this.e;
            if (s != i) {
                int i2 = s - i;
                ((cbs) bry.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec04$MicSession04", "handleRxResponse", 203, "Spec04.java")).L(s, i2);
                this.h += i2;
                int i3 = i2 * (r5.g - 6);
                m(this.a.f, i3 + i3);
            }
            int i4 = this.e;
            this.d.b(byteBufferOrder, i4 != 0 && s == i4);
            this.e = s;
        }
        int length = this.k + bArr.length;
        this.k = length;
        bry bryVar = this.a;
        if (length >= bryVar.g) {
            this.k = 0;
            this.e++;
        }
        n(new dln(bryVar.f, this.d.a(byteBufferOrder)));
    }

    @Override // defpackage.bsc
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            ((cbs) bry.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec04$MicSession04", "handleSyncFrame", 157, "Spec04.java")).p("Received an invalid audio sync frame");
            return;
        }
        short s = byteBuffer.getShort();
        int i = s - this.e;
        this.h += i;
        int iA = a(s);
        cbt cbtVar = bry.a;
        cbs cbsVar = (cbs) cbtVar.c().j("com/google/android/tv/remote/service/bleremote/protocol/Spec04$MicSession04", "handleSyncFrame", 164, "Spec04.java");
        Integer numValueOf = Integer.valueOf(s);
        cbsVar.A("Received audio sync frame: %d (skipped %d, delay %+dms)", numValueOf, Integer.valueOf(i), Long.valueOf((SystemClock.uptimeMillis() - this.g) - iA));
        int i2 = this.k;
        if (i2 != 0) {
            if (i2 != 0) {
                ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec04$MicSession04", "handleSyncFrame", 174, "Spec04.java")).A("Audio data is out of sync %d:%d (new position: %d:0)", Integer.valueOf(this.e), Integer.valueOf(this.k), numValueOf);
                bry bryVar = this.a;
                int i3 = (i * (bryVar.g - 6)) + (6 - this.k);
                m(bryVar.f, i3 + i3);
            }
            this.k = 0;
            this.e = s;
        }
        if (this.e == s) {
            return;
        }
        int i4 = i * (r1.g - 6);
        m(this.a.f, i4 + i4);
        this.k = 0;
        this.e = s;
    }

    @Override // defpackage.bsc
    public final boolean f(brw brwVar) {
        return true;
    }

    @Override // defpackage.bsc
    public final byte[] g() {
        return new byte[]{13};
    }

    @Override // defpackage.bsc
    public final byte[] h() {
        bry bryVar = this.a;
        if (bryVar.c < 4) {
            return new byte[]{12};
        }
        return ByteBuffer.allocate(3).order(ByteOrder.BIG_ENDIAN).put((byte) 12).putShort((bryVar.d & 2) != 0 ? (short) 2 : (short) 1).array();
    }
}
