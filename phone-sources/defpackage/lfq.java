package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfq {
    public static final lfq a;
    public final long[] b;
    public final String c;
    public final Set d;
    private final int e;

    static {
        char[] cArr = lfp.a;
        Set set = Collections.EMPTY_SET;
        a = new lfq(set, "", a(set));
    }

    public lfq(Set set, String str, long[] jArr) {
        this.d = set;
        this.c = str;
        this.b = jArr;
        this.e = Arrays.hashCode(jArr);
    }

    public static long[] a(Set set) {
        long[] jArr = new long[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        Arrays.sort(jArr);
        return jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lfq lfqVar = (lfq) obj;
        if (this.e != lfqVar.e) {
            return false;
        }
        return Arrays.equals(this.b, lfqVar.b);
    }

    public final int hashCode() {
        return this.e;
    }
}
