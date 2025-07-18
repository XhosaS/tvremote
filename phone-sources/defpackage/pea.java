package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pea {
    static final ImmutableList a;
    static final smv b;
    static final ImmutableList c;
    public final ulp d;

    static {
        tvn tvnVar = pec.a;
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("CREATE TABLE ");
        rzyVar.A("clearcut_events_table");
        rzyVar.A(" (");
        rzyVar.A("account TEXT NOT NULL, ");
        rzyVar.A("timestamp_ms INTEGER NOT NULL, ");
        rzyVar.A("log_source INTEGER NOT NULL, ");
        rzyVar.A("event_code INTEGER NOT NULL, ");
        rzyVar.A("package_name TEXT NOT NULL)");
        smu smuVar = new smu(rzyVar.H());
        smu smuVar2 = new smu(pei.f("promotions"));
        smu smuVar3 = new smu(pei.f("capped_promos"));
        smu smuVar4 = new smu(pei.f("presented_promos"));
        smu smuVar5 = new smu(pei.f("monitored_events_clearcut"));
        smu smuVar6 = new smu(pei.f("monitored_events_visual_element"));
        tvn tvnVar2 = pel.a;
        rzy rzyVar2 = new rzy((char[]) null);
        rzyVar2.A("CREATE TABLE ");
        rzyVar2.A("visual_element_events_table");
        rzyVar2.A(" (");
        rzyVar2.A("account TEXT NOT NULL, ");
        rzyVar2.A("timestamp_ms INTEGER NOT NULL, ");
        rzyVar2.A("node_id INTEGER NOT NULL, ");
        rzyVar2.A("node_id_path TEXT NOT NULL, ");
        rzyVar2.A("action INTEGER NOT NULL)");
        ImmutableList immutableListOf = ImmutableList.of(smuVar, smuVar2, smuVar3, smuVar4, smuVar5, smuVar6, new smu(rzyVar2.H()), new smu(pei.f("preview_promotions")), new smu(pei.f("eval_results")), new smu(rdd.an("success_event_store")), new smu(rdd.an("user_experiments_store")), new smu(pei.f("versioned_identifiers")), new smu(pei.f("chime_versioned_identifiers")));
        a = immutableListOf;
        pdz pdzVar = new pdz();
        b = pdzVar;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) immutableListOf);
        builder.add((ImmutableList.Builder) pdzVar);
        c = builder.build();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yfo] */
    public pea(aafi aafiVar) {
        ImmutableList immutableList = c;
        trk trkVar = trk.a;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            builder.add((ImmutableList.Builder) it.next());
        }
        vvd vvdVar = new vvd(trkVar, builder.build(), builder2.build(), new zuw());
        Context contextA = ((rgq) aafiVar.c).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) aafiVar.b.b();
        scheduledExecutorService.getClass();
        ulp ulpVar = (ulp) aafiVar.a.b();
        ulpVar.getClass();
        this.d = new ulp(new smq(contextA, scheduledExecutorService, ulpVar, new osv(16), vvdVar), (byte[]) null);
    }
}
