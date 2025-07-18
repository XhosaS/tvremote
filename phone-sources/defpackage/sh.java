package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class sh implements yjv {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ sh(float f, Object obj, int i) {
        this.c = i;
        this.a = f;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            float f = this.a;
            ylz ylzVar = (ylz) this.b;
            cfk.j((cfc) obj, new cey(((Number) ykn.s(Float.valueOf(f), ylzVar)).floatValue(), ylzVar));
            return ygi.a;
        }
        if (i == 1) {
            long jLongValue = ((Long) obj).longValue();
            pf pfVar = (pf) this.b;
            if (!pfVar.A()) {
                if (pfVar.c() == Long.MIN_VALUE) {
                    pfVar.m(jLongValue);
                }
                float f2 = this.a;
                long jC = jLongValue - pfVar.c();
                boolean z = f2 != 0.0f;
                if (f2 != 0.0f) {
                    jC = yln.w(jC / f2);
                }
                pfVar.r(jC);
                pfVar.k(jC, !z);
            }
            return ygi.a;
        }
        if (i != 2) {
            if (i != 3) {
                ((cgz) obj).getClass();
                if (((int) (r11.c & 4294967295L)) > this.a) {
                    this.b.b(true);
                }
                return ygi.a;
            }
            bwi bwiVar = (bwi) obj;
            bwiVar.getClass();
            bwj bwjVar = (bwj) this.b;
            bwi.y(bwiVar, bwjVar, 0, Math.max(0, ((int) this.a) - bwjVar.b));
            return ygi.a;
        }
        cb cbVar = (cb) obj;
        long j = atc.a;
        auw auwVar = auw.a;
        float f3 = this.a;
        cbVar.h(auwVar, f3);
        int i2 = (int) (((cmh) this.b).a & 4294967295L);
        float f4 = i2;
        float f5 = f3 / 2.0f;
        if (f4 > f5) {
            cbVar.h(auw.c, f5);
        }
        if (i2 != 0) {
            cbVar.h(auw.b, Math.max(0.0f, f3 - f4));
        }
        return ygi.a;
    }

    public /* synthetic */ sh(pf pfVar, float f, int i) {
        this.c = i;
        this.b = pfVar;
        this.a = f;
    }
}
