package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.adz;
import defpackage.ame;
import defpackage.aqb;
import defpackage.ata;
import defpackage.awf;
import defpackage.b;
import defpackage.bav;
import defpackage.bcw;
import defpackage.cgp;
import defpackage.chk;
import defpackage.chz;
import defpackage.cit;
import defpackage.ciw;
import defpackage.cja;
import defpackage.qm;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", b.c(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                bav.c();
                bav bavVarA = bav.a(context);
                if (bavVarA == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                cja[] cjaVarArr = new cja[2];
                cja cjaVarI = string != null ? chk.i(cit.x(bcw.b(bavVarA).b(new adz(string, 6), bavVarA.b())), new awf(bavVarA, string, 3), bavVarA.b()) : ciw.a;
                ata ataVar = new ata(9);
                chz chzVar = chz.a;
                cjaVarArr[0] = cgp.h(cjaVarI, IOException.class, ataVar, chzVar);
                cjaVarArr[1] = string != null ? bavVarA.b().submit(new ame(context, string, 7)) : ciw.a;
                qm.H(cjaVarArr).a(new aqb(pendingResultGoAsync, 3), chzVar);
            }
        }
    }
}
