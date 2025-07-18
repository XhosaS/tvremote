package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyb implements eya {
    public static final /* synthetic */ int a = 0;
    private static final Ordering b = Ordering.natural().onResultOf(new dzc(19)).compound(Ordering.natural().reverse().onResultOf(new dzc(20)));
    private final List c = new ArrayList();

    @Override // defpackage.eya
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                break;
            }
            long j2 = ((fit) list.get(i)).b;
            long j3 = ((fit) list.get(i)).d;
            if (j < j2) {
                jMin = jMin != -9223372036854775807L ? Math.min(jMin, j2) : j2;
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.eya
    public final long b(long j) {
        List list = this.c;
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((fit) list.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((fit) list.get(0)).b;
        for (int i = 0; i < list.size(); i++) {
            long j2 = ((fit) list.get(i)).b;
            long j3 = ((fit) list.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eya
    public final ImmutableList c(long j) {
        List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((fit) list.get(0)).b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    fit fitVar = (fit) list.get(i);
                    long j2 = fitVar.b;
                    if (j >= j2 && j < fitVar.d) {
                        arrayList.add(fitVar);
                    }
                    if (j < j2) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(b, arrayList);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
                    builder.addAll((Iterable) ((fit) immutableListSortedCopyOf.get(i2)).a);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }

    @Override // defpackage.eya
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.eya
    public final void e(long j) {
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return;
            }
            long j2 = ((fit) list.get(i)).b;
            if (j > j2 && j > ((fit) list.get(i)).d) {
                list.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.eya
    public final boolean f(fit fitVar, long j) {
        long j2 = fitVar.b;
        a.H(j2 != -9223372036854775807L);
        a.H(fitVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < fitVar.d;
        List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                list.add(0, fitVar);
                return z;
            }
        } while (j2 < ((fit) list.get(size)).b);
        list.add(size + 1, fitVar);
        return z;
    }
}
