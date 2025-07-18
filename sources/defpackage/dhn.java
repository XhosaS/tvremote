package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dhn(int i, int i2, int i3, int i4) {
        this.c = i;
        this.a = i2;
        this.b = i3;
        this.d = i4;
    }

    public dhn(dhn dhnVar) {
        this.c = dhnVar.c;
        this.a = dhnVar.a;
        this.b = dhnVar.b;
        this.d = dhnVar.d;
    }

    public dhn(int i) {
        new des(128);
        new des(256);
        if (i == 2) {
            this.b = 4;
            this.c = 4;
            this.d = 131072;
            this.a = 96;
        } else if (i == 3) {
            this.b = 6;
            this.c = 5;
            this.d = 524288;
            this.a = 128;
        } else if (i == 5) {
            this.b = 8;
            this.c = 7;
            this.d = 524288;
            this.a = 96;
        } else {
            throw new IllegalArgumentException(b.h(i, "The mode ", "is not supported by Crystals Dilithium!"));
        }
        new dnx((int[]) null);
        int i2 = this.d;
        if (i2 != 131072 && i2 != 524288) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
    }
}
