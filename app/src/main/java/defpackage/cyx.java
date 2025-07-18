package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cyx extends dok implements Cloneable {
    private Object A;
    private List B;
    private cyx C;
    private cyx D;
    private Float E;
    private boolean F = true;
    private boolean G;
    private boolean H;
    public final czb a;
    private final Context w;
    private final Class x;
    private final cyk y;
    private czc z;

    static {
    }

    protected cyx(cyg cygVar, czb czbVar, Class cls, Context context) {
        this.a = czbVar;
        this.x = cls;
        this.w = context;
        cyk cykVar = czbVar.a.c;
        czc czcVar = (czc) cykVar.d.get(cls);
        if (czcVar == null) {
            for (Map.Entry entry : cykVar.d.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    czcVar = (czc) entry.getValue();
                }
            }
        }
        this.z = czcVar == null ? cyk.a : czcVar;
        this.y = cygVar.c;
        Iterator it = czbVar.d.iterator();
        while (it.hasNext()) {
            a((doq) it.next());
        }
        n(czbVar.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final don O(Object obj, dpf dpfVar, dop dopVar, czc czcVar, cyn cynVar, int i, int i2, dok dokVar, Executor executor) {
        dop dolVar;
        dop dopVar2;
        cyx cyxVar;
        don donVarP;
        cyn cynVar2;
        dok dokVar2 = dokVar;
        if (this.D != null) {
            dolVar = new dol(obj, dopVar);
            dopVar2 = dolVar;
        } else {
            dolVar = dopVar;
            dopVar2 = null;
        }
        cyx cyxVar2 = this.C;
        if (cyxVar2 == null) {
            cyxVar = this;
            donVarP = P(obj, dpfVar, dokVar2, dolVar, czcVar, cynVar, i, i2, executor);
        } else {
            if (this.H) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            czc czcVar2 = true == cyxVar2.F ? czcVar : cyxVar2.z;
            if (dok.G(cyxVar2.b, 8)) {
                cynVar2 = cyxVar2.e;
            } else {
                int i3 = cyw.b[cynVar.ordinal()];
                if (i3 == 1) {
                    cynVar2 = cyn.NORMAL;
                } else if (i3 == 2) {
                    cynVar2 = cyn.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.e))));
                    }
                    cynVar2 = cyn.IMMEDIATE;
                }
            }
            cyn cynVar3 = cynVar2;
            cyx cyxVar3 = this.C;
            int i4 = cyxVar3.l;
            int i5 = cyxVar3.k;
            if (dqm.k(i, i2) && !this.C.H()) {
                i4 = dokVar2.l;
                i5 = dokVar2.k;
            }
            int i6 = i5;
            int i7 = i4;
            dou douVar = new dou(obj, dolVar);
            don donVarP2 = P(obj, dpfVar, dokVar2, douVar, czcVar, cynVar, i, i2, executor);
            this.H = true;
            cyx cyxVar4 = this.C;
            cyxVar = this;
            don donVarO = cyxVar4.O(obj, dpfVar, douVar, czcVar2, cynVar3, i7, i6, cyxVar4, executor);
            cyxVar.H = false;
            douVar.a = donVarP2;
            douVar.b = donVarO;
            donVarP = douVar;
            dokVar2 = dokVar;
        }
        if (dopVar2 == null) {
            return donVarP;
        }
        cyx cyxVar5 = cyxVar.D;
        int i8 = cyxVar5.l;
        int i9 = cyxVar5.k;
        if (dqm.k(i, i2) && !cyxVar.D.H()) {
            i8 = dokVar2.l;
            i9 = dokVar2.k;
        }
        int i10 = i9;
        cyx cyxVar6 = cyxVar.D;
        dol dolVar2 = dopVar2;
        don donVarO2 = cyxVar6.O(obj, dpfVar, dolVar2, cyxVar6.z, cyxVar6.e, i8, i10, cyxVar6, executor);
        dolVar2.a = donVarP;
        dolVar2.b = donVarO2;
        return dolVar2;
    }

    private final don P(Object obj, dpf dpfVar, dok dokVar, dop dopVar, czc czcVar, cyn cynVar, int i, int i2, Executor executor) {
        Object obj2 = this.A;
        List list = this.B;
        dpn dpnVar = czcVar.a;
        Context context = this.w;
        Class cls = this.x;
        cyk cykVar = this.y;
        return new dot(context, cykVar, obj, obj2, cls, dokVar, i, i2, cynVar, dpfVar, list, dopVar, cykVar.e, dpnVar, executor);
    }

    public cyx a(doq doqVar) {
        if (this.t) {
            return clone().a(doqVar);
        }
        if (doqVar != null) {
            if (this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(doqVar);
        }
        M();
        return this;
    }

    @Override // defpackage.dok
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public cyx n(dok dokVar) {
        dqk.d(dokVar, "Argument must not be null");
        return (cyx) super.n(dokVar);
    }

    public final cyx c(cyx cyxVar) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        Context context = this.w;
        cyx cyxVar2 = (cyx) cyxVar.D(context.getTheme());
        ConcurrentMap concurrentMap = dpr.a;
        String packageName = context.getPackageName();
        daj dajVar = (daj) dpr.a.get(packageName);
        if (dajVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            dpt dptVar = new dpt(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            dajVar = (daj) dpr.a.putIfAbsent(packageName, dptVar);
            if (dajVar == null) {
                dajVar = dptVar;
            }
        }
        return (cyx) cyxVar2.C(new dpq(context.getResources().getConfiguration().uiMode & 48, dajVar));
    }

    @Override // defpackage.dok
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cyx o() {
        cyx cyxVar = (cyx) super.o();
        cyxVar.z = cyxVar.z.clone();
        List list = cyxVar.B;
        if (list != null) {
            cyxVar.B = new ArrayList(list);
        }
        cyx cyxVar2 = cyxVar.C;
        if (cyxVar2 != null) {
            cyxVar.C = cyxVar2.clone();
        }
        cyx cyxVar3 = cyxVar.D;
        if (cyxVar3 != null) {
            cyxVar.D = cyxVar3.clone();
        }
        return cyxVar;
    }

    public cyx e(Bitmap bitmap) {
        return k(bitmap).n(dor.b(dcr.b));
    }

    @Override // defpackage.dok
    public final boolean equals(Object obj) {
        if (obj instanceof cyx) {
            cyx cyxVar = (cyx) obj;
            if (super.equals(cyxVar) && Objects.equals(this.x, cyxVar.x) && this.z.equals(cyxVar.z) && Objects.equals(this.A, cyxVar.A) && Objects.equals(this.B, cyxVar.B) && Objects.equals(this.C, cyxVar.C) && Objects.equals(this.D, cyxVar.D)) {
                Float f = cyxVar.E;
                if (Objects.equals(null, null) && this.F == cyxVar.F && this.G == cyxVar.G) {
                    return true;
                }
            }
        }
        return false;
    }

    public cyx f(Drawable drawable) {
        return k(drawable).n(dor.b(dcr.b));
    }

    public cyx g(Uri uri) {
        return l(uri, k(uri));
    }

    public cyx h(Integer num) {
        return c(k(num));
    }

    @Override // defpackage.dok
    public final int hashCode() {
        return (((dqm.c(null, dqm.c(this.D, dqm.c(this.C, dqm.c(this.B, dqm.c(this.A, dqm.c(this.z, dqm.c(this.x, super.hashCode()))))))) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0);
    }

    public cyx i(Object obj) {
        return k(obj);
    }

    public cyx j(byte[] bArr) {
        cyx cyxVarK = k(bArr);
        if (!dok.G(cyxVarK.b, 4)) {
            cyxVarK = cyxVarK.n(dor.b(dcr.b));
        }
        if (dok.G(cyxVarK.b, 256)) {
            return cyxVarK;
        }
        if (dor.a == null) {
            dor.a = (dor) ((dor) new dor().N()).q();
        }
        return cyxVarK.n(dor.a);
    }

    public final cyx k(Object obj) {
        if (this.t) {
            return clone().k(obj);
        }
        this.A = obj;
        this.G = true;
        M();
        return this;
    }

    public final cyx l(Uri uri, cyx cyxVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? cyxVar : c(cyxVar);
    }

    public cyx m(czc czcVar) {
        if (this.t) {
            return clone().m(czcVar);
        }
        dqk.d(czcVar, "Argument must not be null");
        this.z = czcVar;
        this.F = false;
        M();
        return this;
    }

    public final void p(dpf dpfVar, dok dokVar, Executor executor) {
        dqk.d(dpfVar, "Argument must not be null");
        if (!this.G) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        don donVarO = O(new Object(), dpfVar, null, this.z, dokVar.e, dokVar.l, dokVar.k, dokVar, executor);
        don donVarD = dpfVar.d();
        if (!donVarO.m(donVarD) || (!dokVar.j && donVarD.l())) {
            czb czbVar = this.a;
            czbVar.k(dpfVar);
            dpfVar.f(donVarO);
            czbVar.s(dpfVar, donVarO);
            return;
        }
        dqk.d(donVarD, "Argument must not be null");
        if (donVarD.n()) {
            return;
        }
        donVarD.b();
    }
}
