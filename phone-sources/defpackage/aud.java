package defpackage;

import androidx.compose.ui.focus.FocusChangedElement;
import androidx.compose.ui.input.key.KeyInputElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aud {
    public static final aud a = new aud();

    private aud() {
    }

    public static final bol a(bao baoVar) {
        return aur.b(7, baoVar);
    }

    public final void b(aid aidVar, cvi cviVar, yjv yjvVar, bkp bkpVar, boolean z, chc chcVar, yjz yjzVar, yjz yjzVar2, yjz yjzVar3, sj sjVar, bol bolVar, awu awuVar, bao baoVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        bao baoVar2;
        int i6;
        Object gkVar;
        Object obj;
        boolean z3;
        bmh bmhVar;
        boolean z4;
        bao baoVar3;
        int i7;
        bhq bhqVar;
        bhq bhqVar2;
        cvi cviVar2;
        bas basVar;
        Object ajoVar;
        aid aidVar2 = aidVar;
        cvi cviVar3 = cviVar;
        int i8 = i & 6;
        bao baoVarD = baoVar.d(759286022);
        if (i8 == 0) {
            i3 = (true != baoVarD.F(aidVar2) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(cviVar3) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.G(z) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != baoVarD.G(false) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i4 = 1572864;
            i3 |= true != baoVarD.F(chcVar) ? 524288 : 1048576;
        } else {
            i4 = 1572864;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.H(yjzVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.H(yjzVar3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = (true != baoVarD.H(null) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i5;
        if ((i2 & 48) == 0) {
            i5 = i9 | (true == baoVarD.H(null) ? 32 : 16);
        }
        if ((i2 & 384) == 0) {
            z2 = true;
            i5 |= true == baoVarD.F(null) ? 256 : 128;
        } else {
            z2 = true;
        }
        int i10 = i5;
        if ((i2 & 3072) == 0) {
            i5 = i10 | (z2 == baoVarD.F(null) ? 2048 : 1024);
        }
        if ((i2 & 24576) == 0) {
            i5 |= z2 == baoVarD.F(sjVar) ? 16384 : 8192;
        }
        int i11 = i5;
        if ((i2 & 196608) == 0) {
            i5 = i11 | (z2 != baoVarD.F(bolVar) ? 65536 : 131072);
        }
        if ((i2 & i4) == 0) {
            i5 |= z2 != baoVarD.F(awuVar) ? 524288 : 1048576;
        }
        int i12 = i5;
        if ((12582912 & i2) == 0) {
            i5 = i12 | (true != baoVarD.F(null) ? 4194304 : 8388608);
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != baoVarD.F(this) ? 33554432 : 67108864;
        }
        int i13 = i5;
        if (baoVarD.L(((306783379 & i3) == 306783378 && (i13 & 38347923) == 38347922) ? false : true, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(-1701839691);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                i6 = i3;
                objT = new kw((byte[]) null, (byte[]) null);
                basVar2.ae(objT);
            } else {
                i6 = i3;
            }
            kw kwVar = (kw) objT;
            basVar2.aa();
            bdy bdyVarBI = a.bI(kwVar, baoVarD, 0);
            bmh bmhVar2 = (bmh) baoVarD.f(ccq.e);
            boolean zR = a.r(((kw) baoVarD.f(ccq.h)).l(), 1);
            String strW = zy.w(R.string.m3c_search_bar_search, baoVarD);
            String strW2 = zy.w(R.string.m3c_suggestions_available, baoVarD);
            long jE = chcVar.e();
            if (jE == 16) {
                jE = !z ? awuVar.c : ((Boolean) bdyVarBI.a()).booleanValue() ? awuVar.a : awuVar.b;
            }
            chc chcVarJ = chcVar.j(new chc(jE, 0L, null, 0L, 0, 0, 0L, 16777214));
            Object objT2 = basVar2.T();
            if (objT2 == obj2) {
                objT2 = bbn.a(yim.a, baoVarD);
                basVar2.ae(objT2);
            }
            yow yowVar = (yow) objT2;
            boolean zG = baoVarD.G(zR);
            boolean z5 = (i6 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            boolean zH = zG | z5 | baoVarD.H(yowVar);
            Object objT3 = basVar2.T();
            if (zH || objT3 == obj2) {
                objT3 = new aty(zR, cviVar3, yowVar);
                basVar2.ae(objT3);
            }
            bkp bkpVarM = zi.m(bkpVar.a(new KeyInputElement(null, (yjv) objT3)), aun.b, 56.0f, aun.c, 8);
            boolean zG2 = baoVarD.G(zR) | baoVarD.H(yowVar);
            Object objT4 = basVar2.T();
            int i14 = 3;
            if ((zG2 | z5) || objT4 == obj2) {
                objT4 = new abi(zR, yowVar, cviVar3, i14);
                basVar2.ae(objT4);
            }
            bkp bkpVarA = bkpVarM.a(new FocusChangedElement((yjv) objT4));
            boolean zF = baoVarD.F(strW) | z5 | baoVarD.F(strW2);
            Object objT5 = basVar2.T();
            if (zF || objT5 == obj2) {
                obj = obj2;
                z3 = zR;
                bmhVar = bmhVar2;
                z4 = true;
                baoVar3 = baoVarD;
                i7 = i6;
                gkVar = new gk((Object) strW, (Object) cviVar3, (Object) strW2, 10, (short[]) null);
                basVar2.ae(gkVar);
            } else {
                z3 = zR;
                baoVar3 = baoVarD;
                gkVar = objT5;
                i7 = i6;
                bmhVar = bmhVar2;
                z4 = true;
                obj = obj2;
            }
            bkp bkpVarB = cfd.b(bkpVarA, false, (yjv) gkVar);
            long j = awuVar.g;
            aib aibVar = aib.a;
            bon bonVar = new bon(j);
            afw afwVar = new afw(3, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay);
            boolean z6 = (i7 & 896) == 256 ? z4 : false;
            int i15 = i7 & 14;
            boolean z7 = i15 == 4 ? z4 : false;
            Object objT6 = basVar2.T();
            if ((z6 | z7) || objT6 == obj) {
                objT6 = new atx(yjvVar, aidVar2);
                basVar2.ae(objT6);
            }
            atx atxVar = (atx) objT6;
            if (yjzVar2 == null) {
                baoVar3.x(-1698401420);
                basVar2.aa();
                bhqVar = null;
            } else {
                baoVar3.x(-1698401419);
                bhq bhqVarK = bga.k(759038428, new aoq(yjzVar2, 19), baoVar3);
                basVar2.aa();
                bhqVar = bhqVarK;
            }
            if (yjzVar3 == null) {
                baoVar3.x(-1698193007);
                basVar2.aa();
                bhqVar2 = null;
            } else {
                baoVar3.x(-1698193006);
                bhq bhqVarK2 = bga.k(55642171, new aoq(yjzVar3, 20), baoVar3);
                basVar2.aa();
                bhqVar2 = bhqVarK2;
            }
            awv awvVar = new awv(aidVar2, aibVar, new aww(null), yjzVar, bhqVar, bhqVar2, z, kwVar, new za(16.0f, 16.0f, 16.0f, 16.0f), awuVar, bga.k(1500441906, new kev(awuVar, z, bolVar, bdyVarBI, 1), baoVar3));
            int i16 = i7 >> 6;
            baoVar2 = baoVar3;
            Object obj3 = obj;
            afc.c(aidVar, bkpVarB, z, chcVarJ, afwVar, atxVar, aibVar, kwVar, bonVar, awvVar, sjVar, baoVar2, 102236160 | i15 | (i16 & 896) | (i16 & 7168) | (57344 & (i13 << 6)), ((i13 >> 3) & 896) | (i13 & 57344), 512);
            boolean zH2 = z5 | baoVar2.H(yowVar);
            Object objT7 = basVar2.T();
            if (zH2 || objT7 == obj3) {
                cviVar2 = cviVar;
                objT7 = new qm(cviVar2, yowVar, 18);
                basVar = basVar2;
                basVar.ae(objT7);
            } else {
                cviVar2 = cviVar;
                basVar = basVar2;
            }
            aun.e(kwVar, (yjk) objT7, baoVar2, 0);
            boolean zF2 = baoVar2.F(bdyVarBI) | z5 | z7 | baoVar2.H(yowVar);
            Object objT8 = basVar.T();
            if (zF2 || objT8 == obj3) {
                aidVar2 = aidVar;
                cviVar3 = cviVar;
                ajoVar = new ajo(cviVar3, aidVar2, yowVar, bdyVarBI, (yih) null, 2);
                basVar.ae(ajoVar);
            } else {
                aidVar2 = aidVar;
                ajoVar = objT8;
                cviVar3 = cviVar2;
            }
            bbn.e(cviVar3, aidVar2, (yjz) ajoVar, baoVar2);
            boolean z8 = (!aun.d(cviVar3) && ((Boolean) bdyVarBI.a()).booleanValue() && z3) ? z4 : false;
            Boolean boolValueOf = Boolean.valueOf(aun.d(cviVar3));
            bmh bmhVar3 = bmhVar;
            boolean zG3 = baoVar2.G(z8) | baoVar2.H(bmhVar3);
            Object objT9 = basVar.T();
            if (zG3 || objT9 == obj3) {
                objT9 = new atz(z8, bmhVar3, (yih) null, 0);
                basVar.ae(objT9);
            }
            bbn.f(boolValueOf, (yjz) objT9, baoVar2);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new poq(this, aidVar2, cviVar3, yjvVar, bkpVar, z, chcVar, yjzVar, yjzVar2, yjzVar3, sjVar, bolVar, awuVar, i, i2, 1);
        }
    }
}
