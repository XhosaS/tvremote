package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class osk {
    public static volatile osk e;

    public osk() {
    }

    public static String A(uvu uvuVar) {
        uvuVar.getClass();
        int iOrdinal = uvuVar.ordinal();
        if (iOrdinal == 1) {
            if (ctk.b()) {
                return "android.permission.POST_NOTIFICATIONS";
            }
            throw new IllegalArgumentException("ANDROID_POST_NOTIFICATIONS should not be used on Android versions before T");
        }
        if (iOrdinal == 2) {
            return "android.permission.CAMERA";
        }
        if (iOrdinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        Objects.toString(uvuVar);
        throw new IllegalArgumentException("Invalid AndroidPermissionType ".concat(uvuVar.toString()));
    }

    public static int B(vlo vloVar) {
        vloVar.getClass();
        switch (vloVar.ordinal()) {
            case 9:
                return 5;
            case 10:
                return 2;
            case 11:
                return 3;
            case 12:
                return 4;
            case 13:
                return 7;
            case 14:
                return 8;
            default:
                return 1;
        }
    }

    public static Duration C(uwl uwlVar, uxd uxdVar) {
        Object next;
        uwlVar.getClass();
        uxdVar.getClass();
        vun vunVar = uwlVar.c;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            uxd uxdVarB = uxd.b(((uwk) next).c);
            if (uxdVarB == null) {
                uxdVarB = uxd.UNRECOGNIZED;
            }
            if (uxdVarB.equals(uxdVar)) {
                break;
            }
        }
        uwk uwkVar = (uwk) next;
        if (uwkVar != null) {
            vtl vtlVar = uwkVar.d;
            if (vtlVar == null) {
                vtlVar = vtl.a;
            }
            if (vtlVar != null) {
                return vyf.c(vtlVar);
            }
        }
        vtl vtlVar2 = uwlVar.d;
        if (vtlVar2 == null) {
            vtlVar2 = vtl.a;
        }
        if (vxd.a(vtlVar2, vxd.a) <= 0) {
            return null;
        }
        vtl vtlVar3 = uwlVar.d;
        if (vtlVar3 == null) {
            vtlVar3 = vtl.a;
        }
        vtlVar3.getClass();
        return vyf.c(vtlVar3);
    }

    public static String D(dze dzeVar) {
        String str = dzeVar.K;
        return str != null ? ylh.G(str, ":", str) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    public static Map G(ovi oviVar) {
        Map map;
        Iterator it = oviVar.f.values().iterator();
        if (it.hasNext()) {
            ?? next = it.next();
            while (it.hasNext()) {
                next = (Map) next;
                for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                    next.put((String) entry.getKey(), (otx) entry.getValue());
                }
            }
            map = next;
        } else {
            map = null;
        }
        Map map2 = map;
        return map2 == null ? yhc.a : map2;
    }

    public static String H(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static int I(evz evzVar) {
        return Integer.parseInt(evzVar.a.toString()) + 1;
    }

    public static String J(eph ephVar) throws JSONException {
        JSONObject jSONObject = null;
        if (ephVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                Object obj = ephVar.c;
                if (obj != null) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("periodUid", ((evz) obj).a);
                        jSONObject.put("adGroupIndex", ((evz) obj).b);
                        jSONObject.put("adIndexInAdGroup", ((evz) obj).c);
                        jSONObject.put("windowSequenceNumber", ((evz) obj).d);
                        jSONObject.put("nextAdGroupIndex", ((evz) obj).e).getClass();
                    } catch (JSONException unused) {
                    }
                }
                jSONObject2.put("mediaPeriodId", jSONObject).getClass();
            } catch (JSONException unused2) {
            }
            jSONObject = jSONObject2;
        }
        return String.valueOf(jSONObject);
    }

    public static aafi K(String str, Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (it.hasNext()) {
            sb.append("account NOT IN(?");
            arrayList.add((String) it.next());
            while (it.hasNext()) {
                sb.append(", ?");
                arrayList.add((String) it.next());
            }
            sb.append(")");
        }
        return sim.l(str, sb, arrayList);
    }

    public static otw L(zuw zuwVar) {
        zuwVar.getClass();
        int i = zuwVar.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? otw.e : otw.f : otw.e : otw.d : otw.c : otw.b : otw.a;
    }

    public static qpv M(String str) {
        byte[] bArrDecode = Base64.decode(str, 10);
        qqv qqvVar = qqv.a;
        int length = bArrDecode.length;
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        vuc vucVarP = vuc.p(qqvVar, bArrDecode, 0, length, vtp.a);
        vuc.B(vucVarP);
        qqv qqvVar2 = (qqv) vucVarP;
        qqvVar2.getClass();
        return qtl.q(qqvVar2);
    }

    public static qqv N(qpv qpvVar) {
        qpvVar.getClass();
        vtw vtwVarM = qqv.a.m();
        vtwVarM.getClass();
        if (qpvVar instanceof qpz) {
            vtw vtwVarM2 = qqs.a.m();
            vtwVarM2.getClass();
            String str = ((qpz) qpvVar).a;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ((qqs) vtwVarM2.b).b = str;
            vuc vucVarO = vtwVarM2.r();
            vucVarO.getClass();
            qqs qqsVar = (qqs) vucVarO;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            qqv qqvVar = (qqv) vtwVarM.b;
            qqvVar.c = qqsVar;
            qqvVar.b = 1;
        } else if (qpvVar instanceof qpw) {
            vtw vtwVarM3 = qqq.a.m();
            vtwVarM3.getClass();
            String str2 = ((qpw) qpvVar).a;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            ((qqq) vtwVarM3.b).b = str2;
            vuc vucVarO2 = vtwVarM3.r();
            vucVarO2.getClass();
            qqq qqqVar = (qqq) vucVarO2;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            qqv qqvVar2 = (qqv) vtwVarM.b;
            qqvVar2.c = qqqVar;
            qqvVar2.b = 4;
        } else if (qpvVar instanceof qpx) {
            vtw vtwVarM4 = qqr.a.m();
            vtwVarM4.getClass();
            qpx qpxVar = (qpx) qpvVar;
            String str3 = qpxVar.a;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar = vtwVarM4.b;
            ((qqr) vucVar).b = str3;
            long j = qpxVar.b;
            if (!vucVar.A()) {
                vtwVarM4.u();
            }
            ((qqr) vtwVarM4.b).c = j;
            vuc vucVarO3 = vtwVarM4.r();
            vucVarO3.getClass();
            qqr qqrVar = (qqr) vucVarO3;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            qqv qqvVar3 = (qqv) vtwVarM.b;
            qqvVar3.c = qqrVar;
            qqvVar3.b = 5;
        } else if (qpvVar instanceof qqn) {
            vtw vtwVarM5 = qqu.a.m();
            vtwVarM5.getClass();
            vuc vucVarO4 = vtwVarM5.r();
            vucVarO4.getClass();
            qqu qquVar = (qqu) vucVarO4;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            qqv qqvVar4 = (qqv) vtwVarM.b;
            qqvVar4.c = qquVar;
            qqvVar4.b = 2;
        } else {
            if (!(qpvVar instanceof qql)) {
                throw new yfu();
            }
            vtw vtwVarM6 = qqt.a.m();
            vtwVarM6.getClass();
            vuc vucVarO5 = vtwVarM6.r();
            vucVarO5.getClass();
            qqt qqtVar = (qqt) vucVarO5;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            qqv qqvVar5 = (qqv) vtwVarM.b;
            qqvVar5.c = qqtVar;
            qqvVar5.b = 3;
        }
        vuc vucVarO6 = vtwVarM.r();
        vucVarO6.getClass();
        return (qqv) vucVarO6;
    }

    public static String O(qpv qpvVar) {
        return ai(N(qpvVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String P(defpackage.qen r2, int r3) {
        /*
            if (r2 == 0) goto L45
            xfo r0 = defpackage.xfo.a
            xfp r0 = r0.get()
            boolean r0 = r0.d()
            if (r0 == 0) goto L15
            long r0 = r2.a
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L43
        L15:
            qpv r0 = r2.b()
            java.lang.Class r0 = r0.getClass()
            int r1 = defpackage.ylg.a
            ykl r1 = new ykl
            r1.<init>(r0)
            int r0 = r1.hashCode()
            qpv r2 = r2.b()
            java.lang.String r2 = r2.a()
            int r2 = r2.hashCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L43:
            if (r2 != 0) goto L47
        L45:
            java.lang.String r2 = "no_account"
        L47:
            java.lang.String r0 = "GNP_SDK_JOB::"
            java.lang.String r1 = "::"
            java.lang.String r2 = defpackage.a.cy(r3, r2, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osk.P(qen, int):java.lang.String");
    }

    public static void Q(gqa gqaVar, qjl qjlVar, Long l) {
        gqaVar.b("GNP_SDK_JOB");
        if (l != null) {
            gqaVar.d(l.longValue(), TimeUnit.MILLISECONDS);
        }
        int iH = qjlVar.h();
        Long lC = qjlVar.c();
        if (iH == 0 || lC == null) {
            return;
        }
        int i = iH + (-1) != 0 ? 1 : 2;
        long jLongValue = lC.longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        gqaVar.a = true;
        guw guwVar = gqaVar.c;
        guwVar.y = i;
        long millis = timeUnit.toMillis(jLongValue);
        if (millis > 18000000) {
            gpn.b();
            Log.w(guw.a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            gpn.b();
            Log.w(guw.a, "Backoff delay duration less than minimum value");
        }
        guwVar.m = ykn.p(millis, 10000L, 18000000L);
    }

    public static /* synthetic */ Object S(qjm qjmVar, qjl qjlVar, qen qenVar, Bundle bundle, yih yihVar, int i) {
        if ((i & 4) != 0) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if ((i & 2) != 0) {
            qenVar = null;
        }
        return qjmVar.b(qjlVar, qenVar, bundle2, null, yihVar);
    }

    public static String T(Context context, String str) {
        String str2 = nhd.a;
        String strC = nhk.c(context, str);
        strC.getClass();
        return strC;
    }

    public static List U(Context context) {
        return yfm.aX(nhd.a(context));
    }

    public static qin V() {
        qin qinVar = new qin();
        qinVar.c(vld.a);
        qinVar.v(vmb.a);
        qinVar.e(vll.DELETION_STATUS_UNKNOWN);
        qinVar.s(1);
        qinVar.u(1);
        qinVar.m(0L);
        qinVar.l(0L);
        qinVar.g(0L);
        qinVar.f(0L);
        qinVar.d(0L);
        qinVar.i("chime_default_group");
        qinVar.k(0L);
        List list = Collections.EMPTY_LIST;
        list.getClass();
        qinVar.n(list);
        List list2 = Collections.EMPTY_LIST;
        list2.getClass();
        qinVar.b(list2);
        qinVar.t(1);
        vsz vszVar = vsz.b;
        vszVar.getClass();
        qinVar.o(vszVar);
        Set set = Collections.EMPTY_SET;
        set.getClass();
        qinVar.h(set);
        return qinVar;
    }

    public static qis W(vlq vlqVar) {
        vlqVar.getClass();
        qin qinVarV = V();
        String str = vlqVar.e;
        str.getClass();
        qinVarV.j(str);
        vmm vmmVar = vlqVar.g;
        if (vmmVar == null) {
            vmmVar = vmm.a;
        }
        int iB = vmb.b(vmmVar.b);
        if (iB == 0) {
            iB = vmb.a;
        }
        if (iB == 0) {
            throw null;
        }
        qinVarV.v(iB);
        vmm vmmVar2 = vlqVar.g;
        if (vmmVar2 == null) {
            vmmVar2 = vmm.a;
        }
        vll vllVarB = vll.b(vmmVar2.c);
        if (vllVarB == null) {
            vllVarB = vll.DELETION_STATUS_UNKNOWN;
        }
        vllVarB.getClass();
        qinVarV.e(vllVarB);
        vmm vmmVar3 = vlqVar.g;
        if (vmmVar3 == null) {
            vmmVar3 = vmm.a;
        }
        int iBm = a.bm(vmmVar3.d);
        if (iBm == 0) {
            iBm = 1;
        }
        qinVarV.s(iBm);
        vmm vmmVar4 = vlqVar.g;
        if (vmmVar4 == null) {
            vmmVar4 = vmm.a;
        }
        int iBm2 = a.bm(vmmVar4.e);
        if (iBm2 == 0) {
            iBm2 = 1;
        }
        qinVarV.u(iBm2);
        qinVarV.m(vlqVar.i);
        qinVarV.l(vlqVar.j);
        vld vldVar = vlqVar.c == 12 ? (vld) vlqVar.d : vld.a;
        vldVar.getClass();
        qinVarV.c(vldVar);
        vun vunVar = vlqVar.h;
        vunVar.getClass();
        qinVarV.n(vunVar);
        qinVarV.d(vlqVar.f);
        qinVarV.q(vlqVar.k);
        vsl vslVar = vlqVar.l;
        if (vslVar == null) {
            vslVar = vsl.a;
        }
        qinVarV.p(vslVar);
        qinVarV.r(vlqVar.m);
        qinVarV.g(vlqVar.n);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vtl vtlVar = vlqVar.o;
        if (vtlVar == null) {
            vtlVar = vtl.a;
        }
        qinVarV.f(timeUnit.toMillis(vtlVar.b));
        int iBm3 = a.bm(vlqVar.p);
        qinVarV.t(iBm3 != 0 ? iBm3 : 1);
        vnz vnzVar = vlqVar.q;
        if (vnzVar == null) {
            vnzVar = vnz.a;
        }
        qinVarV.a = vnzVar;
        qinVarV.b |= 1048576;
        vsz vszVar = vlqVar.s;
        vszVar.getClass();
        qinVarV.o(vszVar);
        String str2 = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).n;
        str2.getClass();
        if (str2.length() > 0) {
            String str3 = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).n;
            str3.getClass();
            qinVarV.i(str3);
        }
        vla vlaVar = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).i;
        if (vlaVar == null) {
            vlaVar = vla.a;
        }
        vun vunVar2 = vlaVar.e;
        vunVar2.getClass();
        if (!vunVar2.isEmpty()) {
            vla vlaVar2 = (vlqVar.c == 12 ? (vld) vlqVar.d : vld.a).i;
            if (vlaVar2 == null) {
                vlaVar2 = vla.a;
            }
            vun vunVar3 = vlaVar2.e;
            vunVar3.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = vunVar3.iterator();
            while (it.hasNext()) {
                qir qirVar = (qir) qir.a((vks) it.next()).f();
                if (qirVar != null) {
                    arrayList.add(qirVar);
                }
            }
            qinVarV.b(arrayList);
        }
        vuj vujVar = vlqVar.t;
        vujVar.getClass();
        if (!vujVar.isEmpty()) {
            vuj vujVar2 = vlqVar.t;
            vujVar2.getClass();
            qinVarV.h(yfm.aq(vujVar2));
        }
        return qinVarV.a();
    }

    public static vko X(qip qipVar) {
        vtw vtwVarM = vko.a.m();
        vtwVarM.getClass();
        ves.x(qipVar.e(), vtwVarM);
        ves.y(qipVar.b(), vtwVarM);
        ves.w(qipVar.a(), vtwVarM);
        ves.z(qipVar.d(), vtwVarM);
        return ves.v(vtwVarM);
    }

    public static qig Y(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? qig.f : qig.c : qig.b : qig.e : qig.a;
    }

    public static void Z(uhp uhpVar, Consumer consumer, Consumer consumer2) {
        aa(uhpVar, consumer, consumer2, ugk.a);
    }

    private static Object a(onz onzVar) throws ExecutionException {
        if (onzVar.i()) {
            return onzVar.e();
        }
        if (onzVar.g()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(onzVar.d());
    }

    public static void aa(uhp uhpVar, Consumer consumer, Consumer consumer2, Executor executor) {
        sfy.K(uhpVar, new qhv(consumer, consumer2), executor);
    }

    public static /* synthetic */ String ab(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "MEDIA_DOWNLOAD" : "API_CALL" : "UNKNOWN";
    }

    public static qfh ac(int i) {
        return i != 1 ? i != 2 ? qfh.PRIORITY_UNKNOWN : qfh.PRIORITY_NORMAL : qfh.PRIORITY_HIGH;
    }

    public static qdo ad(Context context) {
        return qtl.J(context) ? qdo.b(xgd.a.get().a()) : qdo.c();
    }

    public static void ae(qeq qeqVar, Intent intent, qdo qdoVar, long j) throws SecurityException, IllegalArgumentException {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(qeqVar.a(intent));
            qeqVar.c(intent, qdoVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }

    public static int[] af() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int ag(qpv qpvVar) {
        qpvVar.getClass();
        if (qpvVar instanceof qpz) {
            return 1;
        }
        if (qpvVar instanceof qqn) {
            return 2;
        }
        if (qpvVar instanceof qql) {
            return 3;
        }
        if (qpvVar instanceof qpw) {
            return 4;
        }
        if (qpvVar instanceof qpx) {
            return 5;
        }
        throw new yfu();
    }

    public static /* synthetic */ String ah(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "DEV" : "AUTOPUSH_QUAL_PLAYGROUND" : "AUTOPUSH" : "STAGING_QUAL_QA" : "PRODUCTION";
    }

    public static String ai(vvj vvjVar) {
        String strEncodeToString = Base64.encodeToString(vvjVar.h(), 10);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public static qdl aj(List list, tvn tvnVar) {
        list.getClass();
        tvnVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qdl qdlVar = (qdl) it.next();
            if (qdlVar instanceof qdm) {
                ((tvk) ((tvk) tvnVar.g()).i(((qdm) qdlVar).a())).s("Logging permanent failure in syncAllAccounts");
                arrayList.add(qdlVar);
            } else if (qdlVar instanceof qdp) {
                ((tvk) ((tvk) tvnVar.g()).i(((qdp) qdlVar).a())).s("Logging transient failure in syncAllAccounts");
                arrayList2.add(qdlVar);
            }
        }
        if (!arrayList.isEmpty()) {
            qdm qdmVar = (qdm) yfm.S(arrayList);
            return new qdj(qdmVar.a(), qdmVar.b());
        }
        if (arrayList2.isEmpty()) {
            return new qdn(ygi.a);
        }
        qdp qdpVar = (qdp) yfm.S(arrayList2);
        return new qdk(qdpVar.a(), qdpVar.b());
    }

    public static qdl ak(qdl qdlVar) {
        qdlVar.getClass();
        return al(qdlVar, new oun(12));
    }

    public static qdl al(qdl qdlVar, yjv yjvVar) {
        qdlVar.getClass();
        if (qdlVar instanceof qdn) {
            return new qdn(yjvVar.a(((qdn) qdlVar).a));
        }
        if (qdlVar instanceof qdi) {
            return qdlVar;
        }
        throw new yfu();
    }

    public static qdl am(Object obj, int i) {
        Throwable thA = yfy.a(obj);
        return thA == null ? new qdn(obj) : new qdj(thA, i);
    }

    public static Object an(qdl qdlVar) {
        if (qdlVar instanceof qdn) {
            return ((qdn) qdlVar).a;
        }
        return null;
    }

    public static Object ao(qdl qdlVar) throws Throwable {
        if (qdlVar instanceof qdn) {
            return ((qdn) qdlVar).a;
        }
        if (qdlVar instanceof qdi) {
            throw ((qdi) qdlVar).a();
        }
        throw new yfu();
    }

    public static String ap(qdl qdlVar) {
        if (qdlVar instanceof qdn) {
            return "SUCCESS";
        }
        if (qdlVar instanceof qdp) {
            return "TRANSIENT_FAILURE";
        }
        if (qdlVar instanceof qdm) {
            return "PERMANENT_FAILURE";
        }
        throw new yfu();
    }

    public static Throwable aq(qdl qdlVar) {
        if (qdlVar instanceof qdn) {
            return null;
        }
        if (qdlVar instanceof qdi) {
            return ((qdi) qdlVar).a();
        }
        throw new yfu();
    }

    public static int ar(qdl qdlVar) {
        if (qdlVar instanceof qdn) {
            return 0;
        }
        if (qdlVar instanceof qdi) {
            return ((qdi) qdlVar).b();
        }
        throw new yfu();
    }

    public static /* synthetic */ String as(int i) {
        switch (i) {
            case 1:
                return "GNP_FAILURE_TYPE_UNKNOWN";
            case 2:
                return "UNCAUGHT_EXCEPTION";
            case 3:
                return "NOOP_FAILURE";
            case 4:
                return "ROOM_DATABASE_ERROR";
            case 5:
                return "PROVIDER_INSTALLER_EXCEPTION";
            case 6:
                return "REGISTRATION_TOKEN_NOT_AVAILABLE";
            case 7:
                return "REGISTRATION_TOKEN_MANAGER_FAILURE";
            case 8:
                return "ZWIEBACK_HELPER_NOT_FOUND";
            case 9:
                return "ZWIEBACK_COOKIE_MISSING";
            case 10:
                return "ZWIEBACK_HEADER_CREATION_FAILURE";
            case 11:
                return "YOUTUBE_VISITOR_DATA_PROVIDER_NOT_FOUND";
            case 12:
                return "YOUTUBE_VISITOR_DATA_PROVIDER_FAILURE";
            case 13:
                return "YOUTUBE_VISITOR_HEADER_CREATION_FAILURE";
            case 14:
                return "FITBIT_AUTH_TOKEN_MISSING";
            case 15:
                return "FITBIT_AUTH_DATA_PROVIDER_FAILURE";
            case 16:
                return "NOTIFICATION_COUNT_TIMEOUT_FAILURE";
            case 17:
                return "SCHEDULE_NOTIFICATIONS_REFRESH_FAILURE";
            case 18:
                return "REMOVE_THREADS_NOT_IN_TRAY_FAILURE";
            case 19:
                return "NOTIFICATIONS_COUNT_MANAGER_FAILURE";
            case 20:
                return "INPUT_DATA_BUILDER_MAX_SIZE_EXCEEDED";
            case 21:
                return "HTML_PARSING_FAILURE";
            case 22:
                return "JOB_BUNDLE_PARAM_ERROR";
            case 23:
                return "JOB_CANCELATION_FAILURE";
            case 24:
                return "JOB_SCHEDULING_FAILURE";
            case 25:
                return "INBOX_MESSAGE_NOT_FOUND";
            case 26:
                return "INBOX_ACTION_ID_NOT_FOUND";
            case 27:
                return "GROWTHKIT_UNSUPPORTED_UI";
            case 28:
                return "GROWTHKIT_TARGET_NOT_SET";
            case 29:
                return "GROWTHKIT_UNSUPPORTED_TARGET";
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return "GROWTHKIT_THEME_NOT_FOUND";
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return "UNSUPPORTED_ACCOUNT_TYPE";
            case 32:
                return "GNP_ACCOUNT_STORAGE_EXCEPTION";
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return "GNP_ACCOUNT_NOT_IN_STORAGE";
            case 34:
                return "GNP_ACCOUNT_RTID_NOT_FOUND";
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return "GNP_ACCOUNT_CLEANER_EXCEPTION";
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return "ACCOUNT_MANAGER_FAILURE";
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return "POST_ACCOUNT_USER_NAME_CHANGE_FAILURE";
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return "PRE_ACCOUNT_USER_NAME_CHANGE_FAILURE";
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return "INVALID_FETCH_REASON";
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return "PROCESS_PROMO_RESPONSE_EXCEPTION";
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return "INVALID_REGISTRATION_REASON";
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return "DISABLED_REGISTRATION_REASON";
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return "BACKEND_AUTH_FAILURE";
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return "BACKEND_REGISTRATION_FAILURE";
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return "INVALID_RESPONSE_ACCOUNTS_LIST_SIZE_MISMATCH";
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return "INVALID_RESPONSE_ACCOUNT_NOT_EXPECTED";
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return "INVALID_RESPONSE_ACCOUNT_DUPLICATED";
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return "GNP_REGISTRATION_SCHEDULER_FAILURE";
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return "FITBIT_AUTH_DATA_PROVIDER_NOT_FOUND";
            case 50:
                return "INVALID_REQUEST_NO_ACTUAL_NAME_FOR_DELEGATED_GAIA";
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return "INVALID_REQUEST_NO_VISITOR_ID";
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return "INVALID_REQUEST_NO_ZWIEBACK_ID";
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return "INVALID_REQUEST_ACCOUNTS_LIST_SIZE_MISMATCH";
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return "INVALID_REQUEST_NO_ACCOUNT_REPRESENTATION_OR_API_KEY";
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return "TOKEN_RESET_FAILURE";
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return "HTTP_AUTH_FAILURE";
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return "UNKNOWN_HTTP_FAILURE";
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return "INVALID_RESPONSE_FAILED_TO_PARSE";
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return "RPC_BACKEND_FAILURE";
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return "GOOGLE_AUTH_UTIL_ACCOUNTS_FAILURE";
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return "GOOGLE_AUTH_UTIL_ACCOUNT_ID_FAILURE";
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return "GNP_AUTH_REFRESH_TOKEN_FAILURE";
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return "GNP_AUTH_FETCH_TOKEN_FAILURE";
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "FIREBASE_DELETE_TOKEN_FAILURE";
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return "FIREBASE_FETCH_TOKEN_FAILURE";
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return "ENCRYPTION_KEY_GENERATION_FAILURE";
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return "DECRYPTION_FAILURE";
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return "DECOMPRESSION_FAILURE";
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return "GNP_ENCRYPTION_MANAGER_NOT_FOUND";
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return "PAYLOAD_MISSING_FAILURE";
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return "PAYLOAD_MISSING_RECIPIENT_ID";
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return "INVALID_PAYLOAD_FAILED_TO_PARSE";
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return "UNKNOWN_CHIME_RPC_FAILURE";
            default:
                return "UNKNOWN_CHIME_JOB_FAILURE";
        }
    }

    public static void at(Map map, StatusBarNotification statusBarNotification, pxg pxgVar, qis qisVar) {
        qcy qcyVar;
        qct qctVar = qct.a;
        qcy qcyVar2 = (qcy) map.get(qct.i(statusBarNotification));
        if (qcyVar2 != null) {
            qcyVar = new qcy(qcyVar2.a, qcyVar2.b, pxgVar, qisVar);
        } else {
            qcyVar = null;
        }
        if (qcyVar != null) {
            map.put(qct.i(statusBarNotification), qcyVar);
        }
    }

    public static void au(Map map, pxg pxgVar, String str, pvt pvtVar) {
        if (!map.containsKey(pxgVar)) {
            map.put(pxgVar, new LinkedHashMap());
        }
        Map map2 = (Map) map.get(pxgVar);
        if (map2 != null) {
        }
    }

    public static qcw av(qcy qcyVar) {
        if (qcyVar.b == null) {
            qcyVar = null;
        }
        if (qcyVar == null) {
            return null;
        }
        StatusBarNotification statusBarNotification = qcyVar.b;
        if (statusBarNotification != null) {
            return new qcw(qcyVar.a, statusBarNotification, qcyVar.c, qcyVar.d);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static void aw(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qcy qcyVar = (qcy) it.next();
            StatusBarNotification statusBarNotification = qcyVar.b;
            if (statusBarNotification != null) {
                at(map, statusBarNotification, qcyVar.c, qcyVar.d);
            }
        }
    }

    public static vmo ax(List list) {
        vtw vtwVarM = vmo.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        vmo vmoVar = (vmo) vucVar;
        vmoVar.e = 2;
        vmoVar.b |= 4;
        int i = vmb.c;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vmo vmoVar2 = (vmo) vtwVarM.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        vmoVar2.c = i2;
        vmoVar2.b |= 1;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                vlb vlbVar = ((qis) it.next()).l.k;
                if (vlbVar == null) {
                    vlbVar = vlb.a;
                }
                if (vlbVar.f) {
                    break;
                }
            } else {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vmo vmoVar3 = (vmo) vtwVarM.b;
                vmoVar3.f = 2;
                vmoVar3.b |= 8;
            }
        }
        return (vmo) vtwVarM.r();
    }

    private static void b(onz onzVar, oof oofVar) {
        Executor executor = ooc.b;
        onzVar.n(executor, oofVar);
        onzVar.m(executor, oofVar);
        onzVar.j(executor, oofVar);
    }

    public static boolean d(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static oub e(int i) {
        return i != 1 ? i != 2 ? oub.c : oub.b : oub.a;
    }

    public static String f(byte[] bArr) {
        String upperCase = yfm.bs(bArr, "", null, null, new kil(18), 30).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static int g(dze dzeVar) {
        String str = dzeVar.U;
        if (str != null) {
            return (ylh.ac(str, "vp9.2") || ylh.ac(str, "hvc1.2") || ylh.ac(str, "dvhe")) ? 3 : 2;
        }
        return 1;
    }

    public static boolean h(Context context) {
        Uri uri = oqh.a;
        int i = context.getApplicationInfo().uid;
        return (i == -1 || Build.FINGERPRINT.equals("robolectric") || context.checkUriPermission(oqh.a, 0, i, 1) != 0) ? false : true;
    }

    public static void i(uhp uhpVar, uha uhaVar) {
        sfy.K(uhpVar, uhaVar, ugk.a);
    }

    public static oqd j(Context context, int i) {
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(opz.a, Integer.valueOf(i), new opy(new aps(context, i, 7), 1));
        objComputeIfAbsent.getClass();
        return (oqd) objComputeIfAbsent;
    }

    public static void k(Intent intent, oqe oqeVar, String str) {
        oqeVar.getClass();
        intent.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.WIDGET_NAME", oqeVar.ad);
        intent.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.TAP", str);
        intent.putExtra("com.google.android.libraries.androidatgoogle.widget.logging.SERVICE_ID", -1);
    }

    public static void l(Context context, Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("com.google.android.libraries.androidatgoogle.widget.logging.WIDGET_NAME") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra("com.google.android.libraries.androidatgoogle.widget.logging.TAP") : null;
        int intExtra = intent != null ? intent.getIntExtra("com.google.android.libraries.androidatgoogle.widget.logging.SERVICE_ID", -1) : -1;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            return;
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra2.length() != 0) {
            vtw vtwVarM = wcv.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wcv wcvVar = (wcv) vucVar;
            wcvVar.c = 1;
            wcvVar.b = 1 | wcvVar.b;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wcv wcvVar2 = (wcv) vucVar2;
            wcvVar2.b |= 2;
            wcvVar2.d = stringExtra;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wcv wcvVar3 = (wcv) vtwVarM.b;
            wcvVar3.b |= 4;
            wcvVar3.e = stringExtra2;
            oqd oqdVarJ = j(context, intExtra);
            vuc vucVarO = vtwVarM.r();
            vucVarO.getClass();
            oqdVarJ.a((wcv) vucVarO);
        }
    }

    public static uhp m(smc smcVar, tsl tslVar) {
        return smcVar.b(tslVar, ugk.a);
    }

    public static uhp n(uhp uhpVar, tsl tslVar) {
        ugk ugkVar = ugk.a;
        ugkVar.getClass();
        return ufn.i(uhpVar, tslVar, ugkVar);
    }

    public static Map o(ContentResolver contentResolver, String[] strArr, oph ophVar) throws opi {
        Uri uri = opd.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new opi("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new opi("ContentProvider query returned null cursor");
                    }
                    Map mapA = ophVar.a(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapA.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new opi("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapA;
                } finally {
                }
            } catch (RemoteException e2) {
                throw new opi(e2);
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Deprecated
    public static onz p(Executor executor, Callable callable) {
        ocv.aG(executor, "Executor must not be null");
        ooe ooeVar = new ooe();
        executor.execute(new non(ooeVar, callable, 18, (char[]) null));
        return ooeVar;
    }

    public static onz q(Exception exc) {
        ooe ooeVar = new ooe();
        ooeVar.s(exc);
        return ooeVar;
    }

    public static onz r(Object obj) {
        ooe ooeVar = new ooe();
        ooeVar.t(obj);
        return ooeVar;
    }

    public static Object s(onz onzVar) throws InterruptedException {
        ocv.ay();
        ocv.ax();
        if (onzVar.h()) {
            return a(onzVar);
        }
        oof oofVar = new oof();
        b(onzVar, oofVar);
        oofVar.a.await();
        return a(onzVar);
    }

    public static Object t(onz onzVar, long j, TimeUnit timeUnit) throws TimeoutException {
        ocv.ay();
        ocv.ax();
        ocv.aG(timeUnit, "TimeUnit must not be null");
        if (onzVar.h()) {
            return a(onzVar);
        }
        oof oofVar = new oof();
        b(onzVar, oofVar);
        if (oofVar.a.await(j, timeUnit)) {
            return a(onzVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static String u(uwi uwiVar) {
        uwm uwmVar = uwiVar.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        return v(uwmVar);
    }

    public static String v(uwm uwmVar) {
        a.H(uwmVar != null);
        a.H(uwmVar.c.size() > 0);
        return TextUtils.join(",", new TreeSet(uwmVar.c));
    }

    public static uxl w(uxl uxlVar) {
        String str = uxlVar.e;
        List<String> list = uwn.a;
        String strSubstring = "";
        if (str != null) {
            for (String str2 : list) {
                if (str.endsWith(str2) && str2.length() > strSubstring.length()) {
                    strSubstring = str2;
                }
            }
            strSubstring = str.substring(0, str.length() - strSubstring.length());
        }
        vtw vtwVar = (vtw) uxlVar.a(5, null);
        vtwVar.x(uxlVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxl uxlVar2 = (uxl) vtwVar.b;
        strSubstring.getClass();
        uxlVar2.b |= 4;
        uxlVar2.e = strSubstring;
        return (uxl) vtwVar.r();
    }

    public static boolean x(List list, uzh uzhVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            if (uzhVar.c.e(i2) == ((Integer) list.get(i)).intValue() && (i2 = i2 + 1) == uzhVar.c.size()) {
                return i == list.size() + (-1);
            }
            i++;
        }
        return false;
    }

    public static pij y(uxv uxvVar) {
        if (uxvVar != null) {
            int iOrdinal = uxvVar.ordinal();
            if (iOrdinal == 1) {
                return pij.ACTION_POSITIVE;
            }
            if (iOrdinal == 2) {
                return pij.ACTION_NEGATIVE;
            }
            if (iOrdinal == 3) {
                return pij.ACTION_DISMISS;
            }
            if (iOrdinal == 4) {
                return pij.ACTION_ACKNOWLEDGE;
            }
        }
        return pij.ACTION_UNKNOWN;
    }

    public static int z(uyr uyrVar) {
        uyrVar.getClass();
        int i = uyrVar.c;
        if (i == 5) {
            return 6;
        }
        if (i == 3) {
            return 4;
        }
        int iR = sij.R((i == 2 ? (uyc) uyrVar.d : uyc.a).n);
        if (iR != 0 && iR == 5) {
            return 3;
        }
        int i2 = uyrVar.c;
        int iR2 = sij.R((i2 == 2 ? (uyc) uyrVar.d : uyc.a).n);
        if (iR2 != 0 && iR2 == 7) {
            return 2;
        }
        if (i2 == 6) {
            return 5;
        }
        if (i2 == 11) {
            return 7;
        }
        uyq uyqVarB = uyq.b(uyrVar.e);
        if (uyqVarB == null) {
            uyqVarB = uyq.UITYPE_NONE;
        }
        return uyqVarB == uyq.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG ? 8 : 1;
    }

    public osk(byte[] bArr, byte[] bArr2) {
    }
}
