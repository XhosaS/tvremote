package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpq implements tsl {
    private final /* synthetic */ int a;

    public lpq(int i) {
        this.a = i;
    }

    public static tst a(kzl kzlVar) {
        ksy ksyVarC = ksy.c(kzlVar.b, kzlVar.c);
        int i = ksyVarC.a;
        return i != 6 ? i != 5000 ? b("asset type not supported for movie details (not a movie or movie bundle).") : tst.i(new kxo(new kxx(new kyf(ksyVarC, trk.a)))) : tst.i(new kxo(new kxw(new kyg(ksyVarC, trk.a))));
    }

    public static tst b(String str) {
        krd.c("Error converting server Action into client Action: ".concat(str));
        return trk.a;
    }

    public static tst c(boolean z, kzl kzlVar) {
        return z ? tst.i(ksy.c(kzlVar.b, kzlVar.c)) : trk.a;
    }

    public static tst d(kzc kzcVar, int i) {
        Iterator<T> it = new vul(kzcVar.d, kzc.a).iterator();
        ImmutableList.Builder builder = null;
        while (it.hasNext()) {
            String strName = ((kzb) it.next()).name();
            if (builder == null) {
                builder = ImmutableList.builder();
            }
            builder.add((ImmutableList.Builder) strName);
        }
        return tst.i(new kxq(new kyj(i, builder != null ? builder.build() : ImmutableList.of())));
    }

    public static int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 3 : 2;
        }
        return 1;
    }

    @Override // defpackage.tsl
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.a) {
            case 0:
                val valVar = (val) obj;
                vtw vtwVarM = kzl.a.m();
                vak vakVarB = vak.b(valVar.b);
                if (vakVarB == null) {
                    vakVarB = vak.UNRECOGNIZED;
                }
                i = vakVarB != vak.TYPE_UNSPECIFIED ? kgu.m(valVar).a : 0;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                ((kzl) vucVar).b = i;
                String str = valVar.c;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                kzl kzlVar = (kzl) vtwVarM.b;
                str.getClass();
                kzlVar.c = str;
                return (kzl) vtwVarM.r();
            case 1:
                throw null;
            case 2:
                return (kyy) kyy.a.m().r();
            case 3:
                return (kyz) kyz.a.m().r();
            case 4:
                vad vadVar = (vad) obj;
                vtw vtwVarM2 = kzc.b.m();
                int i = vadVar.c;
                int iAs = a.as(i);
                if (iAs != 0 && iAs != 1) {
                    i = i;
                }
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                ((kzc) vtwVarM2.b).c = a.aF(a.as(i));
                ImmutableList list = FluentIterable.from(new vul(vadVar.d, vad.a)).transform(new eyt(20)).toList();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                kzc kzcVar = (kzc) vtwVarM2.b;
                vuj vujVar = kzcVar.d;
                if (!vujVar.c()) {
                    kzcVar.d = vuc.q(vujVar);
                }
                Iterator<E> it = list.iterator();
                while (it.hasNext()) {
                    kzcVar.d.g(((kzb) it.next()).a());
                }
                return (kzc) vtwVarM2.r();
            case 5:
                vtw vtwVarM3 = kzf.a.m();
                int i2 = ((vag) obj).b;
                int iAs2 = a.as(i2);
                if (iAs2 != 0 && iAs2 != 1) {
                    i = i2;
                }
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                ((kzf) vtwVarM3.b).b = a.aF(a.as(i));
                return (kzf) vtwVarM3.r();
            case 6:
                return (kzg) kzg.a.m().r();
            case 7:
                vle vleVar = (vle) obj;
                vtw vtwVarM4 = uxk.a.m();
                if ((vleVar.b & 1) != 0) {
                    String str2 = vleVar.c;
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    uxk uxkVar = (uxk) vtwVarM4.b;
                    str2.getClass();
                    uxkVar.b |= 1;
                    uxkVar.e = str2;
                }
                vtw vtwVarM5 = uyh.a.m();
                int i3 = vleVar.d;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vuc vucVar2 = vtwVarM5.b;
                uyh uyhVar = (uyh) vucVar2;
                uyhVar.b = 1 | uyhVar.b;
                uyhVar.c = i3;
                int i4 = vleVar.e;
                if (!vucVar2.A()) {
                    vtwVarM5.u();
                }
                uyh uyhVar2 = (uyh) vtwVarM5.b;
                uyhVar2.b |= 2;
                uyhVar2.d = i4;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uxk uxkVar2 = (uxk) vtwVarM4.b;
                uyh uyhVar3 = (uyh) vtwVarM5.r();
                uyhVar3.getClass();
                uxkVar2.d = uyhVar3;
                uxkVar2.c = 2;
                return (uxk) vtwVarM4.r();
            case 8:
                vlf vlfVar = (vlf) obj;
                vtw vtwVarM6 = uxl.a.m();
                if ((vlfVar.b & 1) != 0) {
                    int i5 = vlfVar.c;
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    uxl uxlVar = (uxl) vtwVarM6.b;
                    uxlVar.b |= 1;
                    uxlVar.c = i5;
                }
                if ((vlfVar.b & 2) != 0) {
                    int i6 = vlfVar.d;
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    uxl uxlVar2 = (uxl) vtwVarM6.b;
                    uxlVar2.b |= 2;
                    uxlVar2.d = i6;
                }
                if ((vlfVar.b & 4) != 0) {
                    String str3 = vlfVar.e;
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    uxl uxlVar3 = (uxl) vtwVarM6.b;
                    str3.getClass();
                    uxlVar3.b |= 4;
                    uxlVar3.e = str3;
                }
                return (uxl) vtwVarM6.r();
            case 9:
                vnm vnmVar = (vnm) obj;
                vtw vtwVarM7 = uyd.a.m();
                if ((vnmVar.b & 1) != 0) {
                    String str4 = vnmVar.c;
                    if (!vtwVarM7.b.A()) {
                        vtwVarM7.u();
                    }
                    uyd uydVar = (uyd) vtwVarM7.b;
                    str4.getClass();
                    uydVar.b |= 1;
                    uydVar.c = str4;
                }
                if ((vnmVar.b & 4) != 0) {
                    vsl vslVar = vnmVar.d;
                    if (vslVar == null) {
                        vslVar = vsl.a;
                    }
                    if (!vtwVarM7.b.A()) {
                        vtwVarM7.u();
                    }
                    uyd uydVar2 = (uyd) vtwVarM7.b;
                    vslVar.getClass();
                    uydVar2.d = vslVar;
                    uydVar2.b |= 2;
                }
                return (uyd) vtwVarM7.r();
            case 10:
                vmt vmtVar = (vmt) obj;
                vtw vtwVarM8 = uyz.b.m();
                if ((vmtVar.c & 1) != 0) {
                    wev wevVar = vmtVar.d;
                    if (wevVar == null) {
                        wevVar = wev.a;
                    }
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    uyz uyzVar = (uyz) vtwVarM8.b;
                    wevVar.getClass();
                    uyzVar.d = wevVar;
                    uyzVar.c |= 1;
                }
                if ((vmtVar.c & 2) != 0) {
                    wev wevVar2 = vmtVar.e;
                    if (wevVar2 == null) {
                        wevVar2 = wev.a;
                    }
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    uyz uyzVar2 = (uyz) vtwVarM8.b;
                    wevVar2.getClass();
                    uyzVar2.e = wevVar2;
                    uyzVar2.c |= 2;
                }
                vul vulVar = new vul(vmtVar.f, vmt.a);
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                uyz uyzVar3 = (uyz) vtwVarM8.b;
                vuj vujVar2 = uyzVar3.f;
                if (!vujVar2.c()) {
                    uyzVar3.f = vuc.q(vujVar2);
                }
                Iterator<T> it2 = vulVar.iterator();
                while (it2.hasNext()) {
                    uyzVar3.f.g(((wet) it2.next()).a());
                }
                return (uyz) vtwVarM8.r();
            case 11:
                voc vocVar = (voc) obj;
                int iOrdinal = vocVar.ordinal();
                if (iOrdinal == 0) {
                    return uvu.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                }
                if (iOrdinal == 1) {
                    return uvu.ANDROID_POST_NOTIFICATIONS;
                }
                if (iOrdinal == 2) {
                    return uvu.ANDROID_CAMERA;
                }
                if (iOrdinal == 3) {
                    return uvu.ANDROID_ACCESS_FINE_LOCATION;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vocVar))));
            case 12:
                vmp vmpVar = (vmp) obj;
                int iOrdinal2 = vmpVar.ordinal();
                if (iOrdinal2 == 0) {
                    return uvz.CONNECTIVITY_UNKNOWN;
                }
                if (iOrdinal2 == 1) {
                    return uvz.OFFLINE;
                }
                if (iOrdinal2 == 2) {
                    return uvz.ONLINE;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vmpVar))));
            case 13:
                vne vneVar = (vne) obj;
                int iOrdinal3 = vneVar.ordinal();
                if (iOrdinal3 == 0) {
                    return uya.BUTTONS_ORDER_UNSPECIFIED;
                }
                if (iOrdinal3 == 1) {
                    return uya.ACTION_BUTTON_PRIMARY;
                }
                if (iOrdinal3 == 2) {
                    return uya.ACK_BUTTON_PRIMARY;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vneVar))));
            case 14:
                vnr vnrVar = (vnr) obj;
                int iOrdinal4 = vnrVar.ordinal();
                if (iOrdinal4 == 0) {
                    return uyp.UITHEME_DEFAULT;
                }
                if (iOrdinal4 == 1) {
                    return uyp.UITHEME_GOOGLE_MATERIAL;
                }
                if (iOrdinal4 == 2) {
                    return uyp.UITHEME_GOOGLE_MATERIAL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vnrVar))));
            default:
                throw null;
        }
    }
}
