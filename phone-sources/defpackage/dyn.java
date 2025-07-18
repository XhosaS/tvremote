package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyn {
    public static final dyn a = new dyn(new dym[0]);
    public static final String b;
    private static final dym g;
    public final dym[] f;
    public final long d = 0;
    public final int c = 0;
    public final int e = 0;

    static {
        dym dymVar = new dym(-1, new int[0], new dzy[0], new long[0], new String[0]);
        int[] iArr = dymVar.p;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = dymVar.q;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        g = new dym(0, iArrCopyOf, (dzy[]) Arrays.copyOf(dymVar.o, 0), jArrCopyOf, (String[]) Arrays.copyOf(dymVar.r, 0));
        b = edt.Z(1);
        edt.Z(2);
        edt.Z(3);
        edt.Z(4);
    }

    private dyn(dym[] dymVarArr) {
        this.f = dymVarArr;
    }

    public final dym a(int i) {
        return i < 0 ? g : this.f[i];
    }

    public final void b() {
        a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyn dynVar = (dyn) obj;
            if (Objects.equals(null, null) && Arrays.equals(this.f, dynVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
