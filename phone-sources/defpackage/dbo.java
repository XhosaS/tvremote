package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbo extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dbz b;
    int c;
    yyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbo(dbz dbzVar, yih yihVar) {
        super(yihVar);
        this.b = dbzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
