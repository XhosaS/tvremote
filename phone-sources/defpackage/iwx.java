package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iwx extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ iwz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwx(iwz iwzVar, yih yihVar) {
        super(yihVar);
        this.b = iwzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
