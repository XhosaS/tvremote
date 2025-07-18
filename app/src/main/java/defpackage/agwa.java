package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwa implements agvp {
    private final Class a;

    public agwa(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.agvp
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof agwa) && agvy.c(this.a, ((agwa) obj).a);
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
