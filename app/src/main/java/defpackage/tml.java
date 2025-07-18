package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tml {
    public final acjk a;
    final /* synthetic */ tmm b;
    private final Level c;
    private final acjh d;

    public tml(tmm tmmVar, Level level, acjk acjkVar, acjh acjhVar) {
        this.b = tmmVar;
        this.c = level;
        this.a = acjkVar;
        this.d = acjhVar;
    }

    public final ahqu a() {
        abxd abxdVarV = this.d.v();
        abxdVarV.getClass();
        acji acjiVar = (acji) abxdVarV;
        if (agvy.c(this.c, Level.SEVERE)) {
            this.b.b.b(acjiVar).f("Runtime.ErrorMessage");
        }
        ahqu ahquVar = ahqu.a;
        ahqt ahqtVar = new ahqt();
        abxc abxcVar = acjl.b;
        abxcVar.getClass();
        acjk acjkVar = this.a;
        acjh acjhVar = new acjh();
        acjhVar.B(acjiVar);
        if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acjhVar.y();
        }
        acji acjiVar2 = (acji) acjhVar.b;
        acjiVar2.b &= -3;
        acjiVar2.d = acji.a.d;
        acji acjiVarA = acjj.a(acjhVar);
        if ((acjkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acjkVar.y();
        }
        acjl acjlVar = (acjl) acjkVar.b;
        acjlVar.g = acjiVarA;
        acjlVar.c |= 8;
        abxd abxdVarV2 = acjkVar.v();
        abxdVarV2.getClass();
        ahqtVar.f(abxcVar, abxdVarV2);
        return ahsg.a(ahqtVar);
    }
}
