package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class asj {
    public int a = 1;

    public abstract void i(aqe aqeVar);

    public abstract void j(aqe aqeVar);

    public final void k(aqe aqeVar) {
        if (this.a == 3) {
            ((cbs) aqn.a.d().j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).p("Already in the background, not transitioning");
        } else {
            this.a = 3;
            i(aqeVar);
        }
    }

    public final void l(aqe aqeVar) {
        if (this.a == 2) {
            ((cbs) aqn.a.d().j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).p("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(aqeVar);
        }
    }
}
