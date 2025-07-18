package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ta {
    public final float a;
    private final float b;
    private final float c;
    private final int d;
    private final long e;

    public ta(bgz bgzVar) {
        float f = bgzVar.a;
        float f2 = bgzVar.b;
        float f3 = bgzVar.c;
        int i = bgzVar.d;
        long j = bgzVar.e;
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
