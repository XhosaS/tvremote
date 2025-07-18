package defpackage;

import android.text.TextUtils;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ent extends DefaultHandler implements ezz {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern b = Pattern.compile("CC([1-4])=.*");
    private static final Pattern c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] d = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    private final XmlPullParserFactory f;

    public ent() {
        try {
            this.f = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    protected static final cvi A(XmlPullParser xmlPullParser, String str, cvi cviVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? cvi.v(attributeValue) : cviVar;
    }

    private static int B(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        a.ab(i == i2);
        return i;
    }

    private static long C(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    private static final long D(List list, long j, long j2, int i, long j3) {
        int iS = i >= 0 ? i + 1 : (int) edt.s(j3 - j, j2);
        for (int i2 = 0; i2 < iS; i2++) {
            list.add(new eod(j, j2));
            j += j2;
        }
        return j;
    }

    protected static float b(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        float f2 = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? f2 / Integer.parseInt(r2) : f2;
    }

    protected static int c(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = edt.d.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    protected static long e(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static enu g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strH = h(xmlPullParser, "schemeIdUri", "");
        String strH2 = h(xmlPullParser, "value", null);
        String strH3 = h(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!eci.l(xmlPullParser, str));
        return new enu(strH, strH2, strH3);
    }

    protected static String h(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                j(xmlPullParser);
            }
        } while (!eci.l(xmlPullParser, str));
        return text;
    }

    public static void j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (eci.m(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (eci.m(xmlPullParser)) {
                    i++;
                } else if (eci.k(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final int k(org.xmlpull.v1.XmlPullParser r9, java.lang.String r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.k(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    protected static final long l(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected static final List m(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strI = i(xmlPullParser, "BaseURL");
        if (strI != null && eci.r(strI)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = strI;
            }
            return Lists.newArrayList(new enq(strI, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            enq enqVar = (enq) list.get(i3);
            String strQ = eci.q(enqVar.a, strI);
            String str = attributeValue3 == null ? strQ : attributeValue3;
            if (z) {
                i = enqVar.c;
                i2 = enqVar.d;
                str = enqVar.b;
            }
            arrayList.add(new enq(strQ, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final android.util.Pair n(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.n(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected static final int o(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return !"image".equals(attributeValue) ? -1 : 4;
    }

    protected static long p(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return edt.z(attributeValue);
    }

    protected static float q(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    protected static final enw r(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new enw(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return new enw(attributeValue, j, j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final int s(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.hashCode()
            switch(r1) {
                case -2060497896: goto L8a;
                case -1724546052: goto L7f;
                case -1580883024: goto L74;
                case -1574842690: goto L6b;
                case -1408024454: goto L61;
                case -1396432756: goto L58;
                case 99825: goto L4d;
                case 3343801: goto L43;
                case 3530173: goto L38;
                case 552573414: goto L2d;
                case 899152809: goto L22;
                case 1629013393: goto L17;
                case 1855372047: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L95
        Ld:
            java.lang.String r1 = "supplementary"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 4
            return r2
        L17:
            java.lang.String r1 = "emergency"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 32
            return r2
        L22:
            java.lang.String r1 = "commentary"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 8
            return r2
        L2d:
            java.lang.String r1 = "caption"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 64
            return r2
        L38:
            java.lang.String r1 = "sign"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L43:
            java.lang.String r1 = "main"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 1
            return r2
        L4d:
            java.lang.String r1 = "dub"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 16
            return r2
        L58:
            java.lang.String r1 = "forced-subtitle"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            goto L92
        L61:
            java.lang.String r1 = "alternate"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 2
            return r2
        L6b:
            java.lang.String r1 = "forced_subtitle"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            goto L92
        L74:
            java.lang.String r1 = "enhanced-audio-intelligibility"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L7f:
            java.lang.String r1 = "description"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
            r2 = 512(0x200, float:7.17E-43)
            return r2
        L8a:
            java.lang.String r1 = "subtitle"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L95
        L92:
            r2 = 128(0x80, float:1.8E-43)
            return r2
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.s(java.lang.String):int");
    }

    protected static final int t(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (sij.L("http://dashif.org/guidelines/trickmode", ((enu) list.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ea A[EDGE_INSN: B:179:0x00ea->B:66:0x00ea BREAK  A[LOOP:1: B:47:0x00a9->B:65:0x00e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final defpackage.dze u(java.lang.String r18, java.lang.String r19, int r20, int r21, float r22, int r23, int r24, int r25, java.lang.String r26, java.util.List r27, java.util.List r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.util.List r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.u(java.lang.String, java.lang.String, int, int, float, int, int, int, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List):dze");
    }

    protected static final enw v(XmlPullParser xmlPullParser) {
        return r(xmlPullParser, "sourceURL", "range");
    }

    protected static final List w(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jD = 0;
        boolean z = false;
        int iC = 0;
        long jE = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (eci.n(xmlPullParser, "S")) {
                long jE2 = e(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    int i = iC;
                    j3 = jE2;
                    jD = D(arrayList, jD, jE, i, j3);
                } else {
                    j3 = jE2;
                }
                if (j3 != -9223372036854775807L) {
                    jD = j3;
                }
                jE = e(xmlPullParser, "d", -9223372036854775807L);
                iC = c(xmlPullParser, "r", 0);
                z = true;
            } else {
                j(xmlPullParser);
            }
        } while (!eci.l(xmlPullParser, "SegmentTimeline"));
        if (!z) {
            return arrayList;
        }
        D(arrayList, jD, jE, iC, edt.B(j2, j, 1000L));
        return arrayList;
    }

    protected static final eoe x(XmlPullParser xmlPullParser, eoe eoeVar) throws XmlPullParserException, NumberFormatException, IOException {
        long jE = e(xmlPullParser, "timescale", eoeVar != null ? eoeVar.i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", eoeVar != null ? eoeVar.j : 0L);
        long j = eoeVar != null ? eoeVar.a : 0L;
        long j2 = eoeVar != null ? eoeVar.b : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j3 = j2;
        enw enwVarV = eoeVar != null ? eoeVar.h : null;
        while (true) {
            xmlPullParser.next();
            if (eci.n(xmlPullParser, "Initialization")) {
                enwVarV = v(xmlPullParser);
            } else {
                j(xmlPullParser);
            }
            enw enwVar = enwVarV;
            if (eci.l(xmlPullParser, "SegmentBase")) {
                return new eoe(enwVar, jE, jE2, j, j3);
            }
            enwVarV = enwVar;
        }
    }

    protected static final eob y(XmlPullParser xmlPullParser, eob eobVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jE = e(xmlPullParser, "timescale", eobVar != null ? eobVar.i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", eobVar != null ? eobVar.j : 0L);
        long jE3 = e(xmlPullParser, "duration", eobVar != null ? eobVar.b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", eobVar != null ? eobVar.a : 1L);
        long jC = C(j3, j4);
        List arrayList = null;
        enw enwVarV = null;
        List listW = null;
        do {
            xmlPullParser.next();
            if (eci.n(xmlPullParser, "Initialization")) {
                enwVarV = v(xmlPullParser);
            } else if (eci.n(xmlPullParser, "SegmentTimeline")) {
                listW = w(xmlPullParser, jE, j2);
            } else if (eci.n(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r(xmlPullParser, "media", "mediaRange"));
            } else {
                j(xmlPullParser);
            }
        } while (!eci.l(xmlPullParser, "SegmentList"));
        if (eobVar != null) {
            if (enwVarV == null) {
                enwVarV = eobVar.h;
            }
            if (listW == null) {
                listW = eobVar.c;
            }
            if (arrayList == null) {
                arrayList = eobVar.e;
            }
        }
        return new eob(enwVarV, jE, jE2, jE4, jE3, listW, jC, arrayList, edt.y(j5), edt.y(j));
    }

    protected static final eoc z(XmlPullParser xmlPullParser, eoc eocVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jE = e(xmlPullParser, "timescale", eocVar != null ? eocVar.i : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", eocVar != null ? eocVar.j : 0L);
        long jE3 = e(xmlPullParser, "duration", eocVar != null ? eocVar.b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", eocVar != null ? eocVar.a : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            enu enuVar = (enu) list.get(i);
            if (sij.L("http://dashif.org/guidelines/last-segment-number", enuVar.a)) {
                j6 = Long.parseLong(enuVar.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long jC = C(j3, j4);
        enw enwVarV = null;
        cvi cviVarA = A(xmlPullParser, "media", eocVar != null ? eocVar.g : null);
        cvi cviVarA2 = A(xmlPullParser, "initialization", eocVar != null ? eocVar.f : null);
        List listW = null;
        do {
            xmlPullParser.next();
            if (eci.n(xmlPullParser, "Initialization")) {
                enwVarV = v(xmlPullParser);
            } else if (eci.n(xmlPullParser, "SegmentTimeline")) {
                listW = w(xmlPullParser, jE, j2);
            } else {
                j(xmlPullParser);
            }
        } while (!eci.l(xmlPullParser, "SegmentTemplate"));
        if (eocVar != null) {
            if (enwVarV == null) {
                enwVarV = eocVar.h;
            }
            if (listW == null) {
                listW = eocVar.c;
            }
        }
        return new eoc(enwVarV, jE, jE2, jE4, j7, jE3, listW, jC, cviVarA2, cviVarA, edt.y(j5), edt.y(j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08a1 A[LOOP:11: B:165:0x06b1->B:213:0x08a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0b1c A[LOOP:5: B:115:0x0437->B:293:0x0b1c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0e0f A[LOOP:4: B:101:0x0329->B:361:0x0e0f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0e98 A[LOOP:1: B:40:0x00f5->B:380:0x0e98, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0e60 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0da9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x085c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c5 A[LOOP:3: B:78:0x0245->B:88:0x02c5, LOOP_END] */
    @Override // defpackage.ezz
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enr a(android.net.Uri r134, java.io.InputStream r135) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 3816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.a(android.net.Uri, java.io.InputStream):enr");
    }
}
