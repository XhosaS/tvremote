package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ btq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btp(btq btqVar, yih yihVar) {
        super(yihVar);
        this.b = btqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(0L, null, this);
    }
}
