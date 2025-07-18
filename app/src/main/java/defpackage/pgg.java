package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pgg extends pkp {
    public boolean a;
    public boolean b;
    public boolean c;
    public byte d;

    @Override // defpackage.pkp
    public final void a(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    @Override // defpackage.pkp
    public final void b(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.pkp
    public final void c(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
