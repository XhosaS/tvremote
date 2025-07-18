package com.google.android.tv.remote.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.nf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        nf.d(context, new Intent(context, (Class<?>) RemoteService.class));
    }
}
