package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgt implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public pgt(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new pkg(((rgq) this.a).a(), (qpl) this.b.b(), (byte[]) null);
            case 1:
                return new ydl(((rgq) this.a).a(), (qpl) this.b.b(), new kwy((byte[]) null));
            case 2:
                return new rdd();
            case 3:
                Set set = (Set) ((xcn) this.b).a;
                pkv pkvVar = (pkv) this.a.b();
                tvn tvnVar = pne.a;
                pno pnoVar = new pno(1);
                ImmutableSet.Builder builder = ImmutableSet.builder();
                builder.addAll((Iterable) set);
                builder.add((ImmutableSet.Builder) pkvVar.i);
                return new pkg(builder.build(), pnoVar);
            case 4:
                ((rgq) this.a).a();
                return new qtl();
            case 5:
                return new pnd((lia) this.a.b(), ((pmo) this.b).b());
            case 6:
                xcq xcqVar = this.b;
                yyh yyhVarB = ((qtb) this.a).b();
                pwl pwlVar = (pwl) xcqVar.b();
                pwlVar.getClass();
                return yyhVarB.l(pwlVar, "CHIME_PERIODIC_JOB", 7);
            case 7:
                return new pxz(((rmk) this.a).a(), ((mdx) this.b).a());
            case 8:
                return new pyj((qei) this.a.b(), ((qnj) this.b).b());
            case 9:
                qei qeiVar = (qei) this.a.b();
                ((qnj) this.b).b();
                return new ocv(qeiVar, (byte[]) null);
            case 10:
                qei qeiVar2 = (qei) this.a.b();
                ((qnj) this.b).b();
                return new ntp(qeiVar2);
            case 11:
                return new nsf((qei) this.a.b(), (qmt) ((qnj) this.b).b());
            case 12:
                qei qeiVar3 = (qei) this.a.b();
                ((qnj) this.b).b();
                return new ocv(qeiVar3);
            case 13:
                xcq xcqVar2 = this.b;
                yyh yyhVarB2 = ((qtb) this.a).b();
                pzu pzuVar = (pzu) xcqVar2.b();
                pzuVar.getClass();
                return yyhVarB2.l(pzuVar, "CHIME_THREAD_STATE_UPDATE", 10);
            case 14:
                xcq xcqVar3 = this.b;
                yyh yyhVarB3 = ((qtb) this.a).b();
                pzz pzzVar = (pzz) xcqVar3.b();
                pzzVar.getClass();
                return yyhVarB3.l(pzzVar, "CHIME_FETCH_LATEST_THREADS", 2);
            case 15:
                xcq xcqVar4 = this.b;
                yyh yyhVarB4 = ((qtb) this.a).b();
                qaa qaaVar = (qaa) xcqVar4.b();
                qaaVar.getClass();
                return yyhVarB4.l(qaaVar, "CHIME_FETCH_UPDATED_THREADS", 2);
            case 16:
                xcq xcqVar5 = this.b;
                yyh yyhVarB5 = ((qtb) this.a).b();
                qab qabVar = (qab) xcqVar5.b();
                qabVar.getClass();
                return yyhVarB5.l(qabVar, "CHIME_REMOVE_TARGET", 1);
            case 17:
                xcq xcqVar6 = this.b;
                yyh yyhVarB6 = ((qtb) this.a).b();
                qaf qafVar = (qaf) xcqVar6.b();
                qafVar.getClass();
                return yyhVarB6.l(qafVar, "CHIME_SET_USER_PREFERENCE", 6);
            case 18:
                xcq xcqVar7 = this.b;
                yyh yyhVarB7 = ((qtb) this.a).b();
                qag qagVar = (qag) xcqVar7.b();
                qagVar.getClass();
                return yyhVarB7.l(qagVar, "CHIME_STORE_TARGET", 1);
            case 19:
                return new nsf((qas) this.a.b(), (uhs) this.b.b(), null);
            default:
                return new rbi(new qal(((qaq) this.b).b(), (rbi) this.a.b(), 1));
        }
    }

    public pgt(xcq xcqVar, xcq xcqVar2, int i, short[] sArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}
