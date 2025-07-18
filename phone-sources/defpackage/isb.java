package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class isb extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ isf b;
    int c;
    wwx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isb(isf isfVar, yih yihVar) {
        super(yihVar);
        this.b = isfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
