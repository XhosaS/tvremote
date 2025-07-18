package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdz implements dvi {
    final /* synthetic */ yow a;
    final /* synthetic */ bcy b;
    final /* synthetic */ ylf c;
    final /* synthetic */ View d;
    final /* synthetic */ ccb e;

    public cdz(yow yowVar, ccb ccbVar, bcy bcyVar, ylf ylfVar, View view) {
        this.a = yowVar;
        this.e = ccbVar;
        this.b = bcyVar;
        this.c = ylfVar;
        this.d = view;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        yoe yoeVarV = null;
        switch (dvcVar.ordinal()) {
            case 0:
                ykr.q(this.a, null, 4, new dlg(this.c, this.b, dvkVar, this, this.d, (yih) null, 1), 1);
                return;
            case 1:
                ccb ccbVar = this.e;
                if (ccbVar != null) {
                    Object obj = ccbVar.a;
                    synchronized (((bbt) obj).a) {
                        if (!((bbt) obj).a()) {
                            List list = ((bbt) obj).b;
                            ((bbt) obj).b = ((bbt) obj).c;
                            ((bbt) obj).c = list;
                            ((bbt) obj).d = true;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((yih) list.get(i)).resumeWith(ygi.a);
                            }
                            list.clear();
                        }
                    }
                }
                bcy bcyVar = this.b;
                synchronized (bcyVar.c) {
                    if (bcyVar.j) {
                        bcyVar.j = false;
                        yoeVarV = bcyVar.v();
                    }
                }
                if (yoeVarV != null) {
                    yoeVarV.resumeWith(ygi.a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 6:
                return;
            case 4:
                this.b.x();
                return;
            case 5:
                this.b.w();
                return;
            default:
                throw new yfu();
        }
    }
}
