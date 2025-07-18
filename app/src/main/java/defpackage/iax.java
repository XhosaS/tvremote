package defpackage;

import android.accounts.Account;
import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface iax {
    int a(Account account);

    int b(Account account);

    int c(Account account);

    yme d(int i);

    ymg e(abvo abvoVar);

    zyd f(Account account, String str);

    Optional g(ymc ymcVar, String str);

    Object h(Account account, yme ymeVar, String str, agsw agswVar);

    Object i(Account account, boolean z, Intent intent, agsw agswVar);

    Object j(Account account, ymg ymgVar, String str, agsw agswVar);

    void k(iaw iawVar);

    void l(Account account, iaw iawVar, int i);

    void m(Account account, yme ymeVar, zxe zxeVar, String str);

    void n(iaw iawVar);

    void o(Account account, ymg ymgVar, zxe zxeVar, String str);

    void p(Account account, String str, yme ymeVar, String str2, zxe zxeVar);

    boolean q();
}
