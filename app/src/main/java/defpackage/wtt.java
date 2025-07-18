package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtt extends IllegalStateException {
    public wtt(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        return a.n(str == null ? "" : ": ".concat(str), str2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }

    public wtt(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
