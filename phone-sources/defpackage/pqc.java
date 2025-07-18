package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqc extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pqf c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc(pqf pqfVar, yih yihVar) {
        super(yihVar);
        this.c = pqfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
