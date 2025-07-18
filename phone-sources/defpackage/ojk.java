package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojk implements nwi {
    public final int a;
    private final String b = null;

    public ojk(ydk ydkVar) {
        this.a = ydkVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ojk)) {
            return false;
        }
        ojk ojkVar = (ojk) obj;
        if (this.a == ojkVar.a) {
            String str = ojkVar.b;
            if (a.Q(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
