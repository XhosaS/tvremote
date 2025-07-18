package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgp implements Serializable {
    private static final long serialVersionUID = 1;
    public final int a;

    public sgp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof sgp) && this.a == ((sgp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a + 527;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", Integer.valueOf(this.a), false);
    }
}
