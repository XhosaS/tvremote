package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class keq {
    public kfp a;
    private Looper b;

    public final ker a() {
        if (this.a == null) {
            this.a = new kfp();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new ker(this.a, this.b);
    }
}
