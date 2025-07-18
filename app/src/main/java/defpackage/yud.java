package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yud extends yvq {
    final /* synthetic */ yue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yud(yue yueVar, yuh yuhVar) {
        super(yuhVar);
        this.a = yueVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvq
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        yue yueVar = this.a;
        yuh yuhVarG = obj.g();
        if (yuhVarG == yueVar.a) {
            return null;
        }
        return yuhVarG;
    }
}
