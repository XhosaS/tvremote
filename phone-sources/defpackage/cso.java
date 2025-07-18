package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cso {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, csm csmVar, boolean z, boolean z2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceC = c(context, resources, typedValue, i, i2, csmVar, z, z2);
        if (typefaceC != null || csmVar != null || z2) {
            return typefaceC;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0283 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195 A[Catch: IOException -> 0x025c, XmlPullParserException -> 0x026c, TryCatch #3 {IOException -> 0x025c, XmlPullParserException -> 0x026c, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:31:0x00af, B:33:0x00b6, B:34:0x00ba, B:36:0x00c0, B:38:0x00ca, B:81:0x0195, B:83:0x019c, B:86:0x01a4, B:88:0x01aa, B:90:0x01b0, B:93:0x01b7, B:95:0x01c4, B:100:0x01cf, B:103:0x01d6, B:110:0x01e2, B:112:0x01e6, B:114:0x01f6, B:116:0x0215, B:123:0x0237, B:115:0x0208, B:117:0x021d, B:120:0x022b, B:121:0x0230, B:39:0x00da, B:40:0x00df, B:42:0x00e6, B:44:0x00ed, B:46:0x00f9, B:49:0x010d, B:53:0x011d, B:57:0x0129, B:60:0x0132, B:64:0x013b, B:68:0x014e, B:69:0x0159, B:71:0x0160, B:72:0x0164, B:73:0x0170, B:74:0x0177, B:77:0x017e, B:78:0x018d, B:125:0x023f), top: B:151:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4 A[Catch: IOException -> 0x025c, XmlPullParserException -> 0x026c, TryCatch #3 {IOException -> 0x025c, XmlPullParserException -> 0x026c, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:31:0x00af, B:33:0x00b6, B:34:0x00ba, B:36:0x00c0, B:38:0x00ca, B:81:0x0195, B:83:0x019c, B:86:0x01a4, B:88:0x01aa, B:90:0x01b0, B:93:0x01b7, B:95:0x01c4, B:100:0x01cf, B:103:0x01d6, B:110:0x01e2, B:112:0x01e6, B:114:0x01f6, B:116:0x0215, B:123:0x0237, B:115:0x0208, B:117:0x021d, B:120:0x022b, B:121:0x0230, B:39:0x00da, B:40:0x00df, B:42:0x00e6, B:44:0x00ed, B:46:0x00f9, B:49:0x010d, B:53:0x011d, B:57:0x0129, B:60:0x0132, B:64:0x013b, B:68:0x014e, B:69:0x0159, B:71:0x0160, B:72:0x0164, B:73:0x0170, B:74:0x0177, B:77:0x017e, B:78:0x018d, B:125:0x023f), top: B:151:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface c(android.content.Context r33, android.content.res.Resources r34, android.util.TypedValue r35, int r36, int r37, defpackage.csm r38, boolean r39, boolean r40) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cso.c(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, csm, boolean, boolean):android.graphics.Typeface");
    }
}
