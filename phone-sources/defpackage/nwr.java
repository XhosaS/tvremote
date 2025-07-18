package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class nwr {
    private final String f;
    private final String g;
    private final Context i;
    private final Looper j;
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private final Map h = new ir();
    public final Map c = new ir();
    private final nvj k = nvj.a;
    private final ocv l = ond.d;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public nwr(Context context) {
        this.i = context;
        this.j = context.getMainLooper();
        this.f = context.getPackageName();
        this.g = context.getClass().getName();
    }

    public final nwu a() {
        Map map = this.c;
        ocv.au(!map.isEmpty(), "must call addApi() to add at least one API");
        one oneVar = one.a;
        jzs jzsVar = ond.c;
        if (map.containsKey(jzsVar)) {
            oneVar = (one) map.get(jzsVar);
        }
        Set set = this.a;
        oav oavVar = new oav(null, set, this.h, this.f, this.g, oneVar);
        Map map2 = oavVar.d;
        ir irVar = new ir();
        ir irVar2 = new ir();
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        jzs jzsVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (jzsVar2 != null) {
                    Object obj = jzsVar2.a;
                    ocv.aB(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", obj);
                    ocv.aB(set.equals(this.b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", obj);
                }
                nyw.l(irVar2.values(), true);
                nyw nywVar = new nyw(this.i, new ReentrantLock(), this.j, oavVar, this.k, this.l, irVar, this.d, this.e, irVar2, arrayList);
                Set set2 = nwu.a;
                synchronized (set2) {
                    set2.add(nywVar);
                }
                return nywVar;
            }
            jzs jzsVar3 = (jzs) it.next();
            oav oavVar2 = oavVar;
            Object obj2 = map.get(jzsVar3);
            boolean z = map2.get(jzsVar3) != null;
            irVar.put(jzsVar3, Boolean.valueOf(z));
            nxy nxyVar = new nxy(jzsVar3, z);
            arrayList.add(nxyVar);
            Object obj3 = jzsVar3.c;
            ocv.aF(obj3);
            nwj nwjVarB = ((ocv) obj3).b(this.i, this.j, oavVar2, obj2, nxyVar, nxyVar);
            oavVar = oavVar2;
            irVar2.put(jzsVar3.b, nwjVarB);
            if (nwjVarB.k()) {
                if (jzsVar2 != null) {
                    throw new IllegalStateException(((String) jzsVar3.a) + " cannot be used with " + ((String) jzsVar2.a));
                }
                jzsVar2 = jzsVar3;
            }
        }
    }

    public final void b(jzs jzsVar) {
        ocv.aG(jzsVar, "Api must not be null");
        this.c.put(jzsVar, null);
        Object obj = jzsVar.c;
        ocv.aG(obj, "Base client builder must not be null");
        Set set = this.b;
        List listC = ((ocv) obj).c(null);
        set.addAll(listC);
        this.a.addAll(listC);
    }
}
