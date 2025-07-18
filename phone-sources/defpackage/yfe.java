package defpackage;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yfe extends xrx {
    public static final Logger f = Logger.getLogger(yfe.class.getName());
    public final xrp h;
    protected boolean i;
    protected xqk k;
    public List g = new ArrayList(0);
    protected final xry j = new yac();

    protected yfe(xrp xrpVar) {
        this.h = xrpVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.xrx
    public final xtk a(xrt xrtVar) {
        xtk xtkVarE;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", xrtVar);
        try {
            this.i = true;
            List<xqt> list = xrtVar.a;
            LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = Maps.newLinkedHashMapWithExpectedSize(list.size());
            for (xqt xqtVar : list) {
                xpv xpvVar = xpv.a;
                xpv xpvVar2 = xrtVar.b;
                Object obj = xrtVar.c;
                List listSingletonList = Collections.singletonList(xqtVar);
                zlx zlxVar = new zlx(xpv.a);
                zlxVar.b(e, true);
                linkedHashMapNewLinkedHashMapWithExpectedSize.put(new yfd(xqtVar), new xrt(listSingletonList, zlxVar.a(), null));
            }
            if (linkedHashMapNewLinkedHashMapWithExpectedSize.isEmpty()) {
                xtkVarE = xtk.k.e(a.ct(xrtVar, "NameResolver returned no usable address. "));
                b(xtkVarE);
            } else {
                LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize2 = Maps.newLinkedHashMapWithExpectedSize(this.g.size());
                for (yfc yfcVar : this.g) {
                    linkedHashMapNewLinkedHashMapWithExpectedSize2.put(yfcVar.a, yfcVar);
                }
                xtk xtkVar = xtk.b;
                ArrayList arrayList = new ArrayList(linkedHashMapNewLinkedHashMapWithExpectedSize.size());
                for (Map.Entry entry : linkedHashMapNewLinkedHashMapWithExpectedSize.entrySet()) {
                    yfc yfcVarE = (yfc) linkedHashMapNewLinkedHashMapWithExpectedSize2.remove(entry.getKey());
                    if (yfcVarE == null) {
                        yfcVarE = e(entry.getKey());
                    }
                    arrayList.add(yfcVarE);
                    if (entry.getValue() != null) {
                        xtk xtkVarA = yfcVarE.b.a((xrt) entry.getValue());
                        if (!xtkVarA.g()) {
                            xtkVar = xtkVarA;
                        }
                    }
                }
                this.g = arrayList;
                f();
                Iterator it = linkedHashMapNewLinkedHashMapWithExpectedSize2.values().iterator();
                while (it.hasNext()) {
                    ((yfc) it.next()).b();
                }
                xtkVarE = xtkVar;
            }
            return xtkVarE;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.xrx
    public final void b(xtk xtkVar) {
        if (this.k != xqk.READY) {
            this.h.f(xqk.TRANSIENT_FAILURE, new xro(xrr.b(xtkVar)));
        }
    }

    @Override // defpackage.xrx
    public final void d() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((yfc) it.next()).b();
        }
        this.g.clear();
    }

    protected yfc e(Object obj) {
        throw null;
    }

    protected abstract void f();
}
