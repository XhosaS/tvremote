package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afja extends afep {
    @Override // defpackage.afep
    public void b(afih afihVar) {
        i().b(afihVar);
    }

    @Override // defpackage.afep
    public final void d() {
        i().d();
    }

    public abstract afep i();

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", i());
        return yqqVarB.toString();
    }
}
