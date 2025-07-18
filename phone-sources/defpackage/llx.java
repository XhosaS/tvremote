package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llx {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile(".*?_(neg_|)(\\d+)");

    public static int a(kuz kuzVar, kuz kuzVar2) {
        if (kuzVar == null) {
            return 0;
        }
        int i = kuzVar.a;
        if (kuzVar2 != null) {
            if (kuzVar2.b > kuzVar.b) {
                return kuzVar2.a;
            }
        }
        return i;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public static int c(String str) throws NumberFormatException {
        if (str == null) {
            return -1;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return b(str);
        }
        int i = Integer.parseInt(matcher.group(2));
        return !matcher.group(1).isEmpty() ? -i : i;
    }
}
