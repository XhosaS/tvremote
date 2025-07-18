package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.StateSet;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tae {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public tae(qwo qwoVar, rjg rjgVar, cb cbVar, AccountParticleDisc accountParticleDisc, int i, rhu rhuVar, qth qthVar, tst tstVar) {
        this.h = qwoVar;
        this.d = rjgVar;
        this.e = cbVar;
        this.g = accountParticleDisc;
        this.f = rhuVar;
        this.a = i;
        this.b = qthVar;
        this.c = tstVar;
    }

    public static tae b(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new tad(context, resourceId).a();
        }
        return null;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(((int[][]) this.c)[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean c() {
        if (this.a > 1) {
            return true;
        }
        Object obj = this.e;
        if (obj != null && ((tac) obj).c()) {
            return true;
        }
        Object obj2 = this.f;
        if (obj2 != null && ((tac) obj2).c()) {
            return true;
        }
        Object obj3 = this.g;
        if (obj3 != null && ((tac) obj3).c()) {
            return true;
        }
        Object obj4 = this.h;
        return obj4 != null && ((tac) obj4).c();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, sze] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, sze] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, sze] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, sze] */
    public final szq d() {
        Object obj = this.e;
        if (obj == null && this.f == null && this.g == null && this.h == null) {
            return (szq) this.b;
        }
        szp szpVar = new szp((szq) this.b);
        if (obj != null) {
            szpVar.a = ((tac) obj).b;
        }
        Object obj2 = this.f;
        if (obj2 != null) {
            szpVar.b = ((tac) obj2).b;
        }
        Object obj3 = this.g;
        if (obj3 != null) {
            szpVar.d = ((tac) obj3).b;
        }
        Object obj4 = this.h;
        if (obj4 != null) {
            szpVar.c = ((tac) obj4).b;
        }
        return new szq(szpVar);
    }

    public tae(tad tadVar) {
        this.a = tadVar.a;
        this.b = tadVar.b;
        this.c = tadVar.c;
        this.d = tadVar.d;
        this.e = tadVar.e;
        this.f = tadVar.f;
        this.g = tadVar.g;
        this.h = tadVar.h;
    }

    public tae(nxb nxbVar) {
        this.c = gli.E(false);
        this.f = ypk.a;
        this.b = gli.E(true);
        this.e = new fki();
        Object obj = nxbVar.a;
        this.h = obj == null ? goz.a : obj;
        this.g = new cb((char[]) null);
        this.a = 20;
        this.d = new gli();
    }

    public tae(Context context, xwk xwkVar, vrs vrsVar, xzg xzgVar, ofj ofjVar) {
        this.d = context;
        this.g = xwkVar;
        this.f = vrsVar;
        this.h = xzgVar;
        this.e = ofjVar;
        this.b = vrsVar.a(new qyx(1));
        this.c = new qze();
        int i = vqy.a;
        this.a = vqy.a();
    }
}
