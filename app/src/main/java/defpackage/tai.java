package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tai {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "REASON_CLOSED" : "REASON_MAX_COMPUTATION_DURATION" : "REASON_MAX_AUDIO_RECEIVED" : "REASON_INITIAL_REALTIME_GAP" : "REASON_REALTIME_GAP" : "REASON_UNKNOWN";
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
