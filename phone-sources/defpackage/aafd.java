package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafd {
    public static final /* synthetic */ int a = 0;
    private static final double b = Math.log(10.0d);

    static int a(CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (((iCharAt << 3) + (iCharAt + iCharAt)) + charSequence.charAt(i + 1)) - 48;
    }

    public static void b(Appendable appendable, int i, int i2) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i >= 100) {
            int iLog = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / b)) + 1;
            while (i2 > iLog) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            appendable.append('0');
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        appendable.append((char) (i3 + 48));
        appendable.append((char) (((i - (i3 << 3)) - (i3 + i3)) + 48));
    }

    public static void c(StringBuffer stringBuffer, int i, int i2) {
        try {
            b(stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void d(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
        }
    }
}
