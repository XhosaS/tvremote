package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ak {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    ah[] f = new ah[8];
    int g = 0;

    public ak(int i) {
        this.h = i;
    }

    final void a(ah ahVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f[i2] == ahVar) {
                while (true) {
                    int i3 = this.g;
                    if (i >= (i3 - i2) - 1) {
                        this.g = i3 - 1;
                        return;
                    }
                    ah[] ahVarArr = this.f;
                    int i4 = i2 + i;
                    ahVarArr[i4] = ahVarArr[i4 + 1];
                    i++;
                }
            }
        }
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}
