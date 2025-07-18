package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uaj extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ uak d;
    int e;
    abo f;
    gow g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uaj(uak uakVar, yih yihVar) {
        super(yihVar);
        this.d = uakVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, null, this);
    }
}
