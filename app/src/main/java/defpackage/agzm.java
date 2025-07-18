package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agzm extends agzl {
    public static final String v(String str) {
        str.getClass();
        int length = str.length();
        if (length >= 127) {
            length = 127;
        }
        String strSubstring = str.substring(0, length);
        strSubstring.getClass();
        return strSubstring;
    }
}
