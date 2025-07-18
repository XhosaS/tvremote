package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaf extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gag c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(gag gagVar, yih yihVar) {
        super(yihVar);
        this.c = gagVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
