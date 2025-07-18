package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lhv extends lhp {
    public lhv(lih lihVar) {
        super(lihVar);
    }

    private final String f(String str) {
        String strH = ae().h(str);
        if (TextUtils.isEmpty(strH)) {
            return (String) kzg.r.a(null);
        }
        Uri uri = Uri.parse((String) kzg.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strH + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    public final lhu a(String str, boolean z) {
        String strH = ae().h(str);
        if (TextUtils.isEmpty(strH)) {
            return new lhu((String) kzg.s.a(null), Collections.EMPTY_MAP, z ? lex.GOOGLE_SIGNAL_PENDING : lex.GOOGLE_SIGNAL, null);
        }
        Uri uri = Uri.parse((String) kzg.s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strH + "." + uri.getAuthority());
        return new lhu(builderBuildUpon.build().toString(), Collections.EMPTY_MAP, z ? lex.GOOGLE_SIGNAL_PENDING : lex.GOOGLE_SIGNAL, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r3 >= r6.d) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lhu d(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhv.d(java.lang.String):lhu");
    }

    public final boolean e(String str) {
        String str2 = (String) kzg.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }
}
