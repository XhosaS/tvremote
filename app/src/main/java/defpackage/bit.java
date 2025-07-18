package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bit extends bq implements bjd, bjb, bjc, bhr {
    public bje b;
    public RecyclerView c;
    public boolean d;
    public boolean e;
    public final bip a = new bip(this);
    public int f = R.layout.preference_list_fragment;
    public final Handler ah = new bin(this, Looper.getMainLooper());
    public final Runnable ai = new bio(this);

    public final PreferenceScreen aB() {
        bje bjeVar = this.b;
        if (bjeVar == null) {
            return null;
        }
        return bjeVar.c;
    }

    public final void aC() {
        PreferenceScreen preferenceScreenAB = aB();
        if (preferenceScreenAB != null) {
            this.c.ag(new biz(preferenceScreenAB));
            preferenceScreenAB.y();
        }
    }

    @Override // defpackage.bjb
    public final void aD(Preference preference) {
        bf bieVar;
        boolean zM = l() instanceof biq ? ((biq) l()).m(this, preference) : false;
        for (bq bqVar = this; !zM && bqVar != null; bqVar = bqVar.F) {
            if (bqVar instanceof biq) {
                zM = ((biq) bqVar).m(this, preference);
            }
        }
        if (!zM && (s() instanceof biq)) {
            zM = ((biq) s()).m(this, preference);
        }
        if (zM) {
            return;
        }
        if (!((ee() instanceof biq) && ((biq) ee()).m(this, preference)) && eh().b.d("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                bieVar = new bhw();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                bieVar.ae(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                bieVar = new bib();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                bieVar.ae(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.s;
                bieVar = new bie();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                bieVar.ae(bundle3);
            }
            bieVar.au(this);
            bieVar.l(eh(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void aE(PreferenceScreen preferenceScreen) {
        bje bjeVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (bjeVar = this.b).c)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.A();
        }
        bjeVar.c = preferenceScreen;
        this.d = true;
        if (this.e) {
            Handler handler = this.ah;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }

    @Override // defpackage.bjd
    public final boolean aF(Preference preference) {
        boolean z = false;
        if (preference.u == null) {
            return false;
        }
        if (l() instanceof bir) {
            ((bir) l()).a(this, preference);
            z = true;
        }
        for (bq bqVar = this; !z && bqVar != null; bqVar = bqVar.F) {
            if (bqVar instanceof bir) {
                ((bir) bqVar).a(this, preference);
                z = true;
            }
        }
        if (!z && (s() instanceof bir)) {
            ((bir) s()).a(this, preference);
        } else if (!z) {
            if (ee() instanceof bir) {
                ((bir) ee()).a(this, preference);
            } else {
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                de deVarEh = eh();
                Bundle bundleP = preference.p();
                cd cdVarE = deVarEh.e();
                ef().getClassLoader();
                bq bqVarB = cdVarE.b(preference.u);
                bqVarB.ae(bundleP);
                bqVarB.au(this);
                ab abVar = new ab(deVarEh);
                abVar.q(((View) cP().getParent()).getId(), bqVarB, null);
                abVar.n(null);
                abVar.i();
            }
        }
        return true;
    }

    public final void aG() throws Resources.NotFoundException {
        bje bjeVar = this.b;
        if (bjeVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextDZ = dZ();
        PreferenceScreen preferenceScreenAB = aB();
        bjeVar.f(true);
        int i = bja.a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = contextDZ.getResources().getXml(R.xml.preference_google);
        try {
            Preference preferenceA = bja.a(xml, preferenceScreenAB, contextDZ, objArr, bjeVar, strArr);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceA;
            preferenceScreen.z(bjeVar);
            bjeVar.f(false);
            aE(preferenceScreen);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public abstract void aH();

    @Override // defpackage.bjc
    public final void aI() {
        if (l() instanceof bis) {
            ((bis) l()).cq();
        }
        for (bq bqVar = this; bqVar != null; bqVar = bqVar.F) {
            if (bqVar instanceof bis) {
            }
        }
        if (s() instanceof bis) {
            ((bis) s()).cq();
        }
        if (ee() instanceof bis) {
            ((bis) ee()).cq();
        }
    }

    @Override // defpackage.bhr
    public final Preference cR(CharSequence charSequence) {
        bje bjeVar = this.b;
        if (bjeVar == null) {
            return null;
        }
        return bjeVar.e(charSequence);
    }

    @Override // defpackage.bq
    public void e() {
        Handler handler = this.ah;
        handler.removeCallbacks(this.ai);
        handler.removeMessages(1);
        if (this.d) {
            this.c.ag(null);
            PreferenceScreen preferenceScreenAB = aB();
            if (preferenceScreenAB != null) {
                preferenceScreenAB.A();
            }
        }
        this.c = null;
        this.P = true;
    }

    @Override // defpackage.bq
    public void ey(Bundle bundle) {
        super.ey(bundle);
        TypedValue typedValue = new TypedValue();
        dZ().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        dZ().getTheme().applyStyle(i, false);
        bje bjeVar = new bje(dZ());
        this.b = bjeVar;
        bjeVar.f = this;
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        aH();
    }

    @Override // defpackage.bq
    public void g(Bundle bundle) {
        PreferenceScreen preferenceScreenAB = aB();
        if (preferenceScreenAB != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenAB.v(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.bq
    public void h() {
        this.P = true;
        bje bjeVar = this.b;
        bjeVar.d = this;
        bjeVar.e = this;
    }

    @Override // defpackage.bq
    public void i() {
        this.P = true;
        bje bjeVar = this.b;
        bjeVar.d = null;
        bjeVar.e = null;
    }

    public bq l() {
        throw null;
    }

    public RecyclerView m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw null;
    }
}
