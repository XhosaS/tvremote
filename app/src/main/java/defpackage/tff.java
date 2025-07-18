package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tff implements rog, bbv {
    public final vql a;
    public Map b;
    private final ahbt c;
    private Map d;

    /* JADX WARN: Multi-variable type inference failed */
    public tff(Set set, ahbt ahbtVar, Context context, vql vqlVar) {
        set.getClass();
        ahbtVar.getClass();
        context.getClass();
        vqlVar.getClass();
        this.c = ahbtVar;
        this.a = vqlVar;
        int iB = agrj.b(agqq.i(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        yxy yxyVar = (yxy) set;
        zdm zdmVarListIterator = yxyVar.f().listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            E next = zdmVarListIterator.next();
            linkedHashMap.put(next, false);
        }
        this.b = new LinkedHashMap(linkedHashMap);
        int iB2 = agrj.b(agqq.i(set, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        zdm zdmVarListIterator2 = yxyVar.f().listIterator(0);
        while (zdmVarListIterator2.hasNext()) {
            E next2 = zdmVarListIterator2.next();
            linkedHashMap2.put(next2, null);
        }
        this.d = new LinkedHashMap(linkedHashMap2);
    }

    @Override // defpackage.rog
    public final void a() {
        Runnable runnable = new Runnable() { // from class: tfd
            @Override // java.lang.Runnable
            public final void run() {
                tff tffVar = this.a;
                if (tffVar.a.b()) {
                    tffVar.h();
                } else {
                    tffVar.g();
                }
            }
        };
        vql vqlVar = this.a;
        synchronized (vqlVar.a) {
            vqlVar.b.add(runnable);
        }
    }

    @Override // defpackage.bbv
    public final void c(bcl bclVar) {
        h();
    }

    @Override // defpackage.bbv
    public final void d(bcl bclVar) {
        g();
    }

    public final void g() {
        for (tfc tfcVar : this.d.keySet()) {
            this.d.put(tfcVar, ahal.e(this.c, null, 0, new tfe(tfcVar, this, null), 3));
        }
    }

    public final void h() {
        for (tfc tfcVar : this.d.keySet()) {
            if (this.d.get(tfcVar) != null) {
                Object obj = this.d.get(tfcVar);
                obj.getClass();
                ((ahdl) obj).s(null);
                this.d.put(tfcVar, null);
            }
            Object obj2 = this.b.get(tfcVar);
            obj2.getClass();
            if (!((Boolean) obj2).booleanValue()) {
                tfcVar.c();
                this.b.put(tfcVar, true);
            }
        }
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void b(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void eY(bcl bclVar) {
    }
}
