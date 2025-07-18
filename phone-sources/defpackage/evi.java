package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evi implements ewz {
    private final ImmutableList a;
    private long b;

    public evi(List list, List list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        a.H(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builder.add((ImmutableList.Builder) new evh((ewz) list.get(i), (List) list2.get(i)));
        }
        this.a = builder.build();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewz
    public final long c() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            evh evhVar = (evh) immutableList.get(i);
            long jC = evhVar.c();
            ImmutableList immutableList2 = evhVar.a;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
            if (jC != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jC);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewz
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            long jD = ((evh) immutableList.get(i)).d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewz
    public final void m(long j) {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return;
            }
            ((evh) immutableList.get(i)).m(j);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewz
    public final boolean n(eji ejiVar) {
        boolean zN;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zN = false;
            while (true) {
                ImmutableList immutableList = this.a;
                if (i >= immutableList.size()) {
                    break;
                }
                long jD2 = ((evh) immutableList.get(i)).d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= ejiVar.a;
                if (jD2 == jD || z2) {
                    zN |= ((evh) immutableList.get(i)).n(ejiVar);
                }
                i++;
            }
            z |= zN;
        } while (zN);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ewz
    public final boolean o() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return false;
            }
            if (((evh) immutableList.get(i)).o()) {
                return true;
            }
            i++;
        }
    }
}
