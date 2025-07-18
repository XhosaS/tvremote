package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afln extends Binder {
    private static final Logger b = Logger.getLogger(afln.class.getName());
    public aflm a;

    public afln(aflm aflmVar) {
        this.a = aflmVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        aflm aflmVar = this.a;
        if (aflmVar != null) {
            try {
                if ((i2 & 1) != 0) {
                    return aflmVar.a(i, parcel);
                }
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.b(i2, "ignoring non-oneway transaction. flags="));
                return false;
            } catch (RuntimeException e) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.b(i, "failure sending transaction "), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
