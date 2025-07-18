package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ash {
    public abstract Object a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof ash) {
            return Objects.equals(a(), ((ash) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }
}
