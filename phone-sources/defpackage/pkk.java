package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkk implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;

    public pkk(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ntp b() {
        pkg pkgVar = (pkg) this.a.b();
        tst tstVar = (tst) ((xcn) this.b).a;
        uhs uhsVar = (uhs) this.c.b();
        pkv pkvVar = (pkv) this.e.b();
        pkgVar.getClass();
        uhsVar.getClass();
        pkvVar.getClass();
        if (tstVar.g()) {
        } else {
            new uib(uhsVar);
        }
        return new ntp(pkgVar, (byte[]) null);
    }
}
