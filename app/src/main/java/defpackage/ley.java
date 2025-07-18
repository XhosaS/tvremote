package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ley {
    public static String a(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String b(Context context, String str) {
        kkk.k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = lbc.a(context);
        }
        return lbc.c(resources, str);
    }
}
