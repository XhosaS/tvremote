package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfz extends sqi implements xce {
    public xlw a;
    public xcd b;
    public ldv c;
    public lfn d;
    public pnr e;
    public pkg f;
    public pke g;
    public woi h;
    public Uri i;
    public kfx j;
    public she k;
    public jzs l;
    private ViewGroup m;
    private shw n;
    private final gp o;

    public kfz() {
        woi woiVar = woi.a;
        woiVar.getClass();
        this.h = woiVar;
        this.o = registerForActivityResult(new gz(), new hiq(this, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        List arrayList;
        Object objA;
        Intent intent;
        sgn sgnVar;
        sif sifVar;
        sgm sgmVarA;
        lfn lfnVar = this.d;
        if (lfnVar == null) {
            yks.c("config");
            lfnVar = null;
        }
        boolean z = !lfnVar.cJ();
        shp shpVar = new shp();
        shpVar.w = z;
        shpVar.x = true;
        shpVar.a = 0;
        shpVar.b = sip.d(requireActivity(), R.attr.colorSurface, 0);
        shv shvVar = new shv();
        shvVar.b = requireActivity();
        ViewGroup viewGroup = this.m;
        if (viewGroup == null) {
            yks.c("peopleKitMinimizedContainer");
            viewGroup = null;
        }
        shvVar.c = viewGroup;
        shvVar.d = Executors.newSingleThreadExecutor();
        kfx kfxVar = this.j;
        if (kfxVar == null) {
            yks.c("shareIntentsManager");
            kfxVar = null;
        }
        List<ResolveInfo> list = kfxVar.d;
        if (list != null) {
            arrayList = new ArrayList(yfm.z(list, 10));
            for (ResolveInfo resolveInfo : list) {
                sht shtVar = new sht();
                shtVar.a = resolveInfo;
                shtVar.c = true;
                shtVar.b = true;
                arrayList.add(new shu(shtVar));
            }
        } else {
            arrayList = yhb.a;
        }
        shvVar.a = arrayList;
        shvVar.g = this;
        Context contextRequireContext = requireContext();
        ldv ldvVar = this.c;
        if (ldvVar == null) {
            yks.c("accountManagerWrapper");
            ldvVar = null;
        }
        String str = ((ksn) ldvVar.a().g()).a;
        shr shrVar = new shr();
        shrVar.a = str;
        shrVar.g = 134;
        shrVar.h = 71;
        sgn sgnVar2 = new sgn();
        uho uhoVar = six.e;
        Context applicationContext = contextRequireContext.getApplicationContext();
        boolean z2 = false;
        Context baseContext = contextRequireContext;
        while (true) {
            if (baseContext instanceof siy) {
                objA = ((siy) baseContext).a();
                if (objA == null) {
                    throw new IllegalStateException("BinderContext must not return null Binder: ".concat(String.valueOf(String.valueOf(baseContext))));
                }
            } else {
                objA = null;
            }
            if (objA != null) {
                break;
            }
            z2 |= baseContext == applicationContext;
            if (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else {
                baseContext = !z2 ? applicationContext : null;
            }
            if (baseContext == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 instanceof sjd) {
                    objA = ((sjd) applicationContext2).a();
                } else {
                    uho uhoVar2 = six.e;
                    if (uhoVar2.b == null) {
                        synchronized (uhoVar2.a) {
                            if (uhoVar2.b == null) {
                                six sixVar = new six(applicationContext2);
                                Object obj = uhoVar2.c;
                                sim.a(applicationContext2, sixVar);
                                uhoVar2.b = sixVar;
                            }
                        }
                    }
                    objA = uhoVar2.b;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object objA2 = ((six) objA).a(sgo.class);
        if (objA2 != null) {
            arrayList2.add(objA2);
        }
        six sixVar2 = ((six) objA).a;
        for (int i = 0; i < arrayList2.size(); i++) {
            sgm sgmVarA2 = ((sgo) arrayList2.get(i)).a();
            if (sgmVarA2 != null) {
                sgnVar2.a.add(sgmVarA2);
            }
        }
        List list2 = sgnVar2.a;
        if (!list2.isEmpty()) {
            sgp sgpVar = ((sgm) list2.get(list2.size() - 1)).a;
        }
        Object objA3 = ((six) objA).a(sgj.class);
        if (objA3 == null) {
            six sixVar3 = ((six) objA).a;
            objA3 = null;
        }
        sgj sgjVar = (sgj) objA3;
        if (sgjVar != null && (sgmVarA = sgjVar.a()) != null) {
            sgnVar2.a.add(sgmVarA);
        }
        while (true) {
            if (contextRequireContext instanceof Activity) {
                intent = ((Activity) contextRequireContext).getIntent();
                break;
            }
            if (!(contextRequireContext instanceof ContextWrapper)) {
                intent = null;
                break;
            }
            contextRequireContext = ((ContextWrapper) contextRequireContext).getBaseContext();
        }
        if (intent != null) {
            try {
                sgnVar = (sgn) intent.getSerializableExtra("analytics$VisualElementPath");
            } catch (Throwable th) {
                if (Log.isLoggable("VisualElementPath", 6)) {
                    Log.e("VisualElementPath", "Unable to deserialize path", th);
                }
                sgnVar = null;
            }
            if (sgnVar != null) {
                sgnVar2.a.addAll(sgnVar.a);
            }
        }
        shrVar.b = new shh();
        shrVar.b.b(sgnVar2);
        shrVar.c = WebViewActivity.URL_MIME_TYPE;
        shrVar.d = true;
        sij.o(true, "sendButtonInActionBar and hideSendButton cannot both be set.");
        shs shsVar = new shs(shrVar);
        a.H(true);
        shvVar.i = shsVar;
        she sheVar = this.k;
        if (sheVar == null) {
            yks.c("peopleKitLogger");
            sheVar = null;
        }
        shvVar.h = sheVar;
        shvVar.e = shpVar.a();
        shx shxVar = new shx();
        shxVar.a = true;
        shvVar.f = new shy(shxVar);
        shw shwVar = new shw(shvVar);
        this.n = shwVar;
        shi shiVarC = shwVar.l.c("InitToBindView");
        if (shiVarC.a) {
            shiVarC.b();
            she sheVar2 = shwVar.l;
            vtw vtwVarM = aagj.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            aagj aagjVar = (aagj) vtwVarM.b;
            aagjVar.c = 4;
            aagjVar.b |= 1;
            vtw vtwVarM2 = aagl.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            aagl aaglVar = (aagl) vtwVarM2.b;
            aaglVar.c = 11;
            aaglVar.b |= 1;
            long jA = shiVarC.a();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            aagl aaglVar2 = (aagl) vtwVarM2.b;
            aaglVar2.b |= 2;
            aaglVar2.d = jA;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            aagj aagjVar2 = (aagj) vtwVarM.b;
            aagl aaglVar3 = (aagl) vtwVarM2.r();
            aaglVar3.getClass();
            aagjVar2.e = aaglVar3;
            aagjVar2.b |= 8;
            vtw vtwVarM3 = aagm.a.m();
            int i2 = shwVar.l.g;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            aagm aagmVar = (aagm) vtwVarM3.b;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            aagmVar.c = i3;
            aagmVar.b |= 1;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            aagj aagjVar3 = (aagj) vtwVarM.b;
            aagm aagmVar2 = (aagm) vtwVarM3.r();
            aagmVar2.getClass();
            aagjVar3.d = aagmVar2;
            aagjVar3.b |= 2;
            sheVar2.a((aagj) vtwVarM.r());
        }
        if (!shwVar.j) {
            shwVar.l.b(-1, shwVar.c);
            shwVar.j = true;
        }
        shwVar.d = new sif(shwVar.a, shwVar.e, shwVar.l, shwVar.c, shwVar.k, shwVar.g, shwVar.f, shwVar.i, sho.a);
        sif sifVar2 = shwVar.d;
        shq shqVar = shwVar.g;
        if (!sifVar2.g.equals(shqVar)) {
            sifVar2.g = shqVar;
            sifVar2.b();
        }
        shwVar.d.j = shwVar.h.a;
        ViewGroup viewGroup2 = shwVar.b;
        viewGroup2.removeAllViews();
        viewGroup2.addView(shwVar.d.b);
        sia siaVar = shwVar.e;
        if (siaVar == null || (sifVar = shwVar.d) == null) {
            return;
        }
        sho shoVar = sifVar.k;
        sifVar.d = siaVar;
        if (!shoVar.equals(shoVar)) {
            sifVar.k = shoVar;
            sifVar.a();
        }
        RecyclerView recyclerView = sifVar.e;
        recyclerView.removeAllViews();
        List list3 = siaVar.a;
        she sheVar3 = sifVar.l;
        shi shiVarC2 = sheVar3.c("UiRender");
        shiVarC2.d();
        sifVar.f = new sid(sifVar, list3);
        recyclerView.setAdapter(sifVar.f);
        if (sheVar3 != null) {
            vtw vtwVarM4 = aagj.a.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            aagj aagjVar4 = (aagj) vtwVarM4.b;
            aagjVar4.c = 4;
            aagjVar4.b |= 1;
            vtw vtwVarM5 = aagl.a.m();
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            aagl aaglVar4 = (aagl) vtwVarM5.b;
            aaglVar4.c = 2;
            aaglVar4.b |= 1;
            long jA2 = shiVarC2.a();
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            aagl aaglVar5 = (aagl) vtwVarM5.b;
            aaglVar5.b |= 2;
            aaglVar5.d = jA2;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            aagj aagjVar5 = (aagj) vtwVarM4.b;
            aagl aaglVar6 = (aagl) vtwVarM5.r();
            aaglVar6.getClass();
            aagjVar5.e = aaglVar6;
            aagjVar5.b |= 8;
            vtw vtwVarM6 = aagm.a.m();
            int i4 = sheVar3.g;
            if (!vtwVarM6.b.A()) {
                vtwVarM6.u();
            }
            vuc vucVar = vtwVarM6.b;
            aagm aagmVar3 = (aagm) vucVar;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            aagmVar3.c = i5;
            aagmVar3.b |= 1;
            if (!vucVar.A()) {
                vtwVarM6.u();
            }
            aagm aagmVar4 = (aagm) vtwVarM6.b;
            aagmVar4.d = 4;
            aagmVar4.b |= 2;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            aagj aagjVar6 = (aagj) vtwVarM4.b;
            aagm aagmVar5 = (aagm) vtwVarM6.r();
            aagmVar5.getClass();
            aagjVar6.d = aagmVar5;
            aagjVar6.b |= 2;
            sheVar3.a((aagj) vtwVarM4.r());
            shiVarC2.c();
        }
        viewGroup2.post(new ehq(14));
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        xcd xcdVar = this.b;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("childFragmentInjector");
        return null;
    }

    public final jzs b() {
        jzs jzsVar = this.l;
        if (jzsVar != null) {
            return jzsVar;
        }
        yks.c("componentManager");
        return null;
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    @Override // defpackage.sqi, android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        return new sqg(requireContext(), R.style.ThemeOverlay_GoogleTv_BottomSheetDialog);
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.sharing_dialog_layout, viewGroup, false);
        pnr pnrVar = this.e;
        xlw xlwVar = null;
        if (pnrVar == null) {
            yks.c("dialogVe");
            pnrVar = null;
        }
        pnrVar.a(this, getDialog(), new jzo(this, 3));
        if (((ViewGroup) viewInflate.findViewById(R.id.bottom_sheet_static_container)) == null) {
            View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_scrolling_container);
            viewFindViewById.getClass();
        }
        Dialog dialog = getDialog();
        dialog.getClass();
        BottomSheetBehavior bottomSheetBehaviorA = ((sqg) dialog).a();
        bottomSheetBehaviorA.getClass();
        bottomSheetBehaviorA.P(3);
        this.m = (ViewGroup) viewInflate.findViewById(R.id.peoplekit_container_view);
        Bundle arguments = getArguments();
        this.i = (arguments == null || (string = arguments.getString("sharing_poster_file_uri")) == null) ? null : Uri.parse(string);
        Bundle arguments2 = getArguments();
        arguments2.getClass();
        woi woiVar = woi.a;
        woiVar.getClass();
        woi woiVar2 = (woi) hju.H(arguments2, "sharing_info", woiVar);
        this.h = woiVar2;
        if ((woiVar2.b & 1) != 0) {
            wkx wkxVar = woiVar2.e;
            if (wkxVar == null) {
                wkxVar = wkx.a;
            }
            wkxVar.getClass();
            View viewFindViewById2 = viewInflate.findViewById(R.id.share_preview);
            viewFindViewById2.getClass();
            sfy.q(this, new kfy(this, (ViewStub) viewFindViewById2, wkxVar, 0));
        }
        Context context = viewInflate.getContext();
        context.getClass();
        if (czi.b(context, "android.permission.READ_CONTACTS") != 0) {
            this.o.b("android.permission.READ_CONTACTS");
        }
        xlw xlwVar2 = this.a;
        if (xlwVar2 == null) {
            yks.c("sharingDialogFeatureFlags");
        } else {
            xlwVar = xlwVar2;
        }
        this.j = new kfx(xlwVar, getActivity());
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        a();
    }
}
