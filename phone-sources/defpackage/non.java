package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.appcompat.R;
import android.util.Log;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class non implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ non(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, ont] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, onu] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, onv] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, ono] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, nsp] */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ony] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, onr, onu, onv] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, onr, onu, onv] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, nzs] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        boolean z3 = true;
        switch (this.c) {
            case 0:
                ((noo) this.a).o((fur) this.b);
                return;
            case 1:
                String str = ((nrh) this.a).a;
                nla nlaVar = ((nkz) this.b).a;
                if (nrv.i(str, nlaVar.i)) {
                    z3 = false;
                } else {
                    nlaVar.i = str;
                }
                nsf.e();
                jys jysVar = nlaVar.v;
                if (jysVar != null && (z3 || nlaVar.d)) {
                    jysVar.K();
                }
                nlaVar.d = false;
                return;
            case 2:
                nrw nrwVar = (nrw) this.a;
                njz njzVar = nrwVar.d;
                nrs nrsVar = (nrs) this.b;
                if (!nrv.i(njzVar, nrsVar.c)) {
                    nrsVar.c = njzVar;
                    nrsVar.s.J(nrsVar.c);
                }
                double d = nrwVar.a;
                if (Double.isNaN(d) || Math.abs(d - nrsVar.j) <= 1.0E-7d) {
                    z = false;
                } else {
                    nrsVar.j = d;
                    z = true;
                }
                boolean z4 = nrwVar.b;
                if (z4 != nrsVar.g) {
                    nrsVar.g = z4;
                    z = true;
                }
                Double.isNaN(nrwVar.g);
                nsf.e();
                jys jysVar2 = nrsVar.s;
                if (jysVar2 != null && (z || nrsVar.i)) {
                    jysVar2.M();
                }
                int i = nrwVar.c;
                if (i != nrsVar.l) {
                    nrsVar.l = i;
                    z2 = true;
                } else {
                    z2 = false;
                }
                nsf.e();
                if (jysVar2 != null && (z2 || nrsVar.i)) {
                    jysVar2.H(nrsVar.l);
                }
                int i2 = nrwVar.e;
                if (i2 != nrsVar.m) {
                    nrsVar.m = i2;
                } else {
                    z3 = false;
                }
                nsf.e();
                if (jysVar2 != null && (z3 || nrsVar.i)) {
                    jysVar2.L(nrsVar.m);
                }
                if (!nrv.i(nrsVar.k, nrwVar.f)) {
                    nrsVar.k = nrwVar.f;
                }
                nrsVar.i = false;
                return;
            case 3:
                String str2 = ((nrh) this.b).a;
                nrs nrsVar2 = (nrs) this.a;
                if (nrv.i(str2, nrsVar2.f)) {
                    z3 = false;
                } else {
                    nrsVar2.f = str2;
                }
                nsf.e();
                jys jysVar3 = nrsVar2.s;
                if (jysVar3 != null && (z3 || nrsVar2.h)) {
                    jysVar3.K();
                }
                nrsVar2.h = false;
                return;
            case 4:
                nss nssVar = (nss) this.a;
                List list = nssVar.d;
                if (list != null && !list.isEmpty() && !nssVar.h && (connectivityManager = nssVar.b) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    activeNetworkInfo.isConnected();
                }
                this.b.a();
                return;
            case 5:
                ?? r0 = this.b;
                Object obj = this.a;
                synchronized (obj) {
                    try {
                        if (r0 == 0) {
                            ((nus) obj).g("Null service connection");
                            return;
                        }
                        try {
                            ((nus) obj).f = new pkg((IBinder) r0);
                            ((nus) obj).a = 2;
                            ((nus) obj).a();
                            return;
                        } catch (RemoteException e) {
                            ((nus) obj).g(e.getMessage());
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 6:
                ((nus) this.b).c(((nuu) this.a).a);
                return;
            case 7:
                nzf nzfVar = (nzf) this.a;
                nzd nzdVar = (nzd) nzfVar.e.l.get(nzfVar.b);
                if (nzdVar == null) {
                    return;
                }
                if (!((nve) this.b).c()) {
                    nzdVar.aC((nve) this.b);
                    return;
                }
                nzfVar.d = true;
                nwj nwjVar = nzfVar.a;
                if (nwjVar.i()) {
                    nzfVar.c();
                    return;
                }
                try {
                    nwjVar.I(null, nwjVar.A());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    ((nzf) this.a).a.C("Failed to get service from broker.");
                    nzdVar.aC(new nve(10));
                    return;
                }
            case 8:
                Object obj2 = ((nzt) this.a).a;
                ?? r1 = this.b;
                if (obj2 == null) {
                    return;
                }
                r1.a(obj2);
                return;
            case 9:
                onl onlVar = (onl) this.a;
                nve nveVar = onlVar.b;
                boolean zC = nveVar.c();
                Object obj3 = this.b;
                if (zC) {
                    obz obzVar = onlVar.c;
                    ocv.aF(obzVar);
                    nve nveVar2 = obzVar.c;
                    if (!nveVar2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(nveVar2))), new Exception());
                        oaa oaaVar = (oaa) obj3;
                        oaaVar.f.b(nveVar2);
                        oaaVar.e.n();
                        return;
                    }
                    oaa oaaVar2 = (oaa) obj3;
                    nzf nzfVar2 = oaaVar2.f;
                    obm obmVarA = obzVar.a();
                    Set set = oaaVar2.c;
                    if (obmVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        nzfVar2.b(new nve(4));
                    } else {
                        nzfVar2.f = obmVarA;
                        nzfVar2.c = set;
                        nzfVar2.c();
                    }
                } else {
                    ((oaa) obj3).f.b(nveVar);
                }
                ((oaa) obj3).e.n();
                return;
            case 10:
                ((Activity) ((rbi) this.a).b).startActivity((Intent) this.b);
                return;
            case 11:
                ((Activity) this.b).startActivityForResult((Intent) this.a, R.styleable.AppCompatTheme_windowFixedWidthMinor);
                return;
            case 12:
                Object obj4 = this.a;
                if (((ooe) obj4).c) {
                    ((onp) this.b).b.v();
                    return;
                }
                try {
                    ((onp) this.b).b.t(((onp) this.b).a.a((onz) obj4));
                    return;
                } catch (onx e3) {
                    if (!(e3.getCause() instanceof Exception)) {
                        ((onp) this.b).b.s(e3);
                        return;
                    } else {
                        ((onp) this.b).b.s((Exception) e3.getCause());
                        return;
                    }
                } catch (Exception e4) {
                    ((onp) this.b).b.s(e4);
                    return;
                }
            case 13:
                try {
                    onz onzVar = (onz) ((onw) this.b).b.a((onz) this.a);
                    if (onzVar == 0) {
                        ((onw) this.b).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ?? r12 = this.b;
                    Executor executor = ooc.b;
                    onzVar.n(executor, r12);
                    onzVar.m(executor, r12);
                    onzVar.j(executor, r12);
                    return;
                } catch (onx e5) {
                    if (!(e5.getCause() instanceof Exception)) {
                        ((onw) this.b).a.s(e5);
                        return;
                    } else {
                        ((onw) this.b).a.s((Exception) e5.getCause());
                        return;
                    }
                } catch (Exception e6) {
                    ((onw) this.b).a.s(e6);
                    return;
                }
            case 14:
                Object obj5 = this.b;
                synchronized (((ons) obj5).a) {
                    ?? r02 = ((ons) obj5).b;
                    if (r02 != 0) {
                        r02.a((onz) this.a);
                    }
                }
                return;
            case 15:
                Object obj6 = this.b;
                synchronized (((ons) obj6).a) {
                    ?? r03 = ((ons) obj6).b;
                    if (r03 != 0) {
                        Exception excD = ((onz) this.a).d();
                        ocv.aF(excD);
                        r03.d(excD);
                    }
                }
                return;
            case 16:
                Object obj7 = this.b;
                synchronized (((ons) obj7).a) {
                    ?? r04 = ((ons) obj7).b;
                    if (r04 != 0) {
                        r04.e(((onz) this.a).e());
                    }
                }
                return;
            case 17:
                try {
                    onz onzVarA = ((onw) this.b).b.a(((onz) this.a).e());
                    ?? r13 = this.b;
                    Executor executor2 = ooc.b;
                    onzVarA.n(executor2, r13);
                    onzVarA.m(executor2, r13);
                    onzVarA.j(executor2, r13);
                    return;
                } catch (CancellationException unused) {
                    ((onw) this.b).c();
                    return;
                } catch (onx e7) {
                    if (e7.getCause() instanceof Exception) {
                        ((onw) this.b).d((Exception) e7.getCause());
                        return;
                    } else {
                        ((onw) this.b).d(e7);
                        return;
                    }
                } catch (Exception e8) {
                    ((onw) this.b).d(e8);
                    return;
                }
            case 18:
                try {
                    ((ooe) this.b).t(this.a.call());
                    return;
                } catch (Exception e9) {
                    ((ooe) this.b).s(e9);
                    return;
                } catch (Throwable th2) {
                    ((ooe) this.b).s(new RuntimeException(th2));
                    return;
                }
            case 19:
                ((ugu) this.b).execute(this.a);
                return;
            default:
                ((ugu) this.b).execute(this.a);
                return;
        }
    }

    public /* synthetic */ non(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public non(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public non(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public non(nrs nrsVar, nrh nrhVar, int i) {
        this.c = i;
        this.a = nrsVar;
        this.b = nrhVar;
    }

    public non(nzf nzfVar, nve nveVar, int i) {
        this.c = i;
        this.b = nveVar;
        this.a = nzfVar;
    }
}
