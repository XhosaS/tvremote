package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uek {
    public static File a(Context context) {
        return b(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }
}
