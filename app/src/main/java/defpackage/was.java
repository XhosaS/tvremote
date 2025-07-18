package defpackage;

import android.content.Intent;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class was implements wlk, wla {
    private final way a;
    private final Set b;

    public was(Map map, way wayVar, zyh zyhVar) {
        map.getClass();
        wayVar.getClass();
        zyhVar.getClass();
        this.a = wayVar;
        this.b = map.keySet();
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        wvx wvxVarF = wzg.f("Updating experiments", wwb.a, true);
        try {
            zyd zydVarG = stringExtra == null ? this.a.g() : this.b.contains(stringExtra) ? this.a.f(stringExtra) : zxy.a;
            vqi.c(zydVarG, "Failed updating experiments for package %s", stringExtra);
            zyd zydVarG2 = zud.g(zydVarG, Exception.class, wyo.a(new yqi() { // from class: war
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    ((Exception) obj).getClass();
                    return null;
                }
            }), zwk.a);
            aguc.a(wvxVarF, null);
            return zydVarG2;
        } finally {
        }
    }

    @Override // defpackage.wla
    public final long b() {
        return 25000L;
    }

    @Override // defpackage.wla
    public final long c() {
        return 25000L;
    }
}
