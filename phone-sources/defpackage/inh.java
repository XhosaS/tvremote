package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class inh extends yiv {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ ini e;
    int f;
    rul g;
    ijg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inh(ini iniVar, yih yihVar) {
        super(yihVar);
        this.e = iniVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
