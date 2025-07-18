package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.testing.assistantreadinesstest.ArtModelService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdt {
    public static ArtModelService b;
    public static final zdy a = zdy.h("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider");
    public static Boolean c = false;
    private static final ServiceConnection d = new vds();

    public static void a(Context context) {
        if (context.bindService(new Intent(context, (Class<?>) ArtModelService.class), d, 1)) {
            return;
        }
        ((zdv) ((zdv) a.c().o(zfi.a, "ArtModelServiceProvider")).q("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider", "bindToArtService", 50, "ArtModelServiceProvider.java")).u("Failed to bind");
    }
}
