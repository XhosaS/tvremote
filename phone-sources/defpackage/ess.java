package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ess {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public int k;
    public int l;
    public float m;

    public ess(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.h = z2;
        this.e = z3;
        this.f = z4;
        this.i = z5;
        this.j = eae.p(str2);
        this.m = -3.4028235E38f;
        this.k = -1;
        this.l = -1;
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(edt.c(i, widthAlignment) * widthAlignment, edt.c(i2, heightAlignment) * heightAlignment);
    }

    public static ess j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str6;
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface") || Build.MANUFACTURER.equals("Xiaomi") || Build.MANUFACTURER.equals("OPPO") || Build.MANUFACTURER.equals("realme")) {
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z3 = z;
            z4 = z2;
            z5 = false;
            str6 = str2;
        } else {
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z3 = z;
            z4 = z2;
            z5 = true;
            str4 = str;
        }
        return new ess(str4, str6, str5, codecCapabilities2, z3, z4, z6, z7, z5);
    }

    private final void k(String str) {
        edb.g("NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + edt.a + "]");
    }

    private static boolean l(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public final ehx b(dze dzeVar, dze dzeVar2) {
        dze dzeVar3;
        dze dzeVar4;
        int i;
        int i2 = true != Objects.equals(dzeVar.Y, dzeVar2.Y) ? 8 : 0;
        if (this.j) {
            if (dzeVar.ak != dzeVar2.ak) {
                i2 |= 1024;
            }
            boolean z = (dzeVar.af == dzeVar2.af && dzeVar.ag == dzeVar2.ag) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            dyt dytVar = dzeVar.ao;
            if ((!dyt.h(dytVar) || !dyt.h(dzeVar2.ao)) && !Objects.equals(dytVar, dzeVar2.ao)) {
                i2 |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            String str = this.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !dzeVar.g(dzeVar2)) {
                i2 |= 2;
            }
            int i3 = dzeVar.ah;
            if (i3 != -1 && (i = dzeVar.ai) != -1 && i3 == dzeVar2.ah && i == dzeVar2.ai && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new ehx(str, dzeVar, dzeVar2, true != dzeVar.g(dzeVar2) ? 2 : 3, 0);
            }
            dzeVar3 = dzeVar;
            dzeVar4 = dzeVar2;
        } else {
            dzeVar3 = dzeVar;
            dzeVar4 = dzeVar2;
            if (dzeVar3.aq != dzeVar4.aq) {
                i2 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (dzeVar3.ar != dzeVar4.ar) {
                i2 |= 8192;
            }
            if (dzeVar3.as != dzeVar4.as) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                int i4 = ete.a;
                Pair pairA = eco.a(dzeVar3);
                Pair pairA2 = eco.a(dzeVar4);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ehx(this.a, dzeVar3, dzeVar4, 3, 0);
                    }
                }
            }
            if (!dzeVar3.g(dzeVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new ehx(this.a, dzeVar3, dzeVar4, 1, 0);
            }
        }
        return new ehx(this.a, dzeVar3, dzeVar4, 0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        if (r3.equals("video/hevc") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.dze r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ess.c(dze, boolean):boolean");
    }

    public final boolean d(dze dzeVar) {
        return (Objects.equals(dzeVar.Y, "audio/flac") && dzeVar.as == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(dze dzeVar) {
        int i;
        if (!f(dzeVar) || !c(dzeVar, true) || !d(dzeVar)) {
            return false;
        }
        if (this.j) {
            int i2 = dzeVar.af;
            if (i2 <= 0 || (i = dzeVar.ag) <= 0) {
                return true;
            }
            return h(i2, i, dzeVar.aj);
        }
        int i3 = dzeVar.ar;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                k("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                k("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                k(a.cf(i3, "sampleRate.support, "));
                return false;
            }
        }
        int i4 = dzeVar.aq;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                k("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                k("channelCount.aCaps");
                return false;
            }
            String str = this.a;
            String str2 = this.b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                edb.e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i5 + "]");
                maxInputChannelCount = i5;
            }
            if (maxInputChannelCount < i4) {
                k(a.cf(i4, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean f(dze dzeVar) {
        String str = this.b;
        return str.equals(dzeVar.Y) || str.equals(ete.c(dzeVar));
    }

    public final boolean g(dze dzeVar) {
        if (this.j) {
            return this.e;
        }
        int i = ete.a;
        Pair pairA = eco.a(dzeVar);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r10, int r11, double r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ess.h(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.a;
    }
}
