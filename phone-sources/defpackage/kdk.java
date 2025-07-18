package defpackage;

import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdk extends sbx {
    private final kdp a;
    private final kdt b;
    private final ihg c;
    private final kja d;
    private final kdh e;

    public kdk(kdh kdhVar, kdp kdpVar, kdt kdtVar, ihg ihgVar, kja kjaVar) {
        kjaVar.getClass();
        this.e = kdhVar;
        this.a = kdpVar;
        this.b = kdtVar;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kdm();
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        yva yvaVar;
        ArrayList arrayList;
        vun vunVar;
        wpm wpmVar;
        String str;
        wls wlsVarS;
        String str2;
        String str3;
        wnp wnpVar;
        kdi kdiVar = (kdi) obj;
        wll wllVar = kdiVar.e;
        kdm kdmVar = (kdm) obj2;
        m(kdiVar.b.a(wllVar));
        yva yvaVar2 = ((kiz) this.d).a;
        o(yvaVar2);
        wnq wnqVarA = kdiVar.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it = wnqVarA.b.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            wnp wnpVar2 = (wnp) it.next();
            wls wlsVarN = ihz.n(wnpVar2);
            wno wnoVar = wnpVar2.b;
            if (wnoVar == null) {
                wnoVar = wno.a;
            }
            wlx wlxVar = wnoVar.e;
            if (wlxVar == null) {
                wlxVar = wlx.a;
            }
            wlx wlxVar2 = wlxVar;
            wlxVar2.getClass();
            wno wnoVar2 = wnpVar2.b;
            if (wnoVar2 == null) {
                wnoVar2 = wno.a;
            }
            String str4 = wnoVar2.b;
            str4.getClass();
            if (!ihz.E(wnpVar2)) {
                yvaVar = yvaVar2;
                arrayList = arrayList2;
                if (wnpVar2 != null && (vunVar = wnpVar2.c) != null && (wpmVar = (wpm) yfm.V(vunVar, 0)) != null) {
                    wls wlsVar = wpmVar.f;
                    if (wlsVar == null) {
                        wlsVar = wls.a;
                    }
                    if (kdiVar.c.a() || ihz.K(wnpVar2) || ihz.D(wnpVar2)) {
                        str = str4;
                        z = true;
                    } else {
                        str = str4;
                    }
                    arrayList.add(new kdo(wllVar, wnpVar2, str, wpmVar, wlsVarN, wlsVar, wlxVar2, z, false, "Watch", 1280));
                }
            } else if (ihz.C(wnpVar2) || ihz.H(wnpVar2) || ihz.I(wnpVar2)) {
                yvaVar = yvaVar2;
                arrayList = arrayList2;
                wpm wpmVarW = ihz.w(wnpVar2);
                if (wpmVarW != null) {
                    wlsVarS = wpmVarW.f;
                    if (wlsVarS == null) {
                        wlsVarS = wls.a;
                    }
                    str2 = "Show Episodes";
                } else {
                    wpmVarW = ihz.v(wnpVar2);
                    wlsVarS = ihz.S(R.string.details_watch_now, kdiVar.a);
                    str2 = "Watch";
                }
                String str5 = str2;
                wls wlsVar2 = wlsVarS;
                wpm wpmVar2 = wpmVarW;
                if (wpmVar2 != null) {
                    wnpVar2.getClass();
                    arrayList.add(new kdo(wllVar, wnpVar2, str4, wpmVar2, wlsVarN, wlsVar2, wlxVar2, false, false, str5, 1408));
                }
            } else {
                wpm wpmVarU = ihz.u(wnpVar2);
                if (wpmVarU != null) {
                    wnpVar2.getClass();
                    str3 = str4;
                    ArrayList arrayList3 = arrayList2;
                    wnpVar = wnpVar2;
                    yvaVar = yvaVar2;
                    arrayList = arrayList3;
                    arrayList.add(new kdo(wllVar, wnpVar, str3, wpmVarU, wlsVarN, ihz.m(wnpVar2), wlxVar2, false, kdiVar.c.a(), "Rent", 1152));
                } else {
                    str3 = str4;
                    yvaVar = yvaVar2;
                    arrayList = arrayList2;
                    wnpVar = wnpVar2;
                }
                wpm wpmVarT = ihz.t(wnpVar);
                if (wpmVarT != null) {
                    wnpVar.getClass();
                    arrayList.add(new kdo(wllVar, wnpVar, str3, wpmVarT, wlsVarN, ihz.k(wnpVar), wlxVar2, false, kdiVar.c.a(), "Buy", 1152));
                }
            }
            arrayList2 = arrayList;
            yvaVar2 = yvaVar;
        }
        yva yvaVar3 = yvaVar2;
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = new ArrayList(yfm.z(arrayList4, 10));
        int i = 0;
        for (Object obj3 : arrayList4) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            kdo kdoVar = (kdo) obj3;
            arrayList5.add(new kdo(kdoVar.a, kdoVar.b, kdoVar.c, kdoVar.d, kdoVar.e, kdoVar.f, kdoVar.g, kdoVar.h, kdoVar.i, kdoVar.j, i == 0 ? 1 : i == yfm.q(arrayList4) ? 3 : 2, null));
            i = i2;
        }
        ArrayList arrayList6 = new ArrayList(yfm.z(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add((kdr) this.a.l((kdo) it2.next()));
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList6);
        if (!yks.e(kdmVar.b, immutableListCopyOf)) {
            kdmVar.b = immutableListCopyOf;
            kdmVar.G(1);
        }
        if (!arrayList6.isEmpty()) {
            sco scoVar = new sco(kdiVar.d);
            if (!yks.e(kdmVar.a, scoVar)) {
                kdmVar.a = scoVar;
                kdmVar.G(0);
            }
            if (this.c.a()) {
                wfo wfoVar = (wfo) yvaVar3.d();
                if (!yks.e(kdmVar.d, wfoVar)) {
                    kdmVar.d = wfoVar;
                    kdmVar.G(3);
                }
            }
        }
        kds kdsVar = kdiVar.f;
        if (yks.e(kdsVar, kds.a)) {
            return;
        }
        kdv kdvVar = (kdv) this.b.l(kdsVar);
        if (yks.e(kdmVar.c, kdvVar)) {
            return;
        }
        kdmVar.c = kdvVar;
        kdmVar.G(2);
    }
}
