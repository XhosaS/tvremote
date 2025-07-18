package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fne {
    public static final /* synthetic */ fnd a(fmv fmvVar) {
        abxd abxdVarV = fmvVar.v();
        abxdVarV.getClass();
        return (fnd) abxdVarV;
    }

    public static final /* synthetic */ acax b(fmv fmvVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fnd) fmvVar.b).c));
        mapUnmodifiableMap.getClass();
        return new acax(mapUnmodifiableMap);
    }

    public static final void c(fmv fmvVar) {
        DesugarCollections.unmodifiableList(((fnd) fmvVar.b).d).getClass();
    }

    public static final void d(fmv fmvVar) {
        DesugarCollections.unmodifiableList(((fnd) fmvVar.b).f).getClass();
    }

    public static final void e(fmv fmvVar) {
        DesugarCollections.unmodifiableList(((fnd) fmvVar.b).h).getClass();
    }

    public static final void f(String str, fnc fncVar, fmv fmvVar) {
        str.getClass();
        if ((fmvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fmvVar.y();
        }
        fnd fndVar = (fnd) fmvVar.b;
        fnd fndVar2 = fnd.a;
        abyl abylVar = fndVar.c;
        if (!abylVar.b) {
            fndVar.c = abylVar.a();
        }
        fndVar.c.put(str, fncVar);
    }
}
