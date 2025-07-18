package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import com.google.android.videos.R;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuw {
    public final Object a;
    public final Object b;

    public kuw(cb cbVar, yow yowVar) {
        this.a = cbVar;
        this.b = yowVar;
    }

    public static final int A(kmd kmdVar) {
        int i = kmdVar.g - 1;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 4;
    }

    public static final int B(kmd kmdVar) {
        int i = kmdVar.f - 1;
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 3;
    }

    public static final wdm C(String str, kmd kmdVar, int i) {
        vty vtyVar = (vty) wdm.a.m();
        String str2 = kmdVar.a.b;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar = (wdm) vtyVar.b;
        str2.getClass();
        wdmVar.b |= 64;
        wdmVar.g = str2;
        int iZ = z(kmdVar.c);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar2 = (wdm) vtyVar.b;
        wdmVar2.d = iZ - 1;
        int i2 = 2;
        wdmVar2.b |= 2;
        switch (i) {
            case -3:
                break;
            case ListPopupWindow.WRAP_CONTENT /* -2 */:
                i2 = 3;
                break;
            case -1:
                i2 = 4;
                break;
            case 0:
                i2 = 5;
                break;
            case 1:
                i2 = 6;
                break;
            case 2:
                i2 = 7;
                break;
            case 3:
                i2 = 8;
                break;
            case 4:
                i2 = 9;
                break;
            case 5:
                i2 = 10;
                break;
            case 6:
                i2 = 11;
                break;
            case 7:
                i2 = 12;
                break;
            case 8:
                i2 = 13;
                break;
            case 9:
            case 10:
            default:
                i2 = 1;
                break;
            case 11:
                i2 = 14;
                break;
            case 12:
                i2 = 15;
                break;
        }
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar3 = (wdm) vtyVar.b;
        wdmVar3.f = i2 - 1;
        wdmVar3.b = 8 | wdmVar3.b;
        int iB = B(kmdVar);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar4 = (wdm) vtyVar.b;
        wdmVar4.i = iB - 1;
        wdmVar4.b |= 512;
        int iA = A(kmdVar);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar5 = (wdm) vtyVar.b;
        wdmVar5.j = iA - 1;
        wdmVar5.b |= 1024;
        vwe vweVarE = vxf.e(System.currentTimeMillis());
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar6 = (wdm) vtyVar.b;
        vweVarE.getClass();
        wdmVar6.m = vweVarE;
        wdmVar6.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        String str3 = kmdVar.e;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar7 = (wdm) vtyVar.b;
        wdmVar7.b = 1 | wdmVar7.b;
        wdmVar7.c = str3;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar8 = (wdm) vtyVar.b;
        wdmVar8.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wdmVar8.k = str;
        vuc vucVarR = vtyVar.r();
        vucVarR.getClass();
        return (wdm) vucVarR;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, lfn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List E(java.util.List r17, boolean r18, java.util.List r19, defpackage.luu r20) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuw.E(java.util.List, boolean, java.util.List, luu):java.util.List");
    }

    private final void F(int i) {
        if (i <= 0) {
            return;
        }
        SQLiteDatabase sQLiteDatabaseA = ((lyz) this.a).a();
        boolean z = true;
        try {
            sQLiteDatabaseA.delete("pending_qoe_logs", "session_nonce IN (SELECT session_nonce FROM pending_qoe_logs ORDER BY first_storage_time LIMIT ?) AND ping_uri IN (SELECT ping_uri FROM pending_qoe_logs ORDER BY first_storage_time LIMIT ?)", new String[]{Integer.toString(i), Integer.toString(i)});
        } catch (SQLException unused) {
            z = false;
        } catch (Throwable th) {
            ((lyz) this.a).e(sQLiteDatabaseA, true);
            throw th;
        }
        ((lyz) this.a).e(sQLiteDatabaseA, z);
    }

    private static final ubx G(jac jacVar) {
        Integer num;
        vtw vtwVarM = wdr.a.m();
        vtwVarM.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        out outVar = jacVar.a;
        vuc vucVar = vtwVarM.b;
        wdr wdrVar = (wdr) vucVar;
        wdrVar.b |= 1;
        wdrVar.c = outVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        our ourVar = outVar.c;
        wdr wdrVar2 = (wdr) vtwVarM.b;
        wdrVar2.b |= 2;
        wdrVar2.d = ourVar.a;
        int iOrdinal = ourVar.b.ordinal();
        int i = 4;
        int i2 = iOrdinal != 1 ? iOrdinal != 4 ? iOrdinal != 5 ? 1 : 4 : 3 : 2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wdr wdrVar3 = (wdr) vucVar2;
        wdrVar3.e = i2 - 1;
        wdrVar3.b |= 4;
        int i3 = true != jacVar.b ? 2 : 3;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wdr wdrVar4 = (wdr) vtwVarM.b;
        wdrVar4.f = i3 - 1;
        wdrVar4.b |= 8;
        Integer num2 = jacVar.d;
        if (num2 == null || (num = jacVar.e) == null) {
            i = 1;
        } else if (num2.intValue() < 1920 || num.intValue() < 1080) {
            i = (num2.intValue() < 1280 || num.intValue() < 720) ? 2 : 3;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wdr wdrVar5 = (wdr) vucVar3;
        wdrVar5.i = i - 1;
        wdrVar5.b |= 256;
        boolean z = jacVar.c;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        wdr wdrVar6 = (wdr) vtwVarM.b;
        wdrVar6.b |= 128;
        wdrVar6.h = z;
        jbm jbmVar = jacVar.g;
        vtw vtwVarM2 = wdl.a.m();
        int iOrdinal2 = jbmVar.ordinal();
        int i4 = iOrdinal2 != 0 ? iOrdinal2 != 1 ? 1 : 3 : 2;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wdl wdlVar = (wdl) vtwVarM2.b;
        wdlVar.c = i4 - 1;
        wdlVar.b |= 1;
        vuc vucVarR = vtwVarM2.r();
        vucVarR.getClass();
        wdl wdlVar2 = (wdl) vucVarR;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        wdr wdrVar7 = (wdr) vucVar4;
        wdrVar7.k = wdlVar2;
        wdrVar7.b |= 1024;
        boolean z2 = jacVar.h;
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        vuc vucVar5 = vtwVarM.b;
        wdr wdrVar8 = (wdr) vucVar5;
        wdrVar8.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wdrVar8.l = z2;
        String str = jacVar.f;
        if (!vucVar5.A()) {
            vtwVarM.u();
        }
        vuc vucVar6 = vtwVarM.b;
        wdr wdrVar9 = (wdr) vucVar6;
        wdrVar9.b |= 512;
        wdrVar9.j = str;
        wdq wdqVar = jacVar.i;
        if (wdqVar != null) {
            if (!vucVar6.A()) {
                vtwVarM.u();
            }
            wdr wdrVar10 = (wdr) vtwVarM.b;
            wdrVar10.g = wdqVar.j;
            wdrVar10.b |= 16;
        }
        vuc vucVarR2 = vtwVarM.r();
        vucVarR2.getClass();
        wdr wdrVar11 = (wdr) vucVarR2;
        vtw vtwVarM3 = ubx.a.m();
        vtwVarM3.getClass();
        vtw vtwVarM4 = ubw.a.m();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        ubw ubwVar = (ubw) vtwVarM4.b;
        ubwVar.c = wdrVar11;
        ubwVar.b |= 1;
        vuc vucVarR3 = vtwVarM4.r();
        vucVarR3.getClass();
        ubw ubwVar2 = (ubw) vucVarR3;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ubx ubxVar = (ubx) vtwVarM3.b;
        ubxVar.g = ubwVar2;
        ubxVar.b |= 32;
        vuc vucVarR4 = vtwVarM3.r();
        vucVarR4.getClass();
        return (ubx) vucVarR4;
    }

    public static boolean j(Display display) {
        if (display.getHdrCapabilities() != null) {
            return DesugarArrays.stream(display.getHdrCapabilities().getSupportedHdrTypes()).anyMatch(new lvc(0));
        }
        return false;
    }

    public static final pjv y(ubx ubxVar) {
        return new pjv(nbu.c, ubxVar);
    }

    public static final int z(kmc kmcVar) {
        int iOrdinal = kmcVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? 1 : 3;
        }
        return 2;
    }

    public final nuh D(int i) {
        Object obj = this.a;
        nuh nuhVarN = pkg.n(i);
        nuhVarN.x(rdd.Z(((ksn) ((ldy) obj).a().g()).a));
        nuhVarN.x(qtl.ag(nbt.a));
        return nuhVarN;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lfn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.arl r11, defpackage.arl r12, boolean r13, defpackage.yjz r14, defpackage.bao r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuw.a(arl, arl, boolean, yjz, bao, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, lfn] */
    public final uhp b(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gli.D("worker_name_key", "AppIndexingWorker", linkedHashMap);
        gox goxVarY = gli.y(linkedHashMap);
        gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
        gpoVar.b("refresh_app_index_task_tag");
        gpoVar.e(goxVarY);
        if (!z) {
            gpoVar.d(this.a.ao(), TimeUnit.SECONDS);
        }
        cvi cviVarF = gpoVar.f();
        return ufn.i(((gpt) ((gpz) this.b).g("refresh_app_index_task_tag", 1, cviVarF)).c, new ldl(cviVarF, 5), ugk.a);
    }

    public final synchronized ids c(int i) {
        int i2;
        Object obj;
        a.aD(true, "Must specify a target");
        i2 = 0;
        a.aD(((i - 1) & i) == 0, a.cf(i, "Must specify only one target: "));
        while (i2 < 7) {
            obj = this.b;
            if (((idt[]) obj)[i2] == null) {
                ((idt[]) obj)[i2] = new idt(null);
            }
            if (Integer.compare(i, 1 << i2) != 0) {
                i2++;
            }
        }
        throw new IllegalArgumentException(a.cf(i, "Unrecognized target: "));
        return ((idt[]) obj)[i2];
    }

    public final synchronized void d(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (((1 << i2) & i) != 0) {
                ((leu[]) this.a)[i2].a();
            }
        }
        e(i);
    }

    public final synchronized void e(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (((1 << i2) & i) != 0) {
                idt idtVar = ((idt[]) this.b)[i2];
                if (idtVar != null) {
                    idtVar.eb();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lfn] */
    public final List f(List list, boolean z, luu luuVar) {
        return E(list, z, this.a.bx(), luuVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lfn] */
    public final List g(List list, boolean z, luu luuVar, boolean z2) {
        List listE = E(list, z, z2 ? this.a.by() : this.a.bx(), luuVar);
        if (!listE.isEmpty()) {
            return listE;
        }
        if (z2) {
            krd.b("No WebM streams for audio. Falling back to MP4.");
            return g(list, z, luuVar, false);
        }
        krd.c("No audio stream exists.");
        return ImmutableList.of();
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, lie] */
    public final List h(List list, Set set, Set set2, Set set3, int i, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        int iMin = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int iMax = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            lvd lvdVar = (lvd) list.get(i2);
            kuy kuyVar = lvdVar.c;
            int i3 = kuyVar.b;
            if (i3 > 0 && i3 <= i) {
                lcl lclVar = lvdVar.b;
                if (set.contains(Integer.valueOf(lclVar.c))) {
                    ?? r12 = this.a;
                    ?? r14 = this.b;
                    lvb.b();
                    if (lclVar.k.contains("avc")) {
                        int i4 = kuyVar.a * i3;
                        int i5 = lvb.a;
                        if (i4 > i5) {
                            r14.p(lclVar.c, i5, r12.ch());
                            krd.e("Filtered out H264 stream because the device is not capable of decoding it. Maximum H264 resolution: " + lvb.a + ". The stream: " + String.valueOf(lvdVar));
                            if (!r12.ch()) {
                            }
                        }
                    }
                    int i6 = kuyVar.g;
                    boolean z3 = true;
                    if (i6 == 2 || i6 == 3 || i6 == 4) {
                        z2 = z;
                    } else {
                        z2 = z;
                        z3 = false;
                    }
                    if (z3 == z2) {
                        arrayList.add(lvdVar);
                        iMax = Math.max(iMax, i3);
                        iMin = Math.min(iMin, i3);
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            lvd lvdVar2 = (lvd) arrayList.get(size);
            int i7 = lvdVar2.c.b;
            if (i7 != iMax && set2.contains(Integer.valueOf(lvdVar2.b.c))) {
                arrayList.remove(size);
            } else if (i7 != iMin) {
                if (set3.contains(Integer.valueOf(lvdVar2.b.c))) {
                    arrayList.remove(size);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lfn] */
    public final boolean i(Display display, boolean z) {
        if (ksk.b >= 24) {
            if (display.getHdrCapabilities() != null && display.getHdrCapabilities().getSupportedHdrTypes().length > 0) {
                if (this.a.cK() && j(display)) {
                    try {
                        ess essVarA = ete.a("video/dolby-vision", false, z);
                        if (essVarA != null) {
                            if (essVarA.i().length > 0) {
                                Log.e("DV-TEST", "Display support HDR for the DV on NVidia device");
                                return true;
                            }
                        }
                    } catch (etb unused) {
                        krd.f("Couldn't query CodecInfo for video/dolby-vision");
                    }
                }
                try {
                    ess essVarA2 = ete.a("video/x-vnd.on2.vp9", false, z);
                    if (essVarA2 != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : essVarA2.i()) {
                            if (codecProfileLevel.profile == 4096) {
                                return true;
                            }
                        }
                    }
                } catch (etb unused2) {
                    krd.f("Couldn't query CodecInfo for video/x-vnd.on2.vp9");
                }
                return false;
            }
            Log.e("DV-TEST", "Display does not support HDR");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vzt k(lsi lsiVar) {
        ArrayList arrayList;
        vtw vtwVarM = vzt.a.m();
        vdn vdnVarD = ((moz) this.b).d(((ldy) this.a).a(), trk.a);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vzt vztVar = (vzt) vtwVarM.b;
        vdnVarD.getClass();
        vztVar.c = vdnVarD;
        vztVar.b |= 1;
        vtw vtwVarM2 = vzs.a.m();
        ImmutableList immutableList = lsiVar.a;
        if (immutableList.isEmpty()) {
            ImmutableList immutableList2 = lsiVar.b;
            arrayList = new ArrayList(immutableList2.size());
            UnmodifiableIterator it = immutableList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                vtw vtwVarM3 = vzv.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vzv vzvVar = (vzv) vtwVarM3.b;
                str.getClass();
                vzvVar.b = 3;
                vzvVar.c = str;
                arrayList.add((vzv) vtwVarM3.r());
            }
        } else {
            ArrayList arrayList2 = new ArrayList(immutableList.size());
            UnmodifiableIterator it2 = immutableList.iterator();
            while (it2.hasNext()) {
                ksy ksyVar = (ksy) it2.next();
                vtw vtwVarM4 = vzv.a.m();
                val valVarO = kgu.o(ksyVar);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vzv vzvVar2 = (vzv) vtwVarM4.b;
                valVarO.getClass();
                vzvVar2.c = valVarO;
                vzvVar2.b = 1;
                arrayList2.add((vzv) vtwVarM4.r());
            }
            arrayList = arrayList2;
        }
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vzs vzsVar = (vzs) vtwVarM2.b;
        vun vunVar = vzsVar.b;
        if (!vunVar.c()) {
            vzsVar.b = vuc.s(vunVar);
        }
        vsf.h(arrayList, vzsVar.b);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        ((vzs) vucVar).c = true;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        ((vzs) vucVar2).d = true;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        ((vzs) vtwVarM2.b).e = false;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vzt vztVar2 = (vzt) vtwVarM.b;
        vzs vzsVar2 = (vzs) vtwVarM2.r();
        vzsVar2.getClass();
        vztVar2.d = vzsVar2;
        vztVar2.b |= 2;
        return (vzt) vtwVarM.r();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ldv] */
    public final vbz l() {
        vtw vtwVarM = vbz.a.m();
        lys lysVar = (lys) this.b;
        lysVar.o();
        lysVar.p();
        ?? r2 = this.a;
        if (r2.a().m()) {
            int iA = lysVar.a((ksn) r2.a().g());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            ((vbz) vtwVarM.b).d = iA;
        }
        return (vbz) vtwVarM.r();
    }

    public final void m(Uri uri) throws Resources.NotFoundException {
        ImageView imageView = (ImageView) this.a;
        Context context = imageView.getContext();
        krd.c("Taking Gradient scale : ");
        krd.c("Screenshot url : ".concat(uri.toString()));
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.gradientScale, typedValue, true);
        ((hke) hjr.c(context).e(uri).g(htc.b()).z(new hlh(new mwl(context.getColor(R.color.interstitial_background), context.getColor(R.color.google_transparent), typedValue.getFloat()), new mwp(context.getColor(R.color.interstitial_background), context.getColor(R.color.google_transparent))))).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).l(new mug(imageView));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mgn] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, mgn] */
    public final boolean n(MotionEvent motionEvent) {
        boolean zB;
        boolean zB2 = ((nhl) this.a).b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            zB = this.b.b();
        } else {
            if (actionMasked != 3) {
                return zB2;
            }
            zB = this.b.a();
        }
        return zB | zB2;
    }

    public final void o() {
        ((nhl) this.a).a(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mcq] */
    public final void p() {
        if (this.a.a()) {
            return;
        }
        try {
            gos gosVar = new gos();
            gosVar.c(2);
            gou gouVarA = gosVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gli.D("worker_name_key", "UpdateWishlistWorker", linkedHashMap);
            gox goxVarY = gli.y(linkedHashMap);
            gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
            gpoVar.b("upload_wishlist_v2");
            gpoVar.c(gouVarA);
            gpoVar.e(goxVarY);
            cvi cviVarF = gpoVar.f();
            ((ufb) ufn.i(((gpt) ((gpz) this.b).g("upload_wishlist_v2", 1, cviVarF)).c, new nbe(cviVarF, 1), ugk.a)).s();
        } catch (Exception unused) {
            krd.f("Unable to upload wishlist");
        }
    }

    public final int q() {
        Cursor cursorQuery = ((lyz) this.a).b().query("pending_qoe_logs", mae.a, null, null, null, null, null, null);
        try {
            int count = cursorQuery.getCount();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return count;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lfn] */
    public final void r(mad madVar) {
        krd.e("Attempting to store QoE log request");
        if (madVar.b(this.b)) {
            SQLiteDatabase sQLiteDatabaseA = ((lyz) this.a).a();
            boolean z = false;
            try {
                ContentValues contentValues = new ContentValues();
                kyq kyqVar = madVar.a;
                contentValues.put("session_nonce", kyqVar.a);
                contentValues.put("ping_uri", kyqVar.b);
                contentValues.put("failure_count", Integer.valueOf(madVar.b));
                contentValues.put("last_sending_attempt", Long.valueOf(madVar.c));
                contentValues.put("first_storage_time", Long.valueOf(madVar.d));
                try {
                    sQLiteDatabaseA.insertOrThrow("pending_qoe_logs", null, contentValues);
                    z = true;
                } catch (SQLException unused) {
                }
                ((lyz) this.a).f(sQLiteDatabaseA, z, 17);
                int iQ = q();
                int iAe = this.b.ae();
                if (iAe == -1 || iQ < iAe) {
                    return;
                }
                F(iQ - iAe);
            } catch (Throwable th) {
                ((lyz) this.a).f(sQLiteDatabaseA, false, 17);
                throw th;
            }
        }
    }

    public final void s(ksn ksnVar) {
        ((lys) this.b).e(ksnVar);
        ((ConcurrentHashMap) this.a).put(ksnVar, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, xhg] */
    public final void t(sca scaVar, wlx wlxVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) scaVar.p(i);
        ylf ylfVar = new ylf();
        ylfVar.a = new hvc();
        if (i2 != -1) {
            ylfVar.a = ((hvc) ylfVar.a).t(i2);
        }
        if (z) {
            ylfVar.a = ((hvc) ylfVar.a).r(hru.d, new hrj());
        }
        ylfVar.a = ((hvc) ylfVar.a).w(jwp.a, Boolean.valueOf(!(this.a.b() && z3) && z2));
        hjr.c(imageView.getContext()).b().f(wlxVar).h((huu) ylfVar.a).d(new jwk(wlxVar, this, imageView, ylfVar)).k(imageView);
        String str = wlxVar != null ? wlxVar.d : null;
        if (str != null && str.length() != 0) {
            imageView.setContentDescription(wlxVar.d);
        }
        if (i3 != -1) {
            if (wlxVar != null && !yks.e(wlxVar, wlx.a)) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, oum] */
    public final enr u(vfg vfgVar) {
        ?? r0 = this.b;
        Object objA = r0.get(vfgVar);
        if (objA == null) {
            objA = this.a.a(vfgVar, false);
            r0.put(vfgVar, objA);
        }
        return (enr) objA;
    }

    public final void v(jac jacVar) {
        nuh nuhVarD = D(202078);
        nuhVarD.w(y(G(jacVar)));
        ((ntp) this.b).w(nuhVarD.y());
    }

    public final void w(jac jacVar) {
        nuh nuhVarD = D(202079);
        nuhVarD.w(y(G(jacVar)));
        ((ntp) this.b).w(nuhVarD.y());
    }

    public final void x(jac jacVar) {
        nuh nuhVarD = D(202077);
        nuhVarD.w(y(G(jacVar)));
        ((ntp) this.b).w(nuhVarD.y());
    }

    public kuw(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public kuw(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public kuw(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public kuw(Context context, iea ieaVar, iea ieaVar2, lhm lhmVar, lfn lfnVar) {
        ieaVar.getClass();
        ieaVar2.getClass();
        lfnVar.getClass();
        this.a = new oxe(ieaVar, ieaVar2, lhmVar, new mcb(lhmVar, 7), new mcb(lhmVar, 8), lfnVar.ax());
        this.b = new ntp(context.getResources());
    }

    public kuw(lfn lfnVar, lie lieVar, krh krhVar) {
        lfnVar.getClass();
        this.a = lfnVar;
        lieVar.getClass();
        this.b = lieVar;
        krhVar.getClass();
    }

    public kuw(yfo yfoVar, yfo yfoVar2, int[] iArr, byte[] bArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(byte[] bArr) {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashSet();
    }

    public kuw() {
        yvc yvcVarA = yvd.a(false);
        this.b = yvcVarA;
        this.a = new yul(yvcVarA);
    }

    public kuw(oum oumVar) {
        oumVar.getClass();
        this.a = oumVar;
        this.b = HashBiMap.create();
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, char[] cArr, char[] cArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(int[] iArr, lwn[][] lwnVarArr) {
        a.aD(iArr.length == lwnVarArr.length, "keyframeTimes and keyframes length mismatch");
        this.b = iArr;
        this.a = lwnVarArr;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, short[] sArr, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(Map map) {
        this.b = new idt[7];
        this.a = new leu[7];
        leu leuVar = new leu() { // from class: lyb
            @Override // defpackage.leu
            public final void a() {
            }
        };
        for (int i = 0; i < 7; i++) {
            leu leuVar2 = (leu) map.get(Integer.valueOf(1 << i));
            Object obj = this.a;
            if (leuVar2 == null) {
                leuVar2 = leuVar;
            }
            ((leu[]) obj)[i] = leuVar2;
        }
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(lys lysVar) {
        this.a = new ConcurrentHashMap();
        this.b = lysVar;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, char[] cArr, char[] cArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(lor lorVar, mdw mdwVar) {
        lorVar.getClass();
        mdwVar.getClass();
        this.a = lorVar;
        this.b = mdwVar;
    }

    public kuw(Context context, mgn mgnVar) {
        nhl nhlVar = new nhl(context, mgnVar);
        this.a = nhlVar;
        ((GestureDetector) nhlVar.a).setOnDoubleTapListener(mgnVar);
        this.b = mgnVar;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, boolean[] zArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, char[] cArr, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, int[] iArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public kuw(iyz iyzVar, xhg xhgVar) {
        iyzVar.getClass();
        this.b = iyzVar;
        this.a = xhgVar;
    }

    public kuw(irc ircVar, jwq jwqVar) {
        ircVar.getClass();
        this.a = ircVar;
        this.b = jwqVar;
    }

    public kuw(yfo yfoVar, yfo yfoVar2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        this.b = yfoVar2;
    }

    public kuw(lfn lfnVar, ihg ihgVar) {
        lfnVar.getClass();
        this.b = lfnVar;
        this.a = ihgVar;
    }

    public kuw(kuo kuoVar) {
        this.a = kuoVar.f.toString();
        this.b = kuoVar.q.toString();
    }

    public kuw(kvf kvfVar) {
        this.a = kvfVar.g().toString();
        this.b = kvfVar.h().toString();
    }
}
