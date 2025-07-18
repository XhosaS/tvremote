package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxh {
    public static final /* synthetic */ fxg a(fxc fxcVar) {
        abxd abxdVarV = fxcVar.v();
        abxdVarV.getClass();
        return (fxg) abxdVarV;
    }

    public static final /* synthetic */ acax b(fxc fxcVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fxg) fxcVar.b).b));
        mapUnmodifiableMap.getClass();
        return new acax(mapUnmodifiableMap);
    }

    public static final String c(fxc fxcVar) {
        String str = ((fxg) fxcVar.b).d;
        str.getClass();
        return str;
    }

    public static final void d(String str, fxc fxcVar) {
        str.getClass();
        if ((fxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fxcVar.y();
        }
        fxg fxgVar = (fxg) fxcVar.b;
        fxg fxgVar2 = fxg.a;
        fxgVar.d = str;
    }

    public static final void e(fxc fxcVar) {
        DesugarCollections.unmodifiableList(((fxg) fxcVar.b).c).getClass();
    }

    public static final void f(String str, fxe fxeVar, fxc fxcVar) {
        str.getClass();
        if ((fxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fxcVar.y();
        }
        fxg fxgVar = (fxg) fxcVar.b;
        fxg fxgVar2 = fxg.a;
        abyl abylVar = fxgVar.b;
        if (!abylVar.b) {
            fxgVar.b = abylVar.a();
        }
        fxgVar.b.put(str, fxeVar);
    }
}
