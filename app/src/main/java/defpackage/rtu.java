package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtu {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 6 ? i != 7 ? "null" : "FAILED_ACQUIRING_IN_CALL" : "FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE" : "FAILED_ACQUIRING_PLATFORM_ERROR" : "ACQUIRED" : "UNKNOWN_ACQUIRING_STATUS";
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }
}
