package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxn extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxn(cvi cviVar, yih yihVar) {
        super(yihVar);
        this.d = cviVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.x(this);
    }
}
