package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyc implements eya {
    private final ArrayList a = new ArrayList();

    private final int g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((fit) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.eya
    public final long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((fit) arrayList.get(0)).b) {
            return ((fit) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((fit) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((fit) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((fit) Iterables.getLast(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // defpackage.eya
    public final long b(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((fit) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((fit) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                fit fitVar = (fit) arrayList.get(i - 1);
                long j3 = fitVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? fitVar.b : j3;
            }
        }
        fit fitVar2 = (fit) Iterables.getLast(arrayList);
        long j4 = fitVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? fitVar2.b : j4;
    }

    @Override // defpackage.eya
    public final ImmutableList c(long j) {
        int iG = g(j);
        if (iG == 0) {
            return ImmutableList.of();
        }
        fit fitVar = (fit) this.a.get(iG - 1);
        long j2 = fitVar.d;
        return (j2 == -9223372036854775807L || j < j2) ? fitVar.a : ImmutableList.of();
    }

    @Override // defpackage.eya
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.eya
    public final void e(long j) {
        int iG = g(j);
        if (iG == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int i = iG - 1;
        long j2 = ((fit) arrayList.get(i)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iG = i;
        }
        arrayList.subList(0, iG).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // defpackage.eya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.fit r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto Lf
            r4 = r5
            goto L10
        Lf:
            r4 = r6
        L10:
            defpackage.a.H(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r5
            goto L24
        L23:
            r2 = r6
        L24:
            java.util.ArrayList r3 = r9.a
            int r4 = r3.size()
        L2a:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L50
            java.lang.Object r7 = r3.get(r4)
            fit r7 = (defpackage.fit) r7
            long r7 = r7.b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3f
            int r4 = r4 + r5
            r3.add(r4, r10)
            return r2
        L3f:
            java.lang.Object r7 = r3.get(r4)
            fit r7 = (defpackage.fit) r7
            long r7 = r7.b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4d
            r7 = r6
            goto L4e
        L4d:
            r7 = r5
        L4e:
            r2 = r2 & r7
            goto L2a
        L50:
            r3.add(r6, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyc.f(fit, long):boolean");
    }
}
