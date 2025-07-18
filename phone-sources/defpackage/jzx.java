package defpackage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jzx implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jzx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v44, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v68, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v35, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        jzs jzsVar = null;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                jzz jzzVar = (jzz) obj;
                jzs jzsVar2 = jzzVar.d;
                if (jzsVar2 == null) {
                    yks.c("componentManager");
                    jzsVar2 = null;
                }
                Object obj2 = this.b;
                jzsVar2.e((bv) obj, (View) obj2, jzzVar.a().a());
                xhg xhgVar = jzzVar.c;
                if (xhgVar == null) {
                    yks.c("appRefreshFeatureFlags");
                    xhgVar = null;
                }
                if (xhgVar.b()) {
                    if (jzzVar.e == null) {
                        yks.c("displayManager");
                    }
                    Context context = ((ViewStub) obj2).getContext();
                    context.getClass();
                    if (!jwq.g(context) && !jzzVar.a().a().d().equals("for-you")) {
                        ixh ixhVarA = jzzVar.a().a();
                        jok jokVar = ixhVarA instanceof jok ? (jok) ixhVarA : null;
                        if (jokVar != null) {
                            jokVar.i(jef.j, true);
                        }
                        ixh ixhVarA2 = jzzVar.a().a();
                        jra jraVar = ixhVarA2 instanceof jra ? (jra) ixhVarA2 : null;
                        if (jraVar != null) {
                            jraVar.f(jef.j, true);
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                Object obj3 = this.a;
                kan kanVar = (kan) obj3;
                jzs jzsVar3 = kanVar.b;
                if (jzsVar3 == null) {
                    yks.c("componentManager");
                } else {
                    jzsVar = jzsVar3;
                }
                jzsVar.e((bv) obj3, (View) this.b, (ixh) kanVar.a().b.a());
                break;
            case 3:
                kaz.d(this.b, ((kbc) this.a).b());
                break;
            case 4:
                kaz.d(this.b, ((kbc) this.a).b());
                break;
            case 5:
                gag gagVar = (gag) this.a;
                ymd ymdVar = new ymd(0, gagVar.d() - 1);
                ArrayList arrayList = new ArrayList();
                yhf it = ymdVar.iterator();
                while (((ymc) it).a) {
                    wkx wkxVar = (wkx) gagVar.i(it.a());
                    if (wkxVar != null) {
                        arrayList.add(wkxVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    Object obj5 = this.b;
                    if (!((bje) obj5).contains(((wkx) obj4).c)) {
                        arrayList2.add(obj4);
                    }
                }
                break;
            case 6:
                ((irc) this.a).b();
                ada.b(this.b).f.a();
                break;
            case 7:
                break;
            case 8:
                Iterable iterable = (Iterable) ((iht) this.b).a;
                ArrayList arrayList3 = new ArrayList(yfm.z(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it2.hasNext()) {
                        ArrayList arrayList4 = new ArrayList(yfm.z(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add((kdb) ((NotificationPreferencesActivity) obj6).a().l((kdj) it3.next()));
                        }
                        by byVarF = hju.F((Context) obj6);
                        byVarF.getClass();
                        View viewFindViewById = ((AppCompatActivity) obj6).findViewById(R.id.notification_preference_items);
                        viewFindViewById.getClass();
                        sfy.k(byVarF, (RecyclerView) viewFindViewById).a(arrayList4);
                        break;
                    } else {
                        wnm wnmVar = (wnm) it2.next();
                        int iAs = a.as(wnmVar.c);
                        idz idzVar = new idz(Boolean.valueOf(iAs != 0 && iAs == 3));
                        ((NotificationPreferencesActivity) obj6).e.put(wnmVar.b, idzVar);
                        String str = wnmVar.d;
                        str.getClass();
                        String str2 = wnmVar.e;
                        str2.getClass();
                        wnmVar.b.getClass();
                        arrayList3.add(new kdj(str, str2, idzVar));
                    }
                }
            case 9:
                break;
            case 10:
                this.a.a(((kel) this.b).a);
                break;
            case 11:
                this.a.a(this.b);
                break;
            case 12:
                this.a.a();
                this.b.b(Boolean.valueOf(false));
                break;
            case 13:
                this.a.a(((kem) this.b).a);
                break;
            case 14:
                iom iomVar = (iom) this.a;
                iomVar.i(false);
                iomVar.h(khr.a((khr) this.b, 0, 0, 0L, 60));
                break;
            case 15:
                ?? r0 = this.b;
                int i = ((khr) r0.a()).a;
                int i2 = ((khr) r0.a()).b;
                this.a.a(Math.abs(i) > Math.abs(i2) ? i > 0 ? kgh.a : kge.a : i2 > 0 ? kgc.a : kgi.a);
                break;
            case 16:
                ?? r02 = this.b;
                ?? r1 = this.a;
                long jK = kfw.k(r02);
                long jL = kfw.l(r1);
                yno ynoVarS = ynm.s(jK);
                yno ynoVarS2 = ynm.s(jL);
                ynoVarS.getClass();
                ynoVarS2.getClass();
                if (ynoVarS.compareTo(ynoVarS2) < 0) {
                    ynoVarS = ynoVarS2;
                }
                break;
            case 17:
                ((kiq) this.a).f(new kgm((Context) this.b));
                break;
            case 18:
                ((kiq) this.a).f(new kgm((Context) this.b));
                break;
            case 19:
                ((kiq) this.a).f(new kgm((Context) this.b));
                break;
            default:
                ykr.q(this.a, null, 0, new jbb((kiq) this.b, (yih) null, 19, (byte[]) null), 3);
                break;
        }
        return ygi.a;
    }

    public /* synthetic */ jzx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
