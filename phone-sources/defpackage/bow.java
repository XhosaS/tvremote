package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bow implements bpc {
    private final /* synthetic */ int a;

    public /* synthetic */ bow(int i) {
        this.a = i;
    }

    @Override // defpackage.bpc
    public final double a(double d) {
        int i = this.a;
        if (i == 0) {
            float[] fArr = box.a;
            return Math.copySign(brx.v(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? i != 4 ? i != 5 ? d : box.c(box.d, d) : box.d(box.d, d) : box.a(box.c, d) : box.b(box.c, d);
        }
        float[] fArr2 = box.a;
        return Math.copySign(brx.u(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
    }
}
