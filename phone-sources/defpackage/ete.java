package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ete {
    private static final HashMap b = new HashMap();
    public static int a = -1;

    public static ess a(String str, boolean z, boolean z2) {
        List listD = d(str, z, z2);
        if (listD.isEmpty()) {
            return null;
        }
        return (ess) listD.get(0);
    }

    public static ess b() {
        return a("audio/raw", false, false);
    }

    public static String c(dze dzeVar) {
        Pair pairA;
        String str = dzeVar.Y;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairA = eco.a(dzeVar)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123 A[Catch: Exception -> 0x0182, all -> 0x0220, PHI: r11
  0x0123: PHI (r11v4 boolean) = (r11v3 boolean), (r11v6 boolean) binds: [B:70:0x011e, B:72:0x0122] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:12:0x0038, B:14:0x0047, B:17:0x004f, B:19:0x005a, B:21:0x0062, B:61:0x00f1, B:67:0x010c, B:73:0x0123, B:75:0x0129, B:80:0x013e, B:83:0x014a, B:91:0x0171, B:101:0x0184, B:102:0x0193, B:84:0x014e, B:86:0x015e, B:88:0x0166, B:76:0x0131, B:24:0x006c, B:25:0x0070, B:27:0x0079, B:30:0x0085, B:32:0x008d, B:35:0x0098, B:37:0x00a0, B:39:0x00a8, B:44:0x00b6, B:46:0x00be, B:49:0x00c9, B:51:0x00d1, B:54:0x00dc, B:56:0x00e4, B:105:0x019c, B:106:0x019f, B:108:0x01a7, B:110:0x01ad, B:112:0x01b7, B:114:0x01be, B:116:0x01cf, B:117:0x01df, B:118:0x01e7, B:120:0x01ed, B:122:0x01f4, B:124:0x0205, B:125:0x020e, B:129:0x021a, B:130:0x021f), top: B:134:0x0009, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[Catch: Exception -> 0x0182, all -> 0x0220, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:12:0x0038, B:14:0x0047, B:17:0x004f, B:19:0x005a, B:21:0x0062, B:61:0x00f1, B:67:0x010c, B:73:0x0123, B:75:0x0129, B:80:0x013e, B:83:0x014a, B:91:0x0171, B:101:0x0184, B:102:0x0193, B:84:0x014e, B:86:0x015e, B:88:0x0166, B:76:0x0131, B:24:0x006c, B:25:0x0070, B:27:0x0079, B:30:0x0085, B:32:0x008d, B:35:0x0098, B:37:0x00a0, B:39:0x00a8, B:44:0x00b6, B:46:0x00be, B:49:0x00c9, B:51:0x00d1, B:54:0x00dc, B:56:0x00e4, B:105:0x019c, B:106:0x019f, B:108:0x01a7, B:110:0x01ad, B:112:0x01b7, B:114:0x01be, B:116:0x01cf, B:117:0x01df, B:118:0x01e7, B:120:0x01ed, B:122:0x01f4, B:124:0x0205, B:125:0x020e, B:129:0x021a, B:130:0x021f), top: B:134:0x0009, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131 A[Catch: Exception -> 0x0182, all -> 0x0220, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:12:0x0038, B:14:0x0047, B:17:0x004f, B:19:0x005a, B:21:0x0062, B:61:0x00f1, B:67:0x010c, B:73:0x0123, B:75:0x0129, B:80:0x013e, B:83:0x014a, B:91:0x0171, B:101:0x0184, B:102:0x0193, B:84:0x014e, B:86:0x015e, B:88:0x0166, B:76:0x0131, B:24:0x006c, B:25:0x0070, B:27:0x0079, B:30:0x0085, B:32:0x008d, B:35:0x0098, B:37:0x00a0, B:39:0x00a8, B:44:0x00b6, B:46:0x00be, B:49:0x00c9, B:51:0x00d1, B:54:0x00dc, B:56:0x00e4, B:105:0x019c, B:106:0x019f, B:108:0x01a7, B:110:0x01ad, B:112:0x01b7, B:114:0x01be, B:116:0x01cf, B:117:0x01df, B:118:0x01e7, B:120:0x01ed, B:122:0x01f4, B:124:0x0205, B:125:0x020e, B:129:0x021a, B:130:0x021f), top: B:134:0x0009, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e A[Catch: Exception -> 0x017b, all -> 0x0220, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:12:0x0038, B:14:0x0047, B:17:0x004f, B:19:0x005a, B:21:0x0062, B:61:0x00f1, B:67:0x010c, B:73:0x0123, B:75:0x0129, B:80:0x013e, B:83:0x014a, B:91:0x0171, B:101:0x0184, B:102:0x0193, B:84:0x014e, B:86:0x015e, B:88:0x0166, B:76:0x0131, B:24:0x006c, B:25:0x0070, B:27:0x0079, B:30:0x0085, B:32:0x008d, B:35:0x0098, B:37:0x00a0, B:39:0x00a8, B:44:0x00b6, B:46:0x00be, B:49:0x00c9, B:51:0x00d1, B:54:0x00dc, B:56:0x00e4, B:105:0x019c, B:106:0x019f, B:108:0x01a7, B:110:0x01ad, B:112:0x01b7, B:114:0x01be, B:116:0x01cf, B:117:0x01df, B:118:0x01e7, B:120:0x01ed, B:122:0x01f4, B:124:0x0205, B:125:0x020e, B:129:0x021a, B:130:0x021f), top: B:134:0x0009, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.util.List d(java.lang.String r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.d(java.lang.String, boolean, boolean):java.util.List");
    }

    public static List e(List list, final dze dzeVar) {
        ArrayList arrayList = new ArrayList(list);
        f(arrayList, new etd() { // from class: esz
            @Override // defpackage.etd
            public final int a(Object obj) {
                ess essVar = (ess) obj;
                int i = ete.a;
                dze dzeVar2 = dzeVar;
                return (essVar.f(dzeVar2) && essVar.c(dzeVar2, false) && essVar.d(dzeVar2)) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static void f(List list, etd etdVar) {
        Collections.sort(list, new acs(etdVar, 7, null));
    }

    public static void g(String str, boolean z, boolean z2) {
        try {
            d(str, z, z2);
        } catch (etb e) {
            edb.d("MediaCodecUtil", "Codec warming failed", e);
        }
    }

    public static List h(dze dzeVar, boolean z, boolean z2) {
        String strC = c(dzeVar);
        return strC == null ? ImmutableList.of() : d(strC, z, z2);
    }

    public static List i(dze dzeVar, boolean z, boolean z2) {
        List listD = d(dzeVar.Y, z, z2);
        List listH = h(dzeVar, z, z2);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) listD);
        builder.addAll((Iterable) listH);
        return builder.build();
    }

    private static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (eae.l(str)) {
            return true;
        }
        String strJ = sij.J(mediaCodecInfo.getName());
        if (strJ.startsWith("arc.")) {
            return false;
        }
        if (strJ.startsWith("omx.google.") || strJ.startsWith("omx.ffmpeg.") || ((strJ.startsWith("omx.sec.") && strJ.contains(".sw.")) || strJ.equals("omx.qcom.video.decoder.hevcswvdec") || strJ.startsWith("c2.android.") || strJ.startsWith("c2.google."))) {
            return true;
        }
        return (strJ.startsWith("omx.") || strJ.startsWith("c2.")) ? false : true;
    }
}
