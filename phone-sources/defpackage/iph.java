package defpackage;

/* loaded from: classes2.dex */
public final class iph extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ioo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iph(ioo iooVar, yih yihVar) {
        super(yihVar);
        this.c = iooVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
