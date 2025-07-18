package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yss extends yvq {
    final /* synthetic */ yst a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yss(yst ystVar, yuh yuhVar) {
        super(yuhVar);
        this.a = ystVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvq
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        yst ystVar = this.a;
        yuh yuhVarF = obj.f();
        if (yuhVarF == ystVar.a) {
            return null;
        }
        return yuhVarF;
    }
}
