package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aer implements yjv {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aer(float f, bng bngVar, bnr bnrVar, int i) {
        this.d = i;
        this.a = f;
        this.c = bngVar;
        this.b = bnrVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            byu byuVar = (byu) obj;
            byuVar.r();
            bpn bpnVarP = byuVar.p();
            long jA = bpnVarP.a();
            bpnVarP.b().g();
            float f = this.a;
            Object obj2 = this.c;
            Object obj3 = this.b;
            try {
                pku pkuVar = bpnVarP.c;
                pkuVar.y(f, 0.0f);
                pkuVar.w(45.0f, 0L);
                brx.p(byuVar, (bng) obj2, (bnr) obj3);
                bpnVarP.b().e();
                bpnVarP.h(jA);
                return ygi.a;
            } catch (Throwable th) {
                bpnVarP.b().e();
                bpnVarP.h(jA);
                throw th;
            }
        }
        if (i != 1) {
            bwi bwiVar = (bwi) obj;
            mr mrVar = ((axc) this.c).d;
            bwi.y(bwiVar, (bwj) this.b, (int) (mrVar != null ? ((Number) mrVar.d()).floatValue() : this.a), 0);
            return ygi.a;
        }
        long jLongValue = ((Long) obj).longValue();
        wh whVar = (wh) this.c;
        long j = whVar.c;
        if (j == Long.MIN_VALUE) {
            whVar.c = jLongValue;
            j = jLongValue;
        }
        float f2 = this.a;
        float f3 = whVar.e;
        na naVar = new na(f3);
        long jA2 = f2 == 0.0f ? whVar.b.a(new na(f3), wh.a, whVar.d) : yln.w((jLongValue - j) / f2);
        ?? r0 = this.b;
        pn pnVar = whVar.b;
        na naVar2 = wh.a;
        float f4 = ((na) pnVar.c(jA2, naVar, naVar2, whVar.d)).a;
        whVar.d = (na) pnVar.d(jA2, naVar, naVar2, whVar.d);
        whVar.c = jLongValue;
        float f5 = whVar.e - f4;
        whVar.e = f4;
        r0.a(Float.valueOf(f5));
        return ygi.a;
    }

    public /* synthetic */ aer(bwj bwjVar, axc axcVar, float f, int i) {
        this.d = i;
        this.b = bwjVar;
        this.c = axcVar;
        this.a = f;
    }

    public /* synthetic */ aer(wh whVar, float f, yjv yjvVar, int i) {
        this.d = i;
        this.c = whVar;
        this.a = f;
        this.b = yjvVar;
    }
}
