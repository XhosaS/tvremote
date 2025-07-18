package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pec implements pdv {
    public static final tvn a = tvn.n("GnpSdk");
    private final pea b;

    public pec(pea peaVar) {
        this.b = peaVar;
    }

    public static String f(String str) {
        return str != null ? str : "signedout";
    }

    public static final void g(rzy rzyVar, uxl uxlVar) {
        rzyVar.A("(log_source = ?");
        rzyVar.B(String.valueOf(uxlVar.c));
        rzyVar.A(" AND event_code = ?");
        rzyVar.B(String.valueOf(uxlVar.d));
        rzyVar.A(" AND package_name = ?)");
        rzyVar.B(uxlVar.e);
    }

    private final uhp h(tsl tslVar) {
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("SELECT log_source,event_code, package_name, COUNT(*) as event_count");
        rzyVar.A(" FROM clearcut_events_table");
        rzyVar.A(" GROUP BY log_source,event_code, package_name");
        return this.b.d.aH(rzyVar.H()).a(new pej(1), ugk.a).f();
    }

    private final uhp i(aafi aafiVar) {
        return this.b.d.aq(new ped(aafiVar, 1));
    }

    @Override // defpackage.pdv
    public final uhp a() {
        return i(sim.l("clearcut_events_table", new StringBuilder(), new ArrayList()));
    }

    @Override // defpackage.pdv
    public final uhp b(String str) {
        return h(new nbe(str, 17));
    }

    @Override // defpackage.pdv
    public final uhp c(String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        return !it.hasNext() ? sfy.C(Collections.EMPTY_MAP) : h(new nbb(it, str, 3));
    }

    @Override // defpackage.pdv
    public final void d(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        osk.Z(i(sim.l("clearcut_events_table", sb, arrayList)), new mig(2), null);
    }

    @Override // defpackage.pdv
    public final void e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        osk.Z(i(osk.K("clearcut_events_table", arrayList)), new mig(3), null);
    }
}
