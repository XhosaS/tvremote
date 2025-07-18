package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyf extends jyg {
    public static final jyf a = new jyf();

    private jyf() {
        super("rating/{type}");
    }

    public static final String a(jaz jazVar) {
        jazVar.getClass();
        Objects.toString(jazVar);
        return "rating/".concat(jazVar.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1403207064;
    }

    public final String toString() {
        return "RatingSelectionScreen";
    }
}
