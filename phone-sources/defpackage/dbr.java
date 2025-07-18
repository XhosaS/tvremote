package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbr extends yiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dbz c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbr(dbz dbzVar, yih yihVar) {
        super(yihVar);
        this.c = dbzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
