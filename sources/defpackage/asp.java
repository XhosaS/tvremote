package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asp extends asj {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.asj
    public final void i(aqe aqeVar) {
        ((cbs) aqn.a.d().j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 195, "ForegroundTracker.java")).p("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).i(aqeVar);
        }
    }

    @Override // defpackage.asj
    public final void j(aqe aqeVar) {
        ((cbs) aqn.a.d().j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 187, "ForegroundTracker.java")).p("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).j(aqeVar);
        }
    }
}
