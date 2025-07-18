package defpackage;

import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdq extends ykt implements yjk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdq(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [caa, java.lang.Object] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        boolean z = false;
        bvc bvcVar = null;
        switch (this.b) {
            case 0:
                ((yjk) ((ylf) this.a).a).a();
                return ygi.a;
            case 1:
                yoz.n(((cbv) this.a).c, null);
                return ygi.a;
            case 2:
                Object obj = this.a;
                ((cfq) obj).d = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    ((cfq) obj).a();
                    Trace.endSection();
                    return ygi.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 3:
                Object systemService = ((ckb) this.a).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 4:
                return new BaseInputConnection(((ckm) this.a).a, false);
            case 5:
                ((cmv) this.a).v.E();
                return ygi.a;
            case 6:
                ?? r0 = this.a;
                cmv cmvVar = (cmv) r0;
                if (cmvVar.f && cmvVar.isAttachedToWindow() && cmvVar.c.getParent() == r0) {
                    cmvVar.d().d(r0, cmv.a, cmvVar.e);
                }
                return ygi.a;
            case 7:
                cmv cmvVar2 = (cmv) this.a;
                cmvVar2.y.a(cmvVar2.w);
                cmvVar2.i(null);
                return ygi.a;
            case 8:
                cmv cmvVar3 = (cmv) this.a;
                cmvVar3.x.a(cmvVar3.w);
                return ygi.a;
            case 9:
                cny cnyVar = (cny) this.a;
                bvc bvcVarB = cnyVar.b();
                if (bvcVarB != null && bvcVarB.s()) {
                    bvcVar = bvcVarB;
                }
                if (bvcVar != null && cnyVar.j() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return new fki[((ysx[]) this.a).length];
        }
    }
}
