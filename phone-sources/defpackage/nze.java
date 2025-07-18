package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nze {
    public final nxn a;
    public final nvg b;

    public nze(nxn nxnVar, nvg nvgVar) {
        this.a = nxnVar;
        this.b = nvgVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nze)) {
            nze nzeVar = (nze) obj;
            if (a.Q(this.a, nzeVar.a) && a.Q(this.b, nzeVar.b)) {
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
        ocv.aK("key", this.a, arrayList);
        ocv.aK("feature", this.b, arrayList);
        return ocv.aJ(arrayList, this);
    }
}
