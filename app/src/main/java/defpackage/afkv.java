package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afkv implements aflm {
    static final afkv a = new afkv();

    @Override // defpackage.aflm
    public final boolean a(int i, Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            IBinder strongBinder = parcel.readStrongBinder();
            try {
                aflx aflxVarB = aflx.b();
                try {
                    aflxVarB.a().writeInt(0);
                    strongBinder.transact(2, aflxVarB.a(), null, 1);
                    aflxVarB.close();
                } finally {
                }
            } catch (RemoteException e) {
                afkw.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (Throwable) e);
            }
        }
        return false;
    }
}
