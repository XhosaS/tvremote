package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqh implements AutoCloseable, oqi {
    public static final Uri a = Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");
    public final ContentProviderClient b;
    private final String c;

    public oqh(Context context) throws RemoteException {
        this.c = context.getPackageName();
        ProviderInfo providerInfoResolveContentProvider = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", 0);
        if (providerInfoResolveContentProvider == null || !a.Q(providerInfoResolveContentProvider.applicationInfo.packageName, "com.google.android.gms")) {
            throw new RemoteException("com.google.android.gms is not the authority.");
        }
        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(a);
        if (contentProviderClientAcquireContentProviderClient == null) {
            throw new RemoteException("Unable to acquire ContentProviderClient");
        }
        this.b = contentProviderClientAcquireContentProviderClient;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.common.appdoctor.package_name", this.c);
        return bundle;
    }

    @Override // java.lang.AutoCloseable, defpackage.oqi
    public final void close() throws Exception {
        this.b.close();
    }
}
