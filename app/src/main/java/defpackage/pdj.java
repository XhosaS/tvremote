package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdj implements pbd, pdf {
    public final zpn a;
    public final List b;
    public final pbx c;
    public final long d;

    public pdj(zpn zpnVar, List list, pbx pbxVar, long j) {
        this.a = zpnVar;
        this.b = list;
        this.c = pbxVar;
        this.d = j;
    }

    @Override // defpackage.pdf
    public final /* synthetic */ pcc a() {
        return pde.a(this);
    }

    @Override // defpackage.pdf
    public final List b() {
        return this.b;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        zpk zpkVar = pde.a(this).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        yqqVarB.c("rootVeId", String.valueOf(zpkVar.d));
        zpk zpkVar2 = pde.b(this).d;
        if (zpkVar2 == null) {
            zpkVar2 = zpk.a;
        }
        yqqVarB.c("targetVeId", String.valueOf(zpkVar2.d));
        return yqqVarB.toString();
    }
}
