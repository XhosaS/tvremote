package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwp {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static IOException h(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? u(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? u(file, iOException) : u(file, iOException) : parentFile.canWrite() ? u(file, iOException) : u(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? u(file, iOException) : u(file, iOException) : parentFile.canWrite() ? u(file, iOException) : u(file, iOException) : u(file, iOException);
    }

    public static Exception i(String str, Exception exc) {
        int i;
        Object objInvoke;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            objInvoke = method.invoke(null, a.cd(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
        } catch (Throwable th) {
            ybn.h(exc, th);
        }
        if (!yks.e((String) objInvoke, "true")) {
            if (str != null) {
                File file = new File(str, "siblingTestFile.txt");
                if (file.exists()) {
                    file.delete();
                }
                try {
                    try {
                        file.createNewFile();
                    } catch (IOException unused2) {
                        exc = new dca(exc);
                    }
                    return exc;
                } finally {
                    file.delete();
                }
            }
        }
        return exc;
    }

    public static void j(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        nz nzVar = new nz(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 6);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build() : new StrictMode.VmPolicy.Builder().build());
        nzVar.a();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static Uri k(dmw dmwVar, int i, int i2, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(cwq.m(i2));
        builder.appendQueryParameter("appWidgetId", String.valueOf(dmwVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", cmc.c(dmwVar.i));
        builder.appendQueryParameter("extraData", str);
        if (dmwVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(dmwVar.j));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(dmwVar.k));
        }
        return builder.build();
    }

    public static /* synthetic */ Intent l(Intent intent, dmw dmwVar, int i, int i2) {
        Intent intent2 = new Intent();
        intent2.setComponent((ComponentName) dmwVar.o.a);
        intent2.setData(m(dmwVar, i, i2));
        intent2.putExtra("ACTION_TYPE", cwq.m(i2));
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static /* synthetic */ Uri m(dmw dmwVar, int i, int i2) {
        return k(dmwVar, i, i2, "");
    }

    public static Intent n(dmw dmwVar, Class cls, djs djsVar) {
        Intent intentPutExtra = new Intent().setComponent((ComponentName) dmwVar.o.b).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", dmwVar.b);
        Map mapA = djsVar.a();
        ArrayList arrayList = new ArrayList(mapA.size());
        for (Map.Entry entry : mapA.entrySet()) {
            djq djqVar = (djq) entry.getKey();
            arrayList.add(new yfw(djqVar.a, entry.getValue()));
        }
        yfw[] yfwVarArr = (yfw[]) arrayList.toArray(new yfw[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", cmq.j((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length)));
        return intentPutExtra;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dnx o(android.content.Context r11, defpackage.diz r12) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwp.o(android.content.Context, diz):dnx");
    }

    public static String p(int i) {
        return a.cf(i, "appWidgetLayout-");
    }

    public static float q(int i, DisplayMetrics displayMetrics) {
        return i / displayMetrics.density;
    }

    public static int r(RemoteViews remoteViews, dmw dmwVar, int i, int i2, Integer num) {
        int i3 = -1;
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : dmwVar.a();
        if (iIntValue != -1) {
            cyg.f(16, "setInflatedId");
            remoteViews.setInt(i, "setInflatedId", iIntValue);
            i3 = iIntValue;
        }
        if (i2 != 0) {
            cyg.f(16, "setLayoutResource");
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return i3;
    }

    public static int s(float f, DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }

    private static IOException u(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    private static int v(int i) {
        if (a.r(i, 0)) {
            return 3;
        }
        if (a.r(i, 1)) {
            return 4;
        }
        if (a.r(i, 2)) {
            return 5;
        }
        String strA = drm.a(i);
        Objects.toString(strA);
        throw new IllegalStateException("unknown horizontal alignment ".concat(strA));
    }

    private static int w(int i) {
        if (a.r(i, 0)) {
            return 3;
        }
        if (a.r(i, 1)) {
            return 4;
        }
        if (a.r(i, 2)) {
            return 5;
        }
        String strA = drn.a(i);
        Objects.toString(strA);
        throw new IllegalStateException("unknown vertical alignment ".concat(strA));
    }

    private static int x(czu czuVar, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return czuVar instanceof duh ? 6 : 4;
        }
        dmf.d(czuVar, context);
        if (czuVar instanceof dug) {
            return 3;
        }
        if (czuVar instanceof duk) {
            return 4;
        }
        if (czuVar instanceof dui) {
            return 5;
        }
        if (czuVar instanceof duh) {
            return 6;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public void g() {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }
}
