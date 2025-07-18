package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afks implements afzj {
    public final afzj a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public afks(afzj afzjVar, Runnable runnable) {
        this.a = afzjVar;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
