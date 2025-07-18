package defpackage;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erp implements ezz {
    private final erm au;
    private final erl av;
    private static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern b = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final Pattern c = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final Pattern d = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final Pattern e = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final Pattern f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern g = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final Pattern h = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern i = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern j = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern o = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern p = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern r = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern s = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern t = n("CAN-SKIP-DATERANGES");
    private static final Pattern u = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern v = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern w = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern x = n("CAN-BLOCK-RELOAD");
    private static final Pattern y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern A = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern B = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern D = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern E = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern F = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern G = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern I = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern J = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern K = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern L = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern M = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern N = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern O = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern P = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern Q = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern R = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern S = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern T = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern U = n("AUTOSELECT");
    private static final Pattern V = n("DEFAULT");
    private static final Pattern W = n("FORCED");
    private static final Pattern X = n("INDEPENDENT");
    private static final Pattern Y = n("GAP");
    private static final Pattern Z = n("PRECISE");
    private static final Pattern aa = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final Pattern ab = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final Pattern ac = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final Pattern ad = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final Pattern ae = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern af = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final Pattern ag = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern ah = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern ai = n("END-ON-NEXT");
    private static final Pattern aj = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final Pattern ak = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final Pattern al = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern am = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern an = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final Pattern ao = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final Pattern ap = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final Pattern aq = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final Pattern ar = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final Pattern as = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern at = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public erp(erm ermVar, erl erlVar) {
        this.au = ermVar;
        this.av = erlVar;
    }

    private static double b(String str, Pattern pattern) {
        return Double.parseDouble(l(str, pattern, Collections.EMPTY_MAP));
    }

    private static double c(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    private static int d(String str, Pattern pattern) {
        return Integer.parseInt(l(str, pattern, Collections.EMPTY_MAP));
    }

    private static int e(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !edt.am(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    private static dyz f(String str, String str2, Map map) throws eaf {
        String strK = k(str, K, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strL = l(str, L, map);
            return new dyz(dys.d, "video/mp4", Base64.decode(strL.substring(strL.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new dyz(dys.d, "hls", edt.ar(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strK)) {
            return null;
        }
        String strL2 = l(str, L, map);
        byte[] bArrDecode = Base64.decode(strL2.substring(strL2.indexOf(44)), 0);
        UUID uuid = dys.e;
        return new dyz(uuid, "video/mp4", fki.e(uuid, bArrDecode));
    }

    private static dza g(String str, dyz[] dyzVarArr) {
        dyz[] dyzVarArr2 = new dyz[dyzVarArr.length];
        for (int i2 = 0; i2 < dyzVarArr.length; i2++) {
            dyzVarArr2[i2] = dyzVarArr[i2].a(null);
        }
        return new dza(str, dyzVarArr2);
    }

    private static String h(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    private static String i(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static String j(String str, Pattern pattern, Map map) {
        return k(str, pattern, null, map);
    }

    private static String k(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map);
    }

    private static String l(String str, Pattern pattern, Map map) throws eaf {
        String strJ = j(str, pattern, map);
        if (strJ != null) {
            return strJ;
        }
        throw new eaf("Couldn't match " + pattern.pattern() + " in " + str, null, true, 4);
    }

    private static String m(String str, Map map) {
        Matcher matcher = as.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static Pattern n(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    private static boolean o(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    private static int p(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    private static long q(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:347:0x098e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0ba2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.erl r(defpackage.erm r116, defpackage.erl r117, defpackage.ivx r118, java.lang.String r119) throws defpackage.ero, java.lang.NumberFormatException, defpackage.eaf {
        /*
            Method dump skipped, instructions count: 3550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erp.r(erm, erl, ivx, java.lang.String):erl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0237, code lost:
    
        if (r13.length() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0239, code lost:
    
        r5 = r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023d, code lost:
    
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023f, code lost:
    
        r14 = defpackage.a.cq(r5, r7, ",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0244, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        r4 = j(r2, defpackage.erp.k, r9);
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024c, code lost:
    
        if (r4 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024e, code lost:
    
        r4 = defpackage.edt.at(r4, "x");
        r7 = java.lang.Integer.parseInt(r4[r42 ? 1 : 0]);
        r4 = java.lang.Integer.parseInt(r4[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0262, code lost:
    
        if (r7 <= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0264, code lost:
    
        if (r4 > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0267, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0269, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026a, code lost:
    
        r7 = j(r2, defpackage.erp.l, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0270, code lost:
    
        if (r7 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0272, code lost:
    
        r7 = java.lang.Float.parseFloat(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0277, code lost:
    
        r7 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0279, code lost:
    
        r30 = j(r2, defpackage.erp.b, r9);
        r31 = j(r2, defpackage.erp.c, r9);
        r32 = j(r2, defpackage.erp.d, r9);
        r33 = j(r2, defpackage.erp.e, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0291, code lost:
    
        if (r26 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0293, code lost:
    
        r2 = defpackage.eci.p(r12, l(r2, defpackage.erp.L, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029d, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a4, code lost:
    
        if (r24.g() == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a6, code lost:
    
        r2 = defpackage.eci.p(r12, m(r24.f(), r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b3, code lost:
    
        r2 = new defpackage.dzd();
        r2.b(r11.size());
        r2.a("application/x-mpegURL");
        r2.j = r14;
        r2.h = r6;
        r2.i = r1;
        r2.t = r5;
        r2.u = r4;
        r2.x = r7;
        r2.f = r0;
        r11.add(new defpackage.esn(r28, new defpackage.dze(r2), r30, r31, r32, r33));
        r0 = (java.util.ArrayList) r3.get(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e9, code lost:
    
        if (r0 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02eb, code lost:
    
        r0 = new java.util.ArrayList();
        r3.put(r28, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f3, code lost:
    
        r0.add(new defpackage.equ(r6, r1, r30, r31, r32, r33));
        r0 = r20;
        r4 = r24;
        r2 = r25;
        r6 = r34;
        r10 = r35;
        r14 = r36;
        r13 = r37;
        r15 = r38;
        r5 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x031f, code lost:
    
        throw new defpackage.eaf("#EXT-X-STREAM-INF must be followed by another line", null, true, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0320, code lost:
    
        r39 = r5;
        r34 = r6;
        r35 = r10;
        r37 = r13;
        r36 = r14;
        r38 = r15;
        r14 = new java.util.ArrayList();
        r0 = new java.util.HashSet();
        r1 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033c, code lost:
    
        if (r1 >= r11.size()) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x033e, code lost:
    
        r2 = (defpackage.esn) r11.get(r1);
        r5 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034a, code lost:
    
        if (r0.add(r5) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x034c, code lost:
    
        r6 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0353, code lost:
    
        if (((defpackage.dze) r6).V != null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0355, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0357, code lost:
    
        r10 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0359, code lost:
    
        defpackage.a.ab(r10);
        r13 = (java.util.ArrayList) r3.get(r5);
        r13.getClass();
        r17 = r0;
        r0 = new defpackage.eac[1];
        r0[r42 ? 1 : 0] = new defpackage.eqv(null, null, r13);
        r13 = new defpackage.ead(r0);
        r0 = new defpackage.dzd((defpackage.dze) r6);
        r0.k = r13;
        r6 = new defpackage.dze(r0);
        r0 = r2.a;
        r29 = (java.lang.String) r0;
        r27 = (android.net.Uri) r5;
        r14.add(new defpackage.esn(r27, r6, r29, (java.lang.String) r2.d, (java.lang.String) r2.f, (java.lang.String) r2.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ae, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b0, code lost:
    
        r1 = r1 + 1;
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03b5, code lost:
    
        r1 = r42 ? 1 : 0;
        r0 = null;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03bd, code lost:
    
        if (r1 >= r39.size()) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03bf, code lost:
    
        r2 = r39;
        r5 = (java.lang.String) r2.get(r1);
        r6 = l(r5, defpackage.erp.R, r9);
        r10 = l(r5, defpackage.erp.Q, r9);
        r13 = new defpackage.dzd();
        r13.a = defpackage.a.cq(r10, r6, ":");
        r13.b = r10;
        r13.a("application/x-mpegURL");
        r15 = o(r5, defpackage.erp.V);
        r17 = r0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03f3, code lost:
    
        if (o(r5, defpackage.erp.W) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f5, code lost:
    
        r15 = (r15 ? 1 : 0) | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03f7, code lost:
    
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03fd, code lost:
    
        if (o(r5, defpackage.erp.U) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03ff, code lost:
    
        r15 = (r15 ? 1 : 0) | 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0401, code lost:
    
        r13.e = r15;
        r0 = j(r5, defpackage.erp.S, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x040d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x040f, code lost:
    
        r20 = r1;
        r1 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0414, code lost:
    
        r0 = defpackage.edt.at(r0, ",");
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0421, code lost:
    
        if (true == defpackage.edt.ah(r0, "public.accessibility.describes-video")) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0423, code lost:
    
        r1 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0426, code lost:
    
        r1 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x042e, code lost:
    
        if (defpackage.edt.ah(r0, "public.accessibility.transcribes-spoken-dialog") == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0430, code lost:
    
        r1 = r1 | android.support.v7.widget.RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0438, code lost:
    
        if (defpackage.edt.ah(r0, "public.accessibility.describes-music-and-sound") == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x043a, code lost:
    
        r1 = r1 | 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0442, code lost:
    
        if (defpackage.edt.ah(r0, "public.easy-to-read") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0444, code lost:
    
        r1 = r1 | 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0446, code lost:
    
        r13.f = r1;
        r13.d = j(r5, defpackage.erp.P, r9);
        r0 = j(r5, defpackage.erp.L, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0456, code lost:
    
        if (r0 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0458, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x045a, code lost:
    
        r0 = defpackage.eci.p(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x045e, code lost:
    
        r39 = r2;
        r2 = new defpackage.eac[1];
        r24 = r3;
        r2[r42 ? 1 : 0] = new defpackage.eqv(r6, r10, java.util.Collections.EMPTY_LIST);
        r1 = new defpackage.ead(r2);
        r2 = l(r5, defpackage.erp.N, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x047d, code lost:
    
        switch(r2.hashCode()) {
            case -959297733: goto L233;
            case -333210994: goto L222;
            case 62628790: goto L192;
            case 81665115: goto L175;
            default: goto L174;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0480, code lost:
    
        r0 = r36;
        r16 = r37;
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x048e, code lost:
    
        if (r2.equals("VIDEO") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0490, code lost:
    
        r2 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0496, code lost:
    
        if (r2 >= r11.size()) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0498, code lost:
    
        r3 = (defpackage.esn) r11.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04a4, code lost:
    
        if (r6.equals(r3.a) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04a7, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04aa, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04ab, code lost:
    
        if (r3 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04ad, code lost:
    
        r2 = r3.b;
        r3 = defpackage.edt.U(((defpackage.dze) r2).U, 2);
        r13.j = r3;
        r13.d(defpackage.eae.f(r3));
        r13.t = ((defpackage.dze) r2).af;
        r13.u = ((defpackage.dze) r2).ag;
        r13.x = ((defpackage.dze) r2).aj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04d6, code lost:
    
        if (r0 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04d8, code lost:
    
        r13.k = r1;
        r15 = r38;
        r15.add(new defpackage.cvi(r0, new defpackage.dze(r13), r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (defpackage.edt.am(e(r2, false, r4)) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04ea, code lost:
    
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04ec, code lost:
    
        r0 = r36;
        r16 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04f2, code lost:
    
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04fa, code lost:
    
        if (r2.equals("AUDIO") == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04fc, code lost:
    
        r2 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0502, code lost:
    
        if (r2 >= r11.size()) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0504, code lost:
    
        r3 = (defpackage.esn) r11.get(r2);
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0512, code lost:
    
        if (r6.equals(r3.d) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r4 = r2.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0515, code lost:
    
        r2 = r26 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0518, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0519, code lost:
    
        if (r3 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x051b, code lost:
    
        r2 = defpackage.edt.U(((defpackage.dze) r3.b).U, 1);
        r13.j = r2;
        r2 = defpackage.eae.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x052d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x052e, code lost:
    
        r5 = j(r5, defpackage.erp.g, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0534, code lost:
    
        if (r5 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0536, code lost:
    
        r13.E = java.lang.Integer.parseInt(defpackage.edt.au(r5, "/")[r42 ? 1 : 0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0548, code lost:
    
        if ("audio/eac3".equals(r2) == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r4 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0550, code lost:
    
        if (r5.endsWith("/JOC") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0552, code lost:
    
        r2 = "audio/eac3-joc";
        r13.j = "ec+3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0558, code lost:
    
        r13.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x055b, code lost:
    
        if (r0 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x055d, code lost:
    
        r13.k = r1;
        r1 = new defpackage.cvi(r0, new defpackage.dze(r13), r10);
        r0 = r37;
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x056f, code lost:
    
        r0 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0571, code lost:
    
        if (r3 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0578, code lost:
    
        r16 = r0;
        r3 = new defpackage.dze(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x057b, code lost:
    
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r4 = r4.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x057f, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0581, code lost:
    
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0585, code lost:
    
        r0 = r37;
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x058f, code lost:
    
        if (r2.equals("CLOSED-CAPTIONS") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0591, code lost:
    
        r1 = l(r5, defpackage.erp.T, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x059d, code lost:
    
        if (r1.startsWith("CC") == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x059f, code lost:
    
        r2 = "application/cea-608";
        r1 = java.lang.Integer.parseInt(r1.substring(2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05ac, code lost:
    
        r2 = "application/cea-708";
        r1 = java.lang.Integer.parseInt(r1.substring(7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x05b8, code lost:
    
        if (r17 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05ba, code lost:
    
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r4.isEmpty() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05c0, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05c2, code lost:
    
        r13.d(r2);
        r13.J = r1;
        r6.add(new defpackage.dze(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x05cf, code lost:
    
        r16 = r0;
        r17 = r6;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05d6, code lost:
    
        r16 = r37;
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05e1, code lost:
    
        if (r2.equals("SUBTITLES") == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05e3, code lost:
    
        r2 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05e9, code lost:
    
        if (r2 >= r11.size()) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05eb, code lost:
    
        r3 = (defpackage.esn) r11.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05f7, code lost:
    
        if (r6.equals(r3.f) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05fa, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05fe, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05ff, code lost:
    
        if (r3 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0601, code lost:
    
        r2 = defpackage.edt.U(((defpackage.dze) r3.b).U, 3);
        r13.j = r2;
        r3 = defpackage.eae.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0613, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0616, code lost:
    
        if (r3 != null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0618, code lost:
    
        r3 = "text/vtt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0619, code lost:
    
        r13.d(r3);
        r13.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r4.startsWith(r0) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x061e, code lost:
    
        if (r0 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0620, code lost:
    
        r1 = new defpackage.cvi(r0, new defpackage.dze(r13), r10);
        r0 = r36;
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0630, code lost:
    
        r0 = r36;
        defpackage.edb.e("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0639, code lost:
    
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x063b, code lost:
    
        r1 = r20 + 1;
        r36 = r0;
        r38 = r15;
        r37 = r16;
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0647, code lost:
    
        r17 = r0;
        r24 = r3;
        r0 = r36;
        r16 = r37;
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0651, code lost:
    
        if (r19 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0653, code lost:
    
        r20 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0658, code lost:
    
        r20 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x065a, code lost:
    
        r11 = new defpackage.erm(r12, r34, r14, r15, r16, r0, r18, r24, r20, r21, r9, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r3.add(r4);
        r4 = new defpackage.ivx(r3, r2);
        r12 = r41.toString();
        r3 = new java.util.HashMap();
        r9 = new java.util.HashMap();
        r11 = new java.util.ArrayList();
        r15 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r14 = new java.util.ArrayList();
        r18 = new java.util.ArrayList();
        r42 = r5;
        r5 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r6 = new java.util.ArrayList();
        r19 = r42 ? 1 : 0;
        r21 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0669, code lost:
    
        defpackage.edt.ac(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x066c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x066d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x066e, code lost:
    
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0672, code lost:
    
        r20 = r0;
        r25 = r2;
        r42 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x067e, code lost:
    
        if (r4.startsWith("#EXT-X-TARGETDURATION") != false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0686, code lost:
    
        if (r4.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x068e, code lost:
    
        if (r4.startsWith("#EXTINF") != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0696, code lost:
    
        if (r4.startsWith("#EXT-X-KEY") != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x069e, code lost:
    
        if (r4.startsWith("#EXT-X-BYTERANGE") != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x06a6, code lost:
    
        if (r4.equals("#EXT-X-DISCONTINUITY") != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06ae, code lost:
    
        if (r4.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r24 = r4;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06b6, code lost:
    
        if (r4.equals("#EXT-X-ENDLIST") == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06b9, code lost:
    
        r3.add(r4);
        r5 = r42;
        r0 = r20;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06c6, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06d3, code lost:
    
        r0 = r(r40.au, r40.av, new defpackage.ivx(r3, r25), r41.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06de, code lost:
    
        defpackage.edt.ac(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06e1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r4.g() == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06e7, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06ee, code lost:
    
        defpackage.edt.ac(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x06fe, code lost:
    
        throw new defpackage.eaf("Failed to parse the playlist, could not identify any tags.", null, true, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        r2 = r24.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x070d, code lost:
    
        defpackage.edt.ac(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0710, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        if (r2.startsWith("#EXT") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r6.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        r1 = r2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r2.startsWith("#EXT-X-DEFINE") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        r9.put(l(r2, defpackage.erp.Q, r9), l(r2, defpackage.erp.aa, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r2.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        r4 = r24;
        r2 = r25;
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
    
        if (r2.startsWith("#EXT-X-MEDIA") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
    
        r5.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        if (r2.startsWith("#EXT-X-SESSION-KEY") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r1 = f(r2, k(r2, defpackage.erp.J, "identity", r9), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r2 = i(l(r2, defpackage.erp.I, r9));
        r8 = new defpackage.dyz[1];
        r8[r42 ? 1 : 0] = r1;
        r10.add(new defpackage.dza(r2, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
    
        if (r2.startsWith(r0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r4 = r24;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014f, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
    
        r20 = r0;
        r19 = r19 | r2.contains("CLOSED-CAPTIONS=NONE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015c, code lost:
    
        if (true == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        r0 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        r0 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
    
        r26 = r1;
        r1 = d(r2, defpackage.erp.f);
        r34 = r6;
        r6 = p(r2, defpackage.erp.a);
        r35 = r10;
        r10 = j(r2, defpackage.erp.h, r9);
        r36 = r14;
        r14 = j(r2, defpackage.erp.i, r9);
        r37 = r13;
        r13 = j(r2, defpackage.erp.j, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r13 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018d, code lost:
    
        r7 = defpackage.edt.at(defpackage.edt.au(r13, ",")[r42 ? 1 : 0], "/");
        r13 = r7[r42 ? 1 : 0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019f, code lost:
    
        if (r7.length <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a1, code lost:
    
        r13 = r7[1];
        r39 = r5;
        r38 = r15;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
    
        r39 = r5;
        r38 = r15;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b1, code lost:
    
        r39 = r5;
        r38 = r15;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b6, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        r5 = defpackage.edt.U(r14, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c0, code lost:
    
        if (defpackage.eae.m(r5, r7) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c4, code lost:
    
        if (r7 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c7, code lost:
    
        if (r10 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c9, code lost:
    
        if (r13 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d3, code lost:
    
        if (r10.equals("PQ") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
    
        if (r13.equals("db1p") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e3, code lost:
    
        if (r10.equals("SDR") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01eb, code lost:
    
        if (r13.equals("db2g") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f3, code lost:
    
        if (r10.equals("HLG") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        if (r13.startsWith("db4") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fe, code lost:
    
        if (r7 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0200, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0201, code lost:
    
        r5 = defpackage.edt.av(r14);
        r10 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0206, code lost:
    
        if (r10 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0208, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020a, code lost:
    
        r13 = new java.lang.StringBuilder();
        r14 = r42 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0211, code lost:
    
        if (r14 >= r10) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0213, code lost:
    
        r15 = r5[r14];
        r27 = r5;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021e, code lost:
    
        if (defpackage.eae.c(r15) == 2) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
    
        if (r13.length() <= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        r13.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0229, code lost:
    
        r13.append(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022c, code lost:
    
        r14 = r14 + 1;
        r5 = r27;
        r10 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v38 */
    @Override // defpackage.ezz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(android.net.Uri r41, java.io.InputStream r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erp.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    public erp() {
        this(erm.a, null);
    }
}
