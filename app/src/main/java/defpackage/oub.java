package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oub implements oty {
    public static final /* synthetic */ int b = 0;
    public final yrp a;
    private final SharedPreferences c;

    static {
        Duration.ofMinutes(30L);
    }

    public oub(final Context context, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.c = sharedPreferences;
        sharedPreferences2.getBoolean("TERMS_ACCEPTED", false);
        sharedPreferences.getBoolean("CAST_SCREEN_LAUNCHED", false);
        this.a = yru.a(new yrp() { // from class: otz
            @Override // defpackage.yrp
            public final Object eV() throws PackageManager.NameNotFoundException {
                PackageInfo packageInfo;
                int i = oub.b;
                Context context2 = context;
                String packageName = context2.getApplicationContext().getPackageName();
                packageName.getClass();
                try {
                    packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                packageInfo.getClass();
                String str = packageInfo.versionName;
                str.getClass();
                return str;
            }
        });
        yru.a(new yrp() { // from class: oua
            @Override // defpackage.yrp
            public final Object eV() {
                int iIndexOf;
                String str = (String) this.a.a.eV();
                String str2 = context.getApplicationContext().getPackageName() + "/" + str;
                String property = System.getProperty("http.agent");
                if (property == null || (iIndexOf = property.indexOf(40)) <= 0) {
                    return str2;
                }
                return str2 + " " + property.substring(iIndexOf);
            }
        });
        bfs.a(context);
    }
}
