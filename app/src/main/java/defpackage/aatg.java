package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatg extends aatj {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public String g;
    public int h;
    public byte i;

    @Override // defpackage.aatj
    public final void a(int i) {
        this.f = i;
        this.i = (byte) (this.i | 32);
    }

    @Override // defpackage.aatj
    public final void b(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.aatj
    public final void c(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.aatj
    public final void d(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 16);
    }

    @Override // defpackage.aatj
    public final void e(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.aatj
    public final void f(int i) {
        this.h = i;
        this.i = (byte) (this.i | Byte.MIN_VALUE);
    }
}
