package defpackage;

import android.media.MediaCodecInfo;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvb {
    public static int a = -1;

    public static String a(String str) {
        String strE = ksh.e(str);
        return strE.startsWith("eac3") ? "audio/eac3" : eae.d(strE);
    }

    public static synchronized void b() {
        int i;
        if (a != -1) {
            return;
        }
        a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        try {
            int iMax = ete.a;
            if (iMax == -1) {
                ess essVarA = ete.a("video/avc", false, false);
                if (essVarA != null) {
                    int iMax2 = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : essVarA.i()) {
                        int i2 = codecProfileLevel.level;
                        if (i2 != 1 && i2 != 2) {
                            switch (i2) {
                                case 8:
                                case 16:
                                case 32:
                                    i = 101376;
                                    break;
                                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                    i = 202752;
                                    break;
                                case 128:
                                case 256:
                                    i = 414720;
                                    break;
                                case 512:
                                    i = 921600;
                                    break;
                                case 1024:
                                    i = 1310720;
                                    break;
                                case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                                case RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                    i = 2097152;
                                    break;
                                case 8192:
                                    i = 2228224;
                                    break;
                                case 16384:
                                    i = 5652480;
                                    break;
                                case 32768:
                                case 65536:
                                    i = 9437184;
                                    break;
                                case 131072:
                                case 262144:
                                case 524288:
                                    i = 35651584;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                        } else {
                            i = 25344;
                        }
                        iMax2 = Math.max(i, iMax2);
                    }
                    iMax = Math.max(iMax2, 345600);
                } else {
                    iMax = 0;
                }
                ete.a = iMax;
            }
            a = iMax;
        } catch (etb e) {
            krd.d("Failed to calculate maximum frame size", e);
        }
    }
}
