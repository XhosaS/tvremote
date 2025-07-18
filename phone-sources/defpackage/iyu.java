package defpackage;

import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyu implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public iyu(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public final ImmutableSet a() {
        if (this.b != 0) {
            vuj vujVar = ((vxh) xjr.a.f(3, "GrowthkitFeature__interaction_types", new xde(7), "Cgmlwwm2lAr7kwo").et(((xjs) this.a).b().b)).b;
            vujVar.getClass();
            return ImmutableExtensionsKt.toImmutableSet((Collection) vujVar);
        }
        vuj vujVar2 = ((vxh) xjr.a.f(2, "GrowthkitFeature__impression_types", new xde(7), "Cgmlwwm2lAr7kwo").et(((xjs) this.a).b().b)).b;
        vujVar2.getClass();
        return ImmutableExtensionsKt.toImmutableSet((Collection) vujVar2);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
