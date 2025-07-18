package defpackage;

import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class se {
    public final Magnifier a;

    public se(Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        Magnifier magnifier = this.a;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
    }

    public final void b() {
        this.a.dismiss();
    }

    public void c(long j) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
