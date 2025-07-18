package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cug implements Serializable, cuk, crw {
    protected final Object a;
    private final Class d;
    private transient cug g;
    public final String b = "updateEnabledCallbacks";
    public final String c = "updateEnabledCallbacks$navigationevent_release()V";
    private final int e = 0;
    private final int f = 0;

    public cug(Object obj, Class cls) {
        this.a = obj;
        this.d = cls;
    }

    public final cuw b() {
        int i = cun.a;
        return new cui(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cug) {
            cug cugVar = (cug) obj;
            if (this.b.equals(cugVar.b) && this.c.equals(cugVar.c)) {
                int i = cugVar.f;
                int i2 = cugVar.e;
                if (dnx.aB(this.a, cugVar.a) && dnx.aB(b(), cugVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cuk
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        b();
        return (((b().hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        cug cugVar = this.g;
        if (cugVar == null) {
            int i = cun.a;
            this.g = this;
            cugVar = this;
        }
        if (cugVar != this) {
            return cugVar.toString();
        }
        String str = this.b;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : b.c(str, "function ", " (Kotlin reflection is not available)");
    }
}
