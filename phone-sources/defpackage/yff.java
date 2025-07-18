package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yff extends yfb {
    final /* synthetic */ yfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff(yfg yfgVar) {
        super(yfgVar);
        this.b = yfgVar;
    }

    @Override // defpackage.yfb, defpackage.yfa, defpackage.xrp
    public final void f(xqk xqkVar, xrv xrvVar) {
        super.f(xqkVar, xrvVar);
        yfg yfgVar = this.b;
        if (yfgVar.f.i || xqkVar != xqk.IDLE) {
            return;
        }
        yfgVar.b.c();
    }
}
