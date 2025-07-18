package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzj implements idf {
    private final /* synthetic */ int l;
    public static final kzj k = new kzj(19);
    public static final kzj j = new kzj(16);
    public static final kzj i = new kzj(15);
    public static final idf g = new kzj(9);
    public static final idf f = new kzj(8);
    public static final idf e = new kzj(7);
    public static final idf d = new kzj(4);
    public static final kzj h = new kzj(3);
    public static final idf c = new kzj(2);
    public static final idf b = new kzj(1);
    public static final idf a = new kzj(0);

    public kzj(int i2) {
        this.l = i2;
    }

    private static long a(File file, Set set) {
        if (!file.isDirectory()) {
            return file.length();
        }
        long jA = 0;
        for (File file2 : file.listFiles()) {
            if (set.add(file2.getCanonicalPath())) {
                jA += a(file2, set);
            }
        }
        return jA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ieg iegVarF;
        int i2;
        int i3;
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        switch (this.l) {
            case 0:
                kzi kziVar = (kzi) obj;
                kzk kzkVar = kziVar.c;
                if (kzkVar == null) {
                    kzkVar = kzk.a;
                }
                String str = kzkVar.b;
                ksr ksrVar = ksr.a;
                ktg ktgVar = new ktg(str);
                String str2 = kziVar.d;
                lcr lcrVar = kziVar.e;
                if (lcrVar == null) {
                    lcrVar = lcr.a;
                }
                return new ksq(ktgVar, str2, lbk.a(lcrVar));
            case 1:
                List<xat> list = (List) obj;
                if (list.isEmpty()) {
                    return ktz.a;
                }
                Iterator it = list.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    xai xaiVarB = xai.b(((xat) it.next()).f);
                    if (xaiVarB == null) {
                        xaiVarB = xai.FORMAT_UNKNOWN;
                    }
                    if (xaiVarB != xai.FORMAT_UNKNOWN) {
                        i7++;
                    }
                }
                kvo[] kvoVarArr = new kvo[i7];
                for (xat xatVar : list) {
                    xai xaiVarB2 = xai.b(xatVar.f);
                    if (xaiVarB2 == null) {
                        xaiVarB2 = xai.FORMAT_UNKNOWN;
                    }
                    xai xaiVar = xai.FORMAT_UNKNOWN;
                    if (xaiVarB2 != xaiVar) {
                        if ((xatVar.b & 512) != 0) {
                            xaw xawVarB = xaw.b(xatVar.l);
                            if (xawVarB == null) {
                                xawVarB = xaw.POLICY_SINGLE_TIMER;
                            }
                            iegVarF = ieg.f(xawVarB);
                        } else {
                            iegVarF = ieg.a;
                        }
                        int i8 = i5 + 1;
                        kvl kvlVarA = kvo.a();
                        kvlVarA.i(xatVar.c);
                        kvlVarA.c(xatVar.d);
                        xau xauVarB = xau.b(xatVar.e);
                        if (xauVarB == null) {
                            xauVarB = xau.OFFER_UNKNOWN;
                        }
                        kvlVarA.h(lbk.e(xauVarB));
                        xai xaiVarB3 = xai.b(xatVar.f);
                        if (xaiVarB3 != null) {
                            xaiVar = xaiVarB3;
                        }
                        kvlVarA.j(lbk.f(xaiVar));
                        kvlVarA.d(xatVar.g);
                        kvlVarA.e(xatVar.h);
                        kvlVarA.l(xatVar.i);
                        kvlVarA.n(xatVar.j);
                        kvlVarA.k(xatVar.k);
                        kvlVarA.m(iegVarF);
                        kvlVarA.f(xatVar.m);
                        kvlVarA.g(xatVar.p);
                        kvoVarArr[i5] = kvlVarA.a();
                        i5 = i8;
                    }
                }
                return ktz.d(kvoVarArr);
            case 2:
                laq laqVar = (laq) obj;
                lar larVar = laqVar.c;
                if (larVar == null) {
                    larVar = lar.a;
                }
                String str3 = larVar.b;
                kuf kufVar = kuf.a;
                ktn ktnVar = new ktn(str3);
                String str4 = laqVar.d;
                lcr lcrVar2 = laqVar.e;
                if (lcrVar2 == null) {
                    lcrVar2 = lcr.a;
                }
                Uri uriA = lbk.a(lcrVar2);
                lcr lcrVar3 = laqVar.f;
                if (lcrVar3 == null) {
                    lcrVar3 = lcr.a;
                }
                Uri uriA2 = lbk.a(lcrVar3);
                Float fValueOf = Float.valueOf(laqVar.g);
                vun vunVar = laqVar.h;
                ArrayList arrayList = new ArrayList();
                Iterator<E> it2 = vunVar.iterator();
                while (it2.hasNext()) {
                    String str5 = ((kzk) it2.next()).b;
                    ksr ksrVar2 = ksr.a;
                    arrayList.add(new ktg(str5));
                }
                int iBb = a.bb(laqVar.j);
                if (iBb == 0) {
                    iBb = 1;
                }
                switch (iBb - 2) {
                    case -1:
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = i4;
                        break;
                    case 4:
                        i4 = 4;
                        i2 = i4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i4 = 6;
                        i2 = i4;
                        break;
                }
                vun vunVar2 = laqVar.k;
                ArrayList arrayList2 = new ArrayList();
                while (i5 < vunVar2.size()) {
                    lbt lbtVar = (lbt) vunVar2.get(i5);
                    int iAK = a.aK(lbtVar.k);
                    if (iAK != 0 && iAK == 5) {
                        lcm lcmVar = lbtVar.q;
                        if (lcmVar == null) {
                            lcmVar = lcm.a;
                        }
                        int iAO = a.aO(lcmVar.b);
                        if (iAO == 0) {
                            iAO = i6;
                        }
                        lcm lcmVar2 = lbtVar.q;
                        if (lcmVar2 == null) {
                            lcmVar2 = lcm.a;
                        }
                        ktv ktvVar = new ktv(iAO, lcmVar2.c);
                        kvl kvlVarA2 = kvo.a();
                        i3 = i5;
                        kvlVarA2.i(lbtVar.i);
                        kvlVarA2.c(lbtVar.j);
                        kvlVarA2.h(kvm.TYPE_SUBSCRIPTION);
                        kvlVarA2.d(lbtVar.n);
                        kvlVarA2.e(lbtVar.o);
                        kvlVarA2.g(lbtVar.m);
                        kvlVarA2.o(ieg.f(ktvVar));
                        arrayList2.add(kvlVarA2.a());
                    } else {
                        i3 = i5;
                    }
                    i5 = i3 + 1;
                    i6 = 1;
                }
                return new kue(ktnVar, str4, uriA, uriA2, fValueOf, arrayList, i2, arrayList2);
            case 3:
                lau lauVar = (lau) obj;
                law lawVar = lauVar.c;
                if (lawVar == null) {
                    lawVar = law.a;
                }
                String str6 = lawVar.c;
                law lawVar2 = lauVar.c;
                if (lawVar2 == null) {
                    lawVar2 = law.a;
                }
                lce lceVar = lawVar2.d;
                if (lceVar == null) {
                    lceVar = lce.a;
                }
                String str7 = lceVar.c;
                law lawVar3 = lauVar.c;
                if (lawVar3 == null) {
                    lawVar3 = law.a;
                }
                lce lceVar2 = lawVar3.d;
                if (lceVar2 == null) {
                    lceVar2 = lce.a;
                }
                lch lchVar = lceVar2.d;
                if (lchVar == null) {
                    lchVar = lch.a;
                }
                kun kunVarC = kuo.c(str6, str7, lchVar.b);
                kunVarC.u(lauVar.d);
                kunVarC.q(lauVar.j);
                kunVarC.g(lauVar.h);
                kunVarC.t(lauVar.i);
                lcr lcrVar4 = lauVar.e;
                if (lcrVar4 == null) {
                    lcrVar4 = lcr.a;
                }
                kunVarC.j(lbk.a(lcrVar4));
                lcr lcrVar5 = lauVar.f;
                if (lcrVar5 == null) {
                    lcrVar5 = lcr.a;
                }
                kunVarC.r(lbk.a(lcrVar5));
                lcr lcrVar6 = lauVar.g;
                if (lcrVar6 == null) {
                    lcrVar6 = lcr.a;
                }
                kunVarC.m(lbk.a(lcrVar6));
                kunVarC.s(lauVar.m);
                kunVarC.i(ieg.f(lbk.d(lauVar.k)));
                kunVarC.o(lauVar.l);
                kunVarC.n(lauVar.n);
                kunVarC.l(lauVar.o);
                lac lacVar = lauVar.p;
                if (lacVar == null) {
                    lacVar = lac.a;
                }
                kunVarC.k(lacVar.b);
                lac lacVar2 = lauVar.p;
                if (lacVar2 == null) {
                    lacVar2 = lac.a;
                }
                kunVarC.e(lacVar2.c);
                kunVarC.f(lauVar.q);
                kunVarC.c(lauVar.r);
                kunVarC.b(kzs.a.b(lauVar.s));
                kunVarC.d(kzz.a.b(lauVar.t));
                kunVarC.p(ksh.c(lauVar.u));
                kunVarC.h(lauVar.v);
                kunVarC.v((List) lcx.a.b(lauVar.w));
                return kunVarC.a();
            case 4:
                lbr lbrVar = (lbr) obj;
                lcv lcvVar = lbrVar.h;
                if (lcvVar == null) {
                    lcvVar = lcv.a;
                }
                kzv kzvVar = lbrVar.c;
                if (kzvVar == null) {
                    kzvVar = kzv.a;
                }
                String str8 = kzvVar.b;
                String str9 = lbrVar.d;
                lcr lcrVar7 = lbrVar.e;
                if (lcrVar7 == null) {
                    lcrVar7 = lcr.a;
                }
                Uri uriA3 = lbk.a(lcrVar7);
                lcr lcrVar8 = lbrVar.f;
                if (lcrVar8 == null) {
                    lcrVar8 = lcr.a;
                }
                Uri uriA4 = lbk.a(lcrVar8);
                float f2 = lcvVar.b;
                float f3 = lcvVar.d;
                lcu lcuVarB = lcu.b(lcvVar.e);
                if (lcuVarB == null) {
                    lcuVarB = lcu.UNRECOGNIZED;
                }
                lcu lcuVar = lcuVarB;
                String str10 = lcvVar.f;
                ieg iegVarF2 = ieg.f(lbk.d(lbrVar.j));
                String str11 = lbrVar.g;
                int i9 = lbrVar.l;
                vun vunVar3 = lbrVar.w;
                lac lacVar3 = lbrVar.i;
                if (lacVar3 == null) {
                    lacVar3 = lac.a;
                }
                String str12 = lacVar3.b;
                lac lacVar4 = lbrVar.i;
                if (lacVar4 == null) {
                    lacVar4 = lac.a;
                }
                return kvj.c(str8, str9, uriA3, uriA4, f2, f3, lcuVar, str10, iegVarF2, str11, i9, vunVar3, str12, lacVar4.c, lbrVar.m, lbk.x(lbrVar.v), lbk.y(lbrVar.k), kzs.a.b(lbrVar.o), kzz.a.b(lbrVar.p), lbrVar.n, ksh.c(lbrVar.q), lbrVar.r, lbrVar.s, lbrVar.t, lbrVar.x, ieg.a, lbk.b(lbrVar.u));
            case 5:
                lar larVar2 = ((lbp) obj).c;
                if (larVar2 == null) {
                    larVar2 = lar.a;
                }
                String str13 = larVar2.b;
                kuf kufVar2 = kuf.a;
                return new kvh(new ktn(str13));
            case 6:
                lci lciVar = (lci) obj;
                law lawVar4 = lciVar.c;
                if (lawVar4 == null) {
                    lawVar4 = law.a;
                }
                lce lceVar3 = lawVar4.d;
                if (lceVar3 == null) {
                    lceVar3 = lce.a;
                }
                ksy ksyVarK = ksy.k(lceVar3.c);
                law lawVar5 = lciVar.c;
                if (lawVar5 == null) {
                    lawVar5 = law.a;
                }
                ksy ksyVarH = ksy.h(lawVar5.c);
                lar larVar3 = lciVar.d;
                if (larVar3 == null) {
                    larVar3 = lar.a;
                }
                String str14 = larVar3.b;
                kuf kufVar3 = kuf.a;
                ktn ktnVar2 = new ktn(str14);
                a.ab(ksy.x(ksyVarK));
                a.ab(ksy.t(ksyVarH));
                return new kwq(ksyVarK, ksyVarH, ktnVar2);
            case 7:
                lcd lcdVar = (lcd) obj;
                List listI = kaf.i(lcdVar.n);
                lce lceVar4 = lcdVar.c;
                if (lceVar4 == null) {
                    lceVar4 = lce.a;
                }
                ksy ksyVarK2 = ksy.k(lceVar4.c);
                lce lceVar5 = lcdVar.c;
                if (lceVar5 == null) {
                    lceVar5 = lce.a;
                }
                lch lchVar2 = lceVar5.d;
                if (lchVar2 == null) {
                    lchVar2 = lch.a;
                }
                kwk kwkVarC = kwl.c(ksyVarK2, ksy.l(lchVar2.b));
                kwkVarC.k(lcdVar.d);
                kwkVarC.j(lcdVar.e);
                lcr lcrVar9 = lcdVar.f;
                if (lcrVar9 == null) {
                    lcrVar9 = lcr.a;
                }
                kwkVarC.f(lbk.a(lcrVar9));
                lcr lcrVar10 = lcdVar.g;
                if (lcrVar10 == null) {
                    lcrVar10 = lcr.a;
                }
                kwkVarC.i(lbk.a(lcrVar10));
                kwkVarC.h(lcdVar.h);
                kwkVarC.e(ieg.f(lbk.d(lcdVar.k)));
                vun vunVar4 = lcdVar.i;
                ArrayList arrayList3 = new ArrayList(vunVar4.size());
                Iterator<E> it3 = vunVar4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(ksy.h(((law) it3.next()).c));
                }
                kwkVarC.c(ImmutableList.copyOf((Collection) arrayList3));
                kwkVarC.g(ksh.c(lcdVar.l));
                kwkVarC.d(lcdVar.m);
                kwkVarC.b(listI);
                return kwkVarC.a();
            case 8:
                lcg lcgVar = (lcg) obj;
                lch lchVar3 = lcgVar.c;
                if (lchVar3 == null) {
                    lchVar3 = lch.a;
                }
                Collection collection = lbk.a;
                ksy ksyVarL = ksy.l(lchVar3.b);
                lcv lcvVar2 = lcgVar.g;
                if (lcvVar2 == null) {
                    lcvVar2 = lcv.a;
                }
                lac lacVar5 = lcgVar.i;
                if (lacVar5 == null) {
                    lacVar5 = lac.a;
                }
                float f4 = lcgVar.p;
                lcr lcrVar11 = lcgVar.e;
                if (lcrVar11 == null) {
                    lcrVar11 = lcr.a;
                }
                kux kuxVarA = kux.a(lbk.a(lcrVar11), f4);
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator<E> it4 = lcgVar.n.iterator();
                while (it4.hasNext()) {
                    builder.add((ImmutableList.Builder) ksy.k(((lce) it4.next()).c));
                }
                kwm kwmVarC = kwn.c(ksyVarL);
                kwmVarC.r(lcgVar.d);
                kwmVarC.m(kuxVarA.a);
                kwmVarC.l(kuxVarA.b);
                lcr lcrVar12 = lcgVar.f;
                if (lcrVar12 == null) {
                    lcrVar12 = lcr.a;
                }
                kwmVarC.c(lbk.a(lcrVar12));
                kwmVarC.q(lcvVar2.b);
                kwmVarC.i(lcvVar2.d);
                lcu lcuVarB2 = lcu.b(lcvVar2.e);
                if (lcuVarB2 == null) {
                    lcuVarB2 = lcu.UNRECOGNIZED;
                }
                kwmVarC.s(lcuVarB2);
                kwmVarC.t(lcvVar2.f);
                kwmVarC.f(lcgVar.h);
                kwmVarC.n(lacVar5.b);
                kwmVarC.e(lacVar5.c);
                kwmVarC.k(lcgVar.j);
                kwmVarC.j(lcgVar.k);
                kwmVarC.o(lcgVar.l);
                kwmVarC.d(lcgVar.m);
                kwmVarC.h(kaf.i(lcgVar.o));
                kwmVarC.b(lbk.b(lcgVar.q));
                kwmVarC.p(builder.build());
                return kwmVarC.a();
            case 9:
                List<xbt> list2 = (List) obj;
                if (list2.isEmpty()) {
                    return ImmutableList.of();
                }
                ArrayList arrayList4 = new ArrayList(list2.size());
                for (xbt xbtVar : list2) {
                    xaz xazVar = xbtVar.c;
                    if (xazVar == null) {
                        xazVar = xaz.a;
                    }
                    if (!xazVar.c.isEmpty()) {
                        xaz xazVar2 = xbtVar.d;
                        if (xazVar2 == null) {
                            xazVar2 = xaz.a;
                        }
                        if (!xazVar2.c.isEmpty() && !xbtVar.e.isEmpty()) {
                            int iAS = a.aS(xbtVar.f);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            int i10 = iAS - 1;
                            int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 3 : 2 : 1;
                            xaz xazVar3 = xbtVar.d;
                            if (xazVar3 == null) {
                                xazVar3 = xaz.a;
                            }
                            xaz xazVar4 = xbtVar.c;
                            if (xazVar4 == null) {
                                xazVar4 = xaz.a;
                            }
                            String str15 = xazVar4.c;
                            kuf kufVar4 = kuf.a;
                            ktn ktnVar3 = new ktn(str15);
                            String str16 = xazVar3.c;
                            ksr ksrVar3 = ksr.a;
                            ktg ktgVar2 = new ktg(str16);
                            Uri uri = Uri.parse(xbtVar.e);
                            long j2 = xbtVar.g;
                            if (j2 <= 0) {
                                j2 = Long.MAX_VALUE;
                            }
                            kxg kxgVarA = kxg.a(ktnVar3, ktgVar2, uri, i11, j2);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList4.size()) {
                                    kxg kxgVar = (kxg) arrayList4.get(i12);
                                    if (!kxgVarA.c.equals(kxgVar.c)) {
                                        i12++;
                                    } else if (kxgVarA.g > kxgVar.g) {
                                        arrayList4.set(i12, kxgVarA);
                                    }
                                } else {
                                    arrayList4.add(kxgVarA);
                                }
                            }
                        }
                    }
                }
                return ImmutableList.copyOf((Collection) arrayList4);
            case 10:
                return ((kum) obj).dX();
            case 11:
                return ((mfq) obj).b.c(lej.a);
            case 12:
                return ieg.f(new mee((byte[]) obj));
            case 13:
                return mfp.a(((Uri) obj).toString());
            case 14:
                try {
                    return ieg.f(Long.valueOf(a((File) obj, new HashSet())));
                } catch (IOException | RuntimeException e2) {
                    return ieg.b(e2);
                }
            case 15:
                return mfp.a(((kwx) obj).url());
            case 16:
                return Uri.parse((String) ((tju) obj).g);
            case 17:
                lwy lwyVar = (lwy) obj;
                mfp mfpVarA = mfp.a(lwyVar.a);
                String str17 = lwyVar.b;
                if (!TextUtils.isEmpty(str17)) {
                    mfpVarA.b("If-Modified-Since", str17);
                }
                return mfpVarA;
            case 18:
                mfq mfqVar = (mfq) obj;
                if (mfqVar.a == 404) {
                    return ieg.f(new lxa(true, null, null, null));
                }
                if (!mfqVar.c()) {
                    return mfqVar.a();
                }
                try {
                    return ieg.f(new lxa(false, (String) mfqVar.b("Last-Modified").c, (String) mfqVar.b("Content-Language").c, (byte[]) mfqVar.b.g()));
                } catch (ide e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    return ieg.b(e);
                }
            case 19:
                xaz xazVar5 = ((xax) obj).c;
                if (xazVar5 == null) {
                    xazVar5 = xaz.a;
                }
                if ((xazVar5.b & 8) == 0) {
                    return ieg.a;
                }
                xay xayVarB = xay.b(xazVar5.f);
                if (xayVarB == null) {
                    xayVarB = xay.ANDROID_APP;
                }
                return ktc.b(xayVarB);
            default:
                lxo lxoVar = (lxo) obj;
                return lxoVar.a() + "/" + ksh.d(lxoVar.c) + "/" + lxoVar.d + "/" + String.valueOf(lxoVar.e);
        }
    }
}
