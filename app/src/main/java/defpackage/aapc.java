package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapc implements Application.ActivityLifecycleCallbacks {
    private final Queue a = new ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strA = aapt.a(extras);
                if (!TextUtils.isEmpty(strA)) {
                    Queue queue = this.a;
                    if (queue.contains(strA)) {
                        return;
                    } else {
                        queue.add(strA);
                    }
                }
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (aapt.g(bundle2)) {
            if (bundle2 != null) {
                if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                    aahs aahsVar = (aahs) aahf.a().b(aahs.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aahsVar != null) {
                        String string = bundle2.getString("google.c.a.c_id");
                        aahsVar.b(string);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("source", "Firebase");
                        bundle3.putString("medium", "notification");
                        bundle3.putString("campaign", string);
                        aahsVar.a("_cmp", bundle3);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            aapt.d("_no", bundle2);
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
