package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lic implements lio {
    public static final lic a = new lic();
    private final liq b = liq.e(0);

    private lic() {
    }

    @Override // defpackage.lio
    public final int a() {
        return 42;
    }

    @Override // defpackage.lio
    public final lio b() {
        return null;
    }

    @Override // defpackage.lio
    public final liq c() {
        return this.b;
    }

    @Override // defpackage.lio
    public final void d(liq liqVar) {
        krd.b("Warning: child impression on ".concat(String.valueOf(lic.class.getName())));
    }

    @Override // defpackage.lio
    public final boolean e(Object obj) {
        return obj == a;
    }

    public final boolean equals(Object obj) {
        return e(obj);
    }

    public final int hashCode() {
        return 42;
    }
}
