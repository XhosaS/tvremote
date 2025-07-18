package com.google.android.apps.googletv.app.player.offline;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.crm;
import defpackage.edt;
import defpackage.eoy;
import defpackage.etn;
import defpackage.eua;
import defpackage.euc;
import defpackage.eui;
import defpackage.euj;
import defpackage.euk;
import defpackage.euq;
import defpackage.jdl;
import defpackage.sga;
import defpackage.tug;
import defpackage.tui;
import defpackage.wae;
import defpackage.yfm;
import defpackage.yhb;
import defpackage.yks;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfflineService extends euk implements eua {
    public static final tui g = tui.l("com/google/android/apps/googletv/app/player/offline/OfflineService");
    public static final Map h = new ConcurrentHashMap();
    public euc i;
    public jdl j;

    @Override // defpackage.eua
    public final void a(euc eucVar, etn etnVar, Exception exc) {
        etnVar.getClass();
        if (exc != null) {
            ((tug) ((tug) g.g()).i(exc).j("com/google/android/apps/googletv/app/player/offline/OfflineService", "onDownloadChanged", 73, "OfflineService.kt")).s("OfflineService: onDownloadChanged: Download failed with exception.");
            return;
        }
        jdl jdlVarR = r();
        List list = eucVar.l;
        list.getClass();
        int i = etnVar.b;
        if (jdlVarR.f(i)) {
            ((tug) jdl.a.g().j("com/google/android/apps/googletv/app/player/offline/DownloadNotificationHandler", "handleDownloadChanged", 70, "DownloadNotificationHandler.kt")).B("Handler:handleDownloadChanged: Posting/Updating for changed ID: %s, State: %s", etnVar.a.a, String.valueOf(i));
            jdlVarR.d(etnVar);
        } else if (i == 5) {
            jdlVarR.b(etnVar, true);
        }
        jdlVarR.c(list);
    }

    @Override // defpackage.eua
    public final void b(euc eucVar, etn etnVar) {
        etnVar.getClass();
        jdl jdlVarR = r();
        List list = eucVar.l;
        list.getClass();
        h.remove(etnVar.a.a);
        jdlVarR.b(etnVar, false);
        jdlVarR.c(list);
    }

    @Override // defpackage.eua
    public final void e(euc eucVar) {
        jdl jdlVarR = r();
        List list = eucVar.l;
        list.getClass();
        jdlVarR.c(list);
    }

    @Override // defpackage.eua
    public final void f() {
        r().c(yhb.a);
    }

    @Override // defpackage.euk
    protected final euc j() {
        return q();
    }

    @Override // defpackage.euk
    protected final euq o() {
        return new euq(this);
    }

    @Override // defpackage.euk, android.app.Service
    public final void onCreate() {
        wae.z(this);
        String str = this.c;
        if (str != null) {
            int i = this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                notificationManager.createNotificationChannel(new NotificationChannel(str, getString(i), 2));
            }
        }
        Class<?> cls = getClass();
        HashMap map = euk.a;
        eui euiVar = (eui) map.get(cls);
        byte[] bArr = null;
        if (euiVar == null) {
            boolean z = this.b != null;
            euq euqVar = (!z || Build.VERSION.SDK_INT >= 31) ? null : new euq(this);
            euc eucVarQ = q();
            eucVarQ.d();
            eui euiVar2 = new eui(getApplicationContext(), eucVarQ, z, euqVar, cls);
            map.put(cls, euiVar2);
            euiVar = euiVar2;
        }
        this.e = euiVar;
        a.ab(euiVar.b == null);
        euiVar.b = this;
        if (euiVar.a.h) {
            edt.L().postAtFrontOfQueue(new eoy(euiVar, this, 8, bArr));
        }
        if (!q().h) {
            r().c(yhb.a);
            return;
        }
        q().a(this);
        jdl jdlVarR = r();
        List list = q().l;
        list.getClass();
        jdlVarR.c(list);
    }

    @Override // defpackage.euk, android.app.Service
    public final void onDestroy() {
        if (q().h) {
            q().e.remove(this);
        }
        eui euiVar = this.e;
        euiVar.getClass();
        a.ab(euiVar.b == this);
        euiVar.b = null;
        euj eujVar = this.b;
        if (eujVar != null) {
            eujVar.c();
        }
    }

    @Override // defpackage.euk
    protected final Notification p(List list) {
        list.getClass();
        jdl jdlVarR = r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jdlVarR.e(((etn) obj).b)) {
                arrayList.add(obj);
            }
        }
        jdlVarR.c(list);
        if (arrayList.isEmpty()) {
            ((tug) jdl.a.g().j("com/google/android/apps/googletv/app/player/offline/DownloadNotificationHandler", "getForegroundServiceNotificationAndUpdateManaged", 51, "DownloadNotificationHandler.kt")).s("Handler:getForegroundServiceNotification: No active downloads.");
        }
        if (arrayList.size() == 1) {
            return jdlVarR.a((etn) yfm.S(arrayList), 1, false);
        }
        int size = arrayList.size();
        Context context = jdlVarR.b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(536870912);
        } else {
            launchIntentForPackage = null;
        }
        PendingIntent pendingIntentA = launchIntentForPackage != null ? sga.a(context, 3, launchIntentForPackage) : null;
        crm crmVar = new crm(context, "kinetoscope_download");
        crmVar.o(R.drawable.ic_download_grey600_24dp);
        crmVar.h(context.getString(R.string.download_manager_notification_title));
        crmVar.g(context.getString(R.string.download_manager_multiple_active_content, Integer.valueOf(size)));
        crmVar.g = pendingIntentA;
        crmVar.r = "com.google.android.apps.googletv.DOWNLOAD_GROUP";
        crmVar.s = true;
        crmVar.l(true);
        crmVar.F = true;
        crmVar.j = -2;
        Notification notificationA = crmVar.a();
        notificationA.getClass();
        return notificationA;
    }

    public final euc q() {
        euc eucVar = this.i;
        if (eucVar != null) {
            return eucVar;
        }
        yks.c("downloadManagerImpl");
        return null;
    }

    public final jdl r() {
        jdl jdlVar = this.j;
        if (jdlVar != null) {
            return jdlVar;
        }
        yks.c("notificationHandler");
        return null;
    }

    @Override // defpackage.eua
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void c(euc eucVar) {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void d(euc eucVar, boolean z) {
    }
}
