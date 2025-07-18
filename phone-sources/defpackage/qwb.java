package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwb {
    private static final String e = "qwb";
    public final qwn a;
    public final SelectedAccountDisc b;
    public final rdd d = new qwa(this);
    public final qtq c = new rgg(this, 1);

    public qwb(SelectedAccountDisc selectedAccountDisc, qwn qwnVar) {
        this.a = qwnVar;
        this.b = selectedAccountDisc;
        qwg qwgVar = new qwg(qwnVar, selectedAccountDisc);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add((ImmutableList.Builder) qwgVar);
        tst tstVar = qwnVar.e.b;
        selectedAccountDisc.d = new jcd(builder.build(), 6);
    }

    public final void a(Object obj) {
        vtw vtwVarM = wds.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wds wdsVar = (wds) vucVar;
        wdsVar.d = 8;
        wdsVar.b |= 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wds wdsVar2 = (wds) vucVar2;
        wdsVar2.f = 8;
        wdsVar2.b |= 32;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wds wdsVar3 = (wds) vucVar3;
        wdsVar3.e = 3;
        wdsVar3.b = 8 | wdsVar3.b;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        qwn qwnVar = this.a;
        wds wdsVar4 = (wds) vtwVarM.b;
        wdsVar4.c = 36;
        wdsVar4.b |= 1;
        qwnVar.g.a(obj, (wds) vtwVarM.r());
    }

    public final void b() {
        String string;
        Object obj;
        qwn qwnVar = this.a;
        qwo qwoVar = qwnVar.b;
        if (!qwoVar.b()) {
            rrx.ac(new pqi(this, 16));
            return;
        }
        SelectedAccountDisc selectedAccountDisc = this.b;
        Context context = selectedAccountDisc.getContext();
        tst tstVar = qwnVar.i;
        if (qwoVar.e().isEmpty()) {
            string = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
        } else {
            Object objA = qwoVar.a();
            if (objA == null) {
                string = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
            } else {
                AccountParticleDisc accountParticleDisc = selectedAccountDisc.b;
                Object obj2 = accountParticleDisc.j;
                String strCq = "";
                if (!objA.equals(obj2)) {
                    Log.w(e, String.format("Disc account not the same as selected account.%s", obj2 == null ? " Disc account null" : ""));
                }
                qth qthVar = qwnVar.c;
                Object obj3 = accountParticleDisc.j;
                if (obj3 != null) {
                    String strM = rdd.m(obj3, qthVar);
                    unx unxVar = accountParticleDisc.n;
                    String strConcat = null;
                    qtz qtzVar = (unxVar == null || (obj = unxVar.a) == null) ? null : (qtz) ((qua) obj).a.f();
                    String str = qtzVar == null ? null : qtzVar.b;
                    if (str != null) {
                        String strTrim = str.trim();
                        if (!strTrim.isEmpty()) {
                            strConcat = !strTrim.endsWith(".") ? String.valueOf(strTrim).concat(".") : strTrim;
                        }
                    }
                    String strB = accountParticleDisc.b();
                    if (strConcat != null && strB != null) {
                        strCq = a.cq(strConcat, strB, " ");
                    } else if (strConcat != null) {
                        strCq = strConcat;
                    } else if (strB != null) {
                        strCq = strB;
                    }
                    strCq = !strCq.isEmpty() ? a.cq(strCq, strM, "\n") : strM;
                }
                string = context.getString(R.string.og_account_and_settings);
                if (!strCq.isEmpty()) {
                    string = context.getString(R.string.og_signed_in_as_account, strCq) + "\n" + string;
                }
            }
        }
        rrx.ac(new qto(this, string, 8));
    }

    public final void c(boolean z) {
        rrx.ac(new hum(this, false, 3));
    }

    public final void d() {
        qwo qwoVar = this.a.b;
        if (qwoVar.b()) {
            rrx.ac(new qto(this, qwoVar, 9));
        }
    }
}
