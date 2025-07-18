package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewj {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils");

    public static String a(Intent intent, ActivityManager activityManager) {
        Bundle bundle;
        String string = null;
        if (Objects.equals(intent.getAction(), "android.intent.action.ASSIST")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromIntent", 64, "FindForegroundAppUtils.java")).x("No extras; can't get foreground app from %s", intent);
            } else {
                string = extras.getString("android.intent.extra.ASSIST_PACKAGE");
                if (extras.containsKey("android.intent.extra.ASSIST_CONTEXT") && (bundle = extras.getBundle("android.intent.extra.ASSIST_CONTEXT")) != null && bundle.containsKey("android.intent.extra.ASSIST_PACKAGE_OVERRIDE") && !TextUtils.isEmpty(bundle.getString("android.intent.extra.ASSIST_PACKAGE_OVERRIDE"))) {
                    string = bundle.getString("android.intent.extra.ASSIST_PACKAGE_OVERRIDE");
                }
                if (TextUtils.isEmpty(string)) {
                    ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromIntent", 79, "FindForegroundAppUtils.java")).x("Insufficient extras; can't get foreground app from %s", intent.getExtras());
                } else {
                    ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromIntent", 82, "FindForegroundAppUtils.java")).x("Foreground app name from intent: %s", string);
                }
            }
        } else {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromIntent", 58, "FindForegroundAppUtils.java")).x("Action isn't android.intent.action.ASSIST; can't get foreground app from %s", intent);
        }
        return !TextUtils.isEmpty(string) ? string : b(activityManager);
    }

    public static String b(ActivityManager activityManager) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks == null || runningTasks.isEmpty()) {
                ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromRunningTasks", 109, "FindForegroundAppUtils.java")).u("No running tasks");
                return null;
            }
            ComponentName componentName = runningTasks.get(0).topActivity;
            if (componentName == null) {
                ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromRunningTasks", 114, "FindForegroundAppUtils.java")).u("Top activity is null; can't find foreground app");
                return null;
            }
            String packageName = componentName.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromRunningTasks", 119, "FindForegroundAppUtils.java")).u("Top activity package is empty; can't find foreground app");
                return null;
            }
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromRunningTasks", 122, "FindForegroundAppUtils.java")).x("Foreground app name from running tasks: %s", packageName);
            return packageName;
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) a.b()).p(e)).q("com/google/android/apps/tvsearch/app/foregroundapp/FindForegroundAppUtils", "getForegroundAppPackageNameFromRunningTasks", 'i', "FindForegroundAppUtils.java")).u("Can't find foreground app");
            return null;
        }
    }
}
