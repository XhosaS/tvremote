package defpackage;

/* loaded from: classes3.dex */
public final class ysz extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public int d;
    public int e;
    final /* synthetic */ isv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysz(isv isvVar, yih yihVar) {
        super(yihVar);
        this.f = isvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
