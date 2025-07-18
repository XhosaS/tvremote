package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cng {
    public static final int a(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.y().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        b(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    public static final void b(WorkDatabase workDatabase, String str, int i) {
        workDatabase.y().b(new cju(str, Long.valueOf(i)));
    }
}
