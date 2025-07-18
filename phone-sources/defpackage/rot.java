package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rot extends ron {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.ron
    public final void g(rmp rmpVar) {
        ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 195, "ForegroundTracker.java")).s("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((roq) it.next()).g(rmpVar);
        }
    }

    @Override // defpackage.ron
    public final void j(rmp rmpVar) {
        ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 187, "ForegroundTracker.java")).s("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((roq) it.next()).j(rmpVar);
        }
    }
}
