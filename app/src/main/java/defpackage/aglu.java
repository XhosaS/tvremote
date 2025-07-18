package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglu implements agfz {
    final agfz a;
    final /* synthetic */ aglv b;

    public aglu(aglv aglvVar, agfz agfzVar) {
        this.b = aglvVar;
        this.a = agfzVar;
    }

    @Override // defpackage.agfz
    public final void c(aggi aggiVar) {
        this.a.c(aggiVar);
    }

    @Override // defpackage.agfz
    public final void d(Object obj) {
        try {
            this.b.b.a(obj);
            this.a.d(obj);
        } catch (Throwable th) {
            aggq.a(th);
            this.a.fg(th);
        }
    }

    @Override // defpackage.agfz
    public final void fg(Throwable th) {
        this.a.fg(th);
    }
}
