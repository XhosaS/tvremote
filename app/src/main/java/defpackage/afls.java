package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afls extends aflu {
    private final afyq d;

    public afls(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new afyq(executor);
    }

    @Override // defpackage.aflu
    public final void a(final int i, aflx aflxVar) {
        final Parcel parcelA = aflxVar.a();
        this.d.execute(new Runnable() { // from class: aflr
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (this.a.b(i, parcelA)) {
                        return;
                    }
                    aflu.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                } catch (Exception e) {
                    aflu.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                }
            }
        });
        aflxVar.a();
        aflxVar.a = null;
    }
}
