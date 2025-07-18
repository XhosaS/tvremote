package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ile extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ilf d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ile(ilf ilfVar, yih yihVar) {
        super(yihVar);
        this.d = ilfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ilf.i(this.d, null, this);
    }
}
