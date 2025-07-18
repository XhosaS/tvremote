package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yqk implements yqa {
    public final yqq a;
    public final ynr b;
    private final ynu c;
    private final ynu d;

    public yqk(yqq yqqVar, Throwable th) {
        this.a = yqqVar;
        ynv ynvVar = ynv.a;
        this.b = new ynr(false, ynvVar);
        this.c = new ynu(th, ynvVar);
        this.d = new ynu(null, ynvVar);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            this.c.c(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            f(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                Objects.toString(objC);
                throw new IllegalStateException("State is ".concat(objC.toString()));
            }
        }
        if (th != objC) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objC);
            arrayList.add(th);
            f(arrayList);
        }
    }

    @Override // defpackage.yqa
    public final yqq eC() {
        return this.a;
    }

    @Override // defpackage.yqa
    public final boolean eE() {
        return d() == null;
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
