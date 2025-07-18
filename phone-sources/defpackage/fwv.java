package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwv {
    public final Context a;
    public final fyr b = new fyr(this, new ddd(this, 6));
    public Activity c;
    public boolean d;
    public final fv e;
    public boolean f;
    public final cb g;

    public fwv(Context context) {
        this.a = context;
        Object obj = null;
        this.g = new cb(context, (byte[]) null);
        Iterator itA = ykr.h(context, new cjp(17)).a();
        while (true) {
            if (!itA.hasNext()) {
                break;
            }
            Object next = itA.next();
            if (((Context) next) instanceof Activity) {
                obj = next;
                break;
            }
        }
        this.c = (Activity) obj;
        this.e = new fwu(this);
        this.f = true;
        fxp fxpVar = this.b.n;
        fxpVar.d(new fxf(fxpVar));
        this.b.n.d(new fwa(this.a));
    }

    public static /* synthetic */ void f(fwv fwvVar, String str) {
        fyr fyrVar = fwvVar.b;
        if (fyrVar.c == null) {
            throw new IllegalArgumentException("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + fyrVar + '.');
        }
        fxd fxdVarG = fyrVar.g();
        fxa fxaVarO = fxdVarG.o(str, true, fxdVarG);
        if (fxaVarO == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + fyrVar.c);
        }
        Bundle bundle = fxaVarO.b;
        fxb fxbVar = fxaVarO.a;
        Bundle bundleC = fxbVar.c(bundle);
        if (bundleC == null) {
            bundleC = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        }
        fwz fwzVar = new fwz(fus.M(fus.g(fxbVar.f())), null, null);
        fwv fwvVar2 = fyrVar.a;
        Intent intent = new Intent();
        intent.setDataAndType(fwzVar.a, fwzVar.c);
        intent.setAction(fwzVar.b);
        ghf.e(bundleC, intent);
        fyrVar.p(fxbVar, bundleC, null);
    }

    public final fwr a() {
        return this.b.c();
    }

    public final fws b(fxo fxoVar) {
        fxoVar.getClass();
        return new fws(this, fxoVar);
    }

    public final fxb c() {
        return this.b.e();
    }

    public final fxp d() {
        return this.b.n;
    }

    public final void e(fxb fxbVar, Bundle bundle, fxh fxhVar) {
        this.b.p(fxbVar, bundle, fxhVar);
    }

    public final void g() {
        fyr fyrVar = this.b;
        if (fyrVar.f.isEmpty()) {
            return;
        }
        fxb fxbVarE = fyrVar.e();
        fxbVarE.getClass();
        if (fyrVar.m(fxbVarE.b(), true, false)) {
            fyrVar.v();
        }
    }
}
