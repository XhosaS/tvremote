package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nf {
    public static int a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        int i = nc.a;
        return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        Object colorStateList;
        bda bdaVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal = nq.a;
        nn nnVar = new nn(resources, theme2);
        synchronized (nq.c) {
            SparseArray sparseArray = (SparseArray) nq.b.get(nnVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (bdaVar = (bda) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!((Configuration) bdaVar.b).equals(nnVar.a.getConfiguration()) || (!((theme = nnVar.b) == null && bdaVar.a == 0) && (theme == null || bdaVar.a != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = bdaVar.c;
            }
        }
        if (colorStateList == null) {
            ThreadLocal threadLocal2 = nq.a;
            TypedValue typedValue = (TypedValue) threadLocal2.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal2.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateListA = nk.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListA != null) {
                synchronized (nq.c) {
                    WeakHashMap weakHashMap = nq.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nnVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(nnVar, sparseArray2);
                    }
                    sparseArray2.append(i, new bda(colorStateListA, nnVar.a.getConfiguration(), theme2));
                }
                colorStateList = colorStateListA;
            } else {
                colorStateList = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) colorStateList;
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new ow(new Handler(context.getMainLooper()), 1);
    }

    public static void d(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
