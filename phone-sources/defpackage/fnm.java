package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnm {
    public static final /* synthetic */ int a = 0;

    static {
        ImmutableSet.of("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static int a(dyo dyoVar) {
        fre frgVar = Build.VERSION.SDK_INT >= 26 ? new frg() : new fre();
        int i = dyoVar.g;
        AudioAttributes.Builder builder = frgVar.a;
        builder.setContentType(i);
        builder.setFlags(dyoVar.h);
        frgVar.b(dyoVar.i);
        frf frfVar = fus.u(frgVar).a;
        AudioAttributes audioAttributes = frfVar.a;
        audioAttributes.getClass();
        int flags = audioAttributes.getFlags();
        AudioAttributes audioAttributes2 = frfVar.a;
        audioAttributes2.getClass();
        int i2 = flags & 1;
        int usage = audioAttributes2.getUsage();
        if (i2 == 1) {
            return 7;
        }
        if ((flags & 4) == 4) {
            return 6;
        }
        switch (usage) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int b(eaq eaqVar) {
        if (eaqVar instanceof dzh) {
            return 1;
        }
        if (eaqVar instanceof eat) {
            return 2;
        }
        if (!(eaqVar instanceof ear)) {
            return eaqVar instanceof eag ? 6 : 0;
        }
        int i = ((ear) eaqVar).c;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static long c(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(a.cf(i, "Unrecognized FolderType: "));
        }
    }

    public static long d(int i) {
        if (i == -1) {
            return -1L;
        }
        return i;
    }

    public static eaq e(fsm fsmVar) {
        if (fsmVar == null) {
            return null;
        }
        switch (fsmVar.a) {
            case 1:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
            case 4:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
            case 5:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
            case 6:
                if (!fsmVar.i()) {
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public static frt f(eab eabVar, String str, Uri uri, long j, Bitmap bitmap) {
        Bundle bundle = new Bundle();
        fus.r("android.media.metadata.MEDIA_ID", str, bundle);
        CharSequence charSequence = eabVar.b;
        if (charSequence != null) {
            fus.s("android.media.metadata.TITLE", charSequence, bundle);
        }
        CharSequence charSequence2 = eabVar.f;
        if (charSequence2 != null) {
            fus.s("android.media.metadata.DISPLAY_TITLE", charSequence2, bundle);
        }
        CharSequence charSequence3 = eabVar.g;
        if (charSequence3 != null) {
            fus.s("android.media.metadata.DISPLAY_SUBTITLE", charSequence3, bundle);
        }
        CharSequence charSequence4 = eabVar.h;
        if (charSequence4 != null) {
            fus.s("android.media.metadata.DISPLAY_DESCRIPTION", charSequence4, bundle);
        }
        CharSequence charSequence5 = eabVar.c;
        if (charSequence5 != null) {
            fus.s("android.media.metadata.ARTIST", charSequence5, bundle);
        }
        CharSequence charSequence6 = eabVar.d;
        if (charSequence6 != null) {
            fus.s("android.media.metadata.ALBUM", charSequence6, bundle);
        }
        CharSequence charSequence7 = eabVar.e;
        if (charSequence7 != null) {
            fus.s("android.media.metadata.ALBUM_ARTIST", charSequence7, bundle);
        }
        if (eabVar.u != null) {
            fus.p("android.media.metadata.YEAR", r4.intValue(), bundle);
        }
        if (uri != null) {
            fus.r("android.media.metadata.MEDIA_URI", uri.toString(), bundle);
        }
        Uri uri2 = eabVar.n;
        if (uri2 != null) {
            fus.r("android.media.metadata.DISPLAY_ICON_URI", uri2.toString(), bundle);
            fus.r("android.media.metadata.ALBUM_ART_URI", uri2.toString(), bundle);
            fus.r("android.media.metadata.ART_URI", uri2.toString(), bundle);
        }
        if (bitmap != null) {
            fus.o("android.media.metadata.DISPLAY_ICON", bitmap, bundle);
            fus.o("android.media.metadata.ALBUM_ART", bitmap, bundle);
        }
        Integer num = eabVar.q;
        if (num != null && num.intValue() != -1) {
            fus.p("android.media.metadata.BT_FOLDER_TYPE", c(num.intValue()), bundle);
        }
        if (j == -9223372036854775807L) {
            Long l = eabVar.i;
            j = l != null ? l.longValue() : -9223372036854775807L;
        }
        if (j != -9223372036854775807L) {
            fus.p("android.media.metadata.DURATION", j, bundle);
        }
        fsm fsmVarG = g(eabVar.j);
        if (fsmVarG != null) {
            fus.q("android.media.metadata.USER_RATING", fsmVarG, bundle);
        }
        fsm fsmVarG2 = g(eabVar.k);
        if (fsmVarG2 != null) {
            fus.q("android.media.metadata.RATING", fsmVarG2, bundle);
        }
        if (eabVar.I != null) {
            fus.p("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r4.intValue(), bundle);
        }
        Bundle bundle2 = eabVar.J;
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    fus.s(str2, (CharSequence) obj, bundle);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    fus.p(str2, ((Number) obj).longValue(), bundle);
                }
            }
        }
        return new frt(bundle);
    }

    public static fsm g(eaq eaqVar) {
        if (eaqVar == null) {
            return null;
        }
        int iB = b(eaqVar);
        if (!eaqVar.b()) {
            return fsm.g(iB);
        }
        switch (iB) {
            case 1:
                return fsm.c(((dzh) eaqVar).c);
            case 2:
                return fsm.f(((eat) eaqVar).c);
            case 3:
            case 4:
            case 5:
                return fsm.e(iB, ((ear) eaqVar).e);
            case 6:
                return fsm.d(((eag) eaqVar).b);
            default:
                return null;
        }
    }
}
