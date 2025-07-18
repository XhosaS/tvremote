package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpx implements ServiceConnection {
    private final /* synthetic */ int a;

    public bpx(int i) {
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }
}
