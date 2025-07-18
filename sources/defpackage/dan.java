package defpackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dan extends dab {
    final byte[] a;

    public dan(String str) {
        this.a = doj.d(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", dcc.a).parse(f());
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    private final boolean g(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.a.length);
    }

    public final String b() {
        String strF = f();
        return (strF.charAt(0) < '5' ? "20" : "19").concat(strF);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 23, this.a);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof dan) {
            return Arrays.equals(this.a, ((dan) dabVar).a);
        }
        return false;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    public final String f() {
        String strA = doj.a(this.a);
        if (strA.indexOf(45) < 0 && strA.indexOf(43) < 0) {
            return strA.length() == 11 ? String.valueOf(strA.substring(0, 10)).concat("00GMT+00:00") : String.valueOf(strA.substring(0, 12)).concat("GMT+00:00");
        }
        int iIndexOf = strA.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strA.indexOf(43);
        }
        if (iIndexOf == strA.length() - 3) {
            strA = strA.concat("00");
        }
        if (iIndexOf == 10) {
            return strA.substring(0, 10) + "00GMT" + strA.substring(10, 13) + ":" + strA.substring(13, 15);
        }
        return strA.substring(0, 12) + "GMT" + strA.substring(12, 15) + ":" + strA.substring(15, 17);
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return dos.m(this.a);
    }

    public final String toString() {
        return doj.a(this.a);
    }

    public dan(byte[] bArr) {
        if (bArr.length >= 2) {
            this.a = bArr;
            if (!g(0) || !g(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }
}
