package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafw extends aabs {
    private static final long serialVersionUID = 6941492635554961361L;
    final int a;
    final aafz g;
    final aafz h;

    public aafw(String str, int i, aafz aafzVar, aafz aafzVar2) {
        super(str);
        this.a = i;
        this.g = aafzVar;
        this.h = aafzVar2;
    }

    private final aafz c(long j) {
        long jA;
        int i = this.a;
        aafz aafzVar = this.g;
        aafz aafzVar2 = this.h;
        try {
            jA = aafzVar.a(j, i, aafzVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            jA = j;
        }
        try {
            j = aafzVar2.a(j, i, aafzVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? aafzVar : aafzVar2;
    }

    @Override // defpackage.aabs
    public final int a(long j) {
        return this.a + c(j).c;
    }

    @Override // defpackage.aabs
    public final int b(long j) {
        return this.a;
    }

    @Override // defpackage.aabs
    public final long d(long j) {
        long jA;
        int i = this.a;
        aafz aafzVar = this.g;
        aafz aafzVar2 = this.h;
        try {
            jA = aafzVar.a(j, i, aafzVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j > 0 && jA < 0) {
            jA = j;
        }
        try {
            long jA2 = aafzVar2.a(j, i, aafzVar.c);
            if (j <= 0 || jA2 >= 0) {
                j = jA2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? j : jA;
    }

    @Override // defpackage.aabs
    public final long e(long j) {
        long jB;
        int i = this.a;
        aafz aafzVar = this.g;
        aafz aafzVar2 = this.h;
        long j2 = j + 1;
        try {
            jB = aafzVar.b(j2, i, aafzVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j2 < 0 && jB > 0) {
            jB = j2;
        }
        try {
            long jB2 = aafzVar2.b(j2, i, aafzVar.c);
            if (j2 >= 0 || jB2 <= 0) {
                j2 = jB2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (jB <= j2) {
            jB = j2;
        }
        return jB - 1;
    }

    @Override // defpackage.aabs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafw) {
            aafw aafwVar = (aafw) obj;
            if (this.e.equals(aafwVar.e) && this.a == aafwVar.a && this.g.equals(aafwVar.g) && this.h.equals(aafwVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aabs
    public final String g(long j) {
        return c(j).b;
    }

    @Override // defpackage.aabs
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aabs
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.g, this.h});
    }
}
