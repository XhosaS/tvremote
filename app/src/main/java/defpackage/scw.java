package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scw {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future, zyd] */
    public static final yqt a(yqt yqtVar) {
        yqtVar.getClass();
        if (!yqtVar.g()) {
            return yqtVar;
        }
        ?? A = ((scs) yqtVar.c()).a();
        if (!A.isDone()) {
            return yqtVar;
        }
        Object objO = zxn.o(A);
        objO.getClass();
        if ((((rut) objO).b & 1) == 0) {
            return yqtVar;
        }
        rus rusVar = new rus();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((rusVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rusVar.y();
        }
        rut rutVar = (rut) rusVar.b;
        rutVar.b |= 1;
        rutVar.c = jElapsedRealtime;
        final zyd zydVarH = zxn.h(rzd.a(rusVar));
        return yqt.h(new scs() { // from class: scv
            @Override // defpackage.scg
            public final Object a() {
                return zydVarH;
            }
        });
    }
}
