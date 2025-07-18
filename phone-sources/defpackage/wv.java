package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.compose.foundation.layout.IntrinsicWidthElement;
import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wv {
    public static final void A(final bkp bkpVar, final yjz yjzVar, final bol bolVar, final long j, final long j2, final long j3, final long j4, final yjz yjzVar2, bao baoVar, final int i) {
        bkp bkpVar2;
        int i2;
        bol bolVar2;
        long j5;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1218779924);
        if (i3 == 0) {
            bkpVar2 = bkpVar;
            i2 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(false) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            bolVar2 = bolVar;
            i2 |= true != baoVarD.F(bolVar2) ? 8192 : 16384;
        } else {
            bolVar2 = bolVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.E(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= true != baoVarD.E(j5) ? 4194304 : 8388608;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != baoVarD.E(j4) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 268435456 : 536870912;
        }
        if (baoVarD.L((306783379 & i2) != 306783378, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            awq.c(bkpVar2, bolVar2, j, j2, 0.0f, 6.0f, bga.k(-1343524879, new avz(yjzVar, yjzVar2, j5, j4), baoVarD), baoVarD, 80);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: avv
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar3 = bkpVar;
                    yjz yjzVar3 = yjzVar;
                    bol bolVar3 = bolVar;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    wv.A(bkpVar3, yjzVar3, bolVar3, j6, j7, j8, j9, yjzVar2, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void B(avq avqVar, bkp bkpVar, yka ykaVar, bao baoVar, int i) {
        int i2 = i & 6;
        bao baoVarD = baoVar.d(-977568115);
        int i3 = i2 == 0 ? (true != baoVarD.F(avqVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            String strW = zy.w(R.string.m3c_snackbar_pane_title, baoVarD);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new asb();
                basVar.ae(objT);
            }
            asb asbVar = (asb) objT;
            if (yks.e(avqVar, asbVar.a)) {
                baoVarD.x(1443908949);
                basVar.aa();
            } else {
                baoVarD.x(1154891761);
                asbVar.a = avqVar;
                List list = asbVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((asa) list.get(i4)).a);
                }
                List listAn = yfm.an(arrayList);
                if (!listAn.contains(avqVar)) {
                    listAn.add(avqVar);
                }
                list.clear();
                List listB = cmq.b(listAn);
                int size2 = listB.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    avq avqVar2 = (avq) listB.get(i5);
                    list.add(new asa(avqVar2, bga.k(-1952400805, new avo(avqVar2, avqVar, asbVar, strW), baoVarD)));
                }
                basVar.aa();
            }
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            asbVar.c = zy.q(baoVarD);
            baoVarD.x(-1888182177);
            List list2 = asbVar.b;
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                asa asaVar = (asa) list2.get(i6);
                Object obj = asaVar.a;
                yka ykaVar2 = asaVar.b;
                baoVarD.v(1325010085, obj);
                ykaVar2.a(bga.k(-1893791890, new acv(ykaVar, obj, 20), baoVarD), baoVarD, 6);
                basVar.aa();
            }
            basVar.aa();
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(avqVar, bkpVar, ykaVar, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void C(defpackage.bkp r28, defpackage.yjz r29, defpackage.yjz r30, defpackage.yjz r31, defpackage.yjz r32, int r33, long r34, long r36, defpackage.zr r38, final defpackage.yka r39, defpackage.bao r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.C(bkp, yjz, yjz, yjz, yjz, int, long, long, zr, yka, bao, int, int):void");
    }

    public static final void D(int i, yjz yjzVar, yka ykaVar, yjz yjzVar2, yjz yjzVar3, final zr zrVar, yjz yjzVar4, bao baoVar, int i2) {
        final int i3;
        int i4;
        int i5;
        int i6 = i2 & 6;
        bao baoVarD = baoVar.d(-280287501);
        if (i6 == 0) {
            i3 = i;
            i4 = (true != baoVarD.D(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.H(yjzVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != baoVarD.H(yjzVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != baoVarD.F(zrVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != baoVarD.H(yjzVar4) ? 524288 : 1048576;
        }
        if (baoVarD.L((599187 & i4) != 599186, i4 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new atu(0);
                basVar.ae(objT);
            }
            int i7 = i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            final atu atuVar = (atu) objT;
            Object objT2 = basVar.T();
            if (i7 == 32 || objT2 == obj) {
                objT2 = new bhq(605195056, true, new aoq(yjzVar, 18));
                basVar.ae(objT2);
            }
            int i8 = i4 & 7168;
            final yjz yjzVar5 = (yjz) objT2;
            Object objT3 = basVar.T();
            if (i8 == 2048 || objT3 == obj) {
                objT3 = new bhq(418899191, true, new aoq(yjzVar2, 17));
                basVar.ae(objT3);
            }
            int i9 = 57344 & i4;
            final yjz yjzVar6 = (yjz) objT3;
            Object objT4 = basVar.T();
            if (i9 == 16384 || objT4 == obj) {
                objT4 = new bhq(338600263, true, new aoq(yjzVar3, 16));
                basVar.ae(objT4);
            }
            int i10 = i4 & 896;
            final yjz yjzVar7 = (yjz) objT4;
            Object objT5 = basVar.T();
            if (i10 == 256 || objT5 == obj) {
                i5 = i4;
                objT5 = new bhq(-1776388365, true, new acv(ykaVar, atuVar, 18));
                basVar.ae(objT5);
            } else {
                i5 = i4;
            }
            int i11 = i5 & 3670016;
            final yjz yjzVar8 = (yjz) objT5;
            Object objT6 = basVar.T();
            if (i11 == 1048576 || objT6 == obj) {
                objT6 = new bhq(-1731662488, true, new aoq(yjzVar4, 15));
                basVar.ae(objT6);
            }
            final yjz yjzVar9 = (yjz) objT6;
            boolean zF = ((i5 & 458752) == 131072) | baoVarD.F(yjzVar5) | baoVarD.F(yjzVar6) | baoVarD.F(yjzVar7) | ((i5 & 14) == 4) | baoVarD.F(yjzVar9) | baoVarD.F(yjzVar8);
            Object objT7 = basVar.T();
            if (zF || objT7 == obj) {
                yjz yjzVar10 = new yjz() { // from class: atq
                    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
                    @Override // defpackage.yjz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r21, java.lang.Object r22) {
                        /*
                            Method dump skipped, instructions count: 449
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.atq.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                basVar.ae(yjzVar10);
                objT7 = yjzVar10;
            }
            bwu.a(null, (yjz) objT7, baoVarD, 0, 1);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new atr(i, yjzVar, ykaVar, yjzVar2, yjzVar3, zrVar, yjzVar4, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void E(boolean r21, defpackage.yjk r22, defpackage.bkp r23, boolean r24, defpackage.atk r25, defpackage.bao r26, int r27) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.E(boolean, yjk, bkp, boolean, atk, bao, int):void");
    }

    public static final np F(int i, bao baoVar) {
        int i2 = i - 1;
        ath athVarL = L(baoVar);
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? athVarL.e() : athVarL.c() : athVarL.a() : athVarL.f() : athVarL.d() : athVarL.b();
    }

    public static final void G(final yjk yjkVar, final long j, final atd atdVar, mr mrVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        bas basVar;
        bas basVar2;
        boolean z;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(766784632);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(atdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? baoVarD.F(mrVar) : baoVarD.H(mrVar)) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        if (baoVarD.L((i2 & 9363) != 9362, i2 & 1)) {
            View view = (View) baoVarD.f(AndroidCompositionLocals_androidKt.f);
            clx clxVar = (clx) baoVarD.f(ccq.d);
            final cmi cmiVar = (cmi) baoVarD.f(ccq.i);
            baw bawVarR = zy.r(baoVarD);
            bdy bdyVarBR = a.bR(yjzVar, baoVarD);
            Object[] objArr = new Object[0];
            bas basVar3 = (bas) baoVarD;
            Object objT = basVar3.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new anu(19);
                basVar3.ae(objT);
            }
            int i4 = i2;
            UUID uuid = (UUID) bga.o(objArr, null, (yjk) objT, baoVarD, 3072, 6);
            Object objT2 = basVar3.T();
            if (objT2 == obj) {
                objT2 = bbn.a(yim.a, baoVarD);
                basVar = basVar3;
                basVar.ae(objT2);
            } else {
                basVar = basVar3;
            }
            yow yowVar = (yow) objT2;
            boolean zF = baoVarD.F(view) | baoVarD.F(clxVar);
            Object objT3 = basVar.T();
            if (zF || objT3 == obj) {
                basVar2 = basVar;
                baoVar2 = baoVarD;
                asv asvVar = new asv(yjkVar, atdVar, j, view, cmiVar, clxVar, uuid, mrVar, yowVar);
                z = true;
                asvVar.b.b(bawVarR, new bhq(-1051373467, true, new aoq(bdyVarBR, 14)));
                basVar2.ae(asvVar);
                objT3 = asvVar;
            } else {
                baoVar2 = baoVarD;
                basVar2 = basVar;
                z = true;
            }
            final asv asvVar2 = (asv) objT3;
            boolean zH = baoVar2.H(asvVar2);
            Object objT4 = basVar2.T();
            if (zH || objT4 == obj) {
                objT4 = new ars(asvVar2, 8);
                basVar2.ae(objT4);
            }
            bbn.c(asvVar2, (yjv) objT4, baoVar2);
            boolean zH2 = baoVar2.H(asvVar2) | ((i4 & 14) == 4 ? z : false) | ((i4 & 896) == 256 ? z : false) | ((i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 ? z : false) | baoVar2.D(cmiVar.ordinal());
            Object objT5 = basVar2.T();
            if (zH2 || objT5 == obj) {
                yjk yjkVar2 = new yjk() { // from class: ate
                    @Override // defpackage.yjk
                    public final Object a() {
                        asvVar2.a(yjkVar, atdVar, j, cmiVar);
                        return ygi.a;
                    }
                };
                basVar2.ae(yjkVar2);
                objT5 = yjkVar2;
            }
            bbn.g((yjk) objT5, baoVar2);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ava(yjkVar, j, atdVar, mrVar, yjzVar, i, 1);
        }
    }

    public static final boolean H(long j) {
        return !a.s(j, bnq.f) && ((double) bny.g(j)) <= 0.5d;
    }

    public static final void I(yjz yjzVar, yjk yjkVar, bkp bkpVar, yjz yjzVar2, yjz yjzVar3, boolean z, aso asoVar, yy yyVar, bao baoVar, int i) {
        yjz yjzVar4;
        int i2;
        yjz yjzVar5;
        yjz yjzVar6;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1325192924);
        if (i3 == 0) {
            yjzVar4 = yjzVar;
            i2 = (true != baoVarD.H(yjzVar4) ? 2 : 4) | i;
        } else {
            yjzVar4 = yjzVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            yjzVar5 = yjzVar2;
            i2 |= true != baoVarD.H(yjzVar5) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            yjzVar5 = yjzVar2;
        }
        if ((i & 24576) == 0) {
            yjzVar6 = yjzVar3;
            i2 |= true != baoVarD.H(yjzVar6) ? 8192 : 16384;
        } else {
            yjzVar6 = yjzVar3;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.G(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(asoVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.F(yyVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 33554432 : 67108864;
        }
        if (baoVarD.L((38347923 & i2) != 38347922, i2 & 1)) {
            bkp bkpVarO = o(zi.m(zi.a(hu.w(bkpVar, null, atn.a(true, 0.0f, 6), z, null, yjkVar, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), yyVar);
            bvt bvtVarA = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iO = zy.o(baoVarD);
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarO);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar7 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar7);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            axa.a(N(baoVarD).m, bga.k(865999929, new kbu(yjzVar5, asoVar, z, yjzVar6, zh.a, yjzVar4, 1), baoVarD), baoVarD, 48);
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ket(yjzVar, yjkVar, bkpVar, yjzVar2, yjzVar3, z, asoVar, yyVar, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, np] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, np] */
    public static final void J(final bkp bkpVar, final od odVar, final bcb bcbVar, final sj sjVar, final bol bolVar, final long j, final float f, final yka ykaVar, bao baoVar, final int i) {
        int i2;
        bao baoVar2;
        int i3;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(848986741);
        if (i4 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(odVar) : baoVarD.H(odVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bcbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(sjVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.C(0.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.C(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if (baoVarD.L((306783379 & i2) != 306783378, i2 & 1)) {
            pf pfVarC = pi.c(odVar, "DropDownMenu", baoVarD, ((((i2 >> 3) & 14) | 48) & 14) | 48);
            np npVarF = F(2, baoVarD);
            np npVarF2 = F(5, baoVarD);
            ro roVar = new ro(npVarF, 10);
            bhi bhiVar = pm.a;
            boolean zBooleanValue = ((Boolean) pfVarC.f()).booleanValue();
            baoVarD.x(143964305);
            float f2 = true != zBooleanValue ? 0.8f : 1.0f;
            bas basVar = (bas) baoVarD;
            basVar.aa();
            Float fValueOf = Float.valueOf(f2);
            boolean zBooleanValue2 = ((Boolean) pfVarC.g()).booleanValue();
            baoVarD.x(143964305);
            float f3 = true == zBooleanValue2 ? 1.0f : 0.8f;
            basVar.aa();
            bdy bdyVarE = pi.e(pfVarC, fValueOf, Float.valueOf(f3), roVar.a(pfVarC.e(), baoVarD, 0), bhiVar, baoVarD, 0);
            ro roVar2 = new ro(npVarF2, 9);
            boolean zBooleanValue3 = ((Boolean) pfVarC.f()).booleanValue();
            baoVarD.x(892761509);
            float f4 = true != zBooleanValue3 ? 0.0f : 1.0f;
            basVar.aa();
            Float fValueOf2 = Float.valueOf(f4);
            boolean zBooleanValue4 = ((Boolean) pfVarC.g()).booleanValue();
            baoVarD.x(892761509);
            float f5 = true != zBooleanValue4 ? 0.0f : 1.0f;
            basVar.aa();
            boolean z = true;
            bdy bdyVarE2 = pi.e(pfVarC, fValueOf2, Float.valueOf(f5), roVar2.a(pfVarC.e(), baoVarD, 0), bhiVar, baoVarD, 0);
            boolean zBooleanValue5 = ((Boolean) baoVarD.f(cde.a)).booleanValue();
            bkm bkmVar = bkp.g;
            boolean zG = baoVarD.G(zBooleanValue5) | baoVarD.F(bdyVarE) | ((i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 || ((i2 & 64) != 0 && baoVarD.H(odVar))) | baoVarD.F(bdyVarE2);
            if ((i2 & 896) != 256) {
                z = false;
            }
            Object objT = basVar.T();
            if ((zG || z) || objT == ban.a) {
                i3 = 2;
                asp aspVar = new asp(zBooleanValue5, odVar, bcbVar, bdyVarE, bdyVarE2, 0);
                basVar.ae(aspVar);
                objT = aspVar;
            } else {
                i3 = 2;
            }
            awq.c(bny.c(bkmVar, (yjv) objT), bolVar, j, 0L, 0.0f, f, bga.k(-1463404422, new ano(bkpVar, sjVar, ykaVar, i3), baoVarD), baoVarD, 8);
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: asq
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    od odVar2 = odVar;
                    bcb bcbVar2 = bcbVar;
                    sj sjVar2 = sjVar;
                    bol bolVar2 = bolVar;
                    long j2 = j;
                    float f6 = f;
                    wv.J(bkpVar2, odVar2, bcbVar2, sjVar2, bolVar2, j2, f6, ykaVar, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final arl K(bao baoVar) {
        return (arl) baoVar.f(arm.a);
    }

    public static final ath L(bao baoVar) {
        return (ath) baoVar.f(asm.a);
    }

    public static final auq M(bao baoVar) {
        return (auq) baoVar.f(aur.a);
    }

    public static final axg N(bao baoVar) {
        return (axg) baoVar.f(axh.a);
    }

    public static final void O(bhi bhiVar, bkp bkpVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1077081618);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(bhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            bkpVar = bkp.g;
            avq avqVarF = bhiVar.f();
            kw kwVar = (kw) baoVarD.f(ccq.a);
            boolean zF = baoVarD.F(avqVarF) | baoVarD.H(kwVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new aoa(avqVarF, kwVar, (yih) null, 10);
                basVar.ae(objT);
            }
            bbn.f(avqVarF, (yjz) objT, baoVarD);
            B(bhiVar.f(), bkpVar, ykaVar, baoVarD, i3 & 1008);
        } else {
            baoVarD.t();
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(bhiVar, bkpVar2, ykaVar, i, 8);
        }
    }

    public static final Void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final boolean f(long j, int i, int i2) {
        if (i > clv.b(j) || clv.d(j) > i) {
            return false;
        }
        return i2 <= clv.a(j) && clv.c(j) <= i2;
    }

    public static final void i(bkp bkpVar, bkd bkdVar, boolean z, yka ykaVar, bao baoVar, int i, int i2) {
        int i3;
        bkp bkpVar2;
        bao baoVar2;
        bkd bkdVar2;
        boolean z2 = z;
        int i4 = i2 & 1;
        bao baoVarD = baoVar.d(380139498);
        int i5 = 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkdVar) ? 16 : 32;
        }
        int i7 = i2 & 4;
        boolean z3 = i7 == 0;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != baoVarD.G(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 1024 : 2048;
        }
        if (baoVarD.L((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                bkpVar = bkp.g;
            }
            bkd bkdVar3 = i6 != 0 ? bkb.a : bkdVar;
            z2 &= z3;
            boolean z4 = (i3 & 7168) == 2048;
            bvt bvtVarA = xo.a(bkdVar3, z2);
            boolean zF = z4 | baoVarD.F(bvtVarA);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new aaw(bvtVarA, ykaVar, i5, null);
                basVar.ae(objT);
            }
            bwu.a(bkpVar, (yjz) objT, baoVarD, i3 & 14, 0);
            bkd bkdVar4 = bkdVar3;
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
            bkdVar2 = bkdVar4;
        } else {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
            bkdVar2 = bkdVar;
        }
        boolean z5 = z2;
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jyi(bkpVar2, bkdVar2, z5, ykaVar, i, i2, 1);
        }
    }

    public static final float j(ze zeVar) {
        if (zeVar != null) {
            return zeVar.a;
        }
        return 0.0f;
    }

    public static final ze k(buy buyVar) {
        Object objG = buyVar.g();
        if (objG instanceof ze) {
            return (ze) objG;
        }
        return null;
    }

    public static final ze l(bwj bwjVar) {
        Object objG = bwjVar.g();
        if (objG instanceof ze) {
            return (ze) objG;
        }
        return null;
    }

    public static final float m(yy yyVar, cmi cmiVar) {
        return cmiVar == cmi.a ? yyVar.c(cmiVar) : yyVar.b(cmiVar);
    }

    public static final float n(yy yyVar, cmi cmiVar) {
        return cmiVar == cmi.a ? yyVar.b(cmiVar) : yyVar.c(cmiVar);
    }

    public static final bkp o(bkp bkpVar, yy yyVar) {
        return bkpVar.a(new PaddingValuesElement(yyVar));
    }

    public static final bkp p(bkp bkpVar, float f) {
        return bkpVar.a(new PaddingElement(f, f, f, f));
    }

    public static final bkp q(bkp bkpVar, float f, float f2) {
        return bkpVar.a(new PaddingElement(f, f2, f, f2));
    }

    public static final bkp r(bkp bkpVar, float f, float f2, float f3, float f4) {
        return bkpVar.a(new PaddingElement(f, f2, f3, f4));
    }

    public static /* synthetic */ yy s(float f, int i) {
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new za(f, 0.0f, f, 0.0f);
    }

    public static /* synthetic */ yy t(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new za(f, f2, f3, f4);
    }

    public static /* synthetic */ bkp u(bkp bkpVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return q(bkpVar, f, f2);
    }

    public static /* synthetic */ bkp v(bkp bkpVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return r(bkpVar, f, f2, f3, f4);
    }

    public static /* synthetic */ bkp w(bkp bkpVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return bkpVar.a(new OffsetElement(f, f2));
    }

    public static final bkp x(bkp bkpVar) {
        return bkpVar.a(new IntrinsicWidthElement());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(final defpackage.avq r31, defpackage.bkp r32, defpackage.bol r33, long r34, long r36, long r38, long r40, long r42, defpackage.bao r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.y(avq, bkp, bol, long, long, long, long, long, bao, int, int):void");
    }

    public static final void z(yjz yjzVar, yjz yjzVar2, chc chcVar, long j, long j2, bao baoVar, int i) {
        int i2;
        yjz yjzVar3;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-931325388);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(chcVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j2) ? 65536 : 131072;
        }
        if (baoVarD.L((74899 & i2) != 74898, i2 & 1)) {
            bkp bkpVarV = v(bkp.g, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new avx();
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarV);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            int i4 = i2;
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar4 = bxt.d;
            beb.a(baoVarD, bvtVar, yjzVar4);
            yjz yjzVar5 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar5);
            yjz yjzVar6 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar6);
            }
            yjz yjzVar7 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar7);
            bkp bkpVarU = u(bty.p("text"), 0.0f, 6.0f, 1);
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, false);
            int iO2 = zy.o(baoVarD);
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarU);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, yjzVar4);
            beb.a(baoVarD, bhuVarAi2, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO2))) {
                Integer numValueOf2 = Integer.valueOf(iO2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar7);
            yjzVar.a(baoVarD, Integer.valueOf(i4 & 14));
            baoVarD.o();
            if (yjzVar2 != null) {
                baoVarD.x(-1014168049);
                bkp bkpVarP = bty.p("action");
                bvt bvtVarA2 = xo.a(bkdVar, false);
                int iO3 = zy.o(baoVarD);
                bhu bhuVarAi3 = basVar.ai();
                bkp bkpVarC3 = bdi.C(baoVarD, bkpVarP);
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA2, yjzVar4);
                beb.a(baoVarD, bhuVarAi3, yjzVar5);
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO3))) {
                    Integer numValueOf3 = Integer.valueOf(iO3);
                    basVar.ae(numValueOf3);
                    baoVarD.i(numValueOf3, yjzVar6);
                }
                beb.a(baoVarD, bkpVarC3, yjzVar7);
                yjzVar3 = yjzVar2;
                bcm.j(new bcq[]{arr.a.c(new bnq(j)), axa.a.c(chcVar)}, yjzVar3, baoVarD, (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                baoVarD.o();
                basVar.aa();
            } else {
                yjzVar3 = yjzVar2;
                baoVarD.x(-1013852841);
                basVar.aa();
            }
            baoVarD.x(-1013535401);
            basVar.aa();
            baoVarD.o();
        } else {
            yjzVar3 = yjzVar2;
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new avt(yjzVar, yjzVar3, chcVar, j, j2, i, 0);
        }
    }
}
