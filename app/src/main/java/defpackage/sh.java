package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class sh {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    final int a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    final void b(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    final boolean c() {
        int i = this.a;
        if ((i & 7) != 0 && (a(this.d, this.b) & i) == 0) {
            return false;
        }
        if ((i & 112) != 0 && ((a(this.d, this.c) << 4) & i) == 0) {
            return false;
        }
        if ((i & 1792) == 0 || ((a(this.e, this.b) << 8) & i) != 0) {
            return (i & 28672) == 0 || (i & (a(this.e, this.c) << 12)) != 0;
        }
        return false;
    }
}
