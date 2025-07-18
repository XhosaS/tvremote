package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckp {
    public final Locale a;

    public ckp(Locale locale) {
        this.a = locale;
    }

    public final String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ckp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return yks.e(a(), ((ckp) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
