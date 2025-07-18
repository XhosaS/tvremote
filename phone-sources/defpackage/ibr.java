package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibr extends yiv {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public int e;
    final /* synthetic */ kdj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibr(kdj kdjVar, yih yihVar) {
        super(yihVar);
        this.f = kdjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.g(null, null, this);
    }
}
