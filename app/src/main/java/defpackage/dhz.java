package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhz implements dhe {
    private final dhe a;

    public dhz(dhe dheVar) {
        this.a = dheVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Uri uriC;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriC = null;
        } else if (str.charAt(0) == '/') {
            uriC = c(str);
        } else {
            Uri uri = Uri.parse(str);
            uriC = uri.getScheme() == null ? c(str) : uri;
        }
        if (uriC != null) {
            dhe dheVar = this.a;
            if (dheVar.b(uriC)) {
                return dheVar.a(uriC, i, i2, danVar);
            }
        }
        return null;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
