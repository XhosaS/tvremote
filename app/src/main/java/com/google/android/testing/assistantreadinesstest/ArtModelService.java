package com.google.android.testing.assistantreadinesstest;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import defpackage.a;
import defpackage.abs;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abza;
import defpackage.ahxy;
import defpackage.vdl;
import defpackage.vdm;
import defpackage.vdr;
import defpackage.vdu;
import defpackage.vdv;
import defpackage.vdx;
import defpackage.veb;
import defpackage.yxu;
import defpackage.zbp;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zfi;
import defpackage.zgx;
import defpackage.zgy;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ArtModelService extends Service implements vdm {
    public static final zdy a = zdy.h("com/google/android/testing/assistantreadinesstest/ArtModelService");
    public final vdu b;
    public final zbp c;
    public final zbp d;
    private BroadcastReceiver f;
    public boolean e = false;
    private final IBinder g = new vdr(this);

    public ArtModelService() {
        vdv vdvVar = vdv.a;
        this.b = new vdu();
        this.c = new yxu(3);
        this.d = new yxu(3);
        new yxu(3);
    }

    @Override // defpackage.vdm
    public final void a() {
        this.e = false;
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "hotwordToneOff", 401, "ArtModelService.java")).u("Hotword tone off");
    }

    @Override // defpackage.vdm
    public final void b() {
        this.e = true;
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "hotwordToneOn", 395, "ArtModelService.java")).u("Hotword tone on");
    }

    @Override // defpackage.vdm
    public final void c() {
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "quickPhraseToneOff", 413, "ArtModelService.java")).u("Quick phrase tone off");
    }

    @Override // defpackage.vdm
    public final void d() {
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "quickPhraseToneOn", 407, "ArtModelService.java")).u("Quick phrase tone on");
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int iA;
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "dump", 301, "ArtModelService.java")).u("Dumping service state with device snapshot.");
        vdu vduVar = this.b;
        Iterator it = DesugarCollections.unmodifiableList(((vdv) vduVar.b).d).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((vdx) it.next()).e;
        }
        printWriter.println(a.b(i, "Number of hotword events="));
        Locale locale = Locale.US;
        Iterator it2 = DesugarCollections.unmodifiableList(((vdv) vduVar.b).d).iterator();
        long j = 0;
        long j2 = 0;
        while (it2.hasNext()) {
            long j3 = ((vdx) it2.next()).d;
            if (j2 < j3) {
                j2 = j3;
            }
        }
        Long.valueOf(j2).getClass();
        printWriter.println("Last hotword event timestamp=".concat(String.valueOf(String.format(locale, "%.3f", Double.valueOf(j2 / 1000.0d)))));
        String str = "";
        for (veb vebVar : DesugarCollections.unmodifiableList(((vdv) vduVar.b).c)) {
            long j4 = vebVar.e;
            if (j < j4) {
                str = vebVar.c;
                j = j4;
            }
        }
        printWriter.println("Transcript=".concat(String.valueOf(new ahxy(str, Long.valueOf(j)).a)));
        printWriter.println("Last transcript timestamp=".concat(String.valueOf(String.format(Locale.US, "%.3f", Double.valueOf(((Long) r2.b).longValue() / 1000.0d)))));
        vdv vdvVar = (vdv) vduVar.v();
        try {
            int i2 = vdvVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(vdvVar.getClass()).a(vdvVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(vdvVar.getClass()).a(vdvVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    vdvVar.memoizedSerializedSize = (Integer.MIN_VALUE & vdvVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(vdvVar.getClass()).m(vdvVar, abwa.a(abvwVar));
            abvwVar.K();
            printWriter.println("DutStateSnapshot=".concat(String.valueOf(Base64.encodeToString(bArr, 0))));
            printWriter.println("EndOfDutStateSnapshot");
        } catch (IOException e) {
            throw new RuntimeException(a.u(vdvVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "onBind", 87, "ArtModelService.java")).u("onBind is called.");
        return this.g;
    }

    @Override // android.app.Service
    public final void onCreate() throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo;
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "onCreate", 346, "ArtModelService.java")).u("onCreate is called.");
        try {
            zgy.c();
            Context applicationContext = getApplicationContext();
            try {
                serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "com.google.common.flogger.android.ConfigService"), 640);
            } catch (PackageManager.NameNotFoundException unused) {
                serviceInfo = null;
            }
            Bundle bundle = (serviceInfo == null || serviceInfo.metaData == null) ? Bundle.EMPTY : serviceInfo.metaData;
            zgx zgxVarA = null;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (str.hashCode() == -1716501985 && str.equals("BACKEND_FACTORY")) {
                    if (zgxVarA != null) {
                        throw new IllegalStateException("Only one BACKEND_FACTORY can be set in the manifest.");
                    }
                    zgxVarA = zgy.a(string);
                }
            }
            zgy.b(zgxVarA);
        } catch (IllegalStateException unused2) {
        }
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("art_model_service", "ArtModelService", 0));
        Notification notificationBuild = new Notification.Builder(this, "art_model_service").setOngoing(true).setSmallIcon(R.drawable.stat_sys_warning).build();
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(42, notificationBuild, 1073741824);
        } else {
            startForeground(42, notificationBuild);
        }
        super.onCreate();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.testing.assistantreadinesstest.action.HOTWORD_TONE_ON");
        intentFilter.addAction("com.google.android.testing.assistantreadinesstest.action.HOTWORD_TONE_OFF");
        intentFilter.addAction("com.google.android.testing.assistantreadinesstest.action.QUICK_PHRASE_TONE_ON");
        intentFilter.addAction("com.google.android.testing.assistantreadinesstest.action.QUICK_PHRASE_TONE_OFF");
        vdl vdlVar = new vdl(this);
        this.f = vdlVar;
        abs.c(this, vdlVar, intentFilter, null, 2);
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((zdv) ((zdv) a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "onDestroy", 366, "ArtModelService.java")).u("onDestroy is called.");
        unregisterReceiver(this.f);
        super.onDestroy();
    }
}
