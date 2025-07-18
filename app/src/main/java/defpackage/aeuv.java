package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeuv implements aeuu {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.test.boolean_flag", false);
        b = rggVarA.e("measurement.test.cached_long_flag", -1L);
        c = rggVarA.d("measurement.test.double_flag", -3.0d);
        d = rggVarA.e("measurement.test.int_flag", -2L);
        e = rggVarA.e("measurement.test.long_flag", -1L);
        f = new rgc(rggVarA, "measurement.test.string_flag", "---");
    }

    @Override // defpackage.aeuu
    public final double a() {
        return ((Double) c.b()).doubleValue();
    }

    @Override // defpackage.aeuu
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aeuu
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.aeuu
    public final long d() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.aeuu
    public final String e() {
        return (String) f.b();
    }

    @Override // defpackage.aeuu
    public final boolean f() {
        return ((Boolean) a.b()).booleanValue();
    }
}
