package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xqm {
    static final xqn a;

    static {
        xqn xtrVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            xtrVar = (xqn) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(xqn.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            xtrVar = new xtr();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = xtrVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            xqo.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
