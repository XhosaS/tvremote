package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uet {
    public static final Uri a(String str, String str2, long j) throws ufu {
        Uri.Builder builderPath = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        int i = ueu.a;
        if (str.endsWith(".lease") && !ueu.c(str)) {
            builderPath.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri uriBuild = builderPath.build();
        ueu.a(uriBuild);
        ueu.b(uriBuild);
        return uriBuild;
    }
}
