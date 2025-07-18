package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqp extends euv implements eru {
    private final eql a;
    private final epd b;
    private dzs c;
    private efy d;
    private dzy e;
    private final erb f;
    private final dxc g;
    private final sew h;

    static {
        dzz.b("media3.exoplayer.hls");
    }

    public eqp(dzy dzyVar, dxc dxcVar, eql eqlVar, epd epdVar, sew sewVar, erb erbVar) {
        this.e = dzyVar;
        this.c = dzyVar.d;
        this.g = dxcVar;
        this.a = eqlVar;
        this.b = epdVar;
        this.h = sewVar;
        this.f = erbVar;
    }

    private static erg d(List list, long j) {
        erg ergVar = null;
        for (int i = 0; i < list.size(); i++) {
            erg ergVar2 = (erg) list.get(i);
            long j2 = ergVar2.g;
            if (j2 > j || !ergVar2.a) {
                if (j2 > j) {
                    break;
                }
            } else {
                ergVar = ergVar2;
            }
        }
        return ergVar;
    }

    private static eri e(List list, long j) {
        return (eri) list.get(edt.ay(list, Long.valueOf(j), true));
    }

    @Override // defpackage.ewb
    public final synchronized dzy a() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    @Override // defpackage.eru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.erl r33) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqp.b(erl):void");
    }

    @Override // defpackage.ewb
    public final void c() throws IOException {
        erb erbVar = this.f;
        ezw ezwVar = erbVar.d;
        if (ezwVar != null) {
            ezwVar.a();
        }
        Uri uri = erbVar.h;
        if (uri != null) {
            erbVar.i(uri);
        }
    }

    @Override // defpackage.euv
    protected final void g(efy efyVar) {
        this.d = efyVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        epd epdVar = this.b;
        epdVar.eo(looperMyLooper, q());
        epdVar.em();
        eph ephVarE = E(null);
        dzt dztVar = a().c;
        dztVar.getClass();
        erb erbVar = this.f;
        erbVar.e = edt.J();
        erbVar.l = ephVarE;
        erbVar.f = this;
        eex eexVar = new eex();
        eexVar.a = dztVar.i;
        eexVar.i = 1;
        faa faaVar = new faa(erbVar.m.f(), eexVar.a(), 4, erbVar.a.a());
        a.ab(erbVar.d == null);
        erbVar.d = new ezw("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        erbVar.d.i(faaVar, erbVar, erbVar.n.h(faaVar.c));
    }

    @Override // defpackage.ewb
    public final void i(evx evxVar) {
        eqo eqoVar = (eqo) evxVar;
        eqoVar.e.c.remove(eqoVar);
        for (eqt eqtVar : eqoVar.d) {
            if (eqtVar.m) {
                for (eqs eqsVar : eqtVar.h) {
                    eqsVar.y();
                }
            }
            eqtVar.b.f();
            eqtVar.c.f(eqtVar);
            eqtVar.f.removeCallbacksAndMessages(null);
            eqtVar.q = true;
            eqtVar.g.clear();
        }
        eqoVar.a = null;
    }

    @Override // defpackage.euv
    protected final void j() {
        erb erbVar = this.f;
        erbVar.h = null;
        erbVar.i = null;
        erbVar.g = null;
        erbVar.k = -9223372036854775807L;
        erbVar.d.e();
        erbVar.d = null;
        HashMap map = erbVar.b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((era) it.next()).b.e();
        }
        erbVar.e.removeCallbacksAndMessages(null);
        erbVar.e = null;
        map.clear();
        this.b.en();
    }

    @Override // defpackage.euv, defpackage.ewb
    public final synchronized void n(dzy dzyVar) {
        this.e = dzyVar;
    }

    @Override // defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        dzy dzyVarA = a();
        dzt dztVar = dzyVarA.c;
        dztVar.getClass();
        dzt dztVar2 = dzyVar.c;
        if (dztVar2 != null) {
            return dztVar2.i.equals(dztVar.i) && dztVar2.m.equals(dztVar.m) && Objects.equals(dztVar2.k, dztVar.k) && dzyVarA.d.equals(dzyVar.d);
        }
        return false;
    }

    @Override // defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        sew sewVar = this.h;
        eph ephVarE = E(evzVar);
        return new eqo(this.a, this.f, this.g, this.d, this.b, F(evzVar), sewVar, ephVarE, ezpVar, q());
    }
}
