package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqv {
    private static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/TranscriptionUtils");

    static {
        zla.b(Duration.ofMillis(500L), 1.2d, 15);
        zla.b(Duration.ofSeconds(5L), 1.5d, 13);
    }

    public static ComponentName a(Context context) {
        ComponentName componentName = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0)) {
            if (resolveInfo.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
            if (resolveInfo.activityInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
        }
        if (componentName != null) {
            return componentName;
        }
        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getIntentApiComponent", 148, "TranscriptionUtils.java")).u("No Intent API provided by Google.");
        return null;
    }
}
