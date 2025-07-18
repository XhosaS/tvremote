package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjs {
    public String a;
    private String c = "files";
    private String d = "common";
    public Account b = sjt.b;
    private String e = "";
    private final ImmutableList.Builder f = ImmutableList.builder();

    public sjs(Context context) {
        sij.c(true, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.c + "/" + this.d + "/" + sjq.a(this.b) + "/" + this.e).encodedFragment(skk.a(this.f.build())).build();
    }

    public final void b() {
        c("directboot-files");
    }

    public final void c(String str) {
        Set set = sjt.d;
        sij.c(set.contains(str), "The only supported locations are %s: %s", set, str);
        this.c = str;
    }

    public final void d(String str) {
        sij.c(sjt.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        sij.c(!sjt.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = sjt.a;
        this.e = str;
    }
}
