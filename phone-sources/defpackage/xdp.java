package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdp implements xdo {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xdj.c;
        a = rzyVar.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        b = rzyVar.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }

    @Override // defpackage.xdo
    public final long a() {
        return ((Long) a.get()).longValue();
    }

    @Override // defpackage.xdo
    public final long b() {
        return ((Long) b.get()).longValue();
    }
}
