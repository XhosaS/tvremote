package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import j$.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgl implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public sgl(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new unx(new lii((Set) this.a.b(), 13));
            case 1:
                return new uep() { // from class: rve
                    @Override // defpackage.uep
                    public final Instant a() {
                        return Instant.ofEpochMilli(SystemClock.elapsedRealtime());
                    }
                };
            case 2:
                Context contextA = ((rgq) this.a).a();
                HashSet hashSet = new HashSet();
                List list = nsz.l;
                nsu nsuVar = new nsu(contextA, "SENDKIT");
                nsuVar.e = shb.a;
                nsz nszVarA = nsuVar.a();
                new HashMap();
                hashSet.add(new shc(contextA, nszVarA));
                return hashSet;
            case 3:
                return new tex(((rgq) this.a).a());
            case 4:
                aafi aafiVar = (aafi) this.a.b();
                aafiVar.getClass();
                return aafiVar;
            case 5:
                return new ulp((Object) ((rgq) this.a).a(), (byte[]) null);
            case 6:
                Context contextA2 = ((rgq) this.a).a();
                niv nivVar = new niv(new Bundle());
                npj npjVar = niu.a;
                return new nwq(contextA2, niu.b, nivVar, nwp.a);
            case 7:
                return new zft(this.a);
            case 8:
                return new xhk(((rgq) this.a).a());
            case 9:
                return new xhm(((rgq) this.a).a());
            case 10:
                return new xhv(((rgq) this.a).a());
            case 11:
                return new xia(((rgq) this.a).a());
            case 12:
                return new xiu(((rgq) this.a).a());
            case 13:
                ((rgq) this.a).a();
                return new xiv();
            case 14:
                ((rgq) this.a).a();
                return new xiz();
            case 15:
                ((rgq) this.a).a();
                return new xkn();
            case 16:
                ((rgq) this.a).a();
                return new xko();
            case 17:
                ((rgq) this.a).a();
                return new xks();
            case 18:
                return new xkz(((rgq) this.a).a());
            case 19:
                return new xlg(((rgq) this.a).a());
            default:
                return new xls(((rgq) this.a).a());
        }
    }
}
