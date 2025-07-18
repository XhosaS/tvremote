package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.videos.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmq extends nnl {
    public final Set a;
    public final nmx b;
    public nkn c;
    public nqj d;
    public pku e;
    private final Context g;
    private final nmj h;
    private final noo i;
    private final nqv j;
    private CastDevice k;

    static {
        new nsf("CastSession");
    }

    public nmq(Context context, String str, String str2, nmj nmjVar, noo nooVar, nqv nqvVar) {
        super(context, str, str2);
        this.a = new HashSet();
        this.g = context.getApplicationContext();
        this.h = nmjVar;
        this.i = nooVar;
        this.j = nqvVar;
        odd oddVarQ = q();
        nnh nnhVar = new nnh(this, 1);
        int i = noe.a;
        nmx nmxVarD = null;
        if (oddVarQ != null) {
            try {
                nmxVarD = noe.a(context).d(nmjVar, oddVarQ, nnhVar);
            } catch (RemoteException | nni unused) {
                nsf.e();
            }
        }
        this.b = nmxVarD;
    }

    private final void t(Bundle bundle) {
        CastDevice castDeviceC = CastDevice.c(bundle);
        this.k = castDeviceC;
        if (castDeviceC == null) {
            ocv.aC();
            nnd nndVar = this.f;
            if (nndVar != null) {
                try {
                    if (nndVar.g()) {
                        nnd nndVar2 = this.f;
                        if (nndVar2 != null) {
                            try {
                                nndVar2.h();
                                return;
                            } catch (RemoteException unused) {
                                nsf.e();
                                return;
                            }
                        }
                        return;
                    }
                } catch (RemoteException unused2) {
                    nsf.e();
                }
            }
            nnd nndVar3 = this.f;
            if (nndVar3 == null) {
                return;
            }
            try {
                nndVar3.i();
                return;
            } catch (RemoteException unused3) {
                nsf.e();
                return;
            }
        }
        nkn nknVar = this.c;
        if (nknVar != null) {
            nknVar.b();
            this.c = null;
        }
        nsf.e();
        CastDevice castDevice = this.k;
        ocv.aF(castDevice);
        Bundle bundle2 = new Bundle();
        nmj nmjVar = this.h;
        now nowVar = nmjVar == null ? null : nmjVar.h;
        npk npkVar = nowVar != null ? nowVar.c : null;
        boolean z = nowVar != null && nowVar.d;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", npkVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", m());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", this.i.h);
        nkh nkhVar = new nkh(castDevice, new nmo(this));
        nkhVar.c = bundle2;
        nki nkiVar = new nki(nkhVar);
        Context context = this.g;
        jzs jzsVar = nkm.a;
        nla nlaVar = new nla(context, nkiVar);
        nlaVar.r.add(new nmp(this));
        this.c = nlaVar;
        nla nlaVar2 = nlaVar;
        nzt nztVarO = nlaVar2.o(nlaVar.b, "castDeviceControllerListenerKey");
        nzy nzyVar = new nzy();
        nig nigVar = new nig(nlaVar, 3);
        nku nkuVar = new nku(2);
        nlaVar.s = 2;
        nzyVar.c = nztVarO;
        nzyVar.a = nigVar;
        nzyVar.b = nkuVar;
        nzyVar.d = new nvg[]{nks.b};
        nzyVar.f = 8428;
        nlaVar2.y(nzyVar.a());
    }

    public final double a() {
        ocv.aC();
        nkn nknVar = this.c;
        if (nknVar == null || !nknVar.a()) {
            return 0.0d;
        }
        nla nlaVar = (nla) nknVar;
        nlaVar.e();
        return nlaVar.j;
    }

    @Override // defpackage.nnl
    public final long b() {
        ocv.aC();
        nqj nqjVar = this.d;
        if (nqjVar == null) {
            return 0L;
        }
        return nqjVar.d() - this.d.c();
    }

    public final CastDevice c() {
        ocv.aC();
        return this.k;
    }

    public final nqj d() {
        ocv.aC();
        return this.d;
    }

    public final void e(int i) {
        nqv nqvVar = this.j;
        if (nqvVar.n) {
            nqvVar.n = false;
            nqj nqjVar = nqvVar.j;
            if (nqjVar != null) {
                nqjVar.H(nqvVar.o);
            }
            noo nooVar = nqvVar.d;
            fuy.o(null);
            nql nqlVar = nqvVar.h;
            if (nqlVar != null) {
                nqlVar.a();
            }
            nql nqlVar2 = nqvVar.i;
            if (nqlVar2 != null) {
                nqlVar2.a();
            }
            eu euVar = nqvVar.l;
            if (euVar != null) {
                euVar.f(null);
                nqvVar.l.h(new nhl().e());
                nqvVar.e(0, null);
            }
            eu euVar2 = nqvVar.l;
            if (euVar2 != null) {
                euVar2.e(false);
                nqvVar.l.d();
                nqvVar.l = null;
            }
            nqvVar.j = null;
            nqvVar.k = null;
            nqvVar.m = null;
            nqvVar.c();
            if (i == 0) {
                nqvVar.d();
            }
        }
        nkn nknVar = this.c;
        if (nknVar != null) {
            nknVar.b();
            this.c = null;
        }
        this.k = null;
        nqj nqjVar2 = this.d;
        if (nqjVar2 != null) {
            nqjVar2.m(null);
            this.d = null;
        }
    }

    @Override // defpackage.nnl
    protected final void f(boolean z) {
        nmx nmxVar = this.b;
        if (nmxVar != null) {
            try {
                nmxVar.e(z);
            } catch (RemoteException unused) {
                nsf.e();
            }
            r(0);
        }
    }

    @Override // defpackage.nnl
    protected final void g(Bundle bundle) {
        this.k = CastDevice.c(bundle);
    }

    @Override // defpackage.nnl
    protected final void h(Bundle bundle) {
        this.k = CastDevice.c(bundle);
    }

    @Override // defpackage.nnl
    protected final void i(Bundle bundle) {
        t(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(final double d) {
        ocv.aC();
        nkn nknVar = this.c;
        if (nknVar == 0 || !nknVar.a()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        oaf oafVar = new oaf();
        final nla nlaVar = (nla) nknVar;
        oafVar.a = new nzz() { // from class: nkt
            @Override // defpackage.nzz
            public final void a(Object obj, Object obj2) {
                nrt nrtVar = (nrt) obj;
                nsa nsaVar = (nsa) nrtVar.L();
                Context context = nrtVar.u;
                nla nlaVar2 = nlaVar;
                double d2 = nlaVar2.j;
                boolean z = nlaVar2.k;
                nwl nwlVarQ = ocv.q();
                Parcel parcelK = nsaVar.k();
                parcelK.writeDouble(d);
                parcelK.writeDouble(d2);
                int i = ifl.a;
                parcelK.writeInt(z ? 1 : 0);
                ifl.c(parcelK, nwlVarQ);
                nsaVar.n(7, parcelK);
                ((kwy) obj2).u(null);
            }
        };
        oafVar.c = 8411;
        ((nwq) nknVar).t(oafVar.a());
    }

    @Override // defpackage.nnl
    protected final void k(Bundle bundle) {
        t(bundle);
    }

    @Override // defpackage.nnl
    protected final void l(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice castDeviceC = CastDevice.c(bundle);
        if (castDeviceC == null || castDeviceC.equals(this.k)) {
            return;
        }
        String str = castDeviceC.d;
        boolean z = !TextUtils.isEmpty(str) && ((castDevice2 = this.k) == null || !TextUtils.equals(castDevice2.d, str));
        this.k = castDeviceC;
        nsf.e();
        if (!z || (castDevice = this.k) == null) {
            return;
        }
        nqv nqvVar = this.j;
        if (nqvVar != null) {
            nqv.a.a("update Cast device to %s", castDevice);
            nqvVar.k = castDevice;
            nqvVar.f();
        }
        for (jys jysVar : new HashSet(this.a)) {
        }
        pku pkuVar = this.e;
        if (pkuVar != null) {
            ((goe) pkuVar.a).c().w++;
        }
    }

    public final boolean m() {
        nmj nmjVar;
        noo nooVar = this.i;
        return nooVar.f && nooVar.g && (nmjVar = nooVar.c) != null && nmjVar.o;
    }

    public final boolean n() {
        ocv.aC();
        nkn nknVar = this.c;
        if (nknVar == null || !nknVar.a()) {
            return false;
        }
        nla nlaVar = (nla) nknVar;
        nlaVar.e();
        return nlaVar.k;
    }

    public final void o(onz onzVar) {
        ComponentName componentName;
        nmx nmxVar = this.b;
        if (nmxVar == null) {
            return;
        }
        try {
            if (onzVar.i()) {
                nkb nkbVar = (nkb) onzVar.e();
                if (nkbVar.e() != null && nkbVar.e().b()) {
                    nsf.e();
                    nqj nqjVar = new nqj(new nsk());
                    this.d = nqjVar;
                    nqjVar.m(this.c);
                    this.d.G(new nmm(this));
                    this.d.k();
                    nqv nqvVar = this.j;
                    nqj nqjVar2 = this.d;
                    CastDevice castDeviceC = c();
                    nmj nmjVar = nqvVar.c;
                    now nowVar = nmjVar == null ? null : nmjVar.h;
                    if (nqvVar.n || nmjVar == null || nowVar == null || nqvVar.f == null || nqjVar2 == null || castDeviceC == null || (componentName = nqvVar.g) == null) {
                        nsf.e();
                    } else {
                        nqvVar.j = nqjVar2;
                        nqvVar.j.G(nqvVar.o);
                        nqvVar.k = castDeviceC;
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent.setComponent(componentName);
                        Context context = nqvVar.b;
                        PendingIntent pendingIntentA = ogf.a(context, intent, 67108864);
                        if (nowVar.e) {
                            eu euVar = new eu(context, "CastMediaSession", componentName, pendingIntentA);
                            nqvVar.l = euVar;
                            nqvVar.e(0, null);
                            CastDevice castDevice = nqvVar.k;
                            if (castDevice != null && !TextUtils.isEmpty(castDevice.d)) {
                                nhl nhlVar = new nhl();
                                nhlVar.h("android.media.metadata.ALBUM_ARTIST", context.getResources().getString(R.string.cast_casting_to_device, nqvVar.k.d));
                                euVar.h(nhlVar.e());
                            }
                            nqvVar.m = new nqt(nqvVar);
                            euVar.f(nqvVar.m);
                            euVar.e(true);
                            noo nooVar = nqvVar.d;
                            fuy.o(euVar);
                        }
                        nqvVar.n = true;
                        nqvVar.f();
                    }
                    njz njzVarA = nkbVar.a();
                    ocv.aF(njzVarA);
                    String strB = nkbVar.b();
                    String strC = nkbVar.c();
                    ocv.aF(strC);
                    nmxVar.a(njzVarA, strB, strC, nkbVar.d());
                    return;
                }
                if (nkbVar.e() != null) {
                    nsf.e();
                    nmxVar.b(nkbVar.e().f);
                    return;
                }
            } else {
                Exception excD = onzVar.d();
                if (excD instanceof nwk) {
                    nmxVar.b(((nwk) excD).a());
                    return;
                }
            }
            nmxVar.b(2476);
        } catch (RemoteException unused) {
            nsf.e();
        }
    }
}
