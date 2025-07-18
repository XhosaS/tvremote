package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ke {
    public final float a;
    private final float b;
    private final float c;
    private final int d;
    private final long e;

    public ke(aau aauVar) {
        float f = aauVar.a;
        float f2 = aauVar.b;
        float f3 = aauVar.c;
        int i = aauVar.d;
        long j = aauVar.e;
        this.b = f;
        this.c = f2;
        this.a = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + '}';
    }
}
