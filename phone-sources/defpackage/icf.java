package defpackage;

/* loaded from: classes.dex */
public final class icf extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public icd c;
    final /* synthetic */ bdu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icf(bdu bduVar, yih yihVar) {
        super(yihVar);
        this.d = bduVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
