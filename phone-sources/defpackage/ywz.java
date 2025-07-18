package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
@yji
/* loaded from: classes3.dex */
public final class ywz {
    public static final Object a(Object obj, Object obj2) {
        boolean z = yoy.a;
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
