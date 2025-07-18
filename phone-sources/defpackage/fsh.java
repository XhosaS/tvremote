package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsh {
    private static final Object b = new Object();
    private static volatile fsh c;
    final fse a;

    private fsh(Context context) {
        this.a = new fse(context);
    }

    public static fsh a(Context context) {
        fsh fshVar;
        synchronized (b) {
            if (c == null) {
                c = new fsh(context.getApplicationContext());
            }
            fshVar = c;
        }
        return fshVar;
    }

    public final void b(fsf fsfVar) {
        String string;
        fsg fsgVar = fsfVar.a;
        int i = fsgVar.b;
        int i2 = fsgVar.c;
        fse fseVar = this.a;
        Object obj = fseVar.b;
        if (((Context) obj).checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) == 0) {
            return;
        }
        try {
            if (((Context) obj).getPackageManager().getApplicationInfo(fsgVar.a, 0) == null || fseVar.n(fsgVar, "android.permission.STATUS_BAR_SERVICE") || fseVar.n(fsgVar, "android.permission.MEDIA_CONTENT_CONTROL") || fsgVar.c == 1000 || (string = Settings.Secure.getString((ContentResolver) fseVar.a, "enabled_notification_listeners")) == null) {
                return;
            }
            for (String str : string.split(":")) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null) {
                    if (componentNameUnflattenFromString.getPackageName().equals(fsgVar.a)) {
                        return;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
