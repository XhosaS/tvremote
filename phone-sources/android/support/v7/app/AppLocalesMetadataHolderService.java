package android.support.v7.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    /* compiled from: PG */
    class Api24Impl {
        private Api24Impl() {
        }

        static int getDisabledComponentFlag() {
            return 512;
        }
    }

    public static ServiceInfo getServiceInfo(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), 640);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
