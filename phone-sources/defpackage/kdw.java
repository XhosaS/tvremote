package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.CombinedClickableElement;
import com.google.android.gms.cast.MediaTrack;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdw {
    public static boolean A(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(krh.SHOW_SETTING_OPTION_DOWNLOAD_ON_5G, false);
    }

    public static String C(Context context, kvo kvoVar, boolean z, int i, int i2, int i3, int i4) {
        String str = kvoVar.j;
        Resources resources = context.getResources();
        if (!z) {
            return resources.getString(i4, str);
        }
        if (kvoVar.c()) {
            return str;
        }
        if (kvoVar.f()) {
            i = i3;
        } else if (kvoVar.i == kvn.QUALITY_HD) {
            i = i2;
        }
        return resources.getString(i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ldo D(Resources resources) {
        ImmutableList immutableListCopyOf;
        Configuration configuration = resources.getConfiguration();
        Charset charset = ksg.a;
        if (ksk.b < 24) {
            immutableListCopyOf = configuration.locale == null ? ImmutableList.of() : ImmutableList.of(configuration.locale);
        } else {
            LocaleList locales = configuration.getLocales();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < locales.size(); i++) {
                arrayList.add(locales.get(i));
            }
            immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
        }
        Collator collator = immutableListCopyOf.isEmpty() ? Collator.getInstance() : Collator.getInstance((Locale) immutableListCopyOf.get(0));
        if (collator == null) {
            throw new NullPointerException("Null collator");
        }
        if (immutableListCopyOf != null) {
            return new ldo(collator, immutableListCopyOf, new HashMap());
        }
        throw new NullPointerException("Null configurationLocaleList");
    }

    public static boolean E(ieh iehVar, kvf kvfVar) {
        return kvfVar.H() && G(iehVar, kvfVar);
    }

    public static boolean F(ieh iehVar, kvj kvjVar) {
        return kvjVar.v && G(iehVar, kvjVar);
    }

    public static boolean G(ieh iehVar, kst kstVar) {
        kvc kvcVarA = ((kva) iehVar.a()).a(kstVar);
        if (kvcVarA.b || kvcVarA.f) {
            return kvcVarA.h;
        }
        ieg iegVarL = ((kvz) kstVar).l();
        if (iegVarL.l()) {
            return false;
        }
        return ((ktz) iegVarL.g()).f;
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "LAST" : "MIDDLE" : "FIRST";
    }

    public static final void b(yjv yjvVar, kem kemVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1945735101);
        int i4 = 4;
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(kemVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i5 = i2;
        if ((i5 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Object[] objArr = new Object[0];
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new jzm(7);
                basVar.ae(objT);
            }
            basVar.aa();
            bcb bcbVar = (bcb) bga.p(objArr, (yjk) objT, baoVarD);
            boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
            baoVarD.x(5004770);
            boolean zF = baoVarD.F(bcbVar);
            Object objT2 = basVar.T();
            if (zF || objT2 == obj) {
                objT2 = new keu(bcbVar, i4);
                basVar.ae(objT2);
            }
            yjk yjkVar2 = (yjk) objT2;
            basVar.aa();
            baoVarD.x(-1633490746);
            boolean zF2 = ((i5 & 896) == 256) | baoVarD.F(bcbVar);
            Object objT3 = basVar.T();
            if (zF2 || objT3 == obj) {
                objT3 = new jzx(yjkVar, bcbVar, 12);
                basVar.ae(objT3);
            }
            basVar.aa();
            d(kemVar, zBooleanValue, yjkVar2, (yjk) objT3, null, baoVarD, (i5 >> 3) & 14);
            boolean z2 = false;
            arh arhVarX = rdd.X(wv.K(baoVarD).F, wv.K(baoVarD).q, baoVarD, 12);
            bkp bkpVarW = bga.w(bkpVar, wv.M(baoVarD).c);
            baoVarD.x(5004770);
            boolean zF3 = baoVarD.F(bcbVar);
            Object objT4 = basVar.T();
            if (zF3 || objT4 == obj) {
                objT4 = new keu(bcbVar, 5);
                basVar.ae(objT4);
            }
            yjk yjkVar3 = (yjk) objT4;
            basVar.aa();
            baoVarD.x(-1633490746);
            if ((i5 & 14) == 4) {
                z2 = true;
            }
            boolean zH = baoVarD.H(kemVar) | z2;
            Object objT5 = basVar.T();
            if (zH || objT5 == obj) {
                objT5 = new jzx(yjvVar, kemVar, 13);
                basVar.ae(objT5);
            }
            basVar.aa();
            rdd.U(bkpVarW.a(new CombinedClickableElement(null, z, (yjk) objT5, yjkVar3)), null, arhVarX, null, bga.k(-1469310274, new ro(kemVar, 19), baoVarD), baoVarD, 24576);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(yjvVar, kemVar, yjkVar, bkpVar, i, 14);
        }
    }

    public static final void c(List list, ykb ykbVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        list.getClass();
        ykbVar.getClass();
        bao baoVarD = baoVar.d(1851464355);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.H(list) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ykbVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarA = zi.a(bkmVar, 1.0f);
            baoVarD.x(5004770);
            boolean zH = baoVarD.H(list);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new kah(list, 6);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarB = cfd.b(bkpVarA, false, (yjv) objT);
            xf xfVarE = xk.e(14.0f);
            yy yyVarS = wv.s(20.0f, 2);
            baoVarD.x(-1633490746);
            boolean zH2 = baoVarD.H(list) | ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objT2 = basVar.T();
            if (zH2 || objT2 == ban.a) {
                objT2 = new jzu(list, ykbVar, 7, null);
                basVar.ae(objT2);
            }
            basVar.aa();
            d.o(bkpVarB, null, yyVarS, xfVarE, null, null, false, null, (yjv) objT2, baoVarD, 24960);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) list, (Object) ykbVar, (Object) bkpVar2, i, 3);
        }
    }

    public static final void d(kem kemVar, boolean z, yjk yjkVar, yjk yjkVar2, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVar2;
        bao baoVarD = baoVar.d(-215285769);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(kemVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            if (!z) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new ahm(kemVar, yjkVar, yjkVar2, (bkp) bkmVar, i, 13);
                    return;
                }
                return;
            }
            yy yyVar = pog.a;
            arb arbVarE = pog.e(wv.K(baoVarD).q, baoVarD, 13);
            int i4 = i3 >> 6;
            int i5 = (i4 & 14) | 1772592 | (i4 & 896);
            bkpVar2 = bkmVar;
            baoVar2 = baoVarD;
            qtl.ab(yjkVar, bga.k(1666546351, new awh(yjkVar2, arbVarE, 19, null), baoVarD), bkpVar2, bga.k(-1737346323, new awh(yjkVar, arbVarE, 20, null), baoVarD), null, ken.c, bga.k(-400734390, new azg(kemVar, 14), baoVarD), wv.M(baoVarD).e, wv.K(baoVarD).G, 0.0f, 0L, wv.K(baoVarD).q, wv.K(baoVarD).s, null, baoVar2, i5, 0, 9744);
        }
        bcr bcrVarM2 = baoVar2.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new kes(kemVar, z, yjkVar, yjkVar2, bkpVar2, i, 2);
        }
    }

    public static final void e(yjv yjvVar, kel kelVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1652054710);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(kelVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            arh arhVarX = rdd.X(wv.K(baoVarD).F, wv.K(baoVarD).q, baoVarD, 12);
            bkp bkpVarK = zi.k(zi.a(bkpVar, 1.0f), 56.0f, 0.0f, 2);
            aeh aehVar = wv.M(baoVarD).c;
            baoVarD.x(-1633490746);
            boolean zH = baoVarD.H(kelVar) | ((i2 & 14) == 4);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new jzx(yjvVar, kelVar, 10);
                basVar.ae(objT);
            }
            basVar.aa();
            rdd.V((yjk) objT, bkpVarK, false, aehVar, arhVarX, null, bga.k(1575983624, new ro(kelVar, 18), baoVarD), baoVarD, 12582912);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) yjvVar, (Object) kelVar, bkpVar, i, 2);
        }
    }

    public static final void f(List list, yka ykaVar, bkp bkpVar, gnh gnhVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        gnh gnhVar2;
        bao baoVar2;
        gnh gnhVar3;
        list.getClass();
        ykaVar.getClass();
        bao baoVarD = baoVar.d(-878012609);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i4 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            gnhVar3 = gnhVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                gnhVar2 = a.bY(baoVarD).a;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                gnhVar2 = gnhVar;
            }
            baoVarD.m();
            aas aaqVar = gnhVar2.a() ? new aaq() : new aar(2);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new jxd(i3);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarB = cfd.b(bkpVar2, false, (yjv) objT);
            int i5 = i4;
            xf xfVarE = xk.e(14.0f);
            xf xfVarE2 = xk.e(14.0f);
            baoVarD.x(-1633490746);
            boolean zH = ((i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | baoVarD.H(list);
            Object objT2 = basVar.T();
            if (zH || objT2 == obj) {
                objT2 = new jzu(list, ykaVar, 6, null);
                basVar.ae(objT2);
            }
            basVar.aa();
            baoVar2 = baoVarD;
            d.l(aaqVar, bkpVarB, null, null, xfVarE, xfVarE2, null, false, null, (yjv) objT2, baoVar2, 1769472, 0, 924);
            gnhVar3 = gnhVar2;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(list, ykaVar, bkpVar2, gnhVar3, i, 12);
        }
    }

    public static final void g(yjk yjkVar, yjk yjkVar2, yjz yjzVar, yjz yjzVar2, yjz yjzVar3, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjk yjkVar3 = yjkVar2;
        yjkVar3.getClass();
        yjzVar.getClass();
        yjzVar2.getClass();
        yjzVar3.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(433200686);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar3) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 65536 : 131072;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((74899 & i2) == 74898 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarB = zi.b(zi.a(bkpVar2, 1.0f), 48.0f);
            bvt bvtVarA = zf.a(xk.f, bkb.n, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
            yjk yjkVar4 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            yjz yjzVar4 = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar4);
            yjz yjzVar5 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar5);
            yjz yjzVar6 = bxt.e;
            int i4 = i2;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar6);
            }
            yjz yjzVar7 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar7);
            bkm bkmVar = bkp.g;
            bkp bkpVarD = zi.d(bkmVar, 48.0f);
            bkd bkdVar = bkb.e;
            bvt bvtVarA2 = xo.a(bkdVar, false);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarD);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar4);
            beb.a(baoVarD, bhuVarAi2, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar7);
            kfw.b(yjkVar, null, baoVarD, i4 & 14);
            baoVarD.o();
            bvt bvtVarA3 = xu.a(xk.e(4.0f), bkb.j, baoVarD, 6);
            int iK3 = a.k(zy.p(baoVarD));
            bhu bhuVarAi3 = basVar.ai();
            bkp bkpVarC3 = bdi.C(baoVarD, bkmVar);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA3, yjzVar4);
            beb.a(baoVarD, bhuVarAi3, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK3))) {
                Integer numValueOf3 = Integer.valueOf(iK3);
                basVar.ae(numValueOf3);
                baoVarD.i(numValueOf3, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC3, yjzVar7);
            yjzVar.a(baoVarD, Integer.valueOf((i4 >> 6) & 14));
            bkp bkpVarX = bdi.x(bkmVar, 1.0f);
            bvt bvtVarA4 = xo.a(bkb.a, false);
            int iK4 = a.k(zy.p(baoVarD));
            bhu bhuVarAi4 = basVar.ai();
            bkp bkpVarC4 = bdi.C(baoVarD, bkpVarX);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA4, yjzVar4);
            beb.a(baoVarD, bhuVarAi4, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK4))) {
                Integer numValueOf4 = Integer.valueOf(iK4);
                basVar.ae(numValueOf4);
                baoVarD.i(numValueOf4, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC4, yjzVar7);
            yjzVar2.a(baoVarD, Integer.valueOf((i4 >> 9) & 14));
            baoVarD.o();
            baoVarD.o();
            yjzVar3.a(baoVarD, Integer.valueOf((i4 >> 12) & 14));
            bkp bkpVarD2 = zi.d(bkmVar, 48.0f);
            bvt bvtVarA5 = xo.a(bkdVar, false);
            int iK5 = a.k(zy.p(baoVarD));
            bhu bhuVarAi5 = basVar.ai();
            bkp bkpVarC5 = bdi.C(baoVarD, bkpVarD2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA5, yjzVar4);
            beb.a(baoVarD, bhuVarAi5, yjzVar5);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK5))) {
                Integer numValueOf5 = Integer.valueOf(iK5);
                basVar.ae(numValueOf5);
                baoVarD.i(numValueOf5, yjzVar6);
            }
            beb.a(baoVarD, bkpVarC5, yjzVar7);
            yjkVar3 = yjkVar2;
            jyv.g(yjkVar3, null, baoVarD, (i4 >> 3) & 14);
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khu(yjkVar, yjkVar3, yjzVar, yjzVar2, yjzVar3, bkpVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(defpackage.yjk r20, defpackage.yjk r21, defpackage.yjz r22, defpackage.yjz r23, defpackage.bkp r24, defpackage.bao r25, int r26) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdw.h(yjk, yjk, yjz, yjz, bkp, bao, int):void");
    }

    public static final void i(yjv yjvVar, khr khrVar, boolean z, bao baoVar, int i) {
        int i2;
        bas basVar;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(167764067);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(khrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            brs brsVar = (brs) baoVarD.f(ccq.g);
            bdy bdyVarBR = a.bR(khrVar, baoVarD);
            baoVarD.x(5004770);
            boolean zH = baoVarD.H(brsVar);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            if (zH || objT == ban.a) {
                objT = new keu(brsVar, 14);
                basVar2.ae(objT);
            }
            yjk yjkVar = (yjk) objT;
            basVar2.aa();
            baoVarD.x(-1633490746);
            boolean zF = ((i2 & 14) == 4) | baoVarD.F(bdyVarBR);
            Object objT2 = basVar2.T();
            if (zF || objT2 == ban.a) {
                objT2 = new jzx(yjvVar, bdyVarBR, 15);
                basVar2.ae(objT2);
            }
            yjk yjkVar2 = (yjk) objT2;
            basVar2.aa();
            Boolean boolValueOf = Boolean.valueOf(z);
            baoVarD.x(-1224400529);
            boolean zF2 = baoVarD.F(yjkVar2) | ((i2 & 896) == 256) | baoVarD.F(yjkVar) | baoVarD.H(brsVar);
            Object objT3 = basVar2.T();
            if (zF2 || objT3 == ban.a) {
                basVar = basVar2;
                avp avpVar = new avp(z, yjkVar2, yjkVar, brsVar, (yih) null, 4);
                basVar.ae(avpVar);
                objT3 = avpVar;
            } else {
                basVar = basVar2;
            }
            basVar.aa();
            bbn.f(boolValueOf, (yjz) objT3, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly(yjvVar, khrVar, z, i, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [bdy, java.lang.Object] */
    public static final void j(yjv yjvVar, bkp bkpVar, ykb ykbVar, bao baoVar, int i) {
        int i2;
        yjvVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1783083186);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(ykbVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            clx clxVar = (clx) baoVarD.f(ccq.d);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new iom(clxVar);
                basVar.ae(objT);
            }
            iom iomVar = (iom) objT;
            basVar.aa();
            int i4 = i2 & 14;
            i(yjvVar, iomVar.g(), ((Boolean) iomVar.a.a()).booleanValue(), baoVarD, i4);
            bkp bkpVarL = ht.l(bga.w(hq.f(bkpVar.a(zi.c), wv.K(baoVarD).I, k(baoVarD)), k(baoVarD)), 1.0f, wv.K(baoVarD).J, k(baoVarD));
            baoVarD.x(5004770);
            Object objT2 = basVar.T();
            int i5 = 15;
            if (i4 == 4 || objT2 == obj) {
                objT2 = new keu(yjvVar, i5);
                basVar.ae(objT2);
            }
            basVar.aa();
            bkp bkpVarU = hu.u(bkpVarL, false, null, (yjk) objT2, 15);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarU);
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
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            ykbVar.a(xs.a, iomVar, baoVarD, Integer.valueOf((i2 & 896) | 54));
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) yjvVar, bkpVar, (Object) ykbVar, i, 14);
        }
    }

    public static final aeh k(bao baoVar) {
        baoVar.x(236402242);
        aeh aehVar = wv.M(baoVar).h;
        ((bas) baoVar).aa();
        return aehVar;
    }

    public static final /* synthetic */ auy l(bao baoVar) {
        long j;
        baoVar.x(1327710679);
        long j2 = bnq.f;
        long j3 = wv.K(baoVar).s;
        baoVar.x(1931781400);
        long jR = rdd.R(32, baoVar);
        long jR2 = rdd.R(26, baoVar);
        long jR3 = rdd.R(18, baoVar);
        long jM = bny.m(bny.k(bnq.d(jR3), bnq.c(jR3), bnq.b(jR3), 0.38f, bnq.f(jR3)), wv.K(baoVar).p);
        long jR4 = rdd.R(18, baoVar);
        long jK = bny.k(bnq.d(jR4), bnq.c(jR4), bnq.b(jR4), 0.38f, bnq.f(jR4));
        long jR5 = rdd.R(18, baoVar);
        long jK2 = bny.k(bnq.d(jR5), bnq.c(jR5), bnq.b(jR5), 0.12f, bnq.f(jR5));
        long j4 = j2;
        long j5 = wv.K(baoVar).q;
        long jK3 = bny.k(bnq.d(j5), bnq.c(j5), bnq.b(j5), 0.12f, bnq.f(j5));
        long jR6 = rdd.R(18, baoVar);
        long jK4 = bny.k(bnq.d(jR6), bnq.c(jR6), bnq.b(jR6), 0.38f, bnq.f(jR6));
        ave aveVar = ave.a;
        auy auyVarB = ave.b(wv.K(baoVar));
        if (j3 == 16) {
            j3 = auyVarB.a;
        }
        long j6 = j3;
        if (j4 != 16) {
            j = j4;
        } else {
            j = auyVarB.b;
            j4 = 16;
        }
        if (jR == 16) {
            jR = auyVarB.c;
        }
        long j7 = jR;
        long j8 = j4 != 16 ? j4 : auyVarB.d;
        if (jR2 == 16) {
            jR2 = auyVarB.e;
        }
        long j9 = jR2;
        if (jM == 16) {
            jM = auyVarB.f;
        }
        long j10 = jM;
        long j11 = jK != 16 ? jK : auyVarB.g;
        if (jK2 == 16) {
            jK2 = auyVarB.h;
        }
        long j12 = jK2;
        if (jK3 == 16) {
            jK3 = auyVarB.i;
        }
        long j13 = jK3;
        if (jK4 == 16) {
            jK4 = auyVarB.j;
        }
        auy auyVar = new auy(j6, j, j7, j8, j9, j10, j11, j12, j13, jK4);
        baoVar.p();
        baoVar.p();
        return auyVar;
    }

    public static final void m(float f, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        float f2;
        int i2;
        bkp bkpVar2;
        yjzVar.getClass();
        bao baoVarD = baoVar.d(1961485967);
        if ((i & 6) == 0) {
            f2 = f;
            i2 = (true != baoVarD.C(f2) ? 2 : 4) | i;
        } else {
            f2 = f;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            bdy bdyVarBR = a.bR(Float.valueOf(f2), baoVarD);
            bkp bkpVarB = zi.b(zi.a(bkmVar, 1.0f), 12.0f);
            bvt bvtVarA = xo.a(bkb.e, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(5004770);
            boolean zF = baoVarD.F(bdyVarBR);
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new keu(bdyVarBR, 13);
                basVar.ae(objT);
            }
            basVar.aa();
            ocv.bJ((yjk) objT, zi.a(bkmVar, 1.0f), wv.K(baoVarD).s, wv.K(baoVarD).B, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, baoVarD, 48, 0);
            yjzVar.a(baoVarD, Integer.valueOf((i4 >> 6) & 14));
            baoVarD.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khq(f2, bkpVar2, yjzVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(defpackage.yjz r14, defpackage.yjz r15, defpackage.yjz r16, defpackage.bkp r17, defpackage.xj r18, defpackage.bao r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdw.n(yjz, yjz, yjz, bkp, xj, bao, int, int):void");
    }

    public static epr o() {
        return epr.b(dys.d);
    }

    public static final kwx p(MediaTrack mediaTrack) {
        mediaTrack.getClass();
        int i = mediaTrack.g;
        return kwx.subtitleTrack(mediaTrack.f, mediaTrack.e, "AAAAAAAAAAA", 1, String.valueOf(mediaTrack.a), false, i == 2);
    }

    public static idf q(final ler lerVar, idf idfVar, final long j, final long j2, final boolean z) {
        int i = 0;
        a.aD(j >= 0 && j <= j2, a.cv(j2, j, "soft time to live ", " must be >= 0 and <= hard TTL "));
        a.aD(j2 >= 0 && j2 <= 2592000000L, a.cp(j2, "hard time to live ", " must be >= 0 and <= 2592000000"));
        final lff lffVar = new lff(idfVar, lerVar, i);
        return new idf() { // from class: lfg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1, types: [lfe] */
            /* JADX WARN: Type inference failed for: r7v11 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v6 */
            /* JADX WARN: Type inference failed for: r7v7 */
            @Override // defpackage.idf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    long r0 = r1
                    r2 = 0
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    idf r3 = r4
                    if (r2 == 0) goto La2
                    boolean r2 = r3
                    if (r2 == 0) goto L10
                    goto La2
                L10:
                    ler r2 = r5
                    defpackage.a.aq(r12)
                    lfa r2 = (defpackage.lfa) r2
                    lfb r4 = r2.c
                    r4.d()
                    idf r5 = r2.b
                    java.lang.String r5 = r4.c(r12, r5)
                    j$.util.concurrent.ConcurrentHashMap r6 = r4.c
                    boolean r6 = r6.containsKey(r5)
                    lev r2 = r2.a
                    r7 = 0
                    if (r6 != 0) goto L2e
                    goto L6c
                L2e:
                    java.lang.String r6 = r4.a
                    java.io.File r8 = new java.io.File
                    r8.<init>(r6, r5)
                    java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                    r6.<init>(r8)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
                    long r9 = r8.length()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                    lfh r2 = (defpackage.lfh) r2     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                    lfe r7 = r2.a(r6, r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                    long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                    r8.setLastModified(r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
                    defpackage.lfb.e(r6)
                    goto L6c
                L4f:
                    r12 = move-exception
                    r7 = r6
                    goto L9e
                L52:
                    r2 = r7
                    r7 = r6
                    goto L58
                L55:
                    r12 = move-exception
                    goto L9e
                L57:
                    r2 = r7
                L58:
                    j$.util.concurrent.ConcurrentHashMap r4 = r4.c     // Catch: java.lang.Throwable -> L55
                    r4.remove(r5)     // Catch: java.lang.Throwable -> L55
                    java.lang.String r4 = "Error opening cache file (maybe removed). [filename="
                    java.lang.String r6 = "]"
                    java.lang.String r4 = defpackage.a.cg(r5, r4, r6)     // Catch: java.lang.Throwable -> L55
                    defpackage.krd.f(r4)     // Catch: java.lang.Throwable -> L55
                    defpackage.lfb.e(r7)
                    r7 = r2
                L6c:
                    long r4 = java.lang.System.currentTimeMillis()
                    if (r7 == 0) goto L99
                    long r8 = r7.b
                    long r0 = r0 + r8
                    int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L7a
                    goto L99
                L7a:
                    long r0 = r6
                    long r8 = r8 + r0
                    int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L92
                    java.lang.Object r12 = r3.b(r12)
                    java.lang.Object r0 = r7.a
                    ieg r12 = (defpackage.ieg) r12
                    java.lang.Object r12 = r12.h(r0)
                    ieg r12 = defpackage.ieg.f(r12)
                    goto L9d
                L92:
                    java.lang.Object r12 = r7.a
                    ieg r12 = defpackage.ieg.f(r12)
                    goto L9d
                L99:
                    java.lang.Object r12 = r3.b(r12)
                L9d:
                    return r12
                L9e:
                    defpackage.lfb.e(r7)
                    throw r12
                La2:
                    java.lang.Object r12 = r3.b(r12)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lfg.b(java.lang.Object):java.lang.Object");
            }
        };
    }

    public static int r(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        return i4 | (i << 24) | (i2 << 16) | (i3 << 8);
    }

    public static mee s(InputStream inputStream, long j) throws IOException {
        if (j > 2147483647L) {
            throw new IOException("Byte array size too large");
        }
        int i = (int) j;
        mee meeVar = new mee(i);
        int i2 = 0;
        while (i2 < j) {
            int i3 = inputStream.read(meeVar.b, i2, i - i2);
            if (i3 == -1) {
                throw new IOException("Unexpected end of data [" + i2 + ", " + j + "]");
            }
            i2 += i3;
        }
        return meeVar;
    }

    public static void t(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i >>> 24);
        outputStream.write(i >>> 16);
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static String u(String[] strArr, List list, List list2, SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS)) {
            return sharedPreferences.getString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, null);
        }
        for (int i = 0; i < strArr.length; i++) {
            if (((Integer) list.get(i)).intValue() == 1 && ((Integer) list2.get(i)).intValue() == 1) {
                return strArr[i];
            }
        }
        return strArr[0];
    }

    public static String v(Resources resources, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(krh.AUDIO_LANGUAGE, null);
        return string == null ? resources.getString(com.google.android.videos.R.string.audio_original) : string;
    }

    public static String w(Resources resources, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(krh.DOWNLOAD_NETWORK, null);
        return string == null ? resources.getString(com.google.android.videos.R.string.wifi) : string;
    }

    public static void x(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS).apply();
    }

    public static void y(String[] strArr, List list, List list2, SharedPreferences sharedPreferences) {
        for (int i = 0; i < strArr.length; i++) {
            if (((Integer) list.get(i)).intValue() == 1 && ((Integer) list2.get(i)).intValue() == 1) {
                sharedPreferences.edit().putString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, strArr[i]).apply();
                return;
            }
        }
        sharedPreferences.edit().putString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, strArr[0]).apply();
    }

    public static void z(boolean z, SharedPreferences sharedPreferences) {
        if (!z || A(sharedPreferences)) {
            return;
        }
        sharedPreferences.edit().putBoolean(krh.SHOW_SETTING_OPTION_DOWNLOAD_ON_5G, true).apply();
    }

    public final synchronized mma B() {
        return new mma();
    }
}
