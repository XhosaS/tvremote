package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglz implements agfz {
    final agfz a;
    final aggz b;

    public aglz(agfz agfzVar, aggz aggzVar) {
        this.a = agfzVar;
        this.b = aggzVar;
    }

    @Override // defpackage.agfz
    public final void c(aggi aggiVar) {
        this.a.c(aggiVar);
    }

    @Override // defpackage.agfz
    public final void d(Object obj) {
        try {
            Object objA = this.b.a(obj);
            aghn.b(objA, "The mapper function returned a null value.");
            this.a.d(objA);
        } catch (Throwable th) {
            aggq.a(th);
            fg(th);
        }
    }

    @Override // defpackage.agfz
    public final void fg(Throwable th) {
        this.a.fg(th);
    }
}
