package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocf implements nwi {
    public static final ocf a = new ocf(null);
    public final String b;

    public ocf(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ocf) {
            return a.Q(this.b, ((ocf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
