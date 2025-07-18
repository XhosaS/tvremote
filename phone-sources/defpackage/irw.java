package defpackage;

/* loaded from: classes2.dex */
public final class irw extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ irv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irw(irv irvVar, yih yihVar) {
        super(yihVar);
        this.c = irvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
