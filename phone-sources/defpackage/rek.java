package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rek {
    private int a;
    private int b;
    private int c;
    private byte d;

    public final rel a() {
        if (this.d == 7) {
            return new rel(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" cardCellId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" cardMainActionId");
        }
        if ((this.d & 4) == 0) {
            sb.append(" cardSecondaryActionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.d = (byte) (this.d | 4);
    }

    public final lvi e() {
        if (this.d == 7) {
            return new lvi(this.c, this.b, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" totalDurationMillis");
        }
        if ((this.d & 2) == 0) {
            sb.append(" startTimeMillis");
        }
        if ((this.d & 4) == 0) {
            sb.append(" endTimeMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(int i) {
        this.a = i;
        this.d = (byte) (this.d | 4);
    }

    public final void g(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void h(int i) {
        this.c = i;
        this.d = (byte) (this.d | 1);
    }
}
