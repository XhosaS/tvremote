package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.android.videos.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dab implements RemoteViewsService.RemoteViewsFactory {
    private static final obk d = new obk(new long[0], new RemoteViews[0]);
    private final Context a;
    private final int b;
    private final int c;
    private obk e = d;

    public dab(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        this.c = i2;
    }

    private final void a() {
        Long lValueOf;
        Context context = this.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        sb.append(i);
        sb.append(':');
        sb.append(this.c);
        obk obkVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", a.cf(i, "No collection items were stored for widget "));
        } else {
            cjp cjpVar = new cjp(2);
            byte[] bArrDecode = Base64.decode(string, 0);
            bArrDecode.getClass();
            daa daaVar = (daa) czt.b(bArrDecode, cjpVar);
            if (yks.e(Build.VERSION.INCREMENTAL, daaVar.b)) {
                try {
                    lValueOf = Long.valueOf(crp.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
                } catch (PackageManager.NameNotFoundException e) {
                    PackageManager packageManager = context.getPackageManager();
                    Objects.toString(packageManager);
                    Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for ".concat(String.valueOf(packageManager)), e);
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    Log.w("RemoteViewsCompatServic", a.cf(i, "Couldn't get version code, not using stored collection items for widget "));
                } else {
                    if (lValueOf.longValue() != daaVar.c) {
                        Log.w("RemoteViewsCompatServic", a.cf(i, "App version code has changed, not using stored collection items for widget "));
                    } else {
                        try {
                            obkVar = (obk) czt.b(daaVar.a, new cjp(3));
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", a.cf(i, "Unable to deserialize stored collection items for widget "), th);
                        }
                    }
                }
            } else {
                Log.w("RemoteViewsCompatServic", a.cf(i, "Android version code has changed, not using stored collection items for widget "));
            }
        }
        if (obkVar == null) {
            obkVar = d;
        }
        this.e = obkVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.e.d).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.e.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.e.c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.e.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.e.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
