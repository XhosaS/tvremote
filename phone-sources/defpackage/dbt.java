package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbt extends yiv {
    boolean a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ dbz f;
    int g;
    ylf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbt(dbz dbzVar, yih yihVar) {
        super(yihVar);
        this.f = dbzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(false, this);
    }
}
