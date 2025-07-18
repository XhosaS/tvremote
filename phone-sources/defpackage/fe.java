package defpackage;

import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements dvi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, yjv] */
    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        View view;
        switch (this.b) {
            case 0:
                fl._init_$lambda$4((fl) this.a, dvkVar, dvcVar);
                break;
            case 1:
                if (dvcVar == dvc.ON_STOP && (view = ((bv) this.a).mView) != null) {
                    view.cancelPendingInputEvents();
                    break;
                }
                break;
            case 2:
                fl._init_$lambda$5((fl) this.a, dvkVar, dvcVar);
                break;
            case 3:
                Object obj = this.a;
                ((fl) obj).ensureViewModelStore();
                ((ds) obj).getLifecycle().d(this);
                break;
            case 4:
                if (dvcVar == dvc.ON_DESTROY) {
                    ((can) this.a).e();
                    break;
                }
                break;
            case 5:
                ((yvc) this.a).e(dvcVar.a());
                break;
            case 6:
                dvd dvdVarA = dvcVar.a();
                fyr fyrVar = (fyr) this.a;
                fyrVar.l = dvdVarA;
                if (fyrVar.c != null) {
                    Iterator it = yfm.an(fyrVar.f).iterator();
                    while (it.hasNext()) {
                        fyp fypVar = ((fwr) it.next()).f;
                        fypVar.b = dvcVar.a();
                        fypVar.c();
                    }
                    break;
                }
                break;
            case 7:
                Object obj2 = this.a;
                if (dvcVar != dvc.ON_START) {
                    if (dvcVar == dvc.ON_STOP) {
                        ((ghh) obj2).f = false;
                        break;
                    }
                } else {
                    ((ghh) obj2).f = true;
                    break;
                }
                break;
            default:
                this.a.a(dvcVar);
                break;
        }
    }

    public fe(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
