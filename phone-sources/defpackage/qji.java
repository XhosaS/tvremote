package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.time.Instant;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qji implements qja {
    public static final tvn a = tvn.n("GnpSdk");
    private static final long h = TimeUnit.MINUTES.toMillis(5);
    private static final long i = TimeUnit.HOURS.toMillis(1);
    public final Context b;
    public final yow c;
    public final Map d;
    public final Map e;
    public final yyk f;
    public final yyk g;

    public qji(Context context, osk oskVar, yow yowVar) {
        oskVar.getClass();
        this.b = context;
        this.c = yowVar;
        this.d = new LinkedHashMap();
        this.f = new yyk();
        this.e = new LinkedHashMap();
        this.g = new yyk();
    }

    public static final qdi n(Throwable th, int i2) {
        return th instanceof UserRecoverableAuthException ? new qiy((UserRecoverableAuthException) th, i2) : th instanceof IOException ? new qiz((IOException) th, i2) : new qix(th, i2);
    }

    private final qjc o(Account account, String str) throws Exception {
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        str.getClass();
        String str2 = nhd.a;
        TokenData tokenDataB = nhk.b(this.b, account, str, bundle);
        tokenDataB.getClass();
        String str3 = tokenDataB.b;
        str3.getClass();
        return new qjc(str3, Instant.now().toEpochMilli(), tokenDataB.c);
    }

    private static final boolean p(qjc qjcVar) {
        Long l = qjcVar.c;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) - Instant.now().toEpochMilli() > h : Instant.now().toEpochMilli() - qjcVar.b < i - h;
    }

    @Override // defpackage.qja
    public final /* synthetic */ qdl a(String str) {
        if (xez.b()) {
            return (qdl) ykr.n(yim.a, new pfd(this, str, (yih) null, 13));
        }
        try {
            return new qdn(osk.T(this.b, str));
        } catch (Exception e) {
            return n(e, 61);
        }
    }

    @Override // defpackage.qja
    public final qdl b(String str, String str2) {
        qdl qdlVarH;
        str.getClass();
        synchronized (this.d) {
            qdlVarH = h(str, str2);
        }
        return qdlVarH;
    }

    @Override // defpackage.qja
    public final Object c(String str, yih yihVar) {
        return ykr.l(((ywq) this.c).a, new iyc(this, str, (yih) null, 9), yihVar);
    }

    @Override // defpackage.qja
    public final Object d(String str, String str2, yih yihVar) {
        return ykr.l(((ywq) this.c).a, new qjh(this, str, str2, null), yihVar);
    }

    @Override // defpackage.qja
    public final Object e(String str, yih yihVar) {
        return ykr.l(((ywq) this.c).a, new pfo(this, str, (yih) null, 14), yihVar);
    }

    @Override // defpackage.qja
    public final /* synthetic */ qdl f() {
        if (xez.b()) {
            return (qdl) ykr.n(yim.a, new oza(this, (yih) null, 12));
        }
        try {
            return new qdn(osk.U(this.b));
        } catch (Exception e) {
            return n(e, 60);
        }
    }

    @Override // defpackage.qja
    public final /* synthetic */ qdl g(String str) {
        return xez.b() ? (qdl) ykr.n(yim.a, new pfo((qja) this, str, (yih) null, 13)) : b(str, "oauth2:https://www.googleapis.com/auth/photos.image.readonly");
    }

    public final qdl h(String str, String str2) {
        Account account = new Account(str, "com.google");
        try {
            qjc qjcVarO = o(account, str2);
            if (!p(qjcVarO)) {
                a.l().E("Token for [%s, %s] is invalid with expiration %s, refreshing...", account.name, str2, qjcVarO.c);
                m(qjcVarO);
                qjcVarO = o(account, str2);
            }
            a.l().E("Returning valid token for [%s, %s] with expiration %s", account.name, str2, qjcVarO.c);
            return new qdn(qjcVarO.a);
        } catch (Exception e) {
            return n(e, 63);
        }
    }

    public final qjc i(qjb qjbVar) throws Exception {
        qjc qjcVarO = o(qjbVar.a, qjbVar.b);
        this.d.put(qjbVar, qjcVarO);
        return qjcVarO;
    }

    public final qjc j(qjb qjbVar) throws Exception {
        qjc qjcVar = (qjc) this.d.get(qjbVar);
        if (qjcVar != null) {
            if (p(qjcVar)) {
                return qjcVar;
            }
            m(qjcVar);
        }
        return i(qjbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r8, java.lang.String r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.qjd
            if (r0 == 0) goto L13
            r0 = r10
            qjd r0 = (defpackage.qjd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qjd r0 = new qjd
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r10)
            goto L6e
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ybn.f(r10)
            java.lang.String r10 = "com.google"
            qjb r2 = new qjb
            android.accounts.Account r4 = new android.accounts.Account
            r4.<init>(r8, r10)
            r2.<init>(r4, r9)
            ylf r8 = new ylf
            r8.<init>()
            java.util.Map r9 = r7.e
            monitor-enter(r9)
            java.lang.Object r10 = r9.get(r2)     // Catch: java.lang.Throwable -> L8a
            ypc r10 = (defpackage.ypc) r10     // Catch: java.lang.Throwable -> L8a
            if (r10 != 0) goto L5f
            yow r10 = r7.c     // Catch: java.lang.Throwable -> L8a
            akq r4 = new akq     // Catch: java.lang.Throwable -> L8a
            r5 = 5
            r6 = 0
            r4.<init>(r7, r2, r6, r5)     // Catch: java.lang.Throwable -> L8a
            r5 = 3
            ypc r10 = defpackage.ykr.o(r10, r6, r4, r5)     // Catch: java.lang.Throwable -> L8a
            r9.put(r2, r10)     // Catch: java.lang.Throwable -> L8a
        L5f:
            r8.a = r10     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r9)
            java.lang.Object r8 = r8.a
            ypc r8 = (defpackage.ypc) r8
            r0.c = r3
            java.lang.Object r10 = r8.n(r0)
            if (r10 == r1) goto L89
        L6e:
            yfy r10 = (defpackage.yfy) r10
            java.lang.Object r8 = r10.a
            java.lang.Throwable r9 = defpackage.yfy.a(r8)
            if (r9 != 0) goto L82
            qjc r8 = (defpackage.qjc) r8
            java.lang.String r8 = r8.a
            qdn r9 = new qdn
            r9.<init>(r8)
            return r9
        L82:
            r8 = 62
            qdi r8 = n(r9, r8)
            return r8
        L89:
            return r1
        L8a:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qji.k(java.lang.String, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r9, java.lang.String r10, defpackage.yih r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qje
            if (r0 == 0) goto L13
            r0 = r11
            qje r0 = (defpackage.qje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qje r0 = new qje
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r11)
            goto L94
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yyk r9 = r0.f
            ylf r10 = r0.e
            qjb r2 = r0.d
            defpackage.ybn.f(r11)
            goto L60
        L3c:
            defpackage.ybn.f(r11)
            qjb r2 = new qjb
            android.accounts.Account r11 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r11.<init>(r9, r5)
            r2.<init>(r11, r10)
            ylf r10 = new ylf
            r10.<init>()
            yyk r9 = r8.g
            r0.d = r2
            r0.e = r10
            r0.f = r9
            r0.c = r4
            java.lang.Object r11 = r9.b(r0)
            if (r11 == r1) goto Lb4
        L60:
            java.util.Map r11 = r8.e     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r4 = r11.get(r2)     // Catch: java.lang.Throwable -> Laf
            ypc r4 = (defpackage.ypc) r4     // Catch: java.lang.Throwable -> Laf
            r5 = 0
            if (r4 != 0) goto L7d
            yow r4 = r8.c     // Catch: java.lang.Throwable -> Laf
            qjg r6 = new qjg     // Catch: java.lang.Throwable -> Laf
            r6.<init>(r8, r2, r5)     // Catch: java.lang.Throwable -> Laf
            r7 = 3
            ypc r4 = defpackage.ykr.o(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laf
            r11.put(r2, r4)     // Catch: java.lang.Throwable -> Laf
            r10.a = r4     // Catch: java.lang.Throwable -> Laf
            goto L7f
        L7d:
            r10.a = r4     // Catch: java.lang.Throwable -> Laf
        L7f:
            r9.d()
            java.lang.Object r9 = r10.a
            ypc r9 = (defpackage.ypc) r9
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r11 = r9.n(r0)
            if (r11 == r1) goto Lb4
        L94:
            yfy r11 = (defpackage.yfy) r11
            java.lang.Object r9 = r11.a
            java.lang.Throwable r10 = defpackage.yfy.a(r9)
            if (r10 != 0) goto La8
            qjc r9 = (defpackage.qjc) r9
            java.lang.String r9 = r9.a
            qdn r10 = new qdn
            r10.<init>(r9)
            return r10
        La8:
            r9 = 62
            qdi r9 = n(r10, r9)
            return r9
        Laf:
            r10 = move-exception
            r9.d()
            throw r10
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qji.l(java.lang.String, java.lang.String, yih):java.lang.Object");
    }

    public final void m(qjc qjcVar) throws Exception {
        String str = nhd.a;
        nhk.d(this.b, qjcVar.a);
    }
}
