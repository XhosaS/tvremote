package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfl {
    public static final ahfu a = new ahfu(-1, null, null, 0);
    public static final int b = ahmj.c("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = ahmj.c("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final ahmg d = new ahmg("BUFFERED");
    public static final ahmg e = new ahmg("SHOULD_BUFFER");
    public static final ahmg f = new ahmg("S_RESUMING_BY_RCV");
    public static final ahmg g = new ahmg("RESUMING_BY_EB");
    public static final ahmg h = new ahmg("POISONED");
    public static final ahmg i = new ahmg("DONE_RCV");
    public static final ahmg j = new ahmg("INTERRUPTED_SEND");
    public static final ahmg k = new ahmg("INTERRUPTED_RCV");
    public static final ahmg l = new ahmg("CHANNEL_CLOSED");
    public static final ahmg m = new ahmg("SUSPEND");
    public static final ahmg n = new ahmg("SUSPEND_NO_WAITER");
    public static final ahmg o = new ahmg("FAILED");
    public static final ahmg p = new ahmg("NO_RECEIVE_RESULT");
    public static final ahmg q = new ahmg("CLOSE_HANDLER_CLOSED");
    public static final ahmg r = new ahmg("CLOSE_HANDLER_INVOKED");
    public static final ahmg s = new ahmg("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        return (true != z ? 0L : 4611686018427387904L) + j2;
    }

    public static final boolean b(ahap ahapVar, Object obj) {
        if (ahapVar.j(obj, null) == null) {
            return false;
        }
        ahapVar.l();
        return true;
    }
}
