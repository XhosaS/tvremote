package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnj extends nez {
    final /* synthetic */ lnk a;

    public lnj(lnk lnkVar) {
        this.a = lnkVar;
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        evz evzVar = eklVar.d;
        if (evzVar == null || !evzVar.b()) {
            lnk lnkVar = this.a;
            if (lnkVar.h) {
                this.b.f("cat", "trailer");
            }
            this.b.f("ctmp", "vp9HdrSupport:" + lnkVar.g);
            this.b.f("vod_type", true != lnkVar.i ? "tvod" : "avod");
            lny lnyVar = lnkVar.c;
            nfa nfaVar = this.b;
            lnt lntVar = new lnt(nfaVar, 2);
            lnt lntVar2 = new lnt(nfaVar, 3);
            if (!TextUtils.isEmpty(lnyVar.d)) {
                Map map = lnyVar.b;
                lny.b(map, lnyVar.f, lntVar);
                lny.b(map, lnyVar.e, lntVar);
                Map map2 = lnyVar.c;
                lny.b(map2, lnyVar.f, lntVar2);
                lny.b(map2, lnyVar.e, lntVar2);
            }
            lny.b(lnyVar.b, lnyVar.d, lntVar);
            lny.b(lnyVar.c, lnyVar.d, lntVar2);
        }
    }

    @Override // defpackage.nez
    public final void b() {
    }
}
