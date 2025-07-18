package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spi {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker");
    public final Context b;
    public final Executor c;

    public spi(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    public final void a(String str) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        Context context = this.b;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (appOpsManager == null) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.AudioOpChecker")).q("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "finishOp", 104, "RecordAudioOpChecker.java")).u("#audio# unable to get access to app ops manager for startOp");
        } else {
            appOpsManager.finishOp("android:record_audio", Process.myUid(), context.getPackageName(), str);
        }
    }

    public final boolean b() {
        if (!adn.b()) {
            return true;
        }
        Context context = this.b;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (appOpsManager != null) {
            return appOpsManager.unsafeCheckOpNoThrow("android:record_audio", Process.myUid(), context.getPackageName()) == 0;
        }
        ((zdv) ((zdv) a.d().o(zfi.a, "ALT.AudioOpChecker")).q("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "isRecordAudioOpAllowed", 46, "RecordAudioOpChecker.java")).u("#audio# Unable to get access to app ops manager");
        return true;
    }
}
