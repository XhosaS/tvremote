package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bif;
import defpackage.big;
import defpackage.bih;
import defpackage.bii;
import defpackage.bij;
import defpackage.bik;
import defpackage.bil;
import defpackage.bjd;
import defpackage.bje;
import defpackage.bji;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable {
    public int A;
    public bih B;
    public PreferenceGroup C;
    public bil D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private bik M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private String f;
    private Object g;
    private boolean h;
    private boolean i;
    public final Context j;
    public bje k;
    public long l;
    public boolean m;
    public bii n;
    public bij o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* compiled from: PG */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new big();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, acp.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
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

    public void A() {
        L();
    }

    public final void B() {
        Intent intent;
        bjd bjdVar;
        if (P() && this.e) {
            c();
            bij bijVar = this.o;
            if (bijVar != null) {
                bijVar.a();
                return;
            }
            bje bjeVar = this.k;
            if ((bjeVar == null || (bjdVar = bjeVar.d) == null || !bjdVar.aF(this)) && (intent = this.t) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void C() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        Preference preferenceQ = q(this.f);
        if (preferenceQ != null) {
            if (preferenceQ.K == null) {
                preferenceQ.K = new ArrayList();
            }
            preferenceQ.K.add(this);
            R(preferenceQ.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void D(boolean z) {
        if (this.d != z) {
            this.d = z;
            w(j());
            d();
        }
    }

    public final void E(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            d();
        }
    }

    public final void F(int i) {
        if (i != this.p) {
            this.p = i;
            x();
        }
    }

    public final void G(CharSequence charSequence) {
        if (this.D != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    public final void H(int i) {
        I(this.j.getString(i));
    }

    public final void I(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void J(boolean z) {
        if (this.x != z) {
            this.x = z;
            bih bihVar = this.B;
            if (bihVar != null) {
                bihVar.h();
            }
        }
    }

    public final void K(SharedPreferences.Editor editor) {
        if (this.k.b) {
            return;
        }
        editor.apply();
    }

    public final void L() {
        Preference preferenceQ;
        List list;
        String str = this.f;
        if (str == null || (preferenceQ = q(str)) == null || (list = preferenceQ.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean M(Object obj) {
        bii biiVar = this.n;
        return biiVar == null || biiVar.a(this, obj);
    }

    protected final boolean N(boolean z) {
        return !Q() ? z : this.k.d().getBoolean(this.s, z);
    }

    public final boolean O() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean P() {
        return this.d && this.h && this.i;
    }

    protected final boolean Q() {
        return this.k != null && this.w && O();
    }

    public final void R(boolean z) {
        if (this.h == z) {
            this.h = !z;
            w(j());
            d();
        }
    }

    public final void S(boolean z) {
        if (this.i == z) {
            this.i = !z;
            w(j());
            d();
        }
    }

    protected final void T(String str) {
        if (Q() && !TextUtils.equals(str, r(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.s, str);
            K(editorB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.bjh r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(bjh):void");
    }

    public void b(View view) {
        B();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.q.toString());
    }

    protected Parcelable cu() {
        this.L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    protected Object cv(TypedArray typedArray, int i) {
        return null;
    }

    public long cw() {
        return this.l;
    }

    protected void d() {
        bih bihVar = this.B;
        if (bihVar != null) {
            bihVar.e(this);
        }
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !P();
    }

    public CharSequence m() {
        bil bilVar = this.D;
        return bilVar != null ? bilVar.a(this) : this.a;
    }

    protected final int o(int i) {
        return !Q() ? i : this.k.d().getInt(this.s, i);
    }

    public final Bundle p() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    protected final Preference q(String str) {
        bje bjeVar = this.k;
        if (bjeVar == null) {
            return null;
        }
        return bjeVar.e(str);
    }

    protected final String r(String str) {
        return !Q() ? str : this.k.d().getString(this.s, str);
    }

    public final Set s(Set set) {
        return !Q() ? set : this.k.d().getStringSet(this.s, set);
    }

    final void t(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.C != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.C = preferenceGroup;
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

    public void u(Bundle bundle) {
        Parcelable parcelable;
        if (!O() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void v(Bundle bundle) {
        if (O()) {
            this.L = false;
            Parcelable parcelableCu = cu();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableCu != null) {
                bundle.putParcelable(this.s, parcelableCu);
            }
        }
    }

    public void w(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).R(z);
        }
    }

    public final void x() {
        bih bihVar = this.B;
        if (bihVar != null) {
            bihVar.g();
        }
    }

    public void y() {
        C();
    }

    public final void z(bje bjeVar) {
        this.k = bjeVar;
        if (!this.m) {
            this.l = bjeVar.a();
        }
        if (Q()) {
            bje bjeVar2 = this.k;
            if ((bjeVar2 != null ? bjeVar2.d() : null).contains(this.s)) {
                h(null);
                return;
            }
        }
        Object obj = this.g;
        if (obj != null) {
            h(obj);
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.p = Integer.MAX_VALUE;
        this.d = true;
        this.e = true;
        this.w = true;
        this.h = true;
        this.i = true;
        this.x = true;
        this.E = true;
        this.F = true;
        this.H = true;
        this.J = true;
        this.z = R.layout.preference;
        this.N = new bif(this);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.g, i, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.s = acp.f(typedArrayObtainStyledAttributes, 26, 6);
        this.q = acp.e(typedArrayObtainStyledAttributes, 34, 4);
        this.a = acp.e(typedArrayObtainStyledAttributes, 33, 7);
        this.p = acp.i(typedArrayObtainStyledAttributes, 28, 8);
        this.u = acp.f(typedArrayObtainStyledAttributes, 22, 13);
        this.z = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.A = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.d = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.e = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.w = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        this.f = acp.f(typedArrayObtainStyledAttributes, 19, 10);
        this.E = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.e));
        this.F = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.e));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.g = cv(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.g = cv(typedArrayObtainStyledAttributes, 11);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.G = zHasValue;
        if (zHasValue) {
            this.H = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.x = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.y = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}
