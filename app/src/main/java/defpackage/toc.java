package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.youtube.android.libraries.elements.StatusOr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toc implements tnz {
    private final ahbt a;
    private final tlq b;
    private final tny c;
    private final tnf d;
    private final tnh e;
    private final tne f;
    private final tnx g;
    private final tmj h;
    private final tnw i;
    private final tni j;
    private final yrx k;
    private final tmi l;
    private final boolean m;
    private final ahcb n;
    private final tnu o;

    public toc(ahbt ahbtVar, tlq tlqVar, tny tnyVar, tnf tnfVar, tnh tnhVar, tne tneVar, tnx tnxVar, tmj tmjVar, tnw tnwVar, tni tniVar, yrx yrxVar, tmi tmiVar, Context context, boolean z) {
        ahbtVar.getClass();
        tlqVar.getClass();
        tneVar.getClass();
        tnxVar.getClass();
        tniVar.getClass();
        tmiVar.getClass();
        context.getClass();
        this.a = ahbtVar;
        this.b = tlqVar;
        this.c = tnyVar;
        this.d = tnfVar;
        this.e = tnhVar;
        this.f = tneVar;
        this.g = tnxVar;
        this.h = tmjVar;
        this.i = tnwVar;
        this.j = tniVar;
        this.k = yrxVar;
        this.l = tmiVar;
        this.m = z;
        this.n = ahal.d(ahbtVar, null, 2, new tob(this, null), 1);
        this.o = new tnu(tneVar);
    }

    private final ResourceLoader d(StatusOr statusOr) {
        if (statusOr.hasValue) {
            Object obj = statusOr.value;
            if (obj != null) {
                return (ResourceLoader) obj;
            }
            throw new IllegalStateException("Required value was null.");
        }
        this.h.d(acsw.LOG_TYPE_INTERNAL_RESOURCE_ERROR, oal.A, null, "Failed to create ResourceLoader with xUIKit configuration: %s", statusOr.status);
        ResourceLoader resourceLoaderCreateWithDefaultConfig = ResourceLoader.createWithDefaultConfig(this.d, this.e, this.o);
        if (resourceLoaderCreateWithDefaultConfig != null) {
            return resourceLoaderCreateWithDefaultConfig;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.tnz
    public final zyd a() {
        b();
        zyd zydVarI = zxn.i(ahkr.a(this.n));
        zydVarI.getClass();
        return zydVarI;
    }

    @Override // defpackage.tnz
    public final void b() {
        this.n.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toc.c(agsw):java.lang.Object");
    }
}
