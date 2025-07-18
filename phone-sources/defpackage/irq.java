package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ isf b;
    int c;
    wvv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irq(isf isfVar, yih yihVar) {
        super(yihVar);
        this.b = isfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
