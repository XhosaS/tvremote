package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozc extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ oze b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozc(oze ozeVar, yih yihVar) {
        super(yihVar);
        this.b = ozeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
