package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvo {
    static {
        gpn.a("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                gpn.b();
                cls.getName();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
                gpn.b();
                cls.getName();
            }
        } catch (Exception unused) {
            gpn.b();
            cls.getName();
        }
    }
}
