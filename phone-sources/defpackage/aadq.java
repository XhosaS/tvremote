package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aadq implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected aabk b() {
        throw null;
    }

    public abstract aabm c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadq)) {
            return false;
        }
        aadq aadqVar = (aadq) obj;
        return d() == aadqVar.d() && g().equals(aadqVar.g()) && vxr.aA(b(), aadqVar.b());
    }

    public final String f(Locale locale) {
        return c().o(a(), locale);
    }

    public final aabo g() {
        return c().r();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().q() + "]";
    }
}
