package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oid implements ofn {
    public final oil c;
    public final oil d;
    public final oil e;
    public final int f;
    public final String g;
    public final oin i;
    private final Executor k;
    public final Object b = new Object();
    public final List h = new ArrayList();
    public final AtomicReference j = new AtomicReference();

    public oid(String str, int i, ohr ohrVar, oin oinVar, Executor executor) {
        this.f = i;
        this.k = executor;
        this.c = new oil(ohrVar);
        this.d = new oil(ohrVar);
        this.e = new oil(ohrVar);
        this.i = oinVar;
        this.g = str;
    }

    @Override // defpackage.ofn
    public final void a() {
        synchronized (this.b) {
            this.c.b();
            this.d.b();
            this.e.b();
            this.h.clear();
        }
    }

    @Override // defpackage.ofn
    public final void b() {
        Trace.endSection();
        this.c.c();
    }

    @Override // defpackage.ofn
    public final void c() {
        Trace.endSection();
        this.e.c();
        this.k.execute(new Runnable() { // from class: oia
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // defpackage.ofn
    public final synchronized void d(boolean z) {
        if (z) {
            a();
        } else {
            this.k.execute(new Runnable() { // from class: oib
                @Override // java.lang.Runnable
                public final void run() {
                    yyk yykVarJ;
                    oid oidVar = this.a;
                    String str = (String) oidVar.j.get();
                    oih oihVarN = oii.n();
                    oihVarN.c(str == null ? zcp.b : new zdd(str));
                    oij oijVar = oij.COMPONENT_MATERIALIZATION;
                    List listA = oidVar.c.a(oij.COMPONENT_MATERIALIZATION.w, oihVarN);
                    if (listA.isEmpty()) {
                        return;
                    }
                    ((oig) listA.get(0)).c(Integer.valueOf(oidVar.f));
                    int iD = oidVar.i.d(oidVar.g, ((oig) listA.get(0)).a());
                    oidVar.h(oidVar.d.a(oij.TEMPLATE_FETCHING.w, oihVarN), iD);
                    oidVar.h(oidVar.e.a(oij.TEMPLATE_RESOLUTION.w, oihVarN), iD);
                    synchronized (oidVar.b) {
                        List list = oidVar.h;
                        yykVarJ = !list.isEmpty() ? yyk.j(list) : null;
                    }
                    if (yykVarJ != null) {
                        ArrayList arrayList = new ArrayList(yykVarJ.size());
                        int size = yykVarJ.size();
                        for (int i = 0; i < size; i++) {
                            oic oicVar = (oic) yykVarJ.get(i);
                            ohl ohlVar = new ohl();
                            ohlVar.b(oij.PB_TO_FB.w);
                            long j = oicVar.a;
                            ohlVar.c = 0L;
                            oif oifVar = oicVar.b;
                            ((ohn) oihVarN).b = null;
                            ohlVar.d = oihVarN.a();
                            arrayList.add(ohlVar);
                        }
                        oidVar.h(arrayList, iD);
                    }
                }
            });
        }
    }

    @Override // defpackage.ofn
    public final void e(String str) {
        if (str != null) {
            AtomicReference atomicReference = this.j;
            while (!atomicReference.compareAndSet(null, str) && atomicReference.get() == null) {
            }
        }
    }

    @Override // defpackage.ofn
    public final void f() {
        this.c.d();
        Trace.beginSection("startTemplateProcess|eml=".concat(String.valueOf((String) this.j.get())));
    }

    @Override // defpackage.ofn
    public final void g() {
        this.e.d();
        Trace.beginSection("startTemplateResolve|eml=".concat(String.valueOf((String) this.j.get())));
    }

    public final void h(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oig oigVar = (oig) it.next();
            oigVar.c(Integer.valueOf(i));
            this.i.d(this.g, oigVar.a());
        }
    }
}
