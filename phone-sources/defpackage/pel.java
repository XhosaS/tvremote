package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pel implements pdy {
    public static final tvn a = tvn.n("GnpSdk");
    private final pea b;

    public pel(pea peaVar) {
        this.b = peaVar;
    }

    public static final String g(String str) {
        return str != null ? str : "signedout";
    }

    public static final void h(rzy rzyVar, uzh uzhVar) {
        rzyVar.A("(node_id = ?");
        rzyVar.B(String.valueOf(Iterables.getLast(uzhVar.c)));
        rzyVar.A(" AND action = ?)");
        uzg uzgVarB = uzg.b(uzhVar.d);
        if (uzgVarB == null) {
            uzgVarB = uzg.UNKNOWN;
        }
        rzyVar.B(String.valueOf(uzgVarB.e));
    }

    private final uhp i(tsl tslVar) {
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("SELECT node_id_path,action, COUNT(*) as event_count");
        rzyVar.A(" FROM visual_element_events_table");
        rzyVar.A(" GROUP BY node_id_path,action");
        return this.b.d.aH(rzyVar.H()).a(new pej(0), ugk.a).f();
    }

    private final uhp j(aafi aafiVar) {
        return this.b.d.aq(new ped(aafiVar, 2));
    }

    @Override // defpackage.pdy
    public final uhp a(final List list) {
        return this.b.d.ar(new smy() { // from class: pek
            @Override // defpackage.smy
            public final void a(rzy rzyVar) throws InterruptedException {
                ContentValues contentValues = new ContentValues(5);
                for (pew pewVar : list) {
                    contentValues.put("account", pel.g(pewVar.a));
                    contentValues.put("timestamp_ms", Long.valueOf(pewVar.d));
                    ImmutableList immutableList = pewVar.b;
                    Integer num = (Integer) Iterables.getLast(immutableList);
                    num.intValue();
                    contentValues.put("node_id", num);
                    contentValues.put("node_id_path", TextUtils.join(",", immutableList));
                    contentValues.put("action", Integer.valueOf(pewVar.c.e));
                    rzyVar.y("visual_element_events_table", contentValues, 0);
                }
            }
        });
    }

    @Override // defpackage.pdy
    public final uhp b() {
        uhp uhpVarJ = j(sim.l("visual_element_events_table", new StringBuilder(), new ArrayList()));
        osk.Z(uhpVarJ, new mig(5), null);
        return uhpVarJ;
    }

    @Override // defpackage.pdy
    public final uhp c(String str) {
        return i(new nbe(str, 18));
    }

    @Override // defpackage.pdy
    public final uhp d(String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        return !it.hasNext() ? sfy.C(ImmutableMap.of()) : i(new nbb(it, str, 4));
    }

    @Override // defpackage.pdy
    public final void e(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        osk.Z(j(sim.l("visual_element_events_table", sb, arrayList)), new mig(4), null);
    }

    @Override // defpackage.pdy
    public final void f(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        j(osk.K("visual_element_events_table", arrayList));
    }
}
