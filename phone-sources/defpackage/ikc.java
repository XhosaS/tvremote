package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.googletv.app.player.offline.OfflineService;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikc implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ikc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v34, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws Throwable {
        ghi ghiVarA;
        byte[] bArr = null;
        int i = 2;
        switch (this.d) {
            case 0:
                Object obj2 = this.c;
                return ijy.d((ijy) this.a, (String) this.b, (wni) obj2, (yih) obj);
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM persistent_cache WHERE cache_id IN (SELECT cache_id FROM cache_domain WHERE cache_domain.domain IN (");
                ?? r6 = this.b;
                int size = r6.size();
                gez.G(sb, size);
                sb.append(")) AND account_name = ?");
                Object objL = gez.l(((ijn) this.a).a, false, true, new ajg(sb.toString(), (List) r6, size, (String) this.c, 5), (yih) obj);
                return objL == yio.a ? objL : ygi.a;
            case 2:
                ghiVarA = ((gic) obj).a((String) this.a);
                ?? r0 = this.b;
                try {
                    ghiVarA.i(1, (String) this.c);
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        ghiVarA.i(i, ihz.c((wll) it.next()));
                        i++;
                    }
                    int iJ = gez.J(ghiVarA, "account_name");
                    int iJ2 = gez.J(ghiVarA, "entity_id");
                    int iJ3 = gez.J(ghiVarA, "in_watchlist");
                    int iJ4 = gez.J(ghiVarA, "sentiment");
                    int iJ5 = gez.J(ghiVarA, "watched");
                    int iJ6 = gez.J(ghiVarA, "family_shared");
                    int iJ7 = gez.J(ghiVarA, "last_client_write_millis");
                    int iJ8 = gez.J(ghiVarA, "last_server_write_millis");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList.add(new imi(ghiVarA.d(iJ), ihz.d(ghiVarA.d(iJ2)), ((int) ghiVarA.b(iJ3)) != 0, ihz.e((int) ghiVarA.b(iJ4)), ((int) ghiVarA.b(iJ5)) != 0, ((int) ghiVarA.b(iJ6)) != 0, ghiVarA.b(iJ7), ghiVarA.b(iJ8)));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                ghiVarA = ((gic) obj).a((String) this.a);
                ?? r02 = this.b;
                try {
                    ghiVarA.i(1, (String) this.c);
                    Iterator it2 = r02.iterator();
                    while (it2.hasNext()) {
                        ghiVarA.i(i, ihz.c((wll) it2.next()));
                        i++;
                    }
                    int iJ9 = gez.J(ghiVarA, "account_name");
                    int iJ10 = gez.J(ghiVarA, "entity_id");
                    int iJ11 = gez.J(ghiVarA, "in_watchlist");
                    int iJ12 = gez.J(ghiVarA, "sentiment");
                    int iJ13 = gez.J(ghiVarA, "watched");
                    int iJ14 = gez.J(ghiVarA, "family_shared");
                    int iJ15 = gez.J(ghiVarA, "last_client_write_millis");
                    int iJ16 = gez.J(ghiVarA, "last_server_write_millis");
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList2.add(new imi(ghiVarA.d(iJ9), ihz.d(ghiVarA.d(iJ10)), ((int) ghiVarA.b(iJ11)) != 0, ihz.e((int) ghiVarA.b(iJ12)), ((int) ghiVarA.b(iJ13)) != 0, ((int) ghiVarA.b(iJ14)) != 0, ghiVarA.b(iJ15), ghiVarA.b(iJ16)));
                    }
                    return arrayList2;
                } finally {
                }
            case 4:
                ghiVarA = ((gic) obj).a((String) this.a);
                ?? r03 = this.b;
                try {
                    ghiVarA.i(1, (String) this.c);
                    Iterator it3 = r03.iterator();
                    while (it3.hasNext()) {
                        ghiVarA.i(i, ihz.c((wll) it3.next()));
                        i++;
                    }
                    int iJ17 = gez.J(ghiVarA, "account_name");
                    int iJ18 = gez.J(ghiVarA, "entity_id");
                    int iJ19 = gez.J(ghiVarA, "in_watchlist");
                    int iJ20 = gez.J(ghiVarA, "sentiment");
                    int iJ21 = gez.J(ghiVarA, "watched");
                    int iJ22 = gez.J(ghiVarA, "family_shared");
                    int iJ23 = gez.J(ghiVarA, "last_client_write_millis");
                    int iJ24 = gez.J(ghiVarA, "last_server_write_millis");
                    ArrayList arrayList3 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList3.add(new imi(ghiVarA.d(iJ17), ihz.d(ghiVarA.d(iJ18)), ((int) ghiVarA.b(iJ19)) != 0, ihz.e((int) ghiVarA.b(iJ20)), ((int) ghiVarA.b(iJ21)) != 0, ((int) ghiVarA.b(iJ22)) != 0, ghiVarA.b(iJ23), ghiVarA.b(iJ24)));
                    }
                    return arrayList3;
                } finally {
                }
            case 5:
                ghiVarA = ((gic) obj).a((String) this.a);
                ?? r04 = this.b;
                try {
                    ghiVarA.i(1, (String) this.c);
                    Iterator it4 = r04.iterator();
                    while (it4.hasNext()) {
                        ghiVarA.i(i, ihz.c((wll) it4.next()));
                        i++;
                    }
                    int iJ25 = gez.J(ghiVarA, "account_name");
                    int iJ26 = gez.J(ghiVarA, "entity_id");
                    int iJ27 = gez.J(ghiVarA, "in_watchlist");
                    int iJ28 = gez.J(ghiVarA, "sentiment");
                    int iJ29 = gez.J(ghiVarA, "watched");
                    int iJ30 = gez.J(ghiVarA, "family_shared");
                    int iJ31 = gez.J(ghiVarA, "last_client_write_millis");
                    int iJ32 = gez.J(ghiVarA, "last_server_write_millis");
                    ArrayList arrayList4 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList4.add(new imi(ghiVarA.d(iJ25), ihz.d(ghiVarA.d(iJ26)), ((int) ghiVarA.b(iJ27)) != 0, ihz.e((int) ghiVarA.b(iJ28)), ((int) ghiVarA.b(iJ29)) != 0, ((int) ghiVarA.b(iJ30)) != 0, ghiVarA.b(iJ31), ghiVarA.b(iJ32)));
                    }
                    return arrayList4;
                } finally {
                }
            case 6:
                mvn mvnVar = (mvn) obj;
                mvnVar.getClass();
                Map map = mvnVar.a;
                String str = (String) map.get("setting_dialog_quality_group");
                String str2 = (String) map.get("setting_dialog_audio_group");
                String str3 = (String) map.get("setting_dialog_network_group");
                Object obj3 = this.a;
                Activity activity = (Activity) obj3;
                eur eurVar = yks.e(str3, activity.getString(R.string.wifi)) ? new eur(2) : new eur(1);
                Object obj4 = this.c;
                Object obj5 = this.b;
                Context context = (Context) obj3;
                euk.m(context, euk.i(context, OfflineService.class, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS", true).putExtra("requirements", eurVar), true);
                iwz iwzVar = (iwz) obj5;
                enr enrVar = (enr) obj4;
                ebf ebfVarA = iwzVar.a((by) obj3, enrVar, str, str2);
                if (mvnVar.b.m()) {
                    ykr.q(iwzVar.g, null, 0, new kaw(iwzVar, activity, mvnVar, enrVar, ebfVarA, (yih) null, 1), 3);
                }
                SharedPreferences sharedPreferences = iwzVar.b;
                sharedPreferences.edit().putInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, sharedPreferences.getInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, 0) | iwzVar.h).apply();
                return ygi.a;
            case 7:
                View view = (View) obj;
                view.getClass();
                jlb jlbVar = (jlb) this.c;
                jlbVar.a.c(view);
                wfo wfoVar = (wfo) ((kiz) jlbVar.b).a.d();
                String str4 = ((wuj) this.b).c;
                str4.getClass();
                return new jtr(wfoVar, str4, ((jky) this.a).j(), new ill(view, 11));
            case 8:
                ((bcm) obj).getClass();
                fe feVar = new fe(this.b, 8);
                dve dveVar = (dve) this.a;
                dveVar.c(feVar);
                return new bic((yjk) this.c, dveVar, feVar, 3);
            case 9:
                gn gnVar = (gn) obj;
                gnVar.getClass();
                jxl.G((mdw) this.c, (jyb) this.b, this.a, gnVar.a == -1);
                return ygi.a;
            case 10:
                jxl.G((mdw) this.c, (jyb) this.b, this.a, ((Boolean) obj).booleanValue());
                return ygi.a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((jyb) this.b).a = zBooleanValue;
                if (zBooleanValue) {
                    fwv.f((fwv) this.a, jyf.a((jaz) this.c));
                }
                return ygi.a;
            case 12:
                aad aadVar = (aad) obj;
                aadVar.getClass();
                isy isyVar = (isy) this.b;
                ?? r3 = isyVar.d;
                aadVar.a(r3.size(), new bil(r3, 6), new bhq(2039820996, true, new jyq(r3, (bje) this.a, (mdw) this.c, isyVar)));
                return ygi.a;
            case 13:
                View view2 = (View) obj;
                view2.getClass();
                this.a.onClick(view2);
                return vrr.a;
            default:
                tst tstVar = (tst) obj;
                tstVar.getClass();
                Object obj6 = this.b;
                Object obj7 = this.a;
                Object objE = tstVar.e(new nay(obj6, obj7, 7, bArr));
                rdi rdiVar = (rdi) obj7;
                rdiVar.d.c((vrp) this.c, rdiVar.e.a(objE));
                return ygi.a;
        }
    }

    public /* synthetic */ ikc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ikc(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ikc(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ikc(rzy rzyVar, View.OnClickListener onClickListener, tst tstVar, int i) {
        this.d = i;
        this.c = rzyVar;
        this.a = onClickListener;
        this.b = tstVar;
    }
}
