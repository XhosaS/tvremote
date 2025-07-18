package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcj extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ kcl c;
    int d;
    String e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcj(kcl kclVar, yih yihVar) {
        super(yihVar);
        this.c = kclVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
