package defpackage;

import android.os.Bundle;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nw implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ nw(adm admVar, cvi cviVar, bww bwwVar, adu aduVar, int i) {
        this.e = i;
        this.a = admVar;
        this.b = cviVar;
        this.d = bwwVar;
        this.c = aduVar;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v28, types: [adu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r1v19, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, vc] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.e) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                bdy bdyVar = (bdy) this.a.a();
                long jLongValue2 = bdyVar != null ? ((Number) bdyVar.a()).longValue() : jLongValue;
                ?? r14 = this.d;
                Object obj2 = this.c;
                ny nyVar = (ny) this.b;
                if (nyVar.b == Long.MIN_VALUE || ((ylc) obj2).a != og.f(r14.c())) {
                    nyVar.b = jLongValue;
                    bfz bfzVar = nyVar.a;
                    Object[] objArr = bfzVar.a;
                    int i = bfzVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((nv) objArr[i2]).f = true;
                    }
                    ((ylc) obj2).a = og.f(r14.c());
                }
                float f = ((ylc) obj2).a;
                if (f == 0.0f) {
                    bfz bfzVar2 = nyVar.a;
                    Object[] objArr2 = bfzVar2.a;
                    int i3 = bfzVar2.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        nv nvVar = (nv) objArr2[i4];
                        nvVar.b(nvVar.d.a);
                        nvVar.f = true;
                    }
                } else {
                    float f2 = (jLongValue2 - nyVar.b) / f;
                    bfz bfzVar3 = nyVar.a;
                    Object[] objArr3 = bfzVar3.a;
                    int i5 = bfzVar3.b;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        nv nvVar2 = (nv) objArr3[i6];
                        boolean zJ = nvVar2.e;
                        if (!zJ) {
                            long j = (long) f2;
                            nvVar2.h.b(false);
                            if (nvVar2.f) {
                                nvVar2.f = false;
                                nvVar2.g = j;
                            }
                            long j2 = j - nvVar2.g;
                            nvVar2.b(nvVar2.d.c(j2));
                            zJ = fh.j(nvVar2.d, j2);
                            nvVar2.e = zJ;
                        }
                        z &= zJ;
                    }
                    nyVar.c.b(Boolean.valueOf(!z));
                }
                break;
            case 1:
                Object obj3 = this.b;
                mr mrVar = (mr) obj3;
                mz mzVar = mrVar.a;
                mx mxVar = (mx) obj;
                og.j(mxVar, mzVar);
                Object objB = mrVar.b(mxVar.a());
                boolean zE = yks.e(objB, mxVar.a());
                ?? r5 = this.c;
                if (!zE) {
                    Object obj4 = this.a;
                    mzVar.c(objB);
                    ((mz) obj4).c(objB);
                    if (r5 != 0) {
                        r5.a(obj3);
                    }
                    Object obj5 = this.d;
                    mxVar.b();
                    ((ylb) obj5).a = true;
                } else if (r5 != 0) {
                    r5.a(obj3);
                }
                break;
            case 2:
                mx mxVar2 = (mx) obj;
                float fFloatValue = ((Number) mxVar2.a()).floatValue();
                ylc ylcVar = (ylc) this.c;
                float f3 = fFloatValue - ylcVar.a;
                float fA = this.a.a(f3);
                ylcVar.a = ((Number) mxVar2.a()).floatValue();
                ((ylc) this.d).a = ((Number) mxVar2.f.b.a(mxVar2.c)).floatValue();
                if (Math.abs(f3 - fA) > 0.5f) {
                    mxVar2.b();
                }
                ((ybo) this.b).b++;
                break;
            case 3:
                mx mxVar3 = (mx) obj;
                float fFloatValue2 = ((Number) mxVar3.a()).floatValue();
                ylc ylcVar2 = (ylc) this.d;
                float f4 = fFloatValue2 - ylcVar2.a;
                if (!a.bG(f4)) {
                    if (!a.bG(f4 - ((uu) this.b).g((pku) this.a, f4))) {
                        mxVar3.b();
                        break;
                    } else {
                        ylcVar2.a += f4;
                    }
                }
                if (((Boolean) this.c.a(Float.valueOf(ylcVar2.a))).booleanValue()) {
                    mxVar3.b();
                }
                break;
            case 4:
                mma mmaVar = new mma((cvi) this.b, (bww) this.d, this.c);
                Object obj6 = this.a;
                ((adm) obj6).f = mmaVar;
                break;
            case 5:
                ago agoVar = (ago) obj;
                this.c.a();
                ?? r0 = this.d;
                if (r0 == 0 || ((Boolean) r0.a()).booleanValue()) {
                    agoVar.a();
                }
                ((alg) this.b).E((alh) this.a);
                break;
            case 6:
                lj ljVar = (lj) obj;
                fxb fxbVar = ((fwr) ljVar.b()).a;
                fxbVar.getClass();
                fyb fybVar = (fyb) fxbVar;
                if (!((Boolean) ((fyc) this.a).c.a()).booleanValue() && !((Boolean) this.b.a()).booleanValue()) {
                    Iterator itA = fus.h(fybVar).a();
                    while (itA.hasNext()) {
                        fxb fxbVar2 = (fxb) itA.next();
                        if (fxbVar2 instanceof fyb) {
                        } else if (fxbVar2 instanceof fxz) {
                        }
                    }
                    break;
                } else {
                    Iterator itA2 = fus.h(fybVar).a();
                    while (itA2.hasNext()) {
                        fxb fxbVar3 = (fxb) itA2.next();
                        if (fxbVar3 instanceof fyb) {
                        } else if (fxbVar3 instanceof fxz) {
                        }
                    }
                    break;
                }
            case 7:
                lj ljVar2 = (lj) obj;
                fxb fxbVar4 = ((fwr) ljVar2.a()).a;
                fxbVar4.getClass();
                fyb fybVar2 = (fyb) fxbVar4;
                if (!((Boolean) ((fyc) this.a).c.a()).booleanValue() && !((Boolean) this.b.a()).booleanValue()) {
                    Iterator itA3 = fus.h(fybVar2).a();
                    while (itA3.hasNext()) {
                        fxb fxbVar5 = (fxb) itA3.next();
                        if (fxbVar5 instanceof fyb) {
                        } else if (fxbVar5 instanceof fxz) {
                        }
                    }
                    break;
                } else {
                    Iterator itA4 = fus.h(fybVar2).a();
                    while (itA4.hasNext()) {
                        fxb fxbVar6 = (fxb) itA4.next();
                        if (fxbVar6 instanceof fyb) {
                        } else if (fxbVar6 instanceof fxz) {
                        }
                    }
                    break;
                }
                break;
            case 8:
                fwr fwrVar = (fwr) obj;
                fwrVar.getClass();
                ((ylb) this.d).a = true;
                ((fyr) this.c).i((fxb) this.a, (Bundle) this.b, fwrVar, yhb.a);
                break;
            case 9:
                vtw vtwVar = (vtw) obj;
                vtwVar.getClass();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                Object obj7 = this.b;
                iod iodVar = (iod) vtwVar.b;
                iod iodVar2 = iod.a;
                iodVar.p = (wkc) obj7;
                iodVar.b |= 8;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                ?? r02 = this.c;
                Object obj8 = this.a;
                iod iodVar3 = (iod) vtwVar.b;
                iodVar3.q = (wkc) obj8;
                iodVar3.b |= 16;
                vtw vtwVarM = wjz.a.m();
                vtwVarM.getClass();
                wjn wjnVar = wjn.a;
                vtw vtwVarM2 = wjnVar.m();
                vtwVarM2.getClass();
                DesugarCollections.unmodifiableList(((wjn) vtwVarM2.b).b).getClass();
                wae.p(r02, vtwVarM2);
                wjn wjnVarO = wae.o(vtwVarM2);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ?? r4 = this.d;
                wjz wjzVar = (wjz) vtwVarM.b;
                wjzVar.c = wjnVarO;
                wjzVar.b |= 1;
                vtw vtwVarM3 = wjnVar.m();
                vtwVarM3.getClass();
                DesugarCollections.unmodifiableList(((wjn) vtwVarM3.b).b).getClass();
                wae.p(r4, vtwVarM3);
                wjn wjnVarO2 = wae.o(vtwVarM3);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wjz wjzVar2 = (wjz) vtwVarM.b;
                wjzVar2.d = wjnVarO2;
                wjzVar2.b |= 2;
                vuc vucVarR = vtwVarM.r();
                vucVarR.getClass();
                wjz wjzVar3 = (wjz) vucVarR;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                iod iodVar4 = (iod) vtwVar.b;
                iodVar4.r = wjzVar3;
                iodVar4.b |= 32;
                break;
            default:
                ((View) obj).getClass();
                uzo uzoVar = ((ofe) this.b).b;
                if (uzoVar == null) {
                    uzoVar = uzo.a;
                }
                uzn uznVar = uzoVar.c;
                if (uznVar == null) {
                    uznVar = uzn.a;
                }
                uzm uzmVar = uznVar.c;
                if (uzmVar == null) {
                    uzmVar = uzm.a;
                }
                uzl uzlVar = uzmVar.b;
                if (uzlVar == null) {
                    uzlVar = uzl.a;
                }
                uzlVar.getClass();
                if ((uzlVar.b & 1) == 0) {
                    vtw vtwVar2 = (vtw) uzlVar.a(5, null);
                    vtwVar2.x(uzlVar);
                    if (!vtwVar2.b.A()) {
                        vtwVar2.u();
                    }
                    uzl uzlVar2 = (uzl) vtwVar2.b;
                    uzlVar2.b = 1 | uzlVar2.b;
                    uzlVar2.c = 400;
                    vtwVar2.at(uvs.a);
                    vuc vucVarR2 = vtwVar2.r();
                    vucVarR2.getClass();
                    uzlVar = (uzl) vucVarR2;
                }
                Object obj9 = this.a;
                Object obj10 = this.d;
                tae taeVar = (tae) this.c;
                String str = (String) obj10;
                ((xzg) taeVar.h).g(rrx.an(str, uzlVar, ((qyn) obj9).j, ((xwk) taeVar.g).g().b(new pgc(qyv.a, 7))), new qxm(new qxi(str), vrr.a));
                break;
        }
        return ygi.a;
    }

    public /* synthetic */ nw(bcb bcbVar, ny nyVar, ylc ylcVar, yow yowVar, int i) {
        this.e = i;
        this.a = bcbVar;
        this.b = nyVar;
        this.c = ylcVar;
        this.d = yowVar;
    }

    public /* synthetic */ nw(fyc fycVar, yjv yjvVar, yjv yjvVar2, bcb bcbVar, int i) {
        this.e = i;
        this.a = fycVar;
        this.c = yjvVar;
        this.d = yjvVar2;
        this.b = bcbVar;
    }

    public /* synthetic */ nw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ nw(tae taeVar, ofe ofeVar, String str, qyn qynVar, int i) {
        this.e = i;
        this.c = taeVar;
        this.b = ofeVar;
        this.d = str;
        this.a = qynVar;
    }

    public /* synthetic */ nw(yjk yjkVar, yjk yjkVar2, alg algVar, alh alhVar, int i) {
        this.e = i;
        this.c = yjkVar;
        this.d = yjkVar2;
        this.b = algVar;
        this.a = alhVar;
    }

    public /* synthetic */ nw(ylb ylbVar, fyr fyrVar, fxb fxbVar, Bundle bundle, int i) {
        this.e = i;
        this.d = ylbVar;
        this.c = fyrVar;
        this.a = fxbVar;
        this.b = bundle;
    }

    public /* synthetic */ nw(ylc ylcVar, uu uuVar, pku pkuVar, yjv yjvVar, int i) {
        this.e = i;
        this.d = ylcVar;
        this.b = uuVar;
        this.a = pkuVar;
        this.c = yjvVar;
    }

    public /* synthetic */ nw(ylc ylcVar, vc vcVar, ylc ylcVar2, ybo yboVar, int i) {
        this.e = i;
        this.c = ylcVar;
        this.a = vcVar;
        this.d = ylcVar2;
        this.b = yboVar;
    }
}
