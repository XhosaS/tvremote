package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agew extends afhm {
    public static final Logger f = Logger.getLogger(agew.class.getName());
    public final afhe h;
    protected boolean i;
    protected affe k;
    public List g = new ArrayList(0);
    protected final afhn j = new afwi();

    protected agew(afhe afheVar) {
        this.h = afheVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.afhm
    public final Status a(afhi afhiVar) {
        Status statusWithDescription;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", afhiVar);
        try {
            this.i = true;
            List<affy> list = afhiVar.a;
            LinkedHashMap linkedHashMapD = zbk.d(list.size());
            for (affy affyVar : list) {
                afeh afehVar = afeh.a;
                afeh afehVar2 = afhiVar.b;
                Object obj = afhiVar.c;
                List listSingletonList = Collections.singletonList(affyVar);
                afef afefVar = new afef(afeh.a);
                afefVar.b(e, true);
                linkedHashMapD.put(new agev(affyVar), new afhi(listSingletonList, afefVar.a(), null));
            }
            if (linkedHashMapD.isEmpty()) {
                statusWithDescription = Status.l.withDescription(a.p(afhiVar, "NameResolver returned no usable address. "));
                b(statusWithDescription);
            } else {
                LinkedHashMap linkedHashMapD2 = zbk.d(this.g.size());
                for (ageu ageuVar : this.g) {
                    linkedHashMapD2.put(ageuVar.a, ageuVar);
                }
                Status status = Status.OK;
                ArrayList arrayList = new ArrayList(linkedHashMapD.size());
                for (Map.Entry entry : linkedHashMapD.entrySet()) {
                    ageu ageuVarE = (ageu) linkedHashMapD2.remove(entry.getKey());
                    if (ageuVarE == null) {
                        ageuVarE = e(entry.getKey());
                    }
                    arrayList.add(ageuVarE);
                    if (entry.getValue() != null) {
                        Status statusA = ageuVarE.b.a((afhi) entry.getValue());
                        if (!statusA.e()) {
                            status = statusA;
                        }
                    }
                }
                this.g = arrayList;
                f();
                Iterator it = linkedHashMapD2.values().iterator();
                while (it.hasNext()) {
                    ((ageu) it.next()).b();
                }
                statusWithDescription = status;
            }
            return statusWithDescription;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.afhm
    public final void b(Status status) {
        if (this.k != affe.READY) {
            this.h.e(affe.TRANSIENT_FAILURE, new afhd(afhg.b(status)));
        }
    }

    @Override // defpackage.afhm
    public final void d() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((ageu) it.next()).b();
        }
        this.g.clear();
    }

    protected ageu e(Object obj) {
        throw null;
    }

    protected abstract void f();
}
