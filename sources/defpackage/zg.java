package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zg {
    public final Bundle a;
    private zp b;

    public zg(zp zpVar, boolean z) {
        if (zpVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = zpVar;
        bundle.putBundle("selector", zpVar.b);
        bundle.putBoolean("activeScan", z);
    }

    private final void d() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            zp zpVar = zp.a;
            zp zpVar2 = bundle != null ? new zp(bundle, null) : null;
            this.b = zpVar2;
            if (zpVar2 == null) {
                this.b = zp.a;
            }
        }
    }

    public final zp a() {
        d();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        d();
        zp zpVar = this.b;
        zpVar.b();
        return !zpVar.c.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zg) {
            zg zgVar = (zg) obj;
            if (a().equals(zgVar.a()) && b() == zgVar.b()) {
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
