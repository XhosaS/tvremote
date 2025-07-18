package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goy {
    public static final String a = gpn.a("Data");

    public static final Byte[] a(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }
}
