package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gan extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gav d;
    int e;
    yyk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gan(gav gavVar, yih yihVar) {
        super(yihVar);
        this.d = gavVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
