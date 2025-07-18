package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rty {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? "null" : "FAILED_GETTING_STATUS_FUTURE" : "FAILED_RELEASING_DUE_TO_INACTIVE_SESSION" : "FAILED_RELEASING_PLATFORM_ERROR" : "RELEASED" : "UNKNOWN_RELEASING_STATUS";
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
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
