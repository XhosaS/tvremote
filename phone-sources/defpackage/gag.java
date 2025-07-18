package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gag {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gag() {
        this((byte[]) null);
    }

    public static Uri o(ksy ksyVar, String str, ieg iegVar, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        builder.path("2");
        builder.appendQueryParameter("video_id", ksyVar.b);
        if (str != null) {
            builder.appendQueryParameter("season_id", str);
        }
        if (str2 != null) {
            builder.appendQueryParameter("show_id", str2);
        }
        String strP = iegVar.m() ? p((ksn) iegVar.g()) : null;
        if (strP != null) {
            builder.appendQueryParameter("account", strP);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("parent_movie_id", str3);
        }
        return builder.build();
    }

    public static String p(ksn ksnVar) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ksnVar.a.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            krd.c("Error while trying to get SHA-1 digest algorithm");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    public static final ksw r(lqd lqdVar, List list) {
        String str;
        kys kysVar;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ieg iegVarF;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) list);
        for (lqf lqfVar : lqdVar.e.c()) {
            ksy ksyVar = lqfVar.a;
            ieg iegVarG = krf.g(lqfVar.b);
            kys kysVarA = kys.a((String) lqfVar.c.e(""));
            ieg iegVarG2 = krf.g(lqdVar.g);
            ieg iegVar = ieg.a;
            if (ksy.v(ksyVar) || ksy.y(ksyVar) || ksy.w(ksyVar) || ksy.t(ksyVar) || ksy.x(ksyVar)) {
                if (ksyVar == null) {
                    throw new NullPointerException("Null assetId");
                }
                if (iegVarG == null) {
                    throw new NullPointerException("Null entitlementAnnotation");
                }
                if (iegVarG2 == null) {
                    throw new NullPointerException("Null detailsPageSelection");
                }
                if (iegVar == null) {
                    throw new NullPointerException("Null initialDistributorId");
                }
                Uri uri = Uri.EMPTY;
                if (uri == null) {
                    throw new NullPointerException("Null posterUrl");
                }
                iegVarF = ieg.f(new ksu(ksyVar, iegVarG, kysVarA, iegVarG2, iegVar, uri));
            } else {
                iegVarF = ieg.b;
            }
            if (iegVarF.m()) {
                builder.add((ImmutableList.Builder) iegVarF.g());
            }
        }
        String str2 = lqdVar.a;
        ksv ksvVar = new ksv(null);
        if (str2 == null) {
            throw new NullPointerException("Null collectionId");
        }
        ksvVar.a = str2;
        ksvVar.e("");
        trk trkVar = trk.a;
        ksvVar.c = trkVar;
        ksvVar.d = kys.a;
        ksvVar.a(ImmutableList.of());
        ksvVar.d(trkVar);
        ksvVar.c(trkVar);
        ksvVar.b(ImmutableList.of());
        ksvVar.e(lqdVar.b);
        ksvVar.d(lqdVar.f);
        ksvVar.a(builder.build());
        ksvVar.d = kys.a((String) lqdVar.d.e(""));
        ksvVar.c(lqdVar.h);
        ksvVar.b(lqdVar.i);
        String str3 = lqdVar.c;
        if (!TextUtils.isEmpty(str3)) {
            ksvVar.c = tst.i(str3);
        }
        String str4 = ksvVar.a;
        if (str4 != null && (str = ksvVar.b) != null && (kysVar = ksvVar.d) != null && (immutableList = ksvVar.e) != null && (immutableList2 = ksvVar.h) != null) {
            return new ksw(str4, str, ksvVar.c, kysVar, immutableList, ksvVar.f, ksvVar.g, immutableList2);
        }
        StringBuilder sb = new StringBuilder();
        if (ksvVar.a == null) {
            sb.append(" collectionId");
        }
        if (ksvVar.b == null) {
            sb.append(" title");
        }
        if (ksvVar.d == null) {
            sb.append(" serverCookie");
        }
        if (ksvVar.e == null) {
            sb.append(" assets");
        }
        if (ksvVar.h == null) {
            sb.append(" images");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static vcp t(vau vauVar) {
        vaj vajVar = (vaj) FluentIterable.from(vauVar.c).firstMatch(new efc(16)).c();
        return vajVar.b == 12 ? (vcp) vajVar.c : vcp.a;
    }

    public static kwb v(int i) {
        int i2 = i - 2;
        return i2 != 1 ? i2 != 2 ? kwb.STATUS_UNSPECIFIED : kwb.PRE_ORDER : kwb.ACTIVE;
    }

    public static int w(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yjv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gbo r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gaf
            if (r0 == 0) goto L13
            r0 = r6
            gaf r0 = (defpackage.gaf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gaf r0 = new gaf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ybn.f(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            java.lang.Object r6 = r4.a
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L84
        L40:
            gbo r6 = (defpackage.gbo) r6
            boolean r0 = r6 instanceof defpackage.fzr
            if (r0 == 0) goto L4e
            r0 = r6
            fzr r0 = (defpackage.fzr) r0
            r1 = 10
            r0.b(r1)
        L4e:
            if (r6 == r5) goto L7c
            agx r0 = new agx
            r1 = 4
            r2 = 0
            r0.<init>(r4, r1, r2)
            r6.e(r0)
            if (r5 == 0) goto L6a
            agx r0 = new agx
            r1 = 5
            r0.<init>(r4, r1, r2)
            r1 = r5
            gbo r1 = (defpackage.gbo) r1
            bmd r1 = r1.b
            r1.d(r0)
        L6a:
            if (r5 == 0) goto L71
            gbo r5 = (defpackage.gbo) r5
            r5.d()
        L71:
            r5 = 3
            boolean r5 = defpackage.fus.v(r5)
            if (r5 == 0) goto L7b
            java.util.Objects.toString(r6)
        L7b:
            return r6
        L7c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gag.a(gbo, yih):java.lang.Object");
    }

    public final void b() {
        yvc yvcVar = (yvc) ((ghd) this.c).a;
        yvcVar.e(new yfw(Integer.valueOf(((Number) ((yfw) yvcVar.d()).a).intValue() + 1), false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void c(String str, Object obj) {
        str.getClass();
        this.a.put(str, obj);
        yvc yvcVar = (yvc) this.b.get(str);
        if (yvcVar != null) {
            yvcVar.e(obj);
        }
        yvc yvcVar2 = (yvc) this.e.get(str);
        if (yvcVar2 != null) {
            yvcVar2.e(obj);
        }
    }

    public final int d() {
        return f().a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final fzd e() {
        return (fzd) this.e.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final fzo f() {
        return (fzo) this.a.a();
    }

    public final Object g(yih yihVar) {
        Object objA = new isv(((gbg) this.b).g, 9).a(new ait(this, 12), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysx] */
    public final Object h(yih yihVar) {
        Object objJ = vyf.J(this.d, new aki(this, (yih) null, 10, (byte[]) null), yihVar);
        return objJ == yio.a ? objJ : ygi.a;
    }

    public final Object i(int i) {
        Object objD;
        Object objD2;
        gbg gbgVar = (gbg) this.b;
        yvc yvcVar = gbgVar.i;
        do {
            objD = yvcVar.d();
            ((Boolean) objD).booleanValue();
        } while (!yvcVar.f(objD, true));
        gbgVar.e = true;
        gbgVar.f = i;
        cb cbVar = gbgVar.m;
        if (cbVar != null) {
            cbVar.u(gbgVar.c.d(i));
        }
        gay gayVar = gbgVar.c;
        if (i < 0 || i >= gayVar.c()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + gayVar.c());
        }
        int i2 = i - gayVar.d;
        if (i2 >= 0 && i2 < gayVar.c) {
            gayVar.e(i2);
        }
        do {
            objD2 = yvcVar.d();
            ((Boolean) objD2).booleanValue();
        } while (!yvcVar.f(objD2, false));
        return f().get(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iea, java.lang.Object] */
    public final jmq j(boolean z) {
        Object obj = this.e;
        return new jmq((isw) this.d, this.b, (wkx) obj, z);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final eul k(euh euhVar) throws lka {
        euhVar.getClass();
        egc egcVarF = ((lhr) this.b).f(ksy.d(euhVar.a));
        egg eggVar = new egg();
        eggVar.a = egcVarF;
        eggVar.d = lmx.b((String) this.e, this.d);
        vtp vtpVarA = vtp.a();
        vfg vfgVar = vfg.a;
        byte[] bArr = euhVar.g;
        vuc vucVarP = vuc.p(vfgVar, bArr, 0, bArr.length, vtpVarA);
        vuc.B(vucVarP);
        vfg vfgVar2 = (vfg) vucVarP;
        vfgVar2.getClass();
        enr enrVarU = ((kuw) this.a).u(vfgVar2);
        List list = euhVar.d;
        list.getClass();
        if (!list.isEmpty()) {
            enrVarU = enrVarU.e(list);
        }
        return new jdj(enrVarU, eggVar, this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [idr, java.lang.Object] */
    public final int l() {
        Object objA = this.b.a();
        objA.getClass();
        return ((Number) objA).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void m(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = ((View) this.c).animate();
        if (z) {
            viewPropertyAnimatorAnimate.alpha(0.0f).setListener(this.d);
            ((ActionBar) this.b).hide();
        } else {
            viewPropertyAnimatorAnimate.alpha(1.0f).setListener(this.e);
            ((ActionBar) this.b).show();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    public final mlz n(bv bvVar) {
        lfz lfzVar = (lfz) this.c.b();
        lfzVar.getClass();
        lys lysVar = (lys) this.b.b();
        lysVar.getClass();
        iea ieaVarA = ((kqg) this.e).b();
        Object obj = this.a;
        return new mlz(lfzVar, lysVar, ieaVarA, (mtw) this.d.b(), ((lhs) obj).b(), bvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final iea q(final ksy ksyVar, final iea ieaVar, final int i) {
        mev mevVar = new mev(43200000L, new meu(2), this.e, ieaVar);
        krz krzVar = new krz(Collections.EMPTY_LIST);
        krzVar.a = new ids[]{this.b, mevVar};
        krzVar.b = this.d;
        krzVar.c(mevVar);
        krzVar.b(new idf() { // from class: mah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.idf
            public final Object b(Object obj) {
                ieg iegVarF;
                gag gagVar = this.d;
                List<ksw> list = (List) obj;
                ieg iegVarA = ((ldy) gagVar.e).a();
                if (iegVarA.k()) {
                    return ImmutableList.of();
                }
                ieg iegVar = (ieg) ieaVar.a();
                if (!iegVar.m()) {
                    ksy ksyVar2 = ksyVar;
                    ieg iegVar2 = (ieg) ((lrc) gagVar.c).b(new lrj(new kqd(iegVarA, 9), ksyVar2));
                    if (iegVar2.k()) {
                        return ImmutableList.of();
                    }
                    ImmutableList.Builder builder = ImmutableList.builder();
                    UnmodifiableIterator it = ((lrl) iegVar2.g()).a.iterator();
                    while (it.hasNext()) {
                        lqd lqdVar = (lqd) it.next();
                        if (lqdVar.e.g()) {
                            builder.add((ImmutableList.Builder) gag.r(lqdVar, ImmutableList.of()));
                        }
                    }
                    return builder.build();
                }
                ImmutableList.Builder builder2 = ImmutableList.builder();
                String str = (String) iegVar.g();
                for (ksw kswVar : list) {
                    tst tstVar = kswVar.f;
                    if (tstVar.g() && ((String) tstVar.c()).equals(str)) {
                        int i2 = i;
                        ieg iegVar3 = (ieg) ((lrc) gagVar.a).b(new ltm(new kqd(iegVarA, 8), new ltj(str), i2, i2));
                        if (!iegVar3.k()) {
                            UnmodifiableIterator it2 = ((lto) iegVar3.g()).a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    iegVarF = ieg.f(kswVar);
                                    break;
                                }
                                lqd lqdVar2 = (lqd) it2.next();
                                if (lqdVar2.e.g()) {
                                    iegVarF = ieg.f(gag.r(lqdVar2, kswVar.e));
                                    break;
                                }
                            }
                        } else {
                            iegVarF = ieg.f(kswVar);
                        }
                        builder2.add((ImmutableList.Builder) iegVarF.h(kswVar));
                    } else {
                        builder2.add((ImmutableList.Builder) kswVar);
                    }
                }
                return builder2.build();
            }
        });
        return krzVar.a();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable, java.lang.Object] */
    public final vff s(lry lryVar) {
        vdn vdnVarD = ((moz) this.a).d(lryVar.b, lryVar.d);
        vtw vtwVarM = vey.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vey veyVar = (vey) vtwVarM.b;
        vuj vujVar = veyVar.b;
        if (!vujVar.c()) {
            veyVar.b = vuc.q(vujVar);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            veyVar.b.g(((Integer) it.next()).intValue());
        }
        ?? r2 = this.e;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vey veyVar2 = (vey) vtwVarM.b;
        vuj vujVar2 = veyVar2.c;
        if (!vujVar2.c()) {
            veyVar2.c = vuc.q(vujVar2);
        }
        Iterator it2 = r2.iterator();
        while (it2.hasNext()) {
            veyVar2.c.g(((Integer) it2.next()).intValue());
        }
        vey veyVar3 = (vey) vtwVarM.r();
        vtw vtwVarM2 = vgi.a.m();
        ?? r3 = this.c;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vgi vgiVar = (vgi) vtwVarM2.b;
        vuj vujVar3 = vgiVar.b;
        if (!vujVar3.c()) {
            vgiVar.b = vuc.q(vujVar3);
        }
        Iterator it3 = r3.iterator();
        while (it3.hasNext()) {
            vgiVar.b.g(((Integer) it3.next()).intValue());
        }
        ?? r32 = this.d;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vgi vgiVar2 = (vgi) vtwVarM2.b;
        vuj vujVar4 = vgiVar2.c;
        if (!vujVar4.c()) {
            vgiVar2.c = vuc.q(vujVar4);
        }
        Iterator it4 = r32.iterator();
        while (it4.hasNext()) {
            vgiVar2.c.g(((Integer) it4.next()).intValue());
        }
        vgi vgiVar3 = (vgi) vtwVarM2.r();
        vtw vtwVarM3 = vff.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vff vffVar = (vff) vtwVarM3.b;
        vdnVarD.getClass();
        vffVar.c = vdnVarD;
        int i = 1;
        vffVar.b |= 1;
        val valVarO = kgu.o(lryVar.a);
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vff vffVar2 = (vff) vtwVarM3.b;
        valVarO.getClass();
        vffVar2.d = valVarO;
        vffVar2.b |= 2;
        switch (lryVar.c) {
            case HDCP_UNKNOWN:
                i = 2;
                break;
            case HDCP_NONE:
                i = 3;
                break;
            case HDCP_V1:
                i = 4;
                break;
            case HDCP_V2:
                i = 5;
                break;
            case HDCP_V2_1:
                i = 6;
                break;
            case HDCP_V2_2:
            case HDCP_V2_3:
                i = 7;
                break;
            case HDCP_DISCONNECTED:
                i = 8;
                break;
        }
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ((vff) vtwVarM3.b).e = a.aH(i);
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar = vtwVarM3.b;
        vff vffVar3 = (vff) vucVar;
        veyVar3.getClass();
        vffVar3.f = veyVar3;
        vffVar3.b |= 4;
        if (!vucVar.A()) {
            vtwVarM3.u();
        }
        vff vffVar4 = (vff) vtwVarM3.b;
        vgiVar3.getClass();
        vffVar4.g = vgiVar3;
        vffVar4.b = 8 | vffVar4.b;
        return (vff) vtwVarM3.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0395  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ieg u(defpackage.ksn r25, defpackage.mbi r26, defpackage.veh r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gag.u(ksn, mbi, veh):ieg");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    public final mdw x(ksn ksnVar, ImmutableList immutableList, Executor executor, jzs jzsVar) {
        lxp lxpVar = (lxp) this.c.b();
        lxpVar.getClass();
        lfn lfnVar = (lfn) this.a.b();
        lfnVar.getClass();
        ?? r0 = this.d;
        ?? r4 = this.b;
        Object objB = this.e.b();
        Object objB2 = r4.b();
        Object objB3 = r0.b();
        immutableList.getClass();
        return new mdw(lxpVar, lfnVar, (kuw) objB, (kuw) objB2, (mbk) objB3, ksnVar, immutableList, executor, jzsVar);
    }

    public gag(Context context, gtr gtrVar, gtm gtmVar, gtr gtrVar2, gtr gtrVar3) {
        this.a = context;
        this.b = gtrVar;
        this.e = gtmVar;
        this.c = gtrVar2;
        this.d = gtrVar3;
    }

    public gag(heh hehVar, hei heiVar, hei heiVar2, hei heiVar3, hei heiVar4) {
        this.b = hehVar;
        this.c = heiVar;
        this.e = heiVar2;
        this.a = heiVar3;
        this.d = heiVar4;
    }

    public gag(iea ieaVar, lrc lrcVar, lrc lrcVar2, Executor executor, ids idsVar) {
        this.e = ieaVar;
        this.c = lrcVar;
        this.a = lrcVar2;
        this.d = executor;
        this.b = idsVar;
    }

    public gag(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.d = list2;
        this.c = list3;
        this.e = list4;
        this.b = list5;
    }

    public gag(lql lqlVar, lql lqlVar2, lxm lxmVar, moz mozVar, lie lieVar) {
        this.b = lqlVar;
        this.e = lqlVar2;
        this.d = lxmVar;
        this.c = mozVar;
        this.a = lieVar;
    }

    public gag(Context context, et etVar) {
        this.e = new Object();
        this.a = new ArrayList();
        this.d = new HashMap();
        this.b = etVar;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) etVar.b);
        this.c = mediaController;
        if (etVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ef(this));
        }
    }

    public gag(Map map) {
        this.a = yfm.m(map);
        this.d = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.c = new cf(this, 4);
    }

    public gag(moz mozVar, lfn lfnVar) {
        this.a = mozVar;
        this.b = lfnVar.bt(Arrays.asList(2, 5, 4));
        this.e = lfnVar.bu(Arrays.asList(2, 3));
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) 1);
        if (lfnVar.cW()) {
            builder.add((ImmutableList.Builder) 2);
            if (lfnVar.dp()) {
                builder.add((ImmutableList.Builder) 3);
                if (lfnVar.dn()) {
                    builder.add((ImmutableList.Builder) 5);
                }
            }
        }
        this.c = lfnVar.bv(builder.build());
        this.d = lfnVar.bw(Arrays.asList(1, 3));
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.c = yfoVar5;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
        yfoVar5.getClass();
        this.d = yfoVar5;
    }

    public /* synthetic */ gag(byte[] bArr) {
        this(yhc.a);
    }

    public gag(Context context, fsd fsdVar) {
        this.b = new Object();
        this.e = new ArrayList();
        this.a = new HashMap();
        this.d = fsdVar;
        MediaController mediaController = new MediaController(context, fsdVar.b);
        this.c = mediaController;
        if (fsdVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new frq(this));
        }
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.c = yfoVar5;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.e = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.d = yfoVar5;
    }

    public gag(Uri uri) {
        String path = uri.getPath();
        int i = !TextUtils.isEmpty(path) ? Integer.parseInt(path) : 1;
        this.d = uri.getQueryParameter("video_id");
        this.a = uri.getQueryParameter("season_id");
        this.b = uri.getQueryParameter("account");
        this.e = uri.getQueryParameter("parent_movie_id");
        this.c = i > 1 ? uri.getQueryParameter("show_id") : null;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.c = yfoVar5;
    }

    public gag(yjv yjvVar, fus fusVar) {
        this.a = yjvVar;
        this.b = fusVar;
        byte[] bArr = null;
        this.c = new ghd(bArr);
        this.d = new ghd(bArr);
        this.e = gez.e(new aki(this, (yih) null, 9));
    }

    public gag(ysx ysxVar) {
        this.d = ysxVar;
        yft yftVar = cbz.a;
        yil yilVarM = cbp.m();
        this.c = yilVarM;
        if (ysxVar instanceof yum) {
        }
        gbg gbgVar = new gbg(this, yilVarM);
        this.b = gbgVar;
        fzo fzoVarA = gbgVar.a();
        bcz bczVar = bcz.c;
        this.a = new bci(fzoVarA, bczVar);
        fzd fzdVar = (fzd) gbgVar.g.d();
        if (fzdVar == null) {
            fzw fzwVar = gcg.a;
            fzdVar = new fzd(fzwVar.b, fzwVar.c, fzwVar.d, fzwVar);
        }
        this.e = new bci(fzdVar, bczVar);
    }

    public gag(Context context, itk itkVar) {
        this.d = itkVar;
        new idz(false);
        this.e = new idz(false);
        this.c = new idz(ieg.a);
        this.b = new idz(0);
        idz idzVar = new idz(false);
        this.a = idzVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.apps.googletv.app.device.SHARED_PREFS", 0);
        idzVar.c(Boolean.valueOf(!sharedPreferences.getBoolean("com.google.android.apps.googletv.app.device.ASKED_PERMS", false)));
        idzVar.ea(new kde(sharedPreferences, this, 1, null));
        itkVar.c().ea(new itm(this, 4));
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, short[] sArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
    }

    public gag(mqp mqpVar, ActionBar actionBar) {
        this.d = new mtf(this);
        this.e = new mte(this);
        this.a = mqpVar;
        this.c = mqpVar;
        this.b = actionBar;
    }

    public gag(Executor executor, String str, lhr lhrVar, lfn lfnVar, kuw kuwVar) {
        executor.getClass();
        str.getClass();
        lhrVar.getClass();
        lfnVar.getClass();
        kuwVar.getClass();
        this.c = executor;
        this.e = str;
        this.b = lhrVar;
        this.d = lfnVar;
        this.a = kuwVar;
    }

    public gag(isw iswVar, iea ieaVar, wkx wkxVar) {
        this.d = iswVar;
        this.b = ieaVar;
        this.e = wkxVar;
        vvd vvdVar = wvg.g;
        wkx wkxVar2 = wkxVar;
        wkxVar2.i(vvdVar);
        Object objK = wkxVar2.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        wll wllVar = ((wvg) objK).c;
        wllVar = wllVar == null ? wll.a : wllVar;
        wllVar.getClass();
        this.a = new iog(wllVar, ((ksn) ((ldy) ieaVar).a().g()).a);
        this.c = new ipi((yjz) new aki(this, (yih) null, 20, (char[]) null), (ysx) new ipi(new ipi(iswVar.j, this, 3), this, 4), 13);
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
    }

    public gag(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
    }
}
