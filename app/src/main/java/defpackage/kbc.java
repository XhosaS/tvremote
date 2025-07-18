package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbc {
    private static volatile kbc a;
    private int c = 0;
    private final Map b = new we();

    private kbc() {
    }

    static kbc b() {
        if (a == null) {
            synchronized (kbc.class) {
                if (a == null) {
                    a = new kbc();
                }
            }
        }
        return a;
    }

    final synchronized BatchedLogErrorParcelable a() {
        ArrayList arrayList;
        Map map = this.b;
        arrayList = new ArrayList(map.values());
        int i = this.c;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.c = 0;
        }
        map.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized void c(LogErrorParcelable logErrorParcelable) {
        afg afgVar = new afg(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        Map map = this.b;
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) map.get(afgVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = ztm.d(logErrorParcelable2.c + logErrorParcelable.c);
        } else if (((wx) map).d < 100) {
            map.put(afgVar, logErrorParcelable);
        } else {
            this.c = ztm.d(this.c + logErrorParcelable.c);
        }
    }
}
