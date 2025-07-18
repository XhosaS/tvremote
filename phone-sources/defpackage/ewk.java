package defpackage;

import com.google.common.collect.MultimapBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewk extends evg {
    private static final dzy a;
    private final ewb[] b;
    private final List c;
    private final eay[] d;
    private final ArrayList e;
    private int f = -1;
    private long[][] g;
    private ewj h;

    static {
        dzl dzlVar = new dzl();
        dzlVar.b("MergingMediaSource");
        a = dzlVar.a();
    }

    public ewk(ewb... ewbVarArr) {
        this.b = ewbVarArr;
        this.e = new ArrayList(Arrays.asList(ewbVarArr));
        this.c = new ArrayList(ewbVarArr.length);
        int i = 0;
        while (true) {
            int length = ewbVarArr.length;
            if (i >= length) {
                this.d = new eay[length];
                this.g = new long[0][];
                new HashMap();
                MultimapBuilder.hashKeys().arrayListValues().build();
                return;
            }
            this.c.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.ewb
    public final dzy a() {
        ewb[] ewbVarArr = this.b;
        return ewbVarArr.length > 0 ? ewbVarArr[0].a() : a;
    }

    @Override // defpackage.evg, defpackage.ewb
    public final void c() throws ewj {
        ewj ewjVar = this.h;
        if (ewjVar != null) {
            throw ewjVar;
        }
        super.c();
    }

    @Override // defpackage.evg
    protected final /* bridge */ /* synthetic */ evz d(Object obj, evz evzVar) {
        Object obj2;
        int iIntValue = ((Integer) obj).intValue();
        List list = this.c;
        List list2 = (List) list.get(iIntValue);
        int i = 0;
        while (true) {
            if (i >= list2.size()) {
                obj2 = null;
                break;
            }
            if (((evz) ((epm) list2.get(i)).b).equals(evzVar)) {
                obj2 = ((epm) ((List) list.get(0)).get(i)).b;
                break;
            }
            i++;
        }
        return (evz) obj2;
    }

    @Override // defpackage.evg
    protected final /* bridge */ /* synthetic */ void e(Object obj, ewb ewbVar, eay eayVar) {
        int iB;
        if (this.h != null) {
            return;
        }
        if (this.f == -1) {
            iB = eayVar.b();
            this.f = iB;
        } else {
            int iB2 = eayVar.b();
            int i = this.f;
            if (iB2 != i) {
                this.h = new ewj();
                return;
            }
            iB = i;
        }
        if (this.g.length == 0) {
            this.g = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.d.length);
        }
        ArrayList arrayList = this.e;
        arrayList.remove(ewbVar);
        eay[] eayVarArr = this.d;
        eayVarArr[((Integer) obj).intValue()] = eayVar;
        if (arrayList.isEmpty()) {
            y(eayVarArr[0]);
        }
    }

    @Override // defpackage.evg, defpackage.euv
    protected final void g(efy efyVar) {
        super.g(efyVar);
        int i = 0;
        while (true) {
            ewb[] ewbVarArr = this.b;
            if (i >= ewbVarArr.length) {
                return;
            }
            f(Integer.valueOf(i), ewbVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ewb
    public final void i(evx evxVar) {
        ewi ewiVar = (ewi) evxVar;
        int i = 0;
        while (true) {
            ewb[] ewbVarArr = this.b;
            if (i >= ewbVarArr.length) {
                return;
            }
            List list = (List) this.c.get(i);
            evx evxVarK = ewiVar.k(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((epm) list.get(i2)).a.equals(evxVarK)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            ewbVarArr[i].i(ewiVar.k(i));
            i++;
        }
    }

    @Override // defpackage.evg, defpackage.euv
    protected final void j() {
        super.j();
        Arrays.fill(this.d, (Object) null);
        this.f = -1;
        this.h = null;
        ArrayList arrayList = this.e;
        arrayList.clear();
        Collections.addAll(arrayList, this.b);
    }

    @Override // defpackage.euv, defpackage.ewb
    public final void n(dzy dzyVar) {
        this.b[0].n(dzyVar);
    }

    @Override // defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        ewb[] ewbVarArr = this.b;
        return ewbVarArr.length > 0 && ewbVarArr[0].o(dzyVar);
    }

    @Override // defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        eay[] eayVarArr = this.d;
        ewb[] ewbVarArr = this.b;
        int length = ewbVarArr.length;
        evx[] evxVarArr = new evx[length];
        int iA = eayVarArr[0].a(evzVar.a);
        for (int i = 0; i < length; i++) {
            evz evzVarA = evzVar.a(eayVarArr[i].f(iA));
            evxVarArr[i] = ewbVarArr[i].p(evzVarA, ezpVar, j - this.g[iA][i]);
            ((List) this.c.get(i)).add(new epm(evzVarA, evxVarArr[i], (byte[]) null));
        }
        return new ewi(this.g[iA], evxVarArr);
    }
}
