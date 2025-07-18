package j$.time.temporal;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        switch (this.a) {
            case 0:
                int i = temporal.i(a.DAY_OF_WEEK);
                int i2 = this.b;
                if (i == i2) {
                    return temporal;
                }
                return temporal.b(i - i2 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i3 = temporal.i(a.DAY_OF_WEEK);
                int i4 = this.b;
                if (i3 == i4) {
                    return temporal;
                }
                return temporal.x(i4 - i3 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
