package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtl extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ czt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtl(czt cztVar, yih yihVar) {
        super(yihVar);
        this.c = cztVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
