package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbk {
    public static final Collection a;

    static {
        kzm[] kzmVarArr = new kzm[3];
        vtw vtwVarM = kzm.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((kzm) vtwVarM.b).b = a.aG(3);
        kzmVarArr[0] = (kzm) vtwVarM.r();
        vtw vtwVarM2 = kzm.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ((kzm) vtwVarM2.b).b = a.aG(4);
        kzmVarArr[1] = (kzm) vtwVarM2.r();
        vtw vtwVarM3 = kzm.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ((kzm) vtwVarM3.b).b = a.aG(5);
        kzmVarArr[2] = (kzm) vtwVarM3.r();
        a = Arrays.asList(kzmVarArr);
    }

    public static kzp A(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? kzp.UNKNOWN_LANGUAGE_TYPE : kzp.DUBBED : kzp.ORIGINAL;
    }

    public static kzq B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? kzq.NARRATION : kzq.PRIMARY_DESCRIPTIVE : kzq.COMMENTARY : kzq.PRIMARY;
    }

    public static int C(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 2 : 5;
        }
        return 4;
    }

    public static Uri a(lcr lcrVar) {
        return Uri.parse(lcrVar.b);
    }

    public static ieg b(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int i = ((kzm) it.next()).b;
            int iAQ = a.aQ(i);
            int i2 = 2;
            if (iAQ == 0 || iAQ != 2) {
                int iAQ2 = a.aQ(i);
                if (iAQ2 == 0) {
                    iAQ2 = 1;
                }
                int i3 = iAQ2 - 2;
                if (i3 == 1) {
                    i2 = 1;
                } else if (i3 != 2) {
                    i2 = 3;
                    if (i3 != 3) {
                        i2 = 0;
                    }
                }
                arrayList.add(new kti(i2));
            }
        }
        return ieg.f(arrayList);
    }

    public static ksy c(lbo lboVar) {
        return ksy.i(lboVar.b);
    }

    public static ktz d(List list) {
        kvo[] kvoVarArr = new kvo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            lbt lbtVar = (lbt) list.get(i);
            kvm kvmVarE = e((xau) ksk.d(xau.b(lbtVar.k), xau.OFFER_UNKNOWN));
            kvn kvnVarF = f((xai) ksk.d(xai.b(lbtVar.l), xai.FORMAT_UNKNOWN));
            ieg iegVarA = ieg.a(xaw.b(lbtVar.f));
            kvl kvlVarA = kvo.a();
            kvlVarA.i(lbtVar.i);
            kvlVarA.c(lbtVar.j);
            kvlVarA.h(kvmVarE);
            kvlVarA.j(kvnVarF);
            kvlVarA.d(lbtVar.n);
            kvlVarA.e(lbtVar.o);
            kvlVarA.l(lbtVar.c);
            kvlVarA.n(lbtVar.d);
            kvlVarA.k(lbtVar.e);
            kvlVarA.m(iegVarA);
            kvlVarA.f(lbtVar.p);
            kvlVarA.g(lbtVar.m);
            kvlVarA.b(lbtVar.r);
            kvoVarArr[i] = kvlVarA.a();
        }
        return ktz.d(kvoVarArr);
    }

    public static kvm e(xau xauVar) {
        int iOrdinal = xauVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? kvm.TYPE_UNSPECIFIED : kvm.TYPE_FREE_WITH_ADS : kvm.TYPE_SUBSCRIPTION : kvm.TYPE_PURCHASE : kvm.TYPE_RENTAL;
    }

    public static kvn f(xai xaiVar) {
        int iOrdinal = xaiVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? kvn.QUALITY_UNSPECIFIED : kvn.QUALITY_3D : kvn.QUALITY_UHD1 : kvn.QUALITY_HD : kvn.QUALITY_SD;
    }

    public static kzk g(String str) {
        vtw vtwVarM = kzk.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((kzk) vtwVarM.b).b = str;
        return (kzk) vtwVarM.r();
    }

    public static kzv h(String str) {
        vtw vtwVarM = kzv.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((kzv) vtwVarM.b).b = str;
        return (kzv) vtwVarM.r();
    }

    public static lac i(List list) {
        String str = !list.isEmpty() ? ((xaj) list.get(0)).c : "";
        String str2 = list.isEmpty() ? "" : ((xaj) list.get(0)).b;
        vtw vtwVarM = lac.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        str.getClass();
        ((lac) vucVar).b = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        lac lacVar = (lac) vtwVarM.b;
        str2.getClass();
        lacVar.c = str2;
        return (lac) vtwVarM.r();
    }

    public static lar j(String str) {
        vtw vtwVarM = lar.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lar) vtwVarM.b).b = str;
        return (lar) vtwVarM.r();
    }

    public static law k(String str, lce lceVar) {
        vtw vtwVarM = law.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((law) vucVar).c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        law lawVar = (law) vtwVarM.b;
        lceVar.getClass();
        lawVar.d = lceVar;
        lawVar.b |= 1;
        return (law) vtwVarM.r();
    }

    public static lbo l(String str) {
        vtw vtwVarM = lbo.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbo) vtwVarM.b).b = str;
        return (lbo) vtwVarM.r();
    }

    public static lce m(String str, lch lchVar) {
        vtw vtwVarM = lce.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((lce) vucVar).c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        lce lceVar = (lce) vtwVarM.b;
        lchVar.getClass();
        lceVar.d = lchVar;
        lceVar.b |= 1;
        return (lce) vtwVarM.r();
    }

    public static lch n(String str) {
        vtw vtwVarM = lch.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lch) vtwVarM.b).b = str;
        return (lch) vtwVarM.r();
    }

    public static lcp o(String str) {
        vtw vtwVarM = lcp.a.m();
        krf.c(str);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lcp) vtwVarM.b).b = str;
        return (lcp) vtwVarM.r();
    }

    public static lcr p(Uri uri) {
        vtw vtwVarM = lcr.a.m();
        String string = uri.toString();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lcr lcrVar = (lcr) vtwVarM.b;
        string.getClass();
        lcrVar.b = string;
        return (lcr) vtwVarM.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.lcv q(java.util.List r9) {
        /*
            r0 = 1
            r1 = 2
            xbs r2 = defpackage.ktc.r(r9, r0, r1)
            r3 = 4
            xbs r9 = defpackage.ktc.r(r9, r1, r3)
            if (r9 != 0) goto L10
            lcu r0 = defpackage.lcu.TOMATOMETER_RATING_UNKNOWN
            goto L35
        L10:
            xbr r1 = r9.f
            if (r1 != 0) goto L16
            xbr r1 = defpackage.xbr.a
        L16:
            int r1 = r1.d
            int r1 = defpackage.a.aV(r1)
            if (r1 != 0) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            int r0 = r0 + (-1)
            r1 = 3
            if (r0 == r1) goto L33
            if (r0 == r3) goto L30
            r1 = 5
            if (r0 == r1) goto L2d
            lcu r0 = defpackage.lcu.TOMATOMETER_RATING_UNKNOWN
            goto L35
        L2d:
            lcu r0 = defpackage.lcu.TOMATOMETER_RATING_CERTIFIED_FRESH
            goto L35
        L30:
            lcu r0 = defpackage.lcu.TOMATOMETER_RATING_ROTTEN
            goto L35
        L33:
            lcu r0 = defpackage.lcu.TOMATOMETER_RATING_FRESH
        L35:
            if (r9 == 0) goto L51
            int r1 = r9.b
            r1 = r1 & 64
            if (r1 == 0) goto L51
            xbr r1 = r9.f
            if (r1 != 0) goto L43
            xbr r1 = defpackage.xbr.a
        L43:
            int r1 = r1.b
            r1 = r1 & r3
            if (r1 == 0) goto L51
            xbr r1 = r9.f
            if (r1 != 0) goto L4e
            xbr r1 = defpackage.xbr.a
        L4e:
            java.lang.String r1 = r1.c
            goto L53
        L51:
            java.lang.String r1 = ""
        L53:
            lcv r3 = defpackage.lcv.a
            vtw r3 = r3.m()
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 != 0) goto L5f
            r5 = r4
            goto L61
        L5f:
            float r5 = r2.d
        L61:
            vuc r6 = r3.b
            boolean r6 = r6.A()
            if (r6 != 0) goto L6c
            r3.u()
        L6c:
            vuc r6 = r3.b
            r7 = r6
            lcv r7 = (defpackage.lcv) r7
            r7.b = r5
            if (r2 != 0) goto L78
            r7 = 0
            goto L7a
        L78:
            long r7 = r2.e
        L7a:
            boolean r2 = r6.A()
            if (r2 != 0) goto L83
            r3.u()
        L83:
            vuc r2 = r3.b
            r5 = r2
            lcv r5 = (defpackage.lcv) r5
            r5.c = r7
            lcu r5 = defpackage.lcu.TOMATOMETER_RATING_UNKNOWN
            if (r0 == r5) goto L90
            float r4 = r9.d
        L90:
            boolean r9 = r2.A()
            if (r9 != 0) goto L99
            r3.u()
        L99:
            vuc r9 = r3.b
            r2 = r9
            lcv r2 = (defpackage.lcv) r2
            r2.d = r4
            boolean r9 = r9.A()
            if (r9 != 0) goto La9
            r3.u()
        La9:
            vuc r9 = r3.b
            lcv r9 = (defpackage.lcv) r9
            int r0 = r0.a()
            r9.e = r0
            vuc r9 = r3.b
            boolean r9 = r9.A()
            if (r9 != 0) goto Lbe
            r3.u()
        Lbe:
            vuc r9 = r3.b
            lcv r9 = (defpackage.lcv) r9
            r1.getClass()
            r9.f = r1
            vuc r9 = r3.r()
            lcv r9 = (defpackage.lcv) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbk.q(java.util.List):lcv");
    }

    static ImmutableList r(List list) {
        if (list.isEmpty()) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xaf xafVar = (xaf) it.next();
            int iAN = a.aN(xafVar.c);
            if (iAN == 0) {
                iAN = 1;
            }
            if (iAN == 11) {
                if ((xafVar.b & 8) != 0) {
                    xab xabVar = xafVar.e;
                    if (xabVar == null) {
                        xabVar = xab.a;
                    }
                    vtw vtwVarM = lav.a.m();
                    lar larVarJ = j(xabVar.b);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    lav lavVar = (lav) vtwVarM.b;
                    larVarJ.getClass();
                    lavVar.c = larVarJ;
                    lavVar.b = 1 | lavVar.b;
                    int iO = ktc.o(xabVar.c, 2);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).d = iO;
                    int iO2 = ktc.o(xabVar.c, 3);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).e = iO2;
                    int iO3 = ktc.o(xabVar.c, 4);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).f = iO3;
                    arrayList.add((lav) vtwVarM.r());
                }
            } else if (iAN == 13 && (xafVar.b & 32) != 0) {
                xab xabVar2 = xafVar.g;
                if (xabVar2 == null) {
                    xabVar2 = xab.a;
                }
                vun vunVar = xabVar2.c;
                vtw vtwVarM2 = lav.a.m();
                lar larVarJ2 = j(kuf.a.b);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                lav lavVar2 = (lav) vtwVarM2.b;
                larVarJ2.getClass();
                lavVar2.c = larVarJ2;
                lavVar2.b = 1 | lavVar2.b;
                int iO4 = ktc.o(vunVar, 2);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                ((lav) vtwVarM2.b).d = iO4;
                int iO5 = ktc.o(vunVar, 3);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                ((lav) vtwVarM2.b).e = iO5;
                int iO6 = ktc.o(vunVar, 4);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                ((lav) vtwVarM2.b).f = iO6;
                arrayList.add((lav) vtwVarM2.r());
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static Collection s(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xba xbaVar = (xba) it.next();
            vtw vtwVarM = kzr.a.m();
            String str = xbaVar.b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            str.getClass();
            ((kzr) vucVar).b = str;
            boolean z = xbaVar.d;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            ((kzr) vtwVarM.b).c = z;
            int iBm = a.bm(xbaVar.e);
            if (iBm == 0) {
                iBm = 1;
            }
            kzp kzpVarA = A(iBm);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            ((kzr) vtwVarM.b).e = kzpVarA.a();
            int iAR = a.aR(xbaVar.c);
            kzq kzqVarB = B(iAR != 0 ? iAR : 1);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            ((kzr) vtwVarM.b).d = kzqVarB.a();
            arrayList.add((kzr) vtwVarM.r());
        }
        return arrayList;
    }

    public static Collection t(xah xahVar) {
        if (xahVar.d.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(xahVar.d.size());
        for (xbc xbcVar : xahVar.d) {
            vtw vtwVarM = kzy.a.m();
            String str = xbcVar.b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            str.getClass();
            ((kzy) vucVar).b = str;
            int iAS = a.aS(xbcVar.c);
            if (iAS == 0) {
                iAS = 1;
            }
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            int iC = C(iAS);
            ((kzy) vtwVarM.b).c = a.aG(iC);
            arrayList.add((kzy) vtwVarM.r());
        }
        return arrayList;
    }

    public static Collection u(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xat xatVar = (xat) it.next();
            xai xaiVarB = xai.b(xatVar.f);
            if (xaiVarB == null) {
                xaiVarB = xai.FORMAT_UNKNOWN;
            }
            xai xaiVar = xai.FORMAT_UNKNOWN;
            if (xaiVarB != xaiVar) {
                vtw vtwVarM = lbt.a.m();
                long j = xatVar.c;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                ((lbt) vucVar).i = j;
                String str = xatVar.d;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                str.getClass();
                ((lbt) vucVar2).j = str;
                xau xauVarB = xau.b(xatVar.e);
                if (xauVarB == null) {
                    xauVarB = xau.OFFER_UNKNOWN;
                }
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                int i = xauVarB.f;
                vuc vucVar3 = vtwVarM.b;
                ((lbt) vucVar3).k = i;
                xai xaiVarB2 = xai.b(xatVar.f);
                if (xaiVarB2 != null) {
                    xaiVar = xaiVarB2;
                }
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                int i2 = xaiVar.f;
                vuc vucVar4 = vtwVarM.b;
                ((lbt) vucVar4).l = i2;
                String str2 = xatVar.g;
                if (!vucVar4.A()) {
                    vtwVarM.u();
                }
                vuc vucVar5 = vtwVarM.b;
                str2.getClass();
                ((lbt) vucVar5).n = str2;
                String str3 = xatVar.h;
                if (!vucVar5.A()) {
                    vtwVarM.u();
                }
                vuc vucVar6 = vtwVarM.b;
                str3.getClass();
                ((lbt) vucVar6).o = str3;
                int i3 = xatVar.i;
                if (!vucVar6.A()) {
                    vtwVarM.u();
                }
                vuc vucVar7 = vtwVarM.b;
                ((lbt) vucVar7).c = i3;
                int i4 = xatVar.j;
                if (!vucVar7.A()) {
                    vtwVarM.u();
                }
                vuc vucVar8 = vtwVarM.b;
                ((lbt) vucVar8).d = i4;
                long j2 = xatVar.k;
                if (!vucVar8.A()) {
                    vtwVarM.u();
                }
                vuc vucVar9 = vtwVarM.b;
                ((lbt) vucVar9).e = j2;
                xaw xawVarB = xaw.b(xatVar.l);
                if (xawVarB == null) {
                    xawVarB = xaw.POLICY_SINGLE_TIMER;
                }
                if (!vucVar9.A()) {
                    vtwVarM.u();
                }
                int i5 = xawVarB.d;
                vuc vucVar10 = vtwVarM.b;
                ((lbt) vucVar10).f = i5;
                boolean z = xatVar.m;
                if (!vucVar10.A()) {
                    vtwVarM.u();
                }
                vuc vucVar11 = vtwVarM.b;
                ((lbt) vucVar11).p = z;
                long j3 = xatVar.n;
                if (!vucVar11.A()) {
                    vtwVarM.u();
                }
                vuc vucVar12 = vtwVarM.b;
                ((lbt) vucVar12).g = j3;
                long j4 = xatVar.o;
                if (!vucVar12.A()) {
                    vtwVarM.u();
                }
                vuc vucVar13 = vtwVarM.b;
                ((lbt) vucVar13).h = j4;
                String str4 = xatVar.p;
                if (!vucVar13.A()) {
                    vtwVarM.u();
                }
                lbt lbtVar = (lbt) vtwVarM.b;
                str4.getClass();
                lbtVar.m = str4;
                arrayList.add((lbt) vtwVarM.r());
            }
        }
        return arrayList;
    }

    public static Collection v(xar xarVar) {
        int iBm;
        for (xam xamVar : xarVar.v) {
            int iBm2 = a.bm(xamVar.b);
            if ((iBm2 != 0 && iBm2 == 3) || ((iBm = a.bm(xamVar.b)) != 0 && iBm == 2)) {
                return a;
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        r0.add((defpackage.lcw) r1.r());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Collection w(java.util.List r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbk.w(java.util.List):java.util.Collection");
    }

    public static List x(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ksy.i(((lbo) it.next()).b));
        }
        return arrayList;
    }

    public static List y(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ksy.m(((lcp) it.next()).b));
        }
        return arrayList;
    }

    public static List z(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((laj) it.next()).b);
        }
        return arrayList;
    }
}
