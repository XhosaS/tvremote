package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhx implements uha {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public rhx(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, rig] */
    @Override // defpackage.uha
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            ((rhy) this.b).a();
            return;
        }
        if (i == 1) {
            th.getClass();
            Log.w(((qzf) this.a).a, "Failed to load avatar.", th);
            this.b.a(null);
        } else if (i != 2) {
            if (i != 3) {
                Log.e("ClientLoggingBackend", "Error while logging.", th);
                return;
            }
            ((utf) this.a).c = true;
            ((wbb) this.b).a(xtk.c(th), new xsm());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, vvj] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rig] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.uha
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                ((rhy) this.b).b.a.onClick((View) this.a);
            }
            ((rhy) this.b).a();
            return;
        }
        if (i == 1) {
            Bitmap bitmap = (Bitmap) obj;
            bitmap.getClass();
            this.b.a(bitmap);
            return;
        }
        if (i == 2) {
            ?? r0 = this.b;
            ((uge) this.a).b.a.d((AutoCloseable) obj, r0);
            return;
        }
        if (i == 3) {
            xqb xqbVar = (xqb) obj;
            try {
                Object obj2 = this.a;
                ((utf) obj2).b = xqbVar;
                Iterator it = ((utf) obj2).a.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
        ?? r02 = this.b;
        String str = (String) obj;
        udb udbVar = ((uuz) r02).g;
        if (udbVar == null) {
            udbVar = udb.a;
        }
        Object obj3 = this.a;
        String str2 = udbVar.j;
        Charset charset = uui.a;
        int i2 = tzc.a;
        int iA = tzj.a.b(str2, uui.a).a();
        Context context = ((uun) ((uum) obj3).c).a;
        nsy nsyVarH = new nsz(context, "CLIENT_LOGGING_PROD", str).h(r02, osr.b(context, new xcu()));
        nsyVarH.i(iA);
        uhp uhpVarAH = qtl.aH(nsyVarH.c());
        tsm tsmVar = new tsm(null);
        ugk ugkVar = ugk.a;
        uhp uhpVarI = ufn.i(uhpVarAH, tsmVar, ugkVar);
        uhpVarI.c(new ufx(uhpVarI, 16), ugkVar);
        ues.i(uhpVarI, Exception.class, trc.a(new uhe(4)), ugkVar);
    }

    public rhx(rhy rhyVar, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = rhyVar;
    }

    public rhx(rig rigVar, qzf qzfVar, int i) {
        this.c = i;
        this.b = rigVar;
        this.a = qzfVar;
    }

    public rhx(uge ugeVar, Executor executor, int i) {
        this.c = i;
        this.a = ugeVar;
        this.b = executor;
    }
}
