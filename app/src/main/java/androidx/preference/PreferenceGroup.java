package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import defpackage.acp;
import defpackage.biu;
import defpackage.biv;
import defpackage.bji;
import defpackage.wx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final wx a;
    public final List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void A() {
        super.L();
        this.g = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).A();
        }
    }

    public final void U(int i) {
        if (i != Integer.MAX_VALUE && !O()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean V() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(androidx.preference.Preference r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.b
            boolean r1 = r0.contains(r6)
            if (r1 != 0) goto L9e
            java.lang.String r1 = r6.s
            if (r1 == 0) goto L28
            r1 = r5
        Ld:
            androidx.preference.PreferenceGroup r2 = r1.C
            if (r2 == 0) goto L13
            r1 = r2
            goto Ld
        L13:
            java.lang.String r2 = r6.s
            androidx.preference.Preference r1 = r1.l(r2)
            if (r1 == 0) goto L28
            java.lang.String r1 = "Found duplicated key: \""
            java.lang.String r3 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r1 = defpackage.a.e(r2, r1, r3)
            java.lang.String r2 = "PreferenceGroup"
            android.util.Log.e(r2, r1)
        L28:
            int r1 = r6.p
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L47
            boolean r1 = r5.e
            if (r1 == 0) goto L3c
            int r1 = r5.f
            int r2 = r1 + 1
            r5.f = r2
            r6.F(r1)
        L3c:
            boolean r1 = r6 instanceof androidx.preference.PreferenceGroup
            if (r1 == 0) goto L47
            r1 = r6
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r2 = r5.e
            r1.e = r2
        L47:
            int r0 = java.util.Collections.binarySearch(r0, r6)
            if (r0 >= 0) goto L50
            int r0 = -r0
            int r0 = r0 + (-1)
        L50:
            boolean r1 = r5.j()
            r6.S(r1)
            monitor-enter(r5)
            java.util.List r1 = r5.b     // Catch: java.lang.Throwable -> L9b
            r1.add(r0, r6)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            bje r0 = r5.k
            java.lang.String r1 = r6.s
            if (r1 == 0) goto L7a
            wx r2 = r5.a
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.remove(r1)
            goto L7e
        L7a:
            long r3 = r0.a()
        L7e:
            r6.l = r3
            r1 = 1
            r6.m = r1
            r1 = 0
            r6.z(r0)     // Catch: java.lang.Throwable -> L97
            r6.m = r1
            r6.t(r5)
            boolean r0 = r5.g
            if (r0 == 0) goto L93
            r6.y()
        L93:
            r5.x()
            return
        L97:
            r0 = move-exception
            r6.m = r1
            throw r0
        L9b:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r6
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.W(androidx.preference.Preference):void");
    }

    public final void X(Preference preference) {
        synchronized (this) {
            super.L();
            if (preference.C == this) {
                preference.t(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.cw()));
                    Handler handler = this.d;
                    Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.g) {
                    preference.A();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    protected final Parcelable cu() {
        return new SavedState(super.cu(), this.c);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.c = savedState.a;
        super.g(savedState.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference preferenceL;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceN = n(i);
            if (TextUtils.equals(preferenceN.s, charSequence)) {
                return preferenceN;
            }
            if ((preferenceN instanceof PreferenceGroup) && (preferenceL = ((PreferenceGroup) preferenceN).l(charSequence)) != null) {
                return preferenceL;
            }
        }
        return null;
    }

    public final Preference n(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void u(Bundle bundle) {
        super.u(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).u(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void v(Bundle bundle) {
        super.v(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).v(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void w(boolean z) {
        super.w(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).S(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void y() {
        super.C();
        this.g = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).y();
        }
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new biv();
        final int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new wx(0);
        this.d = new Handler(Looper.getMainLooper());
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Integer.MAX_VALUE;
        this.h = new biu(this);
        this.b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.i, i, 0);
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            U(acp.i(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
