package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzs implements CharSequence {
    public final char[] a;
    public final int b;
    public final int c;

    public rzs(char[] cArr, int i, int i2) {
        this.a = cArr;
        this.b = i;
        this.c = i2;
    }

    public final String a(int i) {
        return new String(this.a, this.b + i, length());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i + this.b];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c - this.b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ CharSequence subSequence(int i, int i2) {
        return a(i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return a(0);
    }
}
