package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgk extends agtu implements agvb {
    int a;
    final /* synthetic */ fgl b;
    final /* synthetic */ byte[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgk(fgl fglVar, byte[] bArr, agsw agswVar) {
        super(2, agswVar);
        this.b = fglVar;
        this.c = bArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws abxv {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Duration durationOfMillis = Duration.ofMillis(100L);
            durationOfMillis.getClass();
            this.a = 1;
            if (zty.a(durationOfMillis, this) == agtgVar) {
                return agtgVar;
            }
        }
        fgl fglVar = this.b;
        fey feyVar = fglVar.r;
        if (feyVar != null) {
            String strA = fglVar.A(this.c);
            if (strA == null) {
                strA = "";
            }
            String str = fglVar.t;
            feyVar.x(strA, str != null ? str : "");
        }
        fglVar.B = null;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgk(this.b, this.c, agswVar);
    }
}
