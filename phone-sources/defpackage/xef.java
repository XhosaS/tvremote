package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xef implements xee {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xdz.b;
        a = rzyVar.d("45693972", false);
        b = rzyVar.a("45687057", 1.0E-4d);
    }

    @Override // defpackage.xee
    public final double a() {
        return ((Double) b.get()).doubleValue();
    }

    @Override // defpackage.xee
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }
}
