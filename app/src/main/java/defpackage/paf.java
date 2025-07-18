package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class paf {
    private static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/util/IdUtils");

    public static String a(abfv abfvVar) {
        if (abfvVar == null) {
            ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/util/IdUtils", "getStableFoyerId", 33, "IdUtils.java")).u("Null device ID found");
            return "";
        }
        if ((abfvVar.b & 1) == 0) {
            return b("", "", abfvVar.c);
        }
        abes abesVar = abfvVar.d;
        if (abesVar == null) {
            abesVar = abes.a;
        }
        return b(abesVar.b, abesVar.c, abfvVar.c);
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && aerk.d().equals(str)) {
            return String.format("cast_id:%s", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            return String.format("hgs_id:%s", str3);
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/home/homegraph/util/IdUtils", "getStableFoyerId", 51, "IdUtils.java")).u("Missing ID for non-Cast device");
        return String.format("non_cast_agent_device_id:%s-%s", str2, str);
    }
}
