package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ox implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ox(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, tz] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v55, types: [bib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v31, types: [bie, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                mx mxVar = (mx) obj;
                this.a.a(mxVar.a(), ((bhi) this.b).b.a(mxVar.c));
                return ygi.a;
            case 1:
                Object obj2 = this.a;
                ny nyVar = (ny) obj2;
                bfz bfzVar = nyVar.a;
                Object obj3 = this.b;
                bfzVar.o(obj3);
                nyVar.b(true);
                return new pg(obj2, obj3, 1, null);
            case 2:
                ykr.q(this.a, null, 4, new pe((pf) this.b, null), 1);
                return new cnh(1);
            case 3:
                yjv yjvVar = pi.a;
                Object obj4 = this.b;
                bje bjeVar = ((pf) obj4).d;
                Object obj5 = this.a;
                bjeVar.add(obj5);
                return new pg(obj4, obj5, 0);
            case 4:
                yjv yjvVar2 = pi.a;
                return new pg(this.a, this.b, 2, null);
            case 5:
                yjv yjvVar3 = pi.a;
                Object obj6 = this.b;
                Object obj7 = this.a;
                ((pf) obj7).B((pd) obj6);
                return new pg(obj7, obj6, 3, null);
            case 6:
                byu byuVar = (byu) obj;
                byuVar.r();
                brx.J(byuVar, (bni) this.b, (bnn) this.a, 0.0f, null, 60);
                return ygi.a;
            case 7:
                byu byuVar2 = (byu) obj;
                byuVar2.r();
                brx.J(byuVar2, ((bob) this.a).a, (bnn) this.b, 0.0f, null, 60);
                return ygi.a;
            case 8:
                ((kw) this.a).i(this.b);
                return ygi.a;
            case 9:
                ((bfz) ((kw) this.b).a).n(this.a);
                return ygi.a;
            case 10:
                long j = ((tl) obj).a;
                ue ueVar = (ue) this.a;
                long jC = bmx.c(j, true != ueVar.m ? 1.0f : -1.0f);
                uv uvVar = ueVar.i;
                yka ykaVar = ub.a;
                this.b.a(Float.intBitsToFloat((int) (uvVar == uv.a ? jC & 4294967295L : jC >> 32)));
                return ygi.a;
            case 11:
                ((pku) this.b).E(((vx) this.a).e(((tl) obj).a), 1);
                return ygi.a;
            case 12:
                ((Long) obj).longValue();
                wh whVar = (wh) this.b;
                float f = whVar.e;
                whVar.e = 0.0f;
                this.a.a(Float.valueOf(f));
                return ygi.a;
            case 13:
                bwi bwiVar = (bwi) obj;
                yv yvVar = (yv) this.b;
                boolean z = yvVar.c;
                Object obj8 = this.a;
                if (z) {
                    bwi.y(bwiVar, (bwj) obj8, cme.k(bwiVar, yvVar.a), cme.k(bwiVar, yvVar.b));
                } else {
                    bwiVar.r((bwj) obj8, cme.k(bwiVar, yvVar.a), cme.k(bwiVar, yvVar.b), 0.0f);
                }
                return ygi.a;
            case 14:
                bwi bwiVar2 = (bwi) obj;
                yw ywVar = (yw) this.b;
                long j2 = ((cmf) ywVar.a.a(bwiVar2)).a;
                boolean z2 = ywVar.b;
                Object obj9 = this.a;
                if (z2) {
                    bwi.z(bwiVar2, (bwj) obj9, cmf.a(j2), cmf.b(j2));
                } else {
                    bwi.B(bwiVar2, (bwj) obj9, cmf.a(j2), cmf.b(j2), null, 12);
                }
                return ygi.a;
            case 15:
                bwi bwiVar3 = (bwi) obj;
                yx yxVar = (yx) this.b;
                boolean z3 = yxVar.e;
                Object obj10 = this.a;
                if (z3) {
                    bwi.y(bwiVar3, (bwj) obj10, cme.k(bwiVar3, yxVar.a), cme.k(bwiVar3, yxVar.b));
                } else {
                    bwiVar3.r((bwj) obj10, cme.k(bwiVar3, yxVar.a), cme.k(bwiVar3, yxVar.b), 0.0f);
                }
                return ygi.a;
            case 16:
                Object obj11 = this.a;
                zs zsVar = (zs) obj11;
                int i = zsVar.h;
                Object obj12 = this.b;
                if (i == 0) {
                    yl ylVar = zsVar.i;
                    int[] iArr = cww.a;
                    View view = (View) obj12;
                    cwm.l(view, ylVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(ylVar);
                    nxb.q(view, ylVar);
                }
                zsVar.h++;
                return new pg(obj11, obj12, 4, null);
            case 17:
                zuw zuwVarC = ((abr) this.a).c(((Integer) obj).intValue());
                int i2 = zuwVarC.a;
                ?? r12 = zuwVarC.b;
                ArrayList arrayList = new ArrayList(r12.size());
                int size = r12.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj13 = this.b;
                    long j3 = ((aat) r12.get(i4)).a;
                    arrayList.add(new yfw(Integer.valueOf(i2), new clv(((abn) obj13).b(i3, 1))));
                    i2++;
                    i3++;
                }
                return arrayList;
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                abn abnVar = (abn) this.a;
                abnVar.a(iIntValue);
                return ((abl) this.b).b(iIntValue, 0, 1, abnVar.b(0, 1));
            case 19:
                Object obj14 = this.b;
                kk kkVar = ((adq) obj14).a;
                Object obj15 = this.a;
                kkVar.e(obj15);
                return new pg(obj14, obj15, 5);
            default:
                return new adq(this.a, (Map) obj, this.b);
        }
    }

    public /* synthetic */ ox(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
