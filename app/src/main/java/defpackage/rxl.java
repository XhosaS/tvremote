package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxl {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "OPENED_SHARED" : "OPENED_SEAMLESSLY" : "OPENED" : "UNKNOWN_OPENING_SUCCESS";
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }
}
