package com.google.android.libraries.mediahome.providers.video.broadcastreceivers;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.libraries.mediahome.providers.video.database.Database;
import defpackage.pry;
import defpackage.psa;
import defpackage.tui;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BootCompletedReceiver extends pry {
    public static final tui a = tui.l("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/BootCompletedReceiver");
    private final Executor c = AsyncTask.THREAD_POOL_EXECUTOR;
    public Database b = null;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            new psa(this, context, goAsync()).executeOnExecutor(this.c, new Void[0]);
        }
    }
}
