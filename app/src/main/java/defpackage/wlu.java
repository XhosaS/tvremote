package defpackage;

import android.accounts.Account;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;
import com.google.apps.tiktok.account.AccountId;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlu extends wlm {
    public static final /* synthetic */ int e = 0;
    public final jwr c;
    public final wln d;
    private final wx g = new wx(0);
    private final zyg h;
    private final zyg i;
    private final vjo j;
    static final Duration a = Duration.ofMinutes(5);
    static final Duration b = Duration.ofHours(1);
    private static final udn f = new udn("");

    public wlu(zyg zygVar, zyg zygVar2, jwr jwrVar, wln wlnVar, vjo vjoVar) {
        this.h = zygVar;
        this.i = zygVar2;
        this.c = jwrVar;
        this.d = wlnVar;
        this.j = vjoVar;
    }

    private final wll c(zyd zydVar) {
        try {
            return (wll) zxn.o(zydVar);
        } catch (ExecutionException unused) {
            return null;
        }
    }

    private final synchronized zyd d(final String str) {
        wll wllVarC;
        wx wxVar = this.g;
        zyd zydVar = (zyd) wxVar.get(str);
        if (zydVar == null) {
            wllVarC = null;
        } else {
            if (!zydVar.isDone()) {
                return zydVar;
            }
            wllVarC = c(zydVar);
        }
        wzx wzxVarG = wzx.g(zxn.h(wllVarC));
        zvi zviVar = new zvi() { // from class: wlo
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                wll wllVar = (wll) obj;
                if (wllVar == null) {
                    return zxy.a;
                }
                wlu wluVar = this.a;
                return otn.a(wluVar.c.a(wllVar.a));
            }
        };
        zyg zygVar = this.h;
        wzx wzxVarE = wzxVarG.i(zviVar, zygVar).i(new zvi() { // from class: wlp
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                lvf lvfVarB;
                TokenData tokenDataI;
                Long l;
                List list;
                String str2 = str;
                final Instant instantNow = Instant.now();
                Account account = new Account(str2, "com.google");
                wlu wluVar = this.a;
                String strA = wluVar.d.a();
                jwr jwrVar = wluVar.c;
                try {
                    jxx jxxVar = (jxx) ((jwt) jwrVar).b.eV();
                    Context context = ((jwt) jwrVar).a;
                    Bundle bundle = new Bundle();
                    String packageName = context.getPackageName();
                    jxk jxkVar = jxxVar.b;
                    if (jxy.d(packageName, jxkVar)) {
                        try {
                            String str3 = account.name;
                            String str4 = jwk.a;
                            if (TextUtils.isEmpty(jwq.a(context, str3))) {
                                throw new IOException("Could not fetch gaia id for account.");
                            }
                            GetTokenResponse getTokenResponse = (GetTokenResponse) lvq.d(jxkVar.b(jxy.a(account, strA, jxkVar, bundle).k()));
                            String str5 = getTokenResponse.a;
                            Oauth2TokenMetadata oauth2TokenMetadata = getTokenResponse.b;
                            if (oauth2TokenMetadata != null) {
                                Long l2 = oauth2TokenMetadata.a;
                                list = oauth2TokenMetadata.b;
                                l = l2;
                            } else {
                                l = null;
                                list = null;
                            }
                            tokenDataI = TextUtils.isEmpty(str5) ? null : new TokenData(1, str5, l, false, false, list, null);
                            if (tokenDataI == null) {
                                throw new IOException("Token is null");
                            }
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            throw new IOException(e2);
                        } catch (ExecutionException e3) {
                            jxy.b(e3, "Unexpected exception while fetching token.");
                            String str6 = jwk.a;
                            tokenDataI = jwq.i(context, account, strA, bundle, null);
                        }
                    } else {
                        String str7 = jwk.a;
                        tokenDataI = jwq.i(context, account, strA, bundle, null);
                    }
                    lvfVarB = lvq.c(tokenDataI);
                } catch (IOException | jwj e4) {
                    lvfVarB = lvq.b(e4);
                }
                return zuz.g(otn.a(lvfVarB), wyo.a(new yqi() { // from class: wlt
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        TokenData tokenData = (TokenData) obj2;
                        String str8 = tokenData.b;
                        Long l3 = tokenData.c;
                        int i = wlu.e;
                        return new wll(str8, instantNow, (Instant) Optional.ofNullable(l3).map(new Function() { // from class: wlr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo116andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Instant.ofEpochSecond(((Long) obj3).longValue());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(null));
                    }
                }), zwk.a);
            }
        }, zygVar).e(IOException.class, new zvi() { // from class: wlq
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                int i = wlu.e;
                return zxn.g(new NetworkErrorException("Can't get auth token.", (IOException) obj));
            }
        }, zwk.a);
        wxVar.put(str, wzxVarE);
        return wzxVarE;
    }

    @Override // defpackage.wlm
    public final zyd a(final AccountId accountId) {
        String str = f.a;
        return !str.isEmpty() ? zxn.h(new wll(str, Instant.now(), null)) : zxn.i(zuz.h(this.j.b(accountId), wyo.c(new zvi() { // from class: wls
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                String str2 = (String) obj;
                return str2 != null ? this.a.b(str2) : zxn.g(new IllegalStateException("Cannot get auth token for account id: ".concat(accountId.toString())));
            }
        }), this.i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (j$.time.Duration.between(r1.b, j$.time.Instant.now()).compareTo(defpackage.wlu.b.minus(defpackage.wlu.a)) < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.zyd b(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            wx r0 = r4.g     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L4d
            zyd r0 = (defpackage.zyd) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L47
            boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L12
            goto L45
        L12:
            wll r1 = r4.c(r0)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L47
            j$.time.Instant r2 = r1.c     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L2d
            j$.time.Instant r1 = j$.time.Instant.now()     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r2 = defpackage.wlu.a     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L4d
            if (r1 > 0) goto L45
            goto L47
        L2d:
            j$.time.Instant r1 = r1.b     // Catch: java.lang.Throwable -> L4d
            j$.time.Instant r2 = j$.time.Instant.now()     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r2 = defpackage.wlu.b     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r3 = defpackage.wlu.a     // Catch: java.lang.Throwable -> L4d
            j$.time.Duration r2 = r2.minus(r3)     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L4d
            if (r1 >= 0) goto L47
        L45:
            monitor-exit(r4)
            return r0
        L47:
            zyd r5 = r4.d(r5)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r4)
            return r5
        L4d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlu.b(java.lang.String):zyd");
    }
}
