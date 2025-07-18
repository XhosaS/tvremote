package defpackage;

import android.content.Intent;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class blh {
    public final bmn a;
    public final String[] b;
    public final boa c;
    public final Map d;
    public final ReentrantLock e;
    public final agum f;
    public final agum g;
    public Intent h;
    public blp i;
    public final Object j;
    private final Map k;
    private final Map l;

    public blh(bmn bmnVar, Map map, Map map2, String... strArr) {
        this.a = bmnVar;
        this.k = map;
        this.l = map2;
        this.b = strArr;
        boa boaVar = new boa(bmnVar, map, map2, strArr, bmnVar.k, new blf(this));
        this.c = boaVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new agum() { // from class: blb
            @Override // defpackage.agum
            public final Object a() {
                return agpu.a;
            }
        };
        this.g = new agum() { // from class: blc
            @Override // defpackage.agum
            public final Object a() {
                return agpu.a;
            }
        };
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.j = new Object();
        boaVar.f = new agum() { // from class: bld
            @Override // defpackage.agum
            public final Object a() {
                bmn bmnVar2 = this.a.a;
                boolean z = true;
                if (bmnVar2.r() && !bmnVar2.t()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    public final Object a(agsw agswVar) {
        Object objE = this.c.e(agswVar);
        return objE == agtg.a ? objE : agpu.a;
    }

    public final void b() {
        this.c.g(this.f, this.g);
    }
}
