package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbu extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ cbv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbu(cbv cbvVar, yih yihVar) {
        super(yihVar);
        this.b = cbvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
