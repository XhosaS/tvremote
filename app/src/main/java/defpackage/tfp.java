package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/integrations/storage/FileUtilsKt");

    public static final File a(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        File file = new File(cacheDir, "audio_library/recordings");
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            ((zdv) a.c().o(zfi.a, "FileUtils").q("com/google/android/libraries/search/integrations/storage/FileUtilsKt", "createDirIfNotExists", 133, "FileUtils.kt")).u("Directory not created");
        }
        return file;
    }
}
