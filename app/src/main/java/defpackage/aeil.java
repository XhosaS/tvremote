package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aeil implements beg {
    final /* synthetic */ bq a;

    public aeil(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.beg
    public final /* synthetic */ beb a(Class cls) {
        return bfa.a.a();
    }

    @Override // defpackage.beg
    public final beb b(Class cls, bet betVar) {
        bq bqVar = this.a;
        if (!(bqVar.ep() instanceof aeja)) {
            throw new IllegalStateException("FragmentRetainedComponent cannot be instantiated without a host");
        }
        ((aeim) aehg.a(((aeib) ((aeja) bqVar.ep()).cO()).a(), aeim.class)).c();
        return new aein(new etj());
    }

    @Override // defpackage.beg
    public final /* synthetic */ beb c(agxd agxdVar, bet betVar) {
        return bef.a(this, agxdVar, betVar);
    }
}
