package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuy {
    static ftw a;
    final Context b;
    final ArrayList c = new ArrayList();

    public fuy(Context context) {
        this.b = context;
    }

    public static ftw a() {
        ftw ftwVar = a;
        if (ftwVar != null) {
            return ftwVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static fuy b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        e();
        if (a == null) {
            a = new ftw(context.getApplicationContext());
        }
        ArrayList arrayList = a.h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                fuy fuyVar = new fuy(context);
                arrayList.add(new WeakReference(fuyVar));
                return fuyVar;
            }
            fuy fuyVar2 = (fuy) ((WeakReference) arrayList.get(size)).get();
            if (fuyVar2 == null) {
                arrayList.remove(size);
            } else if (fuyVar2.b == context) {
                return fuyVar2;
            }
        }
    }

    public static void e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static boolean g() {
        Bundle bundle;
        if (a == null) {
            return false;
        }
        fvb fvbVar = a().p;
        return fvbVar == null || (bundle = fvbVar.f) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static boolean h() {
        if (a == null) {
            return false;
        }
        return a().r();
    }

    static boolean i() {
        fvb fvbVar = a().p;
        if (fvbVar == null) {
            return false;
        }
        return fvbVar.d;
    }

    public static final fux j() {
        e();
        return a().e();
    }

    public static final et k() {
        ftw ftwVar = a;
        if (ftwVar == null) {
            return null;
        }
        ftu ftuVar = ftwVar.w;
        if (ftuVar != null) {
            return ftuVar.a.b();
        }
        eu euVar = ftwVar.x;
        if (euVar == null) {
            return null;
        }
        return euVar.b();
    }

    public static final fvb l() {
        e();
        return a().p;
    }

    public static final List m() {
        e();
        return a().i;
    }

    public static final fux n() {
        e();
        return a().f();
    }

    public static final void o(eu euVar) {
        e();
        ftw ftwVarA = a();
        ftwVarA.x = euVar;
        ftu ftuVar = euVar != null ? new ftu(ftwVarA, euVar) : null;
        ftu ftuVar2 = ftwVarA.w;
        if (ftuVar2 != null) {
            ftuVar2.a();
        }
        ftwVarA.w = ftuVar;
        if (ftuVar != null) {
            ftwVarA.o();
        }
    }

    public static final void p(fvb fvbVar) {
        e();
        ftw ftwVarA = a();
        fvb fvbVar2 = ftwVarA.p;
        ftwVarA.p = fvbVar;
        if (ftwVarA.r()) {
            if (ftwVarA.n == null) {
                ftwVarA.n = new fue(ftwVarA.g, new pku((Object) ftwVarA));
                ftwVarA.h(ftwVarA.n, true);
                ftwVarA.n();
            }
            boolean z = fvbVar.e;
            fue fueVar = ftwVarA.n;
            fueVar.c = z;
            fueVar.f();
            fvu fvuVar = ftwVarA.c;
            fvuVar.a = z;
            fvuVar.a();
            if ((fvbVar2 != null && fvbVar2.d) != fvbVar.d) {
                ftwVarA.n.dC(ftwVarA.u);
            }
        } else {
            fue fueVar2 = ftwVarA.n;
            if (fueVar2 != null) {
                ftwVarA.k(fueVar2);
                ftwVarA.n = null;
                ftwVarA.c.a();
            }
        }
        ftwVarA.a.a(769, fvbVar);
    }

    public static final void q(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        e();
        ftw ftwVarA = a();
        fux fuxVarD = ftwVarA.d();
        if (ftwVarA.f() != fuxVarD) {
            ftwVarA.l(fuxVarD, i, true);
        }
    }

    private final int r(fus fusVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((fut) arrayList.get(i)).b == fusVar) {
                return i;
            }
        }
        return -1;
    }

    public final void c(fur furVar, fus fusVar) {
        d(furVar, fusVar, 0);
    }

    public final void d(fur furVar, fus fusVar, int i) {
        fut futVar;
        int i2;
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (fusVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        e();
        int iR = r(fusVar);
        if (iR < 0) {
            futVar = new fut(this, fusVar);
            this.c.add(futVar);
        } else {
            futVar = (fut) this.c.get(iR);
        }
        if (i != futVar.d) {
            futVar.d = i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i & 1;
        futVar.e = SystemClock.elapsedRealtime();
        fur furVar2 = futVar.c;
        furVar2.c();
        furVar.c();
        if (!furVar2.c.containsAll(furVar.c)) {
            nxb nxbVar = new nxb(futVar.c);
            nxbVar.j(furVar);
            futVar.c = nxbVar.g();
        } else if ((i3 | i2) == 0) {
            return;
        }
        a().n();
    }

    public final void f(fus fusVar) {
        if (fusVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        e();
        int iR = r(fusVar);
        if (iR >= 0) {
            this.c.remove(iR);
            a().n();
        }
    }
}
