package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kku implements kee {
    public static final kku b = new kku(null);
    public final String c;

    public kku(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kku) {
            return kki.a(this.c, ((kku) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }
}
