package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abf implements yka {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ adc d;
    private final /* synthetic */ int e;

    public /* synthetic */ abf(adc adcVar, long j, int i, int i2, int i3) {
        this.e = i3;
        this.d = adcVar;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.yka
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            int iIntValue = ((Integer) obj).intValue();
            int iIntValue2 = ((Integer) obj2).intValue();
            int i = iIntValue + this.b;
            int i2 = iIntValue2 + this.c;
            long j = this.a;
            return this.d.cz(clw.c(j, i), clw.b(j, i2), yhc.a, (yjv) obj3);
        }
        int iIntValue3 = ((Integer) obj).intValue();
        int iIntValue4 = ((Integer) obj2).intValue();
        int i3 = iIntValue3 + this.b;
        int i4 = iIntValue4 + this.c;
        long j2 = this.a;
        return this.d.cz(clw.c(j2, i3), clw.b(j2, i4), yhc.a, (yjv) obj3);
    }
}
