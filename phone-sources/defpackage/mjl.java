package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjl extends fus implements iej {
    public final fuy a;
    public final fur b;
    public final eu c;
    public final ieh d;
    public mjw e;
    private final Context f;
    private final lfn g;
    private final SharedPreferences h;
    private final lie i;
    private final mkh j;
    private final mjm k;
    private final CopyOnWriteArrayList l = new CopyOnWriteArrayList();
    private boolean m;

    public mjl(Context context, lfn lfnVar, lie lieVar, SharedPreferences sharedPreferences, mkh mkhVar, ids idsVar, eu euVar, fuy fuyVar, ieh iehVar) {
        this.f = context;
        this.g = lfnVar;
        lieVar.getClass();
        this.i = lieVar;
        sharedPreferences.getClass();
        this.h = sharedPreferences;
        this.j = mkhVar;
        idsVar.ea(this);
        this.c = euVar;
        this.a = fuyVar;
        this.d = iehVar;
        if (fuyVar == null) {
            this.b = null;
            this.k = null;
            return;
        }
        this.k = new mka(this, 1);
        nxb nxbVar = new nxb();
        nxbVar.i("android.media.intent.category.LIVE_VIDEO");
        nxbVar.i("android.media.intent.category.LIVE_AUDIO");
        if (mkhVar != null) {
            nxbVar.j(mkhVar.a());
            mkhVar.c();
        }
        this.b = nxbVar.g();
        X();
    }

    private final void X() {
        String string = this.h.getString(krh.CAST_V2_ROUTE_ID, "");
        krd.b("sessionRestore routeId: ".concat(String.valueOf(string)));
        T(string);
    }

    public final void R(mjw mjwVar) {
        if (this.e != mjwVar) {
            this.e = mjwVar;
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((mjm) it.next()).a(this.e);
            }
        }
    }

    public final void S(mjm mjmVar) {
        fuy fuyVar = this.a;
        if (fuyVar == null) {
            return;
        }
        mjmVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.l;
        a.ah(!copyOnWriteArrayList.contains(mjmVar), "listener already registered");
        if (copyOnWriteArrayList.isEmpty()) {
            fur furVar = this.b;
            fuyVar.c(furVar, this);
            if (furVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            fuy.e();
            ftw ftwVarA = fuy.a();
            fux fuxVarF = ftwVarA.f();
            if (!fuxVarF.q() && !fuxVarF.u(furVar)) {
                fuxVarF = ftwVarA.d();
                ftwVarA.l(fuxVarF, 3, true);
            }
            onRouteSelected(fuyVar, fuxVarF);
        }
        copyOnWriteArrayList.add(mjmVar);
        mjw mjwVar = this.e;
        if (mjwVar != null) {
            mjmVar.a(mjwVar);
        }
    }

    public final void T(String str) {
        fux fuxVar;
        if (this.a == null || this.m || !fuy.n().p()) {
            return;
        }
        mjw mjwVar = this.e;
        if (mjwVar != null && (fuxVar = ((mkr) mjwVar).k) != null && fuxVar.t()) {
            krd.b("sessionRestore there's already a remote, skip");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List listM = fuy.m();
        krd.b("sessionRestore No. of available routes: " + listM.size());
        for (int i = 0; i < listM.size(); i++) {
            fux fuxVar2 = (fux) listM.get(i);
            String str2 = fuxVar2.d;
            if (str2.equals(str) && fuxVar2.h) {
                krd.b("sessionRestore found matching route, start restoring...".concat(String.valueOf(str2)));
                this.m = true;
                fuxVar2.n();
                return;
            }
        }
    }

    public final void U(mjm mjmVar) {
        fuy fuyVar = this.a;
        if (fuyVar == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.l;
        a.ah(copyOnWriteArrayList.contains(mjmVar), "listener not registered");
        copyOnWriteArrayList.remove(mjmVar);
        if (copyOnWriteArrayList.isEmpty()) {
            fuyVar.f(this);
            this.e = null;
        }
    }

    public final boolean V() {
        if (this.e != null) {
            return true;
        }
        if (!this.g.bY()) {
            return false;
        }
        try {
            return nmg.d(this.f).h().a() != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean W(fux fuxVar) {
        mkh mkhVar = this.j;
        return mkhVar != null && mkhVar.d(fuxVar);
    }

    @Override // defpackage.iej
    public final void dM() {
        krd.b("sessionRestore network reconnected");
        X();
    }

    @Override // defpackage.fus
    public final void onRouteAdded(fuy fuyVar, fux fuxVar) {
        krd.b("new route added ".concat(String.valueOf(fuxVar.d)));
        if (this.j == null || !W(fuxVar)) {
            return;
        }
        this.i.f();
        X();
    }

    @Override // defpackage.fus
    public final void onRouteSelected(fuy fuyVar, fux fuxVar) {
        krd.b("routeInfo: ".concat(String.valueOf(String.valueOf(fuxVar))));
        mkh mkhVar = this.j;
        if (mkhVar == null || !W(fuxVar)) {
            return;
        }
        if (this.m) {
            this.m = false;
        } else {
            this.h.edit().remove(krh.CAST_V2_ROUTE_ID).remove(krh.CAST_V2_SESSION_ID).apply();
        }
        mkhVar.b(fuxVar, this.k);
    }

    @Override // defpackage.fus
    public final void onRouteUnselected(fuy fuyVar, fux fuxVar) {
        krd.b("routeInfo: ".concat(String.valueOf(String.valueOf(fuxVar))));
        mjw mjwVar = this.e;
        if (mjwVar != null) {
            fux fuxVar2 = ((mkr) mjwVar).k;
            if (fuxVar2 != null) {
                if (!fuxVar2.d.equals(fuxVar.d)) {
                    return;
                }
            }
            this.e.n();
            R(null);
        }
    }
}
