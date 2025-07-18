package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.grz;
import defpackage.hbn;
import defpackage.ngj;
import defpackage.oqf;
import defpackage.osk;
import defpackage.qtl;
import defpackage.sfy;
import defpackage.uhp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppDoctorReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a(uhp uhpVar, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                uhpVar.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        uhp uhpVarC = !osk.h(context) ? sfy.C(false) : qtl.aQ(new hbn(new oqf().a(), context, ngj.TELEDOCTOR, 6, (char[]) null));
        setResultCode(-1);
        if (uhpVarC.isDone()) {
            return;
        }
        qtl.aQ(new grz(uhpVarC, goAsync(), 4));
    }
}
