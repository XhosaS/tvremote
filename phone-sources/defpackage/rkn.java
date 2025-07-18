package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rkn extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ rkp b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkn(rkp rkpVar, yih yihVar) {
        super(yihVar);
        this.b = rkpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
