package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uel {
    public String a;
    private final Context e;
    private final yyf g;
    public String b = "files";
    public String c = "common";
    public Account d = uem.a;
    private String f = "";

    public uel(Context context) {
        int i = yyk.e;
        this.g = new yyf(4);
        ugg.a(context != null, "Context cannot be null", new Object[0]);
        this.e = context;
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.b + "/" + this.c + "/" + ueh.b(this.d) + "/" + this.f).encodedFragment(ugf.a(this.g.f())).build();
    }

    public final void b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int i = uem.b;
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r8, defpackage.uey r9) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uel.c(java.lang.String, uey):void");
    }
}
