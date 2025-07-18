package defpackage;

import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msf implements iej {
    public final AppCompatActivity a;
    protected final mjl b;
    public final mej c;
    public final fuy d;
    public fux e;
    public final fus f = new mse(this);
    protected final msh g;
    private final boolean h;

    public msf(AppCompatActivity appCompatActivity, boolean z, mjl mjlVar, msh mshVar) {
        this.a = appCompatActivity;
        this.h = z;
        this.c = mej.a(appCompatActivity);
        this.g = mshVar;
        this.b = mjlVar;
        this.d = fuy.b(appCompatActivity);
        b();
    }

    public static fux e() {
        fux fuxVarN = fuy.n();
        if (!g(fuxVarN)) {
            Iterator it = fuy.m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    fuxVarN = null;
                    break;
                }
                fux fuxVar = (fux) it.next();
                if (fuxVar != null && g(fuxVar) && fuxVar.h) {
                    fuxVarN = fuxVar;
                    break;
                }
            }
        }
        if (fuxVarN == null || !h(fuxVarN)) {
            return null;
        }
        return fuxVarN;
    }

    public static boolean f(mej mejVar, mjl mjlVar) {
        return mejVar.a == 0 && mjlVar.e == null && e() == null;
    }

    private static boolean g(fux fuxVar) {
        return fuxVar.v("android.media.intent.category.LIVE_VIDEO");
    }

    private static boolean h(fux fuxVar) {
        try {
            Display displayH = fuxVar.h();
            if (displayH != null && displayH.isValid()) {
                if ((displayH.getFlags() & 2) != 2) {
                    return true;
                }
            }
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }

    public final void a() {
        int i = -1;
        if (this.h && f(this.c, this.b)) {
            i = 6;
        }
        this.a.setRequestedOrientation(i);
    }

    public final void b() {
        fux fuxVarE = e();
        if (this.e != fuxVarE) {
            this.e = fuxVarE;
            a();
            msh mshVar = this.g;
            mshVar.c();
            mshVar.b();
            this.a.supportInvalidateOptionsMenu();
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    @Override // defpackage.iej
    public final void dM() {
        a();
    }
}
