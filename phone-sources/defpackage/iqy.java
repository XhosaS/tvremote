package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqy extends yiz implements yjz {
    int a;
    final /* synthetic */ wni b;
    final /* synthetic */ vtl c;
    final /* synthetic */ wni d;
    final /* synthetic */ wni e;
    final /* synthetic */ irc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqy(irc ircVar, wni wniVar, vtl vtlVar, wni wniVar2, wni wniVar3, yih yihVar) {
        super(2, yihVar);
        this.f = ircVar;
        this.b = wniVar;
        this.c = vtlVar;
        this.d = wniVar2;
        this.e = wniVar3;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new iqy(this.f, this.b, this.c, this.d, this.e, yihVar);
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, yfo] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                wni wniVar = this.b;
                irc ircVar = this.f;
                vtl vtlVar = this.c;
                wni wniVar2 = this.d;
                wni wniVar3 = this.e;
                vtw vtwVarM = wzq.a.m();
                vtwVarM.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wzq wzqVar = (wzq) vtwVarM.b;
                wzqVar.c = wniVar;
                wzqVar.b |= 1;
                vtw vtwVarM2 = wnj.a.m();
                vtwVarM2.getClass();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wnj wnjVar = (wnj) vtwVarM2.b;
                wnjVar.c = vtlVar;
                wnjVar.b |= 1;
                vwe vweVarE = vxf.e(System.currentTimeMillis());
                vweVarE.getClass();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wnj wnjVar2 = (wnj) vtwVarM2.b;
                wnjVar2.d = vweVarE;
                wnjVar2.b |= 2;
                vuc vucVarR = vtwVarM2.r();
                vucVarR.getClass();
                wnj wnjVar3 = (wnj) vucVarR;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wzq wzqVar2 = (wzq) vtwVarM.b;
                wzqVar2.d = wnjVar3;
                wzqVar2.b |= 2;
                vwe vweVarE2 = vxf.e(System.currentTimeMillis());
                vweVarE2.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wzq wzqVar3 = (wzq) vtwVarM.b;
                wzqVar3.f = vweVarE2;
                wzqVar3.b |= 8;
                int iAU = a.aU(wniVar.c);
                if (iAU != 0 && iAU == 6) {
                    vtw vtwVarM3 = wzp.a.m();
                    vtwVarM3.getClass();
                    if (wniVar2 == null) {
                        wniVar2 = wni.a;
                        wniVar2.getClass();
                    }
                    wniVar2.getClass();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    vuc vucVar = vtwVarM3.b;
                    wzp wzpVar = (wzp) vucVar;
                    wzpVar.c = wniVar2;
                    wzpVar.b |= 4;
                    if (wniVar3 == null) {
                        wniVar3 = wni.a;
                        wniVar3.getClass();
                    }
                    wniVar3.getClass();
                    if (!vucVar.A()) {
                        vtwVarM3.u();
                    }
                    wzp wzpVar2 = (wzp) vtwVarM3.b;
                    wzpVar2.d = wniVar3;
                    wzpVar2.b |= 8;
                    vuc vucVarR2 = vtwVarM3.r();
                    vucVarR2.getClass();
                    wzp wzpVar3 = (wzp) vucVarR2;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    wzq wzqVar4 = (wzq) vtwVarM.b;
                    wzqVar4.e = wzpVar3;
                    wzqVar4.b |= 4;
                }
                vuc vucVarR3 = vtwVarM.r();
                vucVarR3.getClass();
                wzq wzqVar5 = (wzq) vucVarR3;
                Object obj2 = ircVar.a;
                this.a = 1;
                obj = ((hfx) ((kdj) obj2).b.b()).c(new iml((kdj) obj2, wzqVar5, (yih) null, 7), this);
                if (obj == yioVar) {
                    return yioVar;
                }
            }
        } catch (xtl e) {
            if (yks.e(e.a, xtk.k)) {
                e.toString();
                krd.c("Failed to update playback state to server. ".concat(e.toString()));
            }
        }
        return ygi.a;
    }
}
