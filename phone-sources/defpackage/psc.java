package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psc extends pry {
    public static final tui a = tui.l("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageAddedReceiver");
    private final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || (data = intent.getData()) == null) {
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return;
        }
        new psb(context, schemeSpecificPart, goAsync()).executeOnExecutor(this.b, new Void[0]);
    }
}
