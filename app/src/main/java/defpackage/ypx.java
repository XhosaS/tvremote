package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypx {
    public static char a(char c) {
        return e(c) ? (char) (c ^ ' ') : c;
    }

    public static String b(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return c((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = a(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        int iF;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iF = f(cCharAt)) >= 26 || iF != f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int f(char c) {
        return (char) ((c | ' ') - 97);
    }
}
