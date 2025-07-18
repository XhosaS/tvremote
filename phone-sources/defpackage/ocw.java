package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocw {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
