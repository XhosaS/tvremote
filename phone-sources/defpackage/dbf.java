package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbf extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ dbg e;
    int f;
    ylf g;
    dbz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbf(dbg dbgVar, yih yihVar) {
        super(yihVar);
        this.e = dbgVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
