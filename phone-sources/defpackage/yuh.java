package defpackage;

/* loaded from: classes3.dex */
public final class yuh extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ ioo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuh(ioo iooVar, yih yihVar) {
        super(yihVar);
        this.e = iooVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
