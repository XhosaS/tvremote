package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntp {
    private static volatile ntp b;
    public final Object a;

    public ntp(Object obj) {
        this.a = obj;
    }

    public static ntp a() {
        if (b == null) {
            synchronized (ntp.class) {
                if (b == null) {
                    b = new ntp();
                }
            }
        }
        return b;
    }

    public static ntp f(final iea ieaVar, final iea ieaVar2, iea ieaVar3, idt idtVar, SharedPreferences sharedPreferences, ids idsVar, final String str, ieh iehVar, final Resources resources, Context context, final boolean z, final boolean z2, final boolean z3, final boolean z4, pkg pkgVar) {
        iea ieaVarA;
        if (z3) {
            ieaVarA = new idz(false);
        } else {
            krz krzVar = new krz(false);
            krzVar.a = new ids[]{ieaVar3, idtVar, ieaVar};
            krzVar.d(new lxg((Object) sharedPreferences, ieaVar3, (Object) ieaVar, 5));
            ieaVarA = krzVar.a();
        }
        krz krzVar2 = new krz(ieg.a);
        krzVar2.a = new ids[]{ieaVar2, ieaVar, ieaVarA, idsVar};
        final iea ieaVar4 = ieaVarA;
        krzVar2.d(new ieh() { // from class: mxl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ieh
            public final Object a() throws Resources.NotFoundException {
                String string = resources.getString(R.string.details_parental_controls_restricted);
                iea ieaVar5 = ieaVar;
                int i = ((mxc) ieaVar5.a()).b;
                if (i == 0) {
                    return ieg.a;
                }
                if (i == 3) {
                    nat natVarA = mxo.a();
                    natVarA.l(ieg.f(string));
                    return ieg.f(natVarA.h());
                }
                if (i == 2) {
                    String str2 = str;
                    nat natVarA2 = mxo.a();
                    natVarA2.l(ieg.f(str2));
                    return ieg.f(natVarA2.h());
                }
                ImmutableList immutableList = ((mxc) ieaVar5.a()).a;
                if (immutableList.isEmpty()) {
                    return ieg.a;
                }
                iea ieaVar6 = ieaVar2;
                mxe mxeVar = (mxe) immutableList.get(0);
                if (((ieg) ieaVar6.a()).m()) {
                    kuf kufVar = (kuf) ((ieg) ieaVar6.a()).g();
                    Iterator<E> it = immutableList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        mxe mxeVar2 = (mxe) it.next();
                        if (mxeVar2.a.equals(kufVar)) {
                            mxeVar = mxeVar2;
                            break;
                        }
                    }
                }
                boolean z5 = z4;
                boolean z6 = z3;
                boolean z7 = z2;
                boolean z8 = z;
                iea ieaVar7 = ieaVar4;
                ArrayList arrayList = new ArrayList(immutableList);
                arrayList.remove(mxeVar);
                nat natVarA3 = mxo.a();
                natVarA3.m(mxeVar);
                natVarA3.n(((Boolean) ieaVar7.a()).booleanValue());
                natVarA3.p(arrayList);
                natVarA3.i(z8);
                natVarA3.j(z7);
                natVarA3.k(z6);
                natVarA3.o(z5);
                return ieg.f(natVarA3.h());
            }
        });
        return new ntp(krzVar2.a(), iehVar, context, pkgVar);
    }

    public static ntp g(final iea ieaVar, final iea ieaVar2, iea ieaVar3, iea ieaVar4, idt idtVar, SharedPreferences sharedPreferences, final idw idwVar, final ieh iehVar, ids idsVar, final idf idfVar, Executor executor, String str, ieh iehVar2, final Resources resources, Context context, final boolean z, final boolean z2, final boolean z3, boolean z4, pkg pkgVar) {
        krz krzVar = new krz(mxc.a().f());
        krzVar.a = new ids[]{ieaVar, ieaVar2, idsVar};
        krzVar.b = executor;
        krzVar.d(new ieh() { // from class: mxk
            @Override // defpackage.ieh
            public final Object a() throws Resources.NotFoundException {
                ImmutableList immutableListBuild;
                rub rubVarA = mxc.a();
                iea ieaVar5 = ieaVar;
                if (!((ieg) ieaVar5.a()).m()) {
                    return rubVarA.f();
                }
                if (!idwVar.b((kst) ((ieg) ieaVar5.a()).g())) {
                    rubVarA.h(3);
                    return rubVarA.f();
                }
                ieh iehVar3 = iehVar;
                iea ieaVar6 = ieaVar2;
                kst kstVar = (kst) ((ieg) ieaVar5.a()).g();
                List<kxg> list = (List) iehVar3.a();
                kvc kvcVarA = ((kva) ieaVar6.a()).a(kstVar);
                ieg iegVarL = ((kvz) kstVar).l();
                boolean z5 = (iegVarL.m() && ((ktz) iegVarL.g()).a() > 0) || kvcVarA.b || kvcVarA.f;
                boolean z6 = z3;
                boolean z7 = z2;
                boolean z8 = z;
                Resources resources2 = resources;
                if (list.isEmpty()) {
                    if (z5) {
                        rubVarA.h(1);
                        rubVarA.g(Collections.singletonList(mnu.k(resources2, z8, z7, z6).a()));
                    } else {
                        rubVarA.h(2);
                    }
                    return rubVarA.f();
                }
                ArrayList arrayList = new ArrayList();
                mxd mxdVarK = mnu.k(resources2, z8, z7, z6);
                ArrayList arrayList2 = new ArrayList();
                for (kxg kxgVar : list) {
                    if (kxgVar.f != 0) {
                        boolean z9 = z7;
                        if (System.currentTimeMillis() / 1000 < kxgVar.g) {
                            arrayList2.add(kxgVar);
                        }
                        z7 = z9;
                    }
                }
                boolean z10 = z7;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(ksy.g(((kxg) it.next()).c));
                }
                List<kue> list2 = (List) idfVar.b(arrayList3);
                list2.isEmpty();
                for (kue kueVar : list2) {
                    kuf kufVar = kueVar.a;
                    if (kuf.b(kufVar)) {
                        z5 = true;
                    } else {
                        mxd mxdVarA = mxe.a();
                        mxdVarA.b(kufVar);
                        int i = kueVar.d;
                        mxdVarA.c(i);
                        mxdVarA.d(kueVar.c);
                        mxdVarA.g(kueVar.b);
                        mxdVarA.a = i == 5 ? resources2.getString(R.string.free) : "";
                        mxdVarA.e(z8);
                        mxdVarA.f(z10);
                        arrayList.add(mxdVarA.a());
                    }
                }
                mxe mxeVarA = mxdVarK.a();
                boolean z11 = kvcVarA.b;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList4.add((mxe) it2.next());
                }
                if (z11) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    builder.add((ImmutableList.Builder) mxeVarA);
                    builder.addAll((Iterable) arrayList4);
                    builder.addAll((Iterable) arrayList5);
                    immutableListBuild = builder.build();
                } else if (z5) {
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    builder2.addAll((Iterable) arrayList4);
                    builder2.add((ImmutableList.Builder) mxeVarA);
                    builder2.addAll((Iterable) arrayList5);
                    immutableListBuild = builder2.build();
                } else {
                    ImmutableList.Builder builder3 = ImmutableList.builder();
                    builder3.addAll((Iterable) arrayList4);
                    builder3.addAll((Iterable) arrayList5);
                    immutableListBuild = builder3.build();
                }
                rubVarA.g(immutableListBuild);
                rubVarA.h(1);
                return rubVarA.f();
            }
        });
        return f(krzVar.a(), ieaVar3, ieaVar4, idtVar, sharedPreferences, idsVar, str, iehVar2, resources, context, z, z2, z3, z4, pkgVar);
    }

    public static final Set i(List list, List list2) {
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            HashSet hashSet2 = new HashSet(list);
            hashSet2.add(str);
            hashSet.add(new set(hashSet2));
        }
        return hashSet;
    }

    public static final void s(yjk yjkVar) {
        yjkVar.a();
    }

    public static ntp y(int i) {
        vtw vtwVarM = ucy.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ucy ucyVar = (ucy) vtwVarM.b;
        ucyVar.b |= 8;
        ucyVar.d = i;
        return new ntp(vtwVarM);
    }

    public final ifb b() {
        ifb ifbVar = new ifb((nuh) this.a);
        ifbVar.setHasStableIds(false);
        return ifbVar;
    }

    public final void c(iea ieaVar, ifc ifcVar) {
        ((nuh) this.a).f(ieaVar, ifcVar);
    }

    public final void d(ids idsVar) {
        ((nuh) this.a).g(idsVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public final void e(Object obj, ifc ifcVar) {
        int iB = ifcVar.b(obj);
        if (iB > 0) {
            nuh nuhVar = (nuh) this.a;
            nuhVar.c.add(new iev(nuhVar.a, iB, obj, ifcVar));
            nuhVar.a += iB;
        }
    }

    public final List h(Set set) {
        ArrayList arrayList = new ArrayList();
        if (set.contains("tag_id_unwatched")) {
            arrayList.add(ses.a("dimension_id_unwatched", Collections.singletonList(sev.b("tag_id_unwatched", ((Resources) this.a).getString(R.string.filter_unwatched), "dimension_id_unwatched", "dimension_id_unwatched", Collections.EMPTY_LIST))));
        }
        if (set.contains("tag_id_downloaded")) {
            arrayList.add(ses.a("dimension_id_downloaded", Collections.singletonList(sev.b("tag_id_downloaded", ((Resources) this.a).getString(R.string.filter_downloaded), "dimension_id_downloaded", "dimension_id_downloaded", Collections.EMPTY_LIST))));
        }
        if (set.contains("tag_id_rented")) {
            arrayList.add(ses.a("dimension_id_rented", Collections.singletonList(sev.b("tag_id_rented", ((Resources) this.a).getString(R.string.filter_rented), "dimension_id_rented", "dimension_id_rented", Collections.EMPTY_LIST))));
        }
        boolean zContains = set.contains("tag_id_family_library_sharing");
        boolean zContains2 = set.contains("tag_id_not_family_library_sharing");
        ArrayList arrayList2 = new ArrayList();
        if (zContains) {
            arrayList2.add(sev.b("tag_id_family_library_sharing", ((Resources) this.a).getString(R.string.filter_family_sharing), "dimension_id_family_library_sharing", "dimension_id_family_library_sharing", Collections.EMPTY_LIST));
        }
        if (zContains2) {
            arrayList2.add(sev.b("tag_id_not_family_library_sharing", ((Resources) this.a).getString(R.string.filter_not_sharing), "dimension_id_family_library_sharing", "dimension_id_family_library_sharing", Collections.EMPTY_LIST));
        }
        ses sesVarA = ses.a("dimension_id_family_library_sharing", arrayList2);
        if (!sesVarA.c.isEmpty()) {
            arrayList.add(sesVarA);
        }
        boolean zContains3 = set.contains("tag_id_content_quality_sd");
        boolean zContains4 = set.contains("tag_id_content_quality_hd");
        boolean zContains5 = set.contains("tag_id_content_quality_uhd");
        ArrayList arrayList3 = new ArrayList();
        if (zContains3) {
            arrayList3.add(sev.b("tag_id_content_quality_sd", ((Resources) this.a).getString(R.string.filter_sd), "dimension_id_content_quality", "dimension_id_content_quality", Collections.EMPTY_LIST));
        }
        if (zContains4) {
            arrayList3.add(sev.b("tag_id_content_quality_hd", ((Resources) this.a).getString(R.string.filter_hd), "dimension_id_content_quality", "dimension_id_content_quality", Collections.EMPTY_LIST));
        }
        if (zContains5) {
            arrayList3.add(sev.b("tag_id_content_quality_uhd", ((Resources) this.a).getString(R.string.filter_uhd), "dimension_id_content_quality", "dimension_id_content_quality", Collections.EMPTY_LIST));
        }
        ses sesVarA2 = ses.a("dimension_id_content_quality", arrayList3);
        if (!sesVarA2.c.isEmpty()) {
            arrayList.add(sesVarA2);
        }
        if (set.contains("tag_id_movies_anywhere")) {
            arrayList.add(ses.a("dimension_id_movies_anywhere", Collections.singletonList(sev.b("tag_id_movies_anywhere", ((Resources) this.a).getString(R.string.filter_movies_anywhere), "dimension_id_movies_anywhere", "dimension_id_movies_anywhere", Collections.EMPTY_LIST))));
        }
        if (set.contains("tag_id_upgrade_to_4k")) {
            arrayList.add(ses.a("dimension_id_upgrade", Collections.singletonList(sev.b("tag_id_upgrade_to_4k", ((Resources) this.a).getString(R.string.filter_upgraded_to_4k), "dimension_id_upgrade", "dimension_id_upgrade", Collections.EMPTY_LIST))));
        }
        return arrayList;
    }

    public final nsz j(String str, String str2) {
        List list = nsz.l;
        nsu nsuVar = new nsu((Context) this.a, str);
        nsuVar.d = str2;
        nsuVar.e = new qdy();
        return nsuVar.a();
    }

    public final nsz k() {
        nsu nsuVarJ = nsz.j((Context) this.a, "CHIME");
        nsuVarJ.e = new qdy();
        return nsuVarJ.a();
    }

    public final qcs l(pxg pxgVar, String str) {
        Object systemService = ((Context) this.a).getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] statusBarNotificationArrAW = ocv.aW((NotificationManager) systemService);
        int length = statusBarNotificationArrAW.length;
        int i = 0;
        boolean z = false;
        StatusBarNotification statusBarNotification = null;
        while (true) {
            if (i >= length) {
                if (!z) {
                    break;
                }
            } else {
                StatusBarNotification statusBarNotification2 = statusBarNotificationArrAW[i];
                qct qctVar = qct.a;
                if (qct.k(statusBarNotification2, pxgVar, str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    statusBarNotification = statusBarNotification2;
                }
                i++;
            }
        }
        statusBarNotification = null;
        if (statusBarNotification == null) {
            return null;
        }
        qct qctVar2 = qct.a;
        return qct.i(statusBarNotification);
    }

    public final Map m(pxg pxgVar, Collection collection) {
        qcs qcsVarI;
        Map mapN = n(pxgVar, collection);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(collection, 10)), 16));
        for (Object obj : collection) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) mapN.get((String) obj);
            if (statusBarNotification != null) {
                qct qctVar = qct.a;
                qcsVarI = qct.i(statusBarNotification);
            } else {
                qcsVarI = null;
            }
            linkedHashMap.put(obj, qcsVarI);
        }
        return linkedHashMap;
    }

    public final Map n(pxg pxgVar, Collection collection) {
        Object obj = this.a;
        Set setAq = yfm.aq(collection);
        Object systemService = ((Context) obj).getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] statusBarNotificationArrAW = ocv.aW((NotificationManager) systemService);
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrAW) {
            if (yfm.as(setAq, qct.g(statusBarNotification)) && qct.j(statusBarNotification, pxgVar)) {
                arrayList.add(statusBarNotification);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            String strG = qct.g((StatusBarNotification) obj2);
            if (strG == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            linkedHashMap.put(strG, obj2);
        }
        return linkedHashMap;
    }

    public final Set o(pxg pxgVar, Collection collection) {
        return n(pxgVar, collection).keySet();
    }

    public final uhp p() {
        return ((smc) this.a).a();
    }

    public final uhp q(final plj pljVar, boolean z) {
        final uhp uhpVarC;
        jzs jzsVar = (jzs) this.a;
        uhp uhpVarAS = qtl.aS(pljVar.c, jzsVar);
        xqr xqrVarP = sfy.P(uhpVarAS);
        grz grzVar = new grz(uhpVarAS, pljVar.d, 7);
        ugk ugkVar = ugk.a;
        final uhp uhpVarA = xqrVarP.a(grzVar, ugkVar);
        if (z) {
            List<pli> list = pljVar.b;
            if (list.isEmpty()) {
                uhpVarC = sfy.C(new HashMap());
            } else {
                HashMap map = new HashMap();
                for (pli pliVar : list) {
                    map.put(pliVar, qtl.aS(pliVar.a, jzsVar));
                }
                uhpVarC = sfy.O(map.values()).a(new eet(map, 18), ugkVar);
            }
        } else {
            uhpVarC = sfy.C(new HashMap());
        }
        return sfy.P(uhpVarA, uhpVarC).a(new Callable() { // from class: pms
            @Override // java.util.concurrent.Callable
            public final Object call() {
                vty[] vtyVarArr;
                int i;
                int i2;
                int i3;
                vty[] vtyVarArr2 = (vty[]) sfy.J(uhpVarA);
                Map map2 = (Map) sfy.J(uhpVarC);
                vtw vtwVarM = uao.a.m();
                plj pljVar2 = pljVar;
                ucz uczVar = pljVar2.a;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uao uaoVar = (uao) vtwVarM.b;
                uczVar.getClass();
                uaoVar.c = uczVar;
                boolean z2 = true;
                uaoVar.b |= 1;
                vtw vtwVarM2 = uay.a.m();
                List<pli> list2 = pljVar2.b;
                for (pli pliVar2 : list2) {
                    int i4 = pliVar2.b - 1;
                    if (i4 != 0) {
                        ucz uczVarAk = qtl.ak(pliVar2, z2);
                        uczVarAk.getClass();
                        qtl.am(uczVarAk, pliVar2, pljVar2, vtwVarM);
                        pka pkaVarAr = qtl.ar(pliVar2);
                        vtw vtwVarM3 = uaz.a.m();
                        ucy ucyVar = pkaVarAr.d;
                        if (ucyVar == null) {
                            ucyVar = ucy.a;
                        }
                        if (!vtwVarM3.b.A()) {
                            vtwVarM3.u();
                        }
                        vuc vucVar = vtwVarM3.b;
                        uaz uazVar = (uaz) vucVar;
                        ucyVar.getClass();
                        uazVar.e = ucyVar;
                        uazVar.d = 2;
                        if ((uczVarAk.b & 2) != 0) {
                            if (!vucVar.A()) {
                                vtwVarM3.u();
                            }
                            uaz uazVar2 = (uaz) vtwVarM3.b;
                            uazVar2.c = uczVarAk;
                            uazVar2.b = 3;
                            i3 = 1;
                        } else {
                            uda udaVar = uczVarAk.c;
                            if (udaVar == null) {
                                udaVar = uda.a;
                            }
                            if (!vtwVarM3.b.A()) {
                                vtwVarM3.u();
                            }
                            uaz uazVar3 = (uaz) vtwVarM3.b;
                            udaVar.getClass();
                            uazVar3.c = udaVar;
                            i3 = 1;
                            uazVar3.b = 1;
                        }
                        vty vtyVar = (vty) uax.a.m();
                        int i5 = i4 != 0 ? i4 != i3 ? 3 : 2 : 4;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        uax uaxVar = (uax) vtyVar.b;
                        uaxVar.d = i5 - 1;
                        uaxVar.b |= 2;
                        uaz uazVar4 = (uaz) vtwVarM3.r();
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        uax uaxVar2 = (uax) vtyVar.b;
                        uazVar4.getClass();
                        uaxVar2.c = uazVar4;
                        uaxVar2.b |= 1;
                        if ((pkaVarAr.b & 4) != 0) {
                            long j = pkaVarAr.f;
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            uax uaxVar3 = (uax) vtyVar.b;
                            uaxVar3.b |= 16;
                            uaxVar3.f = j;
                        }
                        qtl.an(vtyVar, (vty[]) map2.get(pliVar2));
                        vtwVarM2.an((uax) vtyVar.r());
                    } else {
                        pka pkaVarAr2 = qtl.ar(pliVar2);
                        if ((pkaVarAr2.b & 4) != 0) {
                            ucy ucyVar2 = pkaVarAr2.d;
                            if (ucyVar2 == null) {
                                ucyVar2 = ucy.a;
                            }
                            vty vtyVar2 = vtyVarArr2[ucyVar2.c];
                            vvd vvdVar = uau.a;
                            vtw vtwVarM4 = uas.a.m();
                            vtw vtwVarM5 = uat.a.m();
                            vtyVarArr = vtyVarArr2;
                            long j2 = pkaVarAr2.f / 1000;
                            if (!vtwVarM5.b.A()) {
                                vtwVarM5.u();
                            }
                            uat uatVar = (uat) vtwVarM5.b;
                            uatVar.b |= 1;
                            uatVar.c = j2;
                            uat uatVar2 = (uat) vtwVarM5.r();
                            if (!vtwVarM4.b.A()) {
                                vtwVarM4.u();
                            }
                            uas uasVar = (uas) vtwVarM4.b;
                            uatVar2.getClass();
                            uasVar.c = uatVar2;
                            i = 1;
                            uasVar.b |= 1;
                            vtyVar2.bL(vvdVar, (uas) vtwVarM4.r());
                        } else {
                            vtyVarArr = vtyVarArr2;
                            i = 1;
                        }
                        ucz uczVarAk2 = qtl.ak(pliVar2, false);
                        if (uczVarAk2 == null) {
                            sij.x(list2.size() == i, "Impressions must be in their own event.");
                            pka pkaVarAq = qtl.aq(pljVar2);
                            vvd vvdVar2 = pmv.a;
                            pkaVarAq.i(vvdVar2);
                            vtr vtrVar = pkaVarAq.l;
                            vub vubVar = (vub) vvdVar2.c;
                            if (vtrVar.m(vubVar)) {
                                pkaVarAq.i(vvdVar2);
                                Object objK = pkaVarAq.l.k(vubVar);
                                if (objK == null) {
                                    objK = vvdVar2.b;
                                } else {
                                    vvdVar2.c(objK);
                                }
                                vty vtyVar3 = (vty) uci.a.m();
                                int i6 = ((pmc) objK).b;
                                if (!vtyVar3.b.A()) {
                                    vtyVar3.u();
                                }
                                uci uciVar = (uci) vtyVar3.b;
                                uciVar.b |= 4;
                                uciVar.d = i6;
                                uci uciVar2 = (uci) vtyVar3.r();
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                uao uaoVar2 = (uao) vtwVarM.b;
                                uciVar2.getClass();
                                uaoVar2.f = uciVar2;
                                uaoVar2.b |= 16;
                            }
                            vvd vvdVar3 = pmv.b;
                            pkaVarAq.i(vvdVar3);
                            vtr vtrVar2 = pkaVarAq.l;
                            vub vubVar2 = (vub) vvdVar3.c;
                            if (vtrVar2.m(vubVar2)) {
                                pkaVarAq.i(vvdVar3);
                                Object objK2 = pkaVarAq.l.k(vubVar2);
                                if (objK2 == null) {
                                    objK2 = vvdVar3.b;
                                } else {
                                    vvdVar3.c(objK2);
                                }
                                ucz uczVar2 = (ucz) objK2;
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                uao uaoVar3 = (uao) vtwVarM.b;
                                uczVar2.getClass();
                                uaoVar3.e = uczVar2;
                                uaoVar3.b |= 2;
                            }
                            vtyVarArr2 = vtyVarArr;
                            qtl.al(pliVar2.c(), false, vtyVarArr2, pljVar2, map2, vtwVarM, vtwVarM2);
                        } else {
                            vtyVarArr2 = vtyVarArr;
                            ucy ucyVar3 = ((pka) pliVar2.a.get(1)).d;
                            if (ucyVar3 == null) {
                                ucyVar3 = ucy.a;
                            }
                            a.ab((ucyVar3.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0);
                            vty vtyVar4 = (vty) uax.a.m();
                            if (!vtyVar4.b.A()) {
                                vtyVar4.u();
                            }
                            uax uaxVar4 = (uax) vtyVar4.b;
                            uaxVar4.d = 3;
                            uaxVar4.b |= 2;
                            uaz uazVar5 = uaz.a;
                            vtw vtwVarM6 = uazVar5.m();
                            if (!vtwVarM6.b.A()) {
                                vtwVarM6.u();
                            }
                            vuc vucVar2 = vtwVarM6.b;
                            uaz uazVar6 = (uaz) vucVar2;
                            uazVar6.c = uczVarAk2;
                            uazVar6.b = 3;
                            if (!vucVar2.A()) {
                                vtwVarM6.u();
                            }
                            uaz uazVar7 = (uaz) vtwVarM6.b;
                            ucyVar3.getClass();
                            uazVar7.e = ucyVar3;
                            uazVar7.d = 2;
                            uaz uazVar8 = (uaz) vtwVarM6.r();
                            if (!vtyVar4.b.A()) {
                                vtyVar4.u();
                            }
                            uax uaxVar5 = (uax) vtyVar4.b;
                            uazVar8.getClass();
                            uaxVar5.c = uazVar8;
                            uaxVar5.b |= 1;
                            qtl.an(vtyVar4, (vty[]) map2.get(pliVar2));
                            pka pkaVarAr3 = qtl.ar(pliVar2);
                            vvd vvdVar4 = pmu.a;
                            pkaVarAr3.i(vvdVar4);
                            boolean zM = pkaVarAr3.l.m((vub) vvdVar4.c);
                            if (zM) {
                                if (!vtyVar4.b.A()) {
                                    vtyVar4.u();
                                }
                                uax uaxVar6 = (uax) vtyVar4.b;
                                uaxVar6.b |= 32;
                                i2 = 1;
                                uaxVar6.g = true;
                            } else {
                                i2 = 1;
                            }
                            qtl.al(pliVar2.c(), zM, vtyVarArr2, pljVar2, map2, vtwVarM, vtwVarM2);
                            if (list2.size() == i2) {
                                vtwVarM2.an((uax) vtyVar4.r());
                            } else {
                                vtw vtwVarM7 = uazVar5.m();
                                ucy ucyVar4 = qtl.ar(pliVar2).d;
                                if (ucyVar4 == null) {
                                    ucyVar4 = ucy.a;
                                }
                                if (!vtwVarM7.b.A()) {
                                    vtwVarM7.u();
                                }
                                uaz uazVar9 = (uaz) vtwVarM7.b;
                                ucyVar4.getClass();
                                uazVar9.e = ucyVar4;
                                uazVar9.d = 2;
                                uaz uazVar10 = (uaz) vtwVarM7.r();
                                if (!vtyVar4.b.A()) {
                                    vtyVar4.u();
                                }
                                uax uaxVar7 = (uax) vtyVar4.b;
                                uazVar10.getClass();
                                uaxVar7.e = uazVar10;
                                uaxVar7.b |= 4;
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                uay uayVar = (uay) vtwVarM2.b;
                                uax uaxVar8 = (uax) vtyVar4.r();
                                uaxVar8.getClass();
                                uayVar.b();
                                uayVar.b.add(uaxVar8);
                            }
                            qtl.am(uczVarAk2, pliVar2, pljVar2, vtwVarM);
                        }
                    }
                    z2 = true;
                }
                pka pkaVarAq2 = qtl.aq(pljVar2);
                vvd vvdVar5 = pmx.a;
                pkaVarAq2.i(vvdVar5);
                if (pkaVarAq2.l.m((vub) vvdVar5.c)) {
                    vtw vtwVarM8 = uap.a.m();
                    ucy ucyVar5 = pkaVarAq2.d;
                    if (ucyVar5 == null) {
                        ucyVar5 = ucy.a;
                    }
                    ucz uczVar3 = ucyVar5.e;
                    if (uczVar3 == null) {
                        uczVar3 = ucz.a;
                    }
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    uap uapVar = (uap) vtwVarM8.b;
                    uczVar3.getClass();
                    uapVar.c = uczVar3;
                    uapVar.b |= 1;
                    uap uapVar2 = (uap) vtwVarM8.r();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uao uaoVar4 = (uao) vtwVarM.b;
                    uapVar2.getClass();
                    uaoVar4.h = uapVar2;
                    uaoVar4.b |= 128;
                }
                if (((uay) vtwVarM2.b).b.size() > 0) {
                    uay uayVar2 = (uay) vtwVarM2.r();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uao uaoVar5 = (uao) vtwVarM.b;
                    uayVar2.getClass();
                    uaoVar5.g = uayVar2;
                    uaoVar5.b |= 64;
                }
                for (vty vtyVar5 : vtyVarArr2) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uao uaoVar6 = (uao) vtwVarM.b;
                    ucj ucjVar = (ucj) vtyVar5.r();
                    ucjVar.getClass();
                    vun vunVar = uaoVar6.d;
                    if (!vunVar.c()) {
                        uaoVar6.d = vuc.s(vunVar);
                    }
                    uaoVar6.d.add(ucjVar);
                }
                return (uao) vtwVarM.r();
            }
        }, ugkVar);
    }

    public final void r(int i, pjs[] pjsVarArr, pjt[] pjtVarArr, yjz yjzVar, yjz yjzVar2, bao baoVar, int i2) {
        pju pjuVar;
        Object ajgVar;
        pju pjuVar2;
        int i3 = i2 & 6;
        bao baoVarD = baoVar.d(1083810443);
        int i4 = i3 == 0 ? (true != baoVarD.D(i) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.H(pjsVarArr) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.H(pjtVarArr) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.H(null) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != baoVarD.H(null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != baoVarD.G(false) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != baoVarD.H(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != baoVarD.H(yjzVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != baoVarD.F(this) ? 268435456 : 536870912;
        }
        if ((306783379 & i4) == 306783378 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(-2135197492);
            int i5 = 0;
            while (true) {
                if (i5 < 2) {
                    Object obj = pjtVarArr[i5].a;
                    if ((obj instanceof pni) && ((pni) obj).d) {
                        pjuVar = null;
                        break;
                    }
                    i5++;
                } else {
                    baoVarD.x(-2135191614);
                    bcp bcpVar = pkp.a;
                    Object objF = baoVarD.f(bcpVar);
                    bas basVar = (bas) baoVarD;
                    basVar.aa();
                    if (objF != null) {
                        baoVarD.x(-1766403746);
                        pjuVar = (pju) baoVarD.f(bcpVar);
                        basVar.aa();
                    } else {
                        baoVarD.x(-1766296641);
                        pju pjuVarC = null;
                        for (View view = (View) baoVarD.f(AndroidCompositionLocals_androidKt.f); view != null; view = (View) view.getParent()) {
                            pjuVarC = pkd.c(view);
                            if (pjuVarC != null || view.getId() == 16908290) {
                                break;
                            }
                        }
                        pjuVar = pjuVarC;
                        basVar.aa();
                    }
                }
            }
            bas basVar2 = (bas) baoVarD;
            basVar2.aa();
            baoVarD.x(-2135170503);
            pkl pklVar = new pkl(i, pjsVarArr, pjtVarArr);
            baoVarD.x(5004770);
            boolean zF = baoVarD.F(pklVar);
            Object objT = basVar2.T();
            if (zF || objT == ban.a) {
                pjr pjrVar = new pjr(y(i), new oyj(19), (pkg) this.a, null);
                for (pjs pjsVar : pjsVarArr) {
                    pjrVar.d(pjsVar);
                }
                for (int i6 = 0; i6 < 2; i6++) {
                    pjrVar.e(pjtVarArr[i6]);
                }
                objT = (pju) pjrVar.a.apply(pjrVar.g(pjrVar.c));
                basVar2.ae(objT);
            }
            pju pjuVar3 = (pju) objT;
            basVar2.aa();
            basVar2.aa();
            bcm.i(pkp.a.c(pjuVar3), yjzVar2, baoVarD, ((i4 >> 21) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            baoVarD.x(-1224400529);
            boolean zH = baoVarD.H(pjuVar) | baoVarD.H(pjuVar3);
            boolean z = (3670016 & i4) == 1048576;
            boolean z2 = (i4 & 14) == 4;
            boolean z3 = (458752 & i4) == 131072;
            boolean z4 = (i4 & 1879048192) == 536870912;
            Object objT2 = basVar2.T();
            if (((z3 || (zH | z | z2)) || z4) || objT2 == ban.a) {
                pjuVar2 = pjuVar;
                ajgVar = new ajg(pjuVar2, pjuVar3, yjzVar, i, 6);
                basVar2.ae(ajgVar);
            } else {
                ajgVar = objT2;
                pjuVar2 = pjuVar;
            }
            basVar2.aa();
            bbn.b(pjuVar2, pjuVar3, (yjv) ajgVar, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kex(this, i, pjsVarArr, pjtVarArr, yjzVar, yjzVar2, i2, 3);
        }
    }

    public final void t(int i, pjs[] pjsVarArr, pjt[] pjtVarArr, yjz yjzVar, yjz yjzVar2, bao baoVar, int i2) {
        int i3;
        int i4;
        yjz yjzVar3;
        yjz yjzVar4;
        yjzVar2.getClass();
        bao baoVarD = baoVar.d(-2099895634);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (true != baoVarD.D(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.H(pjsVarArr) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.H(pjtVarArr) ? 128 : 256;
        }
        int i5 = i4 | 1797120;
        if ((i2 & 12582912) == 0) {
            i5 |= true != baoVarD.H(yjzVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != baoVarD.F(this) ? 33554432 : 67108864;
        }
        if ((38347923 & i5) == 38347922 && baoVarD.K()) {
            baoVarD.t();
            yjzVar4 = yjzVar;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                baoVarD.x(1849434622);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = new dsc(12);
                    basVar.ae(objT);
                }
                basVar.aa();
                yjzVar3 = (yjz) objT;
            } else {
                baoVarD.t();
                yjzVar3 = yjzVar;
            }
            baoVarD.m();
            int i6 = (i5 & 14) | 12582912;
            int i7 = i5 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i8 = i5 & 896;
            int i9 = i5 & 7168;
            int i10 = 57344 & i5;
            int i11 = 458752 & i5;
            int i12 = 3670016 & i5;
            int i13 = i5 << 3;
            r(i3, pjsVarArr, pjtVarArr, yjzVar3, yjzVar2, baoVarD, i6 | i7 | i8 | i9 | i10 | i11 | i12 | (234881024 & i13) | (i13 & 1879048192));
            yjzVar4 = yjzVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kex(this, i, pjsVarArr, pjtVarArr, yjzVar4, yjzVar2, i2, 4);
        }
    }

    public final pjw u() {
        return new pjw((pjy) ((vtw) this.a).r());
    }

    public final void v(pjv pjvVar) {
        pjvVar.getClass();
        Object obj = this.a;
        vty vtyVar = (vty) obj;
        vvd vvdVar = pjvVar.b;
        a.ab(!vtyVar.bJ(vvdVar));
        int iA = vvdVar.a();
        vtw vtwVar = (vtw) obj;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        pjy pjyVar = (pjy) vtyVar.b;
        pjy pjyVar2 = pjy.a;
        vuj vujVar = pjyVar.d;
        if (!vujVar.c()) {
            pjyVar.d = vuc.q(vujVar);
        }
        pjyVar.d.g(iA);
        vtyVar.bL(vvdVar, pjvVar.a);
    }

    public final void w(pkg pkgVar) {
        ((pji) this.a).b(new pkt(pkgVar, 3));
    }

    public final void x(zuw zuwVar) {
        ((nuh) this.a).z(zuwVar);
    }

    public ntp(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ntp(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public ntp(yfo yfoVar, yfo yfoVar2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
    }

    public ntp(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public ntp(qja qjaVar) {
        qjaVar.getClass();
        this.a = qjaVar;
    }

    public ntp(byte[] bArr) {
        this.a = new nuh();
    }

    private ntp(iea ieaVar, ieh iehVar, Context context, pkg pkgVar) {
        this.a = ieaVar;
        iff iffVar = new iff();
        TypedValue typedValue = new TypedValue();
        iffVar.f(context.getTheme().resolveAttribute(R.attr.details_distributors_section_layout, typedValue, true) ? typedValue.resourceId : -1);
        iffVar.c = new mxj(iehVar, pkgVar, 0);
        iffVar.g(ksd.a());
        iffVar.d();
        iffVar.c();
    }

    public ntp(Bundle bundle) {
        this.a = npj.r(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    private ntp() {
        this.a = new CopyOnWriteArrayList();
    }

    public ntp(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicReference();
    }

    private ntp(vtw vtwVar) {
        sij.o(((ucy) vtwVar.b).d != 0, "VeIdentifier must be non-zero");
        this.a = vtwVar;
    }

    public ntp(int i) {
        vty vtyVar = (vty) pjy.a.m();
        this.a = vtyVar;
        vty vtyVar2 = vtyVar;
        if (!vtyVar2.b.A()) {
            vtyVar2.u();
        }
        pjy pjyVar = (pjy) vtyVar.b;
        pjyVar.c = i - 1;
        pjyVar.b |= 1;
    }

    public ntp(qei qeiVar) {
        qeiVar.getClass();
        this.a = qeiVar;
    }
}
