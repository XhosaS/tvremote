package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ron {
    public int a = 1;

    public abstract void g(rmp rmpVar);

    public abstract void j(rmp rmpVar);

    public final void k(rmp rmpVar) {
        if (this.a == 3) {
            ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).s("Already in the background, not transitioning");
        } else {
            this.a = 3;
            g(rmpVar);
        }
    }

    public final void l(rmp rmpVar) {
        if (this.a == 2) {
            ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).s("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(rmpVar);
        }
    }
}
