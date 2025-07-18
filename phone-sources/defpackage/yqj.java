package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yqj extends yqh {
    private final yql a;
    private final yqk b;
    private final yok c;
    private final Object h;

    public yqj(yql yqlVar, yqk yqkVar, yok yokVar, Object obj) {
        this.a = yqlVar;
        this.b = yqkVar;
        this.c = yokVar;
        this.h = obj;
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        boolean z = yoy.a;
        yql yqlVar = this.a;
        yqk yqkVar = this.b;
        yok yokVar = this.c;
        yok yokVarQ = yql.Q(yokVar);
        Object obj = this.h;
        if (yokVarQ == null || !yqlVar.P(yqkVar, yokVarQ, obj)) {
            yqkVar.a.j(2);
            yok yokVarQ2 = yql.Q(yokVar);
            if (yokVarQ2 == null || !yqlVar.P(yqkVar, yokVarQ2, obj)) {
                yqlVar.eR(yqlVar.A(yqkVar, obj));
            }
        }
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return false;
    }
}
