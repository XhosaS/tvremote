package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajy extends bxw implements byl, byd, bxu {
    public boolean a;
    public final aeb b;
    public lhr c;
    private Map d;

    public ajy(lhr lhrVar, akb akbVar, chc chcVar, boolean z) {
        this.c = lhrVar;
        this.a = z;
        aeb aebVar = new aeb((aea) this.c.b);
        O(aebVar);
        this.b = aebVar;
        lhr lhrVar2 = this.c;
        boolean z2 = this.a;
        lhrVar2.n(akbVar, chcVar, z2, !z2);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [bcb, java.lang.Object] */
    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        lhr lhrVar = this.c;
        cmi cmiVarN = bvvVar.n();
        esn esnVar = (esn) fh.P(this, ccq.f);
        Object obj = lhrVar.c;
        aju ajuVar = new aju(bvvVar, cmiVarN, esnVar, j);
        ajx ajxVar = (ajx) obj;
        ajxVar.b.b(ajuVar);
        ajw ajwVarB = ajxVar.b();
        if (ajwVarB == null) {
            wv.b("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            throw new yfs();
        }
        cgz cgzVarE = ajxVar.e(ajwVarB, ajuVar);
        long j2 = cgzVarE.c;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        bwj bwjVarU = bvsVar.u(clw.n(i, i, i2, i2));
        this.c.g.b(new cma(this.a ? bvvVar.cp(hq.p(cgzVarE.a(0))) : 0.0f));
        Map linkedHashMap = this.d;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(bue.a, Integer.valueOf(Math.round(cgzVarE.d)));
        linkedHashMap.put(bue.b, Integer.valueOf(Math.round(cgzVarE.e)));
        this.d = linkedHashMap;
        linkedHashMap.getClass();
        return bvvVar.cz(i, i2, linkedHashMap, new akh(bwjVarU, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bcb, java.lang.Object] */
    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        this.c.a.b(bvcVar);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }
}
