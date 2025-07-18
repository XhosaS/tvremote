package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iho extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ihq c;
    int d;
    inl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iho(ihq ihqVar, yih yihVar) {
        super(yihVar);
        this.c = ihqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
