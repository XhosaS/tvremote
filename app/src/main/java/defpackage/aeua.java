package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeua implements aetz {
    public static final rgi a;
    public static final rgi b;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.collection.event_safelist", true);
        a = rggVarA.f("measurement.service.store_null_safelist", true);
        b = rggVarA.f("measurement.service.store_safelist", true);
    }

    @Override // defpackage.aetz
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aetz
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
