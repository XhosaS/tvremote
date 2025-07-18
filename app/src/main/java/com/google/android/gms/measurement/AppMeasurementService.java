package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.bbp;
import defpackage.kts;
import defpackage.lab;
import defpackage.lbk;
import defpackage.lcl;
import defpackage.lgw;
import defpackage.lgx;
import defpackage.lih;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements lgw {
    private lgx a;

    private final lgx d() {
        if (this.a == null) {
            this.a = new lgx(this);
        }
        return this.a;
    }

    @Override // defpackage.lgw
    public final void a(Intent intent) {
        int i = AppMeasurementReceiver.c;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0 && (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) == 0) {
            return;
        }
        SparseArray sparseArray = bbp.a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // defpackage.lgw
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.lgw
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        lgx lgxVarD = d();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new lcl(lih.o(lgxVarD.a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().c(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final lgx lgxVarD = d();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = lgxVarD.a;
        lbk lbkVarI = lbk.i(context, null, null);
        final lab labVar = lbkVarI.f;
        lbkVarI.o(labVar);
        kts ktsVar = lbkVarI.c;
        String action = intent.getAction();
        labVar.k.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        lgxVarD.d(lih.o(context), new Runnable() { // from class: lgt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = lgxVarD.a;
                lgw lgwVar = (lgw) context2;
                int i3 = i2;
                if (lgwVar.b(i3)) {
                    Intent intent2 = intent;
                    labVar.k.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                    lbk lbkVarI2 = lbk.i(context2, null, null);
                    lab labVar2 = lbkVarI2.f;
                    lbkVarI2.o(labVar2);
                    labVar2.k.a("Completed wakeful intent.");
                    lgwVar.a(intent2);
                }
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().e(intent);
        return true;
    }
}
