package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdp extends sbx {
    public final jaf a;
    public final jan b;
    private final ihg c;
    private final kja d;
    private final kdh e;

    public kdp(kdh kdhVar, jan janVar, jaf jafVar, ihg ihgVar, kja kjaVar) {
        janVar.getClass();
        jafVar.getClass();
        kjaVar.getClass();
        this.e = kdhVar;
        this.b = janVar;
        this.a = jafVar;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        kdr kdrVar = new kdr(this.e.a);
        kdrVar.a = new jsi(this, (kdo) obj, 14);
        kdrVar.b = new jfu(this, 7);
        return kdrVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        kdo kdoVar = (kdo) obj;
        kdr kdrVar = (kdr) obj2;
        yva yvaVar = ((kiz) this.d).a;
        o(yvaVar);
        wls wlsVar = kdrVar.c;
        wls wlsVar2 = kdoVar.e;
        if (!yks.e(wlsVar, wlsVar2)) {
            kdrVar.c = wlsVar2;
            kdrVar.G(0);
        }
        wls wlsVar3 = kdoVar.f;
        if (!yks.e(kdrVar.d, wlsVar3)) {
            kdrVar.d = wlsVar3;
            kdrVar.G(1);
        }
        wlx wlxVar = kdoVar.g;
        if (!yks.e(kdrVar.e, wlxVar)) {
            kdrVar.e = wlxVar;
            kdrVar.G(2);
        }
        kdrVar.f = new scc("R.id.provider_item", kdrVar, new juu(this, kdoVar, 4));
        kdrVar.G(3);
        boolean z = kdoVar.h;
        if (!yks.e(Boolean.valueOf(kdrVar.i), Boolean.valueOf(z))) {
            kdrVar.i = z;
            kdrVar.G(6);
        }
        String str = kdoVar.c;
        if (!yks.e(kdrVar.g, str)) {
            kdrVar.g = str;
            kdrVar.G(4);
        }
        String str2 = kdoVar.j;
        if (!yks.e(kdrVar.h, str2)) {
            kdrVar.h = str2;
            kdrVar.G(5);
        }
        if (this.c.a()) {
            int i = kdoVar.k;
            if (kdrVar.l != i) {
                kdrVar.l = i;
                kdrVar.G(7);
            }
            wfo wfoVar = (wfo) yvaVar.d();
            if (!yks.e(kdrVar.k, wfoVar)) {
                kdrVar.k = wfoVar;
                kdrVar.G(9);
            }
            Boolean boolValueOf = Boolean.valueOf(kdoVar.i);
            if (yks.e(kdrVar.j, boolValueOf)) {
                return;
            }
            kdrVar.j = boolValueOf;
            kdrVar.G(8);
        }
    }
}
