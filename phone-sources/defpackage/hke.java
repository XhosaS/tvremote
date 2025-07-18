package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
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
public final class hke extends huu implements Cloneable {
    private Float A;
    private boolean B = true;
    private boolean C;
    private boolean D;
    private final Context r;
    private final hkg s;
    private final Class t;
    private final hjv u;
    private hkh v;
    private Object w;
    private List x;
    private hke y;
    private hke z;

    static {
    }

    protected hke(hjr hjrVar, hkg hkgVar, Class cls, Context context) {
        this.s = hkgVar;
        this.t = cls;
        this.r = context;
        hjv hjvVar = hkgVar.a.b;
        hkh hkhVar = (hkh) hjvVar.c.get(cls);
        if (hkhVar == null) {
            for (Map.Entry entry : hjvVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hkhVar = (hkh) entry.getValue();
                }
            }
        }
        this.v = hkhVar == null ? hjv.a : hkhVar;
        this.u = hjrVar.b;
        Iterator it = hkgVar.d.iterator();
        while (it.hasNext()) {
            a((hvb) it.next());
        }
        h(hkgVar.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hux M(Object obj, hvm hvmVar, hvb hvbVar, huz huzVar, hkh hkhVar, hjw hjwVar, int i, int i2, huu huuVar, Executor executor) {
        huz huzVar2;
        huz huvVar;
        hke hkeVar;
        hux huxVarN;
        hjw hjwVar2;
        huu huuVar2 = huuVar;
        if (this.z != null) {
            huvVar = new huv(obj, huzVar);
            huzVar2 = huvVar;
        } else {
            huzVar2 = null;
            huvVar = huzVar;
        }
        hke hkeVar2 = this.y;
        if (hkeVar2 == null) {
            hkeVar = this;
            huxVarN = N(obj, hvmVar, hvbVar, huuVar2, huvVar, hkhVar, hjwVar, i, i2, executor);
        } else {
            if (this.D) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            hkh hkhVar2 = true == hkeVar2.B ? hkhVar : hkeVar2.v;
            if (super.E(8)) {
                hjwVar2 = hkeVar2.c;
            } else {
                int i3 = hkd.b[hjwVar.ordinal()];
                if (i3 == 1) {
                    hjwVar2 = hjw.NORMAL;
                } else if (i3 == 2) {
                    hjwVar2 = hjw.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.c))));
                    }
                    hjwVar2 = hjw.IMMEDIATE;
                }
            }
            hjw hjwVar3 = hjwVar2;
            hke hkeVar3 = this.y;
            int i4 = hkeVar3.g;
            int i5 = hkeVar3.f;
            if (hwp.l(i, i2) && !this.y.F()) {
                i4 = huuVar2.g;
                i5 = huuVar2.f;
            }
            int i6 = i5;
            hve hveVar = new hve(obj, huvVar);
            hux huxVarN2 = N(obj, hvmVar, hvbVar, huuVar2, hveVar, hkhVar, hjwVar, i, i2, executor);
            this.D = true;
            hke hkeVar4 = this.y;
            hkeVar = this;
            hux huxVarM = hkeVar4.M(obj, hvmVar, hvbVar, hveVar, hkhVar2, hjwVar3, i4, i6, hkeVar4, executor);
            hve hveVar2 = hveVar;
            hkeVar.D = false;
            hveVar2.a = huxVarN2;
            hveVar2.b = huxVarM;
            huuVar2 = huuVar;
            huxVarN = hveVar2;
        }
        hux huxVar = huxVarN;
        if (huzVar2 == null) {
            return huxVar;
        }
        hke hkeVar5 = hkeVar.z;
        int i7 = hkeVar5.g;
        int i8 = hkeVar5.f;
        if (hwp.l(i, i2) && !hkeVar.z.F()) {
            i7 = huuVar2.g;
            i8 = huuVar2.f;
        }
        int i9 = i8;
        hke hkeVar6 = hkeVar.z;
        huv huvVar2 = huzVar2;
        hux huxVarM2 = hkeVar6.M(obj, hvmVar, hvbVar, huvVar2, hkeVar6.v, hkeVar6.c, i7, i9, hkeVar6, executor);
        huvVar2.a = huxVar;
        huvVar2.b = huxVarM2;
        return huvVar2;
    }

    private final hux N(Object obj, hvm hvmVar, hvb hvbVar, huu huuVar, huz huzVar, hkh hkhVar, hjw hjwVar, int i, int i2, Executor executor) {
        Object obj2 = this.w;
        List list = this.x;
        hvw hvwVar = hkhVar.a;
        Context context = this.r;
        Class cls = this.t;
        hjv hjvVar = this.u;
        return new hvd(context, hjvVar, obj, obj2, cls, huuVar, i, i2, hjwVar, hvmVar, hvbVar, list, huzVar, hjvVar.h, hvwVar, executor);
    }

    private final void O(hvm hvmVar, hvb hvbVar, huu huuVar, Executor executor) {
        hju.p(hvmVar);
        if (!this.C) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        hux huxVarM = M(new Object(), hvmVar, hvbVar, null, this.v, huuVar.c, huuVar.g, huuVar.f, huuVar, executor);
        hux huxVarC = hvmVar.c();
        if (!huxVarM.m(huxVarC) || (!huuVar.e && huxVarC.l())) {
            hkg hkgVar = this.s;
            hkgVar.j(hvmVar);
            hvmVar.f(huxVarM);
            hkgVar.q(hvmVar, huxVarM);
            return;
        }
        hju.p(huxVarC);
        if (huxVarC.n()) {
            return;
        }
        huxVarC.b();
    }

    public final hke a(hvb hvbVar) {
        if (this.o) {
            return clone().a(hvbVar);
        }
        if (hvbVar != null) {
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(hvbVar);
        }
        J();
        return this;
    }

    @Override // defpackage.huu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hke h(huu huuVar) {
        hju.p(huuVar);
        return (hke) super.h(huuVar);
    }

    @Override // defpackage.huu
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final hke i() {
        hke hkeVar = (hke) super.i();
        hkeVar.v = hkeVar.v.clone();
        List list = hkeVar.x;
        if (list != null) {
            hkeVar.x = new ArrayList(list);
        }
        hke hkeVar2 = hkeVar.y;
        if (hkeVar2 != null) {
            hkeVar.y = hkeVar2.clone();
        }
        hke hkeVar3 = hkeVar.z;
        if (hkeVar3 != null) {
            hkeVar.z = hkeVar3.clone();
        }
        return hkeVar;
    }

    public final hke d(hvb hvbVar) {
        if (this.o) {
            return clone().d(hvbVar);
        }
        this.x = null;
        return a(hvbVar);
    }

    public final hke e(Uri uri) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        hke hkeVarF = f(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return hkeVarF;
        }
        Context context = this.r;
        hke hkeVar = (hke) hkeVarF.y(context.getTheme());
        ConcurrentMap concurrentMap = hvy.a;
        String packageName = context.getPackageName();
        hlg hlgVar = (hlg) hvy.a.get(packageName);
        if (hlgVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            hwa hwaVar = new hwa(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            hlgVar = (hlg) hvy.a.putIfAbsent(packageName, hwaVar);
            if (hlgVar == null) {
                hlgVar = hwaVar;
            }
        }
        return (hke) hkeVar.x(new hvx(context.getResources().getConfiguration().uiMode & 48, hlgVar));
    }

    @Override // defpackage.huu
    public final boolean equals(Object obj) {
        if (obj instanceof hke) {
            hke hkeVar = (hke) obj;
            if (super.equals(hkeVar) && Objects.equals(this.t, hkeVar.t) && this.v.equals(hkeVar.v) && Objects.equals(this.w, hkeVar.w) && Objects.equals(this.x, hkeVar.x) && Objects.equals(this.y, hkeVar.y) && Objects.equals(this.z, hkeVar.z)) {
                Float f = hkeVar.A;
                if (Objects.equals(null, null) && this.B == hkeVar.B && this.C == hkeVar.C) {
                    return true;
                }
            }
        }
        return false;
    }

    public final hke f(Object obj) {
        if (this.o) {
            return clone().f(obj);
        }
        this.w = obj;
        this.C = true;
        J();
        return this;
    }

    public final hke g(hkh hkhVar) {
        if (this.o) {
            return clone().g(hkhVar);
        }
        hju.p(hkhVar);
        this.v = hkhVar;
        this.B = false;
        J();
        return this;
    }

    @Override // defpackage.huu
    public final int hashCode() {
        return hwp.c(this.C ? 1 : 0, hwp.c(this.B ? 1 : 0, hwp.d(null, hwp.d(this.z, hwp.d(this.y, hwp.d(this.x, hwp.d(this.w, hwp.d(this.v, hwp.d(this.t, super.hashCode())))))))));
    }

    public final hva j(int i, int i2) {
        hva hvaVar = new hva(i, i2);
        O(hvaVar, hvaVar, this, hwh.b);
        return hvaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.hwp.g()
            defpackage.hju.p(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.E(r0)
            if (r0 != 0) goto L5a
            boolean r0 = r3.j
            if (r0 == 0) goto L5a
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L5a
            int[] r0 = defpackage.hkd.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L41;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            hke r0 = r3.clone()
            huu r0 = r0.p()
            goto L5b
        L31:
            hke r0 = r3.clone()
            hru r1 = defpackage.hru.b
            hsc r2 = new hsc
            r2.<init>()
            huu r0 = super.q(r1, r2)
            goto L5b
        L41:
            hke r0 = r3.clone()
            huu r0 = r0.p()
            goto L5b
        L4a:
            hke r0 = r3.clone()
            hru r1 = defpackage.hru.d
            hrh r2 = new hrh
            r2.<init>()
            huu r0 = r0.r(r1, r2)
            goto L5b
        L5a:
            r0 = r3
        L5b:
            hjv r1 = r3.u
            java.lang.Class r2 = r3.t
            hju r1 = r1.g
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6f
            hvg r1 = new hvg
            r1.<init>(r4)
            goto L7c
        L6f:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L83
            hvk r1 = new hvk
            r1.<init>(r4)
        L7c:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.hwh.a
            r3.O(r1, r4, r0, r2)
            return
        L83:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = defpackage.a.ch(r2, r0, r1)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hke.k(android.widget.ImageView):void");
    }

    public final void l(hvm hvmVar) {
        O(hvmVar, null, this, hwh.a);
    }
}
