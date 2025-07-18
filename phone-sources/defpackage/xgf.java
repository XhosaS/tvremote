package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgf implements xge {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;

    static {
        rzy rzyVar = xes.c;
        a = rzyVar.d("45408342", false);
        b = rzyVar.b("45619115", 20000L);
        c = rzyVar.b("45357457", 5000L);
    }

    @Override // defpackage.xge
    public final long a() {
        return ((Long) b.get()).longValue();
    }

    @Override // defpackage.xge
    public final long b() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.xge
    public final boolean c() {
        return ((Boolean) a.get()).booleanValue();
    }
}
