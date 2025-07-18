package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azd {
    public final azb e = new azb();
    public azn f;

    public abstract int a();

    public abstract Object b(int i);

    public final azm c(Object obj) {
        azn aznVar = this.f;
        if (aznVar != null) {
            return aznVar.a(obj);
        }
        throw new IllegalStateException("Presenter selector must not be null");
    }

    public final void d(azn aznVar) {
        if (aznVar == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        boolean z = this.f != null;
        this.f = aznVar;
        if (z) {
            this.e.a();
        }
    }
}
