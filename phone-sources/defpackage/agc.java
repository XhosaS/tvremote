package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agc {
    public static final String a;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
            } else {
                char cCharAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = cCharAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        a = str;
    }

    public static final long a(chc chcVar, clx clxVar, esn esnVar, String str, int i) {
        yhb yhbVar = yhb.a;
        return (hq.p(r7.b()) & 4294967295L) | (hq.p(new cft(new cku(str, chcVar, yhbVar, yhbVar, esnVar, clxVar), i, 1, clw.k(0, 0, 15)).a.b()) << 32);
    }
}
