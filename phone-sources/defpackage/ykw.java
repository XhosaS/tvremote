package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykw implements ykk {
    private final Class a;

    public ykw(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.ykk
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ykw) && yks.e(this.a, ((ykw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
