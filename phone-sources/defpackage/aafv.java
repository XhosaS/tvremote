package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafv extends aabs {
    private static final int a;
    private static final long serialVersionUID = 5472298452022250685L;
    private final aabs g;
    private final transient aafu[] h;

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int iIntValue = integer.intValue() - 1;
            int i2 = 0;
            while (iIntValue > 0) {
                iIntValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        a = i - 1;
    }

    public aafv(aabs aabsVar) {
        super(aabsVar.e);
        this.h = new aafu[a + 1];
        this.g = aabsVar;
    }

    private final aafu c(long j) {
        int i = (int) (j >> 32);
        int i2 = a & i;
        aafu[] aafuVarArr = this.h;
        aafu aafuVar = aafuVarArr[i2];
        if (aafuVar != null && ((int) (aafuVar.a >> 32)) == i) {
            return aafuVar;
        }
        long j2 = j & (-4294967296L);
        aabs aabsVar = this.g;
        aafu aafuVar2 = new aafu(aabsVar, j2);
        long j3 = j2;
        aafu aafuVar3 = aafuVar2;
        while (true) {
            long jD = aabsVar.d(j3);
            if (jD == j3 || jD > (4294967295L | j2)) {
                break;
            }
            aafu aafuVar4 = new aafu(aabsVar, jD);
            aafuVar3.c = aafuVar4;
            aafuVar3 = aafuVar4;
            j3 = jD;
        }
        aafuVarArr[i2] = aafuVar2;
        return aafuVar2;
    }

    @Override // defpackage.aabs
    public final int a(long j) {
        return c(j).a(j);
    }

    @Override // defpackage.aabs
    public final int b(long j) {
        return c(j).b(j);
    }

    @Override // defpackage.aabs
    public final long d(long j) {
        return this.g.d(j);
    }

    @Override // defpackage.aabs
    public final long e(long j) {
        return this.g.e(j);
    }

    @Override // defpackage.aabs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafv) {
            return this.g.equals(((aafv) obj).g);
        }
        return false;
    }

    @Override // defpackage.aabs
    public final String g(long j) {
        return c(j).c(j);
    }

    @Override // defpackage.aabs
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aabs
    public final int hashCode() {
        return this.g.hashCode();
    }
}
