package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nuy implements ono {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nuy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, tsl] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ono
    public final Object a(onz onzVar) {
        int i = this.c;
        int i2 = 1;
        if (i == 0) {
            if (!onzVar.i() || !nvc.d((Bundle) onzVar.e())) {
                return onzVar;
            }
            return ((nvc) this.a).a((Bundle) this.b).c(nvc.a, new nvh(i2));
        }
        if (i == 1) {
            AtomicBoolean atomicBoolean = nty.a;
            if (onzVar.i()) {
                return this.a.apply(this.b);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", onzVar.d());
            return onzVar;
        }
        if (i != 2) {
            if (i != 3) {
                Object obj = this.a;
                Object obj2 = this.b;
                synchronized (obj2) {
                    ((usr) obj2).b.remove(obj);
                }
                return onzVar;
            }
            Object obj3 = this.b;
            Object obj4 = this.a;
            synchronized (obj4) {
                ((ulo) obj4).b.remove(obj3);
            }
            return onzVar;
        }
        boolean z = onzVar.d() instanceof nxf;
        Object obj5 = this.a;
        Object obj6 = this.b;
        if (z) {
            return ((omi) obj6).a(((rxe) obj5).c);
        }
        if (!(onzVar.d() instanceof nwk)) {
            return onzVar;
        }
        nwk nwkVar = (nwk) onzVar.d();
        nwkVar.getClass();
        if (nwkVar.a() != 29514) {
            return onzVar;
        }
        return ((omi) obj6).a(((rxe) obj5).c);
    }

    public /* synthetic */ nuy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
