package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msn implements egx {
    private final int a;
    private final int b;
    private final int c;
    private int d;

    public msn(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.egx
    public final int a() {
        return this.d;
    }

    @Override // defpackage.egx
    public final void b(ejm ejmVar, int i, int i2) {
        int i3 = this.c;
        int i4 = this.d;
        if (1 == i3) {
            i = i2;
        }
        this.d = i4 + i;
    }

    @Override // defpackage.egx
    public final boolean c() {
        return this.d < (this.c == 1 ? this.b : this.a);
    }
}
