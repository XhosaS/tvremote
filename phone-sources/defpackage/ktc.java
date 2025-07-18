package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktc {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        b = map;
        xay xayVar = xay.ANDROID_APP;
        map.put(xayVar, ieg.f(xayVar));
        xay xayVar2 = xay.MUSIC_ALBUM;
        map.put(xayVar2, ieg.f(xayVar2));
        xay xayVar3 = xay.MUSIC_ARTIST;
        map.put(xayVar3, ieg.f(xayVar3));
        xay xayVar4 = xay.MUSIC_SONG;
        map.put(xayVar4, ieg.f(xayVar4));
        xay xayVar5 = xay.MOVIE;
        map.put(xayVar5, ieg.f(xayVar5));
        xay xayVar6 = xay.CONTAINER;
        map.put(xayVar6, ieg.f(xayVar6));
        xay xayVar7 = xay.EDITORIAL;
        map.put(xayVar7, ieg.f(xayVar7));
        xay xayVar8 = xay.SHOW;
        map.put(xayVar8, ieg.f(xayVar8));
        xay xayVar9 = xay.SEASON;
        map.put(xayVar9, ieg.f(xayVar9));
        xay xayVar10 = xay.EPISODE;
        map.put(xayVar10, ieg.f(xayVar10));
        xay xayVar11 = xay.VOUCHER;
        map.put(xayVar11, ieg.f(xayVar11));
        xay xayVar12 = xay.ENTERTAINMENT_STORY;
        map.put(xayVar12, ieg.f(xayVar12));
        xay xayVar13 = xay.DISTRIBUTOR;
        map.put(xayVar13, ieg.f(xayVar13));
        xay xayVar14 = xay.MOVIES_BUNDLE;
        map.put(xayVar14, ieg.f(xayVar14));
    }

    public static int a(xar xarVar) {
        if (xarVar == null) {
            return 0;
        }
        long j = xarVar.e;
        if (j != 0) {
            return ksi.a(j);
        }
        return 0;
    }

    public static ieg b(xay xayVar) {
        Map map = b;
        synchronized (map) {
            ieg iegVar = (ieg) map.get(xayVar);
            if (iegVar != null) {
                return iegVar;
            }
            ieg iegVarF = ieg.f(xayVar);
            map.put(xayVar, iegVarF);
            return iegVarF;
        }
    }

    public static ieg c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xaf xafVar = (xaf) it.next();
            xae xaeVar = xafVar.f;
            if (xaeVar == null) {
                xaeVar = xae.a;
            }
            int iAN = a.aN(xafVar.c);
            if (iAN != 0 && iAN == 12 && (xafVar.b & 16) != 0) {
                int i = xaeVar.b;
                int iAS = a.aS(i);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i2 = iAS - 1;
                if (i2 == 1) {
                    xac xacVar = xaeVar.c;
                    if (xacVar == null) {
                        xacVar = xac.a;
                    }
                    if (xacVar == null) {
                        krd.b("Price based annotation is null");
                        return ieg.a;
                    }
                    Object objB = kzj.b.b(xacVar.c);
                    String str = xacVar.d;
                    int iAV = a.aV(xacVar.b);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    int i3 = iAV - 1;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i = 2;
                        } else if (i3 == 3) {
                            i = 8;
                        } else if (i3 == 4) {
                            i = 9;
                        } else {
                            if (i3 != 5) {
                                krd.b("Price based annotation type is unknown");
                                return ieg.a;
                            }
                            i = 10;
                        }
                    }
                    Executor executor = ksk.a;
                    if (str == null) {
                        str = "";
                    }
                    return ieg.f(kul.b(i, (ktz) objB, str, ieg.a));
                }
                if (i2 == 2) {
                    continue;
                } else {
                    if (i2 == 3) {
                        xad xadVar = xaeVar.d;
                        if (xadVar == null) {
                            xadVar = xad.a;
                        }
                        if (xadVar != null) {
                            return ieg.f(kul.a(xadVar.b, xadVar.c));
                        }
                        krd.b("Text based annotation is null");
                        return ieg.a;
                    }
                    int iAS2 = a.aS(i);
                    i = iAS2 != 0 ? iAS2 : 1;
                    StringBuilder sb = new StringBuilder("Entitlement annotation is not valid with type ");
                    sb.append(i - 1);
                    krd.b(sb.toString());
                }
            }
        }
        return ieg.a;
    }

    @Deprecated
    public static kum d(ieg iegVar, String str) {
        krf.c(str);
        final String strH = h(iegVar, str);
        if (strH == null) {
            strH = "";
        }
        return new kum() { // from class: ktb
            @Override // defpackage.kum
            public final String dX() {
                int i = ktc.a;
                return strH;
            }
        };
    }

    public static ImmutableList e(List list) {
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
                    String str = xabVar.b;
                    kuf kufVar = kuf.a;
                    arrayList.add(new kup(new ktn(str), o(xabVar.c, 2), o(xabVar.c, 3), o(xabVar.c, 4)));
                }
            } else if (iAN == 13 && (xafVar.b & 32) != 0) {
                xab xabVar2 = xafVar.g;
                if (xabVar2 == null) {
                    xabVar2 = xab.a;
                }
                vun vunVar = xabVar2.c;
                arrayList.add(new kup(kuf.a, o(vunVar, 2), o(vunVar, 3), o(vunVar, 4)));
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static ImmutableList f(xax xaxVar) {
        vun<xaz> vunVar = xaxVar == null ? null : xaxVar.i;
        if (vunVar == null || vunVar.isEmpty()) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        for (xaz xazVar : vunVar) {
            if ((xazVar.b & 8) != 0) {
                xay xayVarB = xay.b(xazVar.f);
                if (xayVarB == null) {
                    xayVarB = xay.ANDROID_APP;
                }
                if (xayVarB == xay.MOVIE) {
                    arrayList.add(ksy.m(xazVar.c));
                }
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static String g(int i, String str) {
        xay xayVarB = xay.b(i);
        if (xayVarB == null) {
            return null;
        }
        return h(b(xayVarB), str);
    }

    public static String h(ieg iegVar, String str) {
        krf.c(str);
        if (iegVar.m()) {
            return i((xay) iegVar.g(), str);
        }
        return null;
    }

    public static String i(xay xayVar, String str) {
        krf.c(str);
        switch (xayVar.ordinal()) {
            case 0:
                return ksy.o(str);
            case 1:
                krf.c(str);
                return "sj:album:".concat(String.valueOf(str));
            case 2:
            case 4:
            case 6:
            case 7:
            case 12:
            case 14:
            default:
                return null;
            case 3:
                krf.c(str);
                return "sj:song:".concat(String.valueOf(str));
            case 5:
            case 17:
                return ksy.q(str);
            case 8:
                return ksy.s(str);
            case 9:
                return ksy.r(str);
            case 10:
                return ksy.p(str);
            case 11:
                krf.c(str);
                return "cm:voucher:".concat(String.valueOf(str));
            case 13:
                krf.c(str);
                return "pt:distributor:".concat(str);
            case 15:
                return k(str);
            case 16:
                return j(str);
        }
    }

    public static String j(String str) {
        krf.c(str);
        return "m:atvbanner:".concat(String.valueOf(str));
    }

    public static String k(String str) {
        krf.c(str);
        return "m:banner:".concat(String.valueOf(str));
    }

    public static String l(String str) {
        krf.c(str);
        return "m:show:".concat(String.valueOf(str));
    }

    public static List m(xax xaxVar) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = xaxVar.n.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                xbb xbbVar = (xbb) it.next();
                xaz xazVar = xbbVar.c;
                if (xazVar == null) {
                    xazVar = xaz.a;
                }
                xay xayVarB = xay.b(xazVar.f);
                if (xayVarB == null) {
                    xayVarB = xay.ANDROID_APP;
                }
                if (xayVarB == xay.MOVIE) {
                    arrayList.add(xbbVar);
                    if (!z || (xbbVar.b & 2) == 0) {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            Collections.sort(arrayList, new fab(12));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            xaz xazVar2 = ((xbb) arrayList.get(i)).c;
            if (xazVar2 == null) {
                xazVar2 = xaz.a;
            }
            arrayList2.add(ksy.b(xazVar2));
        }
        return arrayList2;
    }

    public static String n(xao xaoVar, int i, int i2) {
        if (xaoVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("k-v1-rwu");
        if (i / i2 >= xaoVar.d / xaoVar.e) {
            krf.m(i, sb);
        } else {
            krf.k(i2, sb);
        }
        return kuq.b(sb.toString(), xaoVar.c);
    }

    public static int o(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xaa xaaVar = (xaa) it.next();
            int iAY = a.aY(xaaVar.b);
            if (iAY != 0 && iAY == 2) {
                int iAS = a.aS(xaaVar.c);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS == i) {
                    return xaaVar.d;
                }
            }
        }
        return 0;
    }

    public static xao p(List list, int i) {
        return q(list, i, 0, 0, 0.0f);
    }

    public static xao q(List list, int i, int i2, int i3, float f) {
        if (list.size() == 0) {
            return null;
        }
        boolean z = i2 > 0 && i3 > 0;
        boolean z2 = z && f > 0.0f;
        int iSignum = z ? Integer.signum(i2 - i3) : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xao xaoVar = (xao) it.next();
            if ((xaoVar.b & 16) != 0) {
                int iV = vyf.v(xaoVar.g);
                if (iV == 0) {
                    iV = 1;
                }
                if (i == iV && (!z2 || (xaoVar.d / i2 >= f && xaoVar.e / i3 >= f))) {
                    if (iSignum == 0 || iSignum == Integer.signum(xaoVar.d - xaoVar.e)) {
                        return xaoVar;
                    }
                }
            }
        }
        return null;
    }

    public static xbs r(List list, int i, int i2) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xbs xbsVar = (xbs) it.next();
                int iT = vyf.t(xbsVar.c);
                if (iT == 0) {
                    iT = 2;
                }
                if (iT == i2) {
                    int iU = vyf.u(xbsVar.g);
                    if (iU == 0) {
                        iU = 1;
                    }
                    if (iU == i && xbsVar.e > 0) {
                        return xbsVar;
                    }
                }
            }
        }
        return null;
    }

    public static Uri s(List list, int i, int i2, int i3, float f) {
        xao xaoVarQ = q(list, i, i2, i3, f);
        return (xaoVarQ == null || xaoVarQ.c.isEmpty()) ? Uri.EMPTY : (!xaoVarQ.f || i2 <= 0 || i3 <= 0) ? Uri.parse(xaoVarQ.c) : ksk.a(n(xaoVarQ, i2, i3));
    }
}
