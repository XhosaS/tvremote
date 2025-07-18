package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejs implements ewg, eoz {
    public final /* synthetic */ ejv a;
    private final ejt b;

    public ejs(ejv ejvVar, ejt ejtVar) {
        this.a = ejvVar;
        this.b = ejtVar;
    }

    private final Pair m(evz evzVar) {
        evz evzVarA;
        evz evzVar2 = null;
        if (evzVar != null) {
            ejt ejtVar = this.b;
            int i = 0;
            while (true) {
                List list = ejtVar.c;
                if (i >= list.size()) {
                    evzVarA = null;
                    break;
                }
                if (((evz) list.get(i)).d == evzVar.d) {
                    Object obj = evzVar.a;
                    Object obj2 = ejtVar.b;
                    int i2 = ehp.h;
                    evzVarA = evzVar.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (evzVarA == null) {
                return null;
            }
            evzVar2 = evzVarA;
        }
        return Pair.create(Integer.valueOf(this.b.d), evzVar2);
    }

    @Override // defpackage.ewg
    public final void cX(int i, evz evzVar, evv evvVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new bd((Object) this, (Object) pairM, (Object) evvVar, 4, (byte[]) null));
        }
    }

    @Override // defpackage.eoz
    public final void cY(int i, evz evzVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new edd(this, pairM, 7, null));
        }
    }

    @Override // defpackage.eoz
    public final void cZ(int i, evz evzVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new edd(this, pairM, 4, null));
        }
    }

    @Override // defpackage.eoz
    public final void da(int i, evz evzVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new edd(this, pairM, 5, null));
        }
    }

    @Override // defpackage.eoz
    public final void db(int i, evz evzVar, int i2) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new fk(this, pairM, i2, 4));
        }
    }

    @Override // defpackage.ewg
    public final void di(int i, evz evzVar, evv evvVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new bd((Object) this, (Object) pairM, (Object) evvVar, 2, (byte[]) null));
        }
    }

    @Override // defpackage.eoz
    public final void f(int i, evz evzVar, Exception exc) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new bd((Object) this, (Object) pairM, (Object) exc, 3, (byte[]) null));
        }
    }

    @Override // defpackage.eoz
    public final void g(int i, evz evzVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new edd(this, pairM, 6, null));
        }
    }

    @Override // defpackage.ewg
    public final void h(int i, evz evzVar, evq evqVar, evv evvVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new ejr(this, pairM, evqVar, evvVar, 0));
        }
    }

    @Override // defpackage.ewg
    public final void i(int i, evz evzVar, evq evqVar, evv evvVar) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new ejr(this, pairM, evqVar, evvVar, 2));
        }
    }

    @Override // defpackage.ewg
    public final void j(int i, evz evzVar, evq evqVar, evv evvVar, IOException iOException, boolean z) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new rip(this, pairM, evqVar, evvVar, iOException, z, 1));
        }
    }

    @Override // defpackage.ewg
    public final void k(int i, evz evzVar, evq evqVar, evv evvVar, int i2) {
        Pair pairM = m(evzVar);
        if (pairM != null) {
            ejv ejvVar = this.a;
            ejvVar.g.d(new ejq(this, pairM, evqVar, evvVar, i2, 0));
        }
    }
}
