package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.pap;
import defpackage.pgc;
import defpackage.rjs;
import defpackage.rke;
import defpackage.rmz;
import defpackage.rwv;
import defpackage.ryy;
import defpackage.sfy;
import defpackage.ues;
import defpackage.ufn;
import defpackage.ugk;
import defpackage.uhi;
import defpackage.uhl;
import defpackage.uhp;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.cg(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                rwv.d();
                rwv rwvVarA = rwv.a(context);
                if (rwvVarA == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                uhp[] uhpVarArr = new uhp[2];
                uhp uhpVarJ = string != null ? ufn.j(uhi.v(ryy.b(rwvVarA).b(new pgc(string, 13), rwvVarA.b())), new pap(rwvVarA, string, 12, null), rwvVarA.b()) : uhl.a;
                rke rkeVar = new rke(16);
                ugk ugkVar = ugk.a;
                uhpVarArr[0] = ues.i(uhpVarJ, IOException.class, rkeVar, ugkVar);
                uhpVarArr[1] = string != null ? rwvVarA.b().submit(new rmz(context, string, 7)) : uhl.a;
                sfy.N(uhpVarArr).a(new rjs(pendingResultGoAsync, 4), ugkVar);
            }
        }
    }
}
