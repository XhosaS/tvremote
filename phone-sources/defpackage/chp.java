package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chp {
    public static final chn a = new chn();
    public static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final boolean c(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
