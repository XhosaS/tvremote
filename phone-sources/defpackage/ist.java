package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ist extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ isw d;
    int e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ist(isw iswVar, yih yihVar) {
        super(yihVar);
        this.d = iswVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.q(null, false, this);
    }
}
