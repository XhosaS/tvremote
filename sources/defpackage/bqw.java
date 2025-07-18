package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqw {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/provider/AudioProviderService");
    public static final String[] b = {"com.google.android.katniss"};
    public final Context c;
    public final AppOpsManager d;
    public final PackageManager e;
    public final bqo f;
    public final bqy g;
    public int h = 0;
    public int i = 0;
    public final bsi j;

    public bqw(Context context, bsi bsiVar, bqo bqoVar, bqy bqyVar) {
        this.c = context;
        this.e = context.getPackageManager();
        this.j = bsiVar;
        this.f = bqoVar;
        this.g = bqyVar;
        this.d = (Build.VERSION.SDK_INT >= 29 || context.checkSelfPermission("android.permission.UPDATE_APP_OPS_STATS") == 0) ? (AppOpsManager) context.getSystemService(AppOpsManager.class) : null;
    }
}
