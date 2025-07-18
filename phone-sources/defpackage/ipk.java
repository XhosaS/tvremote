package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipk extends yiv {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ iqo d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipk(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.d = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(this);
    }
}
