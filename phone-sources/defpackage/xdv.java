package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdv implements xdu {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xdj.c;
        int i = 3;
        a = rzyVar.e("SyncFeature__disable_fetch_latest_threads_by_reason", new xde(i), "");
        b = rzyVar.e("SyncFeature__disable_fetch_updated_threads_by_reason", new xde(i), "");
    }

    @Override // defpackage.xdu
    public final qra a() {
        return (qra) a.get();
    }

    @Override // defpackage.xdu
    public final qra b() {
        return (qra) b.get();
    }
}
