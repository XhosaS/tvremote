package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgw extends bv implements dxq {
    public LicenseMenuActivity a;
    private ArrayAdapter b;

    @Override // defpackage.dxq
    public final dxy a() {
        return new sgv(getActivity());
    }

    @Override // defpackage.dxq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.dxq
    public final void c() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        by activity = getActivity();
        if (activity instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity) activity;
        }
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        super.onDestroy();
        dxr supportLoaderManager = getActivity().getSupportLoaderManager();
        dxv dxvVar = supportLoaderManager.a;
        if (dxvVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (dxr.b(2)) {
            Objects.toString(supportLoaderManager);
        }
        dxs dxsVarA = dxvVar.a(54321);
        if (dxsVarA != null) {
            dxsVarA.o();
            kp kpVar = dxvVar.b;
            int iA = ku.a(kpVar.b, kpVar.d, 54321);
            if (iA >= 0) {
                Object[] objArr = kpVar.c;
                Object obj = objArr[iA];
                Object obj2 = kq.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    kpVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.bv
    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        by activity = getActivity();
        this.b = new ArrayAdapter(activity, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        activity.getSupportLoaderManager().c(54321, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new iuj(this, 2));
    }
}
