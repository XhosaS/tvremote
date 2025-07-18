package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ued extends txu {
    public static final char[] a = {'+'};
    public static final char[] b = "0123456789ABCDEF".toCharArray();
    public final boolean c;
    public final boolean[] d;

    public ued(String str, boolean z) {
        super(null, null);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.d = zArr;
    }
}
