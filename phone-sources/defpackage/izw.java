package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class izw extends yiv {
    boolean a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ izz d;
    int e;
    izz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izw(izz izzVar, yih yihVar) {
        super(yihVar);
        this.d = izzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return izz.a(this.d, this);
    }
}
