package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwa implements mox {
    private final oat a;
    private final zyg b;

    public uwa(oat oatVar, zyg zygVar) {
        this.a = oatVar;
        this.b = zygVar;
    }

    @Override // defpackage.mox
    public final /* synthetic */ drn a(dru druVar, oal oalVar, MessageLite messageLite, List list) {
        tln tlnVar;
        adeu adeuVar = (adeu) messageLite;
        if (list == null || list.size() != 1) {
            throw new IllegalArgumentException("focus_animated_card() must have exactly one child");
        }
        ocj ocjVar = ((nyx) oalVar).q;
        if (ocjVar == null || (tlnVar = ((nza) ocjVar).i) == null) {
            throw new IllegalArgumentException("FocusAnimatedCardConverter ConversionContext must have an ElementsConfig with a layoutExecutor()");
        }
        uvw uvwVar = new uvw(dru.c(druVar), new uvz());
        drq drqVar = (drq) list.get(0);
        uvz uvzVar = uvwVar.a;
        uvzVar.a = drqVar == null ? null : drqVar.l();
        BitSet bitSet = uvwVar.d;
        bitSet.set(0);
        uvzVar.t = new dub(tlnVar);
        bitSet.set(8);
        uvzVar.u = this.b;
        bitSet.set(9);
        uvzVar.b = this.a;
        bitSet.set(1);
        uvzVar.c = adeuVar.c;
        bitSet.set(2);
        uvzVar.f = adeuVar.d;
        bitSet.set(5);
        uvzVar.e = adeuVar.e;
        bitSet.set(4);
        uvzVar.d = adeuVar.f;
        bitSet.set(3);
        uvzVar.s = adeuVar.g;
        bitSet.set(7);
        uvzVar.r = adeuVar.h;
        bitSet.set(6);
        return uvwVar;
    }
}
