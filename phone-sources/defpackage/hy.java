package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.videos.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hy extends bv {
    public ic a;
    public final Handler b = new Handler(Looper.getMainLooper());

    private final void l() {
        this.a.g = false;
        if (isAdded()) {
            cr parentFragmentManager = getParentFragmentManager();
            ie ieVar = (ie) parentFragmentManager.f("androidx.biometric.internal.FingerprintDialogFragment");
            if (ieVar != null) {
                if (ieVar.isAdded()) {
                    ieVar.dismissAllowingStateLoss();
                    return;
                }
                at atVar = new at(parentFragmentManager);
                atVar.m(ieVar);
                atVar.l();
            }
        }
    }

    private final boolean m() {
        return getArguments().getBoolean("host_activity", true);
    }

    public final void a(int i) {
        if (i == 3 || !this.a.k) {
            if (i()) {
                this.a.f = i;
                if (i == 1) {
                    j(ht.d(getContext(), 10));
                }
            }
            eux euxVarP = this.a.p();
            Object obj = euxVarP.b;
            if (obj != null) {
                try {
                    ((CancellationSignal) obj).cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                euxVarP.b = null;
            }
            Object obj2 = euxVarP.c;
            if (obj2 != null) {
                try {
                    ((ctl) obj2).a();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                euxVarP.c = null;
            }
        }
    }

    final void b() {
        l();
        ic icVar = this.a;
        icVar.g = false;
        if (!icVar.i && isAdded()) {
            at atVar = new at(getParentFragmentManager());
            atVar.m(this);
            atVar.l();
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && ht.e(context, str, R.array.delay_showing_prompt_models)) {
                ic icVar2 = this.a;
                icVar2.j = true;
                this.b.postDelayed(new hx(icVar2, 0), 600L);
            }
        }
    }

    public final void c() {
        Context context = getContext();
        KeyguardManager keyguardManagerM = context != null ? hu.m(context) : null;
        if (keyguardManagerM == null) {
            d(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence charSequenceC = this.a.c();
        CharSequence charSequenceB = this.a.b();
        Intent intentA = ht.a(keyguardManagerM, charSequenceC, charSequenceB != null ? charSequenceB : null);
        if (intentA == null) {
            d(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.a.i = true;
        if (i()) {
            l();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void d(int i, CharSequence charSequence) {
        j(charSequence);
        b();
    }

    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.a.j(2);
        this.a.i(charSequence);
    }

    public final void f() {
        cvi cviVar;
        Object obj;
        ic icVar = this.a;
        if (icVar.g) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        icVar.g = true;
        icVar.h = true;
        Context context = getContext();
        if (context != null) {
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                if (Build.VERSION.SDK_INT == 29) {
                    ic icVar2 = this.a;
                    int i = icVar2.n;
                    if (hu.k(i) && hu.i(i)) {
                        icVar2.l = true;
                    }
                }
            }
            c();
            return;
        }
        FingerprintManager.CryptoObject cryptoObject = null;
        if (!i()) {
            BiometricPrompt.Builder builderA = hu.a(requireContext().getApplicationContext());
            CharSequence charSequenceC = this.a.c();
            CharSequence charSequenceB = this.a.b();
            if (charSequenceC != null) {
                hu.h(builderA, charSequenceC);
            }
            if (charSequenceB != null) {
                hu.g(builderA, charSequenceB);
            }
            CharSequence charSequenceA = this.a.a();
            if (!TextUtils.isEmpty(charSequenceA)) {
                Executor executorE = this.a.e();
                ic icVar3 = this.a;
                if (icVar3.c == null) {
                    icVar3.c = new ib(icVar3, 0);
                }
                hu.f(builderA, charSequenceA, executorE, icVar3.c);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                rld rldVar = this.a.A;
                hv.a(builderA, true);
            }
            int i2 = this.a.n;
            if (Build.VERSION.SDK_INT >= 30) {
                hw.a(builderA, i2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                hv.b(builderA, hu.i(i2));
            }
            if (Build.VERSION.SDK_INT >= 35) {
                ic icVar4 = this.a;
                rld rldVar2 = icVar4.A;
                icVar4.e();
                ic icVar5 = this.a;
                if (icVar5.d == null) {
                    icVar5.d = new ib(icVar5, 1, null);
                }
                DialogInterface.OnClickListener onClickListener = icVar5.d;
            }
            BiometricPrompt biometricPromptB = hu.b(builderA);
            Context context2 = getContext();
            BiometricPrompt.CryptoObject cryptoObjectB = hw.b(this.a.b);
            eux euxVarP = this.a.p();
            if (euxVarP.b == null) {
                Object obj2 = euxVarP.a;
                euxVarP.b = new CancellationSignal();
            }
            Object obj3 = euxVarP.b;
            ia iaVar = new ia(1, (byte[]) null);
            eux euxVarQ = this.a.q();
            if (euxVarQ.b == null) {
                euxVarQ.b = new C0039if((ht) euxVarQ.a);
            }
            Object obj4 = euxVarQ.b;
            try {
                if (cryptoObjectB == null) {
                    hu.c(biometricPromptB, (CancellationSignal) obj3, iaVar, hu$$ExternalSyntheticApiModelOutline1.m427m(obj4));
                    return;
                } else {
                    hu.d(biometricPromptB, cryptoObjectB, (CancellationSignal) obj3, iaVar, hu$$ExternalSyntheticApiModelOutline1.m427m(obj4));
                    return;
                }
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                d(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        nhl nhlVar = new nhl((Object) applicationContext);
        int i3 = !nhlVar.d() ? 12 : !nhlVar.c() ? 11 : 0;
        if (i3 != 0) {
            d(i3, ht.d(applicationContext, i3));
            return;
        }
        if (isAdded()) {
            this.a.u = true;
            if (!ht.g(applicationContext, Build.MODEL)) {
                this.b.postDelayed(new bf(this, 16), 500L);
                boolean zM = m();
                ie ieVar = new ie();
                Bundle bundle = new Bundle();
                bundle.putBoolean("host_activity", zM);
                ieVar.setArguments(bundle);
                ieVar.show(getParentFragmentManager(), "androidx.biometric.internal.FingerprintDialogFragment");
            }
            ic icVar6 = this.a;
            icVar6.f = 0;
            hr hrVar = icVar6.b;
            if (hrVar != null) {
                Cipher cipher = hrVar.b;
                if (cipher != null) {
                    cviVar = new cvi(cipher);
                } else {
                    Signature signature = hrVar.a;
                    if (signature != null) {
                        cviVar = new cvi(signature);
                    } else {
                        Mac mac = hrVar.c;
                        if (mac != null) {
                            cviVar = new cvi(mac);
                        } else {
                            if (Build.VERSION.SDK_INT >= 30 && hrVar.d != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (Build.VERSION.SDK_INT >= 33 && hrVar.e != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            } else if (Build.VERSION.SDK_INT >= 35) {
                                Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
                            }
                            cviVar = null;
                        }
                    }
                }
            } else {
                cviVar = null;
            }
            eux euxVarP2 = this.a.p();
            if (euxVarP2.c == null) {
                Object obj5 = euxVarP2.a;
                euxVarP2.c = new ctl();
            }
            Object obj6 = euxVarP2.c;
            eux euxVarQ2 = this.a.q();
            if (euxVarQ2.c == null) {
                euxVarQ2.c = new pku(euxVarQ2);
            }
            Object obj7 = euxVarQ2.c;
            if (obj6 != null) {
                try {
                    synchronized (obj6) {
                        if (((ctl) obj6).b == null) {
                            ((ctl) obj6).b = new CancellationSignal();
                            if (((ctl) obj6).a) {
                                ((CancellationSignal) ((ctl) obj6).b).cancel();
                            }
                        }
                        obj = ((ctl) obj6).b;
                    }
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    d(1, ht.d(applicationContext, 1));
                    return;
                }
            } else {
                obj = null;
            }
            FingerprintManager fingerprintManagerM = cmq.m((Context) nhlVar.a);
            if (fingerprintManagerM != null) {
                if (cviVar != null) {
                    Object obj8 = cviVar.c;
                    if (obj8 != null) {
                        cryptoObject = new FingerprintManager.CryptoObject((Cipher) obj8);
                    } else {
                        Object obj9 = cviVar.a;
                        if (obj9 != null) {
                            cryptoObject = new FingerprintManager.CryptoObject((Signature) obj9);
                        } else {
                            Object obj10 = cviVar.b;
                            if (obj10 != null) {
                                cryptoObject = new FingerprintManager.CryptoObject((Mac) obj10);
                            }
                        }
                    }
                }
                fingerprintManagerM.authenticate(cryptoObject, (CancellationSignal) obj, 0, new ctg((pku) obj7), null);
            }
        }
    }

    public final boolean g() {
        return getArguments().getBoolean("has_fingerprint", hv.f(getContext()));
    }

    public final boolean h() {
        return Build.VERSION.SDK_INT <= 28 && hu.i(this.a.n);
    }

    public final boolean i() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = getContext();
        if (context != null && this.a.b != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                if (str != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                if (ht.f(context, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                    return true;
                }
            }
        }
        return Build.VERSION.SDK_INT == 28 && !g();
    }

    public final void j(CharSequence charSequence) {
        ic icVar = this.a;
        if (icVar.i) {
            return;
        }
        if (!icVar.h) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            icVar.h = false;
            icVar.e().execute(new be(this, charSequence, 8, (byte[]) null));
        }
    }

    public final void k(zuw zuwVar) {
        ic icVar = this.a;
        if (icVar.h) {
            icVar.h = false;
            icVar.e().execute(new bf(this, 15));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        b();
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            ic icVar = this.a;
            icVar.i = false;
            if (i2 != -1) {
                d(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (icVar.l) {
                icVar.l = false;
                i3 = -1;
            }
            k(new zuw((Object) null, i3));
        }
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            this.a = hq.e(this, m());
        }
        ic icVar = this.a;
        if (icVar.o == null) {
            icVar.o = new dvv();
        }
        icVar.o.d(this, new hs(this, 1));
        ic icVar2 = this.a;
        if (icVar2.p == null) {
            icVar2.p = new dvv();
        }
        icVar2.p.d(this, new hs(this, 0));
        ic icVar3 = this.a;
        if (icVar3.q == null) {
            icVar3.q = new dvv();
        }
        icVar3.q.d(this, new hs(this, 2));
        ic icVar4 = this.a;
        if (icVar4.r == null) {
            icVar4.r = new dvv();
        }
        icVar4.r.d(this, new hs(this, 3));
        ic icVar5 = this.a;
        if (icVar5.s == null) {
            icVar5.s = new dvv();
        }
        icVar5.s.d(this, new hs(this, 4));
        ic icVar6 = this.a;
        if (icVar6.t == null) {
            icVar6.t = new dvv();
        }
        icVar6.t.d(this, new hs(this, 5));
        ic icVar7 = this.a;
        if (icVar7.v == null) {
            icVar7.v = new dvv();
        }
        icVar7.v.d(this, new hs(this, 6));
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            ic icVar = this.a;
            if (hu.i(icVar.n)) {
                icVar.k = true;
                this.b.postDelayed(new hx(icVar, 2, null), 250L);
            }
        }
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        ic icVar = this.a;
        if (!icVar.g || icVar.i) {
            return;
        }
        by activity = getActivity();
        if (isRemoving()) {
            if (activity == null || !activity.isChangingConfigurations()) {
                a(0);
            }
        }
    }
}
