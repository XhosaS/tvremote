package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ars implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ars(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, my] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v5, types: [bdy, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        yqe yqeVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                cfk.i((cfc) obj, (String) this.a);
                break;
            case 1:
                boi boiVar = (boi) obj;
                ayd aydVar = ((auv) this.a).b;
                float fB = aydVar.b();
                float fA = aydVar.n().a();
                float f = fB < fA ? fA - fB : 0.0f;
                boiVar.u(f > 0.0f ? (Float.intBitsToFloat((int) (boiVar.n & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & boiVar.n)) : 1.0f);
                boiVar.y(brx.E(0.5f, 0.0f));
                break;
            case 2:
                bpq bpqVar = (bpq) obj;
                long j = ((bnq) this.a.a()).h;
                if (!a.s(j, bnq.g)) {
                    brx.o(bpqVar, j, 0L, 0L, 0.0f, null, R.styleable.AppCompatTheme_windowNoTitle);
                }
                break;
            case 3:
                cfc cfcVar = (cfc) obj;
                int i = asg.a;
                cfk.g(cfcVar, (String) this.a);
                cfk.k(cfcVar, 5);
                break;
            case 4:
                long j2 = atc.a;
                this.a.a();
                break;
            case 5:
                cfc cfcVar2 = (cfc) obj;
                long j3 = atc.a;
                cfk.i(cfcVar2, (String) this.a);
                cfk.p(cfcVar2, 0.0f);
                break;
            case 6:
                boi boiVar2 = (boi) obj;
                float fFloatValue = ((Number) ((mr) this.a).d()).floatValue();
                float fB2 = atc.b(boiVar2, fFloatValue);
                float fC = atc.c(boiVar2, fFloatValue);
                boiVar2.u(fC != 0.0f ? fB2 / fC : 1.0f);
                boiVar2.y(atc.a);
                break;
            case 7:
                this.a.a();
                break;
            case 8:
                Object obj2 = this.a;
                ((asv) obj2).show();
                break;
            case 9:
                ?? r0 = this.a;
                cfc cfcVar3 = (cfc) obj;
                int i2 = atj.a;
                Object objA = r0.a();
                Float f2 = (Float) (true != Float.isNaN(((Number) objA).floatValue()) ? objA : null);
                cfk.j(cfcVar3, new cey(f2 != null ? f2.floatValue() : 0.0f, new ylz(0.0f, 1.0f)));
                break;
            case 10:
                ((boi) obj).m(((Number) ((mr) this.a).d()).floatValue());
                break;
            case 11:
                break;
            case 12:
                ((Float) obj).floatValue();
                break;
            case 13:
                Object obj3 = this.a;
                ave aveVar = ave.a;
                break;
            case 14:
                long j4 = ((cmh) obj).a;
                bxa bxaVar = avm.a;
                avn avnVar = (avn) this.a;
                avnVar.k.h((int) (j4 >> 32));
                avnVar.l.h((int) (4294967295L & j4));
                break;
            case 15:
                float fFloatValue2 = ((Float) obj).floatValue();
                avn avnVar2 = (avn) this.a;
                ylz ylzVar = avnVar2.h;
                bxa bxaVar2 = avm.a;
                float fI = ykn.i(fFloatValue2, ((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue());
                if (fI != avnVar2.d()) {
                    if (fI != avnVar2.d()) {
                        yjv yjvVar = avnVar2.b;
                        if (yjvVar != null) {
                            yjvVar.a(Float.valueOf(fI));
                        } else {
                            avnVar2.k(fI);
                        }
                    }
                    z = true;
                }
                break;
            case 16:
                avn avnVar3 = (avn) this.a;
                avnVar3.h(0.0f);
                avnVar3.f.a();
                break;
            case 17:
                break;
            case 18:
                ?? r02 = this.a;
                cfc cfcVar4 = (cfc) obj;
                my myVar = axj.a;
                Object objA2 = r02.a();
                Float f3 = (Float) (true != Float.isNaN(((Number) objA2).floatValue()) ? objA2 : null);
                float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
                if (fFloatValue3 < 0.0f) {
                    fFloatValue3 = 0.0f;
                }
                if (fFloatValue3 > 1.0f) {
                    fFloatValue3 = 1.0f;
                }
                cfk.j(cfcVar4, new cey(fFloatValue3, new ylz(0.0f, 1.0f)));
                break;
            case 19:
                ((ayk) this.a).k.h(((Number) ((mr) obj).d()).floatValue() % 1.0f);
                break;
            default:
                blr blrVar = (blr) obj;
                Object obj4 = this.a;
                final ayk aykVar = (ayk) obj4;
                float fFloatValue4 = ((Number) aykVar.l.a()).floatValue();
                if (fFloatValue4 < 0.0f) {
                    fFloatValue4 = 0.0f;
                }
                if (fFloatValue4 > 1.0f) {
                    fFloatValue4 = 1.0f;
                }
                float fFloatValue5 = ((Number) aykVar.m.a(Float.valueOf(fFloatValue4))).floatValue();
                float f4 = fFloatValue5 >= 0.0f ? fFloatValue5 : 0.0f;
                mr mrVarA = aykVar.h;
                float f5 = f4 <= 1.0f ? f4 : 1.0f;
                if (mrVarA == null) {
                    mrVarA = ms.a(f5);
                    aykVar.h = mrVarA;
                }
                bko bkoVar = (bko) obj4;
                if (bkoVar.A && ((Number) mrVarA.c()).floatValue() != f5 && ((yqeVar = aykVar.i) == null || yqeVar.w())) {
                    aykVar.i = ykr.q(bkoVar.F(), null, 0, new axb(mrVarA, f5, (yih) null, 3), 3);
                }
                break;
        }
        return ygi.a;
    }
}
