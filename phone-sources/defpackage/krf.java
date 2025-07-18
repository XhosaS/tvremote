package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Parcel;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krf {
    private krf() {
    }

    public static boolean A(int i) {
        return i + (-2) == 6;
    }

    public static ImmutableList B(vam vamVar) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator<E> it = vamVar.c.iterator();
        while (it.hasNext()) {
            builder.addAll((Iterable) ((vdv) it.next()).d);
        }
        return FluentIterable.from(builder.build()).transform(new lsn()).toList();
    }

    public static ImmutableList C(List list) {
        return FluentIterable.from(list).filter(new lsp(1)).transform(new tsl() { // from class: lso
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                long j;
                vdv vdvVar = (vdv) obj;
                vtw vtwVarM = lcw.a.m();
                vdw vdwVar = vdvVar.b;
                if (vdwVar == null) {
                    vdwVar = vdw.a;
                }
                vsz vszVar = vdwVar.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcw lcwVar = (lcw) vtwVarM.b;
                vszVar.getClass();
                lcwVar.c = vszVar;
                vtw vtwVarM2 = lcr.a.m();
                vdu vduVar = vdvVar.e;
                if (vduVar == null) {
                    vduVar = vdu.a;
                }
                String str = vduVar.c;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                lcr lcrVar = (lcr) vtwVarM2.b;
                str.getClass();
                lcrVar.b = str;
                lcr lcrVar2 = (lcr) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcw lcwVar2 = (lcw) vtwVarM.b;
                lcrVar2.getClass();
                lcwVar2.f = lcrVar2;
                int i = 4;
                lcwVar2.b |= 4;
                vwe vweVar = vdvVar.g;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                if (vweVar.b > 0) {
                    vwe vweVar2 = vdvVar.g;
                    if (vweVar2 == null) {
                        vweVar2 = vwe.a;
                    }
                    j = vweVar2.b;
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ((lcw) vtwVarM.b).h = j;
                vtw vtwVarM3 = lar.a.m();
                val valVar = vdvVar.c;
                if (valVar == null) {
                    valVar = val.a;
                }
                String str2 = valVar.c;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                lar larVar = (lar) vtwVarM3.b;
                str2.getClass();
                larVar.b = str2;
                lar larVar2 = (lar) vtwVarM3.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                lcw lcwVar3 = (lcw) vucVar;
                larVar2.getClass();
                lcwVar3.d = larVar2;
                lcwVar3.b |= 1;
                int iAQ = a.aQ(vdvVar.f);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i2 = iAQ - 2;
                if (i2 == 1) {
                    i = 3;
                } else if (i2 != 2) {
                    i = i2 != 3 ? 2 : 5;
                }
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((lcw) vtwVarM.b).g = a.aG(i);
                vtw vtwVarM4 = kzk.a.m();
                vdu vduVar2 = vdvVar.e;
                if (vduVar2 == null) {
                    vduVar2 = vdu.a;
                }
                val valVar2 = vduVar2.b;
                if (valVar2 == null) {
                    valVar2 = val.a;
                }
                String str3 = valVar2.c;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                kzk kzkVar = (kzk) vtwVarM4.b;
                str3.getClass();
                kzkVar.b = str3;
                kzk kzkVar2 = (kzk) vtwVarM4.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcw lcwVar4 = (lcw) vtwVarM.b;
                kzkVar2.getClass();
                lcwVar4.e = kzkVar2;
                lcwVar4.b |= 2;
                return (lcw) vtwVarM.r();
            }
        }).toList();
    }

    public static lav D(vao vaoVar, String str) {
        vtw vtwVarM = lav.a.m();
        vtw vtwVarM2 = lar.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        lar larVar = (lar) vtwVarM2.b;
        str.getClass();
        larVar.b = str;
        lar larVar2 = (lar) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lav lavVar = (lav) vtwVarM.b;
        larVar2.getClass();
        lavVar.c = larVar2;
        lavVar.b |= 1;
        for (van vanVar : vaoVar.c) {
            int iAX = a.aX(vanVar.b);
            if (iAX != 0 && iAX == 3) {
                int iAQ = a.aQ(vanVar.c);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i = iAQ - 2;
                if (i == 1) {
                    int i2 = vanVar.d;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).d = i2;
                } else if (i == 2) {
                    int i3 = vanVar.d;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).e = i3;
                } else if (i == 3) {
                    int i4 = vanVar.d;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ((lav) vtwVarM.b).f = i4;
                }
            }
        }
        return (lav) vtwVarM.r();
    }

    public static ImmutableList E(List list) {
        return FluentIterable.from(list).transform(new lpn(13)).filter(new efc(20)).transform(new lpn(14)).toList();
    }

    private static String F(kzo kzoVar) {
        int iBm = a.bm(kzoVar.f);
        if (iBm == 0) {
            iBm = 1;
        }
        if (iBm - 1 == 1) {
            int iAR = a.aR(kzoVar.d);
            return a.cf(iAR != 0 ? iAR : 1, "original_");
        }
        String str = kzoVar.c;
        int iAR2 = a.aR(kzoVar.d);
        return str + "_" + (iAR2 != 0 ? iAR2 : 1);
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static void c(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
    }

    @SafeVarargs
    public static idf d(idf... idfVarArr) {
        return new jxt((idf[]) idfVarArr.clone(), 5);
    }

    public static ieg e(int i, String str, Throwable th) {
        krd.c("Result failed: detailedCode=" + jyv.h(i) + ", message=" + str + ", cause=" + String.valueOf(th));
        return ieg.b(new krm(i, str, th));
    }

    public static ieg f(String str) {
        krd.c(a.cr(str, "Result failed: detailedCode=VIDEO_REPOSITORIES_ERROR, message="));
        return ieg.b(new krm(str));
    }

    public static ieg g(tst tstVar) {
        return tstVar.g() ? ieg.f(tstVar.c()) : ieg.a;
    }

    public static final ieg h(Parcel parcel) {
        return ktw.g(parcel, ktz.class);
    }

    public static final ieg i(Parcel parcel) {
        return ktw.f(parcel, ktd.a);
    }

    public static final ieg j(Parcel parcel) {
        return ktw.g(parcel, ksy.class);
    }

    public static final void k(int i, StringBuilder sb) {
        sb.append("-h");
        sb.append(i);
    }

    public static final void l(StringBuilder sb) {
        sb.append("-pd-c0x");
        sb.append(Integer.toHexString(-16777216));
    }

    public static final void m(int i, StringBuilder sb) {
        sb.append("-w");
        sb.append(i);
    }

    public static void n(ieg iegVar, String str, String str2, kzo kzoVar, SharedPreferences sharedPreferences) {
        int iAR = a.aR(kzoVar.d);
        if (iAR != 0 && iAR == 2) {
            return;
        }
        sharedPreferences.edit().putString(ktw.a(iegVar, str, str2), F(kzoVar)).apply();
        sharedPreferences.edit().putString(ktw.b(iegVar), F(kzoVar)).apply();
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? "NOT_LINKED" : "LINKED" : "UNKNOWN";
    }

    public static ImmutableList p(lce lceVar, List list) {
        return FluentIterable.from(list).filter(new lsp(8)).transform(new ldl(lceVar, 12)).toList();
    }

    public static ImmutableList q(List list) {
        return FluentIterable.from(list).filter(new lsp(5)).transform(new lpn(19)).toList();
    }

    public static ImmutableList r(List list) {
        return FluentIterable.from(list).filter(new lsp(10)).transform(new lsq(2)).toList();
    }

    public static lac s(List list) {
        if (list.isEmpty()) {
            return lac.a;
        }
        vtw vtwVarM = lac.a.m();
        vbi vbiVar = ((vbg) list.get(0)).b;
        if (vbiVar == null) {
            vbiVar = vbi.a;
        }
        String str = vbiVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lac lacVar = (lac) vtwVarM.b;
        str.getClass();
        lacVar.b = str;
        String str2 = ((vbg) list.get(0)).c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lac lacVar2 = (lac) vtwVarM.b;
        str2.getClass();
        lacVar2.c = str2;
        return (lac) vtwVarM.r();
    }

    public static lcv t(List list) {
        vtw vtwVarM = lcv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((lcv) vucVar).b = Float.NaN;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((lcv) vtwVarM.b).d = Float.NaN;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vzl vzlVar = (vzl) it.next();
            if ((vzlVar.b == 1 ? (vzj) vzlVar.c : vzj.a).c > 0) {
                float f = (vzlVar.b == 1 ? (vzj) vzlVar.c : vzj.a).b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                ((lcv) vucVar2).b = f;
                long j = (vzlVar.b == 1 ? (vzj) vzlVar.c : vzj.a).c;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                ((lcv) vtwVarM.b).c = j;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vzl vzlVar2 = (vzl) it2.next();
            if ((vzlVar2.b == 2 ? (vzk) vzlVar2.c : vzk.a).c != 0) {
                vzk vzkVar = vzlVar2.b == 2 ? (vzk) vzlVar2.c : vzk.a;
                if (vzkVar.c > 0) {
                    int iAU = a.aU(vzkVar.e);
                    if (iAU == 0) {
                        iAU = 1;
                    }
                    int i = iAU - 2;
                    if (i == 3) {
                        lcu lcuVar = lcu.TOMATOMETER_RATING_FRESH;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).e = lcuVar.a();
                        float f2 = vzkVar.b;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).d = f2;
                    } else if (i == 4) {
                        lcu lcuVar2 = lcu.TOMATOMETER_RATING_ROTTEN;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).e = lcuVar2.a();
                        float f3 = vzkVar.b;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).d = f3;
                    } else if (i == 5) {
                        lcu lcuVar3 = lcu.TOMATOMETER_RATING_CERTIFIED_FRESH;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).e = lcuVar3.a();
                        float f4 = vzkVar.b;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lcv) vtwVarM.b).d = f4;
                    }
                    String str = vzkVar.d;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    lcv lcvVar = (lcv) vtwVarM.b;
                    str.getClass();
                    lcvVar.f = str;
                }
            }
        }
        return (lcv) vtwVarM.r();
    }

    public static ImmutableList u(List list, int i) {
        return FluentIterable.from(list).filter(new rpc(i, 1)).transform(new lpn(18)).toList();
    }

    public static ImmutableList v(List list) {
        return FluentIterable.from(list).transform(new lpn(16)).toList();
    }

    public static ImmutableList w(List list) {
        return FluentIterable.from(list).transform(new lpn(15)).toList();
    }

    public static boolean x(List list) {
        return FluentIterable.from(list).anyMatch(new lsp(2));
    }

    public static boolean y(List list) {
        return FluentIterable.from(list).anyMatch(new lsp(0));
    }

    public static boolean z(List list) {
        return FluentIterable.from(list).anyMatch(new lsp(3));
    }
}
