package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.videos.R;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mje implements mjh, mjx {
    private uka D;
    private final jzs E;
    private final kdh F;
    public final lie a;
    public final ksy b;
    public final String c;
    public final String d;
    public final boolean e;
    public final mjw f;
    public final llw g;
    public final mjg h;
    public boolean j;
    public mji l;
    public int m;
    private final Context n;
    private final Resources o;
    private final ieg p;
    private final lnu q;
    private final kwx r;
    private final lld s;
    private final String t;
    private final Uri u;
    private final Uri v;
    private kwx z;
    private final lgx B = new lgx(this, 8);
    private final lgx C = new lgx(this, 9);
    public int i = 1;
    private int w = 0;
    public int k = -1;
    private int x = 0;
    private int y = 0;
    private List A = Collections.EMPTY_LIST;

    public mje(Context context, SharedPreferences sharedPreferences, lie lieVar, lld lldVar, mjg mjgVar, llw llwVar, ksy ksyVar, String str, String str2, boolean z, String str3, ieg iegVar, mjw mjwVar, lnu lnuVar, Resources resources, Uri uri) {
        boolean z2 = true;
        this.h = mjgVar;
        this.p = iegVar;
        this.f = mjwVar;
        this.q = lnuVar;
        this.n = context;
        this.g = llwVar;
        this.b = ksyVar;
        this.a = lieVar;
        this.o = resources;
        this.v = uri;
        a.ah(str2 != null || str == null, "ShowId cannot be null when seasonId is not null");
        if (!z && !iegVar.m()) {
            z2 = false;
        }
        a.ah(z2, "userAuth cannot be null when not playing trailers");
        this.c = str;
        this.d = str2;
        this.e = z;
        this.s = lldVar;
        this.r = kwx.createDisableTrack(resources.getString(R.string.turn_off_subtitles));
        this.t = kdw.v(resources, sharedPreferences).equals(resources.getString(R.string.audio_original)) ? "$ORIGINAL" : Locale.getDefault().getLanguage();
        jzs jzsVar = new jzs(iegVar, ksyVar.b, str2, sharedPreferences);
        this.E = jzsVar;
        this.F = new kdh(jzsVar);
        this.u = gag.o(ksyVar, str, iegVar, str2, str3);
        mjwVar.i(this);
    }

    private final void A() {
        this.z = y();
        List listH = this.f.h();
        kwx kwxVar = this.r;
        kwx kwxVar2 = this.z;
        List<kwx> listU = krh.u(listH, kwxVar);
        Object obj = this.h;
        ((mrn) obj).c.onPlayerSubtitleTracks(listU, kwxVar2);
        by activity = ((bv) obj).getActivity();
        if (ksk.o(activity)) {
            activity.invalidateOptionsMenu();
        }
    }

    private final void B() {
        uka ukaVar = this.D;
        if (ukaVar != null) {
            ukaVar.b();
            this.D = null;
        }
    }

    private final void C() throws JSONException {
        B();
        D(2);
        m(this.f.d());
    }

    private final void D(int i) {
        krd.e("Transitioning from state '" + z(this.x) + "' to '" + z(i) + "'");
        this.x = i;
    }

    private final void E() {
        jwq.U(this.n, this.o.getString(R.string.error_remote_generic, this.f.f()), 0);
    }

    private final void F(mjy mjyVar) {
        krf.b();
        mjw mjwVar = this.f;
        int i = mjyVar.b;
        ieg iegVarB = mjwVar.b();
        iegVarB.m();
        if (iegVarB.k() && i == 4) {
            iegVarB = ieg.f(new llt(-1, -1, null, false, false, trk.a));
            i = 4;
        }
        int i2 = true != iegVarB.m() ? i : 4;
        if (this.y != i2) {
            this.y = i2;
            h(i2, (llt) iegVarB.c);
        }
        if (i2 == 1 || i2 == 2) {
            int i3 = mjwVar.c;
            if (i3 == -1003 || i3 == -1002) {
                mjwVar.j();
            } else if (i3 != 0) {
                krd.f("Preparing RemoteControl for fling while in error state: ".concat(String.valueOf(mjwVar.e())));
            }
        }
        f();
        if (a.Q(y(), this.z)) {
            return;
        }
        A();
    }

    private final void G(List list) {
        mji mjiVar = this.l;
        boolean z = false;
        if (mjiVar != null && mjiVar.e) {
            z = true;
        }
        this.f.v(this.F.l(list, z, this.g));
        A();
    }

    private final void H() {
        int i = this.x;
        if (i != 2) {
            if (i == 1) {
                F(new mjy(this.b.b, 1, 0, null));
            }
        } else {
            mjy mjyVarC = this.f.c();
            if (mjyVarC != null) {
                F(mjyVarC);
            }
        }
    }

    private final kwx y() {
        mjy mjyVarC = this.f.c();
        if (mjyVarC != null) {
            return mjyVarC.d;
        }
        return null;
    }

    private static String z(int i) {
        return i != 0 ? i != 1 ? "active" : "waiting_for_fling_ack" : "idle";
    }

    public final int a() {
        mjy mjyVarC;
        if (this.i != 2) {
            return b();
        }
        if (this.x == 1) {
            return this.m;
        }
        mjw mjwVar = this.f;
        if (mjwVar.u() && (mjyVarC = mjwVar.c()) != null) {
            return mjyVarC.c;
        }
        if (this.x == 2) {
            return mjwVar.a();
        }
        return -1;
    }

    public final int b() {
        kuz kuzVar;
        llw llwVar = this.g;
        if (llwVar.j()) {
            return llwVar.k();
        }
        mji mjiVar = this.l;
        if (mjiVar == null || (kuzVar = mjiVar.b) == null) {
            return 0;
        }
        int iA = llx.a(kuzVar, mjiVar.c);
        mji mjiVar2 = this.l;
        if (mjo.i(iA, mjiVar2.a, mjiVar2.d)) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ieg iegVar = (ieg) obj;
        iegVar.o(this.C);
        iegVar.n(this.B);
    }

    @Override // defpackage.mjx
    public final void d(List list, int i) {
        this.A = list;
        ((mrn) this.h).c.onPlayerAudioTracks(list, i);
    }

    @Override // defpackage.mjx
    public final void e() {
        krd.f("Disconnected from remote device. Finishing.");
        this.h.onPlaybackTerminated();
    }

    public final void f() {
        int iA = a();
        mji mjiVar = this.l;
        if (mjiVar != null && mjiVar.a != 0) {
            this.f.c();
            int i = 0 / this.l.a;
        }
        int i2 = this.k;
        if ((i2 == -1 || i2 > iA) && this.w == 2) {
            this.k = iA;
        }
        mrb mrbVar = ((mrn) this.h).c;
        mrbVar.b.c(Integer.valueOf(iA));
        mrbVar.d.c(0);
    }

    @Override // defpackage.mjx
    public final void g(mjy mjyVar) throws JSONException {
        if (mjyVar != null) {
            if (this.x == 2 && mjyVar.b == 0) {
                krd.f("Video stopped abruptly");
                this.h.onPlaybackTerminated();
            } else {
                ksy ksyVar = this.b;
                if (TextUtils.equals(ksyVar.b, mjyVar.a)) {
                    int i = this.x;
                    if (i == 0) {
                        C();
                    } else if (i == 1) {
                        if (mjyVar.b != 5) {
                            krd.e("Fling acknowledged");
                            C();
                        }
                    }
                    if (mjyVar.b == 5) {
                        krd.e("Video finished");
                        this.h.onPlaybackTerminated();
                    }
                }
            }
        }
        H();
    }

    public final void h(int i, llt lltVar) {
        ieg iegVarF;
        this.w = i;
        int iA = a();
        Object obj = this.h;
        mrn mrnVar = (mrn) obj;
        mrnVar.c.onPlayerStateChanged(i, lltVar, iA);
        int i2 = 4;
        if (i == 4) {
            mrnVar.a().d.c(ieg.a(lltVar));
            i = 4;
        } else {
            i2 = i;
        }
        rah rahVar = mrnVar.t;
        rahVar.c = i;
        rahVar.b();
        mtk mtkVar = mrnVar.q;
        if (mtkVar != null) {
            mtkVar.onPlayerStateChanged(i, lltVar, iA);
        }
        by activity = ((bv) obj).getActivity();
        if (ksk.o(activity)) {
            activity.invalidateOptionsMenu();
        }
        lld lldVar = this.s;
        if (i2 == 2 || i2 == 3) {
            iegVarF = ieg.f(ktc.d(ktc.b(this.d == null ? xay.MOVIE : xay.EPISODE), this.b.b));
        } else {
            iegVarF = ieg.a;
        }
        lldVar.c(iegVarF);
        if (lltVar != null) {
            this.q.f();
        }
    }

    @Override // defpackage.mjx
    public final void i() {
        H();
    }

    @Override // defpackage.lwl
    public final int j() {
        int i = this.w;
        if (i == 3 || i == 2) {
            return a();
        }
        return -1;
    }

    @Override // defpackage.mjh
    public final void k(boolean z) {
        if (z) {
            p();
            return;
        }
        lnu lnuVar = this.q;
        if (lnuVar.g()) {
            return;
        }
        lnuVar.f();
    }

    @Override // defpackage.mjx
    public final void l(List list) {
        G(list);
    }

    @Override // defpackage.mjx
    public final void m(mke mkeVar) throws JSONException {
        nwx nwxVarE;
        if (mkeVar == null) {
            if (this.x == 2) {
                krd.f("Video info cleared abruptly");
                this.h.onPlaybackTerminated();
                return;
            }
            return;
        }
        if (!TextUtils.equals(mkeVar.a, this.b.b)) {
            int i = this.x;
            if (i == 2 || i == 1) {
                krd.f("Remote player playing a different video; closing activity.");
                this.h.onPlaybackTerminated();
                return;
            }
            return;
        }
        if (this.x == 0) {
            D(2);
        }
        if (this.x == 2) {
            mkr mkrVar = (mkr) this.f;
            if (mkrVar.I()) {
                mks mksVar = mkrVar.f;
                nwu nwuVar = mkrVar.h;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", "AUDIO_TRACK_LIST_REQUEST");
                    nwxVarE = mksVar.e(nwuVar, jSONObject);
                } catch (JSONException unused) {
                    nwxVarE = null;
                }
                mkrVar.A("listAudioTracks", nwxVarE);
            }
            H();
        }
    }

    @Override // defpackage.loa
    public final void n() {
        this.j = false;
        int i = this.i;
        if (i != 1) {
            if (i != 2) {
                krd.c(a.cf(i, "onPause called in unexpected state "));
                return;
            }
            mjw mjwVar = this.f;
            String str = this.b.b;
            if (mjwVar.w()) {
                return;
            }
            E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Runnable] */
    public final void o() {
        ksy ksyVar = this.b;
        mjw mjwVar = this.f;
        boolean zX = mjwVar.x();
        if (this.x != 0) {
            if (!zX) {
                E();
                return;
            }
            mjy mjyVarC = mjwVar.c();
            if (mjyVarC == null || mjyVarC.b == 5 || !TextUtils.equals(ksyVar.b, mjyVarC.a)) {
                return;
            }
            C();
            G(mjwVar.h());
            v(mjyVarC.d);
            this.A = mjwVar.g();
            return;
        }
        String str = ksyVar.b;
        mji mjiVar = this.l;
        mke mkeVar = new mke(str, mjiVar.f, mjiVar.g, this.v, this.e, mjiVar.a, this.u.toString(), this.t, ksyVar.c);
        TextUtils.isEmpty(this.d);
        ieg iegVar = this.p;
        int i = this.m;
        boolean z = this.l.h != -1;
        String str2 = mkeVar.a;
        mkr mkrVar = (mkr) mjwVar;
        mkrVar.o = str2;
        mkrVar.l = iegVar;
        mkrVar.m = z;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("video_title", mkeVar.b);
            jSONObject2.put("show_title", mkeVar.c);
            jSONObject2.put("video_id", str2);
            jSONObject2.put("is_trailer", mkeVar.e);
            jSONObject2.put("duration", mkeVar.f);
            jSONObject2.put("opaque", mkeVar.g);
            jSONObject2.put("preferred_language", mkeVar.h);
            jSONObject2.put("video_asset_id", mkeVar.i);
            jSONObject2.put("poster_url", ksk.e(mkeVar.d));
            jSONObject.put("video_info", jSONObject2);
        } catch (JSONException e) {
            krd.d("Unexpected JSON exception:", e);
        }
        mkrVar.t = new nzx(mkrVar, mkeVar, i, jSONObject, z);
        int iB = mkrVar.n == 3 ? mkrVar.t.b() : 0;
        krd.e(a.cf(iB, "RemoteControl.fling() returned "));
        if (iB == -1) {
            C();
            G(mjwVar.h());
        } else if (iB == 0) {
            D(1);
            B();
            uka ukaVar = new uka(this);
            this.D = ukaVar;
            ukaVar.b();
            ((Handler) ukaVar.c).postDelayed(ukaVar.a, 20000L);
        }
        H();
    }

    @Override // defpackage.loa
    public final void p() {
        this.j = true;
        if (this.i == 2) {
            o();
        }
    }

    @Override // defpackage.mjh
    public final void q() {
        w(false);
    }

    @Override // defpackage.loc
    public final void r() {
        if (this.i == 2) {
            H();
        }
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) {
        if (this.i != 2) {
            llw llwVar = this.g;
            llwVar.e(i2);
            llwVar.d(-1);
            return;
        }
        this.k = -1;
        if (z) {
            if (this.x == 0) {
                this.m = i2;
                return;
            }
            mjw mjwVar = this.f;
            String str = this.b.b;
            if (mjwVar.y(i2)) {
                return;
            }
            E();
        }
    }

    @Override // defpackage.lod
    public final void u(int i) throws JSONException {
        nwx nwxVarE;
        if (this.i == 2) {
            List list = this.A;
            if (i < 0 || i >= list.size()) {
                return;
            }
            llw llwVar = this.g;
            llwVar.h(((kzo) list.get(i)).c);
            if (i < this.A.size()) {
                mjw mjwVar = this.f;
                kzo kzoVar = (kzo) this.A.get(i);
                mkr mkrVar = (mkr) mjwVar;
                if (mkrVar.I()) {
                    mks mksVar = mkrVar.f;
                    nwu nwuVar = mkrVar.h;
                    String str = (String) mksVar.d.get(kzoVar);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(str);
                        jSONObject.put("type", "AUDIO_TRACK_SELECT_REQUEST").put("selected", jSONArray);
                        nwxVarE = mksVar.e(nwuVar, jSONObject);
                    } catch (JSONException unused) {
                        nwxVarE = null;
                    }
                    mkrVar.A("setAudioTrack", nwxVarE);
                } else {
                    E();
                }
            }
            if (llwVar.i()) {
                q();
                p();
            }
        }
    }

    @Override // defpackage.lod
    public final void v(kwx kwxVar) {
        if (this.i == 2) {
            mji mjiVar = this.l;
            if (mjiVar != null && !mjiVar.e) {
                this.E.o(kwxVar);
            }
            if (!this.f.v(kwxVar)) {
                E();
            }
            this.g.g(kwxVar != null ? kwxVar.languageCode() : null);
            this.E.n(kwxVar);
        }
    }

    @Override // defpackage.mjh
    public final void w(boolean z) {
        this.i = 1;
        if (z) {
            this.g.d(this.k);
        } else {
            this.k = -1;
        }
        h(0, null);
        this.j = false;
        this.l = null;
        D(0);
        B();
        this.f.m(this);
        this.q.a(this.a);
        this.s.c(ieg.a);
    }

    @Override // defpackage.mjx
    public final void x() {
        ieg iegVarB = this.f.b();
        if (iegVarB.m()) {
            this.y = 4;
            h(4, (llt) iegVarB.g());
        }
        B();
    }

    @Override // defpackage.loc
    public final void s(int i) {
    }
}
