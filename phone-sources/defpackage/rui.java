package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rui implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;

    public rui(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rum b() {
        rum rugVar;
        boolean zG = ((tst) ((xcn) this.a).a).g();
        tst tstVarB = ((rur) this.b).b();
        if (zG) {
            rugVar = (rum) (tstVarB.g() ? this.c : this.d).b();
        } else {
            rugVar = new rug();
        }
        rugVar.getClass();
        return rugVar;
    }
}
