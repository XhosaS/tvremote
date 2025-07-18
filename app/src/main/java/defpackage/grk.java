package defpackage;

import android.content.Intent;
import j$.time.Duration;
import j$.util.Map;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grk implements jad {
    private final agum a;
    private final gri b;
    private final String c;
    private final htd d;
    private final izr e;
    private final Set f = new LinkedHashSet();
    private final agpc g = new agpn(new agum() { // from class: grj
        @Override // defpackage.agum
        public final Object a() {
            adyz adyzVar = adyz.a;
            adyy adyyVar = new adyy();
            Duration duration = Duration.ZERO;
            duration.getClass();
            adyx adyxVarA = htb.a(duration);
            if ((adyyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adyyVar.y();
            }
            adyz adyzVar2 = (adyz) adyyVar.b;
            adyzVar2.d = adyxVarA;
            adyzVar2.b |= 1;
            abxd abxdVarV = adyyVar.v();
            abxdVarV.getClass();
            return (adyz) abxdVarV;
        }
    });

    public grk(agum agumVar, gri griVar, String str, htd htdVar, izr izrVar) {
        this.a = agumVar;
        this.b = griVar;
        this.c = str;
        this.d = htdVar;
        this.e = izrVar;
    }

    @Override // defpackage.jad
    public final void ai(jae jaeVar) {
        htg htgVarA;
        while (!jaeVar.d() && (htgVarA = jaeVar.a()) != null) {
            if (htgVarA.f() != 0) {
                String str = htgVarA.g(0).j;
                if (str != null && str.length() != 0) {
                    Set set = this.f;
                    if (set.contains(str)) {
                        continue;
                    } else {
                        set.add(str);
                        String str2 = this.c;
                        if (str2 == null || agvy.c(str2, str)) {
                            Map mapB = htb.b(b());
                            adyx adyxVar = b().d;
                            if (adyxVar == null) {
                                adyxVar = adyx.a;
                            }
                            adyxVar.getClass();
                            adyx adyxVar2 = (adyx) Map.EL.getOrDefault(mapB, str, adyxVar);
                            int iF = htgVarA.f();
                            for (int i = 0; i < iF; i++) {
                                htf htfVarG = htgVarA.g(i);
                                htd htdVarA = htd.a.a(htfVarG);
                                Intent intent = htfVarG.i;
                                String action = intent.getAction();
                                if (action != null && action.length() != 0 && htb.c(adyxVar2, htdVarA, this.d)) {
                                    this.b.d(jaeVar.b, htfVarG.j, intent);
                                    if (str2 == null) {
                                        return;
                                    }
                                    this.e.b();
                                    this.b.e();
                                    this.a.a();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jaeVar.c()) {
            return;
        }
        this.e.b();
        this.b.e();
        this.a.a();
    }

    public final adyz b() {
        return (adyz) this.g.a();
    }
}
