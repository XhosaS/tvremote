package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhu implements lht {
    private static final ujr a;
    private final lge b;
    private final idf c;
    private final idf d;
    private final ulp e;

    static {
        ujr ujrVar = new ujr();
        ujrVar.a = true;
        a = ujrVar;
    }

    public lhu(lge lgeVar, lxp lxpVar, Context context) {
        this.b = lgeVar;
        this.c = lxpVar.e(kvf.class);
        this.d = lxpVar.e(kwn.class);
        this.e = ulp.c(context);
    }

    private static final void b(onz onzVar) {
        try {
            osk.t(onzVar, 5L, TimeUnit.MINUTES);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            krd.d("Failed to execute FirebaseAppIndex task", e);
        }
    }

    @Override // defpackage.lht
    public final void a() {
        lgf lgfVar = (lgf) this.b;
        ImmutableList immutableListD = lgfVar.d("asset_type = 6", new String[0]);
        ImmutableList immutableListE = lgfVar.e("asset_type = 20 OR asset_type = 19", new String[0]);
        List list = (List) this.c.b(immutableListD);
        List list2 = (List) this.d.b(immutableListE);
        ukd ukdVar = new ukd(4, null, null, null, null, null, null);
        ulp ulpVar = this.e;
        b(ulpVar.a(ukdVar));
        ArrayList arrayList = new ArrayList(Math.min(list.size(), 1000));
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1000;
            int iMin = Math.min(i2, list.size());
            while (i < iMin) {
                kvf kvfVar = (kvf) list.get(i);
                ujs ujsVar = new ujs("Movie");
                ujsVar.f(kvfVar.E());
                ujsVar.e(kxd.b(kvfVar.o().c).toString());
                ujsVar.d(String.format("https://play.google.com/movies/movies?v=%s", kvfVar.o().b));
                ujsVar.c(a);
                arrayList.add(ujsVar.a());
                i++;
            }
            b(ulpVar.b((Thing[]) arrayList.toArray(new Thing[arrayList.size()])));
            arrayList.clear();
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(Math.min(list2.size(), 1000));
        int i3 = 0;
        while (i3 < list2.size()) {
            int i4 = i3 + 1000;
            int iMin2 = Math.min(i4, list2.size());
            while (i3 < iMin2) {
                kwn kwnVar = (kwn) list2.get(i3);
                ujs ujsVar2 = new ujs("TVSeries");
                ujsVar2.f(kwnVar.g);
                ksy ksyVar = kwnVar.d;
                ujsVar2.e(kxd.f(ksyVar.c).toString());
                ujsVar2.d(String.format("https://play.google.com/movies/shows?sh=%s", ksyVar.b));
                ujsVar2.c(a);
                arrayList2.add(ujsVar2.a());
                i3++;
            }
            ulpVar.b((Thing[]) arrayList2.toArray(new Thing[arrayList2.size()]));
            arrayList2.clear();
            i3 = i4;
        }
    }
}
