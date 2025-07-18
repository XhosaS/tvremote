package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dru implements Cloneable {
    public final Context a;
    public String b;
    public drq c;
    public String d;
    public final dxl e;
    public dzh f;
    public dzh g;
    public ComponentTree h;
    public WeakReference i;
    public dxo j;
    public final AtomicInteger k;
    private final String l;
    private final ohv m;

    public dru(Context context, String str, ohv ohvVar, dzh dzhVar) {
        if (ohvVar != null && str == null) {
            throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
        }
        this.a = context;
        dxk.a(context.getResources().getConfiguration());
        this.e = new dxl(context);
        this.f = dzhVar;
        this.m = ohvVar;
        this.l = str;
        this.k = new AtomicInteger(0);
    }

    public static dru c(dru druVar) {
        return new dru(druVar.a, druVar.j(), druVar.o(), dzh.b(druVar.f));
    }

    private final void p() {
        String str = this.b;
        if (str != null) {
            throw new IllegalStateException(a.e(str, "Updating the state of a component during ", " leads to unexpected behaviour, consider using lazy state updates."));
        }
    }

    public final int a() {
        dvd dvdVar;
        WeakReference weakReference = this.i;
        dve dveVar = weakReference != null ? (dve) weakReference.get() : null;
        if (dveVar == null || (dvdVar = dveVar.b) == null) {
            throw new IllegalStateException("LayoutVersion is only available during layout calculation.Please only invoke getLayoutVersion from OnCreateLayout/OnMeasure/OnPrepare");
        }
        return dvdVar.y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dru clone() {
        try {
            return (dru) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dtu d() {
        /*
            r1 = this;
            drq r0 = r1.c
            if (r0 == 0) goto L18
            dxo r0 = r1.j     // Catch: java.lang.IllegalStateException -> L10
            if (r0 == 0) goto Le
            dtu r0 = r0.f     // Catch: java.lang.IllegalStateException -> L10
            if (r0 != 0) goto Ld
            goto L18
        Ld:
            return r0
        Le:
            r0 = 0
            throw r0     // Catch: java.lang.IllegalStateException -> L10
        L10:
            com.facebook.litho.ComponentTree r0 = r1.h
            if (r0 == 0) goto L15
            goto L1c
        L15:
            dta r0 = defpackage.dta.a
            return r0
        L18:
            com.facebook.litho.ComponentTree r0 = r1.h
            if (r0 == 0) goto L1f
        L1c:
            dtp r0 = r0.F
            return r0
        L1f:
            dta r0 = defpackage.dta.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dru.d():dtu");
    }

    public dtx e(int i, String str, dug dugVar) {
        return new dtx(this.c == null ? "" : i(), i, str, dugVar);
    }

    final dvd f() {
        WeakReference weakReference = this.i;
        dve dveVar = weakReference != null ? (dve) weakReference.get() : null;
        if (dveVar != null) {
            return dveVar.b;
        }
        return null;
    }

    public final Object g(Class cls) {
        dzh dzhVar = this.g;
        if (dzhVar == null) {
            return null;
        }
        return dzhVar.c(cls);
    }

    public final Object h(Class cls) {
        dzh dzhVar = this.f;
        if (dzhVar == null) {
            return null;
        }
        return dzhVar.c(cls);
    }

    public String i() {
        if (this.c != null) {
            return this.d;
        }
        throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
    }

    public final String j() {
        String str;
        ComponentTree componentTree = this.h;
        return (componentTree == null || (str = componentTree.K) == null) ? this.l : str;
    }

    public void k(dxw dxwVar, String str) {
        p();
        ComponentTree componentTree = this.h;
        if (componentTree == null) {
            return;
        }
        String strI = i();
        boolean zM = m();
        if (!componentTree.r) {
            throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
        }
        synchronized (componentTree) {
            if (componentTree.y == null) {
                return;
            }
            dxy dxyVar = componentTree.D;
            if (dxyVar != null) {
                dxyVar.m(strI, dxwVar, false);
            }
            eeu.c.addAndGet(1L);
            componentTree.w(true, str, zM);
        }
    }

    public void l(dxw dxwVar, String str) {
        p();
        ComponentTree componentTree = this.h;
        if (componentTree == null) {
            return;
        }
        String strI = i();
        boolean zM = m();
        synchronized (componentTree) {
            if (componentTree.y == null) {
                return;
            }
            dxy dxyVar = componentTree.D;
            if (dxyVar != null) {
                dxyVar.m(strI, dxwVar, false);
            }
            eeu.b.addAndGet(1L);
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                Log.w(ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                synchronized (componentTree.j) {
                    dso dsoVar = componentTree.k;
                    if (dsoVar != null) {
                        componentTree.t.a(dsoVar);
                    }
                    componentTree.k = new dso(componentTree, str, zM);
                    componentTree.t.b();
                    componentTree.t.c(componentTree.k);
                }
                return;
            }
            ThreadLocal threadLocal = ComponentTree.b;
            WeakReference weakReference = (WeakReference) threadLocal.get();
            emk emjVar = weakReference != null ? (emk) weakReference.get() : null;
            if (emjVar == null) {
                emjVar = new emj(looperMyLooper);
                threadLocal.set(new WeakReference(emjVar));
            }
            synchronized (componentTree.j) {
                dso dsoVar2 = componentTree.k;
                if (dsoVar2 != null) {
                    emjVar.a(dsoVar2);
                }
                componentTree.k = new dso(componentTree, str, zM);
                emjVar.c(componentTree.k);
            }
        }
    }

    final boolean m() {
        dvd dvdVar;
        WeakReference weakReference = this.i;
        dve dveVar = weakReference != null ? (dve) weakReference.get() : null;
        if (dveVar == null || (dvdVar = dveVar.b) == null) {
            return false;
        }
        return dvdVar.B;
    }

    public final boolean n() {
        ComponentTree componentTree = this.h;
        if (componentTree != null) {
            return componentTree.I;
        }
        boolean z = ebc.a;
        return false;
    }

    public final ohv o() {
        ohv ohvVar;
        ComponentTree componentTree = this.h;
        return (componentTree == null || (ohvVar = componentTree.M) == null) ? this.m : ohvVar;
    }

    public dru(dru druVar, dzh dzhVar, dve dveVar) {
        ComponentTree componentTree;
        this.a = druVar.a;
        this.e = druVar.e;
        this.c = druVar.c;
        this.h = druVar.h;
        this.i = new WeakReference(dveVar);
        this.m = druVar.m;
        String strG = druVar.l;
        if (strG == null && (componentTree = this.h) != null) {
            strG = componentTree.g();
        }
        this.l = strG;
        this.f = dzhVar == null ? druVar.f : dzhVar;
        this.g = druVar.g;
        this.d = druVar.d;
        this.k = druVar.k;
    }
}
