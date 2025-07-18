package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lk extends ykt implements yjv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        np npVar;
        np npVar2;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                bwi bwiVar = (bwi) obj;
                ?? r0 = this.a;
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    bwiVar.r((bwj) r0.get(i), 0, 0, 0.0f);
                }
                return ygi.a;
            case 1:
                return Boolean.valueOf(yks.e(obj, this.a));
            case 2:
                ((bwi) obj).r((bwj) this.a, 0, 0, 0.0f);
                return ygi.a;
            case 3:
                nd ndVar = (nd) obj;
                float f = ndVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f2 = ndVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f3 = ndVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = ndVar.a;
                float f6 = f5 >= 0.0f ? f5 : 0.0f;
                float[] fArr = box.a;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                return new bnq(bnq.e(bny.k(f, f2, f4, f6, box.x), (bov) this.a));
            case 4:
                long j = ((cmh) obj).a;
                return new cmh((((Number) this.a.a(Integer.valueOf((int) (j & 4294967295L)))).intValue() & 4294967295L) | (((int) (j >> 32)) << 32));
            case 5:
                long j2 = ((cmh) obj).a;
                return new cmh((((Number) this.a.a(Integer.valueOf((int) (j2 & 4294967295L)))).intValue() & 4294967295L) | (((int) (j2 >> 32)) << 32));
            case 6:
                return new cmf(((Number) this.a.a(Integer.valueOf((int) (((cmh) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 7:
                return new cmf(((Number) this.a.a(Integer.valueOf((int) (((cmh) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 8:
                ((bwi) obj).r((bwj) this.a, 0, 0, 0.0f);
                return ygi.a;
            case 9:
                ((bwi) obj).r((bwj) this.a, 0, 0, 0.0f);
                return ygi.a;
            case 10:
                pb pbVar = (pb) obj;
                lx lxVar = lx.a;
                lx lxVar2 = lx.b;
                if (pbVar.c(lxVar, lxVar2)) {
                    lv lvVar = ((me) this.a).b.b.c;
                    if (lvVar != null) {
                        obj2 = lvVar.c;
                    }
                } else if (pbVar.c(lxVar2, lx.c)) {
                    lv lvVar2 = ((me) this.a).c.b.c;
                    if (lvVar2 != null) {
                        obj2 = lvVar2.c;
                    }
                } else {
                    obj2 = mc.c;
                }
                return obj2 == null ? mc.c : obj2;
            case 11:
                pb pbVar2 = (pb) obj;
                lx lxVar3 = lx.a;
                lx lxVar4 = lx.b;
                if (pbVar2.c(lxVar3, lxVar4)) {
                    mn mnVar = ((me) this.a).b.b.b;
                    return (mnVar == null || (npVar2 = mnVar.b) == null) ? mc.b : npVar2;
                }
                if (!pbVar2.c(lxVar4, lx.c)) {
                    return mc.b;
                }
                mn mnVar2 = ((me) this.a).c.b.b;
                return (mnVar2 == null || (npVar = mnVar2.b) == null) ? mc.b : npVar;
            case 12:
                bln blnVar = (bln) obj;
                if (!blnVar.q.A) {
                    return caj.b;
                }
                blo bloVar = blnVar.c;
                if (bloVar != null) {
                    bloVar.b((kw) this.a);
                }
                blnVar.c = null;
                blnVar.b = null;
                return caj.a;
            case 13:
                byu byuVar = (byu) obj;
                this.a.a(byuVar);
                byuVar.r();
                return ygi.a;
            case 14:
                bwi.y((bwi) obj, (bwj) this.a, 0, 0);
                return ygi.a;
            case 15:
                boi boiVar = (boi) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.a;
                boiVar.v(cme.j(boiVar, shadowGraphicsLayerElement.a));
                boiVar.w(shadowGraphicsLayerElement.b);
                boiVar.q(shadowGraphicsLayerElement.c);
                boiVar.n(shadowGraphicsLayerElement.d);
                boiVar.x(shadowGraphicsLayerElement.e);
                return ygi.a;
            case 16:
                boi boiVar2 = (boi) obj;
                bom bomVar = (bom) this.a;
                boiVar2.t(bomVar.a);
                boiVar2.u(bomVar.b);
                boiVar2.m(bomVar.c);
                boiVar2.v(bomVar.d);
                boiVar2.s(0.0f);
                boiVar2.p(bomVar.e);
                boiVar2.y(bomVar.f);
                boiVar2.w(bomVar.g);
                boiVar2.q(bomVar.h);
                boiVar2.A();
                boiVar2.n(bomVar.i);
                boiVar2.x(bomVar.j);
                boiVar2.r(bomVar.k);
                boiVar2.o(bomVar.l);
                boiVar2.z();
                return ygi.a;
            case 17:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(((bpi) this.a).n.a(ykn.f(dDoubleValue, r12.e, r12.f)));
            case 18:
                return Double.valueOf(ykn.f(((bpi) this.a).k.a(((Number) obj).doubleValue()), r12.e, r12.f));
            case 19:
                bpq bpqVar = (bpq) obj;
                Object obj3 = this.a;
                bpu bpuVar = (bpu) obj3;
                bni bniVar = bpuVar.o;
                if (bpuVar.g && bpuVar.n && bniVar != null) {
                    bpn bpnVarP = bpqVar.p();
                    long jA = bpnVarP.a();
                    bpnVarP.b().g();
                    try {
                        bpnVarP.c.z(bniVar);
                        ((bpu) obj3).f(bpqVar);
                    } finally {
                        bpnVarP.b().e();
                        bpnVarP.h(jA);
                    }
                } else {
                    bpuVar.f(bpqVar);
                }
                return ygi.a;
            default:
                bri briVar = (bri) obj;
                bqk bqkVar = (bqk) this.a;
                bqkVar.d(briVar);
                yjv yjvVar = bqkVar.e;
                if (yjvVar != null) {
                    yjvVar.a(briVar);
                }
                return ygi.a;
        }
    }
}
