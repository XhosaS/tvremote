package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agli extends AtomicReference implements agfs, aggi {
    static final agle[] a = new agle[0];
    static final agle[] b = new agle[0];
    private static final long serialVersionUID = -533785617179540163L;
    final aglg c;
    boolean d;
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public agli(aglg aglgVar) {
        this.c = aglgVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        agld agldVar = (agld) this.c;
        agldVar.a(new aglf(agob.a));
        agldVar.c();
        h();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        aglg aglgVar = this.c;
        aglf aglfVar = new aglf(obj);
        agld agldVar = (agld) aglgVar;
        agldVar.a(aglfVar);
        aglk aglkVar = (aglk) aglgVar;
        if (aglkVar.b > aglkVar.c) {
            agldVar.b--;
            agldVar.set((aglf) ((aglf) agldVar.get()).get());
        }
        g();
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.c(this, aggiVar)) {
            g();
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.e.set(b);
        aghd.e(this);
    }

    final void e(agle agleVar) {
        AtomicReference atomicReference;
        agle[] agleVarArr;
        agle[] agleVarArr2;
        do {
            atomicReference = this.e;
            agleVarArr = (agle[]) atomicReference.get();
            int length = agleVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (agleVarArr[i].equals(agleVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                agleVarArr2 = a;
            } else {
                agle[] agleVarArr3 = new agle[length - 1];
                System.arraycopy(agleVarArr, 0, agleVarArr3, 0, i);
                System.arraycopy(agleVarArr, i + 1, agleVarArr3, i, (length - i) - 1);
                agleVarArr2 = agleVarArr3;
            }
        } while (!aglh.a(atomicReference, agleVarArr, agleVarArr2));
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (this.d) {
            agoh.e(th);
            return;
        }
        this.d = true;
        agld agldVar = (agld) this.c;
        agldVar.a(new aglf(new agoa(th)));
        agldVar.c();
        h();
    }

    final void g() {
        for (agle agleVar : (agle[]) this.e.get()) {
            this.c.b(agleVar);
        }
    }

    final void h() {
        for (agle agleVar : (agle[]) this.e.getAndSet(b)) {
            this.c.b(agleVar);
        }
    }
}
