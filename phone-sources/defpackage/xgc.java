package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgc implements xgb {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;

    static {
        rzy rzyVar = xes.c;
        a = rzyVar.d("45377370", true);
        b = rzyVar.d("45377372", false);
        c = rzyVar.d("45377371", false);
    }

    @Override // defpackage.xgb
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.xgb
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.xgb
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }
}
