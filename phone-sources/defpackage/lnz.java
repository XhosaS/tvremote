package defpackage;

import android.util.Base64;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnz {
    private static final Random a = new Random();

    public static String a() {
        return b("");
    }

    public static String b(String str) {
        byte[] bArr = new byte[12];
        a.nextBytes(bArr);
        return str.concat(String.valueOf(Base64.encodeToString(bArr, 10)));
    }
}
