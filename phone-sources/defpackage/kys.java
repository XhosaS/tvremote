package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kys {
    public static final kys a = new kys(new byte[0]);
    public final byte[] b;

    private kys(byte[] bArr) {
        this.b = bArr;
    }

    public static kys a(String str) {
        return TextUtils.isEmpty(str) ? a : new kys(Base64.decode(str, 11));
    }

    public static boolean b(String str) {
        if (sij.F(str)) {
            return false;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            vuc vucVarP = vuc.p(wjc.a, bArrDecode, 0, bArrDecode.length, vtp.a());
            vuc.B(vucVarP);
            return true;
        } catch (Exception e) {
            krd.c("Encountered error when attempting to parse servercookie proto: ".concat(e.toString()));
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kys) {
            return Arrays.equals(this.b, ((kys) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}
