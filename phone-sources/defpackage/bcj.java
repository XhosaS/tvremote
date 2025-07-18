package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcj extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ ccb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcj(ccb ccbVar, yih yihVar) {
        super(yihVar);
        this.d = ccbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
