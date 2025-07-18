package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkr extends mjw {
    public final mks f;
    public final nma g;
    public final nwu h;
    public final SharedPreferences i;
    public final String j;
    public final fux k;
    public ieg l;
    public boolean m;
    public int n;
    public String o;
    public List p;
    public kwx q;
    public final ldv r;
    public final Executor s;
    public nzx t;
    private final CastDevice u;
    private final mkh v;
    private String w;

    public mkr(Context context, String str, fux fuxVar, mkh mkhVar, idf idfVar, SharedPreferences sharedPreferences, boolean z, ldv ldvVar, Executor executor, Resources resources) {
        super(resources);
        this.l = ieg.a;
        this.k = fuxVar;
        CastDevice castDeviceC = CastDevice.c(fuxVar.q);
        this.u = castDeviceC;
        this.v = mkhVar;
        this.i = sharedPreferences;
        this.j = str;
        this.n = 0;
        this.r = ldvVar;
        this.s = executor;
        mko mkoVar = new mko(this);
        mkp mkpVar = new mkp(this);
        nkh nkhVar = new nkh(castDeviceC, new mkq(this));
        nkhVar.b = z ? 1 : 0;
        nki nkiVar = new nki(nkhVar);
        nwr nwrVar = new nwr(context);
        jzs jzsVar = nkm.a;
        ocv.aG(jzsVar, "Api must not be null");
        nwrVar.c.put(jzsVar, nkiVar);
        Object obj = jzsVar.c;
        ocv.aG(obj, "Base client builder must not be null");
        List listC = ((ocv) obj).c(nkiVar);
        nwrVar.b.addAll(listC);
        nwrVar.a.addAll(listC);
        nwrVar.d.add(mkoVar);
        nwrVar.e.add(mkpVar);
        this.h = nwrVar.a();
        this.f = new mkn(this, z, idfVar, executor);
        nma nmaVar = new nma();
        this.g = nmaVar;
        byte[] bArr = null;
        nmaVar.e = new pku(this, bArr);
        nmaVar.d = new pku(this, bArr);
    }

    private final void K() {
        nwu nwuVar = this.h;
        if (nwuVar.g()) {
            try {
                jzs jzsVar = nkm.a;
                jys.O(nwuVar, "urn:x-cast:com.google.play.movies");
                jys.O(nwuVar, this.g.b());
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[PHI: r1
  0x002c: PHI (r1v8 int) = (r1v7 int), (r1v9 int), (r1v10 int) binds: [B:11:0x001f, B:13:0x0022, B:16:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(java.lang.String r8, defpackage.kwx r9, int r10) {
        /*
            r7 = this;
            mjy r0 = new mjy
            r1 = -1
            r2 = 0
            r0.<init>(r2, r1, r1, r2)
            nma r1 = r7.g
            java.lang.Object r3 = r1.a
            int r4 = r7.a()
            monitor-enter(r3)
            nsk r1 = r1.b     // Catch: java.lang.Throwable -> L4c
            long r5 = r1.i()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            int r1 = (int) r5
            r3 = 5
            if (r10 == 0) goto L2e
            r5 = 1
            if (r10 == r5) goto L2e
            r1 = 2
            if (r10 == r1) goto L2c
            r1 = 3
            if (r10 == r1) goto L2c
            r1 = 4
            if (r10 == r1) goto L2a
            if (r10 == r3) goto L2a
            goto L2c
        L2a:
            r3 = r5
            goto L40
        L2c:
            r3 = r1
            goto L40
        L2e:
            mke r10 = r7.d()
            if (r10 == 0) goto L36
            int r1 = r10.f
        L36:
            r10 = 0
            boolean r1 = defpackage.mjo.i(r4, r1, r10)
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            r3 = r10
            r8 = r2
        L40:
            r0.b = r3
            r0.a = r8
            r0.c = r4
            r0.d = r9
            r7.q(r0)
            return
        L4c:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkr.L(java.lang.String, kwx, int):void");
    }

    public static String z(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Disconnected" : "Disconnecting" : "Connected" : "WaitingForStatus" : "Connecting" : "Constructed";
    }

    public final void A(final String str, nwx nwxVar) {
        nwxVar.i(new nxd() { // from class: mkl
            @Override // defpackage.nxd
            public final void a(nxc nxcVar) {
                if (nxcVar.e().b()) {
                    return;
                }
                this.a.D(str, nxcVar.e());
            }
        });
    }

    public final void B() {
        this.i.edit().remove(krh.CAST_V2_ROUTE_ID).remove(krh.CAST_V2_SESSION_ID).apply();
        krd.b("sessionRestore removed data: ");
    }

    public final void C(boolean z) {
        if (H()) {
            return;
        }
        F(4);
        krd.e("Disconnecting stopRemoteApplication = ".concat(true != z ? "false" : "true"));
        this.t = null;
        nwu nwuVar = this.h;
        if (nwuVar.g()) {
            if (z) {
                jzs jzsVar = nkm.a;
                nwuVar.b(new nkg(nwuVar)).i(new mkk(this, 2));
                K();
            } else {
                jzs jzsVar2 = nkm.a;
                nwuVar.b(new nkf(nwuVar));
                K();
                if (nwuVar.g()) {
                    nwuVar.e();
                }
            }
        }
        if (this.n != 4) {
            krd.c("NO direct call to onDisconnected, call disconnect() instead");
        }
        a.H(this.n == 4);
        F(5);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                q(null);
                r(Collections.EMPTY_LIST);
                s(null);
                return;
            }
            ((mjx) arrayList.get(size)).e();
        }
    }

    public final void D(String str, Status status) {
        krd.f("Command: " + str + " status " + String.valueOf(status) + " while in state: " + z(this.n));
    }

    public final void E(String str) {
        int i = this.n;
        if (i != 1) {
            krd.b("onConnected not in connecting state: ".concat(z(i)));
            return;
        }
        try {
            jzs jzsVar = nkm.a;
            nwu nwuVar = this.h;
            nma nmaVar = this.g;
            jys.P(nwuVar, nmaVar.b(), nmaVar);
            jys.P(nwuVar, "urn:x-cast:com.google.play.movies", this.f);
            F(2);
            fux fuxVar = this.k;
            StringBuilder sb = new StringBuilder("sessionRestore saved data: ");
            String str2 = fuxVar.d;
            sb.append(str2);
            sb.append(":");
            sb.append(str);
            krd.b(sb.toString());
            this.i.edit().putString(krh.CAST_V2_ROUTE_ID, str2).putString(krh.CAST_V2_SESSION_ID, str).apply();
            o();
            mkh mkhVar = this.v;
            krf.b();
            mks mksVar = this.f;
            nwu nwuVar2 = this.h;
            JSONObject jSONObject = new JSONObject();
            String str3 = ((mkj) mkhVar).a;
            try {
                jSONObject.put("type", "HELLO");
                jSONObject.put("device_name", str3);
            } catch (JSONException unused) {
            }
            A("sendUserDisplayName", mksVar.e(nwuVar2, jSONObject));
            nma nmaVar2 = this.g;
            nwu nwuVar3 = this.h;
            A("requestStatus", nwuVar3.b(new nlt(nmaVar2, nwuVar3)));
        } catch (IOException e) {
            int i2 = this.n;
            if (i2 == 4 || i2 == 5) {
                krd.f("onConnectionError(-1000) called while in state ".concat(z(i2)));
            } else {
                l(-1000, false);
            }
            krd.d("Exception while registering callbacks", e);
        }
    }

    public final void F(int i) {
        int i2 = this.n;
        if (i == i2) {
            return;
        }
        krd.e(z(i2) + " -> " + z(i));
        this.n = i;
    }

    public final void G() {
        MediaInfo mediaInfoJ;
        nwx nwxVarE;
        mke mkeVar;
        if (H()) {
            return;
        }
        nma nmaVar = this.g;
        synchronized (nmaVar.a) {
            mediaInfoJ = nmaVar.b.j();
        }
        kwx kwxVar = null;
        if (mediaInfoJ != null) {
            JSONObject jSONObject = mediaInfoJ.o;
            if (jSONObject == null) {
                mkeVar = null;
                s(mkeVar);
            } else {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("video_info");
                    mkeVar = new mke(jSONObject2.getString("video_id"), jSONObject2.getString("video_title"), jSONObject2.optString("show_title"), ksk.a(jSONObject2.getString("poster_url")), jSONObject2.optBoolean("is_trailer", false), jSONObject2.getInt("duration"), jSONObject2.getString("opaque"), jSONObject2.getString("preferred_language"), jSONObject2.getString("video_asset_id"));
                } catch (JSONException unused) {
                }
                s(mkeVar);
            }
        } else {
            s(null);
        }
        nln nlnVarA = this.g.a();
        if (nlnVarA == null) {
            L(null, null, 0);
            return;
        }
        mke mkeVarD = d();
        String str = mkeVarD != null ? mkeVarD.a : null;
        if (str == null) {
            r(Collections.EMPTY_LIST);
        } else {
            if (!str.equals(this.w)) {
                this.w = str;
                this.p = null;
                this.q = null;
                mks mksVar = this.f;
                nwu nwuVar = this.h;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("type", "TT_TRACK_LIST_REQUEST");
                    nwxVarE = mksVar.e(nwuVar, jSONObject3);
                } catch (JSONException unused2) {
                    nwxVarE = null;
                }
                A("listSubtitles", nwxVarE);
            }
            List list = this.p;
            if (list == null || list.isEmpty()) {
                r(Collections.EMPTY_LIST);
            } else {
                List listH = h();
                List list2 = this.p;
                if (listH != list2) {
                    r(list2);
                }
                kwxVar = this.q;
            }
        }
        L(str, kwxVar, nlnVarA.e);
    }

    public final boolean H() {
        int i = this.n;
        return i == 4 || i == 5;
    }

    public final boolean I() {
        int i = this.n;
        if (i != 3) {
            krd.f("not safe to call while in state: ".concat(z(i)));
            return false;
        }
        if (this.h.g()) {
            return this.g.a() != null;
        }
        krd.f("GoogleApiClient is not connected, reconnecting should be in progress");
        return false;
    }

    @Override // defpackage.mjw
    public final int a() {
        long jG;
        nma nmaVar = this.g;
        synchronized (nmaVar.a) {
            jG = nmaVar.b.g();
        }
        int i = (int) jG;
        if (i != 0) {
            return i;
        }
        mjy mjyVarC = c();
        if (mjyVarC != null) {
            return mjyVarC.c;
        }
        return 0;
    }

    @Override // defpackage.mjw
    public final String f() {
        CastDevice castDevice = this.u;
        if (castDevice != null) {
            return castDevice.d;
        }
        return null;
    }

    @Override // defpackage.mjw
    public final void n() {
        C(true);
    }

    @Override // defpackage.mjw
    public final boolean v(kwx kwxVar) throws JSONException {
        nwx nwxVarE;
        if (!I()) {
            return false;
        }
        mks mksVar = this.f;
        nwu nwuVar = this.h;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (kwxVar != null) {
                jSONArray.put(kwxVar.url());
            }
            jSONObject.put("type", "TT_TRACK_SELECT_REQUEST").put("selected", jSONArray);
            nwxVarE = mksVar.e(nwuVar, jSONObject);
        } catch (JSONException unused) {
            nwxVarE = null;
        }
        A("setSubtitles", nwxVarE);
        return true;
    }

    @Override // defpackage.mjw
    public final boolean w() {
        if (!I()) {
            return false;
        }
        nma nmaVar = this.g;
        nwu nwuVar = this.h;
        A("pause", nwuVar.b(new nlq(nmaVar, nwuVar)));
        return true;
    }

    @Override // defpackage.mjw
    public final boolean x() {
        if (!I()) {
            return false;
        }
        nma nmaVar = this.g;
        nwu nwuVar = this.h;
        A("play", nwuVar.b(new nlr(nmaVar, nwuVar)));
        return true;
    }

    @Override // defpackage.mjw
    public final boolean y(int i) {
        int i2 = 0;
        if (!I()) {
            return false;
        }
        if (i < 0) {
            krd.f(a.cd(i, "Tried seeking to ", "ms. Seeking to 0 instead"));
            i = 0;
        }
        nma nmaVar = this.g;
        nwu nwuVar = this.h;
        nwuVar.b(new nls(nmaVar, nwuVar, i)).i(new mkk(this, i2));
        k(i);
        return true;
    }
}
