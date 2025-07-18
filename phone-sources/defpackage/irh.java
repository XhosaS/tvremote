package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irh extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ mta c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irh(mta mtaVar, yih yihVar) {
        super(yihVar);
        this.c = mtaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
