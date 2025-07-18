package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class age implements yka {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ age(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, yjv] */
    @Override // defpackage.yka
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i == 0) {
            long j = ((clv) obj3).a;
            long j2 = ((agd) this.a).e;
            bwj bwjVarU = ((bvs) obj2).u(clv.k(j, ykn.l((int) (j2 >> 32), clv.d(j), clv.b(j)), 0, ykn.l((int) (j2 & 4294967295L), clv.c(j), clv.a(j)), 0, 10));
            return ((bvv) obj).cz(bwjVarU.a, bwjVarU.b, yhc.a, new zn(bwjVarU, 17));
        }
        boolean z = true;
        if (i == 1) {
            this.a.a(new bmx(((bsz) obj2).c));
            return ygi.a;
        }
        if (i == 2) {
            int iIntValue = ((Integer) obj).intValue();
            int iIntValue2 = ((Integer) obj2).intValue();
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = this.a;
            ahx ahxVarD = zBooleanValue ? ((ajq) obj4).a.d() : ((ajq) obj4).a.e();
            ajq ajqVar = (ajq) obj4;
            if (!ajqVar.c || Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > ahxVarD.a()) {
                z = false;
            } else {
                long j3 = ahxVarD.d;
                if (iIntValue != chb.e(j3) || iIntValue2 != chb.a(j3)) {
                    long jN = ccf.N(iIntValue, iIntValue2);
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        ajqVar.b.E(alh.a);
                    } else {
                        ajqVar.b.E(alh.c);
                    }
                    if (zBooleanValue) {
                        ajqVar.a.k(jN);
                    } else {
                        ajqVar.a.j(jN);
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        if (i == 3) {
            bvv bvvVar = (bvv) obj;
            long j4 = ((clv) obj3).a;
            ave aveVar = ave.a;
            bwj bwjVarU2 = ((bvs) obj2).u(j4);
            return bvvVar.cz(bwjVarU2.a, bwjVarU2.b, yfm.f(new yfw(avm.a, Integer.valueOf(cma.b(Float.NaN, Float.NaN) ? ((avn) this.a).e == uv.a ? bwjVarU2.a / 2 : bwjVarU2.b / 2 : bvvVar.cu(Float.NaN)))), new ars(bwjVarU2, 13));
        }
        if (i == 4) {
            this.a.a((Throwable) obj);
            return ygi.a;
        }
        if (i != 5) {
            ((yyo) this.a).h();
            return ygi.a;
        }
        boolean z2 = yoy.a;
        yyk yykVar = (yyk) this.a;
        yykVar.a.c(null);
        yykVar.d();
        return ygi.a;
    }
}
