package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfz implements xfy {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;

    static {
        rzy rzyVar = xes.c;
        a = rzyVar.b("45621661", 0L);
        b = rzyVar.d("45621476", false);
        c = rzyVar.d("45630326", true);
    }

    @Override // defpackage.xfy
    public final long a() {
        return ((Long) a.get()).longValue();
    }

    @Override // defpackage.xfy
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.xfy
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }
}
