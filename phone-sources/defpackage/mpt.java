package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpt implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;

    public mpt(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mps b() {
        return new mps(((rgq) this.a).a(), (pkg) this.b.b(), ((plb) this.c).b(), ((mpo) this.d).b());
    }
}
