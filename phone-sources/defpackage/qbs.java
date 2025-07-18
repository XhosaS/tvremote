package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbs extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qbv b;
    int c;
    crm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbs(qbv qbvVar, yih yihVar) {
        super(yihVar);
        this.b = qbvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
