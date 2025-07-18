package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.videos.R;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fnc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ fnc(chc chcVar, cmi cmiVar, String str, clx clxVar, esn esnVar, int i) {
        this.f = i;
        this.b = chcVar;
        this.c = cmiVar;
        this.e = str;
        this.a = clxVar;
        this.d = esnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [clx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            this.b.a().c(new ejr(this.a, this.c, this.d, this.e, 4, (char[]) null), ugk.a);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                mdd mddVar = (mdd) this.c;
                Object objB = mddVar.a.b(this.a);
                objB.getClass();
                ieg iegVar = (ieg) objB;
                if (iegVar.m()) {
                    ?? r4 = this.e;
                    lul lulVar = (lul) iegVar.g();
                    String str = lulVar.a;
                    if ((true ^ ((String) r4).equals(str)) | (r4.length() == 0)) {
                        Object obj = this.d;
                        kuw kuwVar = mddVar.c;
                        String str2 = ((ksn) obj).a;
                        if (((Boolean) ykr.n(yim.a, new mdr((mdw) kuwVar.b, str2, lulVar, (yih) null, 0))).booleanValue()) {
                            les lesVar = new les(str2);
                            mddVar.b.d(lesVar, new let(str, lesVar, (System.currentTimeMillis() / 1000) + 86400));
                        }
                    }
                }
                this.b.c(iegVar.e(new lxt(new kil(15), 17)));
                return;
            }
            if (i == 3) {
                Object obj2 = this.d;
                final msr msrVar = (msr) this.a;
                final ieg iegVar2 = (ieg) msrVar.h.b(obj2);
                Object obj3 = this.b;
                Object obj4 = this.c;
                final nqj nqjVar = (nqj) this.e;
                final msw mswVar = (msw) obj4;
                final kir kirVar = (kir) obj3;
                msrVar.i.post(new Runnable() { // from class: msn
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        String str3;
                        String str4;
                        String str5;
                        String str6;
                        int i2;
                        Uri uri;
                        Uri uri2;
                        ieg iegVar3 = iegVar2;
                        if (!iegVar3.m()) {
                            mss mssVarA = mst.a();
                            mssVarA.a(WVMediaCrypto.TYPE);
                            mssVarA.a = "Asset not found.";
                            mssVarA.b();
                            return;
                        }
                        msr msrVar2 = msrVar;
                        kst kstVar = (kst) iegVar3.g();
                        boolean z = kstVar instanceof kvf;
                        if (z) {
                            msrVar2.m.o();
                        } else if (kstVar instanceof kuo) {
                            msrVar2.m.p();
                        }
                        msw mswVar2 = mswVar;
                        ieg iegVar4 = mswVar2.a;
                        if (iegVar4.m()) {
                            ksy ksyVar = (ksy) iegVar4.g();
                            str4 = ksyVar.c;
                            str3 = ksyVar.b;
                        } else {
                            str3 = null;
                            str4 = null;
                        }
                        kwg kwgVar = new kwg();
                        kwgVar.a = null;
                        kwgVar.b = null;
                        kwgVar.i = null;
                        kwgVar.c = null;
                        kwgVar.e(false);
                        kwgVar.c(false);
                        kwgVar.b(0);
                        kwgVar.a(Uri.EMPTY);
                        kwgVar.h = "$ORIGINAL";
                        kwgVar.d(Uri.EMPTY);
                        kwgVar.c = kstVar.o().b;
                        kwgVar.i = kstVar.o().c;
                        if (z) {
                            kvf kvfVar = (kvf) kstVar;
                            String strE = kvfVar.E();
                            Pattern pattern = ksh.a;
                            kwgVar.a = strE;
                            kwgVar.b(kvfVar.c() * 1000);
                            kwgVar.d(kvfVar.g());
                        } else if (kstVar instanceof kuo) {
                            kuo kuoVar = (kuo) kstVar;
                            String str7 = kuoVar.e;
                            Pattern pattern2 = ksh.a;
                            kwgVar.a = str7;
                            kwgVar.b = kuoVar.s;
                            kwgVar.b(kuoVar.m * 1000);
                            kwgVar.d(kuoVar.f);
                            kwgVar.k = kuoVar.k;
                            kwgVar.l = kuoVar.j;
                        }
                        kwgVar.e(mswVar2.h);
                        kwgVar.c(mswVar2.i);
                        kwgVar.m = str3;
                        kwgVar.h = msrVar2.l;
                        Uri uri3 = mswVar2.g;
                        if (!Uri.EMPTY.equals(uri3)) {
                            kwgVar.d(uri3);
                        }
                        if (z) {
                            str5 = null;
                            str6 = null;
                            i2 = 1;
                        } else if (kstVar instanceof kuo) {
                            kuo kuoVar2 = (kuo) kstVar;
                            str6 = kuoVar2.j;
                            str5 = kuoVar2.k;
                            i2 = 2;
                        } else {
                            str5 = null;
                            str6 = null;
                            i2 = 0;
                        }
                        kwgVar.a(gag.o(kstVar.o(), str6, msrVar2.a.a(), str5, str4));
                        if (kwgVar.n != 7 || (uri = kwgVar.g) == null || (uri2 = kwgVar.j) == null) {
                            StringBuilder sb = new StringBuilder();
                            if ((kwgVar.n & 1) == 0) {
                                sb.append(" trailer");
                            }
                            if ((kwgVar.n & 2) == 0) {
                                sb.append(" hasAvodOffer");
                            }
                            if ((kwgVar.n & 4) == 0) {
                                sb.append(" durationMillis");
                            }
                            if (kwgVar.g == null) {
                                sb.append(" clientStateUri");
                            }
                            if (kwgVar.j == null) {
                                sb.append(" posterUrl");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        kwh kwhVar = new kwh(kwgVar.a, kwgVar.b, kwgVar.c, kwgVar.d, kwgVar.e, kwgVar.f, uri, kwgVar.h, kwgVar.i, uri2, kwgVar.k, kwgVar.l, kwgVar.m);
                        nli nliVar = new nli(i2);
                        nliVar.a.add(new oak(uri3, 0, 0));
                        nle nleVar = new nle(kstVar.o().c);
                        nleVar.a = nliVar;
                        nleVar.e();
                        nleVar.b();
                        int i3 = kwhVar.f;
                        nleVar.d(i3);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("video_title", kwhVar.a);
                            jSONObject2.put("show_title", kwhVar.b);
                            jSONObject2.put("video_id", kwhVar.c);
                            jSONObject2.put("is_trailer", kwhVar.d);
                            jSONObject2.put("has_avod_offer", kwhVar.e);
                            jSONObject2.put("duration", i3);
                            jSONObject2.put("opaque", kwhVar.g);
                            jSONObject2.put("preferred_language", kwhVar.h);
                            jSONObject2.put("video_asset_id", kwhVar.i);
                            jSONObject2.put("poster_url", ksk.e(kwhVar.j));
                            jSONObject2.putOpt("show_id", kwhVar.k);
                            jSONObject2.putOpt("season_id", kwhVar.l);
                            jSONObject2.putOpt("parent_movie_id", kwhVar.m);
                            jSONObject.put("video_info", jSONObject2);
                        } catch (JSONException unused) {
                        }
                        nleVar.c(jSONObject);
                        MediaInfo mediaInfoA = nleVar.a();
                        ksy ksyVar2 = mswVar2.e;
                        boolean z2 = mswVar2.h;
                        byte[] bArr = null;
                        msrVar2.j = null;
                        msrVar2.k = null;
                        msq msqVar = new msq(msrVar2);
                        if (z2) {
                            msrVar2.k = ieg.f(false);
                        } else {
                            mjo.e(new krn(msrVar2, msqVar, 16, bArr), new ldj(msrVar2, ksyVar2.b, 20, null), msrVar2.c);
                        }
                        kir kirVar2 = kirVar;
                        nqj nqjVar2 = nqjVar;
                        mjo.e(new krn(msrVar2, msqVar, 17, bArr), new mmo(msrVar2, 7), msrVar2.c);
                        msqVar.ea(new msp(msrVar2, kirVar2, mediaInfoA, nqjVar2, mswVar2));
                    }
                });
                return;
            }
            Object obj5 = this.e;
            rme rmeVar = (rme) obj5;
            sij.x(rmeVar.h != null, "configuration can't be null after initialization.");
            rrx rrxVar = rmeVar.h.f;
            Context contextZ = rrx.Z(((LayoutInflater) this.d).getContext());
            bv bvVar = (bv) obj5;
            if (bvVar.getArguments() != null && bvVar.getArguments().getBoolean("accountMenuFlavorsStyle", false)) {
                contextZ = new ContextThemeWrapper(contextZ, R.style.OneGoogle_AccountMenuFlavors);
            }
            if (bvVar.getArguments() != null && bvVar.getArguments().getBoolean("dialogCenteredStyle", false)) {
                contextZ = new ContextThemeWrapper(contextZ, R.style.OneGoogle_DialogCentered);
            }
            Object obj6 = this.c;
            View viewInflate = LayoutInflater.from(contextZ).inflate(R.layout.og_dialog, (ViewGroup) this.a, false);
            ((FrameLayout) obj6).addView(viewInflate);
            ExpandableDialogView expandableDialogView = (ExpandableDialogView) viewInflate.findViewById(R.id.og_dialog_view);
            expandableDialogView.getClass();
            rmeVar.g = expandableDialogView;
            rmeVar.h.a.a((View) obj6);
            ExpandableDialogView expandableDialogView2 = rmeVar.g;
            rlz rlzVar = rmeVar.h;
            expandableDialogView2.l = rlzVar.e;
            expandableDialogView2.b(rlzVar.d);
            bl blVar = (bl) obj5;
            Window window = blVar.getDialog() != null ? blVar.getDialog().getWindow() : null;
            ExpandableDialogView expandableDialogView3 = rmeVar.g;
            expandableDialogView3.k = window;
            expandableDialogView3.j = new qxp(obj5, 16);
            rmg rmgVar = rmeVar.f;
            if (rmgVar != null) {
                rmeVar.a(rmgVar, expandableDialogView3);
                return;
            } else {
                Object obj7 = this.b;
                rmeVar.e = obj7 != null ? ((Bundle) obj7).getSparseParcelableArray("viewHierarchyState") : null;
                return;
            }
        }
        Trace.beginSection("BackgroundTextMeasurement");
        Object obj8 = this.d;
        ?? r7 = this.a;
        Object obj9 = this.e;
        Object obj10 = this.c;
        Object obj11 = this.b;
        try {
            bin binVarB = bcm.B(null, null);
            try {
                bit bitVarW = binVarB.w();
                try {
                    chc chcVarM = ccf.M((chc) obj11, (cmi) obj10);
                    yhb yhbVar = yhb.a;
                    new cku((String) obj9, chcVarM, yhbVar, yhbVar, (esn) obj8, r7).a();
                    binVarB.c().a();
                } finally {
                    bit.E(bitVarW);
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ fnc(iom iomVar, fne fneVar, AtomicBoolean atomicBoolean, fnf fnfVar, AtomicBoolean atomicBoolean2, int i) {
        this.f = i;
        this.a = iomVar;
        this.b = fneVar;
        this.c = atomicBoolean;
        this.d = fnfVar;
        this.e = atomicBoolean2;
    }

    public /* synthetic */ fnc(mdd mddVar, luk lukVar, String str, ksn ksnVar, idy idyVar, int i) {
        this.f = i;
        this.c = mddVar;
        this.a = lukVar;
        this.e = str;
        this.d = ksnVar;
        this.b = idyVar;
    }

    public /* synthetic */ fnc(msr msrVar, ksy ksyVar, nqj nqjVar, msw mswVar, kir kirVar, int i) {
        this.f = i;
        this.a = msrVar;
        this.d = ksyVar;
        this.e = nqjVar;
        this.c = mswVar;
        this.b = kirVar;
    }

    public /* synthetic */ fnc(rme rmeVar, LayoutInflater layoutInflater, ViewGroup viewGroup, FrameLayout frameLayout, Bundle bundle, int i) {
        this.f = i;
        this.e = rmeVar;
        this.d = layoutInflater;
        this.a = viewGroup;
        this.c = frameLayout;
        this.b = bundle;
    }
}
