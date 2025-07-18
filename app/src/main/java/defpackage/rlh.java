package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlh {
    public static final rlh a = new rlh();
    public final String b;

    private rlh() {
        this.b = "";
    }

    public static boolean a(String str) {
        return "com.google".equals(str) || "com.google.work".equals(str) || "cn.google".equals(str) || "__logged_out_type".equals(str);
    }

    public rlh(Account account) {
        String str = account.type;
        yqw.R(a(str), "Unexpected Account type %s, only Google accounts are supported.", str);
        this.b = account.name;
        String str2 = account.type;
    }
}
