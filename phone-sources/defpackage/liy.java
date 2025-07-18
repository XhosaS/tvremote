package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.appcompat.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class liy extends lji {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/DashDownloaderV2");
    private final String D;
    public final idf b;
    public final idf c;
    public final Executor d;
    public final lux e;
    public String f;
    public long g;
    public lat h;
    public final lrq i;
    public final nuh j;
    public final kuw k;

    public liy(ljw ljwVar, kuh kuhVar, kug kugVar, File file, mfm mfmVar, lsc lscVar, lys lysVar, lfn lfnVar, idf idfVar, man manVar, lyz lyzVar, SharedPreferences sharedPreferences, idf idfVar2, idf idfVar3, lrq lrqVar, String str, kuw kuwVar, Resources resources, ContentResolver contentResolver, idf idfVar4, lzh lzhVar, Executor executor, idf idfVar5, nuh nuhVar, lux luxVar) {
        super(ljwVar, kuhVar, kugVar, file, mfmVar, lscVar, lysVar, lfnVar, idfVar, manVar, lyzVar, sharedPreferences, contentResolver, resources, idfVar4, lzhVar, idfVar5);
        this.d = executor;
        this.k = kuwVar;
        this.D = str;
        this.b = idfVar2;
        this.c = idfVar3;
        this.i = lrqVar;
        this.j = nuhVar;
        this.e = luxVar;
    }

    private final int h(ees eesVar, Uri uri, byte[] bArr, enz enzVar, fdg fdgVar, int i) {
        int i2 = i + 1;
        long j = 0;
        while (i2 < fdgVar.a && j <= 60000000) {
            j += fdgVar.d[i2];
            i2++;
        }
        long[] jArr = fdgVar.c;
        eey eeyVar = new eey(uri, jArr[i], (jArr[i2 - 1] - jArr[i]) + fdgVar.b[r4], ((eny) enzVar).c);
        boolean z = false;
        while (!z) {
            try {
                this.j.n(-1001);
                try {
                    try {
                        eesVar.b(eeyVar);
                    } finally {
                        eesVar.d();
                    }
                } catch (eap unused) {
                }
                while (!f()) {
                    if (eesVar.a(bArr, 0, 131072) == -1) {
                        eesVar.d();
                        z = true;
                    }
                }
                throw new CancellationException();
            } catch (InterruptedException unused2) {
                throw new CancellationException();
            }
        }
        return i2;
    }

    public final ees a(egc egcVar) {
        return new egh(egcVar, new efq(lmx.b(this.D, this.o).a(), this.j, -1001), new efh(), new egf(egcVar), 1, null, -1000);
    }

    @Override // defpackage.lji
    public final void b(List list) throws Throwable {
        liy liyVar = this;
        g(liyVar.f, "Download started");
        if (list.size() != 2) {
            throw new ljs("DashDownloader requires exactly 2 streams to download media.", true, 18);
        }
        egc egcVar = (egc) liyVar.b.b(new File(liyVar.t, liyVar.f));
        ees eesVarA = liyVar.a(egcVar);
        lvd lvdVar = (lvd) list.get(0);
        lvd lvdVar2 = (lvd) list.get(1);
        nuh nuhVar = liyVar.j;
        nuhVar.m(-1001);
        try {
            try {
                long jMax = Math.max(liyVar.g / 100, 2097152L);
                String str = liyVar.p.b;
                eny enyVarF = kfw.F(0, lvdVar, str);
                fdg fdgVarD = clw.D(eesVarA, 2, enyVarF);
                if (fdgVarD == null) {
                    throw new ljs("DashDownloader couldn't load video chunk index to download media", true, 18);
                }
                Uri uri = enyVarF.a;
                eny enyVarD = kfw.D(0, lvdVar2, str, true);
                fdg fdgVarD2 = clw.D(eesVarA, 1, enyVarD);
                if (fdgVarD2 == null) {
                    throw new ljs("DashDownloader couldn't load audio chunk index to download media", true, 18);
                }
                Uri uri2 = enyVarD.a;
                fdg fdgVar = fdgVarD2;
                Uri uri3 = uri;
                int i = 0;
                eny enyVar = enyVarF;
                byte[] bArr = new byte[131072];
                int i2 = 0;
                while (i2 < fdgVarD.a) {
                    fdg fdgVar2 = fdgVar;
                    try {
                        int iH = liyVar.h(eesVarA, uri3, bArr, enyVar, fdgVarD, i2);
                        Uri uri4 = uri3;
                        eny enyVar2 = enyVar;
                        fdg fdgVar3 = fdgVarD;
                        int i3 = iH - 1;
                        long j = fdgVar3.e[i3] + fdgVar3.d[i3];
                        int iH2 = i;
                        while (iH2 < fdgVar2.a && fdgVar2.e[iH2] <= j) {
                            eny enyVar3 = enyVarD;
                            fdg fdgVar4 = fdgVar2;
                            Uri uri5 = uri2;
                            iH2 = h(eesVarA, uri5, bArr, enyVar3, fdgVar4, iH2);
                            fdgVar3 = fdgVar3;
                            eesVarA = eesVarA;
                            enyVarD = enyVar3;
                            uri2 = uri5;
                            bArr = bArr;
                            fdgVar2 = fdgVar4;
                        }
                        byte[] bArr2 = bArr;
                        Uri uri6 = uri2;
                        eny enyVar4 = enyVarD;
                        fdg fdgVar5 = fdgVar3;
                        long j2 = jMax;
                        d(egcVar.a(), j2, false);
                        liyVar = this;
                        fdgVarD = fdgVar5;
                        i = iH2;
                        eesVarA = eesVarA;
                        enyVarD = enyVar4;
                        i2 = iH;
                        enyVar = enyVar2;
                        uri3 = uri4;
                        uri2 = uri6;
                        bArr = bArr2;
                        fdgVar = fdgVar2;
                        jMax = j2;
                    } catch (InterruptedIOException e) {
                        e = e;
                        liyVar = this;
                        ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/apps/play/movies/common/service/pinning/DashDownloaderV2", "downloadMedia", 670, "DashDownloaderV2.java")).s("[GTVm-Downloads] Interrupted IOException while downloading video");
                        liyVar.j.p(-1001);
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        throw new ljs("I/O exception while downloading video", e, false, 14);
                    } catch (Throwable th) {
                        th = th;
                        liyVar = this;
                        liyVar.j.p(-1001);
                        throw th;
                    }
                }
                ees eesVar = eesVarA;
                byte[] bArr3 = bArr;
                long j3 = jMax;
                Uri uri7 = uri2;
                eny enyVar5 = enyVarD;
                int iH3 = i;
                while (true) {
                    fdg fdgVar6 = fdgVar;
                    if (iH3 >= fdgVar6.a) {
                        d(egcVar.a(), j3, true);
                        g(this.f, "Download completed");
                        nuhVar.p(-1001);
                        return;
                    }
                    iH3 = h(eesVar, uri7, bArr3, enyVar5, fdgVar6, iH3);
                    fdgVar = fdgVar6;
                    long j4 = j3;
                    d(egcVar.a(), j4, false);
                    j3 = j4;
                }
            } catch (InterruptedIOException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(lhe lheVar, zuw zuwVar) {
        kuh kuhVar;
        dze dzeVarE;
        int i;
        dza dzaVar;
        dyz dyzVarA;
        int i2;
        ees eesVarA = a((egc) this.b.b(new File(this.t, this.f)));
        this.j.m(-1001);
        int i3 = 0;
        try {
            try {
                try {
                    lvd lvdVar = (lvd) zuwVar.i().a.get(0);
                    kuhVar = this.p;
                    dzeVarE = clw.E(eesVarA, kfw.I(Collections.singletonList(kfw.F(0, lvdVar, kuhVar.b)), ImmutableList.of(), ImmutableList.of()));
                    i = 1;
                    try {
                    } catch (IOException e) {
                        e = e;
                        throw new ljs("I/O exception while downloading video", e, false, 14);
                    }
                } catch (InterruptedIOException e2) {
                    ((tug) ((tug) ((tug) a.g()).i(e2)).j("com/google/android/apps/play/movies/common/service/pinning/DashDownloaderV2", "acquireLicense", 431, "DashDownloaderV2.java")).s("[GTVm-Downloads] Interrupted IOException while downloading video");
                }
                if (dzeVarE == null || (dzaVar = dzeVarE.ac) == null) {
                    throw new ljs("Couldn't request license (No drm init data)", new lgt(), true, 1);
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= dzaVar.c) {
                        dyzVarA = null;
                        break;
                    }
                    dyzVarA = dzaVar.a(i4);
                    if (dyzVarA.c(dys.d)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (dyzVarA == null) {
                    throw new ljs("Couldn't request license (No widevine init data)", new lgt(), true, 1);
                }
                g(this.f, "Acquiring license");
                if (((lvd) zuwVar.i().a.get(0)).c.f != 0) {
                    try {
                        mfl mflVar = new mfl();
                        String str = dyzVarA.c;
                        byte[] bArr = dyzVarA.d;
                        lheVar.d(str, bArr, "OpenSessionForOffline", mflVar);
                        mflVar.a();
                        mfl mflVar2 = new mfl();
                        lheVar.i("AcquireLicenseForPinning", mflVar2);
                        ieg iegVarA = mflVar2.a();
                        if (iegVarA.k()) {
                            Throwable thI = iegVarA.i();
                            if (thI.getCause() != null) {
                                thI = thI.getCause();
                            }
                            boolean z = thI instanceof lzk;
                            if (z) {
                                int i5 = ((lzk) thI).a;
                                if (i5 != 401) {
                                    switch (i5) {
                                        case 100:
                                            i2 = 2;
                                            break;
                                        case 101:
                                            i2 = 20;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                                            i2 = 21;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                            i2 = 22;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                            i2 = 23;
                                            break;
                                        default:
                                            i2 = 1;
                                            break;
                                    }
                                } else {
                                    i2 = 3;
                                }
                            } else {
                                i2 = 1;
                            }
                            if (!z) {
                                throw new ljs("Error during license request", thI, true, i2);
                            }
                            throw new ljs(thI, i2, ((lzk) thI).a);
                        }
                        byte[] bArr2 = (byte[]) ((ieg) iegVarA.g()).c;
                        vtw vtwVarM = lat.a.m();
                        for (int i6 = 0; i6 < zuwVar.g(); i6++) {
                            lvh lvhVarH = zuwVar.h(i6);
                            ImmutableList immutableList = lvhVarH.a;
                            vtwVarM.D(((lvd) immutableList.get(i3)).b);
                            vtwVarM.D(((lvd) immutableList.get(i)).b);
                            UnmodifiableIterator it = lvhVarH.b.iterator();
                            while (it.hasNext()) {
                                kwx kwxVar = (kwx) it.next();
                                vtw vtwVarM2 = lcn.a.m();
                                int iFileVersion = kwxVar.fileVersion();
                                int i7 = i3;
                                try {
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar = (lcn) vtwVarM2.b;
                                    int i8 = i;
                                    lcnVar.b |= 32;
                                    lcnVar.h = iFileVersion;
                                    int i9 = kwxVar.format();
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar2 = (lcn) vtwVarM2.b;
                                    lcnVar2.b |= 2;
                                    lcnVar2.d = i9;
                                    boolean zIsForced = kwxVar.isForced();
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar3 = (lcn) vtwVarM2.b;
                                    lcnVar3.b |= 8;
                                    lcnVar3.f = zIsForced;
                                    boolean zIsClosedCaption = kwxVar.isClosedCaption();
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar4 = (lcn) vtwVarM2.b;
                                    lcnVar4.b |= 16;
                                    lcnVar4.g = zIsClosedCaption;
                                    String strLanguageCode = kwxVar.languageCode();
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar5 = (lcn) vtwVarM2.b;
                                    strLanguageCode.getClass();
                                    lcnVar5.b |= 1;
                                    lcnVar5.c = strLanguageCode;
                                    String strUrl = kwxVar.url();
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    lcn lcnVar6 = (lcn) vtwVarM2.b;
                                    strUrl.getClass();
                                    lcnVar6.b |= 4;
                                    lcnVar6.e = strUrl;
                                    lcn lcnVar7 = (lcn) vtwVarM2.r();
                                    if (!vtwVarM.b.A()) {
                                        vtwVarM.u();
                                    }
                                    lat latVar = (lat) vtwVarM.b;
                                    lcnVar7.getClass();
                                    vun vunVar = latVar.c;
                                    if (!vunVar.c()) {
                                        latVar.c = vuc.s(vunVar);
                                    }
                                    latVar.c.add(lcnVar7);
                                    i3 = i7;
                                    i = i8;
                                } catch (Throwable th) {
                                    th = th;
                                    lheVar.c();
                                    throw th;
                                }
                            }
                        }
                        this.h = (lat) vtwVarM.r();
                        ContentValues contentValuesS = ktw.s();
                        contentValuesS.put("download_relative_filepath", this.f);
                        contentValuesS.put("download_extra_proto", this.h.h());
                        contentValuesS.put("license_type", (Integer) 2);
                        contentValuesS.put("license_last_synced_timestamp", Long.valueOf(System.currentTimeMillis()));
                        contentValuesS.put("license_last_synced_sdk_int", Integer.valueOf(ksk.b));
                        contentValuesS.put("license_force_sync", Boolean.valueOf((boolean) i3));
                        contentValuesS.put("license_cenc_key_set_id", bArr2);
                        contentValuesS.put("license_cenc_pssh_data", bArr);
                        contentValuesS.put("license_cenc_mimetype", str);
                        contentValuesS.put("license_cenc_security_level", Integer.valueOf(lheVar.c));
                        ktw.u(this.C, kuhVar, contentValuesS);
                        lheVar.c();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                g(this.f, "License acquired");
            } catch (IOException e3) {
                e = e3;
            }
        } finally {
            this.j.p(-1001);
        }
    }
}
