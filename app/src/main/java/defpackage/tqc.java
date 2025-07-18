package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.katniss.R;
import com.google.android.libraries.social.licenses.License;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqc extends bq implements bfb {
    public ArrayAdapter a;
    public tqb b;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.bq
    public final void X() {
        this.P = true;
        bfc bfcVarA = bfc.a(ee());
        bfg bfgVar = ((bfh) bfcVarA).b;
        if (bfgVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (bfh.b(2)) {
            Log.v("LoaderManager", a.c(bfcVarA, "destroyLoader in ", " of 54321"));
        }
        bfd bfdVarB = bfgVar.b();
        if (bfdVarB != null) {
            bfdVarB.j();
            wz.b(bfgVar.b, 54321);
        }
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        bw bwVarEe = ee();
        this.a = new ArrayAdapter(bwVarEe, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        bfc bfcVarA = bfc.a(bwVarEe);
        bfh bfhVar = (bfh) bfcVarA;
        bfg bfgVar = bfhVar.b;
        if (bfgVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        bfd bfdVarB = bfgVar.b();
        if (bfh.b(2)) {
            Log.v("LoaderManager", a.d(null, bfcVarA, "initLoader in ", ": args="));
        }
        if (bfdVarB == null) {
            try {
                bfgVar.c = true;
                tpz tpzVar = new tpz(ee());
                if (tpzVar.getClass().isMemberClass() && !Modifier.isStatic(tpzVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + tpzVar);
                }
                bfd bfdVar = new bfd(tpzVar);
                if (bfh.b(3)) {
                    Log.d("LoaderManager", "  Created new loader " + bfdVar);
                }
                bfgVar.b.f(54321, bfdVar);
                bfgVar.c = false;
                bfdVar.k(bfhVar.a, this);
            } catch (Throwable th) {
                bfhVar.b.c = false;
                throw th;
            }
        } else {
            if (bfh.b(3)) {
                Objects.toString(bfdVarB);
                Log.d("LoaderManager", "  Re-using existing loader ".concat(bfdVarB.toString()));
            }
            bfdVarB.k(bfhVar.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: tqa
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                License license = (License) adapterView.getItemAtPosition(i);
                tqb tqbVar = this.a.b;
                if (tqbVar != null) {
                    tqbVar.C(license);
                }
            }
        });
    }

    @Override // defpackage.bq
    public final void er() {
        this.P = true;
        this.b = null;
    }

    @Override // defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        bqs bqsVar = this.F;
        if (bqsVar instanceof tqb) {
            this.b = (tqb) bqsVar;
            return;
        }
        bqs bqsVarEe = ee();
        if (bqsVarEe instanceof tqb) {
            this.b = (tqb) bqsVarEe;
        }
    }
}
