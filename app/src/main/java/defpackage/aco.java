package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.katniss.R;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aco {
    private static final ThreadLocal c = new ThreadLocal();
    public static final WeakHashMap a = new WeakHashMap(0);
    public static final Object b = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return d(context, i, new TypedValue(), 0, null, false);
    }

    public static TypedValue b() {
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static float c(Resources resources) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return resources.getFloat(R.dimen.transition_max_opacity);
        }
        TypedValue typedValueB = b();
        resources.getValue(R.dimen.transition_max_opacity, typedValueB, true);
        if (typedValueB.type == 4) {
            return typedValueB.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(R.dimen.transition_max_opacity) + " type #0x" + Integer.toHexString(typedValueB.type) + " is not valid");
    }

    public static Typeface d(Context context, int i, TypedValue typedValue, int i2, acm acmVar, boolean z) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceE = e(context, resources, typedValue, i, i2, acmVar, z);
        if (typefaceE != null || acmVar != null) {
            return typefaceE;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193 A[Catch: IOException -> 0x0307, XmlPullParserException -> 0x0309, TryCatch #10 {IOException -> 0x0307, XmlPullParserException -> 0x0309, blocks: (B:28:0x0086, B:32:0x00ac, B:34:0x00b3, B:35:0x00b7, B:37:0x00bd, B:39:0x00c7, B:82:0x0193, B:84:0x019c, B:86:0x01a0, B:88:0x01a6, B:90:0x01ac, B:93:0x01b3, B:95:0x01c0, B:100:0x01cc, B:103:0x01d2, B:111:0x01df, B:113:0x01e3, B:115:0x01f0, B:117:0x020f, B:119:0x021b, B:121:0x0222, B:123:0x023d, B:159:0x02fd, B:125:0x0249, B:126:0x0258, B:127:0x025d, B:129:0x026c, B:130:0x0276, B:131:0x027d, B:132:0x027e, B:134:0x028d, B:135:0x0296, B:136:0x029d, B:144:0x02bb, B:146:0x02cd, B:148:0x02dc, B:147:0x02d7, B:152:0x02e7, B:116:0x0202, B:153:0x02e8, B:156:0x02f4, B:157:0x02f8, B:40:0x00d7, B:41:0x00dc, B:43:0x00e3, B:45:0x00ea, B:47:0x00f6, B:50:0x010a, B:54:0x011a, B:58:0x0126, B:61:0x012f, B:65:0x0138, B:69:0x014b, B:70:0x0156, B:72:0x015d, B:73:0x0161, B:74:0x016d, B:75:0x0174, B:78:0x017b, B:79:0x018a), top: B:199:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0 A[Catch: IOException -> 0x0307, XmlPullParserException -> 0x0309, TryCatch #10 {IOException -> 0x0307, XmlPullParserException -> 0x0309, blocks: (B:28:0x0086, B:32:0x00ac, B:34:0x00b3, B:35:0x00b7, B:37:0x00bd, B:39:0x00c7, B:82:0x0193, B:84:0x019c, B:86:0x01a0, B:88:0x01a6, B:90:0x01ac, B:93:0x01b3, B:95:0x01c0, B:100:0x01cc, B:103:0x01d2, B:111:0x01df, B:113:0x01e3, B:115:0x01f0, B:117:0x020f, B:119:0x021b, B:121:0x0222, B:123:0x023d, B:159:0x02fd, B:125:0x0249, B:126:0x0258, B:127:0x025d, B:129:0x026c, B:130:0x0276, B:131:0x027d, B:132:0x027e, B:134:0x028d, B:135:0x0296, B:136:0x029d, B:144:0x02bb, B:146:0x02cd, B:148:0x02dc, B:147:0x02d7, B:152:0x02e7, B:116:0x0202, B:153:0x02e8, B:156:0x02f4, B:157:0x02f8, B:40:0x00d7, B:41:0x00dc, B:43:0x00e3, B:45:0x00ea, B:47:0x00f6, B:50:0x010a, B:54:0x011a, B:58:0x0126, B:61:0x012f, B:65:0x0138, B:69:0x014b, B:70:0x0156, B:72:0x015d, B:73:0x0161, B:74:0x016d, B:75:0x0174, B:78:0x017b, B:79:0x018a), top: B:199:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface e(android.content.Context r32, android.content.res.Resources r33, android.util.TypedValue r34, int r35, int r36, defpackage.acm r37, boolean r38) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aco.e(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, acm, boolean):android.graphics.Typeface");
    }
}
