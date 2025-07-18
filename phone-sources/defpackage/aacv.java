package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aacv {
    public final int a;
    public final long b;

    public aacv(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static aacv b(fdq fdqVar, edi ediVar) {
        fdqVar.i(ediVar.a, 0, 8);
        ediVar.K(0);
        return new aacv(ediVar.e(), ediVar.p());
    }

    public final int a() {
        return (int) this.b;
    }

    public final boolean c() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public aacv(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public aacv(int i, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        a.H(true);
        this.a = i;
        this.b = j;
    }
}
