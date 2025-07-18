package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pky extends plc {
    public yzq a;
    private boolean b;
    private byte c;

    @Override // defpackage.plc
    public final ple a() {
        if (this.a == null) {
            this.a = zcp.b;
        }
        if (this.c == 1) {
            return new pkz(this.b, this.a);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    @Override // defpackage.plc
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
