package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kms extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ kmt c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kms(kmt kmtVar, yih yihVar) {
        super(yihVar);
        this.c = kmtVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
