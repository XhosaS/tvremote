package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetu implements aett {
    public static final rgi a;
    public static final rgi b;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        b = rggVarA.f("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // defpackage.aett
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aett
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
