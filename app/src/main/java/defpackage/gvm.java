package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvm extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ gvn c;
    final /* synthetic */ Account d;
    final /* synthetic */ String e;
    final /* synthetic */ gvj f;
    final /* synthetic */ yrn g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvm(Duration duration, gvn gvnVar, Account account, String str, gvj gvjVar, yrn yrnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = gvnVar;
        this.d = account;
        this.e = str;
        this.f = gvjVar;
        this.g = yrnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gvm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                Duration duration = this.b;
                gvl gvlVar = new gvl(this.c, this.d, null);
                this.a = 1;
                obj = zty.b(duration, gvlVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (String) obj;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        gvn gvnVar = this.c;
        String str = this.e;
        gvj gvjVar = this.f;
        yrn yrnVar = this.g;
        if (agpk.b(objA)) {
            String str2 = (String) objA;
            if (str2 == null || str2.length() == 0) {
                gvw gvwVar = gvw.c;
                gvnVar.b(gvwVar, str);
                gvjVar.a(gvwVar);
            } else {
                yrnVar.f();
                ghr ghrVar = gvnVar.c;
                Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
                durationOfNanos.getClass();
                ghrVar.n(str, "GET_TOKEN_DETAILS", durationOfNanos);
                ((zdv) gvn.a.b().q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 79, "AuthTokenCheckerImpl.kt")).u("Auth check succeed.");
                ghrVar.ab("GET_TOKEN_DETAILS", str, 2, "");
                gvjVar.c();
            }
        }
        Throwable thA = agpk.a(objA);
        if (thA != null) {
            if (thA instanceof ahem) {
                ((zdv) ((zdv) gvn.a.d()).p(thA).q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 87, "AuthTokenCheckerImpl.kt")).u("Auth check cancelled by timeout.");
                gvw gvwVar2 = gvw.e;
                gvnVar.b(gvwVar2, str);
                gvjVar.a(gvwVar2);
            } else if (thA instanceof InterruptedException) {
                ((zdv) ((zdv) gvn.a.d()).p(thA).q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 92, "AuthTokenCheckerImpl.kt")).u("Auth check failed due to InterruptedException.");
                gvw gvwVar3 = gvw.f;
                gvnVar.b(gvwVar3, str);
                gvjVar.a(gvwVar3);
            } else if (thA instanceof IOException) {
                ((zdv) ((zdv) gvn.a.d()).p(thA).q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 97, "AuthTokenCheckerImpl.kt")).u("Auth check failed due to IOException.");
                gvw gvwVar4 = gvw.d;
                gvnVar.b(gvwVar4, str);
                gvjVar.a(gvwVar4);
            } else if (thA instanceof UserRecoverableAuthException) {
                ((zdv) ((zdv) gvn.a.b()).p(thA).q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 102, "AuthTokenCheckerImpl.kt")).u("Adding user recoverable auth bubble.");
                gvw gvwVar5 = gvw.b;
                gvnVar.b(gvwVar5, str);
                Intent intentA = ((UserRecoverableAuthException) thA).a();
                if (intentA != null) {
                    gvjVar.b(intentA);
                } else {
                    gvjVar.a(gvwVar5);
                }
            } else {
                ((zdv) ((zdv) gvn.a.d()).p(thA).q("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl$checkAuthStatus$1", "invokeSuspend", 112, "AuthTokenCheckerImpl.kt")).u("Auth check failed due to unexpected exception.");
                gvw gvwVar6 = gvw.c;
                gvnVar.b(gvwVar6, str);
                gvjVar.a(gvwVar6);
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gvm gvmVar = new gvm(this.b, this.c, this.d, this.e, this.f, this.g, agswVar);
        gvmVar.h = obj;
        return gvmVar;
    }
}
