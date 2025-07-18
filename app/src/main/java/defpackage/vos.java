package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vos {
    public static final wna a = new wmx(2);
    private final wmy b;
    private final AccountId c;

    public vos(wmy wmyVar, AccountId accountId) {
        this.b = wmyVar;
        this.c = accountId;
        yqw.M(accountId.a() != -1, "Account Id is invalid");
    }

    static String b(AccountId accountId) {
        return "accounts" + File.separator + accountId.a();
    }

    public final voo a(wna wnaVar, String str) {
        return new voo(new wmz(wnaVar, this.b, b(this.c) + File.separator + str));
    }
}
