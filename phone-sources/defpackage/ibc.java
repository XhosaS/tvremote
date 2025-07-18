package defpackage;

/* loaded from: classes.dex */
public final class ibc extends yiv {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ ibe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibc(ibe ibeVar, yih yihVar) {
        super(yihVar);
        this.d = ibeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
