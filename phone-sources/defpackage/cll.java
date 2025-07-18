package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cll {
    public static final cll a = new cll(0);
    public static final cll b = new cll(1);
    public static final cll c = new cll(2);
    public final int d;

    public cll(int i) {
        this.d = i;
    }

    public final boolean a(cll cllVar) {
        int i = this.d;
        return (cllVar.d | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cll) && this.d == ((cll) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + cmq.d(arrayList, ", ", null, null, null, 62) + ']';
    }
}
