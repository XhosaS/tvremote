package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bco extends bcg {
    public static final bcm a = new bcm();
    public vk b = new vk();
    public bcf c;
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private final ArrayList h;
    private final ahin i;

    public bco(bcl bclVar) {
        bcf bcfVar = bcf.b;
        this.c = bcfVar;
        this.h = new ArrayList();
        this.d = new WeakReference(bclVar);
        this.i = ahiy.a(bcfVar);
    }

    private final bcf g(bck bckVar) {
        HashMap map = this.b.a;
        vn vnVar = map.containsKey(bckVar) ? ((vn) map.get(bckVar)).d : null;
        bcf bcfVar = vnVar != null ? ((bcn) vnVar.b).a : null;
        ArrayList arrayList = this.h;
        bcf bcfVar2 = arrayList.isEmpty() ? null : (bcf) arrayList.get(arrayList.size() - 1);
        bcm bcmVar = a;
        return bcmVar.a(bcmVar.a(this.c, bcfVar), bcfVar2);
    }

    private final void h(bcf bcfVar) {
        if (this.c == bcfVar) {
            return;
        }
        bcl bclVar = (bcl) this.d.get();
        bcf bcfVar2 = this.c;
        bcfVar2.getClass();
        bcfVar.getClass();
        if (bcfVar2 == bcf.b && bcfVar == bcf.a) {
            throw new IllegalStateException("State must be at least '" + bcf.c + "' to be moved to '" + bcfVar + "' in component " + bclVar);
        }
        bcf bcfVar3 = bcf.a;
        if (bcfVar2 == bcfVar3 && bcfVar2 != bcfVar) {
            throw new IllegalStateException("State is '" + bcfVar3 + "' and cannot be moved to `" + bcfVar + "` in component " + bclVar);
        }
        this.c = bcfVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        j();
        this.f = false;
        if (this.c == bcfVar3) {
            this.b = new vk();
        }
    }

    private final void i() {
        this.h.remove(r0.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x002f, code lost:
    
        r7.g = false;
        r7.i.c(r7.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bco.j():void");
    }

    @Override // defpackage.bcg
    public final bcf a() {
        return this.c;
    }

    @Override // defpackage.bcg
    public final void b(bck bckVar) {
        Object obj;
        bcl bclVar;
        bckVar.getClass();
        d("addObserver");
        bcf bcfVar = this.c;
        bcf bcfVar2 = bcf.a;
        if (bcfVar != bcfVar2) {
            bcfVar2 = bcf.b;
        }
        bcn bcnVar = new bcn(bckVar, bcfVar2);
        vk vkVar = this.b;
        vn vnVarA = vkVar.a(bckVar);
        if (vnVarA != null) {
            obj = vnVarA.b;
        } else {
            vkVar.a.put(bckVar, vkVar.c(bckVar, bcnVar));
            obj = null;
        }
        if (((bcn) obj) == null && (bclVar = (bcl) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            bcf bcfVarG = g(bckVar);
            this.e++;
            while (bcnVar.a.compareTo(bcfVarG) < 0 && this.b.a.containsKey(bckVar)) {
                this.h.add(bcnVar.a);
                bce bceVarA = bce.Companion.a(bcnVar.a);
                if (bceVarA == null) {
                    bcf bcfVar3 = bcnVar.a;
                    Objects.toString(bcfVar3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(bcfVar3)));
                }
                bcnVar.a(bclVar, bceVarA);
                i();
                bcfVarG = g(bckVar);
            }
            if (!z) {
                j();
            }
            this.e--;
        }
    }

    @Override // defpackage.bcg
    public final void c(bck bckVar) {
        bckVar.getClass();
        d("removeObserver");
        this.b.b(bckVar);
    }

    public final void d(String str) {
        if (!vg.a().b.b()) {
            throw new IllegalStateException(a.e(str, "Method ", " must be called on the main thread"));
        }
    }

    public void e(bce bceVar) {
        bceVar.getClass();
        d("handleLifecycleEvent");
        h(bceVar.a());
    }

    public final void f(bcf bcfVar) {
        bcfVar.getClass();
        d("setCurrentState");
        h(bcfVar);
    }
}
