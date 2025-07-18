package defpackage;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrx {
    public static final yse a = new yse(-1, null, null, 0);
    public static final int b = wae.O("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = wae.O("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", WVMediaCrypto.TYPE, 0, 0, 12);
    public static final yxo d = new yxo("BUFFERED");
    public static final yxo e = new yxo("SHOULD_BUFFER");
    public static final yxo f = new yxo("S_RESUMING_BY_RCV");
    public static final yxo g = new yxo("RESUMING_BY_EB");
    public static final yxo h = new yxo("POISONED");
    public static final yxo i = new yxo("DONE_RCV");
    public static final yxo j = new yxo("INTERRUPTED_SEND");
    public static final yxo k = new yxo("INTERRUPTED_RCV");
    public static final yxo l = new yxo("CHANNEL_CLOSED");
    public static final yxo m = new yxo("SUSPEND");
    public static final yxo n = new yxo("SUSPEND_NO_WAITER");
    public static final yxo o = new yxo("FAILED");
    public static final yxo p = new yxo("NO_RECEIVE_RESULT");
    public static final yxo q = new yxo("CLOSE_HANDLER_CLOSED");
    public static final yxo r = new yxo("CLOSE_HANDLER_INVOKED");
    public static final yxo s = new yxo("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        return (true != z ? 0L : 4611686018427387904L) + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(yoe yoeVar, Object obj) {
        Object objH = yoeVar.h(obj, null);
        if (objH == null) {
            return false;
        }
        yoeVar.a(objH);
        return true;
    }
}
