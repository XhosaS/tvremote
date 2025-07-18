package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class teo {
    public static final ulp d = new ulp("AppUpdateService", (byte[]) null);
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public tfs a;
    public final String b;
    public final Context c;
    public final ulp e;

    public teo(Context context, ulp ulpVar) {
        this.b = context.getPackageName();
        this.c = context;
        this.e = ulpVar;
        if (tfu.a(context)) {
            this.a = new tfs(sio.e(context), d, "AppUpdateService", f, new tfd(1));
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 20200);
        return bundle;
    }

    public static onz c() {
        d.am("onError(%d)", -9);
        return osk.q(new teu(-9));
    }

    public static HashSet d(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
