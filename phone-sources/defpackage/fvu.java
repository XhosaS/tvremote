package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvu {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final AbstractCollection f;
    public final Object g;
    public final Object h;
    final Object i;

    public fvu(Looper looper, ecn ecnVar, ecx ecxVar) {
        this(new CopyOnWriteArraySet(), looper, ecnVar, ecxVar, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecu, java.lang.Object] */
    private final void i() {
        if (this.b) {
            a.ab(Thread.currentThread() == this.c.a().getThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ((Handler) this.d).post(this.h);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.util.List] */
    public final void b() {
        if (this.b) {
            ArrayList<ServiceInfo> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = ((PackageManager) this.e).queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(((Context) this.c).getPackageName(), serviceInfo.packageName)) {
                        arrayList2.add(serviceInfo);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator<ResolveInfo> it2 = ((PackageManager) this.e).queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (true) {
                byte[] bArr = null;
                int i2 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (fuy.h() && !arrayList.isEmpty()) {
                        for (ServiceInfo serviceInfo3 : arrayList) {
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    ?? r9 = this.f;
                    ArrayList arrayList3 = (ArrayList) r9;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        ComponentName componentName = ((fvs) arrayList3.get(i3)).a;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i2 < 0) {
                        fvs fvsVar = new fvs((Context) this.c, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        fvsVar.n = new pku(this, bArr);
                        fvsVar.o();
                        arrayList3.add(i, fvsVar);
                        ((ftw) this.i).h(fvsVar, false);
                        i++;
                    } else if (i2 >= i) {
                        int i4 = i + 1;
                        fvs fvsVar2 = (fvs) arrayList3.get(i2);
                        fvsVar2.o();
                        if (fvsVar2.d == null && fvsVar2.r()) {
                            fvsVar2.p();
                            fvsVar2.f();
                        }
                        Collections.swap(r9, i2, i);
                        i = i4;
                    }
                }
            }
            ArrayList arrayList4 = (ArrayList) this.f;
            if (i < arrayList4.size()) {
                for (int size2 = arrayList4.size() - 1; size2 >= i; size2--) {
                    fvs fvsVar3 = (fvs) arrayList4.get(size2);
                    ((ftw) this.i).k(fvsVar3);
                    arrayList4.remove(fvsVar3);
                    fvsVar3.n = null;
                    if (fvsVar3.c) {
                        fvsVar3.c = false;
                        fvsVar3.q();
                    }
                }
            }
        }
    }

    public final void c(Object obj) {
        obj.getClass();
        synchronized (this.d) {
            if (this.a) {
                return;
            }
            ((CopyOnWriteArraySet) this.f).add(new ecy(obj));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ecu, java.lang.Object] */
    public final void d() {
        i();
        Object obj = this.h;
        ArrayDeque arrayDeque = (ArrayDeque) obj;
        if (arrayDeque.isEmpty()) {
            return;
        }
        ?? r2 = this.c;
        if (!r2.c()) {
            r2.k(r2.g(1));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.i;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(obj);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void e(int i, ecw ecwVar) {
        i();
        ((ArrayDeque) this.h).add(new fk(new CopyOnWriteArraySet(this.f), i, ecwVar, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ecx, java.lang.Object] */
    public final void f() {
        i();
        synchronized (this.d) {
            this.a = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ecy) it.next()).a(this.e);
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ecx, java.lang.Object] */
    public final void g(Object obj) {
        i();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ecy ecyVar = (ecy) it.next();
            if (ecyVar.a.equals(obj)) {
                ecyVar.a(this.e);
                copyOnWriteArraySet.remove(ecyVar);
            }
        }
    }

    public final void h(int i, ecw ecwVar) {
        e(i, ecwVar);
        d();
    }

    public fvu(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, ecn ecnVar, ecx ecxVar, boolean z) {
        this.g = ecnVar;
        this.f = copyOnWriteArraySet;
        this.e = ecxVar;
        this.d = new Object();
        this.i = new ArrayDeque();
        this.h = new ArrayDeque();
        this.c = ecnVar.b(looper, new etv(this, 1));
        this.b = z;
    }

    public fvu(Context context, ftw ftwVar) {
        this.f = new ArrayList();
        this.g = new fvt(this);
        this.h = new foe(this, 17, null);
        this.c = context;
        this.i = ftwVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }
}
