package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxa {
    public final ahxb a(String str) {
        str.getClass();
        ahxb ahxbVar = new ahxb(ahxt.b(str));
        ahxbVar.e = str;
        return ahxbVar;
    }

    public final ahxb b(byte... bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return new ahxb(bArrCopyOf);
    }
}
