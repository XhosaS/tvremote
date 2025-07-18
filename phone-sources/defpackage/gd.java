package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gd implements bbk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bbk
    public final void a() throws Exception {
        switch (this.b) {
            case 0:
                ((fv) this.a).f();
                return;
            case 1:
                Object obj = ((nxb) this.a).a;
                if (obj == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                ((gp) obj).a();
                return;
            case 2:
                ((fv) this.a).f();
                return;
            case 3:
                ((pf) this.a).j();
                return;
            case 4:
                ((pf) this.a).j();
                return;
            case 5:
                ((acw) this.a).d = null;
                return;
            case 6:
                adm admVar = (adm) this.a;
                mma mmaVar = admVar.f;
                if (mmaVar != null) {
                    mmaVar.a = false;
                }
                admVar.f = null;
                return;
            case 7:
                ((adi) this.a).d = true;
                return;
            case 8:
                alg algVar = (alg) this.a;
                algVar.x();
                algVar.o = null;
                algVar.g = null;
                return;
            case 9:
                ags agsVar = (ags) this.a;
                bji bjiVar = agsVar.c;
                bjiVar.e();
                bjiVar.a();
                ActionMode actionMode = agsVar.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
                agsVar.f = null;
                return;
            case 10:
                ahj ahjVarA = ((ahl) this.a).a();
                if (ahjVarA != null) {
                    ahjVarA.a();
                    return;
                }
                return;
            case 11:
                asv asvVar = (asv) this.a;
                asvVar.dismiss();
                asvVar.b.e();
                return;
            case 12:
                ((ccs) this.a).a.a();
                return;
            case 13:
                cnu cnuVar = (cnu) this.a;
                cnuVar.dismiss();
                cnuVar.c.e();
                return;
            default:
                Object obj2 = this.a;
                ((can) obj2).e();
                View view = (View) obj2;
                dwf.f(view, null);
                ((cny) obj2).b.removeViewImmediate(view);
                return;
        }
    }
}
