package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdf implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public rdf(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rde b() {
        rcn rcnVarB = ((rco) this.a).b();
        rdb rdbVarB = ((rdc) this.b).b();
        ((qzr) this.c).b();
        return new rde(rcnVarB, rdbVarB);
    }
}
