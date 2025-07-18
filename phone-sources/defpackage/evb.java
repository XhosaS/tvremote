package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evb extends evo {
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public evb(defpackage.eay r9, long r10, long r12, boolean r14) throws defpackage.evc {
        /*
            r8 = this;
            r8.<init>(r9)
            r0 = -9223372036854775808
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L17
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 < 0) goto Le
            goto L17
        Le:
            evc r9 = new evc
            r13 = r12
            r11 = r10
            r10 = 2
            r9.<init>(r10, r11, r13)
            throw r9
        L17:
            r1 = r12
            r11 = r10
            int r10 = r9.b()
            r13 = 1
            r3 = 0
            if (r10 != r13) goto L87
            eax r10 = new eax
            r10.<init>()
            eax r9 = r9.p(r3, r10)
            r4 = 0
            long r10 = java.lang.Math.max(r4, r11)
            if (r14 != 0) goto L45
            boolean r12 = r9.y
            if (r12 != 0) goto L45
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L45
            boolean r12 = r9.v
            if (r12 == 0) goto L3f
            goto L45
        L3f:
            evc r9 = new evc
            r9.<init>(r13)
            throw r9
        L45:
            if (r0 != 0) goto L4a
            long r0 = r9.A
            goto L4e
        L4a:
            long r0 = java.lang.Math.max(r4, r1)
        L4e:
            long r4 = r9.A
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L64
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L5e
            goto L5f
        L5e:
            r0 = r4
        L5f:
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 <= 0) goto L64
            r10 = r0
        L64:
            r8.f = r10
            r8.g = r0
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 != 0) goto L6e
            r10 = r6
            goto L70
        L6e:
            long r10 = r0 - r10
        L70:
            r8.h = r10
            boolean r10 = r9.w
            if (r10 == 0) goto L83
            if (r12 == 0) goto L84
            long r9 = r9.A
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L83
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 != 0) goto L83
            goto L84
        L83:
            r13 = r3
        L84:
            r8.i = r13
            return
        L87:
            evc r9 = new evc
            r9.<init>(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evb.<init>(eay, long, long, boolean):void");
    }

    @Override // defpackage.evo, defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        this.e.d(0, eavVar, z);
        long j = eavVar.j - this.f;
        long j2 = this.h;
        eavVar.m(eavVar.f, eavVar.g, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j);
        return eavVar;
    }

    @Override // defpackage.evo, defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        this.e.e(0, eaxVar, 0L);
        long j2 = eaxVar.D;
        long j3 = this.f;
        eaxVar.D = j2 + j3;
        eaxVar.A = this.h;
        eaxVar.w = this.i;
        long j4 = eaxVar.z;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            eaxVar.z = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            eaxVar.z = jMax;
            eaxVar.z = jMax - j3;
        }
        String str = edt.a;
        long j6 = eaxVar.s;
        long jF = edt.F(j3);
        if (j6 != -9223372036854775807L) {
            eaxVar.s = j6 + jF;
        }
        long j7 = eaxVar.t;
        if (j7 != -9223372036854775807L) {
            eaxVar.t = j7 + jF;
        }
        return eaxVar;
    }
}
