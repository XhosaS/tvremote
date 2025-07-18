package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sbf implements Parcelable {
    private final vtw b;
    public final ImmutableSet d;
    public final Set e;
    public long f;
    private static final tui a = tui.l("com/google/android/libraries/play/logging/ulex/common/play/logsystem/UlexNodeWrapper");
    public static final Parcelable.Creator<sbf> CREATOR = new ous(13);

    public sbf(vtw vtwVar, Set set, ImmutableSet immutableSet, long j) {
        this.b = vtwVar;
        this.e = set;
        this.d = immutableSet;
        this.f = j;
    }

    public static int b(Parcel parcel) {
        return -parcel.readInt();
    }

    public static ImmutableSet c(int i, Parcel parcel) {
        if (i <= 0) {
            return ImmutableSet.of();
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (int i2 = parcel.readInt(); i2 != 0; i2--) {
            builder.add((ImmutableSet.Builder) Integer.valueOf(parcel.readInt()));
        }
        return builder.build();
    }

    public static Set d(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((sbf) parcel.readParcelable(sbf.class.getClassLoader()));
        }
        return new HashSet(arrayList);
    }

    protected static void f(Parcel parcel) {
        parcel.writeInt(-1);
    }

    public static vtw j(int i, Parcel parcel) {
        int i2 = i <= 0 ? -i : parcel.readInt();
        byte[] bArr = new byte[i2];
        parcel.readByteArray(bArr);
        try {
            vuc vucVarP = vuc.p(wgy.a, bArr, 0, i2, vtp.a());
            vuc.B(vucVarP);
            wgy wgyVar = (wgy) vucVarP;
            vtw vtwVar = (vtw) wgyVar.a(5, null);
            vtwVar.x(wgyVar);
            return vtwVar;
        } catch (vuq e) {
            ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/libraries/play/logging/ulex/common/play/logsystem/UlexNodeWrapper", "readUiNodeBuilderFromParcel", R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, "UlexNodeWrapper.java")).r();
            return wgy.a.m();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected final void e(Parcel parcel) {
        Set set = this.e;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((sbf) it.next(), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void g(Parcel parcel) {
        ImmutableSet immutableSet = this.d;
        parcel.writeInt(immutableSet.size());
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Integer) it.next()).intValue());
        }
    }

    protected final void h(Parcel parcel) {
        byte[] bArrH = ((wgy) this.b.r()).h();
        parcel.writeInt(bArrH.length);
        parcel.writeByteArray(bArrH);
    }

    public final vtw i() {
        return this.b.a();
    }

    final rzy k(long j) {
        if (rrx.B(this.f)) {
            this.f = j;
        }
        ImmutableSet immutableSet = this.d;
        ImmutableSet.Builder builder = ImmutableSet.builder();
        builder.addAll((Iterable) immutableSet);
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            rzy rzyVarK = ((sbf) it.next()).k(j);
            vtw vtwVar = this.b;
            Object obj = rzyVarK.b;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wgy wgyVar = (wgy) vtwVar.b;
            wgy wgyVar2 = wgy.a;
            obj.getClass();
            wgyVar.c();
            wgyVar.c.add(obj);
            builder.addAll((Iterable) rzyVarK.a);
        }
        vtw vtwVar2 = this.b;
        wgy wgyVar3 = (wgy) vtwVar2.r();
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        wgy wgyVar4 = (wgy) vtwVar2.b;
        wgy wgyVar5 = wgy.a;
        wgyVar4.c = vvt.a;
        set.clear();
        return new rzy(wgyVar3, builder.build(), (char[]) null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f);
        f(parcel);
        h(parcel);
        e(parcel);
        g(parcel);
    }

    public sbf(vtw vtwVar, ImmutableSet immutableSet) {
        this(vtwVar, new HashSet(), immutableSet, 0L);
    }
}
