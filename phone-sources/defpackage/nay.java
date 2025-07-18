package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.screen.player.infocards.actors.filmography.ActorFilmographyView;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nay implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nay(RecyclerView.Adapter adapter, Object obj, int i) {
        this.c = i;
        this.b = obj;
        this.a = adapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, voy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, rim] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, qvh] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, qvs] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, rjg] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppCompatDialogFragment appCompatDialogFragmentA;
        ?? r0;
        int i = 1;
        switch (this.c) {
            case 0:
                nba nbaVar = (nba) this.b;
                kff.s(view, new naw(nbaVar.b, nbaVar.e, ((ActorFilmographyView) this.a).c));
                break;
            case 1:
                nba nbaVar2 = (nba) this.b;
                kff.s(view, new nav(nbaVar2.b, nbaVar2.a, ((ActorFilmographyView) this.a).b));
                break;
            case 2:
                Object obj = this.b;
                Object obj2 = this.a;
                ((phk) obj2).d = false;
                pkg pkgVar = ((phk) obj2).i;
                oyd oydVar = ((phk) obj2).f;
                pfs pfsVar = ((phk) obj2).a;
                uxw uxwVar = ((uzb) obj).k;
                if (uxwVar == null) {
                    uxwVar = uxw.a;
                }
                pkgVar.i(oydVar, pfsVar.a(uxwVar));
                break;
            case 3:
                unc uncVar = (unc) this.a;
                ?? r1 = uncVar.e;
                ?? r2 = uncVar.b;
                r1.a(r2.a(), (wds) uncVar.d);
                uncVar.c.f(new ntp(5), view);
                uncVar.a.a(this.b);
                r1.a(r2.a(), (wds) uncVar.f);
                break;
            case 4:
                SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.b;
                qwn qwnVar = selectedAccountDisc.e;
                if (qwnVar != null) {
                    qwnVar.m.f(new ntp(5), view);
                }
                qun qunVar = selectedAccountDisc.f;
                if (qunVar != null) {
                    UnmodifiableIterator it = qunVar.a.iterator();
                    while (it.hasNext()) {
                    }
                }
                ?? r02 = this.a;
                if (r02 != 0) {
                    r02.onClick(view);
                    break;
                }
                break;
            case 5:
                qww qwwVar = (qww) this.b;
                Runnable runnable = qwwVar.c;
                if (runnable != null) {
                    runnable.run();
                }
                Object obj3 = this.a;
                if (!((Boolean) qwwVar.d.get()).booleanValue()) {
                    sjl.c();
                    qwu qwuVar = (qwu) obj3;
                    qyb qybVar = qwuVar.c;
                    qwuVar.c(qybVar == null ? qwuVar.b() : qwuVar.a(qybVar, qwuVar.b));
                    break;
                } else {
                    sjl.c();
                    qwu qwuVar2 = (qwu) obj3;
                    qyb qybVar2 = qwuVar2.c;
                    if (qybVar2 == null) {
                        rme rmeVarB = qwuVar2.b();
                        rmeVarB.e(new rgu(rmeVarB, i));
                        appCompatDialogFragmentA = rmeVarB;
                    } else {
                        appCompatDialogFragmentA = qwuVar2.a(qybVar2, qwuVar2.b);
                    }
                    qwuVar2.c(appCompatDialogFragmentA);
                    break;
                }
            case 6:
                ((xzg) ((vvd) this.a).d).f(this.b);
                break;
            case 7:
                view.getClass();
                Object obj4 = this.b;
                if (obj4 != null) {
                    ((rdi) this.a).d.b((vrp) obj4, view);
                    break;
                }
                break;
            case 8:
                ntp ntpVar = new ntp(5);
                rdv rdvVar = (rdv) this.a;
                rdvVar.b.f(ntpVar, rdvVar.c);
                tst tstVar = (tst) this.b;
                if (tstVar.g()) {
                    ((View.OnClickListener) tstVar.c()).onClick(view);
                    break;
                }
                break;
            case 9:
                ntp ntpVar2 = new ntp(5);
                Object obj5 = this.b;
                ((rdv) obj5).b.f(ntpVar2, ((rer) obj5).p);
                this.a.onClick(view);
                break;
            case 10:
                ntp ntpVar3 = new ntp(5);
                Object obj6 = this.a;
                ((rdv) obj6).b.f(ntpVar3, ((rer) obj6).q);
                ((View.OnClickListener) ((tst) this.b).c()).onClick(view);
                break;
            case 11:
                rft rftVar = (rft) this.a;
                uzn uznVar = rftVar.D;
                if (uznVar != null) {
                    uzm uzmVar = uznVar.c;
                    if (uzmVar == null) {
                        uzmVar = uzm.a;
                    }
                    uzl uzlVar = uzmVar.b;
                    if (uzlVar == null) {
                        uzlVar = uzl.a;
                    }
                    if ((uzlVar.b & 1) == 0) {
                        vtw vtwVar = (vtw) uzlVar.a(5, null);
                        vtwVar.x(uzlVar);
                        if (!vtwVar.b.A()) {
                            vtwVar.u();
                        }
                        uzl uzlVar2 = (uzl) vtwVar.b;
                        uzlVar2.b = 1 | uzlVar2.b;
                        uzlVar2.c = 400;
                        vtwVar.at(uvs.a);
                        uzlVar = (uzl) vtwVar.r();
                    }
                    Object obj7 = this.b;
                    rftVar.C.accept(obj7);
                    qvg.b(view, (String) obj7, uzlVar, rftVar.z);
                    break;
                }
                break;
            case 12:
                qwn qwnVar2 = (qwn) this.a;
                ((qwq) qwnVar2.i.c()).a(false);
                vuc vucVar = (vuc) this.b;
                vtw vtwVar2 = (vtw) vucVar.a(5, null);
                vtwVar2.x(vucVar);
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                ril rilVar = qwnVar2.g;
                wds wdsVar = (wds) vtwVar2.b;
                wds wdsVar2 = wds.a;
                wdsVar.c = 7;
                wdsVar.b = 1 | wdsVar.b;
                ((rik) rilVar).b(3, null, (wds) vtwVar2.r());
                break;
            case 13:
                int i2 = MyAccountChip.c;
                ntp ntpVar4 = new ntp(5);
                qwn qwnVar3 = (qwn) this.a;
                qwnVar3.m.f(ntpVar4, view);
                Object obj8 = this.b;
                Object objA = qwnVar3.b.a();
                vuc vucVar2 = (vuc) obj8;
                vtw vtwVar3 = (vtw) vucVar2.a(5, null);
                vtwVar3.x(vucVar2);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                ril rilVar2 = qwnVar3.g;
                wds wdsVar3 = (wds) vtwVar3.b;
                wds wdsVar4 = wds.a;
                wdsVar3.c = 9;
                wdsVar3.b = 1 | wdsVar3.b;
                rilVar2.a(objA, (wds) vtwVar3.r());
                qwnVar3.d.a.a(view, objA);
                break;
            case 14:
                vuc vucVar3 = (vuc) this.b;
                vtw vtwVar4 = (vtw) vucVar3.a(5, null);
                vtwVar4.x(vucVar3);
                if (!vtwVar4.b.A()) {
                    vtwVar4.u();
                }
                Object obj9 = this.a;
                wds wdsVar5 = (wds) vtwVar4.b;
                wds wdsVar6 = wds.a;
                wdsVar5.c = 10;
                wdsVar5.b = 1 | wdsVar5.b;
                qwn qwnVar4 = (qwn) obj9;
                qwnVar4.g.a(null, (wds) vtwVar4.r());
                qwh qwhVar = qwnVar4.d.b;
                AddAccountActivity.startActivity(view);
                break;
            case 15:
                sif sifVar = ((sid) this.a).b;
                she sheVar = sifVar.l;
                if (sheVar != null) {
                    shh shhVar = new shh();
                    shhVar.a(new siu(vgl.b));
                    shhVar.c(sifVar.c);
                    sheVar.b(4, shhVar);
                }
                sifVar.c(6, ((RecyclerView.ViewHolder) this.b).getAbsoluteAdapterPosition());
                kfz kfzVar = sifVar.m;
                Intent intent = kfx.a;
                intent.putExtra("android.intent.extra.STREAM", kfzVar.i);
                intent.putExtra("android.intent.extra.TEXT", kfzVar.h.c);
                kfzVar.startActivity(Intent.createChooser(intent, kfzVar.getResources().getText(R.string.share)));
                kfzVar.dismiss();
                break;
            case 16:
                this.a.onClick(view);
                ((taz) this.b).f(1);
                break;
            case 17:
                tgw tgwVar = ((tgz) this.a).b;
                if (tgwVar != null) {
                    tha thaVar = (tha) this.b;
                    boolean z = thaVar.b;
                    tgwVar.g((String) thaVar.c, false);
                    ArrayList arrayList = tgwVar.a;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            ((tgx) arrayList.get(size)).b(thaVar);
                        }
                    }
                }
                break;
            case 18:
                PlaySearch playSearch = ((PlaySearchToolbar) this.b).b;
                if (playSearch != null && playSearch.b.i() && (r0 = this.a) != 0) {
                    r0.onClick(view);
                    break;
                }
                break;
            default:
                usp uspVar = ((usq) this.a).a;
                List list = uspVar.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("rpc_config_key", uspVar);
                bundle.putStringArray("hosts", (String[]) list.toArray(new String[list.size()]));
                usu usuVar = new usu();
                usuVar.setArguments(bundle);
                bv bvVar = ((uss) this.b).a;
                usuVar.setTargetFragment(bvVar, 235244697);
                usuVar.show(bvVar.getFragmentManager(), "service_override_dialog_tag");
                break;
        }
    }

    public nay(PlaySearchToolbar playSearchToolbar, View.OnClickListener onClickListener, int i) {
        this.c = i;
        this.a = onClickListener;
        this.b = playSearchToolbar;
    }

    public /* synthetic */ nay(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ nay(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
