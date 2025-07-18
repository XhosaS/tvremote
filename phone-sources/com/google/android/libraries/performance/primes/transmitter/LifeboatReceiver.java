package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.rtr;
import defpackage.rvv;
import defpackage.rvw;
import defpackage.sfy;
import defpackage.ugk;
import defpackage.uhp;
import defpackage.vtp;
import defpackage.vuc;
import defpackage.vuq;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                vuc vucVarP = vuc.p(rvv.a, byteArrayExtra, 0, byteArrayExtra.length, vtp.a());
                vuc.B(vucVarP);
                rvv rvvVar = (rvv) vucVarP;
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((rvw) declaredConstructor.newInstance(null)).a(context, rvvVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                uhp uhpVarH = sfy.H(arrayList);
                pendingResultGoAsync.getClass();
                uhpVarH.c(new rtr(pendingResultGoAsync, 7), ugk.a);
            } catch (vuq e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
