package defpackage;

/* loaded from: classes2.dex */
public final class jza extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ fzk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jza(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.e = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
