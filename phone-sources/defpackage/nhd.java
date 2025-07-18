package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhd extends nhk {
    public static final String a = nhk.c;

    /* JADX WARN: Finally extract failed */
    @Deprecated
    public static Account[] a(Context context) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        rbi rbiVarL = rbi.l(context);
        try {
            ocv.aD("com.google");
            try {
                int i = nvk.c;
                nwb.c(context, 8400000);
                ocv.aF(context);
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireContentProviderClient == null) {
                        throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("callingActivity", context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "");
                            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (bundleCall == null) {
                                throw new RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                            if (parcelableArray == null) {
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            contentProviderClientAcquireContentProviderClient.release();
                            rbiVarL.i(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                            return accountArr;
                        } catch (Exception e) {
                            nhk.e.d("Exception when getting accounts", e);
                            throw new RemoteException("Accounts ContentProvider failed: " + e.getMessage());
                        }
                    } catch (RemoteException e2) {
                        nhk.e.d("RemoteException when fetching accounts", e2);
                        throw e2;
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireContentProviderClient.release();
                    throw th;
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new nvz();
            }
        } catch (Exception e3) {
            rbiVarL.i(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }
}
