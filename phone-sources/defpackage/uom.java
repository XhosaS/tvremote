package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uom implements Application.ActivityLifecycleCallbacks {
    private final Queue a = new ArrayDeque(10);

    public final void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strT = uiv.t(extras);
                if (!TextUtils.isEmpty(strT)) {
                    Queue queue = this.a;
                    if (queue.contains(strT)) {
                        return;
                    } else {
                        queue.add(strT);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (uiv.A(bundle)) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                ujh ujhVar = (ujh) uiz.b().e(ujh.class);
                if (ujhVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    ujhVar.b();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    ujhVar.a();
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            }
            uiv.x("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new ukm(this, intent, 8, null));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
