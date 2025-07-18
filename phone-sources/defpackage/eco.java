package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eco {
    public static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", "B", "C"};
    private static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x038a, code lost:
    
        if (r8.equals("hvc1") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0393, code lost:
    
        if (r8.equals("hev1") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03a4, code lost:
    
        if (r8.equals("avc2") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03ad, code lost:
    
        if (r8.equals("avc1") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03af, code lost:
    
        r0 = r22.U;
        r1 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03b4, code lost:
    
        if (r1 >= 2) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03b6, code lost:
    
        defpackage.edb.e("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03c8, code lost:
    
        if (r3[1].length() != 6) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ca, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1].substring(0, 2), 16);
        r0 = java.lang.Integer.parseInt(r3[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03df, code lost:
    
        if (r1 < 3) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03e1, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1]);
        r0 = java.lang.Integer.parseInt(r3[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ef, code lost:
    
        if (r1 == 66) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03f3, code lost:
    
        if (r1 == 77) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03f7, code lost:
    
        if (r1 == 88) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03fb, code lost:
    
        if (r1 == 100) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03ff, code lost:
    
        if (r1 == 110) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0403, code lost:
    
        if (r1 == 122) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0407, code lost:
    
        if (r1 == 244) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0409, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x040b, code lost:
    
        r5 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x040e, code lost:
    
        r5 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0411, code lost:
    
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0413, code lost:
    
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0415, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0417, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0418, code lost:
    
        if (r5 != (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x041a, code lost:
    
        defpackage.edb.e("CodecSpecificDataUtil", defpackage.a.cf(r1, "Unknown AVC profile: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0424, code lost:
    
        switch(r0) {
            case 10: goto L281;
            case 11: goto L280;
            case 12: goto L279;
            case 13: goto L278;
            default: goto L261;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0427, code lost:
    
        switch(r0) {
            case 20: goto L277;
            case 21: goto L276;
            case 22: goto L275;
            default: goto L262;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x042a, code lost:
    
        switch(r0) {
            case 30: goto L274;
            case 31: goto L273;
            case 32: goto L272;
            default: goto L263;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x042d, code lost:
    
        switch(r0) {
            case 40: goto L271;
            case 41: goto L270;
            case 42: goto L269;
            default: goto L264;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0430, code lost:
    
        switch(r0) {
            case 50: goto L268;
            case 51: goto L267;
            case 52: goto L266;
            default: goto L265;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0433, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0435, code lost:
    
        r1 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0438, code lost:
    
        r1 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x043c, code lost:
    
        r1 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x043f, code lost:
    
        r1 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0442, code lost:
    
        r1 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0444, code lost:
    
        r1 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0447, code lost:
    
        r1 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x044a, code lost:
    
        r1 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x044d, code lost:
    
        r1 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0450, code lost:
    
        r1 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0453, code lost:
    
        r1 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0456, code lost:
    
        r1 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0459, code lost:
    
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x045b, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x045d, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x045f, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0460, code lost:
    
        if (r1 != (-1)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0462, code lost:
    
        defpackage.edb.e("CodecSpecificDataUtil", defpackage.a.cf(r0, "Unknown AVC level: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x047a, code lost:
    
        defpackage.edb.e("CodecSpecificDataUtil", defpackage.a.cr(r0, "Ignoring malformed AVC codec string: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0482, code lost:
    
        defpackage.edb.e("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(defpackage.dze r22) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eco.a(dze):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(java.lang.String r8, java.lang.String[] r9, defpackage.dyt r10) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eco.b(java.lang.String, java.lang.String[], dyt):android.util.Pair");
    }

    public static ImmutableList c(byte b2, byte b3, byte b4, byte b5) {
        return ImmutableList.of(new byte[]{1, 1, b2, 2, 1, b3, 3, 1, b4, 4, 1, b5});
    }

    public static String d(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String e(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(edt.R("hvc1.%s%d.%X.%c%d", b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }
}
