package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uo extends yiv {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ uu c;
    int d;
    vx e;
    ylc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(uu uuVar, yih yihVar) {
        super(yihVar);
        this.c = uuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, 0.0f, 0.0f, this);
    }
}
