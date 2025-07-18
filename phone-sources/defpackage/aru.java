package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aru implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ aru(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                cfk.y((cfc) obj);
                return ygi.a;
            case 1:
                return a.ap((cfc) obj);
            case 2:
                return a.ap((cfc) obj);
            case 3:
                long j = atc.a;
                return true;
            case 4:
                cfk.y((cfc) obj);
                return ygi.a;
            case 5:
                cfk.a((cfc) obj);
                return ygi.a;
            case 6:
                awg awgVar = awg.a;
                return a.ap((cfc) obj);
            case 7:
                awg awgVar2 = awg.a;
                return a.ap((cfc) obj);
            case 8:
                cfk.w((cfc) obj);
                return ygi.a;
            case 9:
                return ygi.a;
            case 10:
                cfx cfxVar = (cfx) obj;
                cfu cfuVar = (cfu) cfxVar.a;
                if (cfuVar instanceof cge) {
                    cge cgeVar = (cge) cfuVar;
                    cha chaVar = cgeVar.b;
                    cfxVar.getClass();
                    String str = cgeVar.a;
                    throw null;
                }
                if (!(cfuVar instanceof cgd)) {
                    return cfxVar;
                }
                cgd cgdVar = (cgd) cfuVar;
                cha chaVar2 = cgdVar.b;
                cfxVar.getClass();
                String str2 = cgdVar.a;
                throw null;
            case 11:
                bkp bkpVar = axr.a;
                return ygi.a;
            case 12:
                bkp bkpVar2 = axr.a;
                return ygi.a;
            case 13:
                return ygi.a;
            case 14:
                cak cakVar = (cak) obj;
                cakVar.getClass();
                throw null;
            case 15:
                cak cakVar2 = (cak) obj;
                cakVar2.getClass();
                throw null;
            case 16:
                return new bid((Map) obj);
            case 17:
                return obj;
            case 18:
                synchronized (bjb.b) {
                    List list = bjb.g;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((yjv) list.get(i)).a(obj);
                    }
                }
                return ygi.a;
            case 19:
                yjv yjvVar = bjb.a;
                return ygi.a;
            default:
                int i2 = cfz.a;
                return Boolean.valueOf(!(((cfu) obj) instanceof cgm));
        }
    }
}
