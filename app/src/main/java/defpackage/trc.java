package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class trc extends tra {
    public int a;
    private int b;
    private byte c;

    @Override // defpackage.tra
    public final trb a() {
        int i;
        if (this.c == 1 && (i = this.a) != 0) {
            return new trd(i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" errorType");
        }
        if (this.c == 0) {
            sb.append(" errorCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.tra
    public final void b(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
