package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abxd;
import defpackage.abxv;
import defpackage.abza;
import defpackage.abzz;
import defpackage.rdk;
import defpackage.rdl;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws abxv {
        byte bByteValue;
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                abxd abxdVarH = abxd.h(rdk.a, byteArrayExtra, 0, byteArrayExtra.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                rdk rdkVar = (rdk) abxdVarH;
                final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((rdl) declaredConstructor.newInstance(null)).a(context, rdkVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                zyd zydVarM = zxn.m(arrayList);
                pendingResultGoAsync.getClass();
                zydVarM.d(new Runnable() { // from class: rdi
                    @Override // java.lang.Runnable
                    public final void run() {
                        pendingResultGoAsync.finish();
                    }
                }, zwk.a);
            } catch (abxv e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
