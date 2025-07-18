package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuq {
    private static final Pattern a = Pattern.compile(String.format("^%s", "((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z]|-testonly)?\\.((ggpht)|(googleusercontent)|(google)|(sandbox\\.google)))|(lh7\\-(eu|us)\\.googleusercontent)|((photos|work)\\.fife\\.usercontent\\.google)|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|(ccp-lh\\.googleusercontent)|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(play-(ti-)?lh\\.googleusercontent)|(gz0\\.googleusercontent)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|(photos\\-image\\-(dev|qa)(-auth)?\\.corp\\.google\\.com)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-(dev|qa)\\-lighthouse(-auth)?\\.sandbox\\.google\\.com(\\/image)?))\\/"));

    public static Uri a(String str, Uri uri) {
        return !c(uri.toString()) ? uri : d(str, uri);
    }

    public static String b(String str, String str2) {
        return !c(str2) ? str2 : d(str, Uri.parse(str2)).toString();
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return a.matcher(str).find();
    }

    private static Uri d(String str, Uri uri) {
        boolean z;
        String string = "/";
        String[] strArrSplit = uri.getPath().split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i])) {
                arrayList.add(strArrSplit[i]);
            }
        }
        int size = arrayList.size();
        boolean z2 = true;
        if (arrayList.size() <= 1 || !((String) arrayList.get(0)).equals("image")) {
            z = false;
        } else {
            arrayList.remove(0);
            size--;
            z = true;
        }
        if (size < 4 || size > 6) {
            if (size != 1) {
                return uri;
            }
            String path = uri.getPath();
            int iIndexOf = path.indexOf(61);
            if (iIndexOf != -1) {
                path = path.substring(0, iIndexOf);
            }
            return uri.buildUpon().path(a.cq(str, path, "=")).build();
        }
        String path2 = uri.getPath();
        int size2 = arrayList.size();
        boolean zEndsWith = path2.endsWith("/");
        if (zEndsWith || size2 != 5) {
            z2 = false;
        } else {
            size2 = 5;
        }
        if (z2) {
            arrayList.add((String) arrayList.get(4));
        }
        if (size2 == 4) {
            arrayList.add(str);
        } else {
            arrayList.set(4, str);
        }
        if (z) {
            arrayList.add(0, "image");
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (zEndsWith) {
                sb.append('/');
            }
            string = sb.toString();
        }
        return builderBuildUpon.path(string).build();
    }
}
