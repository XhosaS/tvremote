package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wub {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static wzf a(Throwable th) {
        yqw.M(true, "Trace uncaught exception is disabled.");
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
            wxm wxmVar = (wxm) weakHashMap.get(cause);
            weakHashMap.put(th, wxmVar);
            return new wzf(wxmVar);
        }
    }

    public static void b(Throwable th) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }

    public static void c(Throwable th) {
        Throwable cause;
        wwq wwqVarA;
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
        if (cause == null && a(th) == null && (wwqVarA = wum.c().c) != null) {
            ArrayList arrayList = new ArrayList();
            for (wwqVarA = wum.c().c; wwqVarA != null; wwqVarA = wwqVarA.a()) {
                arrayList.add(wwqVarA);
            }
            UUID uuidG = ((wwq) arrayList.get(0)).g();
            if (uuidG == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            long jL = ((wwq) arrayList.get(0)).l();
            yyf yyfVarG = yyk.g(arrayList.size());
            yyf yyfVarG2 = yyk.g(arrayList.size());
            for (wwq wwqVar : Lists.b(arrayList)) {
                yyfVarG2.g(wwqVar.d());
                yyfVarG.g(wwqVar.k());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                yyk yykVarF = yyfVarG2.f();
                if (yykVarF == null) {
                    throw new NullPointerException("Null spansNames");
                }
                yyk yykVarF2 = yyfVarG.f();
                if (yykVarF2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new wta(yykVarF, yykVarF2, uuidG, jL));
            }
        }
    }
}
