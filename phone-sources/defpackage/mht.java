package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mht implements owv {
    private final mif a;
    private final /* synthetic */ int b;

    public mht(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.owv
    public final /* synthetic */ void a(bv bvVar) {
        int i = this.b;
        if (i == 0) {
            mif mifVar = this.a;
            pie pieVar = (pie) bvVar;
            pieVar.b = mifVar.iB;
            pieVar.c = (oxp) mifVar.iz.b();
            pieVar.f = (kwy) mifVar.hJ.b();
            return;
        }
        if (i == 1) {
            pha phaVar = (pha) bvVar;
            mif mifVar2 = this.a;
            phaVar.e = new kwy(mifVar2.ne, (byte[]) null, (byte[]) null);
            phaVar.d = new kwy(mifVar2.nh, (char[]) null);
            phaVar.c = mifVar2.ap();
            return;
        }
        if (i != 2) {
            mif mifVar3 = this.a;
            phk phkVar = (phk) bvVar;
            phkVar.a = (pfs) mifVar3.mL.b();
            phkVar.j = new kwy(new pgd(ImmutableSet.of(new kww())), (byte[]) null);
            phkVar.i = mifVar3.ap();
            phkVar.k = new kwy((byte[]) null);
            return;
        }
        pgw pgwVar = (pgw) bvVar;
        mif mifVar4 = this.a;
        pgwVar.c = ImmutableMap.of(uyq.UITYPE_GM_DIALOG, mifVar4.FS, uyq.UITYPE_PERMISSION, mifVar4.FT);
        pgwVar.d = (pfs) mifVar4.mL.b();
        pgwVar.e = rgq.c(mifVar4.a);
        pgwVar.j = mifVar4.ap();
        pgwVar.k = (ntp) ((xcn) mifVar4.FU).a;
        pgwVar.f = (qoj) mifVar4.ic.b();
    }
}
