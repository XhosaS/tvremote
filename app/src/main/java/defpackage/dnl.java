package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dnl implements Handler.Callback {
    private static final dnk b = new dnj();
    public final we a = new we();
    private volatile czb c;
    private final dnk d;
    private final dnc e;
    private final dnh f;

    public dnl(dnk dnkVar) {
        dnkVar = dnkVar == null ? b : dnkVar;
        this.d = dnkVar;
        this.f = new dnh(dnkVar);
        boolean z = dkh.a;
        this.e = !dkh.a ? new dmx() : new dnb();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(Collection collection, Map map) {
        View view;
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bq bqVar = (bq) it.next();
            if (bqVar != null && (view = bqVar.R) != null) {
                map.put(view, bqVar);
                e(bqVar.eg().b.i(), map);
            }
        }
    }

    public final czb b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (dqm.i() && !(context instanceof Application)) {
            if (context instanceof bw) {
                return d((bw) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.a(cyg.a(context.getApplicationContext()), new dms(), new dmy(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final czb c(bq bqVar) throws Throwable {
        View view;
        dqk.d(bqVar.s(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (dqm.h()) {
            return b(bqVar.s().getApplicationContext());
        }
        if (bqVar.ee() != null) {
            this.e.a(bqVar.ee());
        }
        bqVar.eg();
        Context contextS = bqVar.s();
        cyg cygVarA = cyg.a(contextS.getApplicationContext());
        dnh dnhVar = this.f;
        bcg bcgVarEk = bqVar.ek();
        boolean z = false;
        if (bqVar.ao() && !bqVar.ap() && (view = bqVar.R) != null && view.getWindowToken() != null && bqVar.R.getVisibility() == 0) {
            z = true;
        }
        return dnhVar.a(contextS, cygVarA, bcgVarEk, z);
    }

    public final czb d(bw bwVar) throws Throwable {
        if (dqm.h()) {
            return b(bwVar.getApplicationContext());
        }
        if (bwVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.e.a(bwVar);
        Activity activityA = a(bwVar);
        boolean z = true;
        if (activityA != null && activityA.isFinishing()) {
            z = false;
        }
        cyg cygVarA = cyg.a(bwVar.getApplicationContext());
        dnh dnhVar = this.f;
        bcg bcgVarEk = bwVar.ek();
        ce ceVar = bwVar.a.a;
        return dnhVar.a(bwVar, cygVarA, bcgVarEk, z);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
