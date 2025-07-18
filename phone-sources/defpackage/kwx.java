package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwx implements Serializable {
    private static final String DISABLE_LANGUAGE_CODE = "<disable>";
    public static final int FORMAT_1 = 1;
    public static final int FORMAT_2 = 2;
    public static final int FORMAT_3 = 3;
    public static final int JSON3 = 300;
    public static final int TTML = 200;
    public static final int WEB_VTT = 100;
    public static final int WEB_VTT_TV = 101;
    private static final long serialVersionUID = 6;

    public static kwu builder() {
        kwu kwuVar = new kwu();
        kwuVar.f("");
        kwuVar.g("");
        kwuVar.i("");
        kwuVar.c(0);
        kwuVar.h("");
        kwuVar.e(false);
        kwuVar.d(false);
        kwuVar.b(6);
        return kwuVar;
    }

    public static kwx createDisableTrack(String str) {
        kwu kwuVarBuilder = builder();
        kwuVarBuilder.f(DISABLE_LANGUAGE_CODE);
        kwuVarBuilder.g(str);
        return kwuVarBuilder.a();
    }

    public static kwx createLegacy(String str, String str2, String str3, int i, String str4) {
        kwu kwuVarBuilder = builder();
        kwuVarBuilder.f(str);
        kwuVarBuilder.g(str2);
        kwuVarBuilder.i(str3);
        kwuVarBuilder.h(str4);
        return kwuVarBuilder.a();
    }

    public static int getCurrentFileVersion() {
        return 6;
    }

    public static boolean isOnlyDisableTrack(Collection<kwx> collection) {
        return collection.size() == 1 && collection.iterator().next().isDisableTrack();
    }

    public static kwx subtitleTrack(String str, xbe xbeVar) {
        return subtitleTrack(str, xbeVar, 6);
    }

    private Object writeReplace() {
        kwv kwvVar = new kwv();
        kwvVar.a = videoId();
        vtw vtwVarM = xbe.a.m();
        String strLanguageCode = languageCode();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        xbe xbeVar = (xbe) vtwVarM.b;
        strLanguageCode.getClass();
        xbeVar.b |= 1;
        xbeVar.c = strLanguageCode;
        if (trackName() != null) {
            String strTrackName = trackName();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            xbe xbeVar2 = (xbe) vtwVarM.b;
            strTrackName.getClass();
            xbeVar2.b |= 16;
            xbeVar2.f = strTrackName;
        }
        long j = format();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        xbe xbeVar3 = (xbe) vtwVarM.b;
        xbeVar3.b |= 2;
        xbeVar3.d = j;
        if (url() != null) {
            String strUrl = url();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            xbe xbeVar4 = (xbe) vtwVarM.b;
            strUrl.getClass();
            xbeVar4.b |= 8;
            xbeVar4.e = strUrl;
        }
        boolean zIsForced = isForced();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        xbe xbeVar5 = (xbe) vtwVarM.b;
        xbeVar5.b |= 64;
        xbeVar5.g = zIsForced;
        boolean zIsClosedCaption = isClosedCaption();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        xbe xbeVar6 = (xbe) vtwVarM.b;
        xbeVar6.b |= 256;
        xbeVar6.h = zIsClosedCaption;
        kwvVar.b = ((xbe) vtwVarM.r()).h();
        kwvVar.c = fileVersion();
        return kwvVar;
    }

    public abstract int fileVersion();

    public abstract int format();

    public abstract boolean isClosedCaption();

    public boolean isDisableTrack() {
        return TextUtils.equals(languageCode(), DISABLE_LANGUAGE_CODE);
    }

    public abstract boolean isForced();

    public abstract String languageCode();

    public final String toString() {
        if (isDisableTrack()) {
            return trackName();
        }
        String strD = ksg.d(languageCode());
        StringBuilder sb = new StringBuilder(strD);
        if (!TextUtils.isEmpty(trackName()) && !trackName().equalsIgnoreCase(strD)) {
            sb.append(" - ");
            sb.append(trackName());
        }
        return sb.toString();
    }

    public abstract String trackName();

    public abstract String url();

    public abstract String videoId();

    /* JADX INFO: Access modifiers changed from: private */
    public static kwx subtitleTrack(String str, xbe xbeVar, int i) {
        return subtitleTrack(xbeVar.c, xbeVar.f, (int) xbeVar.d, str, xbeVar.e, xbeVar.g, xbeVar.h, i);
    }

    private static kwx subtitleTrack(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, int i2) {
        kwu kwuVarBuilder = builder();
        krf.c(str);
        kwuVarBuilder.f(str);
        kwuVarBuilder.g(str2);
        kwuVarBuilder.c(i);
        kwuVarBuilder.i(str3);
        kwuVarBuilder.h(str4);
        kwuVarBuilder.e(z);
        kwuVarBuilder.d(z2);
        kwuVarBuilder.b(i2);
        return kwuVarBuilder.a();
    }

    public static kwx subtitleTrack(String str, String str2, String str3, int i, String str4, boolean z, boolean z2) {
        krf.c(str3);
        kwu kwuVarBuilder = builder();
        kwuVarBuilder.f(str);
        kwuVarBuilder.g(str2);
        kwuVarBuilder.c(i);
        kwuVarBuilder.i(str3);
        kwuVarBuilder.h(str4);
        kwuVarBuilder.e(z);
        kwuVarBuilder.d(z2);
        return kwuVarBuilder.a();
    }

    public static kwx subtitleTrack(String str, String str2, String str3, int i, boolean z) {
        kwu kwuVarBuilder = builder();
        kwuVarBuilder.f(str);
        kwuVarBuilder.g(str2);
        kwuVarBuilder.i(str3);
        kwuVarBuilder.c(i);
        kwuVarBuilder.e(z);
        return kwuVarBuilder.a();
    }
}
