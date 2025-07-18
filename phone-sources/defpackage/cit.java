package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cit extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public cis c;
    final /* synthetic */ dfb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cit(dfb dfbVar, yih yihVar) {
        super(yihVar);
        this.d = dfbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
