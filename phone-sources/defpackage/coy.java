package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coy implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    cou[] j = new cou[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public coy(int i) {
        this.n = i;
    }

    public final void a(cou couVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                cou[] couVarArr = this.j;
                int length = couVarArr.length;
                if (i2 >= length) {
                    this.j = (cou[]) Arrays.copyOf(couVarArr, length + length);
                }
                cou[] couVarArr2 = this.j;
                int i3 = this.k;
                couVarArr2[i3] = couVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == couVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(cou couVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == couVar) {
                while (i2 < i - 1) {
                    cou[] couVarArr = this.j;
                    int i3 = i2 + 1;
                    couVarArr[i2] = couVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((coy) obj).c;
    }

    public final void d(cov covVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(covVar, this, false);
        }
        this.k = 0;
    }

    public final void e(cov covVar, cou couVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(covVar, couVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
