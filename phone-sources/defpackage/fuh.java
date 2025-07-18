package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuh {
    public final Bundle a;
    private fur b;

    public fuh(fur furVar, boolean z) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = furVar;
        bundle.putBundle("selector", furVar.b);
        bundle.putBoolean("activeScan", z);
    }

    private final void d() {
        if (this.b == null) {
            fur furVarA = fur.a(this.a.getBundle("selector"));
            this.b = furVarA;
            if (furVarA == null) {
                this.b = fur.a;
            }
        }
    }

    public final fur a() {
        d();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        d();
        fur furVar = this.b;
        furVar.c();
        return !furVar.c.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fuh) {
            fuh fuhVar = (fuh) obj;
            if (a().equals(fuhVar.a()) && b() == fuhVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() ^ b();
    }

    public final String toString() {
        return "DiscoveryRequest{ selector=" + a() + ", activeScan=" + b() + ", isValid=" + c() + " }";
    }
}
