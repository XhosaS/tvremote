package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcp extends yiv {
    public boolean a;
    public /* synthetic */ Object b;
    public int c;
    public yyk d;
    final /* synthetic */ cvi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcp(cvi cviVar, yih yihVar) {
        super(yihVar);
        this.e = cviVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.s(null, this);
    }
}
