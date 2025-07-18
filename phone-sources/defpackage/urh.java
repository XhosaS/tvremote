package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.TokenData;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urh implements ura {
    private static final Duration c = Duration.ofMinutes(5);
    private static final Duration d = Duration.ofHours(1);
    private static final tsp e = new tsp(" ");
    private final boolean f;
    private final upq h;
    private final uhs g = new ugl();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public urh(upq upqVar, boolean z) {
        this.h = upqVar;
        this.f = z;
    }

    private static final String f(Set set) {
        return "oauth2:".concat(e.b(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.ura
    public final aafi a(uqx uqxVar, Set set) throws urb {
        uhp uhpVar;
        ?? r1;
        urg urgVar = new urg(new Account(uqxVar.b, "com.google"), f(set));
        Map map = this.b;
        synchronized (map) {
            uhpVar = (uhp) map.get(urgVar);
            r1 = 0;
            if (uhpVar == null) {
                uhq uhqVar = new uhq(new grz(this, urgVar, 18));
                uhqVar.c(new ukm(this, urgVar, 10, null), this.g);
                map.put(urgVar, uhqVar);
                uhpVar = uhqVar;
                r1 = uhpVar;
            }
        }
        if (r1 != 0) {
            r1.run();
        }
        try {
            return (aafi) uhpVar.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof urb) {
                throw ((urb) cause);
            }
            throw new urb("Failed to refresh token", cause);
        }
    }

    @Override // defpackage.ura
    public final aafi b(uqx uqxVar, Set set) throws urb {
        aafi aafiVarC;
        try {
            urg urgVar = new urg(new Account(uqxVar.b, "com.google"), f(set));
            synchronized (this.a) {
                aafiVarC = c(urgVar);
            }
            return aafiVarC;
        } catch (urb e2) {
            throw e2;
        } catch (Throwable th) {
            throw new urb("Failed to get auth token", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aafi c(defpackage.urg r5) throws java.lang.Exception {
        /*
            r4 = this;
            java.util.Map r0 = r4.a
            java.lang.Object r0 = r0.get(r5)
            aafi r0 = (defpackage.aafi) r0
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r0.b
            if (r1 == 0) goto L1f
            j$.time.Instant r2 = j$.time.Instant.now()
            j$.time.Duration r1 = j$.time.Duration.between(r2, r1)
            j$.time.Duration r2 = defpackage.urh.c
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L37
            goto L38
        L1f:
            java.lang.Object r1 = r0.c
            j$.time.Instant r2 = j$.time.Instant.now()
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)
            j$.time.Duration r2 = defpackage.urh.d
            j$.time.Duration r3 = defpackage.urh.c
            j$.time.Duration r2 = r2.minus(r3)
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L38
        L37:
            return r0
        L38:
            r4.e(r0)
        L3b:
            aafi r5 = r4.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urh.c(urg):aafi");
    }

    public final aafi d(urg urgVar) throws Exception {
        Account account = urgVar.a;
        String str = urgVar.b;
        try {
            Object obj = this.h.b;
            String str2 = nhd.a;
            TokenData tokenDataB = nhk.b((Context) obj, account, str, null);
            aafi aafiVar = new aafi(tokenDataB.b, Instant.now(), (Instant) Optional.ofNullable(tokenDataB.c).map(new ssi(20)).orElse(null));
            if (!this.f && aafiVar.b == null) {
                return aafiVar;
            }
            this.a.put(urgVar, aafiVar);
            return aafiVar;
        } catch (nhc e2) {
            throw new urb(e2);
        }
    }

    public final void e(aafi aafiVar) throws Exception {
        Object obj = aafiVar.a;
        try {
            Object obj2 = this.h.b;
            String str = nhd.a;
            nhk.d((Context) obj2, (String) obj);
        } catch (nhc e2) {
            throw new urb(e2);
        }
    }
}
