package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.layout.OnSizeChangedModifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fh {
    public fh() {
    }

    public static int A(byl bylVar, buz buzVar, buy buyVar, int i) {
        return bylVar.b(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 1, 1, 2), clw.k(0, i, 7)).b();
    }

    public static long B(float f, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void D(byc bycVar) {
        if (bycVar.E().A) {
            J(bycVar, 1).af();
        }
    }

    public static View E(bxv bxvVar) {
        if (!bxvVar.E().A) {
            bty.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) byv.a(I(bxvVar));
    }

    public static bko F(bfz bfzVar) {
        int i;
        if (bfzVar == null || (i = bfzVar.b) == 0) {
            return null;
        }
        return (bko) bfzVar.d(i - 1);
    }

    public static bvc G(bxv bxvVar) {
        if (!bxvVar.E().A) {
            bty.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        bzq bzqVarJ = J(bxvVar, 2);
        if (!bzqVarJ.s()) {
            bty.c("LayoutCoordinates is not attached.");
        }
        return bzqVarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byl H(bko bkoVar) {
        if ((bkoVar.r & 2) == 0) {
            return null;
        }
        if (bkoVar instanceof byl) {
            return (byl) bkoVar;
        }
        if (!(bkoVar instanceof bxw)) {
            return null;
        }
        bko bkoVar2 = ((bxw) bkoVar).C;
        while (bkoVar2 != 0) {
            if (bkoVar2 instanceof byl) {
                return (byl) bkoVar2;
            }
            bkoVar2 = (!(bkoVar2 instanceof bxw) || (bkoVar2.r & 2) == 0) ? bkoVar2.u : ((bxw) bkoVar2).C;
        }
        return null;
    }

    public static bys I(bxv bxvVar) {
        bzq bzqVar = bxvVar.E().w;
        if (bzqVar != null) {
            return bzqVar.s;
        }
        bty.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new yfs();
    }

    public static bzq J(bxv bxvVar, int i) {
        bzq bzqVar = bxvVar.E().w;
        bzqVar.getClass();
        if (bzqVar.A() != bxvVar || !bzr.h(i)) {
            return bzqVar;
        }
        bzq bzqVar2 = bzqVar.v;
        bzqVar2.getClass();
        return bzqVar2;
    }

    public static bzz K(bxv bxvVar) {
        bzz bzzVar = I(bxvVar).i;
        if (bzzVar != null) {
            return bzzVar;
        }
        bty.a("This node does not have an owner.");
        throw new yfs();
    }

    public static clx L(bxv bxvVar) {
        return I(bxvVar).p;
    }

    public static cmi M(bxv bxvVar) {
        return I(bxvVar).q;
    }

    public static void N(bxv bxvVar) {
        bla blaVar;
        bys bysVarI = I(bxvVar);
        if (bysVarI.n) {
            return;
        }
        bzz bzzVarA = byv.a(bysVarI);
        if (!cbc.M() || (blaVar = ((cbc) bzzVarA).P) == null) {
            return;
        }
        blaVar.b.a.b(bysVarI.c, new bkw(blaVar, bysVarI));
    }

    public static /* synthetic */ void O(bfz bfzVar, bko bkoVar) {
        bfz bfzVarI = I(bkoVar).i();
        int i = bfzVarI.b - 1;
        Object[] objArr = bfzVarI.a;
        if (i < objArr.length) {
            while (i >= 0) {
                bfzVar.o(((bys) objArr[i]).t.f);
                i--;
            }
        }
    }

    public static Object P(bxu bxuVar, bbb bbbVar) {
        if (!bxuVar.E().A) {
            bty.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return I(bxuVar).B.f(bbbVar);
    }

    public static long Q(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float R(defpackage.bwi r5, boolean r6, defpackage.bwp[] r7, float r8) {
        /*
            r0 = 0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = r0
        L4:
            int r3 = r7.length
            if (r2 >= r3) goto L20
            r3 = r7[r2]
            float r3 = r5.p(r3)
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L1c
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 > 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = 1
        L1a:
            if (r6 != r4) goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r2 + 1
            goto L4
        L20:
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L27
            return r8
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.R(bwi, boolean, bwp[], float):float");
    }

    public static bkp S(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new OnSizeChangedModifier(yjvVar));
    }

    public static bkp T(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new OnGloballyPositionedElement(yjvVar));
    }

    public static bvu U(bvv bvvVar, int i, int i2, Map map, yjv yjvVar) {
        return bvvVar.cB(i, i2, map, yjvVar);
    }

    public static int W(bvt bvtVar, buz buzVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bvx((buy) list.get(i2), 2, 2, 1));
        }
        return bvtVar.e(new bvb(buzVar, buzVar.n()), arrayList, clw.k(i, 0, 13)).a();
    }

    public static int X(bvt bvtVar, buz buzVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bvx((buy) list.get(i2), 2, 1, 1));
        }
        return bvtVar.e(new bvb(buzVar, buzVar.n()), arrayList, clw.k(0, i, 7)).b();
    }

    public static int Y(bvt bvtVar, buz buzVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bvx((buy) list.get(i2), 1, 2, 1));
        }
        return bvtVar.e(new bvb(buzVar, buzVar.n()), arrayList, clw.k(i, 0, 13)).a();
    }

    public static int Z(bvt bvtVar, buz buzVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bvx((buy) list.get(i2), 1, 1, 1));
        }
        return bvtVar.e(new bvb(buzVar, buzVar.n()), arrayList, clw.k(0, i, 7)).b();
    }

    public static bza aa(bza bzaVar) {
        bys bysVarK = bzaVar.K();
        while (true) {
            bys bysVarJ = bysVarK.j();
            bys bysVar = null;
            if ((bysVarJ != null ? bysVarJ.h : null) == null) {
                bza bzaVarB = bysVarK.o().B();
                bzaVarB.getClass();
                return bzaVarB;
            }
            bys bysVarJ2 = bysVarK.j();
            if (bysVarJ2 != null) {
                bysVar = bysVarJ2.h;
            }
            bysVar.getClass();
            bys bysVarJ3 = bysVarK.j();
            bysVarJ3.getClass();
            bysVarK = bysVarJ3.h;
            bysVarK.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, yjk] */
    public static Object ab(bxh bxhVar, kw kwVar) {
        bzm bzmVar;
        if (!bxhVar.E().A) {
            bty.b("ModifierLocal accessed from an unattached node");
        }
        if (!bxhVar.E().A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = bxhVar.E().t;
        bys bysVarI = I(bxhVar);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 32) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 32) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof bxh) {
                                bxh bxhVar2 = (bxh) bxwVarF;
                                if (bxhVar2.i().b(kwVar)) {
                                    return bxhVar2.i().a(kwVar);
                                }
                            } else if ((bxwVarF.r & 32) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 32) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
        return kwVar.a.a();
    }

    public static Object c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void e(int i, View view, ViewGroup viewGroup) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (cr.Y(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (cr.Y(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(4);
                return;
            } else {
                if (cr.Y(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
        }
        if (cr.Y(2)) {
            Objects.toString(view);
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (cr.Y(2)) {
                Objects.toString(view);
                Objects.toString(viewGroup);
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static oc f(yjv yjvVar) {
        nue nueVar = new nue((char[]) null, (byte[]) null);
        yjvVar.a(nueVar);
        return new oc(nueVar);
    }

    public static /* synthetic */ os g(float f, float f2, Object obj, int i) {
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new os(f, f2, obj);
    }

    public static /* synthetic */ nt h(nk nkVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new nt(nkVar, i);
    }

    public static /* synthetic */ pk i(int i, nl nlVar, int i2) {
        if ((i2 & 4) != 0) {
            nlVar = no.a;
        }
        if (1 == (i2 & 1)) {
            i = kwx.JSON3;
        }
        return new pk(i, 0, nlVar);
    }

    public static boolean j(mv mvVar, long j) {
        return j >= mvVar.a();
    }

    public static bdy k(long j, my myVar, bao baoVar) {
        boolean zF = baoVar.F(bnq.f(j));
        Object objG = baoVar.g();
        if (zF || objG == ban.a) {
            objG = lw.a.a(bnq.f(j));
            baoVar.A(objG);
        }
        return mu.d(new bnq(j), (bhi) objG, myVar, null, baoVar, 8);
    }

    public static cb l(clx clxVar) {
        return new cb(new kw(clxVar), (byte[]) null);
    }

    public static float m(int i, int i2, boolean z) {
        float fN = n(i, i2);
        return z ? fN + 100.0f : fN;
    }

    public static float n(int i, int i2) {
        return i2 + (i * 500);
    }

    public static bkp o(bkp bkpVar, yjk yjkVar, ado adoVar, uv uvVar, boolean z) {
        return bkpVar.a(new LazyLayoutSemanticsModifier(yjkVar, adoVar, uvVar, z));
    }

    public static void p(Object obj, int i, adk adkVar, yjz yjzVar, bao baoVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(872548579);
        if (i4 == 0) {
            i3 = (true != baoVarD.H(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.D(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.H(adkVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L((i3 & 1171) != 1170, i3 & 1)) {
            boolean zF = baoVarD.F(obj) | baoVarD.F(adkVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new adi(obj, adkVar);
                basVar.ae(objT);
            }
            adi adiVar = (adi) objT;
            adiVar.b = i;
            adi adiVar2 = (adi) baoVarD.f(bwh.a);
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                if (adiVar2 != adiVar.b()) {
                    adiVar.e.b(adiVar2);
                    if (adiVar.c > 0) {
                        adi adiVar3 = adiVar.f;
                        if (adiVar3 != null) {
                            adiVar3.a();
                        }
                        if (adiVar2 != null) {
                            adiVar2.c();
                        } else {
                            adiVar2 = null;
                        }
                        adiVar.f = adiVar2;
                    }
                }
                bcm.z(bitVarT, bitVarU, yjvVarI);
                boolean zF2 = baoVarD.F(adiVar);
                Object objT2 = basVar.T();
                if (zF2 || objT2 == ban.a) {
                    objT2 = new zn(adiVar, 7);
                    basVar.ae(objT2);
                }
                bbn.c(adiVar, (yjv) objT2, baoVarD);
                bcm.i(bwh.a.c(adiVar), yjzVar, baoVarD, ((i3 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            } catch (Throwable th) {
                bcm.z(bitVarT, bitVarU, yjvVarI);
                throw th;
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(obj, i, adkVar, yjzVar, i2, 0);
        }
    }

    public static ymd q(int i, int i2, int i3) {
        int i4 = (i / i2) * i2;
        return ykn.r(Math.max(i4 - i3, 0), i4 + i2 + i3);
    }

    public static void r(yjk yjkVar, bkp bkpVar, adm admVar, adb adbVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1055276397);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(admVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? baoVarD.F(adbVar) : baoVarD.H(adbVar)) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L((i2 & 1171) != 1170, i2 & 1)) {
            hp.t(bga.k(-933153643, new ada(admVar, bkpVar, adbVar, a.bR(yjkVar, baoVarD), 0), baoVarD), baoVarD, 6);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(yjkVar, bkpVar, admVar, adbVar, i, 1, (byte[]) null);
        }
    }

    public static int s(acy acyVar, Object obj, int i) {
        int iA;
        return (obj == null || acyVar.b() == 0 || (i < acyVar.b() && yks.e(obj, acyVar.d(i))) || (iA = acyVar.a(obj)) == -1) ? i : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(acy acyVar, Object obj, int i, Object obj2, bao baoVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(1439843069);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(acyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.D(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.F(obj2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, bga.k(980966366, new acx(acyVar, i, obj2), baoVarD), baoVarD, 48);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(acyVar, obj, i, obj2, i2, 1);
        }
    }

    public static void u() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    public static List v(acy acyVar, adk adkVar, kw kwVar) {
        ymd ymdVar;
        if (!kwVar.g() && adkVar.isEmpty()) {
            return yhb.a;
        }
        ArrayList arrayList = new ArrayList();
        if (kwVar.g()) {
            bfz bfzVar = (bfz) kwVar.a;
            int i = ((aci) bfzVar.b()).a;
            Object[] objArr = bfzVar.a;
            int i2 = bfzVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((aci) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                wv.c("negative minIndex");
            }
            int i5 = ((aci) bfzVar.b()).b;
            Object[] objArr2 = bfzVar.a;
            int i6 = bfzVar.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((aci) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            ymdVar = new ymd(i, Math.min(i5, acyVar.b() - 1));
        } else {
            ymdVar = ymd.d;
        }
        int iA = adkVar.a();
        for (int i9 = 0; i9 < iA; i9++) {
            adi adiVarB = adkVar.get(i9);
            int iS = s(acyVar, adiVarB.a, adiVarB.b);
            int i10 = ymdVar.a;
            if ((iS > ymdVar.b || i10 > iS) && iS >= 0 && iS < acyVar.b()) {
                arrayList.add(Integer.valueOf(iS));
            }
        }
        int i11 = ymdVar.a;
        int i12 = ymdVar.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static int w(byz byzVar, bub bubVar) {
        byz byzVarL = byzVar.L();
        if (byzVarL == null) {
            bty.c(a.cj(byzVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (byzVar.J().e().containsKey(bubVar)) {
            Integer num = (Integer) byzVar.J().e().get(bubVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iCs = byzVarL.cs(bubVar);
        if (iCs == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        byzVarL.j = true;
        byzVar.k = true;
        byzVar.P();
        byzVarL.j = false;
        byzVar.k = false;
        return iCs + (bubVar instanceof bus ? cmf.b(byzVarL.H()) : cmf.a(byzVarL.H()));
    }

    public static int x(byl bylVar, buz buzVar, buy buyVar, int i) {
        return bylVar.b(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 2, 2, 2), clw.k(i, 0, 13)).a();
    }

    public static int y(byl bylVar, buz buzVar, buy buyVar, int i) {
        return bylVar.b(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 2, 1, 2), clw.k(0, i, 7)).b();
    }

    public static int z(byl bylVar, buz buzVar, buy buyVar, int i) {
        return bylVar.b(new bvb(buzVar, buzVar.n()), new bvx(buyVar, 1, 2, 2), clw.k(i, 0, 13)).a();
    }

    public fh(byte[] bArr) {
    }

    public void a(Window window) {
    }

    public void b(gb gbVar, gb gbVar2, Window window, View view, boolean z, boolean z2) {
    }
}
