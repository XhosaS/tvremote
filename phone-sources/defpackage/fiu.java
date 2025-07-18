package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiu implements fix {
    public static final /* synthetic */ int a = 0;
    private static final Ordering b = Ordering.natural().onResultOf(new eyt(5));
    private final ImmutableList c;
    private final long[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fiu(java.util.List r15) {
        /*
            r14 = this;
            r14.<init>()
            int r0 = r15.size()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L4a
            java.lang.Object r15 = com.google.common.collect.Iterables.getOnlyElement(r15)
            fit r15 = (defpackage.fit) r15
            long r5 = r15.b
            long r5 = d(r5)
            long r7 = r15.c
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            com.google.common.collect.ImmutableList r15 = r15.a
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of(r15)
            r14.c = r15
            long[] r15 = new long[r4]
            r15[r3] = r5
            r14.d = r15
            return
        L31:
            com.google.common.collect.ImmutableList r0 = r15.a
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0, r1)
            r14.c = r0
            long r0 = r15.c
            long r0 = r0 + r5
            r15 = 2
            long[] r15 = new long[r15]
            r15[r3] = r5
            r15[r4] = r0
            r14.d = r15
            return
        L4a:
            int r0 = r15.size()
            int r0 = r0 + r0
            long[] r0 = new long[r0]
            r14.d = r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.collect.Ordering r4 = defpackage.fiu.b
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.sortedCopyOf(r4, r15)
            r4 = r3
        L67:
            int r5 = r15.size()
            if (r3 >= r5) goto Ld1
            java.lang.Object r5 = r15.get(r3)
            fit r5 = (defpackage.fit) r5
            long r6 = r5.b
            long r6 = d(r6)
            long r8 = r5.c
            long r8 = r8 + r6
            if (r4 == 0) goto Lae
            long[] r10 = r14.d
            int r11 = r4 + (-1)
            r12 = r10[r11]
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 >= 0) goto L89
            goto Lae
        L89:
            if (r10 != 0) goto L9d
            java.lang.Object r10 = r0.get(r11)
            com.google.common.collect.ImmutableList r10 = (com.google.common.collect.ImmutableList) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L9d
            com.google.common.collect.ImmutableList r6 = r5.a
            r0.set(r11, r6)
            goto Lba
        L9d:
            java.lang.String r10 = "CuesWithTimingSubtitle"
            java.lang.String r12 = "Truncating unsupported overlapping cues."
            defpackage.edb.e(r10, r12)
            long[] r10 = r14.d
            r10[r11] = r6
            com.google.common.collect.ImmutableList r6 = r5.a
            r0.set(r11, r6)
            goto Lba
        Lae:
            long[] r10 = r14.d
            int r11 = r4 + 1
            r10[r4] = r6
            com.google.common.collect.ImmutableList r4 = r5.a
            r0.add(r4)
            r4 = r11
        Lba:
            long r5 = r5.c
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto Lce
            long[] r5 = r14.d
            int r6 = r4 + 1
            r5[r4] = r8
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of()
            r0.add(r4)
            r4 = r6
        Lce:
            int r3 = r3 + 1
            goto L67
        Ld1:
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.copyOf(r0)
            r14.c = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiu.<init>(java.util.List):void");
    }

    public static long d(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.fix
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.fix
    public final int b(long j) {
        ImmutableList immutableList = this.c;
        int iAx = edt.ax(this.d, j, false);
        if (iAx < immutableList.size()) {
            return iAx;
        }
        return -1;
    }

    @Override // defpackage.fix
    public final long c(int i) {
        a.H(i < this.c.size());
        return this.d[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fix
    public final /* bridge */ /* synthetic */ List e(long j) {
        int iAz = edt.az(this.d, j, false);
        return iAz == -1 ? ImmutableList.of() : (ImmutableList) this.c.get(iAz);
    }
}
