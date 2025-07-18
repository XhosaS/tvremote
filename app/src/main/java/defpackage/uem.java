package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uem {
    public static final /* synthetic */ int b = 0;
    private static final Pattern c = Pattern.compile("[a-z]+(_[a-z]+)*");
    static final Account a = ueh.a;
    private static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    private static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    public static void a(String str) {
        Set set = e;
        ugg.a(set.contains(str), "The only supported locations are %s: %s", set, str);
    }

    public static void b(String str) {
        ugg.a(c.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        ugg.a(!d.contains(str), "Module name is reserved and cannot be used: %s", str);
    }
}
