package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class affn {
    static final affo a;

    static {
        affo afkdVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            afkdVar = (affo) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(affo.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            afkdVar = new afkd();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = afkdVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            affp.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
