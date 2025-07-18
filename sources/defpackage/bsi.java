package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsi {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/clearcut/EnabledClearcutLogger");
    public final adj b;
    public final boolean c;
    public final Context d;
    public boolean e;
    public volatile List f = new ArrayList();
    public final aoy g = new cwe();

    public bsi(Context context, boolean z) {
        this.b = new adj(context, "ATV_REMOTE_SERVICE", adv.a, new aed(context), new aem(context));
        this.c = z;
        this.d = context;
        btm.a(context, new bsp(new bsr(new brk(this, 3)), context, 0));
    }

    public final void a(int i, long j) {
        clo cloVarC = c(i);
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bse bseVar2 = bse.a;
        bseVar.b |= 64;
        bseVar.h = j;
        b(cloVarC);
    }

    public final void b(clo cloVar) {
        bse bseVar = (bse) cloVar.i();
        if (this.f != null) {
            synchronized (this) {
                if (this.f != null) {
                    this.f.add(bseVar);
                    return;
                }
            }
        }
        if (this.e) {
            this.b.e(bseVar, apm.a(this.d, this.g)).b();
        }
    }

    public final clo c(int i) {
        clo cloVarO = bse.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bse bseVar = (bse) cloVarO.b;
        bseVar.c = i - 1;
        bseVar.b |= 1;
        clo cloVarO2 = bsf.a.o();
        boolean z = this.c;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bsf bsfVar = (bsf) cloVarO2.b;
        bsfVar.b |= 2;
        bsfVar.d = z;
        bsf bsfVar2 = (bsf) cloVarO2.i();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bse bseVar2 = (bse) cloVarO.b;
        bsfVar2.getClass();
        bseVar2.d = bsfVar2;
        bseVar2.b |= 2;
        return cloVarO;
    }
}
