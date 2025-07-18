package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cse {
    public static final /* synthetic */ int a = 0;
    private static volatile List b;
    private static volatile cri c;

    private cse() {
    }

    public static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            return csd$$ExternalSyntheticApiModelOutline0.m321m(context.getSystemService(csd$$ExternalSyntheticApiModelOutline0.m())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static List b(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((cry) Class.forName(string, false, cse.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static void c(Context context, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            csd$$ExternalSyntheticApiModelOutline0.m321m(context.getSystemService(csd$$ExternalSyntheticApiModelOutline0.m())).reportShortcutUsed(str);
        }
        Iterator it = b(context).iterator();
        if (it.hasNext()) {
            Collections.singletonList(str);
            throw null;
        }
    }

    public static void d(Context context) {
        if (c == null) {
            try {
                c = (cri) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, cse.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (c == null) {
                c = new cri();
            }
        }
    }
}
