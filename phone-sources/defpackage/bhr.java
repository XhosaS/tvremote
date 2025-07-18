package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhr {
    public int a;

    public bhr() {
        this((char[]) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }

    public bhr(byte[] bArr) {
        this.a = 0;
    }

    public /* synthetic */ bhr(char[] cArr) {
        this((byte[]) null);
    }
}
