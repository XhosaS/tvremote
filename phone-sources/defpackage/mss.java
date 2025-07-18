package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mss {
    public String a;
    public nqd b;
    private int c;
    private byte d;

    public final void a(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public final void b() {
        if (this.d != 1) {
            throw new IllegalStateException("Missing required properties: statusCode");
        }
    }
}
