package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfy implements rrv {
    private final thg a;

    public tfy(thg thgVar) {
        this.a = thgVar;
    }

    @Override // defpackage.rrv
    public final zyd a(rru rruVar) {
        yyf yyfVar = new yyf(4);
        if (!rruVar.c().isEmpty()) {
            yyk yykVarC = rruVar.c();
            int i = ((zcg) yykVarC).d;
            for (int i2 = 0; i2 < i; i2++) {
                ror rorVar = (ror) yykVarC.get(i2);
                if ((rorVar.a().a instanceof zmx) && (rorVar.b() instanceof acjr)) {
                    yyfVar.g(rorVar);
                }
            }
        }
        return this.a.a(rruVar, yyfVar.f());
    }
}
