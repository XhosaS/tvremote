package defpackage;

/* loaded from: classes2.dex */
public final class iol extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ bdu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iol(bdu bduVar, yih yihVar) {
        super(yihVar);
        this.c = bduVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
