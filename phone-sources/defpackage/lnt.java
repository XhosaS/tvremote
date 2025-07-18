package defpackage;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.apps.play.movies.mobileux.screen.details.episodes.EpisodeView;
import com.google.android.apps.play.movies.mobileux.screen.player.infocards.overlay.InfoCardsView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lnt implements idy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lnt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.idy
    public final void c(Object obj) {
        int i = 5;
        switch (this.b) {
            case 0:
                vtw vtwVar = (vtw) obj;
                wja wjaVar = ((wjm) vtwVar.b).d;
                if (wjaVar == null) {
                    wjaVar = wja.a;
                }
                Object obj2 = this.a;
                vtw vtwVar2 = (vtw) wjaVar.a(5, null);
                vtwVar2.x(wjaVar);
                lnu lnuVar = (lnu) obj2;
                wja wjaVarI = lnu.i(vtwVar2, lnuVar.a, lnuVar.b, lnuVar.c, 0);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wjm wjmVar = (wjm) vtwVar.b;
                wjaVarI.getClass();
                wjmVar.d = wjaVarI;
                wjmVar.b |= 2;
                return;
            case 1:
                vtw vtwVar3 = (vtw) obj;
                wja wjaVar2 = ((wjm) vtwVar3.b).d;
                if (wjaVar2 == null) {
                    wjaVar2 = wja.a;
                }
                Object obj3 = this.a;
                vtw vtwVar4 = (vtw) wjaVar2.a(5, null);
                vtwVar4.x(wjaVar2);
                lnp lnpVar = (lnp) obj3;
                wja wjaVarI2 = lnu.i(vtwVar4, lnpVar.a, lnpVar.b, lnpVar.c, lnpVar.d);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                wjm wjmVar2 = (wjm) vtwVar3.b;
                wjaVarI2.getClass();
                wjmVar2.d = wjaVarI2;
                wjmVar2.b |= 2;
                return;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                boolean zEquals = "fexp".equals(str);
                Object obj4 = this.a;
                if (!zEquals && !"cat".equals(str)) {
                    ((nfa) obj4).g(str);
                }
                ((nfa) obj4).f(str, (String) entry.getValue());
                return;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                ((nfa) this.a).f("stmp", ((String) entry2.getKey()) + ":" + ((String) entry2.getValue()));
                return;
            case 4:
                List<kst> list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                lym lymVar = (lym) this.a;
                Map map = (Map) lymVar.a.get();
                if (map != null) {
                    for (kst kstVar : list) {
                        map.put(kstVar.o(), kstVar);
                    }
                    lymVar.c.eb();
                    return;
                }
                return;
            case 5:
                ieg iegVar = (ieg) obj;
                boolean zM = iegVar.m();
                Object obj5 = this.a;
                if (!zM) {
                    lze lzeVar = (lze) obj5;
                    krd.d("Unable to convert ".concat(lzeVar.e), iegVar.i());
                    lzeVar.b();
                    return;
                }
                ImmutableList immutableList = ((lsh) iegVar.g()).a;
                if (!immutableList.isEmpty()) {
                    ((lze) obj5).a(((lsg) immutableList.get(0)).a, ((lsg) immutableList.get(0)).b);
                    return;
                }
                lze lzeVar2 = (lze) obj5;
                krd.c("Unable to convert ".concat(lzeVar2.e));
                lzeVar2.b();
                return;
            case 6:
                ieg iegVar2 = (ieg) obj;
                boolean zM2 = iegVar2.m();
                Object obj6 = this.a;
                if (zM2) {
                    lzd lzdVar = (lzd) iegVar2.g();
                    ((lze) obj6).a(lzdVar.a, lzdVar.b);
                    return;
                }
                Throwable thI = iegVar2.i();
                if (!(thI instanceof mfj)) {
                    lze lzeVar3 = (lze) obj6;
                    krd.d("Unable to convert eidrId ".concat(lzeVar3.e), thI);
                    lzeVar3.b();
                    return;
                } else {
                    lze lzeVar4 = (lze) obj6;
                    lzeVar4.h.d(1);
                    ImmutableList immutableListOf = ImmutableList.of(lzeVar4.e);
                    sij.o(!immutableListOf.isEmpty(), "Must provide at least one eidr id.");
                    lzeVar4.g = mjo.e(new mfc(new lnt(obj6, i)), new iei(lzeVar4.i, new lsi(ImmutableList.of(), immutableListOf)), lzeVar4.b);
                    return;
                }
            case 7:
                ((may) this.a).c((Throwable) obj);
                return;
            case 8:
                ieg iegVar3 = (ieg) obj;
                synchronized (this.a) {
                    iegVar3.m();
                }
                return;
            case 9:
                ieg iegVar4 = (ieg) obj;
                boolean zM3 = iegVar4.m();
                Object obj7 = this.a;
                if (zM3) {
                    mqf mqfVar = (mqf) obj7;
                    SettingsActivity settingsActivity = mqfVar.a;
                    int i2 = 1 != mqfVar.b ? R.string.dma_account_disconnected : R.string.ma_account_disconnected;
                    ksn ksnVar = mqfVar.c;
                    jwq.U(settingsActivity, settingsActivity.getString(i2, new Object[]{ksnVar.a}), 1);
                    mqfVar.f.f(ksnVar, krh.b(mqfVar.d));
                    return;
                }
                mqf mqfVar2 = (mqf) obj7;
                SettingsActivity settingsActivity2 = mqfVar2.a;
                settingsActivity2.c();
                String string = settingsActivity2.getString(R.string.error_try_again_later_dialog_message, new Object[]{mqfVar2.e.b(new llt(mqfVar2.g.f(iegVar4.i(), true), -1, iegVar4.i(), false, false, trk.a))});
                AlertDialog.Builder builder = new AlertDialog.Builder(settingsActivity2);
                builder.setMessage(string);
                builder.setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null);
                builder.show();
                return;
            case 10:
                View view = (View) obj;
                EpisodeView episodeView = (EpisodeView) view;
                episodeView.a.setTag(null);
                episodeView.a.setOnClickListener(null);
                episodeView.a.setVisibility(8);
                episodeView.b.setVisibility(8);
                episodeView.c.setVisibility(8);
                episodeView.d.b();
                View viewFindViewById = episodeView.findViewById(R.id.episode_play_button);
                pke pkeVar = (pke) ((pkg) ((paq) this.a).d).b;
                pkeVar.a(viewFindViewById);
                pkeVar.a(view);
                return;
            default:
                View view2 = (View) obj;
                if (view2 instanceof InfoCardsView) {
                    ((InfoCardsView) view2).a(this.a);
                    return;
                } else {
                    krd.c("Attempted to bind view in InfoCards row that is not instance of InfoCardsView.");
                    return;
                }
        }
    }
}
