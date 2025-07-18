package defpackage;

/* loaded from: classes3.dex */
public final class ytu extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ ioo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytu(ioo iooVar, yih yihVar) {
        super(yihVar);
        this.d = iooVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
