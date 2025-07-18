package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxt extends qye {
    public int a;
    public byte b;
    public int c;

    @Override // defpackage.qye
    public final qyf a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            return new qxu(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.b & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
