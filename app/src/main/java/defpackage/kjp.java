package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kjp {
    public static final Object a = new Object();
    public static HandlerThread b;
    private static kjs c;

    public static kjp b(Context context) {
        synchronized (a) {
            if (c == null) {
                c = new kjs(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return c;
    }

    public abstract ConnectionResult a(kjo kjoVar, ServiceConnection serviceConnection, String str, Executor executor);

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new kjo(componentName), serviceConnection);
    }

    protected abstract void d(kjo kjoVar, ServiceConnection serviceConnection);

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        d(new kjo(str, z), serviceConnection);
    }
}
