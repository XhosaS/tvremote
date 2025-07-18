package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.fsq;
import defpackage.gcz;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gdc;
import defpackage.gdd;
import defpackage.gdo;
import defpackage.gds;
import defpackage.gdt;
import defpackage.gdx;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public int B;
    public int C;
    public PreferenceGroup D;
    public gdd E;
    public gdo F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private gdc M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Bundle b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public gdt k;
    public long l;
    public boolean m;
    public gda n;
    public gdb o;
    public int p;
    public CharSequence q;
    public int r;
    public Drawable s;
    public String t;
    public Intent u;
    public String v;
    public boolean w;
    public boolean x;
    public Object y;
    public boolean z;

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, crn.i(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A(gdt gdtVar) {
        this.k = gdtVar;
        if (!this.m) {
            this.l = gdtVar.a();
        }
        if (M()) {
            gdt gdtVar2 = this.k;
            if ((gdtVar2 != null ? gdtVar2.c() : null).contains(this.t)) {
                h(null);
                return;
            }
        }
        Object obj = this.y;
        if (obj != null) {
            h(obj);
        }
    }

    public void B() {
        I();
    }

    public final void C() {
        Intent intent;
        gds gdsVar;
        if (L() && this.d) {
            c();
            gdb gdbVar = this.o;
            if (gdbVar != null) {
                gdbVar.ej(this);
                return;
            }
            gdt gdtVar = this.k;
            if ((gdtVar == null || (gdsVar = gdtVar.c) == null || !gdsVar.f(this)) && (intent = this.u) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void D() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        Preference preferenceR = r(this.e);
        if (preferenceR != null) {
            if (preferenceR.K == null) {
                preferenceR.K = new ArrayList();
            }
            preferenceR.K.add(this);
            N(preferenceR.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.t + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void E(int i) {
        if (i != this.p) {
            this.p = i;
            y();
        }
    }

    public final void F(gdd gddVar) {
        this.E = gddVar;
        d();
    }

    public final void G(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void H(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void I() {
        Preference preferenceR;
        List list;
        String str = this.e;
        if (str == null || (preferenceR = r(str)) == null || (list = preferenceR.K) == null) {
            return;
        }
        list.remove(this);
    }

    protected final boolean J(boolean z) {
        return !M() ? z : this.k.c().getBoolean(this.t, z);
    }

    public final boolean K() {
        return !TextUtils.isEmpty(this.t);
    }

    public boolean L() {
        return this.c && this.f && this.g;
    }

    protected final boolean M() {
        return this.k != null && this.x && K();
    }

    public final void N(boolean z) {
        if (this.f == z) {
            this.f = !z;
            x(j());
            d();
        }
    }

    public final void O(boolean z) {
        if (this.g == z) {
            this.g = !z;
            x(j());
            d();
        }
    }

    protected final void P(String str) {
        if (M() && !TextUtils.equals(str, s(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.t, str);
            H(editorB);
        }
    }

    public final void Q(Object obj) {
        gda gdaVar = this.n;
        if (gdaVar != null) {
            gdaVar.a(this, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.gdw r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(gdw):void");
    }

    public void b(View view) {
        C();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference2.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.q.toString());
    }

    protected void d() {
        int iIndexOf;
        gdo gdoVar = this.F;
        if (gdoVar == null || (iIndexOf = gdoVar.a.indexOf(this)) == -1) {
            return;
        }
        gdoVar.notifyItemChanged(iIndexOf, this);
    }

    protected Parcelable dE() {
        this.L = true;
        return gcz.EMPTY_STATE;
    }

    protected Object dF(TypedArray typedArray, int i) {
        return null;
    }

    public long dG() {
        return this.l;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != gcz.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !L();
    }

    public CharSequence m() {
        gdd gddVar = this.E;
        return gddVar != null ? gddVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !M() ? i : this.k.c().getInt(this.t, i);
    }

    public final Bundle q() {
        if (this.b == null) {
            this.b = new Bundle();
        }
        return this.b;
    }

    protected final Preference r(String str) {
        gdt gdtVar = this.k;
        if (gdtVar == null) {
            return null;
        }
        return gdtVar.d(str);
    }

    protected final String s(String str) {
        return !M() ? str : this.k.c().getString(this.t, str);
    }

    public final Set t(Set set) {
        return !M() ? set : this.k.c().getStringSet(this.t, set);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    final void u(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.D != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.D = preferenceGroup;
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        if (!K() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void w(Bundle bundle) {
        if (K()) {
            this.L = false;
            Parcelable parcelableDE = dE();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableDE != null) {
                bundle.putParcelable(this.t, parcelableDE);
            }
        }
    }

    public void x(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).N(z);
        }
    }

    protected final void y() {
        gdo gdoVar = this.F;
        if (gdoVar != null) {
            gdoVar.c();
        }
    }

    public void z() {
        D();
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.p = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.c = true;
        this.d = true;
        this.x = true;
        this.f = true;
        this.g = true;
        this.z = true;
        this.h = true;
        this.i = true;
        this.H = true;
        this.J = true;
        this.B = R.layout.preference;
        this.N = new fsq(this, 5, null);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.g, i, 0);
        this.r = crn.k(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.t = crn.n(typedArrayObtainStyledAttributes, 26, 6);
        this.q = crn.m(typedArrayObtainStyledAttributes, 34, 4);
        this.a = crn.m(typedArrayObtainStyledAttributes, 33, 7);
        this.p = crn.r(typedArrayObtainStyledAttributes, 28, 8);
        this.v = crn.n(typedArrayObtainStyledAttributes, 22, 13);
        this.B = crn.k(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.C = crn.k(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.c = crn.o(typedArrayObtainStyledAttributes, 21, 2, true);
        this.d = crn.o(typedArrayObtainStyledAttributes, 30, 5, true);
        this.x = crn.o(typedArrayObtainStyledAttributes, 29, 1, true);
        this.e = crn.n(typedArrayObtainStyledAttributes, 19, 10);
        this.h = crn.o(typedArrayObtainStyledAttributes, 16, 16, this.d);
        this.i = crn.o(typedArrayObtainStyledAttributes, 17, 17, this.d);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.y = dF(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y = dF(typedArrayObtainStyledAttributes, 11);
        }
        this.J = crn.o(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.G = zHasValue;
        if (zHasValue) {
            this.H = crn.o(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.I = crn.o(typedArrayObtainStyledAttributes, 24, 15, false);
        this.z = crn.o(typedArrayObtainStyledAttributes, 25, 25, true);
        this.A = crn.o(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}
