package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edt {
    private static HashMap i;
    public static final String a = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] b = new byte[0];
    public static final long[] c = new long[0];
    private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern d = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final Pattern e = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final Pattern h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static final String[] j = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] k = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] m = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    public static final int[] f = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowNoTitle, R.styleable.AppCompatTheme_windowFixedHeightMinor, 108, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowMinWidthMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textAppearanceListItem, 96, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_windowFixedHeightMajor, 127, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};

    public static long A(long j2, int i2) {
        return C(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long B(long j2, long j3, long j4) {
        return C(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long C(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? aG(j2, j3, j4, roundingMode) : sfy.at(j3, sfy.aq(j2, j4, RoundingMode.UNNECESSARY)) : sfy.aq(j3, sfy.aq(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : sfy.at(j2, sfy.aq(j3, j4, RoundingMode.UNNECESSARY)) : sfy.aq(j2, sfy.aq(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long D(int i2, int i3) {
        return E(i3) | (E(i2) << 32);
    }

    public static long E(int i2) {
        return i2 & 4294967295L;
    }

    public static long F(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static Point G(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && an(context)) {
            String strAH = Build.VERSION.SDK_INT < 28 ? aH("sys.display-size") : aH("vendor.display-size");
            if (!TextUtils.isEmpty(strAH)) {
                try {
                    String[] strArrAt = at(strAH.trim(), "x");
                    if (strArrAt.length == 2) {
                        int i2 = Integer.parseInt(strArrAt[0]);
                        int i3 = Integer.parseInt(strArrAt[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                edb.c("Util", "Invalid display size: ".concat(String.valueOf(strAH)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Drawable H(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static AudioFormat I(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static Handler J() {
        return K(null);
    }

    public static Handler K(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        eci.e(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static Handler L() {
        return M(null);
    }

    public static Handler M(Handler.Callback callback) {
        return new Handler(N(), callback);
    }

    public static Looper N() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static dze O(int i2, int i3, int i4) {
        dzd dzdVar = new dzd();
        dzdVar.d("audio/raw");
        dzdVar.E = i3;
        dzdVar.F = i4;
        dzdVar.G = i2;
        return new dze(dzdVar);
    }

    public static uhp P(Handler handler, final Runnable runnable, final Object obj) {
        final uic uicVar = new uic();
        aB(handler, new Runnable() { // from class: edr
            @Override // java.lang.Runnable
            public final void run() {
                String str = edt.a;
                uic uicVar2 = uicVar;
                Runnable runnable2 = runnable;
                Object obj2 = obj;
                try {
                    if (uicVar2.isCancelled()) {
                        return;
                    }
                    runnable2.run();
                    uicVar2.b(obj2);
                } catch (Throwable th) {
                    uicVar2.e(th);
                }
            }
        });
        return uicVar;
    }

    public static uhp Q(final uhp uhpVar, final ufw ufwVar) {
        final uic uicVar = new uic();
        Runnable runnable = new Runnable() { // from class: edp
            @Override // java.lang.Runnable
            public final void run() {
                String str = edt.a;
                if (uicVar.isCancelled()) {
                    uhpVar.cancel(false);
                }
            }
        };
        ugk ugkVar = ugk.a;
        uicVar.c(runnable, ugkVar);
        uhpVar.c(new Runnable() { // from class: edq
            @Override // java.lang.Runnable
            public final void run() {
                edt.ad(uhpVar, uicVar, ufwVar);
            }
        }, ugkVar);
        return uicVar;
    }

    public static String R(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String S(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String T(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String U(String str, int i2) {
        String[] strArrAv = av(str);
        if (strArrAv.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrAv) {
            if (i2 == eae.c(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String V(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return sij.K(networkCountryIso);
            }
        }
        return sij.K(Locale.getDefault().getCountry());
    }

    public static String W(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String X(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long jAbs = Math.abs(j2) + 500;
        sb.setLength(0);
        String str = j2 < 0 ? "-" : "";
        long j3 = jAbs / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 % 60;
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j6)).toString();
    }

    public static String Y(int i2) {
        switch (i2) {
            case ListPopupWindow.WRAP_CONTENT /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String Z(int i2) {
        return Integer.toString(i2, 36);
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static void aA(eao eaoVar, boolean z) {
        if (ap(eaoVar, z)) {
            aF(eaoVar);
        } else {
            aE(eaoVar);
        }
    }

    public static void aB(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void aC(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jAq = sfy.aq(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = sfy.aq(jArr[i2], jAq, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jAq2 = sfy.aq(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = sfy.at(jArr[i2], jAq2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = sfy.aq(1000000L, sfy.aq(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = aG(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = sfy.at(1000000L, sfy.aq(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    public static void aD(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void aE(eao eaoVar) {
        if (eaoVar == null || !eaoVar.q(1)) {
            return;
        }
        eaoVar.e();
    }

    public static void aF(eao eaoVar) {
        if (eaoVar == null) {
            return;
        }
        int iBf = eaoVar.bf();
        if (iBf == 1) {
            if (eaoVar.q(2)) {
                eaoVar.W();
            }
        } else if (iBf == 4 && eaoVar.q(4)) {
            eaoVar.j();
        }
        if (eaoVar.q(1)) {
            eaoVar.f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long aG(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.aG(long, long, long, java.math.RoundingMode):long");
    }

    private static String aH(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            edb.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    private static HashMap aI() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = j.length;
        HashMap map = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = j;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static String aa(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strJ = sij.J(str);
        int i2 = 0;
        String str2 = au(strJ, "-")[0];
        if (i == null) {
            i = aI();
        }
        String str3 = (String) i.get(str2);
        if (str3 != null) {
            strJ = str3.concat(String.valueOf(strJ.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = k;
                int length = strArr.length;
                if (i2 >= 18) {
                    break;
                }
                if (strJ.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(strJ.substring(strArr[i2].length())));
                }
                i2 += 2;
            }
        }
        return strJ;
    }

    public static ExecutorService ab(String str) {
        return Executors.newSingleThreadExecutor(new eds(str, 1));
    }

    public static void ac(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    static /* synthetic */ void ad(uhp uhpVar, uic uicVar, ufw ufwVar) {
        try {
            try {
                uicVar.ev(ufwVar.a(sfy.J(uhpVar)));
            } catch (Throwable th) {
                uicVar.e(th);
            }
        } catch (Error e2) {
            e = e2;
            uicVar.e(e);
        } catch (CancellationException unused) {
            uicVar.cancel(false);
        } catch (RuntimeException e3) {
            e = e3;
            uicVar.e(e);
        } catch (ExecutionException e4) {
            e = e4;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            uicVar.e(e);
        }
    }

    public static void ae(List list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i5 = i3 - i2;
        while (true) {
            i5--;
            if (i5 < 0) {
                list.addAll(Math.min(i4, list.size()), arrayDeque);
                return;
            }
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
    }

    public static void af(List list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static boolean ag(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean ah(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r4.J(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean ai(defpackage.edi r3, defpackage.edi r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.b()
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 + r0
            r4.D(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L44
            r4.J(r3)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r1 = 1
            goto L65
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 != 0) goto L65
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L51
            goto L65
        L51:
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r3 != r0) goto L2d
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r0 = r0 + r0
            r4.D(r0)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            goto L2d
        L60:
            r3 = move-exception
            r5.reset()
            throw r3
        L65:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.ai(edi, edi, java.util.zip.Inflater):boolean");
    }

    public static boolean aj(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean ak(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean al(Context context) {
        if (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 30 && (sij.L(Build.MODEL, "moto g(20)") || sij.L(Build.MODEL, "rmx3231"))) {
            return true;
        }
        return Build.VERSION.SDK_INT == 34 && sij.L(Build.MODEL, "sm-x200");
    }

    public static boolean am(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean an(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean ao(edi ediVar, edi ediVar2, Inflater inflater) {
        return ediVar.a() > 0 && ediVar.d() == 120 && ai(ediVar, ediVar2, inflater);
    }

    public static boolean ap(eao eaoVar, boolean z) {
        if (eaoVar == null || !eaoVar.al() || eaoVar.bf() == 1 || eaoVar.bf() == 4) {
            return true;
        }
        return (!z || eaoVar.bg() == 0 || eaoVar.bg() == 4) ? false : true;
    }

    public static boolean aq(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] ar(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object[] as(Object[] objArr, int i2) {
        a.H(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] at(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] au(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] av(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : at(str.trim(), "(\\s*,\\s*)");
    }

    public static long aw(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static int ax(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return !z ? i2 : iBinarySearch;
    }

    public static int ay(List list, Comparable comparable, boolean z) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int az(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int c(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int d(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int e(int i2, int i3) {
        return (char) (m[i2 ^ (i3 >> 12)] ^ ((char) (i3 << 4)));
    }

    public static int f(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = l[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int g(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
        }
    }

    public static int h(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 == 10) {
            i3 = 737532;
        } else {
            if (i2 == 12) {
                return 743676;
            }
            if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i3 = 67108860;
            i4 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int j(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int k(String str, int i2) {
        int i3 = 0;
        for (String str2 : av(str)) {
            if (i2 == eae.c(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static int l(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int m(String str) throws NumberFormatException {
        String[] strArrAt;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrAt = at(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrAt[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrAt[length + (-2)]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int n(int i2) {
        return o(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static int o(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static int p(int i2, int i3) {
        return j(i2) * i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int q(android.net.Uri r6, java.lang.String r7) {
        /*
            r0 = 3
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 4
            if (r7 != 0) goto L97
            java.lang.String r7 = r6.getScheme()
            if (r7 == 0) goto L1e
            java.lang.String r5 = "rtsp"
            boolean r5 = defpackage.sij.L(r5, r7)
            if (r5 != 0) goto L1d
            java.lang.String r5 = "rtspt"
            boolean r7 = defpackage.sij.L(r5, r7)
            if (r7 == 0) goto L1e
        L1d:
            return r0
        L1e:
            java.lang.String r7 = r6.getLastPathSegment()
            if (r7 != 0) goto L25
            return r4
        L25:
            r0 = 46
            int r0 = r7.lastIndexOf(r0)
            if (r0 < 0) goto L69
            int r0 = r0 + r3
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r7 = defpackage.sij.J(r7)
            int r0 = r7.hashCode()
            switch(r0) {
                case 104579: goto L5b;
                case 108321: goto L51;
                case 3242057: goto L48;
                case 3299913: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L65
        L3e:
            java.lang.String r0 = "m3u8"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L65
            r7 = r2
            goto L66
        L48:
            java.lang.String r0 = "isml"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L65
            goto L63
        L51:
            java.lang.String r0 = "mpd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L65
            r7 = r1
            goto L66
        L5b:
            java.lang.String r0 = "ism"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L65
        L63:
            r7 = r3
            goto L66
        L65:
            r7 = r4
        L66:
            if (r7 == r4) goto L69
            return r7
        L69:
            java.util.regex.Pattern r7 = defpackage.edt.h
            java.lang.String r6 = r6.getPath()
            defpackage.a.aq(r6)
            java.util.regex.Matcher r6 = r7.matcher(r6)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L96
            java.lang.String r6 = r6.group(r2)
            if (r6 == 0) goto L95
            java.lang.String r7 = "format=mpd-time-csf"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L8b
            return r1
        L8b:
            java.lang.String r7 = "format=m3u8-aapl"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L94
            return r3
        L94:
            return r2
        L95:
            return r3
        L96:
            return r4
        L97:
            int r6 = r7.hashCode()
            switch(r6) {
                case -979127466: goto Lba;
                case -156749520: goto Lb1;
                case 64194685: goto La8;
                case 1154777587: goto L9f;
                default: goto L9e;
            }
        L9e:
            goto Lc3
        L9f:
            java.lang.String r6 = "application/x-rtsp"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lc3
            return r0
        La8:
            java.lang.String r6 = "application/dash+xml"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lc3
            return r1
        Lb1:
            java.lang.String r6 = "application/vnd.ms-sstr+xml"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lc3
            return r3
        Lba:
            java.lang.String r6 = "application/x-mpegURL"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lc3
            return r2
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.q(android.net.Uri, java.lang.String):int");
    }

    public static int r(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long s(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static long t(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long u(long j2, int i2) {
        return C(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static long v(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long w(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static long x(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static long y(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long z(String str) throws eaf {
        Matcher matcher = g.matcher(str);
        if (!matcher.matches()) {
            throw new eaf("Invalid date/time format: ".concat(String.valueOf(str)), null, true, 1);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 = -i2;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }
}
