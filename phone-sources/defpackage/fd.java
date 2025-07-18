package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fd {
    public final float a;
    public final float b;
    public final int c;
    private final float d;
    private final long e;

    public fd(float f, float f2, float f3, int i, long j) {
        this.d = f;
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + ", frameTimeMillis=" + this.e + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fd(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public fd(fyv fyvVar) {
        this(fyvVar.a, fyvVar.b, fyvVar.c, fyvVar.d, fyvVar.e);
    }
}
