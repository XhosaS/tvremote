package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecb {
    public final ImmutableList d;
    public final long e;
    private static final Ordering f = Ordering.natural().onResultOf(new dzc(10));
    public static final ecb a = new ecb(ImmutableList.of(), 0);
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);

    public ecb(List list, long j) {
        this.d = ImmutableList.sortedCopyOf(f, list);
        this.e = j;
    }
}
