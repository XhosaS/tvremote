package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class mlj extends qi {
    final /* synthetic */ ogq a;
    final /* synthetic */ oaa b;
    final /* synthetic */ mlk c;
    final /* synthetic */ oal d;
    final /* synthetic */ AtomicReference e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ ogq g;
    final /* synthetic */ ogq h;
    final /* synthetic */ int i;

    public mlj(ogq ogqVar, oaa oaaVar, mlk mlkVar, oal oalVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, ogq ogqVar2, int i, ogq ogqVar3) {
        this.a = ogqVar;
        this.b = oaaVar;
        this.c = mlkVar;
        this.d = oalVar;
        this.e = atomicReference;
        this.f = atomicBoolean;
        this.g = ogqVar2;
        this.i = i;
        this.h = ogqVar3;
    }

    @Override // defpackage.qi
    public final void b(RecyclerView recyclerView, int i) {
        ogq ogqVar;
        if (i != 0) {
            if (i == 1 && this.f.compareAndSet(false, true) && (ogqVar = this.h) != null) {
                oaa oaaVar = this.b;
                mlk mlkVar = this.c;
                nyx nyxVar = (nyx) this.d;
                mll.a(recyclerView, oaaVar, ogqVar.a(), mlkVar, nyxVar.q, nyxVar.m);
                return;
            }
            return;
        }
        if (this.f.compareAndSet(true, false)) {
            ogq ogqVar2 = this.g;
            if (ogqVar2 != null) {
                oaa oaaVar2 = this.b;
                mlk mlkVar2 = this.c;
                nyx nyxVar2 = (nyx) this.d;
                mll.a(recyclerView, oaaVar2, ogqVar2.a(), mlkVar2, nyxVar2.q, nyxVar2.m);
            }
            if (this.i == 2) {
                oal oalVar = this.d;
                String str = mll.a;
                acxn acxnVarQ = oalVar.Q();
                ocq ocqVarP = oalVar.P();
                if (ocqVarP == null || acxnVarQ == null) {
                    return;
                }
                ocqVarP.a(acxnVarQ, 3);
            }
        }
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2;
        ogq ogqVar = this.a;
        if (ogqVar != null) {
            oaa oaaVar = this.b;
            mlk mlkVar = this.c;
            nyx nyxVar = (nyx) this.d;
            recyclerView2 = recyclerView;
            mll.a(recyclerView2, oaaVar, ogqVar.a(), mlkVar, nyxVar.q, nyxVar.m);
        } else {
            recyclerView2 = recyclerView;
        }
        AtomicReference atomicReference = this.e;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        ((oes) atomicReference.get()).c(recyclerView2);
    }
}
