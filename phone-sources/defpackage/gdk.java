package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
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
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gdk extends bv implements gds, gdq, gdr, gcn {
    public gdt a;
    public RecyclerView b;
    public boolean c;
    public boolean d;
    private final gdg e = new gdg(this);
    private int f = R.layout.preference_list_fragment;
    private final Handler g = new gdf(this, Looper.getMainLooper());
    private final Runnable h = new foe(this, 19, null);

    @Override // defpackage.gcn
    public final Preference a(CharSequence charSequence) {
        gdt gdtVar = this.a;
        if (gdtVar == null) {
            return null;
        }
        return gdtVar.d(charSequence);
    }

    public final PreferenceScreen b() {
        gdt gdtVar = this.a;
        if (gdtVar == null) {
            return null;
        }
        return gdtVar.b;
    }

    public final void c(int i) {
        gdt gdtVar;
        PreferenceScreen preferenceScreen;
        gdt gdtVar2 = this.a;
        if (gdtVar2 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        PreferenceScreen preferenceScreenB = b();
        gdtVar2.e(true);
        int i2 = gdp.a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = contextRequireContext.getResources().getXml(i);
        try {
            Preference preferenceA = gdp.a(xml, preferenceScreenB, contextRequireContext, objArr, gdtVar2, strArr);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceA;
            preferenceScreen2.A(gdtVar2);
            gdtVar2.e(false);
            if (preferenceScreen2 == null || preferenceScreen2 == (preferenceScreen = (gdtVar = this.a).b)) {
                return;
            }
            if (preferenceScreen != null) {
                preferenceScreen.B();
            }
            gdtVar.b = preferenceScreen2;
            this.c = true;
            if (this.d) {
                Handler handler = this.g;
                if (handler.hasMessages(1)) {
                    return;
                }
                handler.obtainMessage(1).sendToTarget();
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void d() {
        PreferenceScreen preferenceScreenB = b();
        if (preferenceScreenB != null) {
            this.b.setAdapter(new gdo(preferenceScreenB));
            preferenceScreenB.z();
        }
    }

    @Override // defpackage.gdq
    public final void e(Preference preference) {
        bl gcyVar;
        boolean zA = false;
        for (bv parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof gdh) {
                zA = ((gdh) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof gdh)) {
            zA = ((gdh) getContext()).a();
        }
        if (zA) {
            return;
        }
        if (!((getActivity() instanceof gdh) && ((gdh) getActivity()).a()) && getParentFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                gcyVar = new gcq();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                gcyVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                gcyVar = new gcv();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                gcyVar.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.t;
                gcyVar = new gcy();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                gcyVar.setArguments(bundle3);
            }
            gcyVar.setTargetFragment(this, 0);
            gcyVar.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // defpackage.gds
    public final boolean f(Preference preference) {
        if (preference.v == null) {
            return false;
        }
        boolean zA = false;
        for (bv parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof gdi) {
                zA = ((gdi) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof gdi)) {
            zA = ((gdi) getContext()).a();
        }
        if (zA) {
            return true;
        }
        if ((getActivity() instanceof gdi) && ((gdi) getActivity()).a()) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        cr parentFragmentManager = getParentFragmentManager();
        Bundle bundleQ = preference.q();
        cc ccVarI = parentFragmentManager.i();
        requireActivity().getClassLoader();
        bv bvVarB = ccVarI.b(preference.v);
        bvVarB.setArguments(bundleQ);
        bvVarB.setTargetFragment(this, 0);
        at atVar = new at(parentFragmentManager);
        atVar.w(((View) requireView().getParent()).getId(), bvVarB);
        atVar.s(null);
        atVar.a();
        return true;
    }

    public abstract void g();

    @Override // defpackage.gdr
    public final void h() {
        boolean zA = false;
        for (bv parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof gdj) {
                zA = ((gdj) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof gdj)) {
            zA = ((gdj) getContext()).a();
        }
        if (zA || !(getActivity() instanceof gdj)) {
            return;
        }
        ((gdj) getActivity()).a();
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        gdt gdtVar = new gdt(requireContext());
        this.a = gdtVar;
        gdtVar.e = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        g();
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, gdx.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAccessibilityDelegateCompat(new gdv(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerView;
        gdg gdgVar = this.e;
        recyclerView.addItemDecoration(gdgVar);
        if (drawable != null) {
            gdgVar.b = drawable.getIntrinsicHeight();
        } else {
            gdgVar.b = 0;
        }
        gdgVar.a = drawable;
        gdk gdkVar = gdgVar.d;
        gdkVar.b.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            gdgVar.b = dimensionPixelSize;
            gdkVar.b.invalidateItemDecorations();
        }
        gdgVar.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.g.post(this.h);
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        Handler handler = this.g;
        handler.removeCallbacks(this.h);
        handler.removeMessages(1);
        if (this.c) {
            this.b.setAdapter(null);
            PreferenceScreen preferenceScreenB = b();
            if (preferenceScreenB != null) {
                preferenceScreenB.B();
            }
        }
        this.b = null;
        super.onDestroyView();
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreenB = b();
        if (preferenceScreenB != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenB.w(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        gdt gdtVar = this.a;
        gdtVar.c = this;
        gdtVar.d = this;
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        gdt gdtVar = this.a;
        gdtVar.c = null;
        gdtVar.d = null;
    }

    @Override // defpackage.bv
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenB;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenB = b()) != null) {
            preferenceScreenB.v(bundle2);
        }
        if (this.c) {
            d();
        }
        this.d = true;
    }
}
