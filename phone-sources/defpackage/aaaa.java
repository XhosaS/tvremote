package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaaa {
    private static final Object a = new Object();
    private static Context b;
    private static Bundle c;

    public static Bundle a(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                new zyg("CronetManifest#getMetaData fetching info", 0);
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                c = (serviceInfo == null || serviceInfo.metaData == null) ? new Bundle() : serviceInfo.metaData;
                b = applicationContext;
                Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }
}
