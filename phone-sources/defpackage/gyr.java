package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyr extends yiv {
    public Object a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public int e;
    public gzu f;
    public gzy g;
    public gwi h;
    public gag i;
    final /* synthetic */ cvi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyr(cvi cviVar, yih yihVar) {
        super(yihVar);
        this.j = cviVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.j.B(null, null, null, null, null, this);
    }
}
