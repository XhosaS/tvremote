package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vdf {
    static {
        new vdd("SplitInstallHelper");
    }

    public static void a(Context context, String str) {
        synchronized (vde.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e;
                }
                System.load(str2);
            }
        }
    }
}
