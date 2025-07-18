package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbo extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ pbq g;
    int h;
    uwh i;
    ulp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbo(pbq pbqVar, yih yihVar) {
        super(yihVar);
        this.g = pbqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, null, null, this);
    }
}
