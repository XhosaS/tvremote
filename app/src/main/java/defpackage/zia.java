package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zia implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zig zigVarA = zig.a(obj);
        zig zigVarA2 = zig.a(obj2);
        if (zigVarA != zigVarA2) {
            return zigVarA.compareTo(zigVarA2);
        }
        int iOrdinal = zigVarA.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
