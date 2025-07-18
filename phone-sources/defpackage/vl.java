package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vl extends yiv {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ vm c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(vm vmVar, yih yihVar) {
        super(yihVar);
        this.c = vmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0L, 0L, this);
    }
}
