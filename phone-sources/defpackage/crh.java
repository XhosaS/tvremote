package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.UserManager;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crh {
    static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigLargeIcon(icon);
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static final crg c(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ity ityVar = (ity) arrayList.get(i);
                boolean z = ityVar.a;
                arrayList3.add(ityVar);
            }
        }
        if (!arrayList2.isEmpty()) {
        }
        return new crg(iconCompat, charSequence, pendingIntent, bundle, arrayList3.isEmpty() ? null : (ity[]) arrayList3.toArray(new ity[arrayList3.size()]));
    }

    public static Intent d(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strF = f(activity);
        if (strF == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strF);
        try {
            return g(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.cg(strF, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent e(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strG = g(context, componentName);
        if (strG == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strG);
        return g(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String f(Activity activity) {
        try {
            return g(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String g(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static boolean h(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void i(Parcel parcel, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
    }

    public static boolean j(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Handler k(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static ctn l(Configuration configuration) {
        return ctn.d(configuration.getLocales());
    }
}
