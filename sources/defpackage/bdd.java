package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bdd implements cht {
    public final /* synthetic */ String a;
    public final /* synthetic */ bcu b;
    public final /* synthetic */ bav c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bdd(bav bavVar, cja cjaVar, bcu bcuVar, String str, int i) {
        this.e = i;
        this.c = bavVar;
        this.d = cjaVar;
        this.b = bcuVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.cht
    public final cja a(Object obj) {
        if (this.e != 0) {
            bdm bdmVar = (bdm) qm.P(this.d);
            if (bdmVar.c.isEmpty()) {
                return ciw.a;
            }
            String str = this.a;
            bcu bcuVar = this.b;
            bav bavVar = this.c;
            return chk.i(cit.x(chk.h(cit.x(bcw.b(bavVar).a()), new adz(bcuVar.a, 8), bavVar.b())), new bdd(str, bcuVar, bavVar, bdmVar, 0), bavVar.b());
        }
        String str2 = this.a;
        if (!((String) obj).equals(str2)) {
            return ciw.a;
        }
        byj byjVar = bde.a;
        if (byjVar != null && byjVar.h(this.b.a, str2)) {
            return ciw.a;
        }
        return this.c.d().d(((bdm) this.d).c);
    }

    public /* synthetic */ bdd(String str, bcu bcuVar, bav bavVar, bdm bdmVar, int i) {
        this.e = i;
        this.a = str;
        this.b = bcuVar;
        this.c = bavVar;
        this.d = bdmVar;
    }
}
