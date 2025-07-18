package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abs {
    public static int a(Context context, String str) {
        aff.a(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new abm(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        aci aciVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        WeakHashMap weakHashMap = aco.a;
        acj acjVar = new acj(resources, theme2);
        synchronized (aco.b) {
            SparseArray sparseArray = (SparseArray) aco.a.get(acjVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (aciVar = (aci) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!aciVar.b.equals(acjVar.a.getConfiguration()) || (!((theme = acjVar.b) == null && aciVar.c == 0) && (theme == null || aciVar.c != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = aciVar.a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        TypedValue typedValueB = aco.b();
        resources.getValue(i, typedValueB, true);
        if (typedValueB.type < 28 || typedValueB.type > 31) {
            try {
                colorStateListA = abz.a(resources, resources.getXml(i), theme2);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme2);
        }
        synchronized (aco.b) {
            WeakHashMap weakHashMap2 = aco.a;
            SparseArray sparseArray2 = (SparseArray) weakHashMap2.get(acjVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap2.put(acjVar, sparseArray2);
            }
            sparseArray2.append(i, new aci(colorStateListA, acjVar.a.getConfiguration(), theme2));
        }
        return colorStateListA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (defpackage.abw.a(r6, r9) == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, int r10) {
        /*
            r0 = r10 & 1
            if (r0 == 0) goto L13
            r0 = r10 & 4
            if (r0 != 0) goto Lb
            r10 = r10 | 2
            goto L13
        Lb:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L13:
            r5 = r10
            r10 = r5 & 4
            r0 = r5 & 2
            if (r0 != 0) goto L25
            if (r10 == 0) goto L1d
            goto L27
        L1d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r6.<init>(r7)
            throw r6
        L25:
            if (r10 != 0) goto L89
        L27:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L80
            if (r10 == 0) goto L75
            if (r9 != 0) goto L75
            android.content.Context r9 = r6.getApplicationContext()
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            java.lang.String r9 = r9.concat(r10)
            int r0 = defpackage.abw.a(r6, r9)
            if (r0 == 0) goto L70
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L62
            java.lang.String r9 = defpackage.gf$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r9.concat(r10)
            int r10 = defpackage.abw.a(r6, r9)
            if (r10 != 0) goto L62
            goto L70
        L62:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Permission "
            java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r7 = defpackage.a.e(r9, r7, r8)
            r6.<init>(r7)
            throw r6
        L70:
            r10 = 0
            r6.registerReceiver(r7, r8, r9, r10)
            return
        L75:
            r4 = 0
            r5 = r5 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            defpackage.al$$ExternalSyntheticApiModelOutline0.m(r0, r1, r2, r3, r4, r5)
            return
        L80:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            defpackage.al$$ExternalSyntheticApiModelOutline0.m(r0, r1, r2, r3, r4, r5)
            return
        L89:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abs.c(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, int):void");
    }
}
