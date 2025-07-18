package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcy {
    public static final ahmg a = new ahmg("REMOVED_TASK");
    public static final ahmg b = new ahmg("CLOSED_EMPTY");

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
