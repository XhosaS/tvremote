package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvo extends ykt implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvo(Object obj, Object obj2, int i) {
        super(2);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [caa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            bao baoVar = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (baoVar.L(i2 != 2, iIntValue & 1)) {
                Object obj3 = this.a;
                ?? r0 = this.b;
                boolean zA = ((bvh) obj3).a();
                baoVar.N(Boolean.valueOf(zA));
                boolean zG = baoVar.G(zA);
                if (zA) {
                    r0.a(baoVar, 0);
                } else {
                    baoVar.l(zG);
                }
                baoVar.r();
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        if (i == 1) {
            int iIntValue2 = ((Number) obj).intValue();
            cff cffVar = (cff) obj2;
            if (!((je) ((dhk) this.b).b).a(cffVar.e)) {
                blj bljVar = (blj) this.a;
                bljVar.h(iIntValue2, cffVar);
                bljVar.d();
            }
            return ygi.a;
        }
        if (i == 2) {
            ?? r02 = this.a;
            bzq bzqVar = (bzq) r02;
            bnp bnpVar = (bnp) obj;
            bpu bpuVar = (bpu) obj2;
            if (bzqVar.s.ag()) {
                bzqVar.A = bnpVar;
                bzqVar.z = bpuVar;
                bzqVar.ab().d(r02, bzq.o, this.b);
                bzqVar.B = false;
            } else {
                bzqVar.B = true;
            }
            return ygi.a;
        }
        if (i == 3) {
            bao baoVar2 = (bao) obj;
            int iIntValue3 = ((Number) obj2).intValue();
            if (baoVar2.L((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                AndroidCompositionLocals_androidKt.a(((ced) this.a).a, this.b, baoVar2, 0);
            } else {
                baoVar2.t();
            }
            return ygi.a;
        }
        if (i == 4) {
            bao baoVar3 = (bao) obj;
            int iIntValue4 = ((Number) obj2).intValue();
            if (baoVar3.L((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                Object obj4 = this.a;
                ced cedVar = (ced) obj4;
                cbc cbcVar = cedVar.a;
                Object tag = cbcVar.getTag(R.id.inspection_slot_table_set);
                Set set = ylh.c(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = cbcVar.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = ylh.c(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(baoVar3.e());
                    baoVar3.j();
                }
                boolean zH = baoVar3.H(obj4);
                Object objG = baoVar3.g();
                if (zH || objG == ban.a) {
                    objG = new btr(cedVar, (yih) null, 2);
                    baoVar3.A(objG);
                }
                bbn.f(cbcVar, (yjz) objG, baoVar3);
                boolean zH2 = baoVar3.H(obj4);
                Object objG2 = baoVar3.g();
                if (zH2 || objG2 == ban.a) {
                    objG2 = new btr(cedVar, (yih) null, 3, (byte[]) null);
                    baoVar3.A(objG2);
                }
                bbn.f(cbcVar, (yjz) objG2, baoVar3);
                bcm.i(bjx.a.c(set), bga.k(-280240369, new bvo(obj4, this.b, 3), baoVar3), baoVar3, 56);
            } else {
                baoVar3.t();
            }
            return ygi.a;
        }
        bao baoVar4 = (bao) obj;
        int iIntValue5 = ((Number) obj2).intValue();
        if (baoVar4.L((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
            bkm bkmVar = bkp.g;
            Object objG3 = baoVar4.g();
            Object obj5 = ban.a;
            if (objG3 == obj5) {
                objG3 = ccu.n;
                baoVar4.A(objG3);
            }
            bkp bkpVarB = cfd.b(bkmVar, false, (yjv) objG3);
            Object obj6 = this.b;
            boolean zH3 = baoVar4.H(obj6);
            Object objG4 = baoVar4.g();
            if (zH3 || objG4 == obj5) {
                objG4 = new cbq(obj6, 17);
                baoVar4.A(objG4);
            }
            bkp bkpVarY = bga.y(fh.S(bkpVarB, (yjv) objG4), true != ((Boolean) ((cny) obj6).h.a()).booleanValue() ? 0.0f : 1.0f);
            yjz yjzVar = (yjz) this.a.a();
            Object objG5 = baoVar4.g();
            if (objG5 == obj5) {
                objG5 = xn.f;
                baoVar4.A(objG5);
            }
            bvt bvtVar = (bvt) objG5;
            int iK = a.k(zy.p(baoVar4));
            bhu bhuVarO = baoVar4.O();
            bkp bkpVarC = bdi.C(baoVar4, bkpVarY);
            yjk yjkVar = bxt.a;
            baoVar4.c();
            baoVar4.z();
            if (baoVar4.J()) {
                baoVar4.k(yjkVar);
            } else {
                baoVar4.B();
            }
            beb.a(baoVar4, bvtVar, bxt.d);
            beb.a(baoVar4, bhuVarO, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (baoVar4.J() || !yks.e(baoVar4.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar4.A(numValueOf);
                baoVar4.i(numValueOf, yjzVar2);
            }
            beb.a(baoVar4, bkpVarC, bxt.b);
            yjzVar.a(baoVar4, 0);
            baoVar4.o();
        } else {
            baoVar4.t();
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvo(Object obj, Object obj2, int i, byte[] bArr) {
        super(2);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
