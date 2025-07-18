package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvw {
    public static final /* synthetic */ fvv a(fvr fvrVar) {
        abxd abxdVarV = fvrVar.v();
        abxdVarV.getClass();
        return (fvv) abxdVarV;
    }

    public static final /* synthetic */ acax b(fvr fvrVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fvv) fvrVar.b).b));
        mapUnmodifiableMap.getClass();
        return new acax(mapUnmodifiableMap);
    }

    public static final void c(String str, fvu fvuVar, fvr fvrVar) {
        str.getClass();
        if ((fvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fvrVar.y();
        }
        fvv fvvVar = (fvv) fvrVar.b;
        fvv fvvVar2 = fvv.a;
        abyl abylVar = fvvVar.b;
        if (!abylVar.b) {
            fvvVar.b = abylVar.a();
        }
        fvvVar.b.put(str, fvuVar);
    }
}
