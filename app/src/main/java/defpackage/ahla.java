package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahla {
    public static final void a(agte agteVar, Throwable th) {
        Iterator it = ahkz.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(agteVar, th);
            } catch (ahlf unused) {
                return;
            } catch (Throwable th2) {
                ahkz.a(ahbo.a(th, th2));
            }
        }
        try {
            agox.a(th, new ahlc(agteVar));
        } catch (Throwable unused2) {
        }
        ahkz.a(th);
    }
}
