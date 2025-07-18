package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gi extends gp {
    private final nxb a;

    public gi(nxb nxbVar) {
        this.a = nxbVar;
    }

    @Override // defpackage.gp
    @yfp
    public final void a() {
        throw null;
    }

    @Override // defpackage.gp
    public final void b(Object obj) {
        Object obj2 = this.a.a;
        if (obj2 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        ((gp) obj2).b(obj);
    }
}
