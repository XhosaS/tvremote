package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjd extends sbx {
    private final ihg a;
    private final kja b;
    private final cxe c;

    public jjd(cxe cxeVar, ihg ihgVar, kja kjaVar) {
        kjaVar.getClass();
        this.c = cxeVar;
        this.a = ihgVar;
        this.b = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new jjg(this.c.a);
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jjg jjgVar = (jjg) obj2;
        wuw wuwVar = (wuw) ((cxe) obj).a;
        sco scoVar = new sco(wuwVar.d);
        if (!yks.e(jjgVar.a, scoVar)) {
            jjgVar.a = scoVar;
            jjgVar.G(0);
        }
        if (this.a.a()) {
            yva yvaVar = ((kiz) this.b).a;
            o(yvaVar);
            wfo wfoVar = (wfo) yvaVar.d();
            if (!yks.e(jjgVar.e, wfoVar)) {
                jjgVar.e = wfoVar;
                jjgVar.G(4);
            }
        }
        int i = wuwVar.b;
        if (i == 2) {
            woc wocVar = (woc) wuwVar.c;
            if (yks.e(jjgVar.d, wocVar)) {
                return;
            }
            jjgVar.d = wocVar;
            jjgVar.G(3);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                wls wlsVar = (wls) wuwVar.c;
                if (yks.e(jjgVar.c, wlsVar)) {
                    return;
                }
                jjgVar.c = wlsVar;
                jjgVar.G(2);
                return;
            }
            return;
        }
        wla wlaVar = (wla) wuwVar.c;
        if (wlaVar.b == 1) {
            wlx wlxVar = (wlx) wlaVar.c;
            if (yks.e(jjgVar.b, wlxVar)) {
                return;
            }
            jjgVar.b = wlxVar;
            jjgVar.G(1);
        }
    }
}
