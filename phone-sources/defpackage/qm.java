package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qm implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v40, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ahn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ahn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v1, types: [clx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, my] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bie, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        Object obj;
        int i = 17;
        switch (this.c) {
            case 0:
                qn qnVar = (qn) this.a;
                bol bolVar = qnVar.d;
                ?? r2 = this.b;
                byu byuVar = (byu) r2;
                qnVar.e = bolVar.a(byuVar.n(), byuVar.o(), r2);
                return ygi.a;
            case 1:
                int i2 = mu.a;
                this.b.b(this.a);
                return ygi.a;
            case 2:
                ((ylf) this.b).a = fh.P(this.a, bwh.a);
                return ygi.a;
            case 3:
                aaz aazVar = (aaz) this.b.a();
                abw abwVar = (abw) this.a;
                return new abc(abwVar, aazVar, new eph(abwVar.d.c.a(), aazVar));
            case 4:
                return new adq(this.b, yhc.a, this.a);
            case 5:
                Object obj2 = this.b;
                Object obj3 = this.a;
                if (obj3 != null) {
                    ajs ajsVar = (ajs) obj3;
                    ?? r22 = ajsVar.b;
                    bje bjeVar = (bje) r22;
                    if (bjeVar.isEmpty()) {
                        obj = ajsVar.d;
                    } else {
                        fx fxVar = new fx((cfy) ajsVar.d);
                        int iA = bjeVar.a();
                        for (int i3 = 0; i3 < iA; i3++) {
                            ((yjv) r22.get(i3)).a(fxVar);
                        }
                        obj = fxVar.b;
                    }
                    ajsVar.d = obj;
                    if (obj != null) {
                        return obj;
                    }
                }
                return obj2;
            case 6:
                afi afiVar = new afi(this.b, 5);
                ags agsVar = (ags) this.a;
                return (agk) agsVar.a("dataBuilder", agsVar.d, afiVar);
            case 7:
                Object obj4 = this.b;
                Object obj5 = this.a;
                qm qmVar = new qm(obj5, obj4, 9);
                ags agsVar2 = (ags) obj5;
                return (bmy) agsVar2.a("positioner", agsVar2.e, qmVar);
            case 8:
                ((ylf) this.b).a = this.a.a();
                return ygi.a;
            case 9:
                bvc bvcVar = (bvc) ((ags) this.a).b.a();
                return this.b.c(bvcVar).i(bty.q(bvcVar));
            case 10:
                ((agl) this.a).d.a(this.b);
                return ygi.a;
            case 11:
                return new cmf(cme.d(this.a.a((bvc) this.b.a())));
            case 12:
                ?? r0 = this.a;
                ((ajk) r0).c.e();
                int i4 = (((bko) r0).A && ((cdv) fh.P(r0, ccq.n)).d()) ? 1 : 2;
                yld yldVar = (yld) this.b;
                int i5 = yldVar.a;
                int i6 = i4 * i5;
                yldVar.a = -i5;
                return Integer.valueOf(i6);
            case 13:
                if (!((alg) this.b).e) {
                    ((ajq) this.a).o();
                }
                return ygi.a;
            case 14:
                ykr.q(this.b, null, 4, new ajn((yjv) this.a, (yih) null, 6), 1);
                return ygi.a;
            case 15:
                int i7 = aoh.a;
                return new cb((aoi) this.a);
            case 16:
                asb asbVar = (asb) this.a;
                Object obj6 = asbVar.a;
                Object obj7 = this.b;
                if (!yks.e(obj7, obj6)) {
                    yfm.L(asbVar.b, new akh(obj7, i));
                    bcr bcrVar = asbVar.c;
                    if (bcrVar != null) {
                        bcrVar.a();
                    }
                }
                return ygi.a;
            case 17:
                auv auvVar = (auv) this.a;
                if (((Boolean) auvVar.b.b.a(auw.c)).booleanValue()) {
                    ykr.q(this.b, null, 0, new ajn(auvVar, (yih) null, 16, (byte[][]) null), 3);
                }
                return true;
            case 18:
                cvi cviVar = (cvi) this.a;
                if (!aun.d(cviVar)) {
                    ykr.q(this.b, null, 0, new ajn(cviVar, (yih) null, 19, (char[]) null), 3);
                }
                return ygi.a;
            case 19:
                float f = aun.a;
                return new cvi(ms.a(this.b == auo.b ? 1.0f : 0.0f), (my) this.a);
            default:
                asb asbVar2 = (asb) this.a;
                Object obj8 = asbVar2.a;
                Object obj9 = this.b;
                if (!yks.e(obj9, obj8)) {
                    yfm.L(asbVar2.b, new ars(obj9, i));
                    bcr bcrVar2 = asbVar2.c;
                    if (bcrVar2 != null) {
                        bcrVar2.a();
                    }
                }
                return ygi.a;
        }
    }

    public /* synthetic */ qm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
