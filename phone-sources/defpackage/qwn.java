package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwn {
    public final Context a;
    public final qwo b;
    public final qth c;
    public final qwi d;
    public final rfg e;
    public final rih f;
    public final ril g;
    public final rfe h;
    public final tst i;
    public final qtr j;
    public final ExecutorService k;
    public final pnl l;
    public final rjg m;
    public final tst n;
    public final tst o;
    public final rzy p;

    public qwn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        rih rihVar;
        rzy rzyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qwn) {
            qwn qwnVar = (qwn) obj;
            if (this.a.equals(qwnVar.a) && this.b.equals(qwnVar.b) && this.c.equals(qwnVar.c) && this.d.equals(qwnVar.d) && this.e.equals(qwnVar.e) && ((rihVar = this.f) != null ? rihVar.equals(qwnVar.f) : qwnVar.f == null) && this.g.equals(qwnVar.g) && this.h.equals(qwnVar.h) && this.i.equals(qwnVar.i) && this.j.equals(qwnVar.j) && this.k.equals(qwnVar.k) && this.l.equals(qwnVar.l) && this.m.equals(qwnVar.m) && ((rzyVar = this.p) != null ? rzyVar.equals(qwnVar.p) : qwnVar.p == null) && this.n.equals(qwnVar.n) && this.o.equals(qwnVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        rih rihVar = this.f;
        int iHashCode2 = ((((((((((((((((iHashCode * 1000003) ^ (rihVar == null ? 0 : rihVar.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 2040732332) * (-721379959)) ^ this.j.hashCode()) * (-721379959)) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003;
        rzy rzyVar = this.p;
        return ((((iHashCode2 ^ (rzyVar != null ? rzyVar.hashCode() : 0)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.o;
        tst tstVar2 = this.n;
        rzy rzyVar = this.p;
        rjg rjgVar = this.m;
        pnl pnlVar = this.l;
        ExecutorService executorService = this.k;
        qtr qtrVar = this.j;
        tst tstVar3 = this.i;
        rfe rfeVar = this.h;
        ril rilVar = this.g;
        rih rihVar = this.f;
        rfg rfgVar = this.e;
        qwi qwiVar = this.d;
        qth qthVar = this.c;
        qwo qwoVar = this.b;
        return "AccountMenuManager{applicationContext=" + String.valueOf(this.a) + ", accountsModel=" + String.valueOf(qwoVar) + ", accountConverter=" + String.valueOf(qthVar) + ", clickListeners=" + String.valueOf(qwiVar) + ", features=" + String.valueOf(rfgVar) + ", avatarRetriever=" + String.valueOf(rihVar) + ", oneGoogleEventLogger=" + String.valueOf(rilVar) + ", configuration=" + String.valueOf(rfeVar) + ", incognitoModel=" + String.valueOf(tstVar3) + ", customAvatarImageLoader=null, avatarImageLoader=" + String.valueOf(qtrVar) + ", accountClass=null, backgroundExecutor=" + String.valueOf(executorService) + ", vePrimitives=" + String.valueOf(pnlVar) + ", visualElements=" + String.valueOf(rjgVar) + ", oneGoogleStreamz=" + String.valueOf(rzyVar) + ", appIdentifier=" + String.valueOf(tstVar2) + ", veAuthSideChannelGetter=" + String.valueOf(tstVar) + "}";
    }

    public qwn(Context context, qwo qwoVar, qth qthVar, qwi qwiVar, rfg rfgVar, rih rihVar, ril rilVar, rfe rfeVar, tst tstVar, qtr qtrVar, ExecutorService executorService, pnl pnlVar, rjg rjgVar, rzy rzyVar, tst tstVar2, tst tstVar3) {
        this.a = context;
        this.b = qwoVar;
        this.c = qthVar;
        this.d = qwiVar;
        this.e = rfgVar;
        this.f = rihVar;
        this.g = rilVar;
        this.h = rfeVar;
        this.i = tstVar;
        this.j = qtrVar;
        this.k = executorService;
        this.l = pnlVar;
        this.m = rjgVar;
        this.p = rzyVar;
        this.n = tstVar2;
        this.o = tstVar3;
    }
}
