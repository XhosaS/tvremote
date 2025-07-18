package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ces {
    public static String d(String str, String str2, boolean z) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strConcat = str.concat(String.valueOf(str2));
        return (z || Build.VERSION.SDK_INT < 26) ? e(strConcat) : strConcat;
    }

    public static String e(String str) {
        return str.substring(0, Math.min(str.length(), 23));
    }

    public static int f(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static /* synthetic */ boolean g(int i, ccc cccVar, StringBuilder sb) {
        if (i - 1 != 0 || cccVar == ccc.a) {
            return false;
        }
        sb.append(cccVar.b());
        sb.append('.');
        sb.append(cccVar.d());
        sb.append(':');
        sb.append(cccVar.a());
        return true;
    }

    public static void h(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static /* synthetic */ int i(byte b) {
        return b & 255;
    }

    public static void j(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean l(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public cdh a() {
        return cdg.a;
    }

    public cez b() {
        return cez.b;
    }

    public void c(String str, Level level, boolean z) {
    }
}
