package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfw {
    private static ssr a;

    public static int A(kzo kzoVar) {
        int iBm;
        int i = 0;
        if (kzoVar == null) {
            return 0;
        }
        int i2 = 8;
        if ((kzoVar.b & 8) != 0 && (iBm = a.bm(kzoVar.f)) != 0 && iBm == 3) {
            i = 16;
        }
        if ((kzoVar.b & 2) == 0) {
            return i;
        }
        int iAR = a.aR(kzoVar.d);
        if (iAR == 0 || iAR == 1) {
            i2 = 1;
        } else if (iAR != 2) {
            i2 = iAR != 3 ? RecyclerView.ItemAnimator.FLAG_MOVED : 512;
        }
        return i | i2;
    }

    public static int B(String str) {
        return Integer.parseInt(str.substring(str.indexOf(":") + 1));
    }

    public static enr C(String str, List list, List list2, List list3, int i) {
        eny[] enyVarArr = new eny[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            enyVarArr[i2] = F(i2, (lvd) list.get(i2), str);
        }
        eny[] enyVarArr2 = new eny[list2.size()];
        int i3 = 0;
        while (i3 < list2.size()) {
            enyVarArr2[i3] = D(i3, (lvd) list2.get(i3), str, i3 == i);
            i3++;
        }
        return new enr(-9223372036854775807L, ((lvd) list.get(0)).b.m, -9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, null, null, null, null, ImmutableList.of(I(ImmutableList.copyOf(enyVarArr), ImmutableList.copyOf(enyVarArr2), ImmutableList.copyOf((Collection) list3))));
    }

    public static eny D(int i, lvd lvdVar, String str, boolean z) {
        kzo kzoVar;
        kuy kuyVar = lvdVar.c;
        lcl lclVar = lvdVar.b;
        if ((lclVar.b & 512) != 0) {
            kzoVar = lclVar.l;
            if (kzoVar == null) {
                kzoVar = kzo.a;
            }
        } else {
            kzoVar = null;
        }
        String str2 = kzoVar != null ? kzoVar.c : null;
        int i2 = (int) ((lclVar.d * 8000) / lclVar.m);
        int i3 = true != z ? 4 : 1;
        int iA = A(kzoVar);
        dzd dzdVar = new dzd();
        dzdVar.a = V(i, lclVar.c);
        dzdVar.a(kuyVar.h);
        dzdVar.d(lvb.a(lclVar.k));
        dzdVar.j = lclVar.k;
        dzdVar.h = i2;
        dzdVar.i = i2;
        dzdVar.E = kuyVar.c;
        dzdVar.e = i3;
        dzdVar.f = iA;
        dzdVar.d = str2;
        return eny.a(lclVar.f, new dze(dzdVar), lvdVar.a.toString(), lclVar.h, lclVar.i, lclVar.j, lclVar.e, null, U(str, lclVar), lclVar.d);
    }

    public static eny E(int i, kwx kwxVar) {
        String str;
        int i2 = kwxVar.format();
        if (i2 == 1 || i2 == 2) {
            str = "text/xml";
        } else if (i2 != 200) {
            krd.c("Unsupported SubtitleTrack format: " + kwxVar.format());
            str = "";
        } else {
            str = "application/ttml+xml";
        }
        int i3 = kwxVar.isClosedCaption() ? 4160 : kwxVar.isForced() ? RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT : 128;
        int i4 = true != kwxVar.isForced() ? 0 : 2;
        dzd dzdVar = new dzd();
        dzdVar.b(i);
        dzdVar.a(str);
        dzdVar.d(str);
        dzdVar.d = kwxVar.languageCode();
        dzdVar.f = i3;
        dzdVar.e = i4;
        dze dzeVar = new dze(dzdVar);
        long jFileVersion = kwxVar.fileVersion();
        ImmutableList immutableListOf = ImmutableList.of(new enq(kwxVar.url()));
        eoe eoeVar = new eoe();
        new ArrayList();
        new ArrayList();
        return (eny) enz.n(jFileVersion, dzeVar, immutableListOf, eoeVar, null, i + ":TEXT");
    }

    public static eny F(int i, lvd lvdVar, String str) {
        kuy kuyVar = lvdVar.c;
        lcl lclVar = lvdVar.b;
        int i2 = (int) ((lclVar.d * 8000) / lclVar.m);
        dzd dzdVar = new dzd();
        dzdVar.a = V(i, lclVar.c);
        dzdVar.a(kuyVar.h);
        dzdVar.d(eae.h(lclVar.k));
        dzdVar.j = lclVar.k;
        dzdVar.h = i2;
        dzdVar.i = i2;
        dzdVar.t = kuyVar.a;
        dzdVar.u = kuyVar.b;
        float f = lclVar.q;
        if (f == 0.0f) {
            f = -1.0f;
        }
        dzdVar.x = f;
        return eny.a(lclVar.f, new dze(dzdVar), lvdVar.a.toString(), lclVar.h, lclVar.i, lclVar.j, lclVar.e, null, U(str, lclVar), lclVar.d);
    }

    public static ieg G(Bundle bundle) {
        return ieg.a((llt) bundle.getParcelable("playback_error"));
    }

    public static void H(Bundle bundle, llt lltVar) {
        bundle.putParcelable("playback_error", lltVar);
    }

    public static gsf I(List list, List list2, List list3) {
        enp enpVar = new enp(0L, 2, list, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        ArrayList arrayList = new ArrayList();
        arrayList.add(enpVar);
        ArrayListMultimap arrayListMultimapCreate = ArrayListMultimap.create();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            enz enzVar = (enz) it.next();
            dze dzeVar = enzVar.e;
            arrayListMultimapCreate.put(new cui(dzeVar.N, Integer.valueOf(dzeVar.P)), enzVar);
        }
        Iterator it2 = arrayListMultimapCreate.asMap().values().iterator();
        int i = 1;
        int i2 = 1;
        while (it2.hasNext()) {
            arrayList2.add(new enp(i2, 1, (List) ((Collection) it2.next()), ImmutableList.of(), ImmutableList.of(), ImmutableList.of()));
            i2++;
        }
        arrayList.addAll(arrayList2);
        ArrayListMultimap arrayListMultimapCreate2 = ArrayListMultimap.create();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            enz enzVar2 = (enz) it3.next();
            arrayListMultimapCreate2.put(enzVar2.e.N, enzVar2);
        }
        Iterator it4 = arrayListMultimapCreate2.asMap().values().iterator();
        while (it4.hasNext()) {
            arrayList3.add(new enp(i, 3, (List) ((Collection) it4.next()), ImmutableList.of(), ImmutableList.of(), ImmutableList.of()));
            i++;
        }
        arrayList.addAll(arrayList3);
        return new gsf(null, 0L, arrayList, Collections.EMPTY_LIST, null);
    }

    public static void J(lkr lkrVar, kwy kwyVar, int i, int i2, kuw kuwVar, ieg iegVar, int i3) {
        lkrVar.onVideoInfo((String) (kwyVar != null ? kwyVar.a : null), i, i2, kuwVar, (ieg<lvd>) iegVar, i3);
    }

    public static int K(SharedPreferences sharedPreferences) {
        return ksh.b(sharedPreferences.getString(krh.DOWNLOAD_STORAGE, null), 0);
    }

    public static int L(String str) {
        int iIndexOf = str.indexOf(46);
        return (iIndexOf <= 0 || iIndexOf >= str.length() + (-2) || !str.substring(iIndexOf, iIndexOf + 3).equals(".P.")) ? iIndexOf : iIndexOf + 2;
    }

    public static File M(Context context, int i) throws lka {
        a.aD(i < 2, a.cf(i, "Invalid storage option: "));
        File[] fileArrP = P(context);
        File file = i >= fileArrP.length ? null : fileArrP[i];
        if (file != null) {
            return file;
        }
        int i2 = 60;
        int i3 = 18;
        if (i != 0) {
            throw new lka(18, 60);
        }
        String externalStorageState = Environment.getExternalStorageState();
        if ("removed".equals(externalStorageState) && Environment.isExternalStorageRemovable()) {
            i2 = 9;
            i3 = 15;
        } else if ("unmountable".equals(externalStorageState)) {
            i2 = 62;
            i3 = 16;
        } else if ("nofs".equals(externalStorageState)) {
            i2 = 61;
            i3 = 17;
        } else if (!"unmounted".equals(externalStorageState)) {
            if ("shared".equals(externalStorageState)) {
                i2 = 10;
                i3 = 19;
            } else {
                i2 = 8;
                i3 = 20;
            }
        }
        throw new lka(i3, i2);
    }

    public static String N(String str) {
        String strSubstring = str.substring(str.lastIndexOf(File.separator) + 1);
        int iL = L(strSubstring);
        return iL >= 0 ? strSubstring.substring(0, iL) : strSubstring;
    }

    public static void O(File file, idy idyVar, int i) {
        if (i > 10) {
            return;
        }
        String[] list = file.list();
        if (list == null) {
            krd.f("Can't list files for directory ".concat(String.valueOf(String.valueOf(file))));
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                O(file2, idyVar, i + 1);
            } else {
                idyVar.c(file2);
            }
        }
    }

    public static File[] P(Context context) {
        File[] externalFilesDirs = context.getExternalFilesDirs(Environment.DIRECTORY_MOVIES);
        if (externalFilesDirs.length <= 2) {
            return externalFilesDirs;
        }
        File[] fileArr = new File[2];
        System.arraycopy(externalFilesDirs, 0, fileArr, 0, 2);
        return fileArr;
    }

    public static boolean Q(Resources resources, mem memVar, SharedPreferences sharedPreferences) {
        if (memVar.g().k()) {
            return false;
        }
        return resources.getString(R.string.wifi).equals(kdw.w(resources, sharedPreferences));
    }

    public static boolean R(Resources resources, mem memVar, SharedPreferences sharedPreferences) {
        boolean zK = memVar.g().k();
        boolean zF = memVar.f();
        if (zK || zF) {
            return false;
        }
        return resources.getString(R.string.wifi_and_unrestricted).equals(kdw.w(resources, sharedPreferences));
    }

    public static synchronized void S(Application application, lfn lfnVar, lie lieVar) {
        if (a != null) {
            krd.f("PerformanceMonitor.startMonitor is called more than once.");
            return;
        }
        a = new ssr();
        lij lijVar = new lij(application, lfnVar, lieVar, 1);
        rnd rndVarA = rnd.a().a();
        xcq xcqVar = rmm.a;
        trk trkVar = trk.a;
        Object objB = lijVar.b();
        rmr.i(new rml(application, new riu(((rmw) objB).a, 12), ((rmw) objB).c, trkVar, ((rmw) objB).b, ((rmw) objB).d, ((rmw) objB).f, ((rmw) objB).e, ((rmw) objB).g, ((rmw) objB).h, ((rmw) objB).i, ((rmw) objB).j, ((rmw) objB).l, ((rmw) objB).m, ((rmw) objB).n, ((rmw) objB).o, trkVar, ((rmw) objB).k, tst.i(rndVarA), trkVar));
        rmr.a().a.f();
    }

    private static void T(Context context, int i) {
        jwq.T(context, i, 1);
    }

    private static String U(String str, lcl lclVar) {
        if (!lclVar.n.isEmpty()) {
            str = lclVar.n;
        }
        return str + "." + lclVar.c + "." + lclVar.f;
    }

    private static String V(int i, int i2) {
        return i + ":" + i2;
    }

    public static final void a(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bol bolVarD;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-657287554);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            if (((Boolean) a.bH(kwVar, baoVarD, 6).a()).booleanValue()) {
                baoVarD.x(-293135218);
                bolVarD = rdd.E(baoVarD);
            } else {
                baoVarD.x(-293133907);
                bolVarD = rdd.D(baoVarD);
            }
            basVar.aa();
            bol bolVar = bolVarD;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.d(bkpVar, 80.0f), 1.0f, wv.K(baoVarD).J, bolVar), bolVar), false, bolVar, rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), kwVar, bga.k(-1081857186, new kgx(context, 1), baoVarD), baoVarD, (i3 & 14) | 1769472, 4);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 5);
        }
    }

    public static final void b(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        bao baoVarD = baoVar.d(3903008);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.e(bkpVar, rdd.H(0)), 1.0f, wv.K(baoVarD).I, rdd.F(baoVarD)), rdd.F(baoVarD)), false, rdd.F(baoVarD), rdd.G(wv.K(baoVarD).F, wv.K(baoVarD).s, baoVarD, 12), null, bga.k(469594880, new azg((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 20), baoVarD), baoVarD, (i4 & 14) | 1572864, 36);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, i3);
        }
    }

    public static final void c(bkp bkpVar, bao baoVar, int i) {
        int i2;
        bas basVar;
        bml bmlVar;
        Object obj;
        cdv cdvVar;
        bas basVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1408786092);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cdv cdvVar2 = (cdv) baoVarD.f(ccq.n);
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            aid aidVarO = hu.O(null, 0L, baoVarD, 0, 3);
            baoVarD.x(1849434622);
            bas basVar3 = (bas) baoVarD;
            Object objT = basVar3.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                objT = new bml();
                basVar3.ae(objT);
            }
            bml bmlVar2 = (bml) objT;
            basVar3.aa();
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar3.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar3.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar3.w || !yks.e(basVar3.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar3.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(1478712848);
            if (aidVarO.c().length() == 0) {
                String string = context.getString(R.string.virtual_remote_keyboard_input_placeholder);
                string.getClass();
                basVar = basVar3;
                bmlVar = bmlVar2;
                obj = obj2;
                rdd.p(string, null, wv.K(baoVarD).A, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).d, baoVarD, 0, 0, 65530);
                baoVarD = baoVarD;
            } else {
                basVar = basVar3;
                bmlVar = bmlVar2;
                obj = obj2;
            }
            basVar.aa();
            afc.c(aidVarO, d.Q(bkp.g.a(zi.c), bmlVar), false, chc.v(wv.N(baoVarD).d, wv.K(baoVarD).q, 0L, null, null, null, 0L, 0L, null, null, 16777214), null, null, null, null, new bon(wv.K(baoVarD).q), null, null, baoVarD, 0, 0, 30684);
            baoVarD.o();
            baoVarD.x(-1633490746);
            boolean zF = baoVarD.F(cdvVar2);
            Object objT2 = basVar.T();
            if (zF || objT2 == obj) {
                bml bmlVar3 = bmlVar;
                cdvVar = cdvVar2;
                basVar2 = basVar;
                kbl kblVar = new kbl(cdvVar, bmlVar3, (yih) null, 8, (byte[]) null);
                basVar2.ae(kblVar);
                objT2 = kblVar;
            } else {
                basVar2 = basVar;
                cdvVar = cdvVar2;
            }
            basVar2.aa();
            bbn.f(cdvVar, (yjz) objT2, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(bkpVar, i, 18);
        }
    }

    public static final void d(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1667561928);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
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
            kik.a.m(kiqVar, yjkVar, false, null, baoVarD, (i2 & 14) | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c(wv.q(xx.b(zi.a(bkp.g, 1.0f), 1.0f, true), 24.0f, 4.0f), baoVarD, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(defpackage.kiq r17, defpackage.yjk r18, defpackage.bkp r19, defpackage.bao r20, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.e(kiq, yjk, bkp, bao, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(defpackage.kiq r9, defpackage.yjk r10, defpackage.bkp r11, boolean r12, defpackage.bao r13, int r14) {
        /*
            r0 = 262062755(0xf9ec2a3, float:1.5654974E-29)
            bao r13 = r13.d(r0)
            r0 = r14 & 6
            r1 = 1
            if (r0 != 0) goto L20
            r0 = r14 & 8
            if (r0 != 0) goto L15
            boolean r0 = r13.F(r9)
            goto L19
        L15:
            boolean r0 = r13.H(r9)
        L19:
            if (r1 == r0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = 4
        L1e:
            r0 = r0 | r14
            goto L21
        L20:
            r0 = r14
        L21:
            r2 = r14 & 48
            if (r2 != 0) goto L31
            boolean r2 = r13.H(r10)
            if (r1 == r2) goto L2e
            r2 = 16
            goto L30
        L2e:
            r2 = 32
        L30:
            r0 = r0 | r2
        L31:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L41
            boolean r2 = r13.F(r11)
            if (r1 == r2) goto L3e
            r1 = 128(0x80, float:1.8E-43)
            goto L40
        L3e:
            r1 = 256(0x100, float:3.59E-43)
        L40:
            r0 = r0 | r1
        L41:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L47
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L47:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L5a
            boolean r1 = r13.K()
            if (r1 != 0) goto L54
            goto L5a
        L54:
            r13.t()
        L57:
            r2 = r11
        L58:
            r6 = r12
            goto Laa
        L5a:
            r13.u()
            r1 = r14 & 1
            if (r1 == 0) goto L6c
            boolean r1 = r13.I()
            if (r1 == 0) goto L68
            goto L6c
        L68:
            r13.t()
            goto L70
        L6c:
            boolean r12 = defpackage.kik.h(r13)
        L70:
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 & 14
            r2 = r2 | 8
            r13.m()
            r1 = r1 | r2
            if (r12 == 0) goto L8f
            r2 = -1138798408(0xffffffffbc1f50b8, float:-0.009723835)
            r13.x(r2)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            d(r9, r10, r11, r13, r0)
            r0 = r13
            bas r0 = (defpackage.bas) r0
            r0.aa()
            goto L57
        L8f:
            r0 = -1138688792(0xffffffffbc20fce8, float:-0.009825923)
            r13.x(r0)
            r6 = 1098907648(0x41800000, float:16.0)
            r7 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            bkp r11 = defpackage.wv.v(r2, r3, r4, r5, r6, r7)
            e(r9, r10, r11, r13, r1)
            r11 = r13
            bas r11 = (defpackage.bas) r11
            r11.aa()
            goto L58
        Laa:
            bcr r11 = r13.M()
            if (r11 == 0) goto Lbd
            r5 = r2
            jwv r2 = new jwv
            r8 = 12
            r3 = r9
            r4 = r10
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.d = r2
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.f(kiq, yjk, bkp, boolean, bao, int):void");
    }

    public static final void g(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(329987628);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            int i4 = i2 & 14;
            int i5 = i4 | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar, false, null, baoVarD, i5);
            bkm bkmVar = bkp.g;
            bkp bkpVarA2 = zi.a(bkmVar, 1.0f);
            bvt bvtVarA2 = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            h(kiqVar, zh.a(bkmVar, 1.0f, true), baoVarD, i4 | 8);
            kikVar.b(kiqVar, wv.v(zh.a(bkmVar, 1.0f, true), 40.0f, 0.0f, 80.0f, 0.0f, 10), baoVarD, i4 | 392);
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 9);
        }
    }

    public static final void h(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(266603747);
        int i4 = 2;
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarP = wv.p(bkpVar.a(zi.b), 32.0f);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarP);
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
            baoVarD.x(5004770);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.H(kiqVar))) {
                z = false;
            }
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = new kij(kiqVar, 3);
                basVar.ae(objT);
            }
            basVar.aa();
            kdw.j((yjv) objT, xx.b(bkp.g.a(zi.b), 1.0f, true), khz.a, baoVarD, 384);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(kiqVar, bkpVar, i, i4);
        }
    }

    public static final void i(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1834586594);
        int i4 = 4;
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i5 = i2;
        if ((i5 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.e(16.0f), bkb.k, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar3 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar3);
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
            int i6 = i5 & 14;
            int i7 = i6 | 24968 | (i5 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar2, true, null, baoVarD, i7);
            kikVar.j(kiqVar, null, baoVarD, i6 | 392);
            baoVarD.x(5004770);
            if (i6 != 4 && ((i5 & 8) == 0 || !baoVarD.H(kiqVar))) {
                z = false;
            }
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = new kij(kiqVar, i4);
                basVar.ae(objT);
            }
            basVar.aa();
            bkm bkmVar = bkp.g;
            kdw.j((yjv) objT, wv.u(xx.b(zi.a(bkmVar, 1.0f), 1.0f, true), 32.0f, 0.0f, 2), khz.b, baoVarD, 384);
            kikVar.b(kiqVar, wv.v(bkmVar, 24.0f, 0.0f, 24.0f, 0.0f, 10), baoVarD, i6 | 440);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(defpackage.kiq r9, defpackage.yjk r10, defpackage.bkp r11, boolean r12, defpackage.bao r13, int r14) {
        /*
            r0 = -501093091(0xffffffffe221ed1d, float:-7.467529E20)
            bao r13 = r13.d(r0)
            r0 = r14 & 6
            r1 = 1
            if (r0 != 0) goto L20
            r0 = r14 & 8
            if (r0 != 0) goto L15
            boolean r0 = r13.F(r9)
            goto L19
        L15:
            boolean r0 = r13.H(r9)
        L19:
            if (r1 == r0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = 4
        L1e:
            r0 = r0 | r14
            goto L21
        L20:
            r0 = r14
        L21:
            r2 = r14 & 48
            if (r2 != 0) goto L31
            boolean r2 = r13.H(r10)
            if (r1 == r2) goto L2e
            r2 = 16
            goto L30
        L2e:
            r2 = 32
        L30:
            r0 = r0 | r2
        L31:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L41
            boolean r2 = r13.F(r11)
            if (r1 == r2) goto L3e
            r1 = 128(0x80, float:1.8E-43)
            goto L40
        L3e:
            r1 = 256(0x100, float:3.59E-43)
        L40:
            r0 = r0 | r1
        L41:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L47
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L47:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L5a
            boolean r1 = r13.K()
            if (r1 != 0) goto L54
            goto L5a
        L54:
            r13.t()
        L57:
            r2 = r11
        L58:
            r6 = r12
            goto Laa
        L5a:
            r13.u()
            r1 = r14 & 1
            if (r1 == 0) goto L6c
            boolean r1 = r13.I()
            if (r1 == 0) goto L68
            goto L6c
        L68:
            r13.t()
            goto L70
        L6c:
            boolean r12 = defpackage.kik.h(r13)
        L70:
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 & 14
            r2 = r2 | 8
            r13.m()
            r1 = r1 | r2
            if (r12 == 0) goto L8f
            r2 = 1242261499(0x4a0b67fb, float:2284030.8)
            r13.x(r2)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            g(r9, r10, r11, r13, r0)
            r0 = r13
            bas r0 = (defpackage.bas) r0
            r0.aa()
            goto L57
        L8f:
            r0 = 1242374091(0x4a0d1fcb, float:2312178.8)
            r13.x(r0)
            r6 = 1098907648(0x41800000, float:16.0)
            r7 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            bkp r11 = defpackage.wv.v(r2, r3, r4, r5, r6, r7)
            i(r9, r10, r11, r13, r1)
            r11 = r13
            bas r11 = (defpackage.bas) r11
            r11.aa()
            goto L58
        Laa:
            bcr r11 = r13.M()
            if (r11 == 0) goto Lbd
            r5 = r2
            jwv r2 = new jwv
            r8 = 11
            r3 = r9
            r4 = r10
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.d = r2
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.j(kiq, yjk, bkp, boolean, bao, int):void");
    }

    public static final long k(bcb bcbVar) {
        return ((ynm) bcbVar.a()).c;
    }

    public static final long l(bcb bcbVar) {
        return ((ynm) bcbVar.a()).c;
    }

    public static final void m(kiq kiqVar, chc chcVar, bkp bkpVar, bao baoVar, int i, int i2) {
        bkp bkpVar2;
        int i3;
        bao baoVarD = baoVar.d(1340010972);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            bkpVar2 = bkpVar;
        } else if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i3 = (true != baoVarD.F(bkpVar2) ? 128 : 256) | i;
        } else {
            bkpVar2 = bkpVar;
            i3 = i;
        }
        if ((i3 & 129) == 128 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVar3 = i4 != 0 ? bkp.g : bkpVar2;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                long j = ynm.a;
                bci bciVar = new bci(new ynm(ylh.o(43, yno.e)), bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                long j2 = ynm.a;
                bci bciVar2 = new bci(new ynm(ylh.o(android.support.v7.appcompat.R.styleable.AppCompatTheme_textAppearanceListItemSmall, yno.e)), bcz.c);
                basVar.ae(bciVar2);
                objT2 = bciVar2;
            }
            bcb bcbVar2 = (bcb) objT2;
            basVar.aa();
            baoVarD.x(1849434622);
            Object objT3 = basVar.T();
            byte[] bArr = null;
            if (objT3 == obj) {
                jzx jzxVar = new jzx(bcbVar, bcbVar2, 16, bArr);
                ivx ivxVar = bdt.a;
                bbh bbhVar = new bbh(jzxVar, null);
                basVar.ae(bbhVar);
                objT3 = bbhVar;
            }
            bdy bdyVar = (bdy) objT3;
            basVar.aa();
            bkp bkpVarA = zi.a(bkpVar3, 1.0f);
            bvt bvtVarA = xu.a(xk.e(4.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
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
            kdw.m(((Number) bdyVar.a()).floatValue(), null, bga.k(1347008153, new ano(bdyVar, bcbVar2, bcbVar, 14, (short[]) null), baoVarD), baoVarD, 384);
            khp.a.c(k(bcbVar), l(bcbVar2), null, null, baoVarD, 0);
            baoVarD.o();
            bkpVar2 = bkpVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(kiqVar, chcVar, bkpVar2, i, i2, 7);
        }
    }

    public static final void n(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 48;
        bao baoVarD = baoVar.d(1675457284);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && baoVarD.K()) {
            baoVarD.t();
        } else {
            khn.a.c(bkpVar, baoVarD, (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(kiqVar, bkpVar, i, i4);
        }
    }

    public static final void o(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1008953164);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            int i4 = i2 & 14;
            int i5 = i4 | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar, false, null, baoVarD, i5);
            bkm bkmVar = bkp.g;
            bkp bkpVarB = xx.b(zi.a(bkmVar, 1.0f), 1.0f, true);
            bvt bvtVarA2 = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarB);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            p(kiqVar, wv.u(zh.a(bkmVar, 1.0f, true), 40.0f, 0.0f, 2), baoVarD, i4 | 8);
            int i6 = i4 | 392;
            kikVar.c(kiqVar, wv.v(zh.a(bkmVar, 1.0f, true), 40.0f, 0.0f, 80.0f, 0.0f, 10), baoVarD, i6);
            baoVarD.o();
            baoVarD.x(325292240);
            chc chcVar = wv.N(baoVarD).o;
            basVar.aa();
            m(kiqVar, chcVar, wv.v(bkmVar, 40.0f, 0.0f, 40.0f, 8.0f, 2), baoVarD, i6, 0);
            baoVar2 = baoVarD;
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 3);
        }
    }

    public static final void p(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1321113821);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.b);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
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
            kdw.n(bga.k(-2053802697, new kgx(kiqVar, 18), baoVarD), bga.k(238853270, new kgx(kiqVar, 19), baoVarD), khy.a, null, xk.e(16.0f), baoVarD, 25014, 8);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(kiqVar, bkpVar, i, 0);
        }
    }

    public static final void q(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-920967550);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.f, bkb.k, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar3 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar3);
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
            int i4 = i2 & 14;
            int i5 = i4 | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar2, true, null, baoVarD, i5);
            kikVar.l(kiqVar, null, baoVarD, i4 | 392);
            bhq bhqVarK = bga.k(-198551832, new kgx(kiqVar, 20), baoVarD);
            bhq bhqVarK2 = bga.k(845236137, new kie(kiqVar, 1), baoVarD);
            bhq bhqVarK3 = bga.k(1889024106, new kie(kiqVar, 0), baoVarD);
            bkm bkmVar = bkp.g;
            kdw.n(bhqVarK, bhqVarK2, bhqVarK3, wv.u(bkmVar, 24.0f, 0.0f, 2), null, baoVarD, 3510, 16);
            kikVar.c(kiqVar, wv.u(bkmVar, 24.0f, 0.0f, 2), baoVarD, i4 | 440);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 2);
        }
    }

    public static final void s(kiq kiqVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-1996193630);
        if ((i & 48) == 0) {
            i2 = (true != baoVarD.G(z) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 384;
        if ((i3 & 145) == 144 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(false, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            khn khnVar = khn.a;
            boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
            baoVarD.x(5004770);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new kic(bcbVar, 5);
                basVar.ae(objT2);
            }
            basVar.aa();
            int i4 = i3 << 6;
            khnVar.d(zBooleanValue, (yjk) objT2, z, bkmVar, 2024, baoVarD, (i4 & 57344) | (i4 & 7168) | 1769862);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly(kiqVar, z, bkpVar2, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(defpackage.kiq r9, defpackage.yjk r10, defpackage.bkp r11, boolean r12, defpackage.bao r13, int r14) {
        /*
            r0 = 1762625379(0x690f8763, float:1.0844734E25)
            bao r13 = r13.d(r0)
            r0 = r14 & 6
            r1 = 1
            if (r0 != 0) goto L20
            r0 = r14 & 8
            if (r0 != 0) goto L15
            boolean r0 = r13.F(r9)
            goto L19
        L15:
            boolean r0 = r13.H(r9)
        L19:
            if (r1 == r0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = 4
        L1e:
            r0 = r0 | r14
            goto L21
        L20:
            r0 = r14
        L21:
            r2 = r14 & 48
            if (r2 != 0) goto L31
            boolean r2 = r13.H(r10)
            if (r1 == r2) goto L2e
            r2 = 16
            goto L30
        L2e:
            r2 = 32
        L30:
            r0 = r0 | r2
        L31:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L41
            boolean r2 = r13.F(r11)
            if (r1 == r2) goto L3e
            r1 = 128(0x80, float:1.8E-43)
            goto L40
        L3e:
            r1 = 256(0x100, float:3.59E-43)
        L40:
            r0 = r0 | r1
        L41:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L47
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L47:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L5a
            boolean r1 = r13.K()
            if (r1 != 0) goto L54
            goto L5a
        L54:
            r13.t()
        L57:
            r2 = r11
        L58:
            r6 = r12
            goto Laa
        L5a:
            r13.u()
            r1 = r14 & 1
            if (r1 == 0) goto L6c
            boolean r1 = r13.I()
            if (r1 == 0) goto L68
            goto L6c
        L68:
            r13.t()
            goto L70
        L6c:
            boolean r12 = defpackage.kik.h(r13)
        L70:
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 & 14
            r2 = r2 | 8
            r13.m()
            r1 = r1 | r2
            if (r12 == 0) goto L8f
            r2 = 102721275(0x61f66fb, float:2.9980234E-35)
            r13.x(r2)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            o(r9, r10, r11, r13, r0)
            r0 = r13
            bas r0 = (defpackage.bas) r0
            r0.aa()
            goto L57
        L8f:
            r0 = 102858884(0x6218084, float:3.0375153E-35)
            r13.x(r0)
            r6 = 1098907648(0x41800000, float:16.0)
            r7 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            bkp r11 = defpackage.wv.v(r2, r3, r4, r5, r6, r7)
            q(r9, r10, r11, r13, r1)
            r11 = r13
            bas r11 = (defpackage.bas) r11
            r11.aa()
            goto L58
        Laa:
            bcr r11 = r13.M()
            if (r11 == 0) goto Lbd
            r5 = r2
            jwv r2 = new jwv
            r8 = 10
            r3 = r9
            r4 = r10
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.d = r2
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.t(kiq, yjk, bkp, boolean, bao, int):void");
    }

    public static final void u(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-515036756);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            int i4 = i2 & 14;
            int i5 = i4 | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar, false, null, baoVarD, i5);
            bkm bkmVar = bkp.g;
            bkp bkpVarA2 = zi.a(bkmVar, 1.0f);
            bvt bvtVarA2 = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            v(kiqVar, zh.a(bkmVar, 1.0f, true), baoVarD, i4 | 8);
            kikVar.b(kiqVar, wv.v(zh.a(bkmVar, 1.0f, true), 40.0f, 0.0f, 80.0f, 0.0f, 10), baoVarD, i4 | 392);
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 1);
        }
    }

    public static final void v(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(812099427);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarO = zi.o(bkpVar);
            bvt bvtVarA = xu.a(xk.c, bkb.k, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarO);
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
            kaf.g(zi.d(wv.u(bkp.g, 0.0f, 24.0f, 1), 256.0f), new za(20.0f, 20.0f, 20.0f, 20.0f), bga.k(2071036956, new kib(kiqVar), baoVarD), baoVarD, 438, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(kiqVar, bkpVar, i, 20);
        }
    }

    public static final void w(kiq kiqVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2011436614);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xu.a(xk.f, bkb.k, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
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
            int i4 = i2 & 14;
            int i5 = i4 | 24968 | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            kik kikVar = kik.a;
            kikVar.m(kiqVar, yjkVar, true, null, baoVarD, i5);
            kikVar.j(kiqVar, null, baoVarD, i4 | 392);
            bkm bkmVar = bkp.g;
            kaf.g(zi.a(wv.u(bkmVar, 32.0f, 0.0f, 2), 1.0f), null, bga.k(943668845, new khb(kiqVar, 6), baoVarD), baoVarD, 390, 2);
            kikVar.b(kiqVar, wv.v(bkmVar, 24.0f, 0.0f, 24.0f, 0.0f, 10), baoVarD, i4 | 440);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) kiqVar, (Object) yjkVar, bkpVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void x(defpackage.kiq r9, defpackage.yjk r10, defpackage.bkp r11, boolean r12, defpackage.bao r13, int r14) {
        /*
            r0 = -1720581051(0xffffffff99720445, float:-1.2511969E-23)
            bao r13 = r13.d(r0)
            r0 = r14 & 6
            r1 = 1
            if (r0 != 0) goto L20
            r0 = r14 & 8
            if (r0 != 0) goto L15
            boolean r0 = r13.F(r9)
            goto L19
        L15:
            boolean r0 = r13.H(r9)
        L19:
            if (r1 == r0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = 4
        L1e:
            r0 = r0 | r14
            goto L21
        L20:
            r0 = r14
        L21:
            r2 = r14 & 48
            if (r2 != 0) goto L31
            boolean r2 = r13.H(r10)
            if (r1 == r2) goto L2e
            r2 = 16
            goto L30
        L2e:
            r2 = 32
        L30:
            r0 = r0 | r2
        L31:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L41
            boolean r2 = r13.F(r11)
            if (r1 == r2) goto L3e
            r1 = 128(0x80, float:1.8E-43)
            goto L40
        L3e:
            r1 = 256(0x100, float:3.59E-43)
        L40:
            r0 = r0 | r1
        L41:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L47
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L47:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L5a
            boolean r1 = r13.K()
            if (r1 != 0) goto L54
            goto L5a
        L54:
            r13.t()
        L57:
            r2 = r11
        L58:
            r6 = r12
            goto Laa
        L5a:
            r13.u()
            r1 = r14 & 1
            if (r1 == 0) goto L6c
            boolean r1 = r13.I()
            if (r1 == 0) goto L68
            goto L6c
        L68:
            r13.t()
            goto L70
        L6c:
            boolean r12 = defpackage.kik.h(r13)
        L70:
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 & 14
            r2 = r2 | 8
            r13.m()
            r1 = r1 | r2
            if (r12 == 0) goto L8f
            r2 = -1690173477(0xffffffff9b41ffdb, float:-1.6047257E-22)
            r13.x(r2)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            u(r9, r10, r11, r13, r0)
            r0 = r13
            bas r0 = (defpackage.bas) r0
            r0.aa()
            goto L57
        L8f:
            r0 = -1690068821(0xffffffff9b4398ab, float:-1.6179352E-22)
            r13.x(r0)
            r6 = 1098907648(0x41800000, float:16.0)
            r7 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            bkp r11 = defpackage.wv.v(r2, r3, r4, r5, r6, r7)
            w(r9, r10, r11, r13, r1)
            r11 = r13
            bas r11 = (defpackage.bas) r11
            r11.aa()
            goto L58
        Laa:
            bcr r11 = r13.M()
            if (r11 == 0) goto Lbd
            r5 = r2
            jwv r2 = new jwv
            r8 = 9
            r3 = r9
            r4 = r10
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.d = r2
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.x(kiq, yjk, bkp, boolean, bao, int):void");
    }

    public static String y(int i, String str) {
        String strCf = "movies_unknown";
        switch (i) {
            case 0:
                break;
            case 1:
                strCf = "movies_info_card_movies";
                break;
            case 2:
                strCf = "movies_info_card_actor";
                break;
            case 3:
                strCf = "movies_info_card_song";
                break;
            case 4:
                strCf = "movies_show_details_next_episode";
                break;
            case 5:
                strCf = "movies_watch_now_next_episode";
                break;
            case 6:
                strCf = "movies_pano_movie_details";
                break;
            case 7:
                strCf = "movies_pano_show_details";
                break;
            case 8:
                strCf = "movies_my_library_suggestion";
                break;
            case 9:
                strCf = "movies_watch_now_suggestion";
                break;
            case 10:
                strCf = "movies_my_library_see_more";
                break;
            case 11:
                strCf = "movies_watch_now_see_more";
                break;
            case 12:
                strCf = "movies_watch_now_warm_welcome";
                break;
            case 13:
                strCf = "movies_movies_warm_welcome";
                break;
            case 14:
                strCf = "movies_shows_warm_welcome";
                break;
            case 15:
                strCf = "movies_knowledge_promo_welcome";
                break;
            case 16:
                strCf = "movies_free_movie_promo_welcome";
                break;
            case 17:
                strCf = "movies_returning_user_welcome";
                break;
            case 18:
                strCf = "movies_purchase_proxy";
                break;
            case 19:
                strCf = "movies_side_drawer";
                break;
            case 20:
                strCf = "movies_search_intent";
                break;
            case 21:
                strCf = "movies_expired_rental_watch_now";
                break;
            case 22:
                strCf = "movies_expired_rental_movies";
                break;
            case 23:
                strCf = "movies_expired_rental_manage_downloads";
                break;
            case 24:
                strCf = "movies_context_menu";
                break;
            case 25:
                strCf = "movies_play_widget";
                break;
            case 26:
                strCf = "movies_play_widget_promo";
                break;
            case 27:
                strCf = "movies_wishlist";
                break;
            case 28:
                strCf = "movies_end_of_show";
                break;
            case 29:
                strCf = "movies_pre_order";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            default:
                strCf = a.cf(i, "movies_unknown");
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                strCf = "movies_search_results";
                break;
            case 32:
                strCf = "movies_pano_movies_bundle_details";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                strCf = "movies_choosies";
                break;
            case 34:
                strCf = "movies_choosies_promo_welcome";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                strCf = "movies_promo_notification";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                strCf = "movies_watch_now_collections";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                strCf = "movies_movie_details";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                strCf = "movies_show_details";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                strCf = "movies_playback_page";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                strCf = "movies_search_suggestion";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                strCf = "movies_guide_page";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                strCf = "movies_movies_bundle_details_page";
                break;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                strCf = "movies_cluster_page";
                break;
        }
        return TextUtils.isEmpty(str) ? strCf : a.cq(str, strCf, ":");
    }

    public static int z(Context context, mdy mdyVar, lid lidVar, lof lofVar) {
        String str;
        Uri uri = log.a;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        String str2 = "com.google.android.finsky";
        intent.setPackage("com.google.android.finsky");
        if (!ksk.n(context, intent)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            str2 = "com.android.vending";
            intent2.setPackage("com.android.vending");
            if (!ksk.n(context, intent2) && !ActivityManager.isRunningInTestHarness()) {
                str2 = null;
            }
        }
        if (str2 == null) {
            T(context, R.string.error_play_store_not_available);
            return 10;
        }
        Intent intent3 = new Intent("com.android.vending.billing.PURCHASE");
        intent3.addCategory("android.intent.category.DEFAULT");
        intent3.addFlags(524288);
        intent3.setPackage(str2);
        intent3.putExtra("authAccount", ksn.c(ieg.a(lofVar.h)));
        intent3.putExtra("backend", 4);
        intent3.putExtra("phonesky.backend", 4);
        int i = lofVar.g;
        intent3.putExtra("document_type", i);
        String str3 = lofVar.a;
        intent3.putExtra("backend_docid", str3);
        intent3.putExtra("videos:seasonid", lofVar.b);
        intent3.putExtra("videos:showid", lofVar.c);
        intent3.putExtra("referral_url", lofVar.i.buildUpon().appendQueryParameter("external_client_id", lidVar.d()).build().toString());
        intent3.putExtra("suppress_post_success_action", lofVar.j);
        if (i == 6) {
            str = "movie-";
        } else if (i == 19) {
            str = "tvseason-";
        } else {
            if (i != 20) {
                throw new InvalidParameterException("Invalid itemType:" + lofVar.g);
            }
            str = "tvepisode-";
        }
        intent3.putExtra("full_docid", str.concat(str3));
        int i2 = lofVar.d;
        if (i2 == 1) {
            intent3.putExtra("offer_type", 0);
            intent3.putExtra("offer_filter", "PURCHASE");
        } else if (i2 == 2) {
            intent3.putExtra("offer_type", 0);
            intent3.putExtra("offer_filter", "RENTAL");
        }
        try {
            mdyVar.b(intent3, 905);
            return -1;
        } catch (ActivityNotFoundException unused) {
            T(context, R.string.error_play_store_is_updating);
            return 11;
        }
    }
}
