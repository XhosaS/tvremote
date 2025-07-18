package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dba extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ cwo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dba(cwo cwoVar, yih yihVar) {
        super(yihVar);
        this.e = cwoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.e(null, null, this);
    }
}
