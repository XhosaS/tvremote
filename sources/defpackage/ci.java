package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ci implements ef {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ci(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ef
    public final void a(du duVar, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((cj) this.a).y(duVar);
                return;
            }
            if (duVar instanceof en) {
                duVar.a().i(false);
            }
            ef efVar = ((dk) this.a).e;
            if (efVar != null) {
                efVar.a(duVar, z);
                return;
            }
            return;
        }
        du duVarA = duVar.a();
        du duVar2 = duVarA != duVar ? duVarA : duVar;
        cj cjVar = (cj) this.a;
        ch chVarU = cjVar.u(duVar2);
        if (chVarU != null) {
            if (duVarA == duVar) {
                cjVar.z(chVarU, z);
            } else {
                cjVar.x(chVarU.a, chVarU, duVarA);
                cjVar.z(chVarU, true);
            }
        }
    }

    @Override // defpackage.ef
    public final boolean b(du duVar) {
        Window.Callback callbackV;
        int i = this.b;
        if (i == 0) {
            if (duVar == duVar.a()) {
                cj cjVar = (cj) this.a;
                if (cjVar.w && (callbackV = cjVar.v()) != null && !cjVar.D) {
                    callbackV.onMenuOpened(108, duVar);
                }
            }
            return true;
        }
        if (i == 1) {
            Window.Callback callbackV2 = ((cj) this.a).v();
            if (callbackV2 != null) {
                callbackV2.onMenuOpened(108, duVar);
            }
            return true;
        }
        Object obj = this.a;
        if (duVar == ((fa) obj).c) {
            return false;
        }
        dw dwVar = ((en) duVar).l;
        ef efVar = ((dk) obj).e;
        if (efVar != null) {
            return efVar.b(duVar);
        }
        return false;
    }
}
