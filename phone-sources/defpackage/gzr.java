package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzr extends dve implements dvk {
    public static final gzr b;
    private static final gzr c;
    private static final dvd d;

    static {
        gzr gzrVar = new gzr();
        b = gzrVar;
        c = gzrVar;
        d = dvd.e;
    }

    private gzr() {
    }

    @Override // defpackage.dve
    public final dvd a() {
        return d;
    }

    @Override // defpackage.dve
    public final void c(dvj dvjVar) {
        dvjVar.getClass();
        if (!(dvjVar instanceof duv)) {
            Objects.toString(dvjVar);
            throw new IllegalArgumentException(dvjVar.toString().concat(" must implement androidx.lifecycle.DefaultLifecycleObserver."));
        }
        duv duvVar = (duv) dvjVar;
        duvVar.f(this);
        duvVar.k();
    }

    @Override // defpackage.dve
    public final void d(dvj dvjVar) {
        dvjVar.getClass();
    }

    @Override // defpackage.dvk
    public final /* synthetic */ dve getLifecycle() {
        return c;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
