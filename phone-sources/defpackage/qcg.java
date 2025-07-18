package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcg {
    private static final tvn b = tvn.n("GnpSdk");
    public final pwy a;
    private final Context c;
    private final qei d;

    public qcg(Context context, qei qeiVar, pwy pwyVar) {
        this.c = context;
        this.d = qeiVar;
        this.a = pwyVar;
    }

    private static int f() {
        if (Build.VERSION.SDK_INT < 34) {
            return qtl.I() ? 33554432 : 0;
        }
        return 67108864;
    }

    public final PendingIntent a(String str, int i, String str2, qcf qcfVar, qen qenVar, List list, vmo vmoVar, qrd qrdVar, qir qirVar, vht vhtVar, boolean z, Bundle bundle) {
        qcf qcfVar2;
        ((tvk) b.l().j("com/google/android/libraries/notifications/internal/systemtray/impl/PendingIntentHelper", "createNotificationPendingIntent", 321, "PendingIntentHelper.java")).F("Creating a notification pending intent for action [%s], handler [%s] and handleInForeground [%s] in account [%s]", str2, qcfVar, Boolean.valueOf(z), qenVar != null ? qenVar.b : "null");
        Intent intent = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT");
        Context context = this.c;
        qej qejVar = this.d.c;
        Intent className = intent.setClassName(context, qejVar.h);
        qcb.h(className, qenVar);
        qcb.k(className, i);
        qcb.i(className, str2);
        qcb.p(className, vmoVar);
        qcb.m(className, qrdVar);
        className.getClass();
        if (qirVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", qirVar.b().h());
        }
        qcb.n(className, vhtVar);
        qcb.j(className, bundle);
        if (z) {
            qcfVar2 = qcf.ACTIVITY;
            className.getClass();
            className.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
        } else {
            qcfVar2 = qcfVar;
        }
        if (list.size() == 1) {
            qcb.o(className, (qis) list.get(0));
        } else {
            qcb.l(className, (qis) list.get(0));
        }
        if (qcfVar2 == qcf.ACTIVITY) {
            className.setClassName(context, qejVar.g);
            return PendingIntent.getActivity(context, qct.b(str, str2, i), className, f() | 134217728);
        }
        int iB = vmb.b(vmoVar.c);
        if (iB == 0) {
            iB = vmb.a;
        }
        if (iB == vmb.c) {
            className.addFlags(268435456);
        }
        return PendingIntent.getBroadcast(context, qct.b(str, str2, i), className, f() | 134217728);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.PendingIntent b(java.lang.String r19, defpackage.qen r20, defpackage.qis r21, defpackage.qir r22, defpackage.qrd r23) throws defpackage.vuq {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcg.b(java.lang.String, qen, qis, qir, qrd):android.app.PendingIntent");
    }

    public final PendingIntent c(String str, qen qenVar, List list, qrd qrdVar) throws vuq {
        qrm qrmVar;
        List listBn = ocv.bn(list);
        tst tstVarB = this.a.b();
        if (tstVarB.g()) {
            jay jayVar = (jay) tstVarB.c();
            tui tuiVar = jay.a;
            tug tugVar = (tug) tuiVar.e().j("com/google/android/apps/googletv/app/notifications/NotificationClickIntentProviderImpl", "getClickBehavior", 35, "NotificationClickIntentProviderImpl.kt");
            String strValueOf = String.valueOf(qenVar);
            ArrayList arrayList = new ArrayList(yfm.z(listBn, 10));
            Iterator it = listBn.iterator();
            while (it.hasNext()) {
                arrayList.add(((ptn) it.next()).a);
            }
            tugVar.B("Generating click behavior for Chime account %s for chime threads %s", strValueOf, String.valueOf(TextUtils.join(", ", arrayList)));
            if (listBn.isEmpty()) {
                ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/notifications/NotificationClickIntentProviderImpl", "getClickBehavior", 44, "NotificationClickIntentProviderImpl.kt")).s("Chime list is empty. Handling clicks in the background");
                qrmVar = new qrm(2, null);
            } else {
                qrmVar = jayVar.a((ptn) listBn.get(0), qenVar, null);
            }
        } else {
            qrmVar = new qrm(2, null);
        }
        if (qrmVar.a == 1 && qrmVar.a() != null) {
            return e(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", qenVar, list, osk.ax(list), qrmVar.a(), qrdVar, vht.CLICKED_IN_SYSTEM_TRAY);
        }
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", qtl.G() ? qcf.BROADCAST : qcf.ACTIVITY, qenVar, list, osk.ax(list), qrdVar, null, vht.CLICKED_IN_SYSTEM_TRAY, !((qis) list.get(0)).l.h.isEmpty(), null);
    }

    public final PendingIntent d(String str, qen qenVar, List list) {
        List listBn = ocv.bn(list);
        tst tstVarB = this.a.b();
        Bundle bundle = tstVarB.g() ? (Bundle) ykr.n(yim.a, new pfo((jay) tstVarB.c(), qenVar, listBn, (yih) null, 18)) : null;
        qcf qcfVar = qcf.BROADCAST;
        vtw vtwVarM = vmo.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        vmo vmoVar = (vmo) vucVar;
        vmoVar.f = 2;
        vmoVar.b |= 8;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vmo vmoVar2 = (vmo) vtwVarM.b;
        vmoVar2.e = 2;
        vmoVar2.b |= 4;
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", qcfVar, qenVar, list, (vmo) vtwVarM.r(), null, null, vht.DISMISSED_IN_SYSTEM_TRAY, false, bundle);
    }

    public final PendingIntent e(String str, int i, String str2, qen qenVar, List list, vmo vmoVar, List list2, qrd qrdVar, vht vhtVar) {
        sij.o(!list2.isEmpty(), "Collaborator intents should not be empty");
        ((tvk) b.l().j("com/google/android/libraries/notifications/internal/systemtray/impl/PendingIntentHelper", "createCollaboratorPendingIntent", 277, "PendingIntentHelper.java")).B("Creating a collaborator pending intent for action [%s] in account [%s]", str2, qenVar != null ? qenVar.b : "null");
        Intent intent = (Intent) Iterables.getLast(list2);
        if (qtl.G()) {
            if (TextUtils.isEmpty(intent.getIdentifier())) {
                intent.setIdentifier("chime://" + str.hashCode());
            }
        } else if (intent.getData() == null || intent.getData().equals(Uri.EMPTY)) {
            intent.setData(Uri.parse("chime://" + str.hashCode()));
        }
        qcb.h(intent, qenVar);
        qcb.k(intent, i);
        qcb.i(intent, str2);
        qcb.p(intent, vmoVar);
        qcb.m(intent, qrdVar);
        qcb.n(intent, vhtVar);
        qcb.j(intent, null);
        if (list.size() == 1) {
            qcb.o(intent, (qis) list.get(0));
        } else {
            qcb.l(intent, (qis) list.get(0));
        }
        return PendingIntent.getActivities(this.c, qct.b(str, str2, i), (Intent[]) list2.toArray(new Intent[0]), f() | 134217728);
    }
}
