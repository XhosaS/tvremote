package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcp implements qbr {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final pwy c;
    private final tst d;
    private final pwy e;
    private final qcd f;
    private final qbp g;
    private final qcg h;
    private final pvg i;
    private final qei j;
    private final Map k;
    private final qcv l;
    private final xbw m;
    private final qoj n;
    private final tst o;
    private final xbw p;
    private final yyk q;
    private final nsf r;
    private final ntp s;

    public qcp(Context context, pwy pwyVar, tst tstVar, pwy pwyVar2, qcd qcdVar, nsf nsfVar, qbp qbpVar, qcg qcgVar, pvg pvgVar, qei qeiVar, Map map, osk oskVar, qcv qcvVar, ntp ntpVar, xbw xbwVar, qoj qojVar, tst tstVar2, xbw xbwVar2) {
        qcdVar.getClass();
        nsfVar.getClass();
        qbpVar.getClass();
        qcgVar.getClass();
        pvgVar.getClass();
        qeiVar.getClass();
        oskVar.getClass();
        xbwVar.getClass();
        qojVar.getClass();
        xbwVar2.getClass();
        this.b = context;
        this.c = pwyVar;
        this.d = tstVar;
        this.e = pwyVar2;
        this.f = qcdVar;
        this.r = nsfVar;
        this.g = qbpVar;
        this.h = qcgVar;
        this.i = pvgVar;
        this.j = qeiVar;
        this.k = map;
        this.l = qcvVar;
        this.s = ntpVar;
        this.m = xbwVar;
        this.n = qojVar;
        this.o = tstVar2;
        this.p = xbwVar2;
        this.q = new yyk();
    }

    private final qej k() {
        qej qejVar = this.j.c;
        if (qejVar != null) {
            return qejVar;
        }
        throw new IllegalArgumentException("SystemTrayNotificationConfig must be set in GnpConfig for showing system tray notifications.");
    }

    private final synchronized void l(Context context, String str, Notification notification) {
        new crv(context).b(str, 0, notification);
        a.l().v("Added to tray: tag = %s", str);
        ((qer) ((ttd) this.o).a).b();
    }

    private final synchronized void m(qen qenVar, ImmutableList immutableList) {
        pxg pxgVarAZ = ocv.aZ(qenVar);
        ArrayList arrayList = new ArrayList(yfm.z(immutableList, 10));
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(((qis) it.next()).n);
        }
        Set setAq = yfm.aq(arrayList);
        ArrayList arrayList2 = new ArrayList(yfm.z(immutableList, 10));
        Iterator<E> it2 = immutableList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((qis) it2.next()).a);
        }
        for (Map.Entry entry : this.s.m(pxgVarAZ, yfm.aq(arrayList2)).entrySet()) {
            String str = (String) entry.getKey();
            qcs qcsVar = (qcs) entry.getValue();
            if (qcsVar == null) {
                ((tvk) a.e()).v("No tray identifier found for thread %s", str);
            } else {
                q(this.b, qcsVar);
            }
        }
        for (Object obj : setAq) {
            obj.getClass();
            p(this.b, qct.e(pxgVarAZ, (String) obj));
        }
    }

    private final void n(qen qenVar, List list, pvu pvuVar, pvi pviVar) {
        Multimap multimap = pvuVar.b;
        if (multimap == null) {
            o(qenVar, list, pvuVar.a, pvuVar.d, pvuVar.c, pviVar);
            return;
        }
        Map mapAsMap = multimap.asMap();
        mapAsMap.getClass();
        for (Map.Entry entry : mapAsMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            vht vhtVar = (vht) key;
            Object value = entry.getValue();
            value.getClass();
            Set setAq = yfm.aq((Collection) value);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (setAq.contains(((qis) obj).a)) {
                    arrayList.add(obj);
                }
            }
            o(qenVar, arrayList, vhtVar, pvuVar.d, pvuVar.c, pviVar);
        }
    }

    private final void o(qen qenVar, List list, vht vhtVar, boolean z, Multimap multimap, pvi pviVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vht vhtVar2 = vht.LIMIT_REACHED;
        if (vhtVar == vhtVar2 && multimap != null) {
            for (Object obj : multimap.keySet()) {
                obj.getClass();
                pvt pvtVar = (pvt) obj;
                Collection collection = multimap.get(pvtVar);
                collection.getClass();
                Set setAq = yfm.aq(collection);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (setAq.contains(((qis) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                linkedHashSet.addAll(setAq);
                pvg pvgVar = this.i;
                vie vieVar = vie.REMOVED;
                pvh pvhVarB = pvgVar.b(vieVar);
                pvhVarB.e(qenVar);
                pvhVarB.d(arrayList);
                pvo pvoVar = (pvo) pvhVarB;
                pvoVar.J = 2;
                pvoVar.n = vhtVar;
                pvoVar.E = z;
                boolean z2 = false;
                if (pvoVar.d == vieVar && pvoVar.n == vhtVar2) {
                    z2 = true;
                }
                a.ab(z2);
                pvoVar.D = pvtVar;
                pvoVar.A = pviVar;
                pvhVarB.a();
            }
        }
        if (linkedHashSet.size() == list.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!linkedHashSet.contains(((qis) obj3).a)) {
                arrayList2.add(obj3);
            }
        }
        pvh pvhVarB2 = this.i.b(vie.REMOVED);
        pvhVarB2.e(qenVar);
        pvhVarB2.d(arrayList2);
        pvo pvoVar2 = (pvo) pvhVarB2;
        pvoVar2.J = 2;
        pvoVar2.n = vhtVar;
        pvoVar2.E = z;
        pvoVar2.A = pviVar;
        pvhVarB2.a();
    }

    private final synchronized void p(Context context, String str) {
        r(context, 0, str);
    }

    private final synchronized void q(Context context, qcs qcsVar) {
        r(context, qcsVar.b, qcsVar.c);
    }

    private final synchronized void r(Context context, int i, String str) {
        new crv(context).a(str, i);
        a.l().x("Removed from tray: id= %d, tag = %s", i, str);
        tst tstVar = this.o;
        try {
            Object systemService = this.b.getSystemService((Class<Object>) NotificationManager.class);
            systemService.getClass();
            for (StatusBarNotification statusBarNotification : ocv.aW((NotificationManager) systemService)) {
                qct qctVar = qct.a;
                statusBarNotification.getClass();
                if (qct.g(statusBarNotification) != null) {
                    return;
                }
            }
            ((qer) ((ttd) tstVar).a).a();
        } catch (RuntimeException e) {
            ((tvk) ((tvk) a.f()).i(e)).s("Failed to fetch notifications, so not disabling receiver.");
        }
    }

    private final synchronized void s(qen qenVar, List list, List list2, pvi pviVar, pvu pvuVar) throws Throwable {
        Throwable th;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (list.isEmpty()) {
                    a.l().s("Remove notifications skipped due to empty thread list.");
                    return;
                }
                pxg pxgVarAZ = ocv.aZ(qenVar);
                String[] strArr = (String[]) list.toArray(new String[0]);
                for (Map.Entry entry : this.s.m(pxgVarAZ, list).entrySet()) {
                    String str = (String) entry.getKey();
                    qcs qcsVar = (qcs) entry.getValue();
                    if (qcsVar == null) {
                        ((tvk) a.e()).v("No tray identifier found for thread %s", str);
                    } else {
                        q(this.b, qcsVar);
                    }
                }
                this.r.n(qenVar, (String[]) Arrays.copyOf(strArr, strArr.length));
                ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qis) it.next()).n);
                }
                for (String str2 : yfm.aq(arrayList)) {
                    qen qenVar2 = qenVar;
                    t(qct.e(pxgVarAZ, str2), str2, qenVar2, null, null);
                    qenVar = qenVar2;
                }
                qen qenVar3 = qenVar;
                if (!list2.isEmpty() && pvuVar != null) {
                    n(qenVar3, list2, pvuVar, pviVar);
                }
                a.l().s("Remove notifications completed.");
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    private final boolean t(String str, String str2, qen qenVar, qis qisVar, qrd qrdVar) throws Resources.NotFoundException {
        nsf nsfVar = this.r;
        boolean zE = yks.e("chime_default_group", str2);
        ImmutableList immutableListL = nsfVar.l(qenVar, str2);
        pxg pxgVarAZ = ocv.aZ(qenVar);
        immutableListL.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(immutableListL, 10));
        Iterator it = immutableListL.iterator();
        while (it.hasNext()) {
            arrayList.add(((qis) it.next()).a);
        }
        Set setO = this.s.o(pxgVarAZ, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = immutableListL.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            qis qisVar2 = (qis) next;
            if (qisVar != null && yks.e(qisVar.a, qisVar2.a)) {
                z = true;
            }
            boolean zContains = setO.contains(qisVar2.a);
            if (z || zContains) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        boolean z2 = true;
        yfw yfwVar = new yfw(arrayList2, arrayList3);
        List list = (List) yfwVar.a;
        List list2 = (List) yfwVar.b;
        if (!list2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(yfm.z(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((qis) it3.next()).a);
            }
            String[] strArr = (String[]) arrayList4.toArray(new String[0]);
            nsfVar.n(qenVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        if (list.isEmpty()) {
            p(this.b, str);
            return false;
        }
        if (list.size() < (zE ? k().j : k().k)) {
            Object systemService = this.b.getSystemService("notification");
            systemService.getClass();
            StatusBarNotification[] statusBarNotificationArrAW = ocv.aW((NotificationManager) systemService);
            int length = statusBarNotificationArrAW.length;
            int i = 0;
            while (i < length) {
                StatusBarNotification statusBarNotification = statusBarNotificationArrAW[i];
                if (!yks.e(str, statusBarNotification.getTag()) || statusBarNotification.getId() != 0) {
                    i++;
                    z2 = z2;
                }
            }
            boolean z3 = z2;
            a.l().s("Skipped creating summary notification.");
            return z3;
        }
        qcd qcdVar = this.f;
        a.H(list != null ? z2 : false);
        a.H(!list.isEmpty());
        Context context = qcdVar.b;
        crm crmVar = new crm(context);
        crmVar.C = 2;
        qej qejVar = qcdVar.g;
        int i2 = qejVar.a;
        crmVar.o(i2);
        int iAL = a.aL(((qis) Collections.max(list, new qbi(2))).l.l);
        ?? r7 = iAL;
        if (iAL == 0) {
            r7 = z2;
        }
        crmVar.j = qcd.i(r7);
        HashSet hashSet = new HashSet();
        Iterator it4 = list.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            vld vldVar = ((qis) it4.next()).l;
            if ((vldVar.b & 262144) != 0) {
                hashSet.add(vldVar.v);
            } else {
                i3++;
            }
        }
        String str3 = (hashSet.size() == z2 && i3 == 0) ? (String) hashSet.iterator().next() : (qcd.g(qenVar) && qejVar.f) ? qenVar.b : null;
        if (!TextUtils.isEmpty(str3)) {
            crmVar.q(str3);
        }
        qcdVar.e.d(crmVar, (qis) list.get(0));
        int size = list.size();
        String string = context.getString(qejVar.b);
        String quantityString = context.getResources().getQuantityString(R.plurals.public_notification_text, size, Integer.valueOf(size));
        crm crmVar2 = new crm(context);
        crmVar2.h(string);
        crmVar2.g(quantityString);
        crmVar2.o(i2);
        if (qcd.g(qenVar)) {
            crmVar2.q(qenVar.b);
        }
        Notification notificationA = crmVar2.a();
        crmVar.z = notificationA;
        qcg qcgVar = qcdVar.c;
        crmVar.g = qcgVar.c(str, qenVar, list, qrdVar);
        crmVar.j(qcgVar.d(str, qenVar, list));
        qrk qrkVar = new qrk(crmVar, null, notificationA, null);
        ocv.bn(list);
        tst tstVarB = this.c.b();
        if (tstVarB.g()) {
            ((qro) tstVarB.c()).c();
        }
        crm crmVar3 = qrkVar.a;
        crmVar3.s = true;
        crmVar3.r = str;
        Notification notificationA2 = crmVar3.a();
        notificationA2.getClass();
        l(this.b, str, notificationA2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:452:0x09ef, code lost:
    
        if (r1.a(r33, r6, r5, r9) != r11) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0a18, code lost:
    
        if (r7.i(r6, r2, r3, r4.a, r5, r12, r9) != r11) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a1a, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.qbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qis r35, defpackage.pxh r36, defpackage.yih r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.a(qis, pxh, yih):java.lang.Object");
    }

    @Override // defpackage.qbr
    public final synchronized List b(qen qenVar, List list, pvi pviVar, pvu pvuVar) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            String[] strArr = (String[]) list.toArray(new String[0]);
            ImmutableList immutableListM = this.r.m(qenVar, (String[]) Arrays.copyOf(strArr, strArr.length));
            immutableListM.getClass();
            s(qenVar, list, immutableListM, pviVar, pvuVar);
            return immutableListM;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.qbr
    public final synchronized List c(qen qenVar, List list, pvu pvuVar) throws Throwable {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(list, 10)), 16));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    vko vkoVar = (vko) it.next();
                    yfw yfwVar = new yfw(vkoVar.c, Long.valueOf(vkoVar.d));
                    linkedHashMap.put(yfwVar.a, yfwVar.b);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            nsf nsfVar = this.r;
            String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[0]);
            ImmutableList immutableListM = nsfVar.m(qenVar, (String[]) Arrays.copyOf(strArr, strArr.length));
            immutableListM.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : immutableListM) {
                qis qisVar = (qis) obj;
                if (((Number) yfm.g(linkedHashMap, qisVar.a)).longValue() > qisVar.c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((qis) it2.next()).a);
            }
            s(qenVar, arrayList2, arrayList, null, pvuVar);
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.qbr
    public final synchronized void d(qen qenVar) {
        ImmutableList immutableListK = this.r.k(qenVar);
        immutableListK.getClass();
        m(qenVar, immutableListK);
    }

    @Override // defpackage.qbr
    public final synchronized void e(qen qenVar, pvu pvuVar) {
        nsf nsfVar = this.r;
        ImmutableList immutableListK = nsfVar.k(qenVar);
        rzy rzyVar = new rzy((short[]) null);
        rzyVar.D("1");
        ((qas) nsfVar.b).b(qenVar, ImmutableList.of(rzyVar.C()));
        immutableListK.getClass();
        m(qenVar, immutableListK);
        if (immutableListK.isEmpty()) {
            return;
        }
        n(qenVar, immutableListK, pvuVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.pxh r21, defpackage.qis r22, defpackage.qis r23, defpackage.qcu r24, defpackage.yih r25) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.f(pxh, qis, qis, qcu, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, lie] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qis r32, java.lang.String r33, defpackage.pxh r34, java.lang.String r35, defpackage.crm r36, defpackage.qrj r37, defpackage.qak r38, defpackage.qis r39, boolean r40, defpackage.yih r41) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.g(qis, java.lang.String, pxh, java.lang.String, crm, qrj, qak, qis, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0172, code lost:
    
        if (r0 != r11) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.qis r19, defpackage.pxh r20, java.lang.String r21, defpackage.crm r22, defpackage.qrj r23, defpackage.qak r24, defpackage.qis r25, boolean r26, defpackage.yih r27) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.h(qis, pxh, java.lang.String, crm, qrj, qak, qis, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if ((r9.getContext().get(r2) != null ? r0.a(r9) : defpackage.ykr.l(new defpackage.qhw(r2), new defpackage.qhy(r13, r0, (defpackage.yih) null, 0), r9)) != r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.qis r16, defpackage.pxh r17, java.lang.String r18, defpackage.crm r19, defpackage.qrj r20, boolean r21, defpackage.yih r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.i(qis, pxh, java.lang.String, crm, qrj, boolean, yih):java.lang.Object");
    }

    public final Object j(qis qisVar, pxh pxhVar, String str, crm crmVar, qrj qrjVar, boolean z, yih yihVar) throws Resources.NotFoundException {
        qcs qcsVarL;
        Context context = this.b;
        qen qenVarA = pxhVar.a();
        Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        if (ocv.aW((NotificationManager) systemService).length >= (true != qtl.G() ? 49 : 24)) {
            pvh pvhVarA = this.i.a(vhq.MAX_NOTIFICATION_COUNT_REACHED);
            pvo pvoVar = (pvo) pvhVarA;
            pvoVar.J = 2;
            pvhVarA.e(qenVarA);
            pvhVarA.c(qisVar);
            pvoVar.A = pxhVar.c;
            pvhVarA.a();
            return ygi.a;
        }
        nsf nsfVar = this.r;
        boolean z2 = pxhVar.f;
        Pair pairC = ((qas) nsfVar.b).c(qenVarA, qisVar, z2);
        qak qakVar = (qak) pairC.first;
        if (z2 || qakVar == qak.INSERTED || qakVar == qak.REPLACED) {
            qis qisVar2 = (qis) ((tst) pairC.second).f();
            if (xgs.c()) {
                qakVar.getClass();
                Object objH = h(qisVar, pxhVar, str, crmVar, qrjVar, qakVar, qisVar2, z, yihVar);
                if (objH == yio.a) {
                    return objH;
                }
            } else {
                pxg pxgVar = pxhVar.a;
                if (qisVar2 != null && (qcsVarL = this.s.l(pxgVar, qisVar2.a)) != null && !yks.e(qcsVarL.c, str)) {
                    q(context, qcsVarL);
                }
                qakVar.getClass();
                Object objG = g(qisVar, str, pxhVar, str, crmVar, qrjVar, qakVar, qisVar2, z, yihVar);
                if (objG == yio.a) {
                    return objG;
                }
            }
        } else if (qakVar == qak.REJECTED_SAME_VERSION) {
            pvh pvhVarA2 = this.i.a(vhq.DROPPED_BY_VERSION);
            pvo pvoVar2 = (pvo) pvhVarA2;
            pvoVar2.J = 2;
            pvhVarA2.e(qenVarA);
            pvhVarA2.c(qisVar);
            pvoVar2.A = pxhVar.c;
            pvhVarA2.a();
        }
        return ygi.a;
    }
}
