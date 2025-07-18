package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbs extends yiv {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dbz d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbs(dbz dbzVar, yih yihVar) {
        super(yihVar);
        this.d = dbzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(false, this);
    }
}
