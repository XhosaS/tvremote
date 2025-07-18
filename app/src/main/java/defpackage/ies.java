package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.tvsearch.setup.AssistantHotwordSetupActivity;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ies extends iet implements ioy, ezc, ipa {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer");
    private final irh A;
    private final ghr B;
    private final List C;
    private final String D;
    public final AssistantHotwordSetupActivity b;
    public final Supplier c;
    public final Supplier d;
    public final boolean e;
    public final fjr f;
    public final fjx g;
    public final Supplier h;
    public final ffp i;
    public final gtu j;
    public final icx k;
    public final idl l;
    public final idu m;
    public final ffo n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final eyp s;
    public int t;
    public int u;
    private final Supplier w;
    private final ahbt x;
    private final jcy y;
    private final boolean z;

    public ies(Supplier supplier, AssistantHotwordSetupActivity assistantHotwordSetupActivity, eyp eypVar, Supplier supplier2, ahbt ahbtVar, Supplier supplier3, boolean z, fjr fjrVar, fjx fjxVar, Supplier supplier4, jcy jcyVar, ffp ffpVar, gtu gtuVar, boolean z2, icx icxVar, idl idlVar, idu iduVar, irh irhVar, ffo ffoVar, ghr ghrVar) {
        eypVar.getClass();
        ahbtVar.getClass();
        fjrVar.getClass();
        fjxVar.getClass();
        jcyVar.getClass();
        ffpVar.getClass();
        gtuVar.getClass();
        idlVar.getClass();
        iduVar.getClass();
        irhVar.getClass();
        ffoVar.getClass();
        ghrVar.getClass();
        this.w = supplier;
        this.b = assistantHotwordSetupActivity;
        this.s = eypVar;
        this.c = supplier2;
        this.x = ahbtVar;
        this.d = supplier3;
        this.e = z;
        this.f = fjrVar;
        this.g = fjxVar;
        this.h = supplier4;
        this.y = jcyVar;
        this.i = ffpVar;
        this.j = gtuVar;
        this.z = z2;
        this.k = icxVar;
        this.l = idlVar;
        this.m = iduVar;
        this.A = irhVar;
        this.n = ffoVar;
        this.B = ghrVar;
        this.u = 1;
        this.q = true;
        this.C = new ArrayList();
        this.D = "assistantHotwordSetupActivityKey";
    }

    private final void d(boolean z) {
        ahal.e(this.x, null, 0, new ier(this, z, null), 3);
    }

    private final boolean e() {
        if (!this.z || !this.e || !((Boolean) this.h.get()).booleanValue()) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "runOemHotwordSetup", 383, "AssistantHotwordSetupActivityPeer.kt")).u("Not Shield device or system doesn't have hotword feature. Not launching hotword setup.");
            return false;
        }
        try {
            this.b.startActivityForResult(new Intent("com.google.assistant.GOOGLE_HOTWORD_SETUP"), 556);
            return true;
        } catch (ActivityNotFoundException e) {
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "runOemHotwordSetup", 377, "AssistantHotwordSetupActivityPeer.kt")).u("No activity found for hotword setup intent.");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[PHI: r7
  0x0046: PHI (r7v2 int) = (r7v1 int), (r7v0 int), (r7v5 int) binds: [B:20:0x0050, B:10:0x003a, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r23) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ies.a(int):void");
    }

    public final void b(boolean z) {
        int i = this.t;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                if (e()) {
                    return;
                }
                h(ire.b);
                return;
            } else if (i2 != 2) {
                d(false);
                return;
            } else {
                d(true);
                return;
            }
        }
        AssistantHotwordSetupActivity assistantHotwordSetupActivity = this.b;
        iot iotVar = iot.a;
        String strB = iotVar.b(assistantHotwordSetupActivity.getIntent());
        Uri uriA = iotVar.a(assistantHotwordSetupActivity.getIntent());
        iok iokVar = iok.a;
        ioj iojVar = new ioj();
        if (strB != null && strB.length() != 0) {
            if ((iojVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iojVar.y();
            }
            ((iok) iojVar.b).b = strB;
        }
        if (uriA != null) {
            String string = uriA.toString();
            string.getClass();
            if ((iojVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iojVar.y();
            }
            ((iok) iojVar.b).c = string;
        }
        if (!this.m.E() && (this.j.c() != null || !((Boolean) this.w.get()).booleanValue())) {
            z2 = false;
        }
        if ((iojVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iojVar.y();
        }
        ((iok) iojVar.b).d = z2;
        abxd abxdVarV = iojVar.v();
        abxdVarV.getClass();
        ijn ijnVar = new ijn();
        aeik.d(ijnVar);
        wjj.a(ijnVar, (iok) abxdVarV);
        ab abVar = new ab(((bw) assistantHotwordSetupActivity).a.a.e);
        if (z) {
            abVar.r(R.animator.setup_open_enter, R.animator.setup_open_exit, 0, 0);
        } else {
            abVar.r(R.animator.setup_close_enter, R.animator.setup_close_exit, 0, 0);
        }
        abVar.q(R.id.assistant_container, ijnVar, "AstHotwordSetupActivity");
        if (assistantHotwordSetupActivity.isFinishing()) {
            return;
        }
        abVar.i();
    }

    @Override // defpackage.ezc
    public final String c() {
        return this.D;
    }

    @Override // defpackage.ipa
    public final void f(adzd adzdVar) {
        adzdVar.getClass();
    }

    @Override // defpackage.ipa
    public final void g(ycm ycmVar) {
        ycmVar.getClass();
        this.C.add(ycmVar);
    }

    @Override // defpackage.ioy
    public final void h(ire ireVar) {
        ireVar.getClass();
        int i = this.t;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        int i3 = 3;
        if (i2 == 0) {
            int iOrdinal = ireVar.ordinal();
            if (iOrdinal == 1) {
                this.t = 2;
            } else if (iOrdinal == 2) {
                this.t = 4;
            } else if (iOrdinal == 3) {
                a(4);
                return;
            }
        } else if (i2 == 1) {
            int iOrdinal2 = ireVar.ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2 || iOrdinal2 != 3) {
                    i3 = 4;
                } else {
                    if (this.p) {
                        a(4);
                        return;
                    }
                    i3 = 1;
                }
            }
            this.t = i3;
        }
        b(ireVar != ire.d);
    }
}
