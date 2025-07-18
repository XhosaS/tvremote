package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqb {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        tqt tqtVarA;
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
        if (cause == null && b(th) == null && (tqtVarA = tqg.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (tqtVarA = tqg.a(); tqtVarA != null; tqtVarA = tqtVarA.a()) {
                arrayList.add(tqtVarA);
            }
            UUID uuidF = ((tqt) arrayList.get(0)).f();
            if (uuidF == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            ((tqt) arrayList.get(0)).j();
            ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(arrayList.size());
            ImmutableList.Builder builderBuilderWithExpectedSize2 = ImmutableList.builderWithExpectedSize(arrayList.size());
            for (tqt tqtVar : Lists.reverse(arrayList)) {
                builderBuilderWithExpectedSize2.add((ImmutableList.Builder) tqtVar.c());
                builderBuilderWithExpectedSize.add((ImmutableList.Builder) tqtVar.h());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                ImmutableList immutableListBuild = builderBuilderWithExpectedSize2.build();
                if (immutableListBuild == null) {
                    throw new NullPointerException("Null spansNames");
                }
                ImmutableList immutableListBuild2 = builderBuilderWithExpectedSize.build();
                if (immutableListBuild2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new tqw(immutableListBuild, immutableListBuild2, uuidF));
            }
        }
    }

    public static ulp b(Throwable th) {
        sij.x(true, "Trace uncaught exception is disabled.");
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
            tqw tqwVar = (tqw) weakHashMap.get(cause);
            weakHashMap.put(th, tqwVar);
            return new ulp(tqwVar, (byte[]) null);
        }
    }
}
