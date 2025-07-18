package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eck {
    public final ecu a;
    public final ecu b;
    public Object c;
    public Object d;
    public int e;
    private final pku f;

    public eck(Object obj, Looper looper, Looper looper2, ecn ecnVar, pku pkuVar) {
        this.a = ecnVar.b(looper, null);
        this.b = ecnVar.b(looper2, null);
        this.c = obj;
        this.d = obj;
        this.f = pkuVar;
    }

    public final void a(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        if (obj2.equals(obj)) {
            return;
        }
        pku pkuVar = this.f;
        ((Integer) obj2).intValue();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        eiz eizVar = (eiz) pkuVar.a;
        eizVar.aG();
        eizVar.az(1, 10, num);
        eizVar.az(2, 10, num);
        eizVar.H.h(21, new eiq(iIntValue, 0));
    }
}
