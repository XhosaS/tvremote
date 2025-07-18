package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsh extends tut {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public twc f;
    public boolean g;
    public yyk h;
    public byte i;
    public int j;

    @Override // defpackage.tut
    public final void a(int i) {
        this.a = i;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.tut
    public final void b(twc twcVar) {
        if (twcVar == null) {
            throw new NullPointerException("Null clientType");
        }
        this.f = twcVar;
    }

    @Override // defpackage.tut
    public final void c() {
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.tut
    public final void d(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.tut
    public final void e(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.tut
    public final void f(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 16);
    }
}
