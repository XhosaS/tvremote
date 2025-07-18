package defpackage;

import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rj implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public rj(View view, apl aplVar, rf rfVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.a = view;
        this.b = aplVar;
        this.c = rfVar;
        this.d = valueAnimator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, zh] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, zh] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            rl.f((View) this.a, (apl) this.b, (rf) this.c);
            ((ValueAnimator) this.d).start();
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            if (obj != null) {
                ViewOnKeyListenerC0000do viewOnKeyListenerC0000do = ((dn) this.d).a;
                viewOnKeyListenerC0000do.f = true;
                ((du) ((bda) obj).c).i(false);
                viewOnKeyListenerC0000do.f = false;
            }
            ?? r0 = this.b;
            if (r0.isEnabled() && r0.hasSubMenu()) {
                ((du) this.c).z(r0, 4);
                return;
            }
            return;
        }
        if (i == 2) {
            this.a.a((zi) this.c, (zf) this.d, this.b);
            return;
        }
        if (i == 3) {
            this.a.a((zi) this.c, (zf) this.d, this.b);
            return;
        }
        if (i != 4) {
            ((cbs) ((cbs) bbb.a.a((Level) this.c).i((Throwable) this.a)).j("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 49, "Phlogger.java")).C((String) this.d, (Object[]) this.b);
            return;
        }
        Object obj2 = this.d;
        ?? r1 = this.b;
        Object obj3 = this.a;
        try {
            aoe aoeVarB = ((awy) this.c).b(r1);
            ((aoe) obj3).a |= aoeVarB.a;
            ((aoe) obj3).b = aoeVarB.b | ((aoe) obj3).b;
            aoe aoeVar = (aoe) obj3;
            if (aoeVar.b()) {
                aoeVar.a(((aod) obj2).b);
            }
        } catch (Throwable th) {
            aoe aoeVar2 = (aoe) obj3;
            if (aoeVar2.b()) {
                aoeVar2.a(((aod) obj2).b);
            }
            throw th;
        }
    }

    public /* synthetic */ rj(awy awyVar, aoe aoeVar, List list, aod aodVar, int i) {
        this.e = i;
        this.c = awyVar;
        this.a = aoeVar;
        this.b = list;
        this.d = aodVar;
    }

    public rj(dn dnVar, bda bdaVar, MenuItem menuItem, du duVar, int i) {
        this.e = i;
        this.d = dnVar;
        this.a = bdaVar;
        this.b = menuItem;
        this.c = duVar;
    }

    public /* synthetic */ rj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.c = obj;
        this.a = obj2;
        this.d = obj3;
        this.b = obj4;
    }
}
