package defpackage;

import com.google.android.libraries.elements.interfaces.Closure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nxp implements Runnable {
    public final /* synthetic */ nxv a;
    public final /* synthetic */ Closure b;

    public /* synthetic */ nxp(nxv nxvVar, Closure closure) {
        this.a = nxvVar;
        this.b = closure;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
        this.a.b.getAndDecrement();
    }
}
