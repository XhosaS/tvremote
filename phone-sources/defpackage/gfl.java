package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfl extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gft c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfl(gft gftVar, yih yihVar) {
        super(yihVar);
        this.c = gftVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
