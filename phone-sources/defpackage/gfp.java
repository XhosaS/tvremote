package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfp extends yiv {
    int a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ gft e;
    int f;
    String g;
    String[] h;
    ggd i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfp(gft gftVar, yih yihVar) {
        super(yihVar);
        this.e = gftVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, 0, this);
    }
}
