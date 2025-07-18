package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzx implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public lzx(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new lzw((lyz) this.a.b(), ((kpw) this.b).b());
            case 1:
                return new lhy((ExecutorService) this.b.b(), (lzq) this.a.b(), 3);
            case 2:
                return new lqs((lzh) this.a.b(), new lxt(((lwc) this.b).a(), 12), 7, null);
            case 3:
                return mak.b((lzh) this.a.b(), (mma) this.b.b());
            case 4:
                return new lhy((Executor) this.b.b(), (mcq) this.a.b(), 4);
            case 5:
                return new kuw((lor) this.a.b(), (mdw) this.b.b());
            case 6:
                return new mjb(((rgq) this.a).a(), (lfn) this.b.b());
            case 7:
                return new mtw(((rgq) this.b).a(), (lfn) this.a.b());
            case 8:
                return new oxe((Object) ((oxk) this.a).b(), ((qib) this.b).a());
            case 9:
                rbi rbiVar = (rbi) this.a.b();
                return new oyo(rbiVar);
            case 10:
                return new nsf(((ozf) this.b).b(), ((qib) this.a).a(), null);
            case 11:
                return new ozx(((rgq) this.b).a(), (oyi) this.a.b(), 1, (byte[]) null);
            case 12:
                return new ozx(((rgq) this.b).a(), (oyi) this.a.b(), 0);
            case 13:
                return new ozx(((rgq) this.b).a(), (oyi) this.a.b(), 2, (char[]) null);
            case 14:
                return new pae(((pad) this.a).b(), (oxp) this.b.b());
            case 15:
                return new paf((oyi) this.a.b());
            case 16:
                return new nsf(((pat) this.b).b(), ((qib) this.a).a(), null);
            case 17:
                pea peaVar = (pea) this.a.b();
                return new pec(peaVar);
            case 18:
                xcq xcqVar = this.a;
                Context contextA = ((rgq) this.b).a();
                unc uncVar = (unc) xcqVar.b();
                uncVar.getClass();
                sln slnVarA = slo.a();
                Pattern pattern = sjt.a;
                sjs sjsVar = new sjs(contextA);
                sjsVar.d("permissionrequestsstatedatastore");
                sjsVar.e("PermissionRequestsState.pb");
                slnVarA.d(sjsVar.a());
                slnVarA.c(pev.a);
                slnVarA.d = slg.a;
                smc smcVarC = uncVar.c(slnVarA.a());
                smcVarC.getClass();
                return smcVarC;
            case 19:
                return new pga(((xcs) this.a).b(), ((pfx) this.b).b());
            default:
                return new pgn(((pfx) this.a).b(), (oxp) this.b.b());
        }
    }

    public lzx(xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}
