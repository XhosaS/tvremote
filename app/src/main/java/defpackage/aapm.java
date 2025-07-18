package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapm {
    final /* synthetic */ FirebaseMessaging a;
    private final aaln b;
    private boolean c;
    private aall d;
    private Boolean e;

    public aapm(FirebaseMessaging firebaseMessaging, aaln aalnVar) {
        this.a = firebaseMessaging;
        this.b = aalnVar;
    }

    final synchronized void a() {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        if (this.c) {
            return;
        }
        aahf aahfVar = this.a.c;
        aahfVar.d();
        Context context = aahfVar.c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        }
        this.e = boolValueOf;
        if (boolValueOf == null) {
            aall aallVar = new aall() { // from class: aapl
                @Override // defpackage.aall
                public final void a() {
                    aapm aapmVar = this.a;
                    if (aapmVar.b()) {
                        aapmVar.a.i();
                    }
                }
            };
            this.d = aallVar;
            this.b.a(aaha.class, aallVar);
        }
        this.c = true;
    }

    final synchronized boolean b() {
        Boolean bool;
        a();
        bool = this.e;
        return bool != null ? bool.booleanValue() : this.a.c.f();
    }
}
