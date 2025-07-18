package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pae {
    public static String a(String str, String str2) {
        return String.format("%s_%s", str, str2);
    }

    public static void b(String str) {
        Pattern.compile(str.concat("_.*"));
    }
}
