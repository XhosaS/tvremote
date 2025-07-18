package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljd {
    public final int a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    public final Bitmap g;
    final long h;
    final long i;
    final boolean j;
    public final int k;

    public ljd(int i, String str, String str2, String str3, String str4, String str5, Bitmap bitmap, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bitmap;
        this.h = j;
        this.i = j2;
        if (j2 == 0) {
            this.k = 0;
            this.j = false;
            return;
        }
        long j3 = j * 100;
        if (i2 >= i) {
            this.k = (int) (j3 / j2);
            this.j = true;
        } else {
            this.k = (int) ((j3 * i2) / (j2 * i));
            this.j = false;
        }
    }
}
