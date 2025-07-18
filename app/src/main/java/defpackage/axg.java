package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axg {
    public long a;
    public CharSequence b;
    public CharSequence c;
    public int e = 0;
    public int d = 112;

    public final void b(int i, int i2) {
        this.d = (i & i2) | (this.d & (~i2));
    }

    public final void c() {
        this.e = 1;
        if ((this.d & 1) == 1) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
    }
}
