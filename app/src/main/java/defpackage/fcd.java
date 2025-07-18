package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.common.collect.Sets;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Map;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcd implements fby {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl");
    public static final Uri b;
    private static final Duration e;
    private static final Duration f;
    private static final Uri g;
    private static final Set h;
    private fcg A;
    private byte[] B;
    private fce C;
    private final Set D;
    private Instant E;
    private gro F;
    private int G;
    public final gmd c;
    public String d;
    private final fiw i;
    private final ContentResolver j;
    private final agow k;
    private final gph l;
    private final gtu m;
    private final gfr n;
    private final ftu o;
    private final lzb p;
    private final ztw q;
    private final ghr r;
    private final agow s;
    private final Object t;
    private final List u;
    private abvo v;
    private boolean w;
    private final Handler x;
    private final Runnable y;
    private final Runnable z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        durationOfSeconds.getClass();
        e = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(10L);
        durationOfSeconds2.getClass();
        f = durationOfSeconds2;
        g = Uri.parse("content://com.google.android.apps.tv.launcherx.appsonlymode.AppsOnlyModeContentProvider/apps_only_mode");
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.apps.tv.launcherx.profile.contentprovider.AppAccessContentProvider").appendPath("queryAll").build();
        uriBuild.getClass();
        b = uriBuild;
        h = agqj.p(new Integer[]{0, 1, 2, 3});
    }

    public fcd(fiw fiwVar, ContentResolver contentResolver, ahbt ahbtVar, agow agowVar, gph gphVar, gtu gtuVar, gfr gfrVar, gmd gmdVar, ftu ftuVar, lzb lzbVar, ztw ztwVar, ghr ghrVar, agow agowVar2) {
        ahbtVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        lzbVar.getClass();
        ztwVar.getClass();
        ghrVar.getClass();
        agowVar2.getClass();
        this.i = fiwVar;
        this.j = contentResolver;
        this.k = agowVar;
        this.l = gphVar;
        this.m = gtuVar;
        this.n = gfrVar;
        this.c = gmdVar;
        this.o = ftuVar;
        this.p = lzbVar;
        this.q = ztwVar;
        this.r = ghrVar;
        this.s = agowVar2;
        this.t = new Object();
        this.u = new ArrayList();
        this.G = 1;
        this.x = new Handler(Looper.getMainLooper());
        this.y = new Runnable() { // from class: fbz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.a(gmc.j);
            }
        };
        this.z = new Runnable() { // from class: fca
            @Override // java.lang.Runnable
            public final void run() throws abxv {
                zdv zdvVar = (zdv) fcd.a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "timeoutWaitForAppContext$lambda$9", 223, "AppContextManagerImpl.kt");
                fcd fcdVar = this.a;
                zdvVar.x("Timing out. No app context from target app: %s", fcdVar.d);
                fcdVar.m(null);
            }
        };
        this.B = new byte[0];
        Set setF = Sets.f();
        setF.getClass();
        this.D = setF;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.E = instant;
    }

    private final Cursor E() {
        if (!((Boolean) this.k.a()).booleanValue()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxAppAccessContentProvider", 783, "AppContextManagerImpl.kt")).u("Assistant for Kids Mode is not enabled, so skip querying App Access Content Provider.");
            return null;
        }
        try {
            return this.j.query(b, null, null, null, null);
        } catch (SecurityException e2) {
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxAppAccessContentProvider", 800, "AppContextManagerImpl.kt")).u("Only apps signed with google in user 0 has access to this content provider.");
            return null;
        } catch (UnsupportedOperationException e3) {
            ((zdv) ((zdv) a.d()).p(e3).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxAppAccessContentProvider", 802, "AppContextManagerImpl.kt")).u("Failed to get Google certificates from remote.");
            return null;
        }
    }

    private final Cursor F() {
        try {
            return this.j.query(urr.a, null, null, null, null);
        } catch (Exception e2) {
            if (e2 instanceof SecurityException) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxModeContentProvider", 702, "AppContextManagerImpl.kt")).u("Only apps signed with google in user 0 has access to this content provider.");
                return null;
            }
            if (e2 instanceof UnsupportedOperationException) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxModeContentProvider", 704, "AppContextManagerImpl.kt")).u("Failed to get Google certificates from remote.");
                return null;
            }
            if (e2 instanceof IllegalStateException) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxModeContentProvider", 706, "AppContextManagerImpl.kt")).u("Query account mode failed on LauncherX side.");
                return null;
            }
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryLauncherxModeContentProvider", 708, "AppContextManagerImpl.kt")).u("LauncherX query failed due to unknown exception.");
            return null;
        }
    }

    private final fcb G() {
        int iA;
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 608, "AppContextManagerImpl.kt")).u("Querying LauncherX for account info updates.");
        Cursor cursorF = F();
        if (cursorF != null) {
            if (cursorF.getColumnCount() <= 0) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 617, "AppContextManagerImpl.kt")).u("Cursor has no columns.");
                return null;
            }
            if (!cursorF.moveToFirst()) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 622, "AppContextManagerImpl.kt")).u("Cursor has no rows.");
                return null;
            }
            int i = cursorF.getInt(0);
            if (!h.contains(Integer.valueOf(i))) {
                ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 630, "AppContextManagerImpl.kt")).v("Discarding account update from LauncherX as accountMode [%d] is invalid", i);
                return null;
            }
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "notifyLauncherxModeChanged", 757, "AppContextManagerImpl.kt")).v("Got account mode code [%d] from LauncherX.", i);
            synchronized (this.t) {
                int iA2 = xcm.a(i);
                if (iA2 != 0) {
                    this.G = iA2;
                    for (Object obj : this.D) {
                        obj.getClass();
                        fbx fbxVar = (fbx) obj;
                        xcp xcpVar = xcp.a;
                        xck xckVar = new xck();
                        if ((xckVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xckVar.y();
                        }
                        xcp xcpVar2 = (xcp) xckVar.b;
                        xcpVar2.g = iA2 - 1;
                        xcpVar2.b |= 4;
                        abxd abxdVarV = xckVar.v();
                        abxdVarV.getClass();
                        xcp xcpVar3 = (xcp) abxdVarV;
                        try {
                            int i2 = xcpVar3.memoizedSerializedSize;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(xcpVar3.getClass()).a(xcpVar3);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i2 & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(xcpVar3.getClass()).a(xcpVar3);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    xcpVar3.memoizedSerializedSize = (Integer.MIN_VALUE & xcpVar3.memoizedSerializedSize) | iA;
                                }
                            }
                            abvo abvoVar = abvo.b;
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(xcpVar3.getClass()).m(xcpVar3, abwa.a(abvwVar));
                            fbxVar.a(abvk.a(abvwVar, bArr));
                        } catch (IOException e2) {
                            throw new RuntimeException(a.A(xcpVar3, "ByteString"), e2);
                        }
                    }
                } else {
                    ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "notifyLauncherxModeChanged", 766, "AppContextManagerImpl.kt")).v("Got unexpected account mode code from LauncherX: %d", i);
                }
            }
            int columnIndex = cursorF.getColumnIndex("accountName");
            if (columnIndex < 0) {
                ((zdv) a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 640, "AppContextManagerImpl.kt")).u("Cursor has no account name column.");
                return null;
            }
            String string = cursorF.getString(columnIndex);
            int columnIndex2 = cursorF.getColumnIndex("profileLock");
            fwx fwxVarB = fwx.b(columnIndex2 < 0 ? 0 : cursorF.getInt(columnIndex2));
            if (fwxVarB == null) {
                fwxVarB = fwx.PROFILE_LOCK_UNSPECIFIED;
            }
            fwx fwxVar = fwxVarB;
            if (!((Boolean) this.s.a()).booleanValue()) {
                string.getClass();
                return new fcb(cursorF, i, string, fwxVar, null);
            }
            int columnIndex3 = cursorF.getColumnIndex("networkState");
            fws fwsVarB = fws.b(columnIndex3 >= 0 ? cursorF.getInt(columnIndex3) : 0);
            if (fwsVarB == null) {
                fwsVarB = fws.NETWORK_STATE_UNSPECIFIED;
            }
            string.getClass();
            return new fcb(cursorF, i, string, fwxVar, fwsVarB);
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncAccountFromLauncherxInternal", 611, "AppContextManagerImpl.kt")).u("LauncherX mode content provider not available.");
        Cursor cursorQuery = this.j.query(g, new String[]{"enabled"}, "enabled = ?", new String[]{"1"}, null);
        try {
            if (cursorQuery == null) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryOldContentProviderForAppsOnlyModeInfo", 731, "AppContextManagerImpl.kt")).u("Apps only content provider not available.");
            } else {
                int columnIndex4 = cursorQuery.getColumnIndex("enabled");
                if (columnIndex4 < 0) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryOldContentProviderForAppsOnlyModeInfo", 736, "AppContextManagerImpl.kt")).u("Enabled column does not exist.");
                    aguc.a(cursorQuery, null);
                } else if (cursorQuery.moveToNext()) {
                    synchronized (this.t) {
                        if (agvy.c(cursorQuery.getString(columnIndex4), "1")) {
                            this.G = 2;
                        }
                    }
                    aguc.a(cursorQuery, null);
                } else {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "queryOldContentProviderForAppsOnlyModeInfo", 740, "AppContextManagerImpl.kt")).u("Cursor has no rows.");
                    aguc.a(cursorQuery, null);
                }
            }
            return null;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        if (r3.b(r2, r1, r6) != r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a1, code lost:
    
        if (r3.b(r2, r1, r6) != r8) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(android.database.Cursor r17, int r18, java.lang.String r19, defpackage.fwx r20, defpackage.fws r21, defpackage.agsw r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcd.A(android.database.Cursor, int, java.lang.String, fwx, fws, agsw):java.lang.Object");
    }

    public final List B() {
        List list;
        synchronized (this.t) {
            list = this.u;
        }
        return list;
    }

    public final void C(boolean z) {
        synchronized (this.t) {
            this.w = z;
        }
    }

    public final boolean D() {
        boolean z;
        synchronized (this.t) {
            z = this.w;
        }
        return z;
    }

    @Override // defpackage.fby
    public final fch a() {
        fch fchVar;
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 498, "AppContextManagerImpl.kt")).u("Querying LauncherX for kid account auth token.");
        if (!((Boolean) this.k.a()).booleanValue()) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 500, "AppContextManagerImpl.kt")).u("Assistant for Kids Mode is not enabled.");
            return null;
        }
        Cursor cursorF = F();
        try {
            if (cursorF == null) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 537, "AppContextManagerImpl.kt")).u("LauncherX mode content provider not available.");
                fchVar = null;
            } else {
                if (!cursorF.moveToNext()) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 507, "AppContextManagerImpl.kt")).u("Cursor has no rows.");
                    aguc.a(cursorF, null);
                    return null;
                }
                if (cursorF.getColumnCount() < 6) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 513, "AppContextManagerImpl.kt")).x("Cursor has only %s columns, not enough for Kids account info.", new qsg(cursorF.getColumnCount()));
                    aguc.a(cursorF, null);
                    return null;
                }
                if (cursorF.getInt(0) != 3) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "getKidGaiaIdAndAuthTokenFromLauncherx", 521, "AppContextManagerImpl.kt")).u("Not a kid account.");
                    aguc.a(cursorF, null);
                    return null;
                }
                cursorF.getString(1);
                String string = cursorF.getString(3);
                String string2 = cursorF.getString(4);
                string2.getClass();
                string.getClass();
                fchVar = new fch(string2, string);
            }
            aguc.a(cursorF, null);
            return fchVar;
        } finally {
        }
    }

    @Override // defpackage.fby
    public final zyd b() {
        zyu zyuVar = new zyu();
        Object obj = this.t;
        synchronized (obj) {
            if (D()) {
                B().add(zyuVar);
            } else {
                synchronized (obj) {
                    zyuVar.p(this.v);
                }
            }
        }
        return zyuVar;
    }

    @Override // defpackage.fby
    public final Instant c() {
        return this.E;
    }

    @Override // defpackage.fby
    public final Object d(agsw agswVar) {
        Object objA;
        Object objA2;
        if (((Boolean) this.s.a()).booleanValue()) {
            fcb fcbVarG = G();
            if (fcbVarG != null && (objA2 = A(fcbVarG.a, fcbVarG.b, fcbVarG.c, fcbVarG.d, fcbVarG.e, agswVar)) == agtg.a) {
                return objA2;
            }
        } else {
            fcb fcbVarG2 = G();
            if (fcbVarG2 != null && (objA = A(fcbVarG2.a, fcbVarG2.b, fcbVarG2.c, fcbVarG2.d, null, agswVar)) == agtg.a) {
                return objA;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.fby
    public final String e() {
        return this.d;
    }

    @Override // defpackage.fby
    public final void f() {
        this.B = new byte[0];
    }

    @Override // defpackage.fby
    public final void g(fbx fbxVar) {
        this.D.remove(fbxVar);
    }

    @Override // defpackage.fby
    public final void h(int i, String str) {
        str.getClass();
        this.r.k(i, str);
        if (i == 1) {
            this.x.removeCallbacks(this.y);
            this.n.c(rpm.ec(), abqb.OK, null, null);
            this.c.r(gmc.j, rbl.SUCCESS);
        } else if (i == 2) {
            this.x.removeCallbacks(this.y);
            this.n.c(rpm.ec(), abqb.UNKNOWN, null, null);
            this.c.r(gmc.j, rbl.ERROR);
        }
        fcg fcgVar = this.A;
        if (fcgVar != null) {
            lyp lypVar = (lyp) fcgVar;
            jhs jhsVar = lypVar.n;
            if (jhsVar.u(str)) {
                if (i != 1) {
                    if (i == 2) {
                        ((zdv) lyp.a.d().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onInAppInteractionEvent", 483, "KatnissVoiceInteractionServicePeer.kt")).v("Unprocessed in-app interaction event type %s.", i);
                    } else if (i == 3 || i == 4) {
                        lypVar.x.v();
                    } else {
                        ((zdv) lyp.a.d().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onInAppInteractionEvent", 489, "KatnissVoiceInteractionServicePeer.kt")).v("Unrecognized in-app interaction event type %s", i);
                    }
                } else if (jhsVar.r() && !jhsVar.p()) {
                    lypVar.d.i = true;
                    lzb.b = true;
                    lzb lzbVar = lypVar.x;
                    lzbVar.B(lypVar.o.a);
                    lzbVar.k();
                    lzbVar.j(Message.obtain((Handler) null, 26));
                }
                jhsVar.x(i);
            }
        }
    }

    @Override // defpackage.fby
    public final void i(String str, String str2) {
        gro groVar = this.F;
        if (groVar != null) {
            groVar.a.removeCallbacks(groVar.b);
            groVar.c.d.z(null);
            if (agvy.c(str, groVar.d)) {
                groVar.e.b(grt.a.a(str2));
            }
        }
        fiw fiwVar = this.i;
        vqi.c(ahkr.c(fiwVar.a, 0, new fiv(fiwVar, str, str2, null), 3), "Failed to set InAppQueryRoutingToken.", new Object[0]);
    }

    @Override // defpackage.fby
    public final void j(byte[] bArr) {
        bArr.getClass();
        fce fceVar = this.C;
        if (fceVar != null) {
            fceVar.d(bArr);
        } else {
            this.B = bArr;
        }
    }

    @Override // defpackage.fby
    public final void k() throws RemoteException {
        fce fceVar = this.C;
        if (fceVar == null || ((fbv) fceVar).w == null) {
            return;
        }
        Bundle bundle = new Bundle();
        abau abauVar = new abau();
        abauVar.k("what", new abax((Object) 6));
        abap abapVar = new abap();
        StringWriter stringWriter = new StringWriter();
        try {
            abdz abdzVar = new abdz(stringWriter);
            abdzVar.c(abapVar.e);
            abdzVar.c = true;
            abdzVar.f = 2;
            abdzVar.e = false;
            abapVar.a(abauVar, abdzVar);
            String string = stringWriter.toString();
            string.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = string.getBytes(charset);
            bytes.getClass();
            bundle.putByteArray("data_as_bytes", bytes);
            Message messageObtain = Message.obtain(null, 6, bundle);
            try {
                Messenger messenger = ((fbv) fceVar).w;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
            } catch (RemoteException e2) {
                ((zdv) ((zdv) fbv.a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "notifyUiClosedToBoundForegroundApp", 652, "AppAssistantIntegrationServicePeer.kt")).u("Exception on sending UI_CLOSED message to bound foreground app.");
            }
        } catch (IOException e3) {
            throw new abas(e3);
        }
    }

    @Override // defpackage.fby
    public final void l(fbx fbxVar) {
        this.D.add(fbxVar);
    }

    @Override // defpackage.fby
    public final void m(abvo abvoVar) throws abxv {
        xcp xcpVar;
        int i;
        this.x.removeCallbacks(this.z);
        Object obj = this.t;
        synchronized (obj) {
            if (!D()) {
                synchronized (obj) {
                    if (abvoVar != null) {
                        try {
                            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                            abza abzaVar = abza.a;
                            ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                            xcp xcpVar2 = xcp.a;
                            abvt abvtVarK = abvoVar.k();
                            xcpVar = new xcp();
                            try {
                                abzj abzjVarA = abza.a.a(xcpVar.getClass());
                                abzjVarA.i(xcpVar, abvu.p(abvtVarK), extensionRegistryLite2);
                                abzjVarA.g(xcpVar);
                                try {
                                    abvtVarK.z(0);
                                    i = 1;
                                    Byte b2 = (byte) 1;
                                    b2.getClass();
                                } catch (abxv e2) {
                                    throw e2;
                                }
                            } catch (abxv e3) {
                                if (!e3.a) {
                                    throw e3;
                                }
                                throw new abxv(e3);
                            } catch (abzz e4) {
                                throw e4.a();
                            } catch (IOException e5) {
                                if (!(e5.getCause() instanceof abxv)) {
                                    throw new abxv(e5);
                                }
                                throw ((abxv) e5.getCause());
                            } catch (RuntimeException e6) {
                                if (!(e6.getCause() instanceof abxv)) {
                                    throw e6;
                                }
                                throw ((abxv) e6.getCause());
                            }
                        } catch (abxv unused) {
                        }
                        if ((xcpVar.b & 1) != 0) {
                            int i2 = xcpVar.e;
                            int iA = xco.a(i2);
                            if (iA != 0 && iA == 1001) {
                                i = 4;
                            } else {
                                int iA2 = xco.a(i2);
                                if (iA2 != 0 && iA2 == 2001) {
                                    i = 2;
                                }
                            }
                            this.G = i;
                        }
                    }
                }
            }
            C(false);
            B().isEmpty();
            Iterator it = B().iterator();
            while (it.hasNext()) {
                ((zyu) it.next()).p(abvoVar);
            }
            B().clear();
            this.v = abvoVar;
        }
    }

    @Override // defpackage.fby
    public final void n(String str) {
        this.d = str;
        Instant instantA = this.q.a();
        instantA.getClass();
        this.E = instantA;
    }

    @Override // defpackage.fby
    public final void o(fce fceVar) {
        this.C = fceVar;
    }

    @Override // defpackage.fby
    public final void p(fcg fcgVar) {
        this.A = fcgVar;
    }

    @Override // defpackage.fby
    public final void q() {
        this.n.b(rpm.ar(), null, null);
        this.c.l(gmc.j);
        feq.e(this.x, f, this.y);
    }

    @Override // defpackage.fby
    public final void r() {
        synchronized (this.t) {
            m(null);
            fce fceVar = this.C;
            if (fceVar == null || ((fbv) fceVar).w == null) {
                C(false);
            } else {
                Message messageA = gzr.a(3);
                try {
                    Messenger messenger = ((fbv) fceVar).w;
                    if (messenger != null) {
                        messenger.send(messageA);
                    }
                    C(true);
                    Handler handler = this.x;
                    Runnable runnable = this.z;
                    handler.removeCallbacks(runnable);
                    feq.e(handler, e, runnable);
                } catch (RemoteException unused) {
                    ((zdv) fbv.a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "requestAppContextFromBoundApp", 623, "AppAssistantIntegrationServicePeer.kt")).u("Exception on requesting app context from bound app. The messenger is likely dead.");
                }
            }
        }
    }

    @Override // defpackage.fby
    public final void s() {
        Set set;
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncKidsAppAccessListFromLauncherx", 407, "AppContextManagerImpl.kt")).u("Querying LauncherX for kids app access list.");
        if (!((Boolean) this.k.a()).booleanValue()) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncKidsAppAccessListFromLauncherx", 409, "AppContextManagerImpl.kt")).u("Assistant for Kids Mode is not enabled.");
            return;
        }
        Cursor cursorE = E();
        try {
            if (cursorE == null) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncKidsAppAccessListFromLauncherx", 441, "AppContextManagerImpl.kt")).u("LauncherX app access content provider not available.");
            } else {
                if (cursorE.getColumnCount() < 2) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncKidsAppAccessListFromLauncherx", 418, "AppContextManagerImpl.kt")).x("Cursor has only %s columns, not enough for kids app access list.", new qsg(cursorE.getColumnCount()));
                    aguc.a(cursorE, null);
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (cursorE.moveToNext()) {
                    String string = cursorE.getString(0);
                    String string2 = cursorE.getString(1);
                    if (string != null && string2 != null) {
                        Map.EL.putIfAbsent(linkedHashMap, string, new HashSet());
                        if (string2.length() > 0 && (set = (Set) linkedHashMap.get(string)) != null) {
                            set.add(string2);
                        }
                    }
                }
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppContextManagerImpl", "syncKidsAppAccessListFromLauncherx", 438, "AppContextManagerImpl.kt")).u("Synced Kids App Access List and update the cache in Search Process.");
                lzb lzbVar = this.p;
                lzbVar.k();
                Message messageObtain = Message.obtain((Handler) null, 40);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("kids_mode_account_list", new ArrayList<>(linkedHashMap.keySet()));
                for (String str : linkedHashMap.keySet()) {
                    String strConcat = "parent_allowed_kids_mode_packages:".concat(String.valueOf(str));
                    Set set2 = (Set) linkedHashMap.get(str);
                    set2.getClass();
                    bundle.putStringArrayList(strConcat, new ArrayList<>(set2));
                }
                messageObtain.setData(bundle);
                lzbVar.j(messageObtain);
            }
            aguc.a(cursorE, null);
        } finally {
        }
    }

    @Override // defpackage.fby
    public final boolean t() {
        boolean z;
        synchronized (this.t) {
            z = false;
            if (this.l == gph.a) {
                if (this.G == 3) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.fby
    public final boolean u() {
        boolean z;
        synchronized (this.t) {
            z = false;
            if (this.l == gph.a) {
                if (this.G == 4) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.fby
    public final boolean v() {
        boolean z;
        synchronized (this.t) {
            z = false;
            if (this.l == gph.a) {
                if (this.G == 2) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.fby
    public final boolean w() {
        return E() != null;
    }

    @Override // defpackage.fby
    public final boolean x() {
        return F() != null;
    }

    @Override // defpackage.fby
    public final byte[] y() {
        return this.B;
    }

    @Override // defpackage.fby
    public final void z(gro groVar) {
        this.F = groVar;
    }
}
