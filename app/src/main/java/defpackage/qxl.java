package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxl {
    public static final wvz a = new wvz();
    public final AtomicReference b = new AtomicReference();
    final AtomicReference c = new AtomicReference();

    qxl() {
    }

    public static qxl a(yyk yykVar) {
        qxl qxlVar;
        int i = 0;
        do {
            if (i >= ((zcg) yykVar).d) {
                break;
            }
            wvy wvyVarI = wwc.i(a, (wwc) yykVar.get(i));
            qxlVar = wvyVarI.b() ? (qxl) wvyVarI.a() : null;
            i++;
        } while (qxlVar == null);
        return qxlVar;
    }
}
