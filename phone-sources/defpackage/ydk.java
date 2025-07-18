package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydk {
    public int a;

    public ydk() {
    }

    final boolean a() {
        return this.a > 0;
    }

    public final void b(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }

    public final void c(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public ydk(byte[] bArr, byte[] bArr2) {
        this.a = 0;
    }

    public ydk(char[] cArr) {
        this.a = -1;
    }

    public ydk(char[] cArr, byte[] bArr) {
        this.a = 1;
    }

    public ydk(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long[] jArr = kj.a;
        new ki((byte[]) null);
    }
}
