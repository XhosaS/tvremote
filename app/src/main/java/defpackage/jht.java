package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Bundle;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jht implements jhs {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/ExecutionHelperImpl");
    private final gph b;
    private final gzu c;
    private final gtu d;
    private final goa e;
    private final MediaSessionManager f;
    private final hab g;
    private final PackageManager h;
    private final fex i;
    private hxt j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = true;
    private boolean q = false;
    private String r;
    private List s;
    private Set t;
    private int u;

    public jht(gph gphVar, gzu gzuVar, gtu gtuVar, goa goaVar, MediaSessionManager mediaSessionManager, hab habVar, PackageManager packageManager, fex fexVar) {
        int i = yyk.e;
        this.s = zcg.b;
        this.t = new HashSet();
        this.u = 0;
        this.b = gphVar;
        this.c = gzuVar;
        this.d = gtuVar;
        this.e = goaVar;
        this.f = mediaSessionManager;
        this.g = habVar;
        this.h = packageManager;
        this.i = fexVar;
    }

    private final void y() {
        gph gphVar = this.b;
        if (gphVar == gph.c || gphVar == gph.a) {
            return;
        }
        if (this.j == null) {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/libassistant/ExecutionHelperImpl", "maybePrepareToShowUnfocusableSuggestionsInVoicePlate", 216, "ExecutionHelperImpl.java")).u("maybePrepareToShowUnfocusableSuggestionsInVoicePlate: VoicePlateViewManager is null.");
        } else if (this.k && this.l) {
            lzb.b = false;
            this.j.V();
            this.i.d(false);
        }
    }

    private final boolean z(String str) {
        String str2 = this.c.a;
        if (str == null || !str.equals(str2)) {
            return false;
        }
        PackageManager packageManager = this.h;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ComponentName componentNameResolveActivity = intent.resolveActivity(packageManager);
        return !str.equals(componentNameResolveActivity == null ? null : componentNameResolveActivity.getPackageName());
    }

    @Override // defpackage.jhs
    public final int a() {
        return this.u;
    }

    @Override // defpackage.jhs
    public final List b() {
        return this.s;
    }

    @Override // defpackage.jhs
    public final void c(String str) {
        this.t.add(str);
    }

    @Override // defpackage.jhs
    public final void d() {
        this.q = true;
    }

    @Override // defpackage.jhs
    public final void e() {
        if (this.d.a() != null) {
            goa goaVar = this.e;
            List listA = goaVar.a();
            if (listA.isEmpty() || !z(((goc) listA.get(0)).a)) {
                return;
            }
            ((gob) goaVar).b("pause", new Bundle());
            return;
        }
        MediaSessionManager mediaSessionManager = this.f;
        if (mediaSessionManager.getActiveSessions(null).isEmpty()) {
            return;
        }
        MediaController mediaController = mediaSessionManager.getActiveSessions(null).get(0);
        if (z(mediaController.getPackageName())) {
            mediaController.getTransportControls().pause();
        }
    }

    @Override // defpackage.jhs
    public final void f() {
        this.n = true;
    }

    @Override // defpackage.jhs
    public final void g() {
        this.m = true;
    }

    @Override // defpackage.jhs
    public final void h() {
        this.k = true;
        y();
    }

    @Override // defpackage.jhs
    public final void i() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.i.d(true);
        this.p = true;
        this.q = false;
        this.u = 0;
        this.t = new HashSet();
    }

    @Override // defpackage.jhs
    public final void j(int i) {
        this.u = i;
    }

    @Override // defpackage.jhs
    public final void k(String str) {
        this.r = str;
    }

    @Override // defpackage.jhs
    public final void l(List list) {
        this.s = list;
    }

    @Override // defpackage.jhs
    public final void m(hxt hxtVar) {
        this.j = hxtVar;
    }

    @Override // defpackage.jhs
    public final void n() {
        this.l = true;
        y();
    }

    @Override // defpackage.jhs
    public final void o() {
        this.o = true;
    }

    @Override // defpackage.jhs
    public final boolean p() {
        return this.i.f();
    }

    @Override // defpackage.jhs
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.jhs
    public final boolean r() {
        return this.p;
    }

    @Override // defpackage.jhs
    public final boolean s() {
        return this.k || this.n || this.o || this.m;
    }

    @Override // defpackage.jhs
    public final boolean t() {
        hxt hxtVar = this.j;
        return hxtVar != null && hxtVar.ah();
    }

    @Override // defpackage.jhs
    public final boolean u(String str) {
        return str.equals("null") || str.equals(this.r);
    }

    @Override // defpackage.jhs
    public final boolean v(byte[] bArr) {
        SuggestionChipList suggestionChipListA;
        gph gphVar = this.b;
        if (gphVar == gph.c || gphVar == gph.a) {
            return this.k && this.l;
        }
        if (this.j == null) {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/libassistant/ExecutionHelperImpl", "maybeShowSuggestionsInVoicePlate", 247, "ExecutionHelperImpl.java")).u("maybeShowSuggestionsInVoicePlate: VoicePlateViewManager is null.");
            return this.k && this.l;
        }
        if (!this.k || !this.l) {
            return false;
        }
        xqo xqoVarA = hst.a.a(bArr);
        if (xqoVarA != null) {
            xqoVarA.c.size();
            suggestionChipListA = SuggestionChipList.a.b(xqoVarA, yyk.i(this.g), this.i.b());
        } else {
            suggestionChipListA = SuggestionChipList.a.a(this.i.b());
        }
        this.j.af(suggestionChipListA);
        this.p = false;
        this.j.Z();
        return true;
    }

    @Override // defpackage.jhs
    public final boolean w(byte[] bArr) throws abxv {
        String str;
        hxt hxtVar = this.j;
        if (hxtVar == null) {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/libassistant/ExecutionHelperImpl", "maybeShowTextInVoicePlate", 293, "ExecutionHelperImpl.java")).u("maybeShowTextInVoicePlate: VoicePlateViewManager is null.");
            return false;
        }
        if (!s()) {
            return false;
        }
        try {
            abxd abxdVarH = abxd.h(xqu.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            str = ((xqu) abxdVarH).c;
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/voice/libassistant/ExecutionHelperImpl", "getTextFromClientOpArgs", 338, "ExecutionHelperImpl.java")).x("Invalid ShowTextArgs, cannot parse. clientOpArgs: %s", abvo.u(bArr, 0, bArr.length));
            str = "";
        }
        hxtVar.W(str);
        return true;
    }

    @Override // defpackage.jhs
    public final void x(int i) {
        hxt hxtVar = this.j;
        if (hxtVar != null) {
            hxtVar.al(i);
        }
    }
}
