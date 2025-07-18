package defpackage;

import android.support.v7.appcompat.R;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eae {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L8a;
                case -1365340241: goto L81;
                case -1095064472: goto L77;
                case -53558318: goto L60;
                case 187078296: goto L56;
                case 187078297: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto L95
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 17
            return r3
        L56:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 5
            return r3
        L60:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L95
            if (r4 != 0) goto L6b
            return r2
        L6b:
            fkm r3 = q(r4)
            if (r3 != 0) goto L72
            return r2
        L72:
            int r3 = r3.a()
            return r3
        L77:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 7
            return r3
        L81:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L8a:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 18
            return r3
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eae.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (p(str)) {
            return 2;
        }
        if (o(str)) {
            return 3;
        }
        if (n(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eph ephVar = (eph) arrayList.get(i);
            Object obj = ephVar.c;
            if (str.equals(null)) {
                int i2 = ephVar.a;
                return 0;
            }
        }
        return -1;
    }

    public static int c(String str) {
        return b(f(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : edt.av(str)) {
            String strF = f(str2);
            if (strF != null && l(strF)) {
                return strF;
            }
        }
        return null;
    }

    public static String e(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrAv = edt.av(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrAv) {
            if (str2.equals(f(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String f(String str) {
        fkm fkmVarQ;
        String strG = null;
        if (str != null) {
            String strJ = sij.J(str.trim());
            if (!strJ.startsWith("avc1") && !strJ.startsWith("avc3")) {
                if (!strJ.startsWith("hev1") && !strJ.startsWith("hvc1")) {
                    if (!strJ.startsWith("dvav") && !strJ.startsWith("dva1") && !strJ.startsWith("dvhe") && !strJ.startsWith("dvh1")) {
                        if (!strJ.startsWith("av01")) {
                            if (!strJ.startsWith("vp9") && !strJ.startsWith("vp09")) {
                                if (!strJ.startsWith("vp8") && !strJ.startsWith("vp08")) {
                                    if (!strJ.startsWith("mp4a")) {
                                        if (!strJ.startsWith("mha1")) {
                                            if (!strJ.startsWith("mhm1")) {
                                                if (!strJ.startsWith("ac-3") && !strJ.startsWith("dac3")) {
                                                    if (!strJ.startsWith("ec-3") && !strJ.startsWith("dec3")) {
                                                        if (!strJ.startsWith("ec+3")) {
                                                            if (!strJ.startsWith("ac-4") && !strJ.startsWith("dac4")) {
                                                                if (!strJ.startsWith("dtsc")) {
                                                                    if (!strJ.startsWith("dtse")) {
                                                                        if (!strJ.startsWith("dtsh") && !strJ.startsWith("dtsl")) {
                                                                            if (!strJ.startsWith("dtsx")) {
                                                                                if (!strJ.startsWith("opus")) {
                                                                                    if (!strJ.startsWith("vorbis")) {
                                                                                        if (!strJ.startsWith("flac")) {
                                                                                            if (!strJ.startsWith("stpp")) {
                                                                                                if (!strJ.startsWith("wvtt")) {
                                                                                                    if (!strJ.contains("cea708")) {
                                                                                                        if (!strJ.contains("eia608") && !strJ.contains("cea608")) {
                                                                                                            ArrayList arrayList = a;
                                                                                                            int size = arrayList.size();
                                                                                                            int i = 0;
                                                                                                            while (true) {
                                                                                                                if (i >= size) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                eph ephVar = (eph) arrayList.get(i);
                                                                                                                Object obj = ephVar.b;
                                                                                                                if (strJ.startsWith(null)) {
                                                                                                                    Object obj2 = ephVar.c;
                                                                                                                    break;
                                                                                                                }
                                                                                                                i++;
                                                                                                            }
                                                                                                        } else {
                                                                                                            return "application/cea-608";
                                                                                                        }
                                                                                                    } else {
                                                                                                        return "application/cea-708";
                                                                                                    }
                                                                                                } else {
                                                                                                    return "text/vtt";
                                                                                                }
                                                                                            } else {
                                                                                                return "application/ttml+xml";
                                                                                            }
                                                                                        } else {
                                                                                            return "audio/flac";
                                                                                        }
                                                                                    } else {
                                                                                        return "audio/vorbis";
                                                                                    }
                                                                                } else {
                                                                                    return "audio/opus";
                                                                                }
                                                                            } else {
                                                                                return "audio/vnd.dts.uhd;profile=p2";
                                                                            }
                                                                        } else {
                                                                            return "audio/vnd.dts.hd";
                                                                        }
                                                                    } else {
                                                                        return "audio/vnd.dts.hd;profile=lbr";
                                                                    }
                                                                } else {
                                                                    return "audio/vnd.dts";
                                                                }
                                                            } else {
                                                                return "audio/ac4";
                                                            }
                                                        } else {
                                                            return "audio/eac3-joc";
                                                        }
                                                    } else {
                                                        return "audio/eac3";
                                                    }
                                                } else {
                                                    return "audio/ac3";
                                                }
                                            } else {
                                                return "audio/mhm1";
                                            }
                                        } else {
                                            return "audio/mha1";
                                        }
                                    } else {
                                        if (strJ.startsWith("mp4a.") && (fkmVarQ = q(strJ)) != null) {
                                            strG = g(fkmVarQ.a);
                                        }
                                        return strG == null ? "audio/mp4a-latm" : strG;
                                    }
                                } else {
                                    return "video/x-vnd.on2.vp8";
                                }
                            } else {
                                return "video/x-vnd.on2.vp9";
                            }
                        } else {
                            return "video/av01";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String g(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "audio/mp4a-latm";
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "audio/mpeg";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : edt.av(str)) {
            String strF = f(str2);
            if (strF != null && p(strF)) {
                return strF;
            }
        }
        return null;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        String strJ = sij.J(str);
        switch (strJ.hashCode()) {
            case -1833600100:
                return strJ.equals("video/x-mvhevc") ? "video/mv-hevc" : strJ;
            case -1007807498:
                return strJ.equals("audio/x-flac") ? "audio/flac" : strJ;
            case -979095690:
                return strJ.equals("application/x-mpegurl") ? "application/x-mpegURL" : strJ;
            case -586683234:
                return strJ.equals("audio/x-wav") ? "audio/wav" : strJ;
            case -432836268:
                return strJ.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strJ;
            case -432836267:
                return strJ.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strJ;
            case 187090231:
                return strJ.equals("audio/mp3") ? "audio/mpeg" : strJ;
            default:
                return strJ;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean j(String str, String str2) {
        fkm fkmVarQ;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (fkmVarQ = q(str2)) == null || (iA = fkmVarQ.a()) == 0 || iA == 16) {
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                }
                break;
        }
        return false;
    }

    public static boolean k(String str, String str2) {
        return e(str, str2) != null;
    }

    public static boolean l(String str) {
        return "audio".equals(r(str));
    }

    public static boolean m(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        if (str2.startsWith("dvhe") && str.startsWith("hev1")) {
            return true;
        }
        if (str2.startsWith("dvh1") && str.startsWith("hvc1")) {
            return true;
        }
        if (str2.startsWith("dvav") && str.startsWith("avc3")) {
            return true;
        }
        if (str2.startsWith("dva1") && str.startsWith("avc1")) {
            return true;
        }
        return str2.startsWith("dav1") && str.startsWith("av01");
    }

    public static boolean n(String str) {
        return "image".equals(r(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean o(String str) {
        return "text".equals(r(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean p(String str) {
        return "video".equals(r(str));
    }

    static fkm q(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new fkm(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String r(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
