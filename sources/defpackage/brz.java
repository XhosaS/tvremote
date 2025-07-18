package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brz extends bsc {
    final /* synthetic */ bsa a;
    private final brv k;
    private final byte l;
    private final bru m;
    private short n;
    private int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brz(bsa bsaVar, bqr bqrVar) {
        super(bsaVar.b);
        this.a = bsaVar;
        this.k = brv.MIC_OPEN;
        this.l = (byte) 0;
        this.m = bqrVar.c() ? bru.PLAYBACK : bru.CAPTURE;
        this.n = (short) 0;
        this.o = -1;
        l(bqrVar);
    }

    private final void o(byte b) {
        this.n = b;
        this.o = b == 2 ? 16000 : 8000;
    }

    @Override // defpackage.bsc
    public final int a(int i) {
        return ((i * this.a.c) * 2000) / this.o;
    }

    @Override // defpackage.bsc
    public final int b() {
        int iOrdinal = this.k.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                return 0;
            }
        }
        return i;
    }

    @Override // defpackage.bsc
    public final short c() {
        return this.n;
    }

    @Override // defpackage.bsc
    public final void d(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.e++;
        n(new dln(this.o, this.d.a(byteBufferOrder)));
    }

    @Override // defpackage.bsc
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 6) {
            ((cbs) bsa.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10$MicSession10", "handleSyncFrame", 184, "Spec10.java")).p("Received an invalid audio sync frame");
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        int i = s - this.e;
        if (i != 0) {
            int i2 = this.o;
            int i3 = this.a.c * i;
            m(i2, i3 + i3);
            this.h += i;
        }
        int iA = a(s);
        cbt cbtVar = bsa.a;
        ((cbs) cbtVar.c().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10$MicSession10", "handleSyncFrame", 196, "Spec10.java")).A("Received audio sync command: %d (skipped %d, delay %+dms)", Integer.valueOf(s), Integer.valueOf(i), Long.valueOf((SystemClock.uptimeMillis() - this.g) - iA));
        this.d.b(byteBuffer, s == this.e);
        this.e = s;
        if (b != this.n) {
            ((cbs) cbtVar.c().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10$MicSession10", "handleSyncFrame", 204, "Spec10.java")).z("Changing codec from %s to %s", Integer.toBinaryString(this.n), Integer.toBinaryString(b));
            o(b);
        }
    }

    @Override // defpackage.bsc
    public final boolean f(brw brwVar) {
        if (this.l != brwVar.c) {
            return false;
        }
        o(brwVar.b);
        return true;
    }

    @Override // defpackage.bsc
    public final byte[] g() {
        return ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN).put((byte) 13).put(this.l).array();
    }

    @Override // defpackage.bsc
    public final byte[] h() {
        return ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN).put((byte) 12).put(this.m.c).array();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brz(bsa bsaVar, brw brwVar) {
        super(bsaVar.b);
        this.a = bsaVar;
        this.k = brwVar.a;
        this.l = brwVar.c;
        this.m = bru.CAPTURE;
        o(brwVar.b);
    }
}
