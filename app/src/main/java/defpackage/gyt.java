package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyt extends agtu implements agvb {
    int a;
    final /* synthetic */ gyv b;
    final /* synthetic */ yrn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyt(gyv gyvVar, yrn yrnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gyvVar;
        this.c = yrnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gyv gyvVar = this.b;
            Collection collection = (Collection) gyvVar.c.a();
            HashSet hashSet = gyvVar.i;
            hashSet.addAll(collection);
            if (((Boolean) gyvVar.b.a()).booleanValue()) {
                hashSet.add(gyvVar.f.a());
            }
            ((zdv) gyv.a.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem$start$1", "invokeSuspend", 173, "InitSystem.kt")).x("Processing %s async tasks", new qsg(hashSet.size()));
            yrn yrnVar = this.c;
            List listC = gyvVar.c(yrnVar);
            gyvVar.j.d();
            this.a = 1;
            if (gyvVar.b(listC, yrnVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.e();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gyt(this.b, this.c, agswVar);
    }
}
