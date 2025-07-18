package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhp {
    public String a;
    public String b;
    private final String c;
    private final String d;
    private final String e = "";
    private final String f;
    private Throwable g;

    public lhp(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    public static lhp a(Throwable th) {
        lhp lhpVar = new lhp("", "unknown", "");
        lhpVar.g = th;
        return lhpVar;
    }

    final void b(ody odyVar) {
        odyVar.c = "com.google.android.videos.USER_INITIATED_FEEDBACK_REPORT";
        odyVar.c("page", this.d);
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            odyVar.b = str;
        }
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2)) {
            odyVar.b("client-token", str2);
        }
        String str3 = this.f;
        if (!TextUtils.isEmpty(str3)) {
            odyVar.b("server-token", str3);
        }
        if (!TextUtils.isEmpty(this.a)) {
            odyVar.c("asset_id", this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            odyVar.c("mid", this.b);
        }
        Throwable th = this.g;
        if (th != null) {
            String string = th.toString();
            if (this.g.getCause() != null) {
                string = string + "\n" + String.valueOf(this.g.getCause());
            }
            odyVar.c("error", string);
        }
    }
}
