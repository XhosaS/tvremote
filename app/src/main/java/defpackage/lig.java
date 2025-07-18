package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lig {
    public final lih a;
    public int b = 1;
    public long c = a();

    public lig(lih lihVar) {
        this.a = lihVar;
    }

    public final long a() {
        long jLongValue = ((Long) kzg.v.a(null)).longValue();
        long jLongValue2 = ((Long) kzg.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        kkk.k(this.a.l);
        return System.currentTimeMillis() + Math.min(jLongValue, jLongValue2);
    }
}
