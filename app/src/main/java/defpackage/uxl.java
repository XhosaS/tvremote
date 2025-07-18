package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxl implements mox {
    private static final zfh a = zfh.h("TvWrapperConverter");
    private final oat b;
    private final uwm c;
    private final zyg d;

    public uxl(oat oatVar, uwm uwmVar, zyg zygVar) {
        this.b = oatVar;
        this.c = uwmVar;
        this.d = zygVar;
    }

    @Override // defpackage.mox
    public final /* bridge */ /* synthetic */ drn a(dru druVar, oal oalVar, MessageLite messageLite, List list) {
        adfg adfgVar = (adfg) messageLite;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("tv_wrapper() must have exactly 1 child");
        }
        if (list.size() > 1) {
            ((zfd) ((zfd) a.d()).q("com/google/android/libraries/tv/xuikit/tvwrapper/TvWrapperConverter", "create", 65, "TvWrapperConverter.java")).u("tv_wrapper() was given more than 1 child. tv_wrapper() will only render the first child.");
        }
        dug dugVar = new dug();
        uxi uxiVar = new uxi(druVar, new uxk());
        uxiVar.c.n = dugVar;
        uxk uxkVar = uxiVar.a;
        uxkVar.v = dugVar;
        BitSet bitSet = uxiVar.e;
        bitSet.set(9);
        drq drqVar = (drq) list.get(0);
        adfe adfeVar = null;
        uxkVar.a = drqVar == null ? null : drqVar.l();
        bitSet.set(0);
        uxkVar.c = this.b;
        bitSet.set(2);
        uxkVar.e = this.c;
        bitSet.set(4);
        uxkVar.w = this.d;
        bitSet.set(10);
        uxkVar.u = adfgVar.g;
        bitSet.set(8);
        uxkVar.r = adfgVar.h;
        bitSet.set(6);
        adfi adfiVar = adfgVar.d;
        if (adfiVar == null) {
            adfiVar = adfi.a;
        }
        uxkVar.d = adfiVar;
        bitSet.set(3);
        adfi adfiVar2 = adfgVar.e;
        if (adfiVar2 == null) {
            adfiVar2 = adfi.a;
        }
        uxkVar.t = adfiVar2;
        bitSet.set(7);
        adfi adfiVar3 = adfgVar.f;
        if (adfiVar3 == null) {
            adfiVar3 = adfi.a;
        }
        uxkVar.f = adfiVar3;
        bitSet.set(5);
        if ((adfgVar.c & 32) != 0 && (adfeVar = adfgVar.i) == null) {
            adfeVar = adfe.a;
        }
        uxkVar.s = adfeVar;
        uxkVar.b = oalVar;
        bitSet.set(1);
        return uxiVar;
    }
}
