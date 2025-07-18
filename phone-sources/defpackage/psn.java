package defpackage;

import android.content.Context;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class psn implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ psn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        qvo qvoVar;
        cuh cuhVarA;
        switch (this.b) {
            case 0:
                gic gicVar = (gic) obj;
                ghiVarA = gicVar.a("DELETE FROM watch_next_programs WHERE package_name = ?");
                Object obj2 = this.a;
                try {
                    if (obj2 == null) {
                        ghiVarA.h(1);
                    } else {
                        ghiVarA.i(1, (String) obj2);
                    }
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar));
                } finally {
                }
            case 1:
                ghiVarA = ((gic) obj).a("SELECT COUNT(*) FROM watch_next_programs WHERE package_name = ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    return Long.valueOf(ghiVarA.l() ? ghiVarA.b(0) : 0L);
                } finally {
                }
            case 2:
                ghiVarA = ((gic) obj).a("SELECT COUNT(*) FROM channels WHERE package_name = ?");
                Object obj3 = this.a;
                try {
                    if (obj3 == null) {
                        ghiVarA.h(1);
                    } else {
                        ghiVarA.i(1, (String) obj3);
                    }
                    return Long.valueOf(ghiVarA.l() ? ghiVarA.b(0) : 0L);
                } finally {
                }
            case 3:
                gic gicVar2 = (gic) obj;
                ghiVarA = gicVar2.a("DELETE FROM channels WHERE package_name = ?");
                Object obj4 = this.a;
                try {
                    if (obj4 == null) {
                        ghiVarA.h(1);
                    } else {
                        ghiVarA.i(1, (String) obj4);
                    }
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar2));
                } finally {
                }
            case 4:
                ghiVarA = ((gic) obj).a("SELECT * FROM chime_thread_states WHERE thread_id = ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    return ghiVarA.l() ? new qax(ghiVarA.b(gez.J(ghiVarA, "id")), ghiVarA.d(gez.J(ghiVarA, "thread_id")), ghiVarA.b(gez.J(ghiVarA, "last_updated_version")), vmb.b((int) ghiVarA.b(gez.J(ghiVarA, "read_state"))), vll.b((int) ghiVarA.b(gez.J(ghiVarA, "deletion_status"))), a.bm((int) ghiVarA.b(gez.J(ghiVarA, "count_behavior"))), a.bm((int) ghiVarA.b(gez.J(ghiVarA, "system_tray_behavior"))), ghiVarA.b(gez.J(ghiVarA, "modified_timestamp"))) : null;
                } finally {
                }
            case 5:
                Map map = (Map) obj;
                tvn tvnVar = qku.a;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(yfm.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    ?? r3 = this.a;
                    linkedHashMap.put((qen) yfm.g(r3, entry.getKey()), entry.getValue());
                }
                return linkedHashMap;
            case 6:
                Map map2 = (Map) obj;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(yfm.e(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    ?? r32 = this.a;
                    linkedHashMap2.put((qen) yfm.g(r32, entry2.getKey()), entry2.getValue());
                }
                return linkedHashMap2;
            case 7:
                yjv yjvVar = (yjv) obj;
                yjvVar.getClass();
                yjvVar.a(this.a);
                return ygi.a;
            case 8:
                Context context = (Context) obj;
                int i = qya.b;
                if (context != null && (qvoVar = (qvo) ((qvp) this.a).a().f()) != null && (cuhVarA = qvoVar.a()) != null) {
                    cuhVarA.accept(context);
                }
                return ygi.a;
            case 9:
                AppCompatDialogFragment appCompatDialogFragment = (AppCompatDialogFragment) obj;
                appCompatDialogFragment.getClass();
                if (appCompatDialogFragment.getView() != null) {
                    qyi qyiVar = ((qyn) this.a).e;
                }
                return ygi.a;
            case 10:
                vrn vrnVar = (vrn) obj;
                vrnVar.getClass();
                qwn qwnVar = (qwn) this.a;
                if (rdd.h(qwnVar, vrnVar) != null) {
                    tst tstVar = qwnVar.e.k;
                }
                return null;
            case 11:
                View view = (View) obj;
                view.getClass();
                qzj qzjVar = (qzj) this.a;
                qzjVar.g.a(view, qzjVar.a);
                return vrr.a;
            case 12:
                View view2 = (View) obj;
                view2.getClass();
                rfc rfcVar = ((qzj) this.a).e;
                if (rfcVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                rfcVar.f.onClick(view2);
                return vrr.a;
            case 13:
                View view3 = (View) obj;
                view3.getClass();
                qzj qzjVar2 = (qzj) this.a;
                qyn qynVar = qzjVar2.g;
                vrn vrnVar2 = qzjVar2.a;
                Object obj5 = qynVar.l.a;
                ((qwn) obj5).d.c.a(view3, vrnVar2 != null ? rdd.h((qwn) obj5, vrnVar2) : null);
                return vrr.a;
            case 14:
                View view4 = (View) obj;
                view4.getClass();
                this.a.a(view4);
                return vrr.a;
            case 15:
                ((View) obj).getClass();
                ((qzp) this.a).d.b(true);
                return vrr.a;
            case 16:
                ((View) obj).getClass();
                ((qzp) this.a).d.b(false);
                return ygi.a;
            case 17:
                View view5 = (View) obj;
                view5.getClass();
                ((qzp) this.a).d.a(view5, null);
                return ygi.a;
            case 18:
                rdi rdiVar = (rdi) this.a;
                if (rdiVar.b) {
                    rdiVar.a.b(rdiVar.a());
                }
                return ygi.a;
            case 19:
                return obj == this.a ? "(this Collection)" : String.valueOf(obj);
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                entry3.getClass();
                Object key = entry3.getKey();
                ygq ygqVar = (ygq) this.a;
                return ygqVar.h(key) + "=" + ygqVar.h(entry3.getValue());
        }
    }
}
