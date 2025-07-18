package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bep {
    private final String a;
    private String b = "files";
    private String c = "common";
    private final Account d = beq.b;
    private String e = "";
    private final bzo f;

    public bep(Context context) {
        int i = bzs.d;
        this.f = new bzo();
        tk.f(true, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        String str;
        String str2 = this.b;
        String str3 = this.c;
        Account account = ben.a;
        Account account2 = this.d;
        tk.f(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        tk.f(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        tk.f(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ben.a(account2)) {
            str = "shared";
        } else {
            str = account2.type + ":" + account2.name;
        }
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + str2 + "/" + str3 + "/" + str + "/" + this.e).encodedFragment(bfb.a(this.f.f())).build();
    }

    public final void b() {
        Set set = beq.d;
        tk.f(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        this.b = "directboot-files";
    }

    public final void c(String str) {
        tk.f(beq.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        tk.f(!beq.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public final void d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = beq.a;
        this.e = str;
    }
}
