package com.google.android.apps.play.movies.common.service.pinning;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.videos.R;
import defpackage.crl;
import defpackage.hjt;
import defpackage.idr;
import defpackage.ids;
import defpackage.iem;
import defpackage.ien;
import defpackage.krd;
import defpackage.krh;
import defpackage.ksk;
import defpackage.kyt;
import defpackage.lfn;
import defpackage.lga;
import defpackage.lgr;
import defpackage.ljg;
import defpackage.ljn;
import defpackage.ljz;
import defpackage.lkq;
import defpackage.lyz;
import defpackage.lzq;
import defpackage.mem;
import defpackage.mta;
import defpackage.rgq;
import defpackage.tug;
import defpackage.tui;
import defpackage.wae;
import defpackage.xca;
import defpackage.xcb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TransferService extends xcb {
    private static final tui k = tui.l("com/google/android/apps/play/movies/common/service/pinning/TransferService");
    public Handler a;
    public int b;
    public int c;
    public ljn d;
    public SharedPreferences e;
    public idr f;
    public Context g;
    public lfn h;
    public ljg i;
    public mta j;
    private ljz l;

    /* compiled from: PG */
    public class Receiver extends xca {
        private static boolean b;
        private static int c;
        public lgr a;

        public static void a(Context context, boolean z) {
            boolean z2 = b;
            int i = true != z ? 2 : 1;
            if (z2 && i == c) {
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) Receiver.class), i, 1);
            c = i;
            b = true;
        }

        @Override // defpackage.xca, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            wae.B(this, context);
            PinBroadcastReceiver.b(context, this.a);
        }
    }

    public static Intent a(Context context, boolean z) {
        return new Intent(context, (Class<?>) TransferService.class).putExtra("ensure_robust", z);
    }

    public final void b(int i, Notification notification) {
        try {
            ((tug) ((tug) k.e()).j("com/google/android/apps/play/movies/common/service/pinning/TransferService", "startForegroundWithErrorHandling", 188, "TransferService.java")).s("Attempting to start service in foreground");
            if (ksk.b >= 29) {
                crl.e(this, i, notification, 1);
            } else {
                crl.e(this, i, notification, 0);
            }
        } catch (ForegroundServiceStartNotAllowedException e) {
            ((tug) ((tug) ((tug) k.g()).i(e)).j("com/google/android/apps/play/movies/common/service/pinning/TransferService", "startForegroundWithErrorHandling", (char) 196, "TransferService.java")).s("Failed to start service in foreground because the app was already in thebackground");
        } catch (RuntimeException e2) {
            ((tug) ((tug) ((tug) k.g()).i(e2)).j("com/google/android/apps/play/movies/common/service/pinning/TransferService", "startForegroundWithErrorHandling", (char) 200, "TransferService.java")).s("Unexpected exception ");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v3, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.xcb, android.app.Service
    public final void onCreate() {
        super.onCreate();
        krd.b("creating transfer service");
        if (ksk.b >= 26) {
            lga lgaVarC = lga.c(this.g, kyt.TEMPORARY, null, "Generic notification", this.h.cH());
            lgaVarC.h(getString(R.string.checking_for_downloads));
            lgaVarC.e(true);
            b(2, lgaVarC.a());
        }
        this.a = new Handler();
        ien ienVar = new ien(this.e, krh.DOWNLOAD_NETWORK);
        iem iemVar = new iem(this.g, "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_UNMOUNTED");
        mta mtaVar = this.j;
        ids idsVarD = hjt.d(ienVar, this.d, iemVar, this.f);
        PowerManager powerManager = (PowerManager) getSystemService("power");
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        Resources resources = getResources();
        Context contextA = ((rgq) mtaVar.g).a();
        mem memVar = (mem) mtaVar.b.b();
        memVar.getClass();
        ?? B = mtaVar.f.b();
        lyz lyzVar = (lyz) mtaVar.i.b();
        lyzVar.getClass();
        lfn lfnVar = (lfn) mtaVar.e.b();
        lfnVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) mtaVar.d.b();
        sharedPreferences.getClass();
        Object objB = mtaVar.a.b();
        lzq lzqVar = (lzq) mtaVar.c.b();
        lzqVar.getClass();
        lgr lgrVar = (lgr) mtaVar.h.b();
        lgrVar.getClass();
        Object objB2 = mtaVar.j.b();
        powerManager.getClass();
        wifiManager.getClass();
        resources.getClass();
        this.l = new ljz(this, contextA, memVar, B, lyzVar, lfnVar, sharedPreferences, (ljn) objB, lzqVar, lgrVar, (lkq) objB2, idsVarD, powerManager, wifiManager, resources);
        this.i.i(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ljz ljzVar = this.l;
        while (true) {
            WifiManager.WifiLock wifiLock = ljzVar.e;
            if (!wifiLock.isHeld()) {
                break;
            }
            ((tug) ((tug) ljz.a.g()).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "quit", 188, "TransfersExecutor.java")).s("wifiLock held in quit");
            wifiLock.release();
        }
        ljzVar.d.ee(ljzVar);
        synchronized (ljzVar.c) {
            ((tug) ((tug) ljz.a.g()).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "quit", 195, "TransfersExecutor.java")).t("BACKGROUND_QUIT_SAFELY pending jobs == %d", ljzVar.g - ljzVar.f);
        }
        ljzVar.b.quitSafely();
        ljg ljgVar = this.i;
        if (ljgVar != null) {
            ljgVar.i(null);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.getBooleanExtra("ensure_robust", false)) {
            Receiver.a(this, true);
        }
        this.b = i2;
        this.c = this.l.b();
        return 1;
    }
}
