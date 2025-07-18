package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zqw {
    public final int a;
    public final int b;
    public final int c;
    private final int d;

    public zqw(int i) {
        new zoa(128);
        new zoa(256);
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
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.cd(i, "The mode ", "is not supported by Crystals Dilithium!"));
            }
            this.b = 8;
            this.c = 7;
            this.d = 524288;
            this.a = 96;
        }
        new wef(null, null);
        int i2 = this.d;
        if (i2 != 131072 && i2 != 524288) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
    }
}
