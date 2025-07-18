package defpackage;

import j$.time.Instant;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkk implements tkm {
    public static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger");
    public final zyg b;
    public final pfq c;
    public final pel d;
    public final toy e;
    public final pbt f;
    public final tmm g;
    public final tkh i;
    private final pby k;
    public final tkj h = new tkj(this);
    public boolean j = false;

    public tkk(zyg zygVar, pfq pfqVar, pby pbyVar, pel pelVar, toy toyVar, tmm tmmVar, pbv pbvVar, pbt pbtVar) {
        this.b = zygVar;
        this.c = pfqVar;
        this.k = pbyVar;
        this.d = pelVar;
        this.e = toyVar;
        this.f = pbtVar;
        this.g = tmmVar;
        this.i = new tkh(this, pbyVar, pbvVar);
    }

    @Override // defpackage.ocq
    public final void a(final acxn acxnVar, final int i) {
        this.e.b(new Runnable() { // from class: tkg
            @Override // java.lang.Runnable
            public final void run() {
                pbz pbzVar;
                tkk tkkVar = this.a;
                if (tkkVar.j) {
                    ((zdv) ((zdv) ((zdv) tkk.a.c()).o(tmm.a, tkkVar.g.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger", "logGesture", 245, "GilElementsInteractionLogger.java")).u("GilElementsInteractionLogger was cleaned up, cannot log interaction");
                    return;
                }
                int i2 = i;
                acxn acxnVar2 = acxnVar;
                tks tksVarA = tks.b.a(acxnVar2);
                int i3 = i2 - 1;
                if (i3 == 1) {
                    pca pcaVar = pca.a;
                    pbzVar = new pbz();
                    if ((pbzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pbzVar.y();
                    }
                    pca pcaVar2 = (pca) pbzVar.b;
                    pcaVar2.c = 4;
                    pcaVar2.b |= 1;
                } else if (i3 != 2) {
                    pca pcaVar3 = pca.a;
                    pbzVar = new pbz();
                    if ((pbzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pbzVar.y();
                    }
                    pca pcaVar4 = (pca) pbzVar.b;
                    pcaVar4.c = 31;
                    pcaVar4.b |= 1;
                } else {
                    pca pcaVar5 = pca.a;
                    pbzVar = new pbz();
                    if ((pbzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pbzVar.y();
                    }
                    pca pcaVar6 = (pca) pbzVar.b;
                    pcaVar6.c = 21;
                    pcaVar6.b |= 1;
                }
                Integer numA = tksVarA.a(i2);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    abxc abxcVar = pfc.d;
                    ped pedVar = ped.a;
                    pec pecVar = new pec();
                    if ((pecVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pecVar.y();
                    }
                    ped pedVar2 = (ped) pecVar.b;
                    pedVar2.b |= 1;
                    pedVar2.c = iIntValue;
                    pbw pbwVar = new pbw(abxcVar, (ped) pecVar.v());
                    abwk abwkVar = pbwVar.a;
                    yqw.L(true ^ pbzVar.d(abwkVar));
                    int i4 = ((abxc) abwkVar).d.b;
                    if ((Integer.MIN_VALUE & pbzVar.b.memoizedSerializedSize) == 0) {
                        pbzVar.y();
                    }
                    pca pcaVar7 = (pca) pbzVar.b;
                    abxj abxjVar = pcaVar7.d;
                    if (!abxjVar.c()) {
                        int size = abxjVar.size();
                        pcaVar7.d = abxjVar.d(size + size);
                    }
                    pcaVar7.d.h(i4);
                    pbzVar.f(abwkVar, pbwVar.b);
                }
                final pbx pbxVar = new pbx((pca) pbzVar.v());
                if (tksVarA.b(i2)) {
                    tkkVar.h.b();
                    tkkVar.c.b.b();
                    if (!(tksVarA instanceof tkr)) {
                        if (tksVarA instanceof tkn) {
                            tkkVar.i.d(acxnVar2, pbxVar);
                        }
                    } else {
                        final pel pelVar = tkkVar.d;
                        final pbt pbtVar = tkkVar.f;
                        final zpk zpkVar = ((tkr) tksVarA).a.c;
                        if (zpkVar == null) {
                            zpkVar = zpk.a;
                        }
                        pelVar.a.c(new pba() { // from class: pek
                            @Override // defpackage.pba
                            public final List a() {
                                pcc pccVar = pcc.a;
                                pcb pcbVar = new pcb();
                                if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pcbVar.y();
                                }
                                pbx pbxVar2 = pbxVar;
                                pbt pbtVar2 = pbtVar;
                                zpk zpkVar2 = zpkVar;
                                pcc pccVar2 = (pcc) pcbVar.b;
                                zpkVar2.getClass();
                                pccVar2.d = zpkVar2;
                                pccVar2.b |= 1;
                                pcbVar.f(pbtVar2.a, pbtVar2.b);
                                return yyk.o(new pdj(pal.a(), yyk.o((pcc) pcbVar.v()), pbxVar2, Instant.now().toEpochMilli()));
                            }
                        });
                    }
                }
            }
        }, "GilElementsInteractionLogger", "gesture");
    }

    @Override // defpackage.ocq
    public final void b(final yyk yykVar, final int i) {
        this.e.b(new Runnable() { // from class: tkd
            @Override // java.lang.Runnable
            public final void run() {
                if (i != 2) {
                    return;
                }
                tkk tkkVar = this.a;
                if (tkkVar.j) {
                    ((zdv) ((zdv) ((zdv) tkk.a.c()).o(tmm.a, tkkVar.g.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger", "updateVisibility", 211, "GilElementsInteractionLogger.java")).u("GilElementsInteractionLogger was cleaned up, cannot set VE to visible");
                    return;
                }
                yyk yykVar2 = yykVar;
                tkkVar.h.b();
                for (tks tksVar : tks.b.b(yykVar2)) {
                    if (tksVar instanceof tkn) {
                        tkkVar.i.g(tksVar.d);
                    }
                }
                tkkVar.c.b();
            }
        }, "GilElementsInteractionLogger", "visibility");
    }

    public final zpk c(acxn acxnVar) {
        yqw.M(!this.j, "GilElementsInteractionLogger was cleaned up");
        this.h.b();
        this.c.b();
        pbv pbvVarA = this.i.a(acxnVar.d);
        pbvVarA.getClass();
        return this.k.a(pbvVarA);
    }
}
