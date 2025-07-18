package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qaz implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qaz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws Exception {
        ghi ghiVarA;
        long jL;
        int i = 17;
        int i2 = 0;
        int i3 = 1;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                return Long.valueOf(((qbc) this.a).b.c((gic) obj, this.b));
            case 1:
                Object obj2 = this.a;
                psl pslVar = (psl) this.b;
                String str = (String) obj2;
                pslVar.a(str);
                pslVar.d(str);
                return ygi.a;
            case 2:
                ghi ghiVarA2 = ((gic) obj).a((String) this.b);
                Object obj3 = this.a;
                try {
                    int length = ((String[]) obj3).length;
                    while (i2 < length) {
                        ghiVarA2.i(i3, ((String[]) obj3)[i2]);
                        i3++;
                        i2++;
                    }
                    int iJ = gez.J(ghiVarA2, "id");
                    int iJ2 = gez.J(ghiVarA2, "thread_id");
                    int iJ3 = gez.J(ghiVarA2, "last_updated_version");
                    int iJ4 = gez.J(ghiVarA2, "read_state");
                    int iJ5 = gez.J(ghiVarA2, "deletion_status");
                    int iJ6 = gez.J(ghiVarA2, "count_behavior");
                    int iJ7 = gez.J(ghiVarA2, "system_tray_behavior");
                    int iJ8 = gez.J(ghiVarA2, "modified_timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA2.l()) {
                        arrayList.add(new qax(ghiVarA2.b(iJ), ghiVarA2.d(iJ2), ghiVarA2.b(iJ3), vmb.b((int) ghiVarA2.b(iJ4)), vll.b((int) ghiVarA2.b(iJ5)), a.bm((int) ghiVarA2.b(iJ6)), a.bm((int) ghiVarA2.b(iJ7)), ghiVarA2.b(iJ8)));
                    }
                    return arrayList;
                } finally {
                    ghiVarA2.close();
                }
            case 3:
                ((qbc) this.a).c.c((gic) obj, this.b);
                return null;
            case 4:
                ((qlt) this.b).b.d((gic) obj, this.a);
                return ygi.a;
            case 5:
                gic gicVar = (gic) obj;
                gicVar.getClass();
                gei geiVar = ((qnw) this.b).b;
                ?? r7 = this.a;
                if (r7 == 0) {
                    return new Long[0];
                }
                ghiVarA = gicVar.a("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    int size = r7.size();
                    Long[] lArr = new Long[size];
                    while (i2 < size) {
                        Object obj4 = r7.get(i2);
                        if (obj4 != null) {
                            geiVar.b(ghiVarA, obj4);
                            ghiVarA.l();
                            ghiVarA.j();
                            jL = gez.L(gicVar);
                        } else {
                            jL = -1;
                        }
                        lArr[i2] = Long.valueOf(jL);
                        i2++;
                    }
                    wef.r(ghiVarA, null);
                    return lArr;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 6:
                return Integer.valueOf(((qnw) this.b).c.d((gic) obj, this.a));
            case 7:
                return Integer.valueOf(((qnw) this.b).c.d((gic) obj, this.a));
            case 8:
                gic gicVar2 = (gic) obj;
                gicVar2.getClass();
                yhp yhpVar = new yhp(bArr);
                gei geiVar2 = ((qnw) this.b).b;
                ?? r72 = this.a;
                ghiVarA = gicVar2.a("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    for (Object obj5 : r72) {
                        if (obj5 != null) {
                            geiVar2.b(ghiVarA, obj5);
                            ghiVarA.l();
                            ghiVarA.j();
                            yhpVar.add(Long.valueOf(gez.L(gicVar2)));
                        } else {
                            yhpVar.add(-1L);
                        }
                    }
                    wef.r(ghiVarA, null);
                    return yfm.o(yhpVar);
                } finally {
                }
            case 9:
                String str2 = ((nhr) this.b).e;
                if (str2 != null) {
                    ((qya) this.a).a(str2);
                }
                return ygi.a;
            case 10:
                AppCompatDialogFragment appCompatDialogFragment = (AppCompatDialogFragment) obj;
                appCompatDialogFragment.getClass();
                View view = appCompatDialogFragment.getView();
                if (view != null) {
                    Object obj6 = this.a;
                    Object obj7 = this.b;
                    vrn vrnVar = ((vpu) obj6).a;
                    qwn qwnVar = ((qyn) obj7).a;
                    qwnVar.d.a.a(view, rdd.h(qwnVar, vrnVar));
                }
                return ygi.a;
            case 11:
                AppCompatDialogFragment appCompatDialogFragment2 = (AppCompatDialogFragment) obj;
                appCompatDialogFragment2.getClass();
                View view2 = appCompatDialogFragment2.getView();
                if (view2 != null) {
                    ((qyn) this.b).e.a.a(view2, ((vqf) this.a).a);
                }
                return ygi.a;
            case 12:
                AppCompatDialogFragment appCompatDialogFragment3 = (AppCompatDialogFragment) obj;
                appCompatDialogFragment3.getClass();
                View view3 = appCompatDialogFragment3.getView();
                if (view3 != null) {
                    ((qyn) this.b).e.b.a(view3, ((vqk) this.a).a);
                }
                return ygi.a;
            case 13:
                ((View) obj).getClass();
                vtw vtwVarM = uzl.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                Object obj8 = this.a;
                uzl uzlVar = (uzl) vtwVarM.b;
                uzlVar.b |= 1;
                uzlVar.c = 218;
                vtwVarM.au();
                qzd qzdVar = (qzd) obj8;
                vou vouVar = qzdVar.c;
                String str3 = vouVar != null ? vouVar.c : "";
                xzg xzgVar = qzdVar.g;
                Object obj9 = this.b;
                vuc vucVarR = vtwVarM.r();
                vucVarR.getClass();
                Intent intentAn = rrx.an(str3, (uzl) vucVarR, ((qyn) obj9).j, qzdVar.f.g().b(new pgc(qzc.a, 9)));
                qyg qygVar = qyg.a;
                vrr vrrVar = vrr.a;
                xzgVar.g(intentAn, new qxm(qygVar, vrrVar));
                return vrrVar;
            case 14:
                vqe vqeVar = (vqe) obj;
                vqeVar.getClass();
                Context context = ((TextView) ((cb) this.a).a).getContext();
                context.getClass();
                return ((rdb) this.b).a.k(vqeVar, context);
            case 15:
                ysn ysnVar = (ysn) obj;
                ysnVar.getClass();
                red redVar = (red) this.a;
                tst tstVar = redVar.i;
                tstVar.getClass();
                Object obj10 = this.b;
                return new rdk(redVar, ysnVar, (vrs) ((rzy) obj10).a, new qaz(obj10, tstVar, i, bArr));
            case 16:
                ysn ysnVar2 = (ysn) obj;
                ysnVar2.getClass();
                rem remVar = (rem) this.a;
                tst tstVar2 = remVar.i;
                tstVar2.getClass();
                Object obj11 = this.b;
                return new rdi(remVar, ysnVar2, (vrs) ((rzy) obj11).a, new qaz(obj11, tstVar2, i, bArr));
            case 17:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                onClickListener.getClass();
                return new ikc((rzy) this.b, onClickListener, (tst) this.a, 13);
            case 18:
                sbn sbnVar = (sbn) obj;
                sbnVar.getClass();
                ykr.q(((sbq) this.b).a, null, 4, new qxa((yjz) this.a, sbnVar, (yih) null, 6), 1);
                return ygi.a;
            case 19:
                Object obj12 = this.a;
                Object obj13 = this.b;
                Object objA = obj == null ? ((sbx) obj13).a(obj12) : obj;
                ((sbx) obj13).c(obj12, objA);
                return objA;
            default:
                ((yrl) this.a).a.removeCallbacks(this.b);
                return ygi.a;
        }
    }

    public /* synthetic */ qaz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
