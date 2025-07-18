package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayi {
    public int b = -1;
    public final int c = -1;
    public int d = 0;
    float e = 50.0f;
    public boolean f = false;
    public boolean g;

    public final void a(float f) {
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        this.e = f;
    }
}
