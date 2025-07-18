package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypv {
    public static final yxo a = new yxo("REMOVED_TASK");
    public static final yxo b = new yxo("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
