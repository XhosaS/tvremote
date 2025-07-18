package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wqd {
    public static wqd d(wqd wqdVar, wqd wqdVar2) {
        yqw.L(wqdVar.c().equals(wqdVar2.c()));
        HashSet hashSet = new HashSet();
        yqt yqtVarI = ypv.a;
        hashSet.addAll(wqdVar.c());
        long jMin = Math.min(wqdVar.a(), wqdVar2.a());
        yqt yqtVarB = wqdVar.b();
        boolean zG = yqtVarB.g();
        yqt yqtVarB2 = wqdVar2.b();
        if (zG && yqtVarB2.g()) {
            yqtVarI = yqt.i(Long.valueOf(Math.min(((Long) yqtVarB.c()).longValue(), ((Long) yqtVarB2.c()).longValue())));
        } else if (yqtVarB.g()) {
            yqtVarI = yqtVarB;
        } else if (yqtVarB2.g()) {
            yqtVarI = yqtVarB2;
        }
        return new wod(hashSet, jMin, yqtVarI);
    }

    public abstract long a();

    public abstract yqt b();

    public abstract Set c();
}
