package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otc extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            aabs aabsVarM = aabs.m(TimeZone.getDefault());
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new aaca());
            }
            if (aabsVarM == null) {
                throw new IllegalArgumentException("The datetime zone must not be null");
            }
            synchronized (aabs.class) {
                aabs.d = aabsVarM;
            }
        } catch (IllegalArgumentException e) {
            Log.e("fast-joda", "Failed to update default  timezone", e);
        }
    }
}
