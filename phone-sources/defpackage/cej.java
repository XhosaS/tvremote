package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cej extends yiv {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ cel e;
    int f;
    cmg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cej(cel celVar, yih yihVar) {
        super(yihVar);
        this.e = celVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
