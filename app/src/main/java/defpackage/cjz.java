package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjz implements cjv {
    public final bku a = new cjy();
    private final bmn b;

    public cjz(bmn bmnVar) {
        this.b = bmnVar;
    }

    @Override // defpackage.cjv
    public final Long a(final String str) {
        return (Long) bpr.b(this.b, true, false, new agux() { // from class: cjx
            public final /* synthetic */ String a = "SELECT long_value FROM Preference where `key`=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    Long lValueOf = null;
                    if (brjVarA.l() && !brjVarA.k(0)) {
                        lValueOf = Long.valueOf(brjVarA.b(0));
                    }
                    return lValueOf;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cjv
    public final void b(final cju cjuVar) {
        bpr.b(this.b, false, true, new agux() { // from class: cjw
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                this.a.a.c(bskVar, cjuVar);
                return agpu.a;
            }
        });
    }
}
