package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mta {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public mta(iea ieaVar, ikt iktVar, isf isfVar, ino inoVar, ihi ihiVar, lge lgeVar, iea ieaVar2, mem memVar, lxp lxpVar, yow yowVar) {
        this.j = ieaVar;
        this.b = iktVar;
        this.c = isfVar;
        this.d = inoVar;
        this.f = ihiVar;
        this.e = lgeVar;
        this.h = ieaVar2;
        this.g = memVar;
        this.a = lxpVar;
        this.i = yowVar;
    }

    private static void C(Activity activity, int i, String str) {
        if (activity instanceof by) {
            rub rubVar = new rub((char[]) null);
            rubVar.k(i);
            rubVar.j(str);
            mvc.a(rubVar.i()).show(((by) activity).getSupportFragmentManager(), "NoPreferredNetworkDialogFragment");
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(i);
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    private static final wkx D(String str, ksy ksyVar, String str2) {
        vtw vtwVarM = wls.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wls wlsVar = (wls) vtwVarM.b;
        str.getClass();
        wlsVar.b = str;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        wls wlsVar2 = (wls) vucVarR;
        vtw vtwVarM2 = wtv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wtv wtvVar = (wtv) vtwVarM2.b;
        wtvVar.d = wlsVar2;
        wtvVar.b |= 2;
        if (ksyVar == null) {
            vty vtyVar = (vty) wkg.a.m();
            wkf wkfVar = wkf.SEARCH_QUERY_ACTION;
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            wkg wkgVar = (wkg) vtyVar.b;
            wkgVar.c = wkfVar.u;
            wkgVar.b |= 1;
            vvd vvdVar = wqd.d;
            vtw vtwVarM3 = wqd.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wqd wqdVar = (wqd) vtwVarM3.b;
            str.getClass();
            wqdVar.b |= 1;
            wqdVar.c = str;
            vtyVar.bL(vvdVar, vtwVarM3.r());
            vuc vucVarR2 = vtyVar.r();
            vucVarR2.getClass();
            wkg wkgVar2 = (wkg) vucVarR2;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            wtv wtvVar2 = (wtv) vucVar;
            wtvVar2.e = wkgVar2;
            wtvVar2.b |= 4;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            wtv wtvVar3 = (wtv) vtwVarM2.b;
            wtvVar3.b |= 16;
            wtvVar3.f = true;
        } else {
            wni wniVarT = hju.t(ksyVar);
            vty vtyVar2 = (vty) wkg.a.m();
            wkf wkfVar2 = wkf.TVM_ENTITY_PAGE_ACTION;
            if (!vtyVar2.b.A()) {
                vtyVar2.u();
            }
            wkg wkgVar3 = (wkg) vtyVar2.b;
            wkgVar3.c = wkfVar2.u;
            wkgVar3.b |= 1;
            vvd vvdVar2 = wqg.i;
            vtw vtwVarM4 = wqg.a.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar2 = vtwVarM4.b;
            wqg wqgVar = (wqg) vucVar2;
            wqgVar.d = wniVarT;
            wqgVar.c = 4;
            if (!vucVar2.A()) {
                vtwVarM4.u();
            }
            wqg wqgVar2 = (wqg) vtwVarM4.b;
            wqgVar2.b |= 4;
            wqgVar2.f = true;
            vtyVar2.bL(vvdVar2, vtwVarM4.r());
            vuc vucVarR3 = vtyVar2.r();
            vucVarR3.getClass();
            wkg wkgVar4 = (wkg) vucVarR3;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wtv wtvVar4 = (wtv) vtwVarM2.b;
            wtvVar4.e = wkgVar4;
            wtvVar4.b |= 4;
            vtw vtwVarM5 = wlx.a.m();
            if (kuq.c(str2)) {
                vtw vtwVarM6 = wlu.a.m();
                str2.getClass();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                ((wlu) vtwVarM6.b).b = str2;
                wlu wluVar = (wlu) vtwVarM6.r();
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                wlx wlxVar = (wlx) vtwVarM5.b;
                wluVar.getClass();
                wlxVar.c = wluVar;
                wlxVar.b = 1;
            } else {
                vtw vtwVarM7 = wlw.a.m();
                vtw vtwVarM8 = wlv.a.m();
                str2.getClass();
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                ((wlv) vtwVarM8.b).b = str2;
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                wlw wlwVar = (wlw) vtwVarM7.b;
                wlv wlvVar = (wlv) vtwVarM8.r();
                wlvVar.getClass();
                wlwVar.c();
                wlwVar.b.add(wlvVar);
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                wlx wlxVar2 = (wlx) vtwVarM5.b;
                wlw wlwVar2 = (wlw) vtwVarM7.r();
                wlwVar2.getClass();
                wlxVar2.c = wlwVar2;
                wlxVar2.b = 3;
            }
            wlx wlxVar3 = (wlx) vtwVarM5.r();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wtv wtvVar5 = (wtv) vtwVarM2.b;
            wlxVar3.getClass();
            wtvVar5.c = wlxVar3;
            wtvVar5.b |= 1;
        }
        vuc vucVarR4 = vtwVarM2.r();
        vucVarR4.getClass();
        wtv wtvVar6 = (wtv) vucVarR4;
        vty vtyVar3 = (vty) wkx.a.m();
        if (!vtyVar3.b.A()) {
            vtyVar3.u();
        }
        wkx wkxVar = (wkx) vtyVar3.b;
        str.getClass();
        wkxVar.b |= 1;
        wkxVar.c = str;
        wkw wkwVar = wkw.SEARCH_SUGGESTION;
        if (!vtyVar3.b.A()) {
            vtyVar3.u();
        }
        wkx wkxVar2 = (wkx) vtyVar3.b;
        wkxVar2.d = wkwVar.az;
        wkxVar2.b |= 2;
        vtyVar3.bL(wtv.g, wtvVar6);
        vuc vucVarR5 = vtyVar3.r();
        vucVarR5.getClass();
        return (wkx) vucVarR5;
    }

    private static final long E() {
        return System.currentTimeMillis() - ikt.a;
    }

    public static void b(Activity activity) {
        if (activity instanceof ApiActivity) {
            ((ApiActivity) activity).a(3, new Throwable());
        }
    }

    public static void e(Activity activity, lyz lyzVar, mem memVar, SharedPreferences sharedPreferences, ksn ksnVar, String str) throws Resources.NotFoundException {
        Resources resources = activity.getResources();
        String string = sharedPreferences.getString(krh.DOWNLOAD_QUALITY, null);
        if (string == null) {
            string = resources.getString(com.google.android.videos.R.string.quality_hd);
        }
        boolean zEquals = resources.getString(com.google.android.videos.R.string.quality_hd).equals(string);
        int iK = kfw.K(sharedPreferences);
        krf.c(str);
        Intent intent = new Intent(activity, (Class<?>) PinBroadcastReceiver.class);
        intent.setAction("com.google.android.videos.SET_PINNED");
        intent.putExtra("account", ksnVar.a);
        intent.putExtra("video_id", str);
        intent.putExtra("quality", zEquals ? 1 : 0);
        intent.putExtra("storage", iK);
        activity.sendBroadcast(intent);
        if (activity instanceof ApiActivity) {
            ((ApiActivity) activity).b();
        }
        boolean zQ = kfw.Q(resources, memVar, sharedPreferences);
        boolean zD = memVar.d();
        boolean zR = kfw.R(resources, memVar, sharedPreferences);
        if (activity.isFinishing()) {
            return;
        }
        if (!zQ && !zR && zD) {
            return;
        }
        Cursor cursorQuery = lyzVar.b().query("assets", new String[]{"assets_title"}, "assets_id = ? AND assets_type IN (20, 6)", new String[]{str}, null, null, null, null);
        try {
            if (!cursorQuery.moveToFirst()) {
                krd.c(a.cr(str, "Failed to get title for "));
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return;
                }
                return;
            }
            String string2 = cursorQuery.getString(0);
            if (zQ) {
                C(activity, com.google.android.videos.R.string.download_start_no_wifi_title, activity.getString(com.google.android.videos.R.string.download_start_no_wifi, new Object[]{string2}));
            } else if (zR) {
                C(activity, com.google.android.videos.R.string.download_start_no_wifi_and_unrestricted_data_title, activity.getString(com.google.android.videos.R.string.download_start_no_wifi_and_unrestricted_data, new Object[]{string2}));
            } else {
                C(activity, com.google.android.videos.R.string.download_start_no_network_title, activity.getString(com.google.android.videos.R.string.download_start_no_network, new Object[]{string2}));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    public static final void f(Activity activity, cr crVar, ksy ksyVar, kuj kujVar, boolean z) {
        Long lValueOf = Long.valueOf(kujVar.d);
        Integer numValueOf = Integer.valueOf(kujVar.f);
        int i = kujVar.g;
        String strQ = ktw.q(activity, i, lValueOf, numValueOf, z);
        if (strQ == null) {
            throw new NullPointerException("Null message");
        }
        muq muqVar = new muq(ksyVar.b, strQ, i == 7);
        Bundle bundle = new Bundle();
        bundle.putParcelable("download_error_dialog_view_model", muqVar);
        muv muvVar = new muv();
        muvVar.setArguments(bundle);
        muvVar.show(crVar, "DownloadErrorDialog");
    }

    public static final void g(Activity activity, cr crVar, ksy ksyVar, String str, String str2, kuj kujVar) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = str2 != null;
        if (z) {
            spannableStringBuilder.append((CharSequence) str2).append('\n');
        }
        int i2 = kujVar.h;
        spannableStringBuilder.append((CharSequence) str).append('\n');
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append('\n');
        int iP = true != z ? com.google.android.videos.R.string.download_dialog_message_movie : com.google.android.videos.R.string.download_dialog_message_episode;
        if (i2 == 3) {
            i = true != z ? com.google.android.videos.R.string.download_dialog_title_movie : com.google.android.videos.R.string.download_dialog_title_episode;
        } else {
            if (i2 == 1) {
                iP = ktw.p(kujVar.g);
            }
            i = com.google.android.videos.R.string.download_dialog_title_queued;
        }
        spannableStringBuilder.append((CharSequence) activity.getString(iP));
        mup mupVar = new mup(ksyVar.b, i, spannableStringBuilder);
        Bundle bundle = new Bundle();
        bundle.putParcelable("cancel_download_dialog_view_model", mupVar);
        mut mutVar = new mut();
        mutVar.setArguments(bundle);
        mutVar.show(crVar, "UnpinConfirmDialog");
    }

    public final void A(Class cls, Class cls2, hts htsVar) {
        ((hfw) this.b).n(cls, cls2, htsVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, xmg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final zuw B(Activity activity, boolean z, String[] strArr, String[] strArr2, ArrayList arrayList, ArrayList arrayList2, boolean z2) throws Resources.NotFoundException {
        boolean z3;
        boolean z4;
        int i;
        int i2 = 0;
        if (strArr.length <= 1) {
            z3 = false;
            z4 = false;
        } else if (z2) {
            z4 = false;
            z3 = true;
        } else {
            z3 = false;
            z4 = true;
        }
        ?? r7 = this.j;
        int i3 = r7.getInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, 0);
        ArrayList arrayList3 = new ArrayList();
        ?? r10 = this.b;
        if (r10.c()) {
            i3 |= 1;
            kdw.z(r10.f(), r7);
            ?? r102 = this.c;
            String[] stringArray = (r102.b() && kdw.A(r7)) ? activity.getResources().getStringArray(com.google.android.videos.R.array.download_network_entries_v2) : activity.getResources().getStringArray(com.google.android.videos.R.array.download_network_entries);
            String[] stringArray2 = (r102.b() && kdw.A(r7)) ? activity.getResources().getStringArray(com.google.android.videos.R.array.download_network_values_v2) : activity.getResources().getStringArray(com.google.android.videos.R.array.download_network_values);
            ImmutableList.Builder builder = ImmutableList.builder();
            int i4 = 0;
            while (i4 < stringArray2.length) {
                builder.add((ImmutableList.Builder) new mvg(stringArray2[i4], stringArray[i4]));
                i4++;
                i2 = i2;
            }
            i = i2;
            nag nagVarB = mvl.b();
            nagVarB.j(activity.getString(com.google.android.videos.R.string.download_network_dialog_title));
            nagVarB.h(r7.getString(krh.DOWNLOAD_NETWORK, activity.getString(com.google.android.videos.R.string.wifi)));
            nagVarB.d = "setting_dialog_network_group";
            nagVarB.i(builder.build());
            arrayList3.add(nagVarB.g());
        } else {
            i = 0;
        }
        if (z) {
            i3 |= 2;
            ImmutableList.Builder builder2 = ImmutableList.builder();
            String[] stringArray3 = activity.getResources().getStringArray(com.google.android.videos.R.array.download_quality_values);
            String[] stringArray4 = activity.getResources().getStringArray(com.google.android.videos.R.array.download_quality_entries);
            for (int i5 = i; i5 < stringArray3.length; i5++) {
                builder2.add((ImmutableList.Builder) new mvg(stringArray3[i5], stringArray4[i5]));
            }
            nag nagVarB2 = mvl.b();
            nagVarB2.j(activity.getString(com.google.android.videos.R.string.download_quality_dialog_title));
            nagVarB2.h(r7.getString(krh.DOWNLOAD_QUALITY, activity.getString(com.google.android.videos.R.string.quality_sd)));
            nagVarB2.d = "setting_dialog_quality_group";
            nagVarB2.i(builder2.build());
            arrayList3.add(nagVarB2.g());
        }
        if (z4) {
            i3 |= 4;
            ImmutableList.Builder builder3 = ImmutableList.builder();
            String[] stringArray5 = activity.getResources().getStringArray(com.google.android.videos.R.array.audio_language_selector_values);
            String[] stringArray6 = activity.getResources().getStringArray(com.google.android.videos.R.array.audio_language_selector_titles);
            String str = stringArray6[1];
            Locale locale = Locale.getDefault();
            Charset charset = ksg.a;
            Object[] objArr = new Object[1];
            objArr[i] = ksg.c(locale.toLanguageTag());
            stringArray6[1] = String.format(str, objArr);
            for (int i6 = i; i6 < stringArray5.length; i6++) {
                builder3.add((ImmutableList.Builder) new mvg(stringArray5[i6], stringArray6[i6]));
            }
            nag nagVarB3 = mvl.b();
            nagVarB3.j(activity.getString(com.google.android.videos.R.string.audio_langage_selector_dialog_title));
            nagVarB3.h(r7.getString(krh.AUDIO_LANGUAGE, stringArray5[i]));
            nagVarB3.d = "setting_dialog_audio_group";
            nagVarB3.i(builder3.build());
            arrayList3.add(nagVarB3.g());
        }
        if (z3) {
            i3 |= 8;
            ImmutableList.Builder builder4 = ImmutableList.builder();
            for (int i7 = i; i7 < strArr.length; i7++) {
                builder4.add((ImmutableList.Builder) new mvg(strArr[i7], strArr2[i7]));
            }
            nag nagVarB4 = mvl.b();
            nagVarB4.j(activity.getString(com.google.android.videos.R.string.audio_langage_selector_dialog_title));
            nagVarB4.h(kdw.u(strArr, arrayList, arrayList2, r7));
            nagVarB4.d = "setting_dialog_audio_prism_group";
            nagVarB4.i(builder4.build());
            arrayList3.add(nagVarB4.g());
        }
        return new zuw((Object) arrayList3, i3);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    public final moi a(int i) {
        Object obj = this.i;
        Object objB = this.j.b();
        Context contextA = ((rgq) obj).a();
        iea ieaVar = (iea) this.b.b();
        ieaVar.getClass();
        mru mruVar = (mru) this.g.b();
        mruVar.getClass();
        ixb ixbVar = (ixb) this.f.b();
        ixbVar.getClass();
        lgi lgiVar = (lgi) this.a.b();
        lgiVar.getClass();
        pkg pkgVar = (pkg) this.c.b();
        pkgVar.getClass();
        pjx pjxVarB = ((plb) this.h).b();
        irc ircVar = (irc) this.e.b();
        ircVar.getClass();
        mem memVar = (mem) this.d.b();
        memVar.getClass();
        return new moi((ntp) objB, contextA, ieaVar, mruVar, ixbVar, lgiVar, pkgVar, pjxVarB, ircVar, memVar, i);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void c(final Activity activity, final cr crVar, final ksn ksnVar, final ksy ksyVar) {
        mjo.e(new idy() { // from class: ldm
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, lzi] */
            /* JADX WARN: Type inference failed for: r2v1, types: [iea, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v16, types: [idr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, lfn] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, mem] */
            /* JADX WARN: Type inference failed for: r9v1, types: [android.content.SharedPreferences, java.lang.Object] */
            @Override // defpackage.idy
            public final void c(Object obj) throws Resources.NotFoundException {
                int i;
                int i2;
                ieg iegVar = (ieg) obj;
                boolean zK = iegVar.k();
                ksy ksyVar2 = ksyVar;
                Activity activity2 = activity;
                if (zK) {
                    krd.c("Asset not found when pinning ".concat(String.valueOf(String.valueOf(ksyVar2))));
                    mta.b(activity2);
                    return;
                }
                mta mtaVar = this.e;
                kvc kvcVarB = ((kva) mtaVar.a.a()).b(ksyVar2);
                if (!kvcVarB.b) {
                    krd.c("Purchase not found when pinning ".concat(ksyVar2.b));
                    mta.b(activity2);
                    return;
                }
                boolean z = kvcVarB.g || kvcVarB.h;
                kst kstVar = (kst) iegVar.g();
                final ImmutableList immutableListCopyOf = kstVar instanceof kvf ? ImmutableList.copyOf((Collection) ((kvf) kstVar).r()) : kstVar instanceof kuo ? ((kuo) kstVar).w : ImmutableList.of();
                final boolean zBM = mtaVar.g.bM();
                ImmutableList list = FluentIterable.from(immutableListCopyOf).filter(new tsv() { // from class: ldi
                    @Override // defpackage.tsv
                    public final boolean apply(Object obj2) {
                        kte kteVar = (kte) obj2;
                        boolean z2 = kteVar.b;
                        int i3 = 1;
                        if (zBM != z2) {
                            return (z2 || FluentIterable.from(immutableListCopyOf).anyMatch(new lqh(kteVar, i3))) ? false : true;
                        }
                        return true;
                    }
                }).toList();
                int size = list.size();
                ?? r9 = mtaVar.j;
                int i3 = r9.getInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, 0);
                String[] strArr = (String[]) FluentIterable.from(list).transform(new eyt(12)).toArray(String.class);
                ImmutableList list2 = FluentIterable.from(list).transform(new eyt(13)).toList();
                ImmutableList list3 = FluentIterable.from(list).transform(new eyt(14)).toList();
                boolean z2 = z && mtaVar.i.b().contains(1);
                kdw.x(r9);
                if (z2 && (i3 & 2) == 0) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                ?? r7 = mtaVar.b;
                if (r7.c() && (i3 & 1) == 0) {
                    i |= 1;
                    i2++;
                }
                if (size > 1) {
                    kdw.y(strArr, list2, list3, r9);
                    i |= 8;
                    i2++;
                }
                if (i2 == 0) {
                    mta.e(activity2, (lyz) mtaVar.e, r7, r9, ksnVar, ksyVar2.b);
                    return;
                }
                if (ksk.o(activity2)) {
                    cr crVar2 = crVar;
                    if (ksk.b < 26 || !crVar2.ab()) {
                        try {
                            zuw zuwVarB = (i & 8) != 0 ? mtaVar.B(activity2, z2, strArr, (String[]) FluentIterable.from(list).transform(new ldl(activity2.getResources(), 0)).toArray(String.class), new ArrayList(list2), new ArrayList(list3), true) : mtaVar.B(activity2, z2, (String[]) FluentIterable.from(list).transform(new eyt(15)).toArray(String.class), null, null, null, false);
                            mvk.c((ArrayList) zuwVarB.b, ieg.f(ksyVar2)).show(crVar2, "download setting dialog");
                            mtaVar.d.c(Integer.valueOf(zuwVarB.a));
                        } catch (IllegalStateException e) {
                            krd.c("Failed to show dialog to pin a video: " + ksyVar2.b + ", exception: " + e.toString());
                        }
                    }
                }
            }
        }, new ldj(this, ksyVar, 0), this.f);
    }

    public final void d(Activity activity, ieg iegVar, lie lieVar) {
        if (!iegVar.m()) {
            krd.f("Account not available when download button is pressed.");
            return;
        }
        ksn ksnVar = (ksn) iegVar.g();
        kff.o(activity, mux.class, new ldk(activity, ksnVar, lieVar, 1));
        int i = 3;
        kff.o(activity, muy.class, new kad(lieVar, i));
        ((kqc) activity.getApplication()).b();
        kff.o(activity, mva.class, new ldk(activity, lieVar, ksnVar, 2));
        kff.o(activity, muz.class, new ldk((Object) lieVar, (Context) activity, (Object) ksnVar, i));
        kff.q(activity, mvn.class, "download_preference_key", new ldk((Object) this, (Context) activity, (Object) ksnVar, 0));
    }

    public final ksn h() {
        return (ksn) ((ldy) this.j).a().g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r12, int r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ird
            if (r0 == 0) goto L13
            r0 = r14
            ird r0 = (defpackage.ird) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ird r0 = new ird
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r14)
            goto L51
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.ybn.f(r14)
            java.lang.Object r14 = r11.b
            java.lang.String r5 = r11.o()
            long r6 = E()
            r0.b = r3
            los r4 = new los
            r10 = 1
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r8, r9, r10)
            ikt r14 = (defpackage.ikt) r14
            gex r12 = r14.b
            r13 = 0
            java.lang.Object r14 = defpackage.gez.l(r12, r3, r13, r4, r0)
            if (r14 == r1) goto L75
        L51:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.yfm.z(r14, r13)
            r12.<init>(r13)
            java.util.Iterator r13 = r14.iterator()
        L62:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L74
            java.lang.Object r14 = r13.next()
            imh r14 = (defpackage.imh) r14
            java.lang.String r14 = r14.b
            r12.add(r14)
            goto L62
        L74:
            return r12
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.i(java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(int r11, defpackage.yih r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ire
            if (r0 == 0) goto L13
            r0 = r12
            ire r0 = (defpackage.ire) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ire r0 = new ire
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r12)
            goto L50
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ybn.f(r12)
            java.lang.Object r12 = r10.b
            java.lang.String r5 = r10.o()
            long r6 = E()
            r0.b = r3
            opu r4 = new opu
            r9 = 1
            r8 = r11
            r4.<init>(r5, r6, r8, r9)
            ikt r12 = (defpackage.ikt) r12
            gex r11 = r12.b
            r12 = 0
            java.lang.Object r12 = defpackage.gez.l(r11, r3, r12, r4, r0)
            if (r12 == r1) goto L74
        L50:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.yfm.z(r12, r0)
            r11.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L61:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r12.next()
            imh r0 = (defpackage.imh) r0
            java.lang.String r0 = r0.b
            r11.add(r0)
            goto L61
        L73:
            return r11
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.j(int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r5, int r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.irf
            if (r0 == 0) goto L13
            r0 = r7
            irf r0 = (defpackage.irf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            irf r0 = new irf
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r7)
            r0.b = r3
            int r7 = r5.length()
            if (r7 != 0) goto L3f
            java.lang.Object r5 = r4.j(r6, r0)
            goto L43
        L3f:
            java.lang.Object r5 = r4.i(r5, r6, r0)
        L43:
            r7 = r5
            if (r7 == r1) goto L6d
        L46:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.yfm.z(r7, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L57:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6c
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            wkx r7 = D(r7, r0, r0)
            r5.add(r7)
            goto L57
        L6c:
            return r5
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.k(java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.irh
            if (r0 == 0) goto L13
            r0 = r7
            irh r0 = (defpackage.irh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            irh r0 = new irh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ybn.f(r7)
            goto La1
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.ybn.f(r7)
            int r7 = r6.length()
            if (r7 <= 0) goto Lb4
            java.lang.Object r7 = r5.c
            r6.getClass()
            wws r2 = defpackage.wws.a
            vtw r2 = r2.m()
            vuc r4 = r2.b
            boolean r4 = r4.A()
            if (r4 != 0) goto L4f
            r2.u()
        L4f:
            vuc r4 = r2.b
            wws r4 = (defpackage.wws) r4
            r4.b = r6
            vuc r6 = r2.r()
            r6.getClass()
            wws r6 = (defpackage.wws) r6
            ink r2 = defpackage.ink.a
            vtw r2 = r2.m()
            r2.getClass()
            vuc r4 = r2.b
            boolean r4 = r4.A()
            if (r4 != 0) goto L72
            r2.u()
        L72:
            vuc r4 = r2.b
            ink r4 = (defpackage.ink) r4
            r4.d = r6
            r6 = 4
            r4.c = r6
            ink r6 = defpackage.ipc.p(r2)
            isf r7 = (defpackage.isf) r7
            hfx r7 = r7.e
            hfx r6 = defpackage.ihz.Y(r6)
            ysx r6 = r7.h(r6)
            gxd r7 = new gxd
            r2 = 14
            r7.<init>(r6, r2)
            gxd r6 = new gxd
            r2 = 11
            r6.<init>(r7, r2)
            r0.b = r3
            java.lang.Object r7 = defpackage.vyf.z(r6, r0)
            if (r7 == r1) goto Lb3
        La1:
            iht r7 = (defpackage.iht) r7
            if (r7 == 0) goto Lb0
            java.lang.Object r6 = r7.a
            wom r6 = (defpackage.wom) r6
            if (r6 == 0) goto Lb0
            vun r6 = r6.c
            if (r6 == 0) goto Lb0
            return r6
        Lb0:
            yhb r6 = defpackage.yhb.a
            return r6
        Lb3:
            return r1
        Lb4:
            yhb r6 = defpackage.yhb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.l(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r15 == r1) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lge] */
    /* JADX WARN: Type inference failed for: r12v0, types: [mta] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ino, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r13, int r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.m(java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r5, int r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.irj
            if (r0 == 0) goto L13
            r0 = r7
            irj r0 = (defpackage.irj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            irj r0 = new irj
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r7)
            r0.b = r3
            java.lang.Object r7 = r4.k(r5, r6, r0)
            if (r7 == r1) goto La1
        L3a:
            java.util.List r7 = (java.util.List) r7
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r7.next()
            r1 = r0
            wkx r1 = (defpackage.wkx) r1
            vvd r2 = defpackage.wtv.g
            r1.i(r2)
            vtr r1 = r1.l
            java.lang.Object r3 = r2.c
            vub r3 = (defpackage.vub) r3
            java.lang.Object r1 = r1.k(r3)
            if (r1 != 0) goto L6b
            java.lang.Object r1 = r2.b
            goto L6e
        L6b:
            r2.c(r1)
        L6e:
            r1.getClass()
            wtv r1 = (defpackage.wtv) r1
            wls r1 = r1.d
            if (r1 != 0) goto L79
            wls r1 = defpackage.wls.a
        L79:
            java.lang.String r1 = r1.b
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L4a
            r6.add(r0)
            goto L4a
        L85:
            wom r5 = defpackage.wom.a
            vtw r5 = r5.m()
            upo r5 = defpackage.vxr.O(r5)
            vwv r7 = r5.e()
            r5.g(r7, r6)
            wom r5 = r5.f()
            iht r6 = new iht
            r7 = 2
            r6.<init>(r5, r7)
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.n(java.lang.String, int, yih):java.lang.Object");
    }

    public final String o() {
        return h().a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yow] */
    public final void p(String str) {
        str.getClass();
        ykr.q(this.i, null, 0, new imw(this, str, (yih) null, 8), 3);
    }

    public final hlw q(Object obj) {
        return ((hlz) this.h).a(obj);
    }

    public final List r() {
        List listH = ((hfw) this.c).h();
        if (listH.isEmpty()) {
            throw new hjy();
        }
        return listH;
    }

    public final List s(Object obj) {
        List listH = ((fse) this.f).H(obj.getClass());
        if (listH.isEmpty()) {
            throw new hjz(obj);
        }
        int size = listH.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            hqf hqfVar = (hqf) listH.get(i);
            if (hqfVar.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(hqfVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new hjz(obj, listH);
        }
        return arrayList;
    }

    public final void t(Class cls, hkw hkwVar) {
        ((hfw) this.d).k(cls, hkwVar);
    }

    public final void u(Class cls, hlo hloVar) {
        ((hfx) this.i).g(cls, hloVar);
    }

    public final void v(Class cls, Class cls2, hln hlnVar) {
        x("legacy_append", cls, cls2, hlnVar);
    }

    public final void w(Class cls, Class cls2, hqg hqgVar) {
        ((fse) this.f).I(cls, cls2, hqgVar);
    }

    public final void x(String str, Class cls, Class cls2, hln hlnVar) {
        ((fse) this.g).z(str, hlnVar, cls, cls2);
    }

    public final void y(hky hkyVar) {
        ((hfw) this.c).i(hkyVar);
    }

    public final void z(hlv hlvVar) {
        ((hlz) this.h).b(hlvVar);
    }

    public mta() {
        this.a = new fse((byte[]) null, (byte[]) null);
        this.e = new hut();
        hwt hwtVar = new hwt(new cul(20), new hoy(2), new hwr());
        this.j = hwtVar;
        this.f = new fse(hwtVar);
        this.d = new hfw((byte[]) null, (char[]) null);
        this.g = new fse((byte[]) null);
        this.i = new hfx((char[]) null);
        this.h = new hlz();
        this.b = new hfw((byte[]) null, (byte[]) null, (byte[]) null);
        this.c = new hfw((char[]) null);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ((fse) this.g).A(arrayList);
    }

    public mta(SharedPreferences sharedPreferences, lyz lyzVar, mem memVar, lzi lziVar, idf idfVar, iea ieaVar, lfn lfnVar, ExecutorService executorService, xmg xmgVar) {
        sharedPreferences.getClass();
        this.j = sharedPreferences;
        lyzVar.getClass();
        this.e = lyzVar;
        memVar.getClass();
        this.b = memVar;
        this.i = lziVar;
        this.h = idfVar;
        this.a = ieaVar;
        lfnVar.getClass();
        this.g = lfnVar;
        this.f = executorService;
        this.c = xmgVar;
        this.d = new idz(0);
    }

    public mta(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, yfo yfoVar10, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.g = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.f = yfoVar3;
        yfoVar4.getClass();
        this.i = yfoVar4;
        yfoVar5.getClass();
        this.e = yfoVar5;
        yfoVar6.getClass();
        this.d = yfoVar6;
        this.a = yfoVar7;
        yfoVar8.getClass();
        this.c = yfoVar8;
        yfoVar9.getClass();
        this.h = yfoVar9;
        this.j = yfoVar10;
    }

    public mta(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, yfo yfoVar10, byte[] bArr) {
        yfoVar.getClass();
        this.j = yfoVar;
        yfoVar2.getClass();
        this.i = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.g = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
        yfoVar7.getClass();
        this.c = yfoVar7;
        yfoVar8.getClass();
        this.h = yfoVar8;
        yfoVar9.getClass();
        this.e = yfoVar9;
        yfoVar10.getClass();
        this.d = yfoVar10;
    }

    public mta(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, yfo yfoVar10) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.e = yfoVar5;
        yfoVar6.getClass();
        this.f = yfoVar6;
        yfoVar7.getClass();
        this.g = yfoVar7;
        yfoVar8.getClass();
        this.h = yfoVar8;
        yfoVar9.getClass();
        this.i = yfoVar9;
        yfoVar10.getClass();
        this.j = yfoVar10;
    }
}
