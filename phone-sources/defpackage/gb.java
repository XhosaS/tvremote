package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gb {
    public final int a;
    public final int b;
    public final Object c;

    public gb(int i, int i2, Object obj, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public final int a(boolean z) {
        return z ? this.b : this.a;
    }

    public gb(lwq lwqVar, int i, int i2) {
        this.c = lwqVar;
        this.a = i;
        this.b = i2;
    }

    public gb(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }

    public gb(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            wv.c("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        wv.c("size should be > 0");
    }

    public gb(int i, int i2, String str, byte[] bArr) {
        this.b = Math.min(i, i2);
        this.a = Math.max(i, i2);
        this.c = str;
    }

    public gb(int i, int i2) {
        a.aD(i > 0, a.cf(i, "min: "));
        a.aD(i <= i2, a.ce(i2, i, "minLength: ", ", maxLength: "));
        this.a = i;
        this.b = i2;
        this.c = new Random();
    }
}
