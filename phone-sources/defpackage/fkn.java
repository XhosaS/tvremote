package defpackage;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkn implements fji {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final fkl h = new fkl(30.0f, 1, 1);

    public fkn() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.i = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static long e(String str, fkl fklVar) throws fiz, NumberFormatException {
        double d2;
        double d3;
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d6 = j + j2 + d4;
            return (long) ((d6 + d5 + (matcher.group(5) != null ? Long.parseLong(r0) / fklVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r0) / fklVar.b) / fklVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = d.matcher(str);
        if (!matcher2.matches()) {
            throw new fiz("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d7 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals("s");
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d2 = fklVar.c;
                            d7 /= d2;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d2 = 1000.0d;
                        d7 /= d2;
                    }
                } else if (strGroup6.equals("m")) {
                    d3 = 60.0d;
                    d7 *= d3;
                }
            } else if (strGroup6.equals("h")) {
                d3 = 3600.0d;
                d7 *= d3;
            }
        } else if (strGroup6.equals("f")) {
            d2 = fklVar.a;
            d7 /= d2;
        }
        return (long) (d7 * 1000000.0d);
    }

    private static Layout.Alignment f(String str) {
        String strJ = sij.J(str);
        switch (strJ.hashCode()) {
            case -1364013995:
                if (strJ.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strJ.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strJ.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strJ.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strJ.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static fkp g(fkp fkpVar) {
        return fkpVar == null ? new fkp() : fkpVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.fkp h(org.xmlpull.v1.XmlPullParser r16, defpackage.fkp r17) throws defpackage.fiz {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkn.h(org.xmlpull.v1.XmlPullParser, fkp):fkp");
    }

    private static String[] i(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : edt.at(strTrim, "\\s+");
    }

    @Override // defpackage.fji
    public final int a() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(14:224|344|225|(3:227|228|323)|369|264|(3:266|(1:276)(4:268|(1:270)(1:271)|272|(2:274|276)(1:275))|323)(1:279)|280|(3:282|(1:284)(2:(2:287|(1:289))|323)|285)(1:290)|291|292|342|293|(1:295)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(5:336|41|42|354|43)|(1:(6:46|356|50|51|55|(0)(0))(1:47))(1:48)|49|356|50|51|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x050f. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0485 A[Catch: IOException -> 0x06a9, XmlPullParserException -> 0x06b2, TRY_LEAVE, TryCatch #14 {IOException -> 0x06a9, XmlPullParserException -> 0x06b2, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0069, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01c3, B:72:0x01c9, B:74:0x01d1, B:76:0x01d9, B:78:0x01e1, B:80:0x01e9, B:82:0x01f1, B:84:0x01f7, B:86:0x01ff, B:88:0x0207, B:90:0x020d, B:92:0x0213, B:94:0x0219, B:96:0x0221, B:99:0x022a, B:323:0x0690, B:100:0x0250, B:102:0x0256, B:104:0x025f, B:106:0x026e, B:108:0x0279, B:110:0x028b, B:112:0x028f, B:220:0x04d1, B:113:0x0293, B:116:0x029d, B:118:0x02a3, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:219:0x04cc, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:156:0x0378, B:158:0x0380, B:160:0x0386, B:162:0x038e, B:164:0x0392, B:167:0x03a7, B:181:0x043a, B:183:0x0442, B:197:0x047d, B:199:0x0485, B:217:0x04bf, B:169:0x03c8, B:170:0x03d7, B:173:0x03df, B:176:0x03ef, B:178:0x0416, B:179:0x0425, B:144:0x031b, B:145:0x0325, B:148:0x032f, B:151:0x033a, B:153:0x035c, B:154:0x0367, B:225:0x04e5, B:227:0x0503, B:232:0x051b, B:235:0x0524, B:302:0x05f2, B:241:0x0534, B:248:0x054b, B:263:0x057e, B:252:0x055a, B:256:0x0569, B:260:0x0576, B:266:0x0589, B:270:0x0593, B:274:0x059c, B:284:0x05b0, B:291:0x05c2, B:293:0x05d5, B:295:0x05da, B:287:0x05b7, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:306:0x0612, B:309:0x0654, B:311:0x065e, B:313:0x066f, B:316:0x0681, B:320:0x0689, B:324:0x06a3), top: B:358:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cc A[Catch: IOException -> 0x06a9, XmlPullParserException -> 0x06b2, TryCatch #14 {IOException -> 0x06a9, XmlPullParserException -> 0x06b2, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0069, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01c3, B:72:0x01c9, B:74:0x01d1, B:76:0x01d9, B:78:0x01e1, B:80:0x01e9, B:82:0x01f1, B:84:0x01f7, B:86:0x01ff, B:88:0x0207, B:90:0x020d, B:92:0x0213, B:94:0x0219, B:96:0x0221, B:99:0x022a, B:323:0x0690, B:100:0x0250, B:102:0x0256, B:104:0x025f, B:106:0x026e, B:108:0x0279, B:110:0x028b, B:112:0x028f, B:220:0x04d1, B:113:0x0293, B:116:0x029d, B:118:0x02a3, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:219:0x04cc, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:156:0x0378, B:158:0x0380, B:160:0x0386, B:162:0x038e, B:164:0x0392, B:167:0x03a7, B:181:0x043a, B:183:0x0442, B:197:0x047d, B:199:0x0485, B:217:0x04bf, B:169:0x03c8, B:170:0x03d7, B:173:0x03df, B:176:0x03ef, B:178:0x0416, B:179:0x0425, B:144:0x031b, B:145:0x0325, B:148:0x032f, B:151:0x033a, B:153:0x035c, B:154:0x0367, B:225:0x04e5, B:227:0x0503, B:232:0x051b, B:235:0x0524, B:302:0x05f2, B:241:0x0534, B:248:0x054b, B:263:0x057e, B:252:0x055a, B:256:0x0569, B:260:0x0576, B:266:0x0589, B:270:0x0593, B:274:0x059c, B:284:0x05b0, B:291:0x05c2, B:293:0x05d5, B:295:0x05da, B:287:0x05b7, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:306:0x0612, B:309:0x0654, B:311:0x065e, B:313:0x066f, B:316:0x0681, B:320:0x0689, B:324:0x06a3), top: B:358:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04dd A[LOOP:1: B:102:0x0256->B:223:0x04dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053d A[PHI: r36 r38
  0x053d: PHI (r36v3 java.lang.String[]) = 
  (r36v2 java.lang.String[])
  (r36v2 java.lang.String[])
  (r36v2 java.lang.String[])
  (r36v2 java.lang.String[])
  (r36v5 java.lang.String[])
  (r36v2 java.lang.String[])
  (r36v2 java.lang.String[])
  (r36v2 java.lang.String[])
 binds: [B:228:0x050f, B:246:0x0547, B:240:0x0532, B:242:0x0539, B:243:0x053b, B:231:0x0519, B:233:0x0521, B:235:0x0524] A[DONT_GENERATE, DONT_INLINE]
  0x053d: PHI (r38v3 java.lang.String) = 
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v2 java.lang.String)
  (r38v5 java.lang.String)
 binds: [B:228:0x050f, B:246:0x0547, B:240:0x0532, B:242:0x0539, B:243:0x053b, B:231:0x0519, B:233:0x0521, B:235:0x0524] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161 A[Catch: IOException -> 0x06a9, XmlPullParserException -> 0x06b2, TryCatch #14 {IOException -> 0x06a9, XmlPullParserException -> 0x06b2, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0069, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01c3, B:72:0x01c9, B:74:0x01d1, B:76:0x01d9, B:78:0x01e1, B:80:0x01e9, B:82:0x01f1, B:84:0x01f7, B:86:0x01ff, B:88:0x0207, B:90:0x020d, B:92:0x0213, B:94:0x0219, B:96:0x0221, B:99:0x022a, B:323:0x0690, B:100:0x0250, B:102:0x0256, B:104:0x025f, B:106:0x026e, B:108:0x0279, B:110:0x028b, B:112:0x028f, B:220:0x04d1, B:113:0x0293, B:116:0x029d, B:118:0x02a3, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:219:0x04cc, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:156:0x0378, B:158:0x0380, B:160:0x0386, B:162:0x038e, B:164:0x0392, B:167:0x03a7, B:181:0x043a, B:183:0x0442, B:197:0x047d, B:199:0x0485, B:217:0x04bf, B:169:0x03c8, B:170:0x03d7, B:173:0x03df, B:176:0x03ef, B:178:0x0416, B:179:0x0425, B:144:0x031b, B:145:0x0325, B:148:0x032f, B:151:0x033a, B:153:0x035c, B:154:0x0367, B:225:0x04e5, B:227:0x0503, B:232:0x051b, B:235:0x0524, B:302:0x05f2, B:241:0x0534, B:248:0x054b, B:263:0x057e, B:252:0x055a, B:256:0x0569, B:260:0x0576, B:266:0x0589, B:270:0x0593, B:274:0x059c, B:284:0x05b0, B:291:0x05c2, B:293:0x05d5, B:295:0x05da, B:287:0x05b7, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:306:0x0612, B:309:0x0654, B:311:0x065e, B:313:0x066f, B:316:0x0681, B:320:0x0689, B:324:0x06a3), top: B:358:0x0008 }] */
    @Override // defpackage.fji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fix b(byte[] r41, int r42, int r43) throws org.xmlpull.v1.XmlPullParserException, defpackage.fiz, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkn.b(byte[], int, int):fix");
    }

    @Override // defpackage.fji
    public final void c(byte[] bArr, int i, int i2, fjh fjhVar, ecq ecqVar) {
        fki.b(b(bArr, i, i2), fjhVar, ecqVar);
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
