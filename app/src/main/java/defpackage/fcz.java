package defpackage;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcz {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/cast/info/CastInfoUtilsKt");

    public static final String a(String str) {
        if (str == null) {
            throw new InvalidParameterException("certificatePEM is null!");
        }
        Matcher matcher = new agyu("(-*BEGIN CERTIFICATE-*\\n*)(.|\\n)*?(-*END CERTIFICATE-*\\n*)").a.matcher(str);
        matcher.getClass();
        agys agysVar = !matcher.find(0) ? null : new agys(matcher);
        if (agysVar == null) {
            throw new InvalidParameterException("certificatePEM is invalid!");
        }
        String strGroup = agysVar.a.group();
        strGroup.getClass();
        return new agyu("(\n|-*BEGIN CERTIFICATE-*|-*END CERTIFICATE-*)").a(strGroup, "");
    }

    public static final String b(String str) {
        if (str != null && str.length() != 0) {
            return str.concat("_AS");
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/cast/info/CastInfoUtilsKt", "getDerivedClientInstanceIdOrEmpty", 45, "CastInfoUtils.kt")).u("Invalid castID, cannot create derived key.");
        return "";
    }
}
