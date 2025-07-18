package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abu extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ abw c;
    int d;
    rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abu(abw abwVar, yih yihVar) {
        super(yihVar);
        this.c = abwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
