package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aany extends aaoe {
    public String a;
    public int b;
    private long c;
    private byte d;

    @Override // defpackage.aaoe
    public final aaof a() {
        if (this.d == 1) {
            return new aanz(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    @Override // defpackage.aaoe
    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }
}
