package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noo extends noh {
    public static final nsf a = new nsf("MediaRouterProxy");
    public final fuy b;
    public final nmj c;
    public final Map d = new HashMap();
    public noq e;
    public boolean f;
    public boolean g;
    public boolean h;

    public noo(Context context, fuy fuyVar, nmj nmjVar, nrn nrnVar) {
        this.b = fuyVar;
        this.c = nmjVar;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        nsf.e();
        this.e = new noq(nmjVar);
        new Intent(context, (Class<?>) fvg.class).setPackage(context.getPackageName());
        this.f = !context.getPackageManager().queryBroadcastReceivers(r4, 0).isEmpty();
        this.g = true;
        nrnVar.a(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).k(new nmn(this, 3));
    }

    @Override // defpackage.noi
    public final Bundle a(String str) {
        for (fux fuxVar : fuy.m()) {
            if (fuxVar.d.equals(str)) {
                return fuxVar.q;
            }
        }
        return null;
    }

    @Override // defpackage.noi
    public final String b() {
        return fuy.n().d;
    }

    @Override // defpackage.noi
    public final void c(Bundle bundle, int i) {
        fur furVarA = fur.a(bundle);
        if (furVarA == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(furVarA, i);
        } else {
            new ogh(Looper.getMainLooper()).post(new fk(this, furVarA, i, 8));
        }
    }

    @Override // defpackage.noi
    public final void d(Bundle bundle, nok nokVar) {
        fur furVarA = fur.a(bundle);
        if (furVarA == null) {
            return;
        }
        Map map = this.d;
        if (!map.containsKey(furVarA)) {
            map.put(furVarA, new HashSet());
        }
        ((Set) map.get(furVarA)).add(new nol(nokVar, this, this.e));
    }

    @Override // defpackage.noi
    public final void e() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.b.f((fus) it2.next());
            }
        }
        map.clear();
    }

    @Override // defpackage.noi
    public final void f(Bundle bundle) {
        fur furVarA = fur.a(bundle);
        if (furVarA == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o(furVarA);
        } else {
            new ogh(Looper.getMainLooper()).post(new non(this, furVarA, 0));
        }
    }

    @Override // defpackage.noi
    public final void g() {
        fuy.j().n();
    }

    @Override // defpackage.noi
    public final void h(String str) {
        nsf.e();
        for (fux fuxVar : fuy.m()) {
            if (fuxVar.d.equals(str)) {
                nsf.e();
                fuxVar.n();
                return;
            }
        }
    }

    @Override // defpackage.noi
    public final void i(int i) {
        fuy.q(i);
    }

    @Override // defpackage.noi
    public final boolean j() {
        fuy.e();
        fux fuxVar = fuy.a().r;
        return fuxVar != null && fuy.n().d.equals(fuxVar.d);
    }

    @Override // defpackage.noi
    public final boolean l() {
        return fuy.n().d.equals(fuy.j().d);
    }

    @Override // defpackage.noi
    public final boolean m(Bundle bundle, int i) {
        fur furVarA = fur.a(bundle);
        if (furVarA == null) {
            return false;
        }
        fuy.e();
        ftw ftwVarA = fuy.a();
        if (furVarA.d()) {
            return false;
        }
        if ((i & 2) == 0 && ftwVarA.m) {
            return true;
        }
        fvb fvbVar = ftwVarA.p;
        boolean z = fvbVar != null && fvbVar.c && ftwVarA.r();
        ArrayList arrayList = ftwVarA.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fux fuxVar = (fux) arrayList.get(i2);
            if (((i & 1) == 0 || !fuxVar.q()) && ((!z || fuxVar.q() || fuxVar.i() == ftwVarA.n) && fuxVar.u(furVarA))) {
                return true;
            }
        }
        return false;
    }

    public final void n(fur furVar, int i) {
        Set set = (Set) this.d.get(furVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.d(furVar, (fus) it.next(), i);
        }
    }

    public final void o(fur furVar) {
        Set set = (Set) this.d.get(furVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.f((fus) it.next());
        }
    }
}
