package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmb {
    public static final tui a = tui.l("com/google/android/tv/remote/virtual/client/VirtualRemote");
    public final Context b;
    public final tkp c;

    public tmb(Context context) {
        String str;
        this.b = context;
        this.c = new tkp(context);
        if (sis.a == null) {
            sis.a = context.getPackageName();
        }
        if (sis.b == null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = null;
            }
            sis.b = str;
        }
    }
}
