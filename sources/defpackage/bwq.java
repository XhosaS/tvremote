package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwq {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [bxk, java.lang.Object] */
    public static void a(Throwable th) {
        Throwable cause;
        Object obj;
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null && b(th) == null && (obj = bwv.a().b) != null) {
            ArrayList arrayList = new ArrayList();
            for (?? A = obj; A != 0; A = A.a()) {
                arrayList.add(A);
            }
            UUID uuidF = ((bxk) arrayList.get(0)).f();
            if (uuidF == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            ((bxk) arrayList.get(0)).j();
            bzo bzoVarJ = bzs.j(arrayList.size());
            bzo bzoVarJ2 = bzs.j(arrayList.size());
            for (bxk bxkVar : biu.f(arrayList)) {
                bzoVarJ2.g(bxkVar.c());
                bzoVarJ.g(bxkVar.h());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                bzs bzsVarF = bzoVarJ2.f();
                if (bzsVarF == null) {
                    throw new NullPointerException("Null spansNames");
                }
                bzs bzsVarF2 = bzoVarJ.f();
                if (bzsVarF2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new bxn(bzsVarF, bzsVarF2, uuidF));
            }
        }
    }

    public static adx b(Throwable th) {
        bdq.k(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            Throwable cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cause == null) {
                return null;
            }
            bxn bxnVar = (bxn) weakHashMap.get(cause);
            weakHashMap.put(th, bxnVar);
            return new adx(bxnVar, (byte[]) null);
        }
    }
}
