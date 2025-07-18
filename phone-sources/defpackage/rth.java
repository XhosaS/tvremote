package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rth {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private final yfo h;

    static {
        ImmutableSet.of("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        d = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        a = Pattern.compile("([^\\?]+)(\\?+)");
        e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        f = Pattern.compile("([a-zA-Z0-9-_]+)");
        g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public rth(yfo yfoVar) {
        this.h = yfoVar;
    }

    static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zba c(java.lang.Iterable r17) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rth.c(java.lang.Iterable):zba");
    }
}
