package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hx implements ig {
    final ig a;
    int b = 0;
    int c = -1;
    int d = -1;

    public hx(ig igVar) {
        this.a = igVar;
    }

    @Override // defpackage.ig
    public final void a(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.ig
    public final void b(int i, int i2) {
        e();
        this.a.b(i, i2);
    }

    @Override // defpackage.ig
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.ig
    public final void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 3;
        }
    }

    public final void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.a(this.c, this.d);
        } else if (i != 2) {
            this.a.d(this.c, this.d);
        } else {
            this.a.c(this.c, this.d);
        }
        this.b = 0;
    }
}
