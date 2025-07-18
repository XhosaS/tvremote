package defpackage;

import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class txu {
    public txu() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010e A[EDGE_INSN: B:102:0x010e->B:80:0x010e BREAK  A[LOOP:2: B:48:0x009a->B:79:0x0108], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tzl d(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txu.d(java.lang.String):tzl");
    }

    public static tzm e(tzl tzlVar) {
        vtw vtwVarM = tzm.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        String str = tzlVar.a;
        tzm tzmVar = (tzm) vtwVarM.b;
        tzmVar.b |= 1;
        tzmVar.c = str;
        return (tzm) vtwVarM.r();
    }

    public static /* synthetic */ int f(byte b) {
        return b & 255;
    }

    public static int g(Level level) {
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

    public static String h(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(String.valueOf(str));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static /* synthetic */ boolean i(int i, tuq tuqVar, StringBuilder sb) {
        if (i - 1 != 0 || tuqVar == tuq.a) {
            return false;
        }
        sb.append(tuqVar.b());
        sb.append('.');
        sb.append(tuqVar.d());
        sb.append(':');
        sb.append(tuqVar.a());
        return true;
    }

    public static void j(char c, String str, Map map) {
        map.put(Character.valueOf(c), str);
    }

    public static char[] k(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public tyb b() {
        return tyb.b;
    }

    public twa ez() {
        return tvz.a;
    }

    protected txu(byte[] bArr) {
    }

    protected txu(byte[] bArr, byte[] bArr2) {
        this(null);
    }

    public void c(String str, Level level, boolean z) {
    }
}
