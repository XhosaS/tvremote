package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ihz {
    public static List A(wnp wnpVar) {
        vun vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return yhb.a;
        }
        ArrayList<wpm> arrayList = new ArrayList();
        for (Object obj : vunVar) {
            if (((wpm) obj).c == 4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (wpm wpmVar : arrayList) {
            arrayList2.add((wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b);
        }
        List listA = yfm.A(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listA) {
            if (((wpc) obj2).c == 3) {
                arrayList3.add(obj2);
            }
        }
        return ac(arrayList3);
    }

    public static boolean B(wpm wpmVar) {
        vun vunVar = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b;
        vunVar.getClass();
        return !vunVar.isEmpty();
    }

    public static boolean C(wnp wnpVar) {
        vun vunVar;
        Object obj = null;
        if (wnpVar != null && (vunVar = wnpVar.c) != null) {
            Iterator<E> it = vunVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (J((wpm) next)) {
                    obj = next;
                    break;
                }
            }
            obj = (wpm) obj;
        }
        return obj != null;
    }

    public static boolean D(wnp wnpVar) {
        vun vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null || vunVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = vunVar.iterator();
        while (it.hasNext()) {
            if (((wpm) it.next()).c == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(wnp wnpVar) {
        String str = null;
        if (wnpVar != null) {
            wno wnoVar = wnpVar.b;
            if (wnoVar == null) {
                wnoVar = wno.a;
            }
            if (wnoVar != null) {
                str = wnoVar.b;
            }
        }
        return yks.e(str, "play-movies");
    }

    public static boolean F(wpc wpcVar) {
        return ((wpcVar.c == 2 ? (wpa) wpcVar.d : wpa.a).b & 1) != 0;
    }

    public static boolean G(wnp wnpVar) {
        vun<wpm> vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null || vunVar.isEmpty()) {
            return false;
        }
        for (wpm wpmVar : vunVar) {
            if (wpmVar != null) {
                vun<wnt> vunVar2 = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).c;
                vunVar2.getClass();
                if (vunVar2.isEmpty()) {
                    continue;
                } else {
                    for (wnt wntVar : vunVar2) {
                        if (wntVar.c == 2 && (((wnr) wntVar.d).b & 1) != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean H(wnp wnpVar) {
        vun<wpm> vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null || vunVar.isEmpty()) {
            return false;
        }
        for (wpm wpmVar : vunVar) {
            vun vunVar2 = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).c;
            vunVar2.getClass();
            if (!vunVar2.isEmpty()) {
                Iterator<E> it = vunVar2.iterator();
                while (it.hasNext()) {
                    if (((wnt) it.next()).c == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean I(wnp wnpVar) {
        vun<wpm> vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null || vunVar.isEmpty()) {
            return false;
        }
        for (wpm wpmVar : vunVar) {
            vun vunVar2 = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).c;
            vunVar2.getClass();
            if (!vunVar2.isEmpty()) {
                Iterator<E> it = vunVar2.iterator();
                while (it.hasNext()) {
                    if (((wnt) it.next()).c == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean J(wpm wpmVar) {
        int iAU;
        if (wpmVar == null) {
            return false;
        }
        wpl wplVar = wpmVar.g;
        if (wplVar == null) {
            wplVar = wpl.a;
        }
        if (wplVar == null) {
            return false;
        }
        wni wniVar = wplVar.c;
        if (wniVar == null) {
            wniVar = wni.a;
        }
        return (wniVar == null || (iAU = a.aU(wniVar.c)) == 0 || iAU != 4) ? false : true;
    }

    public static boolean K(wnp wnpVar) {
        vun<wpm> vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null || vunVar.isEmpty()) {
            return false;
        }
        for (wpm wpmVar : vunVar) {
            if ((wpmVar.c == 3 ? (won) wpmVar.d : won.a).b) {
                return true;
            }
        }
        return false;
    }

    public static bl L(View view) {
        bv bvVarM = M(view);
        if (bvVarM instanceof bl) {
            return (bl) bvVarM;
        }
        return null;
    }

    public static bv M(View view) {
        try {
            return cr.d(view);
        } catch (Exception unused) {
            return null;
        }
    }

    public static by N(View view) {
        view.getClass();
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof by) {
                return (by) context;
            }
        }
        return null;
    }

    public static yow O(View view) {
        dvk dvkVarE = dwf.e(view);
        if (dvkVarE != null) {
            return dvb.d(dvkVarE);
        }
        return null;
    }

    public static void P(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = i;
        view.requestLayout();
    }

    public static void Q(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, i, 0, 0);
        view.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String R(android.content.Context r7, long r8, long r10) {
        /*
            r7.getClass()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto Ld3
            long r0 = r8 - r10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r2.toDays(r0)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L1d
            r2 = -1
            goto L25
        L1d:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L25
            goto L26
        L25:
            r4 = r2
        L26:
            r2 = 60
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2e
            goto Ld3
        L2e:
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 < 0) goto L3d
            r8 = 2132017826(0x7f1402a2, float:1.9673941E38)
            java.lang.String r7 = r7.getString(r8)
            r7.getClass()
            return r7
        L3d:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r8
            long r0 = r0 / r2
            int r8 = (int) r0
            int r9 = r8 / 60
            r10 = 0
            r11 = 1
            if (r9 <= 0) goto L4a
            r0 = r10
            goto L4b
        L4a:
            r0 = r11
        L4b:
            int r1 = r8 % 60
            if (r1 > 0) goto L51
            r1 = r10
            goto L52
        L51:
            r1 = r11
        L52:
            r0 = r0 ^ r11
            r0 = r0 & r1
            int r9 = r9 + r0
            int r0 = r9 / 24
            if (r0 <= 0) goto L5b
            r1 = r10
            goto L5c
        L5b:
            r1 = r11
        L5c:
            int r2 = r9 % 24
            r1 = r1 ^ r11
            if (r2 > 0) goto L63
            r2 = r10
            goto L64
        L63:
            r2 = r11
        L64:
            r1 = r1 & r2
            int r0 = r0 + r1
            r1 = 2
            if (r0 <= r1) goto L86
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r9[r10] = r8
            r8 = 2132018768(0x7f140650, float:1.9675852E38)
            java.lang.String r8 = r7.getString(r8, r9)
            r8.getClass()
            r9 = 2132017543(0x7f140187, float:1.9673367E38)
            java.lang.String r7 = r7.getString(r9)
            r7.getClass()
            return r8
        L86:
            if (r9 <= 0) goto La5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r9[r10] = r8
            r8 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r8 = r7.getString(r8, r9)
            r8.getClass()
            r9 = 2132017938(0x7f140312, float:1.9674169E38)
            java.lang.String r7 = r7.getString(r9)
            r7.getClass()
            return r8
        La5:
            r9 = 10
            if (r8 <= r9) goto Lbe
            r8 = 2132018770(0x7f140652, float:1.9675856E38)
            java.lang.String r8 = r7.getString(r8)
            r8.getClass()
            r9 = 2132017970(0x7f140332, float:1.9674233E38)
            java.lang.String r7 = r7.getString(r9)
            r7.getClass()
            return r8
        Lbe:
            r8 = 2132018764(0x7f14064c, float:1.9675844E38)
            java.lang.String r8 = r7.getString(r8)
            r8.getClass()
            r9 = 2132017191(0x7f140027, float:1.9672653E38)
            java.lang.String r7 = r7.getString(r9)
            r7.getClass()
            return r8
        Ld3:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihz.R(android.content.Context, long, long):java.lang.String");
    }

    public static wls S(int i, Context context) {
        context.getClass();
        String string = context.getString(i);
        string.getClass();
        vtw vtwVarM = wls.a.m();
        vtwVarM.getClass();
        wbb.r(string, vtwVarM);
        return wbb.q(vtwVarM);
    }

    public static wls T(String str) {
        vtw vtwVarM = wls.a.m();
        vtwVarM.getClass();
        wbb.r(str, vtwVarM);
        return wbb.q(vtwVarM);
    }

    public static boolean U(wlx wlxVar) {
        if (yks.e(wlxVar, wlx.a)) {
            return true;
        }
        if (wlxVar.b == 1) {
            String str = ((wlu) wlxVar.c).b;
            str.getClass();
            if (ylh.L(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean V(wkg wkgVar) {
        return !W(wkgVar);
    }

    public static boolean W(wkg wkgVar) {
        return wkgVar == null || yks.e(wkgVar, wkg.a);
    }

    public static wni X(our ourVar) {
        vtw vtwVarM = wni.a.m();
        vtwVarM.getClass();
        wcq.M(ourVar.a, vtwVarM);
        int iOrdinal = ourVar.b.ordinal();
        wcq.N(iOrdinal != 1 ? iOrdinal != 4 ? iOrdinal != 5 ? 2 : 7 : 6 : 3, vtwVarM);
        return wcq.L(vtwVarM);
    }

    public static hfx Y(Object obj) {
        return new hfx(new iaq(obj, 0, false), (byte[]) null);
    }

    public static hfx Z(Object obj) {
        return new hfx(new iaq(obj, iaq.a, true), (byte[]) null);
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? "Network" : "Disk" : "InMemory";
    }

    public static hfx aa(hfx hfxVar) {
        return new hfx(new ivx(hfxVar, (irc) null));
    }

    public static hfx ab(yjz yjzVar) {
        return new hfx(new gxb(new gxb(yjzVar, 4), 5));
    }

    private static List ac(List list) {
        List listAg;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            wng wngVar = ((wpc) obj).g;
            if (wngVar == null) {
                wngVar = wng.a;
            }
            String str = wngVar.c;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(yfm.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).size() == 1) {
                listAg = (List) entry.getValue();
            } else {
                Iterator it = ((Iterable) entry.getValue()).iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    wng wngVar2 = ((wpc) next).g;
                    if (wngVar2 == null) {
                        wngVar2 = wng.a;
                    }
                    wpk wpkVarB = wpk.b(wngVar2.d);
                    if (wpkVarB == null) {
                        wpkVarB = wpk.UNRECOGNIZED;
                    }
                    do {
                        Object next2 = it.next();
                        wng wngVar3 = ((wpc) next2).g;
                        if (wngVar3 == null) {
                            wngVar3 = wng.a;
                        }
                        wpk wpkVarB2 = wpk.b(wngVar3.d);
                        if (wpkVarB2 == null) {
                            wpkVarB2 = wpk.UNRECOGNIZED;
                        }
                        int iCompareTo = wpkVarB.compareTo(wpkVarB2);
                        if (iCompareTo < 0) {
                            wpkVarB = wpkVarB2;
                        }
                        if (iCompareTo < 0) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                wpc wpcVar = (wpc) next;
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    wpc wpcVar2 = (wpc) obj2;
                    if (!(wpcVar2.c == 2 ? (wpa) wpcVar2.d : wpa.a).d) {
                        if ((wpcVar2.c == 3 ? (wpb) wpcVar2.d : wpb.a).b) {
                        }
                    }
                    arrayList2.add(obj2);
                }
                listAg = arrayList2.contains(wpcVar) ? arrayList2 : yfm.ag(arrayList2, wpcVar);
            }
            linkedHashMap2.put(key, listAg);
        }
        return yfm.A(linkedHashMap2.values());
    }

    public static wmd b(byte[] bArr) {
        bArr.getClass();
        try {
            vuc vucVarP = vuc.p(wmd.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (wmd) vucVarP;
        } catch (Exception unused) {
            krd.c("Failed to parse byteArray into MediaLibraryConfig proto");
            return null;
        }
    }

    public static String c(wll wllVar) {
        wllVar.getClass();
        String str = wllVar.b == 1 ? (String) wllVar.c : "";
        str.getClass();
        return str;
    }

    public static wll d(String str) {
        vtw vtwVarM = wll.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wll wllVar = (wll) vtwVarM.b;
        wllVar.b = 1;
        wllVar.c = str;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        return (wll) vucVarR;
    }

    public static wog e(int i) {
        wog wogVarB = wog.b(i);
        return wogVarB == null ? wog.THUMBS_NONE : wogVarB;
    }

    public static wkx f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            vuc vucVarP = vuc.p(wkx.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (wkx) vucVarP;
        } catch (Exception unused) {
            krd.c("Failed to parse byteArray into Component proto");
            return null;
        }
    }

    public static byte[] g(wkx wkxVar) {
        if (wkxVar != null) {
            return wkxVar.h();
        }
        return null;
    }

    public static byte[] h(ink inkVar) {
        inkVar.getClass();
        return inkVar.h();
    }

    public static ksy i(wpm wpmVar) {
        return hju.r(q(wpmVar));
    }

    public static wls j(wnp wnpVar) {
        wpc wpcVarR = r(wnpVar);
        if (wpcVarR != null) {
            wls wlsVar = wpcVarR.f;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (wlsVar != null) {
                return wlsVar;
            }
        }
        wpc wpcVar = (wpc) yfm.V(z(wnpVar), 0);
        if (wpcVar == null) {
            return null;
        }
        wls wlsVar2 = wpcVar.f;
        return wlsVar2 == null ? wls.a : wlsVar2;
    }

    public static wls k(wnp wnpVar) {
        wpc wpcVarR = r(wnpVar);
        if (wpcVarR != null) {
            wls wlsVar = wpcVarR.e;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (wlsVar != null) {
                return wlsVar;
            }
        }
        wpc wpcVar = (wpc) yfm.V(z(wnpVar), 0);
        if (wpcVar == null) {
            return null;
        }
        wls wlsVar2 = wpcVar.e;
        return wlsVar2 == null ? wls.a : wlsVar2;
    }

    public static wls l(wnp wnpVar) {
        wpc wpcVarS = s(wnpVar);
        if (wpcVarS != null) {
            wls wlsVar = wpcVarS.f;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (wlsVar != null) {
                return wlsVar;
            }
        }
        wpc wpcVar = (wpc) yfm.V(A(wnpVar), 0);
        if (wpcVar == null) {
            return null;
        }
        wls wlsVar2 = wpcVar.f;
        return wlsVar2 == null ? wls.a : wlsVar2;
    }

    public static wls m(wnp wnpVar) {
        wpc wpcVarS = s(wnpVar);
        if (wpcVarS != null) {
            wls wlsVar = wpcVarS.e;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (wlsVar != null) {
                return wlsVar;
            }
        }
        wpc wpcVar = (wpc) yfm.V(A(wnpVar), 0);
        if (wpcVar == null) {
            return null;
        }
        wls wlsVar2 = wpcVar.e;
        return wlsVar2 == null ? wls.a : wlsVar2;
    }

    public static wls n(wnp wnpVar) {
        if (wnpVar == null) {
            return null;
        }
        wno wnoVar = wnpVar.b;
        if (wnoVar == null) {
            wnoVar = wno.a;
        }
        if (wnoVar == null) {
            return null;
        }
        wls wlsVar = wnoVar.c;
        return wlsVar == null ? wls.a : wlsVar;
    }

    public static wni o(wnp wnpVar) {
        return (wni) yfm.U(x(wnpVar));
    }

    public static wni p(wnq wnqVar) {
        wnqVar.getClass();
        return (wni) yfm.U(y(wnqVar));
    }

    public static wni q(wpm wpmVar) {
        if (wpmVar == null) {
            return null;
        }
        wpl wplVar = wpmVar.g;
        if (wplVar == null) {
            wplVar = wpl.a;
        }
        if (wplVar == null) {
            return null;
        }
        wni wniVar = wplVar.c;
        return wniVar == null ? wni.a : wniVar;
    }

    public static wpc r(wnp wnpVar) {
        Object next;
        Iterator it = z(wnpVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wpc wpcVar = (wpc) next;
            if ((wpcVar.c == 2 ? (wpa) wpcVar.d : wpa.a).d) {
                break;
            }
        }
        return (wpc) next;
    }

    public static wpc s(wnp wnpVar) {
        Object next;
        Iterator it = A(wnpVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wpc wpcVar = (wpc) next;
            if ((wpcVar.c == 3 ? (wpb) wpcVar.d : wpb.a).b) {
                break;
            }
        }
        return (wpc) next;
    }

    public static wpm t(wnp wnpVar) {
        vun vunVar;
        Object obj = null;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return null;
        }
        Iterator<E> it = vunVar.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            wpm wpmVar = (wpm) next;
            vun<wpc> vunVar2 = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b;
            vunVar2.getClass();
            if (!vunVar2.isEmpty()) {
                for (wpc wpcVar : vunVar2) {
                    if ((wpcVar.c == 2 ? (wpa) wpcVar.d : wpa.a).d) {
                        obj = next;
                        break loop0;
                    }
                }
            }
        }
        return (wpm) obj;
    }

    public static wpm u(wnp wnpVar) {
        vun vunVar;
        Object obj = null;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return null;
        }
        Iterator<E> it = vunVar.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            wpm wpmVar = (wpm) next;
            vun<wpc> vunVar2 = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b;
            vunVar2.getClass();
            if (!vunVar2.isEmpty()) {
                for (wpc wpcVar : vunVar2) {
                    if ((wpcVar.c == 3 ? (wpb) wpcVar.d : wpb.a).b) {
                        obj = next;
                        break loop0;
                    }
                }
            }
        }
        return (wpm) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:1: B:16:0x0033->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wpm v(defpackage.wnp r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L55
            vun r6 = r6.c
            if (r6 == 0) goto L55
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r6.next()
            r2 = r1
            wpm r2 = (defpackage.wpm) r2
            int r3 = r2.c
            r4 = 4
            if (r3 != r4) goto L22
            java.lang.Object r2 = r2.d
            woz r2 = (defpackage.woz) r2
            goto L24
        L22:
            woz r2 = defpackage.woz.a
        L24:
            vun r2 = r2.c
            r2.getClass()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lb
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            wnt r3 = (defpackage.wnt) r3
            int r4 = r3.c
            r5 = 2
            if (r4 != r5) goto L4f
            java.lang.Object r3 = r3.d
            wnr r3 = (defpackage.wnr) r3
            int r3 = r3.b
            r3 = r3 & 1
            if (r3 == 0) goto L52
            r4 = r5
        L4f:
            r3 = 3
            if (r4 != r3) goto L33
        L52:
            r0 = r1
        L53:
            wpm r0 = (defpackage.wpm) r0
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihz.v(wnp):wpm");
    }

    public static wpm w(wnp wnpVar) {
        vun vunVar;
        Object obj = null;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return null;
        }
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (J((wpm) next)) {
                obj = next;
                break;
            }
        }
        return (wpm) obj;
    }

    public static List x(wnp wnpVar) {
        vun vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return yhb.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : vunVar) {
            if ((((wpm) obj).b & 4) != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wpl wplVar = ((wpm) it.next()).g;
            if (wplVar == null) {
                wplVar = wpl.a;
            }
            wni wniVar = wplVar.c;
            if (wniVar == null) {
                wniVar = wni.a;
            }
            arrayList2.add(wniVar);
        }
        return yfm.ab(arrayList2);
    }

    public static List y(wnq wnqVar) {
        wnqVar.getClass();
        vun vunVar = wnqVar.b;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = vunVar.iterator();
        while (it.hasNext()) {
            yfm.I(arrayList, x((wnp) it.next()));
        }
        return yfm.ab(arrayList);
    }

    public static List z(wnp wnpVar) {
        vun vunVar;
        if (wnpVar == null || (vunVar = wnpVar.c) == null) {
            return yhb.a;
        }
        ArrayList<wpm> arrayList = new ArrayList();
        for (Object obj : vunVar) {
            if (((wpm) obj).c == 4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (wpm wpmVar : arrayList) {
            arrayList2.add((wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b);
        }
        List listA = yfm.A(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listA) {
            if (((wpc) obj2).c == 2) {
                arrayList3.add(obj2);
            }
        }
        return ac(arrayList3);
    }
}
