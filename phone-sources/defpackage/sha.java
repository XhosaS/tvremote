package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class sha {
    private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    public static String a(int i, int i2, String str) {
        Set<String> setUnmodifiableSet;
        String str2 = str;
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        if (!a.matcher(str2).find()) {
            str3 = str2;
            str2 = "https://images" + b() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        }
        Uri uri = Uri.parse(str2);
        Uri.Builder builderBuildUpon = Uri.EMPTY.buildUpon();
        builderBuildUpon.authority(uri.getAuthority());
        builderBuildUpon.scheme(uri.getScheme());
        builderBuildUpon.path(uri.getPath());
        if (i != -1 && i2 != -1) {
            builderBuildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            builderBuildUpon.appendQueryParameter("resize_h", Integer.toString(i2));
            builderBuildUpon.appendQueryParameter("no_expand", "1");
        }
        builderBuildUpon.appendQueryParameter("fpt", "a7bcfbce29e");
        Uri uriBuild = builderBuildUpon.build();
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            setUnmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            do {
                int iIndexOf = encodedQuery.indexOf(38, i3);
                if (iIndexOf == -1) {
                    iIndexOf = encodedQuery.length();
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i3);
                if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                    iIndexOf2 = iIndexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i3, iIndexOf2)));
                i3 = iIndexOf + 1;
            } while (i3 < encodedQuery.length());
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        }
        for (String str4 : setUnmodifiableSet) {
            if (uriBuild.getQueryParameter(str4) == null) {
                boolean z = true;
                boolean z2 = "resize_w".equals(str4) || "resize_h".equals(str4) || "no_expand".equals(str4);
                if (i != -1 && i2 != -1) {
                    z = false;
                }
                Uri.Builder builderBuildUpon2 = uriBuild.buildUpon();
                if ("url".equals(str4)) {
                    builderBuildUpon2.appendQueryParameter("url", uri.getQueryParameter("url"));
                } else if (!z || !z2) {
                    Iterator<String> it = uri.getQueryParameters(str4).iterator();
                    while (it.hasNext()) {
                        builderBuildUpon2.appendQueryParameter(str4, it.next());
                    }
                }
                uriBuild = builderBuildUpon2.build();
            }
        }
        if (str3 != null && uriBuild.getQueryParameter("url") == null) {
            Uri.Builder builderBuildUpon3 = uriBuild.buildUpon();
            builderBuildUpon3.appendQueryParameter("url", str3);
            uriBuild = builderBuildUpon3.build();
        }
        if (uriBuild.getQueryParameter("container") == null) {
            Uri.Builder builderBuildUpon4 = uriBuild.buildUpon();
            builderBuildUpon4.appendQueryParameter("container", "esmobile");
            uriBuild = builderBuildUpon4.build();
        }
        if (uriBuild.getQueryParameter("gadget") == null) {
            Uri.Builder builderBuildUpon5 = uriBuild.buildUpon();
            builderBuildUpon5.appendQueryParameter("gadget", "a");
            uriBuild = builderBuildUpon5.build();
        }
        if (uriBuild.getQueryParameter("rewriteMime") == null) {
            Uri.Builder builderBuildUpon6 = uriBuild.buildUpon();
            builderBuildUpon6.appendQueryParameter("rewriteMime", "image/*");
            uriBuild = builderBuildUpon6.build();
        }
        return uriBuild.toString();
    }

    private static synchronized int b() {
        int i;
        i = b + 1;
        b = i % 3;
        return i;
    }
}
