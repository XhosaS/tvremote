package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import android.widget.CheckBox;
import androidx.media3.ui.PlayerControlView;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import com.google.android.videos.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iuy implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iuy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r15v4, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r15v46, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [idr, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 20;
        isi isiVar = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.c) {
            case 0:
                view.getClass();
                ((ivd) this.a).d.c(view);
                ?? r15 = this.b;
                if (r15 != 0) {
                    r15.k();
                    break;
                }
                break;
            case 1:
                int bindingAdapterPosition = ((RecyclerView.ViewHolder) this.b).getBindingAdapterPosition();
                Object obj = this.a;
                if (bindingAdapterPosition != 0) {
                    if (bindingAdapterPosition != 1) {
                        ((PlayerControlView) obj).m.dismiss();
                        break;
                    } else {
                        PlayerControlView playerControlView = (PlayerControlView) obj;
                        fsr fsrVar = playerControlView.l;
                        View view2 = playerControlView.y;
                        view2.getClass();
                        playerControlView.a(fsrVar, view2);
                        break;
                    }
                } else {
                    PlayerControlView playerControlView2 = (PlayerControlView) obj;
                    fsu fsuVar = playerControlView2.j;
                    View view3 = playerControlView2.y;
                    view3.getClass();
                    playerControlView2.a(fsuVar, view3);
                    break;
                }
            case 2:
                Object obj2 = this.a;
                Object obj3 = this.b;
                ((pjx) obj2).a(pjw.b(), (View) obj3);
                MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) obj3;
                String[] strArr = mediaDeviceFloatingActionButton.b;
                int length = strArr.length;
                while (true) {
                    if (i2 < length) {
                        if (mediaDeviceFloatingActionButton.getContext().checkSelfPermission(strArr[i2]) != 0) {
                            gag gagVar = mediaDeviceFloatingActionButton.c;
                            if (gagVar != null && yks.e(gagVar.a.a(), true)) {
                                gp gpVar = mediaDeviceFloatingActionButton.a;
                                if (gpVar != null) {
                                    gpVar.b(mediaDeviceFloatingActionButton.b);
                                    break;
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                try {
                    ((MediaDeviceFloatingActionButton) obj3).b();
                    break;
                } catch (SecurityException unused) {
                    krd.c("Caught security exception even though permissions were granted.");
                    gp gpVar2 = mediaDeviceFloatingActionButton.a;
                    if (gpVar2 != null) {
                        gpVar2.b(mediaDeviceFloatingActionButton.b);
                        return;
                    }
                    return;
                }
            case 3:
                boolean zIsChecked = ((CheckBox) this.b).isChecked();
                Object obj4 = this.a;
                if (zIsChecked) {
                    isi isiVar2 = ((jzk) obj4).c;
                    if (isiVar2 == null) {
                        yks.c("userSettingsStore");
                    } else {
                        isiVar = isiVar2;
                    }
                    isiVar.e(new jxd(10));
                }
                ((jzk) obj4).a.a();
                ((bl) obj4).dismiss();
                break;
            case 4:
                boolean zIsChecked2 = ((CheckBox) this.b).isChecked();
                Object obj5 = this.a;
                if (zIsChecked2) {
                    isi isiVar3 = ((jzl) obj5).c;
                    if (isiVar3 == null) {
                        yks.c("userSettingsStore");
                    } else {
                        isiVar = isiVar3;
                    }
                    isiVar.e(new jxd(11));
                }
                ((jzl) obj5).a.a();
                ((bl) obj5).dismiss();
                break;
            case 5:
                ((Context) this.b).startActivity(new Intent().setAction("android.intent.action.VIEW").setData(this.a.aX()));
                break;
            case 6:
                ((Context) this.b).startActivity(new Intent("android.intent.action.VIEW", this.a.aW()));
                break;
            case 7:
                kcp kcpVar = (kcp) this.a;
                if (!kcpVar.a().canScrollVertically(1)) {
                    ?? r152 = this.b;
                    if (r152 != 0) {
                        r152.onClick(view);
                        break;
                    }
                } else {
                    if (kcpVar.a().getAdapter() != null) {
                        kcpVar.a().smoothScrollToPosition(r0.getItemCount() - 1);
                        break;
                    }
                }
                break;
            case 8:
                view.getClass();
                ViewParent parent = view.getParent();
                parent.getClass();
                ((kku) this.b).b.d((klb) this.a, (RecyclerView) parent);
                break;
            case 9:
                SherlogMenuButton sherlogMenuButton = (SherlogMenuButton) this.a;
                kmo kmoVarA = sherlogMenuButton.a();
                boolean zD = kmoVarA.d();
                Object obj6 = this.b;
                int i4 = 5;
                if (!zD) {
                    Context context = (Context) obj6;
                    by byVarF = hju.F(context);
                    byVarF.getClass();
                    ssn ssnVar = new ssn(byVarF);
                    ssnVar.o(R.string.turn_on_logging);
                    ssnVar.d(R.string.turn_on_logging_explanation);
                    ssnVar.l(R.string.proceed, new ifx(view, kmoVarA, context, i4));
                    ssnVar.g(R.string.cancel, new ixr(6));
                    ssnVar.show();
                    break;
                } else {
                    Context context2 = (Context) obj6;
                    by byVarF2 = hju.F(context2);
                    byVarF2.getClass();
                    ssn ssnVar2 = new ssn(byVarF2);
                    ssnVar2.o(R.string.submit_feedback);
                    ssnVar2.d(R.string.submit_feedback_with_logs);
                    ssnVar2.l(R.string.proceed, new ixq(sherlogMenuButton, kmoVarA, view, context2, 4));
                    ssnVar2.g(R.string.turn_off_logging, new ifx(sherlogMenuButton, kmoVarA, view, 4));
                    ssnVar2.i(R.string.cancel, new ixr(i4));
                    ssnVar2.show();
                    break;
                }
            case 10:
                icv icvVar = ((mlo) this.b).a;
                mtu mtuVar = (mtu) this.a;
                icvVar.a(mtuVar.a, mtuVar.c);
                break;
            case 11:
                DetailsActivity.$r8$lambda$DNdiq2bsDX18t7MOK7U0JazV7KY((DetailsActivity) this.a, (View) this.b, view);
                break;
            case 12:
                String str = (String) ((llt) this.b).b().h("mobile_movie_troubleshoot");
                InlineLocalWatchFragment inlineLocalWatchFragment = ((mrd) this.a).a;
                inlineLocalWatchFragment.gmsHelpUtil.c(inlineLocalWatchFragment.eventLogger, inlineLocalWatchFragment.accountManagerWrapper, (ieg) inlineLocalWatchFragment.accountSupplier.a(), inlineLocalWatchFragment.getActivity(), str);
                break;
            case 13:
                mtl mtlVar = (mtl) this.b;
                rzy rzyVar = mtlVar.j;
                mtm mtmVar = (mtm) this.a;
                mtmVar.f.f(rzyVar).e();
                msz mszVar = mtmVar.g;
                if (mszVar != null) {
                    lwq lwqVar = (lwq) view.getTag();
                    rzy rzyVar2 = mtlVar.j;
                    if (lwqVar != null && (lwqVar instanceof lws)) {
                        mszVar.f();
                        HashMap map = new HashMap();
                        ntp ntpVar = new ntp((byte[]) null);
                        san sanVar = mszVar.i;
                        paq.b((lws) lwqVar, mszVar.getResources(), mszVar.g, sanVar, rzyVar2).c(ntpVar);
                        paq.a(map);
                        ifb ifbVarB = ntpVar.b();
                        RecyclerView recyclerView = mszVar.h;
                        recyclerView.setAdapter(ifbVarB);
                        recyclerView.setLayoutManager(new SpannedGridLayoutManager(new mtc(ifbVarB, map, i3), 1));
                        mjo.y(recyclerView, mszVar.getContext(), new mpz(mszVar, 7), mszVar.f, mszVar.e, sanVar, nsf.g(recyclerView));
                        mszVar.l = new ksa(ifbVarB, 0);
                        mszVar.l.a();
                        mszVar.k = true;
                        mszVar.b.setVisibility(8);
                        recyclerView.setVisibility(0);
                        mszVar.g(mszVar.k);
                        break;
                    }
                }
                break;
            case 14:
                tst tstVar = ((mwu) this.b).e;
                if (tstVar.g()) {
                    ((pjx) tstVar.c()).a(pjw.b(), view);
                }
                kff.s(view, new mwq(view, (mwv) this.a));
                break;
            case 15:
                tst tstVar2 = ((mwu) this.b).e;
                if (tstVar2.g()) {
                    ((pjx) tstVar2.c()).a(pjw.b(), view);
                }
                kff.s(view, new mwq(view, (mwv) this.a));
                break;
            case 16:
                kff.s(view, new mxi((mxe) this.b));
                ((bl) this.a).dismiss();
                break;
            case 17:
                kff.s(view, new mzk((mzm) this.a));
                ((bl) this.b).dismiss();
                break;
            case 18:
                tst tstVar3 = (tst) this.a;
                if (tstVar3.g()) {
                    ((pjx) tstVar3.c()).a(pjw.b(), view);
                }
                new jyr(new mzt(false, this.b), i).onClick(view);
                break;
            case 19:
                tst tstVar4 = (tst) this.a;
                if (tstVar4.g()) {
                    ((pjx) tstVar4.c()).a(pjw.b(), view);
                }
                new jyr(new mzt(true, this.b), i).onClick(view);
                break;
            default:
                ((pjx) this.a).a(pjw.b(), view);
                kff.s(view, new nak(this.b));
                break;
        }
    }

    public /* synthetic */ iuy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
