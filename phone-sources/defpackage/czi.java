package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
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
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czi {
    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, czh czhVar) {
        String[] stringArray;
        a.ar(inputConnection, "inputConnection must be non-null");
        a.ar(editorInfo, "editorInfo must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new czf(inputConnection, czhVar);
        }
        if (Build.VERSION.SDK_INT >= 25) {
            stringArray = editorInfo.contentMimeTypes;
            if (stringArray == null) {
                stringArray = czd.a;
            }
        } else if (editorInfo.extras == null) {
            stringArray = czd.a;
        } else {
            String[] stringArray2 = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
            if (stringArray == null) {
                stringArray = czd.a;
            }
        }
        return stringArray.length == 0 ? inputConnection : new czg(inputConnection, czhVar);
    }

    public static int b(Context context, String str) {
        a.ar(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new crv(context).c() ? 0 : -1;
    }

    public static ColorStateList c(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        Object colorStateList;
        eph ephVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal = cso.a;
        csk cskVar = new csk(resources, theme2);
        synchronized (cso.c) {
            SparseArray sparseArray = (SparseArray) cso.b.get(cskVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (ephVar = (eph) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!((Configuration) ephVar.c).equals(cskVar.a.getConfiguration()) || (!((theme = cskVar.b) == null && ephVar.a == 0) && (theme == null || ephVar.a != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = ephVar.b;
            }
        }
        if (colorStateList == null) {
            ThreadLocal threadLocal2 = cso.a;
            TypedValue typedValue = (TypedValue) threadLocal2.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal2.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateListA = csh.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListA != null) {
                synchronized (cso.c) {
                    WeakHashMap weakHashMap = cso.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(cskVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(cskVar, sparseArray2);
                    }
                    sparseArray2.append(i, new eph(colorStateListA, cskVar.a.getConfiguration(), theme2));
                }
                colorStateList = colorStateListA;
            } else {
                colorStateList = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) colorStateList;
    }

    static String d(Context context) {
        String strConcat = String.valueOf(context.getApplicationContext().getPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (crn.b(context, strConcat) == 0) {
            return strConcat;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            strConcat = String.valueOf(context.getOpPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            if (crn.b(context, strConcat) == 0) {
                return strConcat;
            }
        }
        throw new RuntimeException(a.cg(strConcat, "Permission ", " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new ia(new Handler(context.getMainLooper()), 2);
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if ((i & 1) != 0) {
            if ((i & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
            i |= 2;
        }
        int i2 = i;
        int i3 = i2 & 4;
        if ((i2 & 2) == 0) {
            if (i3 == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i3 != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null, i2);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i3 != 0) {
                context.registerReceiver(broadcastReceiver, intentFilter, d(context), null);
                return;
            } else {
                context.registerReceiver(broadcastReceiver, intentFilter, null, null, i2 & 1);
                return;
            }
        }
        if (i3 != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, d(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
