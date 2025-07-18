package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcx implements mcw {
    private final ldv a;
    private final Executor b;
    private final Executor c;
    private final lie d;
    private final lyz e;
    private final ltt f;

    public mcx(ldv ldvVar, lyz lyzVar, ltt lttVar, Executor executor, Executor executor2, lie lieVar) {
        ldvVar.getClass();
        this.a = ldvVar;
        lyzVar.getClass();
        this.e = lyzVar;
        lttVar.getClass();
        this.f = lttVar;
        this.b = executor;
        this.c = executor2;
        this.d = lieVar;
        a(icz.a);
    }

    @Override // defpackage.mcw
    public final void a(idy idyVar) {
        this.c.execute(new mav(this.a, this.e, idyVar, "wishlist", "wishlist_account", 1));
    }

    @Override // defpackage.mcw
    public final void b(ksn ksnVar, idy idyVar, mfm mfmVar) {
        this.d.an();
        this.b.execute(new lik(mfmVar, new mcn(this.e, this.f, ksnVar, idyVar), 13, null));
    }

    @Override // defpackage.mfk
    public final /* bridge */ /* synthetic */ void g(Object obj, idy idyVar) {
        this.b.execute(new mcn(this.e, this.f, (ksn) obj, idyVar));
    }
}
