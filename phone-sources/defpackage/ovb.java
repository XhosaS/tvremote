package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovb implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public ovb(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public final xpz a() {
        if (this.b != 0) {
            vvd vvdVar = (vvd) this.a.b();
            vvdVar.getClass();
            return vvdVar.d(vev.j);
        }
        vvd vvdVar2 = (vvd) this.a.b();
        vvdVar2.getClass();
        return vvdVar2.d(vgk.g);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
