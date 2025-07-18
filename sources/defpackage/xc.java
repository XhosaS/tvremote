package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xc {
    public xb a;
    private ll b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private final ArrayList g;
    private final aei h;

    public xc() {
        new AtomicReference(null);
    }

    private final xb e(xe xeVar) {
        ll llVar = this.b;
        lo loVar = llVar.c(xeVar) ? ((lo) llVar.a.get(xeVar)).d : null;
        Object obj = loVar != null ? ((afz) loVar.b).a : null;
        ArrayList arrayList = this.g;
        return qq.e(qq.e(this.a, (xb) obj), arrayList.isEmpty() ? null : (xb) arrayList.get(arrayList.size() - 1));
    }

    private final void f(xb xbVar) {
        if (this.a == xbVar) {
            return;
        }
        xf xfVar = (xf) this.c.get();
        xb xbVar2 = this.a;
        xbVar2.getClass();
        xbVar.getClass();
        if (xbVar2 == xb.b && xbVar == xb.a) {
            throw new IllegalStateException("State must be at least '" + xb.c + "' to be moved to '" + xbVar + "' in component " + xfVar);
        }
        xb xbVar3 = xb.a;
        if (xbVar2 == xbVar3 && xbVar2 != xbVar) {
            throw new IllegalStateException("State is '" + xbVar3 + "' and cannot be moved to `" + xbVar + "` in component " + xfVar);
        }
        this.a = xbVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        i();
        this.e = false;
        if (this.a == xbVar3) {
            this.b = new ll();
        }
    }

    private final void g() {
        this.g.remove(r0.size() - 1);
    }

    private final void h(xb xbVar) {
        this.g.add(xbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6.f = false;
        r6.h.l(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc.i():void");
    }

    private static void j(String str) {
        li.a();
        if (!li.b()) {
            throw new IllegalStateException(b.c(str, "Method ", " must be called on the main thread"));
        }
    }

    public final void a(xe xeVar) {
        Object obj;
        xf xfVar;
        j("addObserver");
        xb xbVar = this.a;
        xb xbVar2 = xb.a;
        if (xbVar != xbVar2) {
            xbVar2 = xb.b;
        }
        afz afzVar = new afz(xeVar, xbVar2);
        ll llVar = this.b;
        lo loVarA = llVar.a(xeVar);
        if (loVarA != null) {
            obj = loVarA.b;
        } else {
            llVar.a.put(xeVar, llVar.d(xeVar, afzVar));
            obj = null;
        }
        if (((afz) obj) == null && (xfVar = (xf) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            xb xbVarE = e(xeVar);
            this.d++;
            while (((xb) afzVar.a).compareTo(xbVarE) < 0 && this.b.c(xeVar)) {
                h((xb) afzVar.a);
                wz wzVar = xa.Companion;
                xa xaVarA = wz.a((xb) afzVar.a);
                if (xaVarA == null) {
                    Object obj2 = afzVar.a;
                    Objects.toString(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
                afzVar.b(xfVar, xaVarA);
                g();
                xbVarE = e(xeVar);
            }
            if (!z) {
                i();
            }
            this.d--;
        }
    }

    public final void b(xa xaVar) {
        xaVar.getClass();
        j("handleLifecycleEvent");
        f(xaVar.a());
    }

    public final void c(xe xeVar) {
        j("removeObserver");
        this.b.b(xeVar);
    }

    public final void d(xb xbVar) {
        xbVar.getClass();
        j("setCurrentState");
        f(xbVar);
    }

    public xc(xf xfVar) {
        new AtomicReference(null);
        this.b = new ll();
        xb xbVar = xb.b;
        this.a = xbVar;
        this.g = new ArrayList();
        this.c = new WeakReference(xfVar);
        this.h = new aei(xbVar == null ? cvs.a : xbVar);
    }
}
