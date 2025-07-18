package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.ama;
import defpackage.azo;
import defpackage.azp;
import defpackage.bzs;
import defpackage.chu;
import defpackage.chz;
import defpackage.cli;
import defpackage.clt;
import defpackage.cmh;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                clt cltVarQ = clt.q(azo.a, byteArrayExtra, 0, byteArrayExtra.length, cli.a());
                clt.B(cltVarQ);
                azo azoVar = (azo) cltVarQ;
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((azp) declaredConstructor.newInstance(null)).a(context, azoVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                chu chuVar = new chu(bzs.n(arrayList), false);
                pendingResultGoAsync.getClass();
                chuVar.m(new ama(pendingResultGoAsync, 9, null), chz.a);
            } catch (cmh e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
