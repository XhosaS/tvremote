package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knw extends kob {
    public String a;
    public byte b;
    public int c;
    public int d;

    @Override // defpackage.kob
    public final void a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            int i = knx.a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
