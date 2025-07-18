package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alj {
    public static final bii a = new ali(0);
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;

    public /* synthetic */ alj(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        int i3 = 1;
        boolean z2 = (i2 & 64) == 0;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z | (!z2);
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() != 0 || str2.length() <= 0) {
            i3 = 3;
            if (str.length() > 0 && str2.length() == 0) {
                i3 = 2;
            }
        }
        this.i = i3;
    }

    public final int a() {
        if (this.i != 2) {
            return 4;
        }
        long j = this.f;
        if (!chb.g(j)) {
            return 4;
        }
        long j2 = this.e;
        if (chb.g(j2)) {
            return chb.e(j2) > chb.e(j) ? 1 : 2;
        }
        if (chb.e(j2) == chb.e(j)) {
            if (chb.e(j2) == this.b) {
                return 3;
            }
        }
        return 4;
    }
}
