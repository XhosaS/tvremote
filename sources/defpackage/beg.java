package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.tv.remote.service.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beg extends q {
    public ArrayAdapter Z;
    public LicenseMenuActivity aa;

    @Override // defpackage.q
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.q
    public final void G(View view) {
        t tVarI = i();
        this.Z = new ArrayAdapter(tVarI, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        yh yhVarA = yh.a(tVarI);
        yl ylVar = yhVarA.b;
        if (ylVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        yi yiVarB = ylVar.b();
        if (yh.b(2)) {
            Log.v("LoaderManager", b.d(null, yhVarA, "initLoader in ", ": args="));
        }
        if (yiVarB == null) {
            try {
                ylVar.c = true;
                yn ynVar = new yn(i());
                if (ynVar.getClass().isMemberClass() && !Modifier.isStatic(ynVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + ynVar);
                }
                yi yiVar = new yi(ynVar);
                if (yh.b(3)) {
                    Log.d("LoaderManager", "  Created new loader " + yiVar);
                }
                ylVar.b.d(54321, yiVar);
                ylVar.a();
                yiVar.j(yhVarA.a, this);
            } catch (Throwable th) {
                yhVarA.b.a();
                throw th;
            }
        } else {
            if (yh.b(3)) {
                Objects.toString(yiVarB);
                Log.d("LoaderManager", "  Re-using existing loader ".concat(yiVarB.toString()));
            }
            yiVarB.j(yhVarA.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.Z);
        listView.setOnItemClickListener(new bef(this, 0));
    }

    @Override // defpackage.q
    public final void q(Context context) {
        super.q(context);
        t tVarI = i();
        if (tVarI instanceof LicenseMenuActivity) {
            this.aa = (LicenseMenuActivity) tVarI;
        }
    }

    @Override // defpackage.q
    public final void r() {
        super.r();
        yh yhVarA = yh.a(i());
        yl ylVar = yhVarA.b;
        if (ylVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (yh.b(2)) {
            Log.v("LoaderManager", b.b(yhVarA, "destroyLoader in ", " of 54321"));
        }
        yi yiVarB = ylVar.b();
        if (yiVarB != null) {
            yiVarB.i();
            mj mjVar = ylVar.b;
            int iA = ml.a(mjVar.b, mjVar.d, 54321);
            if (iA >= 0) {
                Object[] objArr = mjVar.c;
                Object obj = objArr[iA];
                Object obj2 = mk.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    mjVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.q
    public final void s() {
        super.s();
        this.aa = null;
    }
}
