package com.google.android.apps.googletv.app.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.krd;
import defpackage.wae;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        krd.b("Account has been updated");
        wae.B(this, context);
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        intent2.setPackage(context.getPackageName());
        intent2.putExtra("FORCE_REFRESH", true);
        context.sendBroadcast(intent2);
    }
}
