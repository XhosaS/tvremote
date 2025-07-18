package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.libraries.mediahome.providers.video.database.Database;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pse extends pry {
    private static final tui b = tui.l("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageChangedReceiver");
    private final Executor c = AsyncTask.THREAD_POOL_EXECUTOR;
    public Database a = null;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        if (("android.intent.action.PACKAGE_CHANGED".equals(intent.getAction()) || "android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction())) && (data = intent.getData()) != null) {
            String schemeSpecificPart = data.getSchemeSpecificPart();
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                return;
            }
            if ("android.intent.action.PACKAGE_CHANGED".equals(intent.getAction())) {
                try {
                    if (context.getPackageManager().getApplicationInfo(schemeSpecificPart, 0).enabled) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((tug) ((tug) ((tug) b.f()).i(e)).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageChangedReceiver", "onReceive", 58, "PackageChangedReceiver.java")).v("Error: package %s not found", schemeSpecificPart);
                    return;
                }
            }
            new psd(this, context, schemeSpecificPart, goAsync()).executeOnExecutor(this.c, new Void[0]);
        }
    }
}
