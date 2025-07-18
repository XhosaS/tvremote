package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvp extends qvr {
    public float a;
    public agow b;
    public byte c;
    public int d;
    private int e;
    private final yqt f = ypv.a;

    @Override // defpackage.qvr
    public final qvs a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            return new qvq(i, this.a, this.e, this.b, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.qvr
    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 2);
    }
}
