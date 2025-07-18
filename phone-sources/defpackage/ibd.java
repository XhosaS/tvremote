package defpackage;

/* loaded from: classes.dex */
public final class ibd extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ibe c;
    Object d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibd(ibe ibeVar, yih yihVar) {
        super(yihVar);
        this.c = ibeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
