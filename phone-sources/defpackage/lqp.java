package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lqp implements idf {
    private final /* synthetic */ int a;

    public /* synthetic */ lqp(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.a) {
            case 0:
                vat vatVar = ((vei) obj).c;
                return vatVar == null ? vat.a : vatVar;
            case 1:
                vdo vdoVar = ((vei) obj).b;
                return vdoVar == null ? vdo.a : vdoVar;
            case 2:
                vdo vdoVar2 = ((vby) obj).b;
                return vdoVar2 == null ? vdo.a : vdoVar2;
            case 3:
                return (vat) ((vby) obj).c.get(0);
            case 4:
                vdo vdoVar3 = ((vel) obj).b;
                return vdoVar3 == null ? vdo.a : vdoVar3;
            case 5:
                ved vedVar = ((vel) obj).c;
                if (vedVar == null) {
                    vedVar = ved.a;
                }
                int iAK = a.aK(vedVar.b);
                return new lqu(iAK != 0 && iAK == 3);
            case 6:
                vdo vdoVar4 = ((ven) obj).b;
                return vdoVar4 == null ? vdo.a : vdoVar4;
            case 7:
                ved vedVar2 = ((ven) obj).c;
                if (vedVar2 == null) {
                    vedVar2 = ved.a;
                }
                int iAK2 = a.aK(vedVar2.b);
                return new lqx(iAK2 != 0 && iAK2 == 3);
            case 8:
                vdo vdoVar5 = ((vxx) obj).b;
                return vdoVar5 == null ? vdo.a : vdoVar5;
            case 9:
                vdo vdoVar6 = ((vxx) obj).b;
                return vdoVar6 == null ? vdo.a : vdoVar6;
            case 10:
                for (vxy vxyVar : ((vxx) obj).c) {
                    int i = vxyVar.b;
                    if (vyf.b(i) == 3) {
                        return ieg.f(new lrb(FluentIterable.from((i == 2 ? (vyc) vxyVar.c : vyc.a).b).transform(new lpn(7)).toList()));
                    }
                }
                return ieg.a;
            case 11:
                vdo vdoVar7 = ((vyj) obj).b;
                return vdoVar7 == null ? vdo.a : vdoVar7;
            case 12:
                vdo vdoVar8 = ((vym) obj).b;
                return vdoVar8 == null ? vdo.a : vdoVar8;
            case 13:
                vdo vdoVar9 = ((vyp) obj).b;
                return vdoVar9 == null ? vdo.a : vdoVar9;
            case 14:
                vdo vdoVar10 = ((vzf) obj).d;
                return vdoVar10 == null ? vdo.a : vdoVar10;
            case 15:
                vdo vdoVar11 = ((vfg) obj).c;
                return vdoVar11 == null ? vdo.a : vdoVar11;
            case 16:
                vdo vdoVar12 = ((vfg) obj).c;
                return vdoVar12 == null ? vdo.a : vdoVar12;
            case 17:
                vfg vfgVar = (vfg) obj;
                if ((vfgVar.b & 32) == 0) {
                    return new lrw(ImmutableMap.of());
                }
                vfa vfaVar = vfgVar.h;
                if (vfaVar == null) {
                    vfaVar = vfa.a;
                }
                return new lrw(ImmutableMap.copyOf(DesugarCollections.unmodifiableMap(vfaVar.b)));
            case 18:
                vdo vdoVar13 = ((vfg) obj).c;
                return vdoVar13 == null ? vdo.a : vdoVar13;
            case 19:
                HashMap map = new HashMap();
                vfp vfpVar = ((vfg) obj).g;
                if (vfpVar == null) {
                    vfpVar = vfp.a;
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(vfpVar.b).entrySet()) {
                    map.put((String) entry.getKey(), new kyr(ImmutableMap.copyOf(DesugarCollections.unmodifiableMap(((vfs) entry.getValue()).b)), ImmutableMap.copyOf(DesugarCollections.unmodifiableMap(((vfs) entry.getValue()).c))));
                }
                return new lrx(ImmutableMap.copyOf((Map) map));
            default:
                vdo vdoVar14 = ((vzu) obj).b;
                return vdoVar14 == null ? vdo.a : vdoVar14;
        }
    }
}
