package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jil extends agtu implements agvb {
    int a;
    final /* synthetic */ gez b;
    final /* synthetic */ jip c;
    final /* synthetic */ ahcb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jil(gez gezVar, jip jipVar, ahcb ahcbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gezVar;
        this.c = jipVar;
        this.d = ahcbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jil) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        rqw rqwVarC;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                Duration duration = jip.b;
                jik jikVar = new jik(this.d, null);
                this.a = 1;
                obj = zty.b(duration, jikVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            return (xhe) obj;
        } catch (ahem e) {
            gez gezVar = this.b;
            if (gezVar != null) {
                jip jipVar = this.c;
                agow agowVar = jipVar.e;
                gey geyVar = gez.a;
                if (geyVar.b(gezVar, agowVar, jipVar.d) && (rqwVarC = gfb.c(gezVar, agowVar)) != null) {
                    geyVar.d(((gfn) jipVar.f.a()).c(rqwVarC), gezVar, 7, 6).c(abqb.DEADLINE_EXCEEDED);
                }
            }
            ((zdv) ((zdv) jip.a.c()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/AppClientOpHandler$openProvider$3", "invokeSuspend", 248, "AppClientOpHandler.kt")).u("Timed out during OpenApp operation.");
            xhe xheVar = xhe.a;
            xhb xhbVar = new xhb();
            xjv xjvVar = xjv.a;
            xjs xjsVar = new xjs();
            xnw.b(xju.DEADLINE_EXCEEDED, xjsVar);
            if ((xjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xjsVar.y();
            }
            xjv xjvVar2 = (xjv) xjsVar.b;
            xjvVar2.b |= 2;
            xjvVar2.d = "Timed out during OpenApp operation.";
            xjv xjvVarA = xnw.a(xjsVar);
            if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhbVar.y();
            }
            xhe xheVar2 = (xhe) xhbVar.b;
            xheVar2.c = xjvVarA;
            xheVar2.b |= 1;
            return xkn.a(xhbVar);
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jil(this.b, this.c, this.d, agswVar);
    }
}
