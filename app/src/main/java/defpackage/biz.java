package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class biz extends pq implements bih {
    private final PreferenceGroup d;
    private List e;
    private List f;
    private final List g;
    private final Runnable i = new biw(this);
    private final Handler h = new Handler(Looper.getMainLooper());

    public biz(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.B = this;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            k(((PreferenceScreen) preferenceGroup).d);
        } else {
            k(true);
        }
        n();
    }

    private final List o(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceN = preferenceGroup.n(i2);
            if (preferenceN.x) {
                if (!q(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceN);
                } else {
                    arrayList2.add(preferenceN);
                }
                if (preferenceN instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceN;
                    if (!preferenceGroup2.V()) {
                        continue;
                    } else {
                        if (q(preferenceGroup) && q(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : o(preferenceGroup2)) {
                            if (!q(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (q(preferenceGroup) && i > preferenceGroup.c) {
            bhx bhxVar = new bhx(preferenceGroup.j, arrayList2, preferenceGroup.cw());
            bhxVar.o = new bix(this, preferenceGroup);
            arrayList.add(bhxVar);
        }
        return arrayList;
    }

    private final void p(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceN = preferenceGroup.n(i);
            list.add(preferenceN);
            biy biyVar = new biy(preferenceN);
            List list2 = this.g;
            if (!list2.contains(biyVar)) {
                list2.add(biyVar);
            }
            if (preferenceN instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceN;
                if (preferenceGroup2.V()) {
                    p(list, preferenceGroup2);
                }
            }
            preferenceN.B = this;
        }
    }

    private final boolean q(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    @Override // defpackage.pq
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.pq
    public final int b(int i) {
        biy biyVar = new biy(m(i));
        List list = this.g;
        int iIndexOf = list.indexOf(biyVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(biyVar);
        return size;
    }

    @Override // defpackage.pq
    public final long c(int i) {
        if (this.b) {
            return m(i).cw();
        }
        return -1L;
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ qv d(ViewGroup viewGroup, int i) {
        biy biyVar = (biy) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, bji.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ra.e().c(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(biyVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = biyVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new bjh(viewInflate);
    }

    @Override // defpackage.bih
    public final void e(Preference preference) {
        int iIndexOf = this.f.indexOf(preference);
        if (iIndexOf != -1) {
            this.a.c(iIndexOf, 1, preference);
        }
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ void f(qv qvVar, int i) {
        bjh bjhVar = (bjh) qvVar;
        View view = bjhVar.a;
        Preference preferenceM = m(i);
        Drawable background = view.getBackground();
        Drawable drawable = bjhVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) bjhVar.z(R.id.title);
        if (textView != null && bjhVar.t != null && !textView.getTextColors().equals(bjhVar.t)) {
            textView.setTextColor(bjhVar.t);
        }
        preferenceM.a(bjhVar);
    }

    @Override // defpackage.bih
    public final void g() {
        Handler handler = this.h;
        Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // defpackage.bih
    public final void h() {
        g();
    }

    public final Preference m(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.f.get(i);
    }

    final void n() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).B = null;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        PreferenceGroup preferenceGroup = this.d;
        p(arrayList, preferenceGroup);
        this.f = o(preferenceGroup);
        bje bjeVar = preferenceGroup.k;
        this.a.a();
        for (Preference preference : this.e) {
        }
    }
}
