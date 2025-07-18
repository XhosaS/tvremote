package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjv extends agfo {
    final agfq a;

    public agjv(agfq agfqVar) {
        this.a = agfqVar;
    }

    @Override // defpackage.agfo
    protected final void n(agfs agfsVar) {
        agjt agjtVar = new agjt(agfsVar);
        agfsVar.d(agjtVar);
        try {
            this.a.a(agjtVar);
        } catch (Throwable th) {
            aggq.a(th);
            agjtVar.a(th);
        }
    }
}
