package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaRoute2Info;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fus {
    public fus() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A(final defpackage.fwv r32, final defpackage.fxd r33, final defpackage.bkp r34, final defpackage.bkd r35, final defpackage.yjv r36, final defpackage.yjv r37, final defpackage.yjv r38, final defpackage.yjv r39, defpackage.bao r40, final int r41) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fus.A(fwv, fxd, bkp, bkd, yjv, yjv, yjv, yjv, bao, int):void");
    }

    public static void B(final fwv fwvVar, final String str, bkp bkpVar, bkd bkdVar, final yjv yjvVar, final yjv yjvVar2, yjv yjvVar3, yjv yjvVar4, final yjv yjvVar5, bao baoVar, final int i, final int i2) throws Resources.NotFoundException {
        fwv fwvVar2;
        int i3;
        yjv yjvVar6;
        yjv yjvVar7;
        int i4;
        yjv yjvVar8;
        bkd bkdVar2;
        yjv yjvVar9;
        bkp bkpVar2;
        bao baoVar2;
        final bkp bkpVar3;
        final bkd bkdVar3;
        final yjv yjvVar10;
        final yjv yjvVar11;
        bao baoVarD = baoVar.d(1840250294);
        if ((i & 6) == 0) {
            fwvVar2 = fwvVar;
            i3 = i | (true != baoVarD.H(fwvVar2) ? 2 : 4);
        } else {
            fwvVar2 = fwvVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(str) ? 16 : 32;
        }
        int i5 = i3 | 28032;
        if ((i & 196608) == 0) {
            yjvVar6 = yjvVar;
            i5 |= true != baoVarD.H(yjvVar6) ? 65536 : 131072;
        } else {
            yjvVar6 = yjvVar;
        }
        if ((i & 1572864) == 0) {
            yjvVar7 = yjvVar2;
            i5 |= true != baoVarD.H(yjvVar7) ? 524288 : 1048576;
        } else {
            yjvVar7 = yjvVar2;
        }
        if ((i & 12582912) == 0) {
            i5 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= 33554432;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != baoVarD.H(yjvVar5) ? 2 : 4);
        } else {
            i4 = i2;
        }
        int i6 = i5 | 805306368;
        if ((306783379 & i6) == 306783378 && (i4 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            bkdVar3 = bkdVar;
            yjvVar10 = yjvVar3;
            yjvVar11 = yjvVar4;
            baoVar2 = baoVarD;
        } else {
            int i7 = (-264241153) & i6;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkm bkmVar = bkp.g;
                yjvVar8 = yjvVar7;
                bkdVar2 = bkb.a;
                yjvVar9 = yjvVar6;
                bkpVar2 = bkmVar;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                bkdVar2 = bkdVar;
                yjvVar9 = yjvVar3;
                yjvVar8 = yjvVar4;
            }
            baoVarD.m();
            boolean z = (i6 & 57344) == 16384;
            boolean z2 = (i6 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            boolean z3 = (i4 & 14) == 4;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z | z2 | z3) || objT == ban.a) {
                fxe fxeVar = new fxe(fwvVar2.d(), str);
                yjvVar5.a(fxeVar);
                objT = fxeVar.c();
                basVar.ae(objT);
            }
            int i8 = i7 >> 3;
            baoVar2 = baoVarD;
            A(fwvVar2, (fxd) objT, bkpVar2, bkdVar2, yjvVar6, yjvVar7, yjvVar9, yjvVar8, baoVar2, (i6 & 8078) | (i8 & 57344) | (458752 & i8) | (i8 & 234881024));
            bkpVar3 = bkpVar2;
            bkdVar3 = bkdVar2;
            yjvVar10 = yjvVar9;
            yjvVar11 = yjvVar8;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: fyk
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    bao baoVar3 = (bao) obj;
                    ((Integer) obj2).intValue();
                    fwv fwvVar3 = fwvVar;
                    String str2 = str;
                    bkp bkpVar4 = bkpVar3;
                    bkd bkdVar4 = bkdVar3;
                    yjv yjvVar12 = yjvVar;
                    yjv yjvVar13 = yjvVar2;
                    yjv yjvVar14 = yjvVar10;
                    yjv yjvVar15 = yjvVar11;
                    int i9 = i;
                    fus.B(fwvVar3, str2, bkpVar4, bkdVar4, yjvVar12, yjvVar13, yjvVar14, yjvVar15, yjvVar5, baoVar3, bdi.n(i9 | 1), bdi.n(i2));
                    return ygi.a;
                }
            };
        }
    }

    public static fwv C(Context context) {
        context.getClass();
        fwv fwvVar = new fwv(context);
        fwvVar.d().d(new fya(fwvVar.d()));
        fwvVar.d().d(new fyc());
        fwvVar.d().d(new fyg());
        return fwvVar;
    }

    public static /* synthetic */ void D(fxe fxeVar, String str, List list, ykb ykbVar, int i) {
        if ((i & 2) != 0) {
            list = yhb.a;
        }
        fyd fydVar = new fyd((fyc) fxeVar.d.a(fyc.class), str, ykbVar);
        for (fse fseVar : list) {
            Object obj = fseVar.b;
            fydVar.b.put("type", fseVar.a);
        }
        fxeVar.e.add(fydVar.a());
    }

    public static void E(fwr fwrVar, bib bibVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(233973821);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(fwrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(bibVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bcm.j(new bcq[]{dxm.b(fwrVar), dxf.a.c(fwrVar), ghg.a.c(fwrVar)}, bga.k(1808964477, new ano(bibVar, fwrVar, yjzVar, 7, (char[]) null), baoVarD), baoVarD, 56);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(fwrVar, bibVar, yjzVar, i, 14, (byte[]) null);
        }
    }

    public static void F(bib bibVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(832919318);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(bibVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new fyh(0);
                basVar.ae(objT);
            }
            yjv yjvVar = (yjv) objT;
            dxd dxdVarA = dxm.a(baoVarD);
            if (dxdVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            int i4 = ylg.a;
            ykl yklVar = new ykl(fxw.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            dad.e(new ykl(fxw.class), yjvVar, linkedHashMap);
            fxw fxwVar = (fxw) dvz.f(dxdVarA.getViewModelStore(), dad.d(linkedHashMap), dxdVarA instanceof duz ? ((duz) dxdVarA).getDefaultViewModelCreationExtras() : dxh.a).b(yklVar);
            fxwVar.b = new dxc(bibVar);
            bibVar.c(fxwVar.a, yjzVar, baoVarD, ((i2 << 6) & 896) | (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(bibVar, yjzVar, i, 5);
        }
    }

    public static Set G(bdy bdyVar) {
        return (Set) bdyVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void H(defpackage.fyg r16, defpackage.bao r17, int r18) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fus.H(fyg, bao, int):void");
    }

    public static void I(List list, Collection collection, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1537894851);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(collection) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            boolean zBooleanValue = ((Boolean) baoVarD.f(cde.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                fwr fwrVar = (fwr) it.next();
                dve lifecycle = fwrVar.getLifecycle();
                boolean zG = baoVarD.G(zBooleanValue) | baoVarD.H(list) | baoVarD.H(fwrVar);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (zG || objT == ban.a) {
                    objT = new abi(fwrVar, zBooleanValue, list, 5);
                    basVar.ae(objT);
                }
                bbn.c(lifecycle, (yjv) objT, baoVarD);
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(list, collection, i, 4, null);
        }
    }

    public static boolean J(String str) {
        return str != null && str.length() > 0;
    }

    public static String K(Class cls) {
        cls.getClass();
        Map map = fxp.a;
        String strA = (String) map.get(cls);
        if (strA == null) {
            fxn fxnVar = (fxn) cls.getAnnotation(fxn.class);
            strA = fxnVar != null ? fxnVar.a() : null;
            if (!J(strA)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(String.valueOf(cls.getSimpleName())));
            }
            map.put(cls, strA);
        }
        strA.getClass();
        return strA;
    }

    public static String L(String str) {
        String strDecode = Uri.decode(str);
        strDecode.getClass();
        return strDecode;
    }

    public static Uri M(String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        return uri;
    }

    public static fxh N(yjv yjvVar) {
        fxi fxiVar = new fxi();
        yjvVar.a(fxiVar);
        fxg fxgVar = fxiVar.a;
        fxgVar.a = fxiVar.b;
        fxgVar.b = fxiVar.c;
        fxgVar.b(fxiVar.d, false, fxiVar.e);
        return fxgVar.a();
    }

    public static String O(cb cbVar, int i) throws Resources.NotFoundException {
        cbVar.getClass();
        return i <= 16777215 ? String.valueOf(i) : cbVar.w(i);
    }

    public static fwr P(cb cbVar, fxb fxbVar, Bundle bundle, dvd dvdVar, fww fwwVar, String str, Bundle bundle2) {
        dvdVar.getClass();
        return new fwr(cbVar, fxbVar, bundle, dvdVar, fwwVar, str, bundle2);
    }

    public static /* synthetic */ fwr Q(cb cbVar, fxb fxbVar, Bundle bundle, dvd dvdVar, fww fwwVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return P(cbVar, fxbVar, bundle, dvdVar, fwwVar, string, null);
    }

    public static List c(Map map, yjv yjvVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            fwq fwqVar = (fwq) entry.getValue();
            Boolean bool = fwqVar != null ? false : null;
            bool.getClass();
            bool.booleanValue();
            boolean z = fwqVar.b;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) yjvVar.a((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fug d(android.media.MediaRoute2Info r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fus.d(android.media.MediaRoute2Info):fug");
    }

    public static List e(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM31m = agx$$ExternalSyntheticApiModelOutline0.m31m(it.next());
            if (mediaRoute2InfoM31m != null) {
                arrayList.add(mediaRoute2InfoM31m.getId());
            }
        }
        return arrayList;
    }

    public static ymw f(fxd fxdVar) {
        return ykr.h(fxdVar, new cjp(20));
    }

    public static String g(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    public static ymw h(fxb fxbVar) {
        fxbVar.getClass();
        return ykr.h(fxbVar, new cjp(19));
    }

    public static fww i(dxc dxcVar) {
        dxa dxaVarF = dvz.f(dxcVar, fwx.a, dxh.a);
        int i = ylg.a;
        return (fww) dxaVarF.b(new ykl(fww.class));
    }

    public static void j(fug fugVar, List list) {
        if (fugVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        if (list.contains(fugVar)) {
            throw new IllegalArgumentException("route descriptor already added");
        }
        list.add(fugVar);
    }

    public static void k(String str, Bundle bundle) {
        bundle.putString("clientPackageName", str);
    }

    public static float l(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void m(ebz ebzVar) {
        ebzVar.f(-3.4028235E38f, Integer.MIN_VALUE);
        CharSequence charSequence = ebzVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                ebzVar.e(SpannableString.valueOf(charSequence));
            }
            CharSequence charSequence2 = ebzVar.a;
            charSequence2.getClass();
            n((Spannable) charSequence2, new efc(3));
        }
    }

    public static void n(Spannable spannable, tsv tsvVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (tsvVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(String str, Bitmap bitmap, Bundle bundle) {
        Integer num = (Integer) frt.a.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a Bitmap"));
        }
        bundle.putParcelable(str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(String str, long j, Bundle bundle) {
        Integer num = (Integer) frt.a.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a long"));
        }
        bundle.putLong(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(String str, fsm fsmVar, Bundle bundle) {
        Parcelable parcelable;
        Integer num = (Integer) frt.a.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a Rating"));
        }
        if (fsmVar.b != null) {
            parcelable = fsmVar.b;
        } else {
            if (fsmVar.i()) {
                int i = fsmVar.a;
                switch (i) {
                    case 1:
                        fsmVar.b = Rating.newHeartRating(fsmVar.h());
                        break;
                    case 2:
                        fsmVar.b = Rating.newThumbRating(fsmVar.j());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        fsmVar.b = Rating.newStarRating(i, fsmVar.b());
                        break;
                    case 6:
                        fsmVar.b = Rating.newPercentageRating(fsmVar.a());
                        break;
                    default:
                        parcelable = null;
                        break;
                }
            } else {
                fsmVar.b = Rating.newUnratedRating(fsmVar.a);
            }
            parcelable = fsmVar.b;
        }
        bundle.putParcelable(str, parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(String str, String str2, Bundle bundle) {
        Integer num = (Integer) frt.a.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a String"));
        }
        bundle.putCharSequence(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(String str, CharSequence charSequence, Bundle bundle) {
        Integer num = (Integer) frt.a.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a.cg(str, "The ", " key cannot be used to put a CharSequence"));
        }
        bundle.putCharSequence(str, charSequence);
    }

    public static Parcelable t(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static frh u(fre freVar) {
        return new frh(freVar.a());
    }

    public static boolean v(int i) {
        return Build.ID != null && Log.isLoggable("Paging", i);
    }

    public static boolean w(gcf gcfVar, gcf gcfVar2, fzx fzxVar) {
        fzxVar.getClass();
        if (gcfVar2 == null) {
            return true;
        }
        if ((gcfVar2 instanceof gce) && (gcfVar instanceof gcd)) {
            return true;
        }
        if ((gcfVar instanceof gce) && (gcfVar2 instanceof gcd)) {
            return false;
        }
        return (gcfVar.e == gcfVar2.e && gcfVar.f == gcfVar2.f && gcfVar2.a(fzxVar) <= gcfVar.a(fzxVar)) ? false : true;
    }

    public static void x(View view, fyy fyyVar) {
        view.setTag(com.google.android.videos.R.id.view_tree_navigation_event_dispatcher_owner, fyyVar);
    }

    public static fyv y(BackEvent backEvent) {
        return new fyv(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void z(boolean z, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1818896922);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            hp.e(z, yjzVar, baoVarD, i2 & R.styleable.AppCompatTheme_windowNoTitle);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new fyo(z, yjzVar, i, 0);
        }
    }

    public void a(String str, Bundle bundle) {
        throw null;
    }

    public void b(Bundle bundle) {
        throw null;
    }

    @Deprecated
    public void onRouteSelected(fuy fuyVar, fux fuxVar) {
    }

    @Deprecated
    public void onRouteUnselected(fuy fuyVar, fux fuxVar) {
    }

    public fus(byte[] bArr) {
    }

    public void onRouteSelected(fuy fuyVar, fux fuxVar, int i) {
        onRouteSelected(fuyVar, fuxVar);
    }

    public void onRouteUnselected(fuy fuyVar, fux fuxVar, int i) {
        onRouteUnselected(fuyVar, fuxVar);
    }

    public fus(char[] cArr) {
    }

    public void onRouteSelected(fuy fuyVar, fux fuxVar, int i, fux fuxVar2) {
        onRouteSelected(fuyVar, fuxVar, i);
    }

    public void onProviderAdded(fuy fuyVar, fuw fuwVar) {
    }

    public void onProviderChanged(fuy fuyVar, fuw fuwVar) {
    }

    public void onProviderRemoved(fuy fuyVar, fuw fuwVar) {
    }

    public void onRouteAdded(fuy fuyVar, fux fuxVar) {
    }

    public void onRouteChanged(fuy fuyVar, fux fuxVar) {
    }

    public void onRoutePresentationDisplayChanged(fuy fuyVar, fux fuxVar) {
    }

    public void onRouteRemoved(fuy fuyVar, fux fuxVar) {
    }

    public void onRouteVolumeChanged(fuy fuyVar, fux fuxVar) {
    }

    public void onRouterParamsChanged(fuy fuyVar, fvb fvbVar) {
    }

    public void onRouteConnected(fuy fuyVar, fux fuxVar, fux fuxVar2) {
    }

    public void onRouteDisconnected(fuy fuyVar, fux fuxVar, fux fuxVar2, int i) {
    }
}
