package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtd {
    private final wxc a;

    public wtd(wxc wxcVar) {
        this.a = wxcVar;
    }

    public final wwt a(String str) {
        final yqt yqtVarI = wum.t() ? ypv.a : yqt.i(this.a.d("com/google/apps/tiktok/tracing/BinderTraceCreation", "onBinderMethodBegin", 29, "Invoking AccountSyncServiceBinder", wwb.a));
        final wvx wvxVarF = wzg.f("AccountSyncServiceBinder.".concat(str), wwb.a, true);
        return new wwt() { // from class: wtc
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wwt] */
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wvxVarF.close();
                yqt yqtVar = yqtVarI;
                if (yqtVar.g()) {
                    yqtVar.c().close();
                }
            }
        };
    }
}
