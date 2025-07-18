package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghr {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }

    public static final void a(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }
}
