package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahd {
    public final agr a;
    public final aes b;

    public ahd(agr agrVar, aes aesVar) {
        this.a = agrVar;
        this.b = aesVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ahd)) {
            ahd ahdVar = (ahd) obj;
            if (ii.X(this.a, ahdVar.a) && ii.X(this.b, ahdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qp.s("key", this.a, arrayList);
        qp.s("feature", this.b, arrayList);
        return qp.r(arrayList, this);
    }
}
