package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxx extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ oya b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxx(oya oyaVar, yih yihVar) {
        super(yihVar);
        this.b = oyaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q(null, this);
    }
}
