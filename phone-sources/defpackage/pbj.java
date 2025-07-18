package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbj extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pbk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbj(pbk pbkVar, yih yihVar) {
        super(yihVar);
        this.b = pbkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
