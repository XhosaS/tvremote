package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pem extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pen b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pem(pen penVar, yih yihVar) {
        super(yihVar);
        this.b = penVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
