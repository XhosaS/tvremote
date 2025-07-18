package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agzh extends agzg {
    public static final boolean f(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final String g(String str, String str2, String str3) {
        int i = 0;
        int iP = agyv.p(str, str2, 0);
        if (iP < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length <= 0 ? 1 : length;
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iP);
            sb.append(str3);
            i = iP + length;
            if (iP >= str.length()) {
                break;
            }
            iP = agyv.p(str, str2, iP + i2);
        } while (iP > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
