package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzg {
    public final boolean a;
    public final int b;
    public final int c;

    rzg() {
        this.b = 2;
        this.c = 2;
        this.a = true;
    }

    public rzg(int i) {
        this.b = 2;
        this.c = i;
        this.a = false;
    }

    public rzg(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = false;
    }

    public rzg(int i, int i2, boolean z) {
        this.c = i;
        this.b = i2;
        this.a = z;
    }

    public rzg(int i, boolean z, int i2) {
        this.b = i;
        this.a = z;
        this.c = i2;
    }

    public rzg(boolean z, int i, int i2) {
        this.a = z;
        this.c = i2;
        this.b = i;
    }
}
