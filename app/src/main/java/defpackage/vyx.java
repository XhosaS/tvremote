package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class vyx {
    public static final vyv f = new vyw();

    public abstract long a();

    public abstract vyv b();

    public abstract yqt c();

    public abstract yqt d();

    public abstract boolean e();

    final vyx f(vyg vygVar) {
        return new vxk(a(), b(), e(), yqt.i(vygVar), yqt.i(vygVar));
    }

    final vyx g(boolean z) {
        yqw.M(b() instanceof vxl, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        yqw.M(z != e(), "Double-open or double-close on background fetch callbacks.");
        return new vxk(a(), b(), z, d(), c());
    }
}
