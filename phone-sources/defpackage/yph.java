package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yph extends yxl {
    public final yns b;

    public yph(yil yilVar, yih yihVar) {
        super(yilVar, yihVar);
        this.b = new yns(0, ynv.a);
    }

    @Override // defpackage.yxl, defpackage.ynw
    protected final void eM(Object obj) {
        yns ynsVar;
        do {
            ynsVar = this.b;
            int i = ynsVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                yih yihVar = this.e;
                ywv.a(wcq.S(yihVar), yks.l(obj, yihVar));
                return;
            }
        } while (!ynsVar.d(0, 2));
    }

    @Override // defpackage.yxl, defpackage.yql
    protected final void eR(Object obj) {
        eM(obj);
    }
}
