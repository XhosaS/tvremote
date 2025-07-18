package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gym extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gyn c;
    int d;
    gyd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gym(gyn gynVar, yih yihVar) {
        super(yihVar);
        this.c = gynVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
