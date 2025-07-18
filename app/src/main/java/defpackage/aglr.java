package defpackage;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglr extends AtomicReference implements agfs, aggi {
    private static final long serialVersionUID = -312246233408980075L;
    final agfs a;
    final AtomicReference b = new AtomicReference();
    final AtomicReference c = new AtomicReference();
    final mop d;

    public aglr(agfs agfsVar, mop mopVar) {
        this.a = agfsVar;
        this.d = mopVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        aghd.e(this.c);
        this.a.a();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        drq drqVarA;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                mos mosVar = this.d.a;
                mpp mppVar = (mpp) obj;
                dru druVar = (dru) obj2;
                oal oalVarG = mosVar.g;
                if (oalVarG == null) {
                    drqVarA = efx.aA(druVar).a;
                } else if (mppVar == null) {
                    mosVar.a.b(acsw.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, oalVarG, "Template produced null Element", new Object[0]);
                    drqVarA = efx.aA(druVar).a;
                } else {
                    MaterializationResult materializationResultC = mppVar.c();
                    if (materializationResultC == null || materializationResultC.getNativeUpb() == 0) {
                        nyw nywVar = new nyw(oalVarG);
                        nywVar.q = mppVar.c();
                        oalVarG = nywVar.g();
                    }
                    drqVarA = mosVar.b.a(druVar, oalVarG, mppVar.a(), mosVar.c, mosVar.d);
                }
                Pair pairCreate = Pair.create(drqVarA, druVar);
                aghn.b(pairCreate, "The combiner returned a null value");
                this.a.c(pairCreate);
            } catch (Throwable th) {
                aggq.a(th);
                dispose();
                this.a.fe(th);
            }
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        aghd.c(this.b, aggiVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this.b);
        aghd.e(this.c);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        aghd.e(this.c);
        this.a.fe(th);
    }
}
