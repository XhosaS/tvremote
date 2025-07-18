package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieb implements ied, iee, iec {
    private static final ThreadLocal b = new ThreadLocal();
    private Object c;
    private int e;
    private idf f;
    private idw g;
    private int h;
    private final ArrayList d = new ArrayList();
    public final ArrayList a = new ArrayList();

    private ieb() {
    }

    public static ied c(Object obj) {
        Looper.myLooper().getClass();
        ThreadLocal threadLocal = b;
        ieb iebVar = (ieb) threadLocal.get();
        if (iebVar == null) {
            iebVar = new ieb();
        } else {
            threadLocal.set(null);
        }
        iebVar.m(obj);
        return iebVar;
    }

    private final void s(int i) {
        a.ah(this.h == i, "Unexpected compiler state");
    }

    private final void t(int i, int i2) {
        int i3 = this.h;
        boolean z = true;
        if (i3 != i && i3 != i2) {
            z = false;
        }
        a.ah(z, "Unexpected compiler state");
    }

    @Override // defpackage.iec
    public final iea a() {
        iea ieaVarB = b();
        b.set(this);
        return ieaVarB;
    }

    public final iea b() {
        s(6);
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        Object obj = this.c;
        int i = this.e;
        ida idaVar = new ida(obj, hjt.e(i, (ids[]) arrayList.toArray(new ids[arrayList.size()])), arrayList2.toArray());
        this.h = 0;
        this.c = null;
        arrayList.clear();
        this.e = 0;
        arrayList2.clear();
        return idaVar;
    }

    public final void d(idf idfVar) {
        t(4, 5);
        idf idfVar2 = this.f;
        if (idfVar2 != null) {
            idw idwVar = this.g;
            idwVar.getClass();
            ArrayList arrayList = this.a;
            arrayList.add(4);
            arrayList.add(idfVar2);
            arrayList.add(idwVar);
            arrayList.add(idfVar);
        } else {
            ArrayList arrayList2 = this.a;
            arrayList2.add(9);
            arrayList2.add(idfVar);
        }
        this.f = null;
        this.g = null;
        if (this.h == 5) {
            g();
        } else {
            this.h = 3;
        }
    }

    public final void e(ieh iehVar) {
        h(iehVar);
        this.h = 4;
    }

    public final void f(idf idfVar) {
        o(idfVar);
        this.h = 4;
    }

    public final void g() {
        ArrayList arrayList = this.a;
        arrayList.add(0);
        arrayList.add(false);
        this.h = 6;
    }

    public final void h(ieh iehVar) {
        s(3);
        ida.b(iehVar, this.a);
    }

    public final void i(Executor executor) {
        s(3);
        a.ah(true, "Unexpected occurrence of async directive after goLazy()");
        ArrayList arrayList = this.a;
        arrayList.add(5);
        arrayList.add(executor);
    }

    public final void j(ieh iehVar, idp idpVar) {
        s(3);
        ArrayList arrayList = this.a;
        arrayList.add(2);
        arrayList.add(iehVar);
        arrayList.add(idpVar);
    }

    public final void k(ids... idsVarArr) {
        t(1, 2);
        for (ids idsVar : idsVarArr) {
            ArrayList arrayList = this.d;
            idsVar.getClass();
            arrayList.add(idsVar);
        }
        this.h = 2;
    }

    public final void l() {
        d(null);
    }

    public final void m(Object obj) {
        s(0);
        this.h = 1;
        this.c = obj;
    }

    public final void n(idf idfVar) {
        o(idfVar);
        g();
    }

    public final void o(idf idfVar) {
        s(3);
        ArrayList arrayList = this.a;
        arrayList.add(3);
        arrayList.add(idfVar);
    }

    @Override // defpackage.ief
    public final /* bridge */ /* synthetic */ void p(idw idwVar) {
        icw icwVar = icz.a;
        s(3);
        this.f = icwVar;
        idwVar.getClass();
        this.g = idwVar;
        this.h = 4;
    }

    public final void q() {
        s(2);
        this.e = Math.max(0, 0);
        this.h = 3;
    }

    @Override // defpackage.ief
    public final /* bridge */ /* synthetic */ void r(ieh iehVar, idp idpVar) {
        j(iehVar, idpVar);
        g();
    }
}
